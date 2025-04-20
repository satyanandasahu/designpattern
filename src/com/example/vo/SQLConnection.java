package com.example.vo;

public class SQLConnection {

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
	//	int a = (int) (Math.random()/1.00);
		int a = System.identityHashCode(SQLConnection.class);
		return a;
	}

	private SQLConnection() {
	};

	private static SQLConnection sqlConnection = new SQLConnection();

	public static SQLConnection getSQLConnection() {
		synchronized (sqlConnection) {

			if (sqlConnection == null)
				sqlConnection = new SQLConnection();
			return sqlConnection;
		}
	}

}
