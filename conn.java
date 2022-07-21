//Project Name :Payroll System
//Authors:vaibhav,Hussain, Partha
//Due Date :14/6/2021


//Database connection file
import java.sql.*;

public class conn {
    
    public Connection c;
    public Statement s;
 
    public conn(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            c=DriverManager.getConnection("jdbc:mysql://localhost:3306/payroll","root","");

            s = c.createStatement();
            if (c!=null){
                System.out.println("***************Database Connection Successful***************");
            }



        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}
 
