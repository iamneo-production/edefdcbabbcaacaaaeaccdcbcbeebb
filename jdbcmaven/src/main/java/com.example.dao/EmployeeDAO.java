
public class EmployeeDAO {
    public List<Book> getAllUEmplooes()throws Exception{
		List<Employee> empList = new ArrayList<>();				
		Book book=null;
		
		Connection	con=DBConnection.getConnection();		
		Statement st=con.createStatement();
		//ResultSet rs=st.executeQuery("select *from \"user\"");
		ResultSet rs=st.executeQuery("select *from book");
		
		while(rs.next()) {			
			book=new Book(rs.getInt(1), rs.getString(3),rs.getString(2),rs.getDouble(4));
			userList.add(book);			
		}
		return userList;
	}
	
}
