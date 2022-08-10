package JDBC_JavaDeveloper;

import java.sql.*;
import java.sql.Date;
import java.util.*;

public class JDBC2_Exercise {
	/*
	Connection con;
	public DbOperations() {
		con = DbUtil.getConnection();
	}
	
	
	public boolean insertSubject(String name) throws SQLException {
		Connection conexion = DbUtil.getConnection();
		String sql = "INSERT INTO subject (name) VALUES (?)";
		PreparedStatement sentencia = conexion.prepareStatement(sql);
		sentencia.setString(1, name);
		boolean rs = sentencia.execute();
		sentencia.close();
		DbUtil.closeConnection(conexion);
		return rs;
	}
	
	
	public ArrayList getSubjectById(int id) throws SQLException {
		ArrayList<Object> resultado = new ArrayList<Object>();
		Connection conexion = DbUtil.getConnection();
		String sql = "SELECT * FROM subject WHERE id = ?";
		PreparedStatement sentencia = conexion.prepareStatement(sql);
		sentencia.setInt(1, id);
		ResultSet rs = sentencia.executeQuery();
		rs.next();
		int idRow = rs.getInt(1);
		String nameRow = rs.getString(2);
		resultado.add(idRow);
		resultado.add(nameRow);
		rs.close();
		sentencia.close();
		DbUtil.closeConnection(conexion);
		return resultado;
	}
	
	
	public ResultSet getAllSubjects() throws SQLException {
		Connection conexion = DbUtil.getConnection();
		String sql = "SELECT * FROM subject";
		Statement sentencia = conexion.createStatement();
		ResultSet rs = sentencia.executeQuery(sql);
		return rs;
	}
	
	
	public boolean insertStudent(String student_name, float score, String name) throws SQLException {
		Connection conexion = DbUtil.getConnection();
	    String subsql = "SELECT id FROM subject WHERE name = ? GROUP BY id";
	    PreparedStatement subsentencia = conexion.prepareStatement(subsql);
	    subsentencia.setString(1, name);
	    ResultSet subres = subsentencia.executeQuery();
	    subres.next();
	    int sub_id = subres.getInt("id");
		String sql = "INSERT INTO student (student_name, score, subject_id) VALUES (?,?,?)";
	    PreparedStatement sentencia = conexion.prepareStatement(sql);
	    sentencia.setString(1, student_name);
	    sentencia.setFloat(2, score);
	    sentencia.setInt(3, sub_id);
		boolean rs = sentencia.execute();
		DbUtil.closeConnection(conexion);
		return rs;
		
	}
	
	
	public ArrayList getStudentyId(int id) throws SQLException {
		ArrayList<Object> resultado = new ArrayList<Object>();
		Connection conexion = DbUtil.getConnection();
		String sql = "SELECT id, student_name, score, subject_id FROM student WHERE id = ?";
		PreparedStatement sentencia = conexion.prepareStatement(sql);
		sentencia.setInt(1, id);
		ResultSet rs = sentencia.executeQuery();	
		rs.next();
		int idRow = rs.getInt(1);
		String studentnameRow = rs.getString(2);
		float scoreRow = rs.getFloat(3);
		int subjectidRow = rs.getInt(4);	
		resultado.add(idRow);
		resultado.add(studentnameRow);
		resultado.add(scoreRow);
		resultado.add(subjectidRow);	
		DbUtil.closeConnection(conexion);
		return resultado;
	}
	
	
	public ResultSet getAllStudents() throws SQLException {
		Connection conexion = DbUtil.getConnection();
		String sql = "SELECT * FROM student";
		Statement sentencia = conexion.createStatement();
		ResultSet rs = sentencia.executeQuery(sql);
		return rs;
	}
  

	
*/

	
}
