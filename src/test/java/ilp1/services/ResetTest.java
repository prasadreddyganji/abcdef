package ilp1.services;

import static org.junit.Assert.*;

import org.junit.Test;

import ilp1.bean.User;
import ilp1.dao.UserDAO;

public class ResetTest {

	@Test
	public void test() {
		
		User usr = new User("Test1", "Test1");
		UserDAO dao = new UserDAO();
		boolean response=dao.resetUser(usr);
		assertEquals(true, response);
	}

}
