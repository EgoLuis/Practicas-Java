package JDBC_JavaDeveloper;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.sql.Connection;

//import org.apache.ibatis.jdbc.ScriptRunner;

public class JDBC2_RunningScripts {
/*
	public void runDbScript() throws Exception {
		
		 File myObj = new File("db.sql");
			myObj.createNewFile();
			FileWriter writer = new FileWriter(myObj);
			String sql ="CREATE TABLE IF NOT EXISTS subject (\r\n"
					+ "	id int NOT NULL AUTO_INCREMENT,\r\n"
					+ "	name varchar(25) NOT NULL,\r\n"
					+ "	PRIMARY KEY (id)\r\n"
					+ ");\r\n"
					+ "\r\n"
					+ "CREATE TABLE IF NOT EXISTS student (\r\n"
					+ "	id int NOT NULL AUTO_INCREMENT,\r\n"
					+ "	student_name varchar(20) NOT NULL,\r\n"
					+ "	score float NOT NULL,\r\n"
					+ "	subject_id int NOT NULL,\r\n"
					+ "	PRIMARY KEY (id),\r\n"
					+ "	FOREIGN KEY (subject_id) REFERENCES subject(id)\r\n"
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
	   */
	
}



/*
CREATE TABLE IF NOT EXISTS subject (
	id int NOT NULL AUTO_INCREMENT,
	name varchar(25) NOT NULL,
	PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS student (
	id int NOT NULL AUTO_INCREMENT,
	student_name varchar(20) NOT NULL,
	score float NOT NULL,
	subject_id int NOT NULL,
	PRIMARY KEY (id),
	FOREIGN KEY (subject_id) REFERENCES Subject(id)
);
*/