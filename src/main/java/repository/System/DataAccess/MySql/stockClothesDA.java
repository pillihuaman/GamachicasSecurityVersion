package repository.System.DataAccess.MySql;
import domain.System.BusinessEntity.Base.Clothing;
import domain.System.BusinessEntity.Base.Imagen;
import domain.System.BusinessEntity.ViewStockBE;
import infrastructure.System.Adapters.EntityDBConnection;
import infrastructure.System.Adapters.MySqlAdapter;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;

import org.sql2o.Sql2o;


public class stockClothesDA {

    private Sql2o sql2o;
    public stockClothesDA(Sql2o sql2o) {
        this.sql2o = sql2o;
    }
    public stockClothesDA()
    {}
    
    public  static List<Imagen> list() 
    {
//    	EntityDBConnection conne= MySqlAdapter.getConnectionString();
//    	Sql2o sql2o = new Sql2o(conne.getUrl(), conne.getUser(), conne.getPassword());
//    	Connection con = null;
//    	
//        String DB_URL = "jdbc:mysql://localhost:3306/Gamachicas";
//        String USER = "root";
//        String PASS = "1988deza";
//        Sql2o sql2o2 = new Sql2o(DB_URL, USER, PASS);
//        String sql ="select * from Gamachicas.imagen order by 1 desc";
//          try (Connection con1 = sql2o2.open()){
//  	  {
//  		    final String query ="select * from Gamachicas.imagen order by 1 desc ";
//
//  		
//  		     return null;
//  		  }
//      } 
    	try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} 
    	  String DB_URL = "jdbc:mysql://localhost:3306/Gamachicas";
          String USER = "root";
          String PASS = "1988deza";
          Sql2o sql2o = new Sql2o(DB_URL, USER, PASS);

          String sql ="select * from Gamachicas.imagen  where  idclothing=:idclothing";
          try (org.sql2o.Connection con =  sql2o.open()){
                  //people = con.createQuery(sql).executeAndFetch(Person.class);
        	

        	    List<Imagen> result = con
        	            .createQuery(sql)
        	            .addParameter("idclothing", 1)
        	            .executeAndFetch(Imagen.class);

        	    result.forEach(System.out::println);
          }
		return null;
      

    } 
    protected void doGet()
            throws ServletException, IOException {

        String DB_URL = "jdbc:mysql://localhost:3306/Gamachicas";
        String USER = "root";
        String PASS = "1988deza";
        Sql2o sql2o = new Sql2o(DB_URL, USER, PASS);

        String sql ="select * from Gamachicas.imagen order by 1 desc";
        try (org.sql2o.Connection con = sql2o.open()){
                //people = con.createQuery(sql).executeAndFetch(Person.class);
        	String s= null;
        }
        // code to generate json here...
    }



    
      /*  try (org.sql2o.Connection con = new Sql2o(conne.getUrl(), conne.getUser(), conne.getPassword()).open()) {
    	  {
    		    final String query ="select * from Gamachicas.imagen order by 1 desc ";

    		
    		     return null;
    		  }
        } */
//    		final String query =
//    		        "SELECT id, name, address " +
//    		        "FROM customers WHERE id = :customerId";
//
//    		    return ((Sql2o) con).createQuery(query)
//    		        .addParameter("customerId", customerId)
//    		        .executeAndFetch(Customer.class);
//    	
  
  
    
//
//	   public static   List<ViewStockBE>  getViewStock( ViewStockBE objs)
//				throws SQLException, IOException {
//		   //uSING SQL20
//	
//
//			Connection dbConnection = null;
//			CallableStatement callableStatement = null;
//			ResultSet rs = null;
//	            List<ViewStockBE> lst =new ArrayList<ViewStockBE>();
//			String getDBUSERCursorSql = "{CALL SelectMenuParent()}";
//
//			try {
//				dbConnection = MySqlAdapter.connectDatabase();
//				callableStatement = dbConnection.prepareCall(getDBUSERCursorSql);
//				//callableStatement.registerOutParameter(1, OracleTypes.CURSOR);
//
//				// execute getDBUSERCursor store procedure
//			 callableStatement.execute();
//
//				// get cursor and cast it to ResultSet
//				//rs = (ResultSet) callableStatement.getObject(2);
//
//
//					   ResultSet resultSet = callableStatement.getResultSet();
//					
//					  // process result set
//	                while (resultSet.next()) {
//	                	  String name = resultSet.getString("name");
//		                    String path = resultSet.getString("path");
//	          
//	 
//	                    System.out.println(
//	                            "| " + name + " | " + path );
//	                }
//	                resultSet.close();
//	 
//
//			} catch (SQLException e) {
//
//				System.out.println(e.getMessage());
//
//			} finally {
//
//				if (rs != null) {
//					rs.close();
//				}
//
//				if (callableStatement != null) {
//					callableStatement.close();
//				}
//
//				if (dbConnection != null) {
//					dbConnection.close();
//				}
//
//			}
//	 return lst;
//		}

}
