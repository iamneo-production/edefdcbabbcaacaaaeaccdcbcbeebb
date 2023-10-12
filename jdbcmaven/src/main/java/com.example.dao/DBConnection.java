public class DBConnection {
    	
        public static Connection getConnection() throws Exception {        
            ResourceBundle rb = ResourceBundle.getBundle("mysqldb");
            String url = rb.getString("db.url");
            String username = rb.getString("db.username");
            String password = rb.getString("db.password");
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(url,username,password);       
            return con;
        }
    }

