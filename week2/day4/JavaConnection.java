package week2.day4;

public class JavaConnection extends MySqlConnection implements DatabaseConnection{

	public static void main(String[] args) {
		JavaConnection jc = new JavaConnection();
		jc.connect();
		jc.executeUpdate();
		jc.executeQuery();
		jc.disconnect();
	}

	@Override
	public void connect() {
		System.out.println("Connect to Database");
		
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("DisConnect from Database");
	}

	@Override
	public void executeUpdate() {
		// TODO Auto-generated method stub
		System.out.println("Update changes to Database");
	}

}
