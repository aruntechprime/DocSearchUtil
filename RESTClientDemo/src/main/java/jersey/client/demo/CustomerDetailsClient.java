package jersey.client.demo;

import javax.ws.rs.core.MediaType;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class CustomerDetailsClient {

	public static void main(String[] args) {
		Client client = Client.create();
		WebResource webResource = client.resource("http://localhost:8080/JerseyDemo/webapi/myresource");
		ClientResponse response = webResource.accept(MediaType.TEXT_PLAIN).get(ClientResponse.class);
		System.out.println("Got response status -> "+response.getStatus());
		System.out.println("Got response -> "+response.getEntity(String.class));

	}

}
