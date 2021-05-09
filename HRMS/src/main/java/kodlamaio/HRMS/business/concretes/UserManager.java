package kodlamaio.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.HRMS.business.abstracts.UserService;
import kodlamaio.HRMS.dataAccess.abstracts.UserDao;
import kodlamaio.HRMS.entities.concretes.User;

@Service
public class UserManager implements UserService {
	
	@Autowired
	private UserDao userDao;
	
	public UserManager() {}

	@Override
	public List<User> getAll() {
		return userDao.findAll();
	}

}
