package sjc.app.web.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import sjc.app.repository.entity.User;
import sjc.app.service.UserService;
import sjc.app.web.IUserService;
import sjc.app.web.impl.UserServiceImpl;

@Component("userServiceComponent")
public class UserServiceImpl implements IUserService{
	
	@Autowired
	private UserService userService;
	

	@Override
	public List<User> getAllUser() {
		List<User> users=userService.getAllUsers();
		System.out.println(users.get(0).getName());
		return users;
	}

	
}
