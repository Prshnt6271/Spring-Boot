package com.curd.service;

import java.net.URISyntaxException;

//ApiService.java
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

@Service
public class ApiService {

 private final String BASE_URL = "https://qa2.sunbasedata.com/sunbase/portal/api/";

 public String authenticateUser(String loginId, String password) {
	 try {
		 
		  String url = BASE_URL + "assignment_auth.jsp";
		     RestTemplate restTemplate = new RestTemplate();

		     HttpHeaders headers = new HttpHeaders();
		     headers.setContentType(MediaType.APPLICATION_JSON);

		     String body = String.format("{\"login_id\":\"%s\",\"password\":\"%s\"}", loginId, password);
		     System.out.println(body+" id"+loginId);
		     HttpEntity<String> requestEntity = new HttpEntity<>(body, headers);

		     ResponseEntity<String> responseEntity = restTemplate.postForEntity(url, requestEntity, String.class);
		     System.out.println("code"+responseEntity);
		     if (responseEntity.getStatusCode() == HttpStatus.OK) {
		    	 System.out.print("x--"+responseEntity.getBody());
		    	 String accessToken = "{\"access_token\":\"dGVzdEBzdW5iYXNlZGF0YS5jb206VGVzdEAxMjM=\"}";
		    	 System.out.print("yyy--"+accessToken);
		    	 if (accessToken != null && !accessToken.isEmpty()) {
		    		 System.out.println("ABCD");
		    		 getCustomerList(accessToken);
		             return "customerList"; // Redirect to the customer list page
		         } else {
		             // Handle authentication failure
		             return "login"; // or return an error page
		         }
		     } else {
		         System.out.println("error");
		    	 
		         return null;
		     }
		
	} catch (Exception e) {
		System.out.println(e);
	}
    return "";
 }

 // Implement methods for createCustomer, getCustomerList, deleteCustomer, and updateCustomer
 public String getCustomerList(String accessToken) throws URISyntaxException {
	 
     System.out.println("heyyyy");

    	 System.out.println("getcustomer");

         HttpHeaders headers = new HttpHeaders();
         accessToken = "dGVzdEBzdW5iYXNlZGF0YS5jb206VGVzdEAxMjM=";
         
         headers.set("Authorization", "Bearer " + accessToken);

         // Create HttpEntity with headers
         HttpEntity<String> entity = new HttpEntity<>(headers);

         // Make the GET request
         String apiUrl = "https://qa2.sunbasedata.com/sunbase/portal/api/assignment.jsp?cmd=get_customer_list";
         try {
             ResponseEntity<String> responseEntity = new RestTemplate().exchange(apiUrl, HttpMethod.GET, entity, String.class);
             // Handle the response as needed
             System.out.println(responseEntity.getBody());
         } catch (HttpClientErrorException.Unauthorized unauthorizedException) {
             // Handle unauthorized exception
             System.out.println("Unauthorized: " + unauthorizedException.getMessage());
         }
		return apiUrl;

       
 }
}
