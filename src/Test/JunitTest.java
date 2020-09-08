package Test;

import org.junit.Test;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

import com.iplacex.Usuario;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;




public class JunitTest {
	
	public  JunitTest() {
		
	}
	
  
  @BeforeClass
  public static void setUpClass() {
  }

  @AfterClass
  public static void tearDownClass() {
  }

  @Before
  public void setUp() {
  }

  @After
  public void tearDown() {
  }
  
  @Test
  public void testConexion() {
	  System.out.println("Test de Conexion");
	  try {
	      Class.forName("com.mysql.cj.jdbc.Driver");
	      Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/eva2","root","admin");
	      if(con.isValid(0)) {
	    	  System.out.println("Conectado Correctamente");
	      }else {
	        System.out.println("Error de conexion");
	      }  
	    } catch (ClassNotFoundException e) {
	      e.printStackTrace();
	      System.out.println("Error de conexion");
	    } catch (SQLException e) {
	      e.printStackTrace();
	      System.out.println("Error de conexion");
	    }
  }
  
  @Test
  public void testLogin() {
	  System.out.println("Test de Login");
	  try {
	      Class.forName("com.mysql.cj.jdbc.Driver");
	      Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/eva2","root","admin");
	      Statement stmt = con.createStatement();
	      ResultSet rs = stmt.executeQuery("select username, password from usuario where username='juan' and password='123456'");
	      
	      if(rs.next()) {
	    	  System.out.println("Usuario correcto");
	      }else {
	        System.out.println("Usuario o contraseña incorrecto");
	      }
	      
	      
	      
	    } catch (ClassNotFoundException e) {
	      // TODO Auto-generated catch block
	      e.printStackTrace();
	    } catch (SQLException e) {
	      // TODO Auto-generated catch block
	      e.printStackTrace();
	    }
  }
  
  

}
