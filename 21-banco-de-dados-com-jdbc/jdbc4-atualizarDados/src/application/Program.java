package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import database.DB;

public class Program {

	public static void main(String[] args) {

		Connection connection = null;
		PreparedStatement preparedStatement = null;

		try {
			connection = DB.getConnection();

			preparedStatement = connection
					.prepareStatement("UPDATE seller SET BaseSalary = BaseSalary + ? WHERE (DepartmentId = ?)");
			preparedStatement.setDouble(1, 200.0);
			preparedStatement.setInt(2, 2);

			int rowsAffected = preparedStatement.executeUpdate();

			System.out.println("Done! Rows affected: " + rowsAffected);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DB.closeStatement(preparedStatement);
			DB.closeConnection();
		}
	}

}
