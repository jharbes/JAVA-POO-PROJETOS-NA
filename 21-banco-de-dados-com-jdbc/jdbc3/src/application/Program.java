package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import database.DB;

public class Program {

	public static void main(String[] args) {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Connection connection = null;
		PreparedStatement preparedStatement = null;

		try {
			connection = DB.getConnection();
			preparedStatement = connection.prepareStatement(
					"INSERT INTO seller (Name, Email, BirthDate, BaseSalary, DepartmentId) VALUES (?, ?, ?, ?, ?)");
			preparedStatement.setString(1, "Carl Purple");
			preparedStatement.setString(2, "carl@gmail.com");
			preparedStatement.setDate(3, new java.sql.Date(sdf.parse("22/04/1985").getTime()));
			preparedStatement.setDouble(4, 3000.0);
			preparedStatement.setInt(5, 4);

			int rowsAffected = preparedStatement.executeUpdate();

			System.out.println("Done! Rows Affected: " + rowsAffected);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		} finally {
			DB.closeStatement(preparedStatement);
			DB.closeConnection();
		}
	}

}
