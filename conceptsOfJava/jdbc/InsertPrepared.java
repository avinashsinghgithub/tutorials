package jdbc;

import java.sql.*;  
public class InsertPrepared{  
public static void main(String args[]){  
try{  
Class.forName("oracle.jdbc.driver.OracleDriver");  
  
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","avinash","avinash");  
  
PreparedStatement stmt=con.prepareStatement("insert into item values(?,?,?,?,?)");  
stmt.setInt(1,103);//1 specifies the first parameter in the query  
stmt.setString(2,"item name ");  
stmt.setInt(3,3);   
stmt.setString(4,"description"); 
stmt.setInt(5,100); 
int i=stmt.executeUpdate();  
System.out.println(i+" records inserted");  
  
con.close();  
  
}catch(Exception e){ System.out.println(e);}  
  
}  
}