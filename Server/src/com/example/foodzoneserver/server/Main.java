package com.example.foodzoneserver.server;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            //System.out.print("Input database connection: ");
            //String dbConnString = sc.nextLine();
            System.out.print("Input bind IP: ");
            String ip = sc.nextLine();
            String dbConnString = "jdbc:sqlserver://DESKTOP-18BTLCH\\SQLEXPRESS;databaseName=PrayForFood;integratedSecurity=true;";
            ServerFoodZone server = new ServerFoodZone(dbConnString, ip, 9999);
            //String dbConnString = "jdbc:sqlserver://localhost\\MSSQLSERVER;databaseName=PrayForFood;integratedSecurity=true;";
            //jdbc:sqlserver://DESKTOP-7I3LBF0\SQLEXPRESS;databaseName=PrayForFood;integratedSecurity=true;

            //ServerP4F server = new ServerP4F(dbConnString, "192.168.1.2", 9999);
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
