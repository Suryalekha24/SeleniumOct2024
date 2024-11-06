package week2.day3;

public class APIClient {
	
	public void sendRequest(String endPoint) {
		System.out.println("Print:"+endPoint);
	}
	
	public void sendRequest(String endPoint,String requestBody,boolean requestStatus) {
		System.out.println("Print end point:"+endPoint);
		System.out.println("Request Body:"+requestBody);
		System.out.println("Request Status:"+requestStatus);
	}
	public static void main(String[] args) {
		APIClient obj = new APIClient();
		obj.sendRequest("https://www.leafground.com/");
		obj.sendRequest("http://leaftaps.com/opentaps/control/main", "body", false);

	}

}
