package employee.login;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	
	@CrossOrigin(origins= "http://172.22.32.96:4200")
	@RequestMapping("/user")
	public User getName()
	{
		User admin = new User();
		admin.SetUserName("Ram");
		admin.setPassword("ash@123");
		return admin;
		
		
	}
}
