package com.fz.foodzoneserver.server;

import java.sql.Connection;
import java.sql.SQLException;
import org.apache.commons.dbcp2.*;
import org.apache.commons.pool2.impl.GenericObjectPool;
import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public enum ConnectionPool {
	// Singleton instance of this class
	INSTANCE;

	// Database connection pool configurations
	private static final Logger logger = LogManager.getLogger(ConnectionPool.class.getName());
	private String connectionString = "";
	private GenericObjectPool<PoolableConnection> connectionPool;
	private GenericObjectPoolConfig<PoolableConnection> poolConfig;
	private PoolingDataSource<PoolableConnection> dataSource = null;

    private ConnectionPool(){
	    poolConfig = new GenericObjectPoolConfig<>();
		poolConfig.setMinIdle(2);
		poolConfig.setMaxTotal(16);
    }

    public static ConnectionPool getInstance() {
        return INSTANCE;
    }

    public void setDatabaseUri(String uri) {
		connectionString = uri;
    }

	public void setPoolConfig(GenericObjectPoolConfig<PoolableConnection> newConfig) {
		if (connectionPool == null) {
			logger.info("Connect to the database first to change pool configurations.");
			return;
		}
		poolConfig = newConfig;
		connectionPool.setConfig(newConfig);
	}

	public void setupSource() throws SQLException {
		if (connectionString.isEmpty()) {
			throw new SQLException("Can't connect to database. Database URI isn't set yet.");
		}
		ConnectionFactory connectionFactory = new DriverManagerConnectionFactory(connectionString);
		PoolableConnectionFactory poolableConnectionFactory = new PoolableConnectionFactory(connectionFactory, null);
		connectionPool = new GenericObjectPool<>(poolableConnectionFactory, poolConfig);
		poolableConnectionFactory.setPool(connectionPool);
		dataSource = new PoolingDataSource<>(connectionPool);
	}

    public Connection getConnection() throws SQLException {
		if (dataSource == null) {
			setupSource();
		}
        return dataSource.getConnection();
    }
}



