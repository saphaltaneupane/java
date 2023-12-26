package database;

import java.sql.*;

public class TestDB {
    public static  void main(String[] args) throws ClassNotFoundException, SQLException {
        //register driver
        Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/saphalta","root","");
            //con is db
        // write sql
        // insert into sql
//        String sql="insert into hello(name) values('hello')";
//        Statement st = con.createStatement();
//        st.execute(sql);
//        con.close();
//        System.out.println("sucess");
        // deletion
//        String sql="delete from hello where id=2";
//        Statement st = con.createStatement();
//        st.execute(sql);
//     con.close();
//        System.out.println("sucess");
        // update sql
//        String sql="update hello set name='pinky' where id = 3";
//        Statement st = con.createStatement();
//        st.execute(sql);
//        con.close();
//        System.out.println("sucess");
        // select query - read query
        String sql="Select * from hello";
        Statement st = con.createStatement();
      ResultSet rs =  st.executeQuery(sql);
      while(rs.next()){
          System.out.println("Id:"+rs.getInt("id")+"\t"+"username:"+rs.getString("name"));
    }
        con.close();
        System.out.println("sucess");
    }
   }

