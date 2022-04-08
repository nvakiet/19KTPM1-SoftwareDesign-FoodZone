package com.fz.foodzoneserver.server;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Input database connection (MS SQL Server): ");
            String dbConnString = sc.nextLine();
            System.out.print("Input bind IP (Empty to bind on default interfaces): ");
            String ip = sc.nextLine();
            // Example connection strings
            //String dbConnString = "jdbc:sqlserver://DESKTOP-18BTLCH\\SQLEXPRESS;databaseName=Example;integratedSecurity=true;";
            //String dbConnString = "jdbc:sqlserver://localhost\\SQLSERVER;databaseName=Example;integratedSecurity=true;encrypt=true;trustServerCertificate=true;";

            ServerFoodZone server = new ServerFoodZone(dbConnString, ip, 9999);
            server.start();
            int code = sc.nextInt();
            if (code == 0)
                server.closeServer();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
