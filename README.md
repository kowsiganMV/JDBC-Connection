<h1 align="center" id="title">JDBC Connection</h1>

<p id="description">here two ways to create a JDBC connection. lets see more about that</p>

  
  
<h2>🧐 Methods</h2>

Here're some of the project's best features:

*   Using Java Project
*   Using CMD

<h2>🛠️ Installation Steps:</h2>

<p>1. setup vscode</p>

<p>2. install and setup mysql</p>

<p>3. install jar file using given link</p>

```
https://dev.mysql.com/downloads/connector/j/
```

<p>4. Now we complete the setup</p>

<h2>🍰 Steps to Achieve:</h2>


<h3>Useing Java Project:</h3>
<p>1. now write the java program to generate the connection. hint💡</p>

```
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
```
<p>2. make sure in src your main file will be present</p>

```
->lib
->src
    ->main.java
```

<p>3. Then see below you find the JAVA PROJECT there add a jar file which you previously download</p>

<p align="center"><img src="https://github.com/user-attachments/assets/33732028-c180-4673-8984-e266222e90b0" alt="project-image" ></p>
<p>4. Add ur jar file which will be have + button </p>

<p align="center"><img src="https://github.com/user-attachments/assets/4327bd49-c2ce-4227-a02a-a66fe13bb10f" alt="project-image"></p>

<p>5. Run using the Run button which is poped on the main function</p>


<h3>Useing CMD:</h3>

<p>1. write a same main function code</p>

<p>2. Run using bellow command</p>

```
javac Main.java
java -cp ".;/<PATH>/mysql-connector-j-9.1.0.jar" Main
```
<p>3. You Got the Result 👍</p>

<h2>💻 Built with</h2>

Technologies used in the project:

*   Java
*   MYSQL
*   JAR Driver

<h2>💖Like my work?</h2>

Please visit and follow my GitHub repository or profile for the latest updates on technical projects and code contributions
