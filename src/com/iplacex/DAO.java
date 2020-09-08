package com.iplacex;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DAO {
	private Conexion con;

	public DAO(String jdbcURL, String jdbcUserName, String jdbcPassword) throws SQLException {
		con= new Conexion(jdbcURL, jdbcUserName, jdbcPassword);
		//con.Connection();
		System.out.println(con.getJdbcConnection());
	}
	
	public boolean registrar(Persona a) {
		boolean estado=false;
		Statement stm;
		String sql ="INSERT INTO persona VALUES ("+a.getRut()+"','"+a.getNombre()+"','"+a.getApellido()+"','"+a.getTelefono()+"','"+a.getFechaIngreso()+")";
		try {
			con.Connection();
			stm=con.getJdbcConnection().createStatement();
			stm.executeUpdate(sql);
			estado=true;
			stm.close();
			con.Disconnect();
		} catch (SQLException e) {
			estado=false;
			e.printStackTrace();
			
		}
		
		return estado;
	}
	
	public void leerUsuario() {
		Statement stm;
		ResultSet res = null;
		Usuario u;
		String sql = "SELECT * FROM usuario";
		
		
	}

}
