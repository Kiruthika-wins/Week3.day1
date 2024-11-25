package week3.day1.HomeAssignments;

public class APIClient {

    public void sendRequest(String endpoint) {
        System.out.println("Sending request to endpoint: " + endpoint);
    }

    public void sendRequest(String endpoint, String requestBody, boolean requestStatus) {
        System.out.println("Sending request to endpoint: " + endpoint);
        System.out.println("Request Body: " + requestBody);
        System.out.println("Request Status: " + (requestStatus ? "Success" : "Failure"));
    }

    public static void main(String[] args) {
        APIClient api = new APIClient();

        // Call the first version of the sendRequest method
        api.sendRequest("https://api.example.com/1st-version");

        // Call the second version of the sendRequest method
        api.sendRequest("https://api.example.com/2nd-version", "\"Test Polymorphism\"", true);
    }

}