package application;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import database.DB;

public class Program {

	public static void main(String[] args) {

		Connection connection = null;

		Statement statement = null; // onde preparamos a consulta a ser feita no banco

		ResultSet resultSet = null; // onde guardaremos o resultado da consulta statement feita
		
		try {
			connection=DB.getConnection();
			statement=connection.createStatement();
			resultSet=statement.executeQuery("select * from department");
			while (resultSet.next()) {
				System.out.println(resultSet.getInt("Id") + ", " + resultSet.getString("Name"));
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			DB.closeResultSet(resultSet);
			DB.closeStatement(statement);
			DB.closeConnection();
		}
	}

}
