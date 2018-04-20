import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

class Conexion
{
	public static void cargar() 
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

	public static Connection conectar(String url, String username, String passwd)
	{
		Connection conn = null;

		try
		{
			conn = DriverManager.getConnection(url, username, passwd);
			System.out.println("Conexion establecida");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}

		return conn;
	}
}

public class Consulta
{
	public static void main(String[] args) 
	{
		Connection conn;
		Statement stmnt;
		ResultSet rs;

		Conexion.cargar();
		conn = Conexion.conectar("jdbc:mysql://localhost:3306/miercoles", "luis", "123");

		String query = "Select * from persona";

		try
		{
			stmnt = conn.createStatement();
			rs = stmnt.executeQuery(query);
			System.out.println("Consulta exitosa");
			while(rs.next())
			{
				String msj = "";
				msj += "Id: " + rs.getInt("Id");
				msj += " Nombre: " + rs.getString("Nombre");
				msj += " Edad: " + rs.getInt("Edad");
				System.out.println(msj);
			}
			stmnt.close();
			rs.close();
			conn.close();
		}
		catch (Exception e) {
			
		}
	}
}
/*
public class Insertar
{
	public static void main(String[] args) 
	{
		Connection conn;
		PreparedStatement ps;
		int renglonesAfectados;

		Conexion.cargar();

		conn = Conexion.conectar("jdbc:mysql://localhost:3306/miercoles", "luis", "123");

		String query = "Insert into persona (nombre, edad, sexo), values(?, ?, ?)";

		String nombre = "Paulina";
		int edad = 20;
		String sexo = "F";

		try
		{
			ps = conn.prepareStatement(query);
			ps.setString(1, nombre);
			ps.setInt(2, edad);
			ps.setString(3, sexo);
			renglonesAfectados = ps.executeUpdate();
			System.out.println("Update Exitoso");
			System.out.println("Renglones Afectados: " + renglonesAfectados);
			ps.close();
			conn.close();
		}
		catch (Exception e) {
			
		}
	}
}


public class Borrar
{
	public static void main(String[] args) 
	{
		Connection conn;
		PreparedStatement ps;
		int renglonesAfectados;
		int id = 1;

		Conexion.cargar();
		conn = Conexion.conectar("jdbc:mysql://localhost:3306/miercoles", "luis", "123");
		String query = "Delete from persona where id = ?";

		try
		{
			ps = conn.prepareStatement(query);
			ps.setInt(1, id);
			renglonesAfectados = ps.executeUpdate();
			System.out.println("Update Exitoso");
			System.out.println("Renglones Afectados: " + renglonesAfectados);
			ps.close();
			conn.close();
		}
		catch (Exception e) {
			
		}
	}
}

public class Actualizar
{
	public static void main(String[] args) 
	{
		Connection conn;
		PreparedStatement ps;
		int renglonesAfectados;
		int edad = 30;
		String nombre = "Sofia";
		int id = 4;
		String sexo = "F";

		Conexion.cargar();
		conn = Conexion.conectar("jdbc:mysql://localhost:3306/miercoles", "luis", "123");
		String query = "Update persona ser edad = ?, nombre = ?, sexo = ? where id = ?";

		try
		{
			ps = conn.prepareStatement(query);
			ps.setInt(1, id);
			renglonesAfectados = ps.executeUpdate();
			System.out.println("Update Exitoso");
			System.out.println("Renglones Afectados: " + renglonesAfectados);
			ps.close();
			conn.close();
		}
		catch (Exception e) {
			
		}
	}
}*/