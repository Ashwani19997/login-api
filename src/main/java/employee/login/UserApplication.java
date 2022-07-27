package employee.login;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
public class UserApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserApplication.class, args);
	}
	
	@SuppressWarnings("deprecation")
	@Bean
	public WebMvcConfigurer corsConfigurer() {
	   return (WebMvcConfigurer) new WebMvcConfigurerAdapter() {
	      @Override
	      public void addCorsMappings(CorsRegistry registry) {
	         registry.addMapping("/user").allowedOrigins("http://localhost:4200");
	       }    
	   };
	}
	

}
