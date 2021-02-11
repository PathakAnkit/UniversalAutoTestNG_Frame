package org.application.webAPI;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.TrustSelfSignedStrategy;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.entity.mime.content.StringBody;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.ssl.SSLContextBuilder;
import org.json.simple.JSONObject;

public class RestApiServices {

	public static HttpPost post;
	public static HttpEntity responseEntity;
	public static CloseableHttpClient httpClient;
	public static MultipartEntityBuilder builder = MultipartEntityBuilder.create();
	public static CloseableHttpResponse response = null;
	public static JSONObject jsonObject = new JSONObject();
	public static File FileName;
	public static String message, RespValue;
	
	
	//Connect POST Url
	public static void ConnectPOSTUrl(String httpsURL) throws NoSuchAlgorithmException, KeyStoreException, KeyManagementException {
		
		SSLContextBuilder bldr = new SSLContextBuilder();
		bldr.loadTrustMaterial(null, new TrustSelfSignedStrategy());
		SSLConnectionSocketFactory sslsf = new SSLConnectionSocketFactory(bldr.build());
		
		httpClient = HttpClients.custom().setSSLSocketFactory(sslsf).build();
		
		post = new HttpPost(httpsURL);
		
	}
	
	
	//Add Headers
	public static void SendHeaders(String Headers) {
		
		switch(Headers) {
		
		case"Authorization":
			String basicAuth = Base64.getEncoder().encodeToString(("xyz").getBytes(StandardCharsets.UTF_8));
			post.setHeader("Authorization", basicAuth);
			break;
			
		case"Accept-Encoding":
			post.setHeader("Accept-Encoding", "gzip, deflate, br");
			break;
		
			//Add more cases if required
		}
		
	}
	
	//Create JSON Body
	@SuppressWarnings("unchecked")
	public static void createJSONString(String JSONKey, String JSONValue) {
		jsonObject.put(JSONKey, JSONValue);		
	}
	
	//Add JSON Body
	public static void addJSONString(String JSONKeyName) {
		message = jsonObject.toJSONString();
		
		builder.addPart(JSONKeyName, new StringBody(message, ContentType.TEXT_PLAIN));
	}
	
	//Add Images to Body
	public static void addImages(String imageName, String requestImage) throws FileNotFoundException {
		FileName = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\ImageBanks\\"+imageName+".jpg");
		
		builder.addBinaryBody(requestImage, new FileInputStream(FileName), ContentType.create("image/jpeg"), FileName.getName());
	}
	
	//Send the POST request
	public static void SendPOSTRequest(String rqstType) throws IOException {
		try {
			switch(rqstType.toUpperCase()) {
			case"MULTIPART":
				HttpEntity multipart = builder.build();
				post.setEntity(multipart);
				break;
				
			case"RAWJSON":
				StringEntity requestBody = new StringEntity(message, ContentType.APPLICATION_JSON);
				post.setEntity(requestBody);
				break;
				
			}
			
			response = httpClient.execute(post);
			responseEntity = response.getEntity();
			
			int statusCode = response.getStatusLine().getStatusCode();
			long responseLength = response.getEntity().getContentLength();
			
			System.err.println("\nResponse Code: "+statusCode);
			System.err.println("Response Length: "+responseLength+"\n");
			
			InputStream Content = responseEntity.getContent();
			BufferedReader reader = new BufferedReader(new InputStreamReader(Content));
			StringBuilder sb = new StringBuilder();
			sb.append(reader.readLine());
			Content.close();
			RespValue=sb.toString();
			System.out.println("Response: "+RespValue+"\n");
			
		}catch(Exception e) {
			System.err.println(e.getStackTrace());
		}finally {
			response.close();
		}
	}
	

	// end of class
}
