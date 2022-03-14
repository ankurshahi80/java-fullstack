package com.revature.main;

import com.revature.utility.ConnectionUtility;

import java.sql.Connection;
import java.sql.SQLException;

public class Driver {

    public static void main(String[] args) {
        try {
            Connection connection = ConnectionUtility.getConnection();
            System.out.println(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
