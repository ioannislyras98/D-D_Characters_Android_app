package com.example.danddcharacters;

import android.os.StrictMode;

import java.sql.Connection;

public class Connectdatabase {
    Connection con;
    String uname, pass, ip, port, database;

    public Connection connectionclass(){
        ip = "172.1.1.0";
        database="programmingdb";
        uname="sa";
        pass="dandd123";
        port="1433";
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
        Connection connection= null;
         
        return connection;
    }
}
