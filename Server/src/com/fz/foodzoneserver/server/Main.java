package com.fz.foodzoneserver.server;

import org.apache.logging.log4j.LogManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Input database connection: ");
            //String dbConnString = sc.nextLine();
            System.out.print("Input bind IP: ");
            //String ip = sc.nextLine();

            // TEST -----------------------------------------------------

            // KHUE
//            String dbConnString = "jdbc:sqlserver://DESKTOP-18BTLCH\\SQLEXPRESS;databaseName=FoodZone;integratedSecurity=true;encrypt=true;trustServerCertificate=true;";
//            String ip = "192.168.1.239";

            // KIET
            String dbConnString = "jdbc:sqlserver://localhost\\SQLSERVER:49801;databaseName=FoodZone;integratedSecurity=true;encrypt=true;trustServerCertificate=true;";
            String ip = "192.168.1.6";

            // PHAT
//            String dbConnString = "jdbc:sqlserver://localhost\\SQLSERVER:1433;databaseName=FoodZone;integratedSecurity=true;encrypt=true;trustServerCertificate=true;";
//            String ip = "192.168.1.5";

            // ----------------------------------------------------------

            ServerFoodZone server = new ServerFoodZone(dbConnString, ip, 9999);
            server.start();
            System.out.println("Enter 'exit' to stop the server");
            String cmd = sc.next();
            if (cmd.equals("exit"))
                server.closeServer();
        }
        catch (Exception e) {
            LogManager.getRootLogger().error(e);
        }
    }
}
