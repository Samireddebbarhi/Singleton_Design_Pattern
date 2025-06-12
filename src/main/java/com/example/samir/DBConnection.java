package com.example.samir;

public class DBConnection {
    private static volatile DBConnection connection;

    private DBConnection(String name) {
        System.out.println("Connecting to DB is established by " + name);
    }
    public static DBConnection getInstance(String name) {
        if (connection == null) {
            synchronized (DBConnection.class) {
                if(connection == null)
                {
                    connection=new DBConnection(name);
                }
            }
        }
        return new DBConnection(name);
    }

}
