package com.openshift.coursecatalogue;

import org.springframework.boot.SpringApplication;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
/*import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.context.annotation.Bean;*/

@SpringBootApplication
//@PropertySource("classpath:application-docker.properties")
public class CourseCatalogueServerAppApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(CourseCatalogueServerAppApplication.class, args);
	}
	@Bean
	public WebServerFactoryCustomizer<ConfigurableServletWebServerFactory>
	  webServerFactoryCustomizer() {
	    return factory -> factory.setContextPath("/baeldung");
	}
	/*@Bean
	public WebServerFactoryCustomizer<ConfigurableServletWebServerFactory>
	  webServerFactoryCustomizer() {
	    return factory -> factory.setContextPath("/");
	}*/
	/*@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	//String configLocation = System.getProperty("global.appconf.dir"); //get the default config directory location
	///	InputStream input = getServletContext().getResourceAsStream("/WEB-INF/class/application-docker.properties");
	  //  String configPath = configLocation + File.separator + "springApplication"  + File.separator + "application-docker.properties"; //set the configpath of this application instance exclusively
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		InputStream input=classLoader.getResourceAsStream("application-docker.properties");
		//InputStream input = classLoader.getResourceAsStream("application-docker.properties");
		InputStreamReader isReader = new InputStreamReader(input);
	      //Creating a BufferedReader object
	      BufferedReader reader = new BufferedReader(isReader);
	      StringBuffer sb = new StringBuffer();
	      String str;
	      try {
			while((str = reader.readLine())!= null){
			     sb.append(str);
			  }
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	      System.out.println(sb.toString());
		// ...
		Properties properties = new Properties();
		try {
			//properties.load(input);
			properties.setProperty("spring.config.location", sb.toString());
			System.out.println("proper---"+properties);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   // System.out.println("Configpath: " + configPath);
	    System.out.println("Starting to run Spring boot app...");
	    //if(configLocation != null && !configLocation.isEmpty()) {
	   // if(configLocation != null && !configLocation.isEmpty()) {
	    if(properties != null && !properties.isEmpty()) {
	    	
	 //   Properties props = new Properties();
	   // props.setProperty("spring.config.location", configPath); //set the config file to use   
	    application.application().setDefaultProperties(properties);
	    }else{
	    	 System.out.println("No global.appconf.dir property found, starting with default on classpath");
	    }
	return application.sources(CourseCatalogueServerAppApplication.class);
	}

*/}
