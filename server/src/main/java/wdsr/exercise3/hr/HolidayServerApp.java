package wdsr.exercise3.hr;

import javax.xml.ws.Endpoint;

public class HolidayServerApp {
	private static final String SERVICE_ADDRESS = "http://localhost:8090/holidayService/";
	
    protected HolidayServerApp() throws java.lang.Exception {
        System.out.println("Starting Server");
        Object implementor = new HumanResourcePortImpl(new HolidayRepository());
        Endpoint.publish(SERVICE_ADDRESS, implementor);
    }
    
    public static void main(String args[]) throws java.lang.Exception { 
        new HolidayServerApp();
        System.out.println("Server ready..."); 
        
        Thread.sleep(500 * 60 * 1000); 
        System.out.println("Server exiting");
        System.exit(0);
    }

}
