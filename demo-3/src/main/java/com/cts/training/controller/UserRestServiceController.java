package com.cts.training.controller;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
//import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.cts.training.models.User;
import com.cts.training.repo.UserRepo;
@RestController
@CrossOrigin(origins = "*")
public class UserRestServiceController {
	@Autowired
	UserRepo ur;
	
	@Autowired
	JavaMailSender jms;
	
	@GetMapping("/user")
	public List<User> findAll() {
		return ur.findAll();
	}
	@GetMapping("/user/{id}")
	public User findOne(@PathVariable int id) {
		Optional<User> usr = ur.findById(id);
		User us = usr.get();
		return us;
	}
	@PostMapping("/user")
	public User save(@RequestBody User usr) {
		User us = ur.save(usr);
		try {
			SimpleMailMessage sm =new SimpleMailMessage();
			sm.setFrom("zubduma@gmail.com");
			sm.setTo("zubduma@gmail.com");
			sm.setSubject("texting mail");
			sm.setText("Account created click on <a href='http://localhost:4600/activate?"+us.getEmail()+"'>Click</a>");
			jms.send(sm);
			System.out.println("sending mail..");
		}catch(Exception e) {
			e.printStackTrace();
		}
		//return "{\"reg\":\"ok\"}";
		return us;
	}
	@DeleteMapping("/user/{id}")
	public void delete(@PathVariable int id) {
		ur.deleteById(id);
	}
	@PutMapping("/user")
	public User update(@RequestBody User usr) {
		User us = ur.save(usr);
		return us;
	}
	
	
	@RequestMapping(value="/reg",method= RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public String reg() {
		return "{\"reg\":\"ok\"}";
	}
	@RequestMapping(value="/activate",method= RequestMethod.PUT)
	public String activate(@RequestBody String email)
	{
		String str=email.substring(email.indexOf(":")+2,email.lastIndexOf("\""));
	    System.out.println("email ::"+str);
	    User u= ur.findByEmail(str);
    	System.out.println("uname :"+u.getUsername());
	    u.setActive("yes");   
	    User us = ur.save(u);
        //return us;
        return "{\"status\":\"ok\"}";
	}
}