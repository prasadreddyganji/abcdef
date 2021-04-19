package ilp1.services;

import static org.junit.Assert.*;
import ilp1.bean.User;
import ilp1.dao.UserDAO;
import org.junit.Test;

public class LoginTest {

	@Test
	public void test() {
		User usr = new User("Test1", "Test1");
		UserDAO dao = new UserDAO();
		boolean response;
		response = dao.validate(usr);
		assertEquals(true, response);
	}

}
