package com.fz.foodzoneserver.server;

import org.apache.logging.log4j.LogManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Input database connection: ");
            String dbConnString = sc.nextLine();
            System.out.print("Input bind IP: ");
            String ip = sc.nextLine();
            //String dbConnString = "jdbc:sqlserver://DESKTOP-18BTLCH\\SQLEXPRESS;databaseName=FoodZoneDB;integratedSecurity=true;";
            //String dbConnString = "jdbc:sqlserver://AHKI\\SQLSERVER:49801;databaseName=FoodZoneDB;integratedSecurity=true;encrypt=true;trustServerCertificate=true;";

            ServerFoodZone server = new ServerFoodZone(dbConnString, ip, 9999);
            server.start();
            int code = sc.nextInt();
            if (code == 0)
                server.closeServer();
        }
        catch (Exception e) {
            LogManager.getRootLogger().error(e);
        }
    }
}
