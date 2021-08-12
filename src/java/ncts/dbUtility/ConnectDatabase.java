/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ncts.dbUtility;

import java.sql.Connection;
import java.sql.SQLException;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

/**
 *
 * @author WIN 10
 */
public class ConnectDatabase {
    public static Connection makeConnection() throws NamingException,SQLException {
        Context curContext = new InitialContext();
        Context tomcatContext  = (Context)curContext.lookup("java:comp/env");
        DataSource ds = (DataSource)tomcatContext.lookup("THAISON");
        Connection con = ds.getConnection();
        return con;
    }
}
