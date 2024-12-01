import java.sql.*;
import java.util.*;

public class Main{
    public static void main(String args[]) {
        Map<Integer,String> data=new HashMap<>();
        Connection con=null;
        Statement state=null;
        ResultSet rs=null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/kowsik";
            String username="root";
            String password="dearam8114";
            con=DriverManager.getConnection(url,username,password);
            state=con.createStatement();
            String query="SELECT * FROM user_info";
            rs=state.executeQuery(query);


            while(rs.next()){
                int id=rs.getInt("id");
                String name=rs.getString("name");
                data.put(id,name);
                
            }
            for(Map.Entry<Integer,String> entry:data.entrySet()){
                System.out.println(entry.getKey()+"  "+entry.getValue());
            }

        } catch (Exception e) {
            System.out.print(e);
        }
    }
}