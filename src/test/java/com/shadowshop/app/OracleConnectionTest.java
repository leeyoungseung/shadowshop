package com.shadowshop.app;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

public class OracleConnectionTest {

    private static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
    private static final String URL = "jdbc:oracle:thin:@192.168.99.100:1521:xe";
    private static final String USER = "DAVID";
    private static final String PW = "1111";
	
	@Test
	public void testConnection() throws Exception {
        Class.forName(DRIVER);
        
        try(Connection con = DriverManager.getConnection(URL, USER, PW)){
            System.out.println(con);
            
        }catch(Exception e){
            e.printStackTrace();
        }
	}
}
