package week2.day4;

public abstract class MySqlConnection implements DatabaseConnection{
	public void executeQuery() {
		System.out.println("Execute given query in Database");
	}
}
