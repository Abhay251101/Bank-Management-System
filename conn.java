package bank.management.system;

import java.sql.*;
public class conn {
//    Step 1. register the driver
//    step 2. create connection
//    step 3. create statement
    Connection c;
    Statement s;
    public conn(){
        try {
            c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem", "root", "Pratap*1");
            s = c.createStatement();
        } catch(Exception e){
            System.out.println(e);
        }
    }
}
