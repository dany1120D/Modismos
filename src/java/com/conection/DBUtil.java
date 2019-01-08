/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.conection;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

/**
 *
 * @author danie
 */
public class DBUtil {
    
    //Patron de diseño singlestone
    private static Connection connection=null;
    public static Connection getConnection(){
        if(connection!=null)
            return connection;
        else{
            try{
                Properties prop=new Properties();
                InputStream inputStream = DBUtil.class.getClassLoader().getResourceAsStream("db.properties");
                prop.load(inputStream);
                String driver=prop.getProperty("driver");
                String url=prop.getProperty("url");
                String user=prop.getProperty("user");
                String password=prop.getProperty("password");
                
                //Crear Coneccion
                Class.forName(driver);
                connection=DriverManager.getConnection(url, user, password);
            }catch(Exception ex){
                ex.printStackTrace();
            }
            return connection;
        }
    }
}
