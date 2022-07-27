package iEvolve;

import java.sql.*;
import java.sql.Date;
import java.util.*;

public class JDBC_Exercise {
	
	public boolean insertCategory(String type) throws SQLException {
		Connection conexion = DbUtil.getConnection();
		String sql = "INSERT INTO category (type) VALUES (?)";
		PreparedStatement sentencia = conexion.prepareStatement(sql);
		sentencia.setString(1, type);
		boolean rs = sentencia.execute();
		sentencia.close();
		DbUtil.closeConnection(conexion);
		return rs;
  }
  

	public ArrayList getCategoryById(int id) throws SQLException {
		ArrayList<Object> resultado = new ArrayList<Object>();
		Connection conexion = DbUtil.getConnection();
		String sql = "SELECT * FROM category WHERE id = ?";
		PreparedStatement sentencia = conexion.prepareStatement(sql);
		sentencia.setInt(1, id);
		ResultSet rs = sentencia.executeQuery();
		rs.next();
		int idRow = rs.getInt(1);
		String typeRow = rs.getString(2);
		resultado.add(idRow);
		resultado.add(typeRow);
		rs.close();
		sentencia.close();
		DbUtil.closeConnection(conexion);
		return resultado;
  }
  

	public ResultSet getAllCategory() throws SQLException {
		Connection conexion = DbUtil.getConnection();
		String sql = "SELECT * FROM category";
		Statement sentencia = conexion.createStatement();
		ResultSet rs = sentencia.executeQuery(sql);
		return rs;
  }
  

	public boolean insertProduct(String name, float price, String type) throws SQLException {
		Connection conexion = DbUtil.getConnection();
	    String subsql = "SELECT id FROM category WHERE type = ? GROUP BY id";
	    PreparedStatement subsentencia = conexion.prepareStatement(subsql);
	    subsentencia.setString(1, type);
	    ResultSet subres = subsentencia.executeQuery();
	    subres.next();
	    int cat_id = subres.getInt("id");
		String sql = "INSERT INTO product (name, price, category_id) VALUES (?,?,?)";
	    PreparedStatement sentencia = conexion.prepareStatement(sql);
	    sentencia.setString(1, name);
	    sentencia.setFloat(2, price);
	    sentencia.setInt(3, cat_id);
		boolean rs = sentencia.execute();
		DbUtil.closeConnection(conexion);
		return rs;
  }
  

	public ArrayList getProductById(int id) throws SQLException {
		ArrayList<Object> resultado = new ArrayList<Object>();
		Connection conexion = DbUtil.getConnection();
		String sql = "SELECT id, name, price, category_id FROM product WHERE id = ?";
		PreparedStatement sentencia = conexion.prepareStatement(sql);
		sentencia.setInt(1, id);
		ResultSet rs = sentencia.executeQuery();	
		rs.next();
		int idRow = rs.getInt(1);
		String nameRow = rs.getString(2);
		float priceRow = rs.getFloat(3);
		int categoryRow = rs.getInt(4);	
		resultado.add(idRow);
		resultado.add(nameRow);
		resultado.add(priceRow);
		resultado.add(categoryRow);	
		DbUtil.closeConnection(conexion);
		return resultado;
  }
  

	public ResultSet getAllProduct() throws SQLException {
		Connection conexion = DbUtil.getConnection();
		String sql = "SELECT * FROM product";
		Statement sentencia = conexion.createStatement();
		ResultSet rs = sentencia.executeQuery(sql);
		return rs;
  }
  

	public boolean insertOrder(String product_name, Date date) throws SQLException {
		Connection conexion = DbUtil.getConnection();
		String subsql = "SELECT id FROM product WHERE name = ? GROUP BY id";
		PreparedStatement subsentencia = conexion.prepareStatement(subsql);
		subsentencia.setString(1, product_name);
		ResultSet subres = subsentencia.executeQuery();
		subres.next();
		int pro_id = subres.getInt("id");
		String sql = "INSERT INTO orders (product_id, order_date) VALUES (?,?)";
		PreparedStatement sentencia = conexion.prepareStatement(sql);
		sentencia.setInt(1, pro_id);
		sentencia.setDate(2, date);
		boolean rs = sentencia.execute();
		sentencia.close();
		DbUtil.closeConnection(conexion);
		return rs;
  }
  

	public ArrayList getOrderById(int id) throws SQLException {
			ArrayList<Object> resultado = new ArrayList<Object>();
		Connection conexion = DbUtil.getConnection();
		String sql = "SELECT * FROM orders WHERE id = " + id;
		Statement sentencia = conexion.createStatement();
		ResultSet rs = sentencia.executeQuery(sql);	
		rs.next();
		int idRow = rs.getInt(1);
		String productRow = rs.getString(2);
		Date dateRow = rs.getDate(3);	
		resultado.add(idRow);
		resultado.add(productRow);
		resultado.add(dateRow);	
		return resultado;
  }
  

	public ResultSet getAllOrder() throws SQLException {
		Connection conexion = DbUtil.getConnection();
		String sql = "SELECT * FROM orders";
		Statement sentencia = conexion.createStatement();
		ResultSet rs = sentencia.executeQuery(sql);
		DbUtil.closeConnection(conexion);
		return rs;
	}
}
