package es.rama.books;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.*;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
@EnableDiscoveryClient
@SpringBootApplication
@EnableResourceServer
class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SpringApplication.run(MainApp.class, args);
	}

}