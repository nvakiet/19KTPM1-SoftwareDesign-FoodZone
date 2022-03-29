package com.fz.foodzoneserver.server;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            //System.out.print("Input database connection: ");
            //String dbConnString = sc.nextLine();
            System.out.print("Input bind IP: ");
            String ip = sc.nextLine();
            //String dbConnString = "jdbc:sqlserver://DESKTOP-18BTLCH\\SQLEXPRESS;databaseName=PrayForFood;integratedSecurity=true;";
            String dbConnString = "jdbc:sqlserver://localhost\\SQLSERVER;databaseName=PrayForFood;integratedSecurity=true;";

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
