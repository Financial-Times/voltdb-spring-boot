package com.example.demo.services;

import java.io.IOException;
import org.springframework.stereotype.Service;
import org.voltdb.client.ClientConfig;
import org.voltdb.client.ClientFactory;

@Service
public class HelloService {
	public HelloService() {
		
		// Create VoltDB connection in constructor
		org.voltdb.client.Client client = null;
	    ClientConfig config = null;
	    
	    config = new ClientConfig("username", "password");
	    /**
	     *  config.setConnectionResponseTimeout(5000);
	    	config.setProcedureCallTimeout(5000);
	    	config.setTopologyChangeAware(true);
	    	config.setReconnectOnConnectionLoss(true);
	    	config.enableSSL(); 
	     */
	    
	    client = ClientFactory.createClient(config);
	    
	    try {
			client.createConnection("spoor-voltdb.in.ft.com");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// Add methods here...
	public String greeting() {
		return "Hello";
	}
}
