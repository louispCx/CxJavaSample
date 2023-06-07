package com.example.CxJavaSample;

import java.io.IOException;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.extern.log4j.Log4j2;

@SpringBootApplication
@Log4j2
public class ScannerTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScannerTestApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {

			String userInput = "";
			if (args.length > 0) {
				log.info("args: ");

				// use first argument as the input JSON
				userInput = args[0];
				for (String arg : args) {
					log.info(arg);
				}
			} else {
				log.info("No args provided.");
			}



			// ObjectMapper mapper = new ObjectMapper(); 

			// // Use jackson databind to convert string to POJO
			// try {
			// 	MyValue myValue = mapper.readValue("{\"name\":\"Bob\", \"age\":13}", MyValue.class);
			// 	log.info("MyValue: {}", myValue.toString());
			// 	
			// 	if (!userInput.equals("")) {
			// 		// user provided input, try deserialize 
			// 		var userObject = mapper.readValue(userInput, MyValue.class);
			// 		log.info( "User object: {}", userObject.toString());
			// 	}


			// } catch (IOException e) {
			// 	e.printStackTrace();
			// }

		};
	}

}
