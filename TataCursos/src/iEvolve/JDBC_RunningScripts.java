package iEvolve;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.sql.Connection;

//import org.apache.ibatis.jdbc.ScriptRunner;
/*
public class JDBC_RunningScripts {

	public void runDbScript() throws Exception {
		
		 File myObj = new File("db.sql");
			myObj.createNewFile();
			FileWriter writer = new FileWriter(myObj);
			String sql ="CREATE TABLE IF NOT EXISTS category (\r\n"
					+ "	id int NOT NULL AUTO_INCREMENT,\r\n"
					+ "	type varchar(25) NOT NULL,\r\n"
					+ "	PRIMARY KEY (id)\r\n"
					+ ");\r\n"
					+ "\r\n"
					+ "CREATE TABLE IF NOT EXISTS product (\r\n"
					+ "	id int NOT NULL AUTO_INCREMENT,\r\n"
					+ "	name varchar(20) NOT NULL,\r\n"
					+ "	price float NOT NULL,\r\n"
					+ "	category_id int NOT NULL,\r\n"
					+ "	PRIMARY KEY (id),\r\n"
					+ "	FOREIGN KEY (category_id) REFERENCES category(id)\r\n"
					+ ");\r\n"
					+ "\r\n"
					+ "CREATE TABLE IF NOT EXISTS orders (\r\n"
					+ "	id int NOT NULL AUTO_INCREMENT,\r\n"
					+ "	product_id int NOT NULL,\r\n"
					+ "	order_date date NOT NULL,\r\n"
					+ "	PRIMARY KEY (id),\r\n"
					+ "	FOREIGN KEY (product_id) REFERENCES product(id)\r\n"
					+ ");";
			writer.write(sql);
			writer.flush();
			writer.close();

		    Connection conexion = DbUtil.getConnection();
		    ScriptRunner sr = new ScriptRunner(conexion);
		    Reader reader = new BufferedReader(new FileReader("db.sql"));
	      sr.runScript(reader);
	      DbUtil.closeConnection(conexion);

	   }
	
}
*/


/*
CREATE TABLE IF NOT EXISTS category (
	id int NOT NULL AUTO_INCREMENT,
	type varchar(25) NOT NULL,
	PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS product (
	id int NOT NULL AUTO_INCREMENT,
	name varchar(20) NOT NULL,
	price float NOT NULL,
	category_id int NOT NULL,
	PRIMARY KEY (id),
	FOREIGN KEY (category_id) REFERENCES category(id)
);

CREATE TABLE IF NOT EXISTS orders (
	id int NOT NULL AUTO_INCREMENT,
	product int NOT NULL,
	order_date date NOT NULL,
	PRIMARY KEY (id),
	FOREIGN KEY (product) REFERENCES product(id)
);
*/