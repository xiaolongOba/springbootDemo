package com.cdzg.demo_01;

import java.text.DateFormat;
import java.util.Date;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cdzg.demo_01.dao.UserDao;
import com.cdzg.demo_01.domain.User;

@RunWith(SpringJUnit4ClassRunner.class)
public class UserRespsitoryTest {
	@Autowired
	private UserDao userDao;

	@Test
	public void test() {
		Date date = new Date();
		DateFormat dateTimeInstance = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
		String format = dateTimeInstance.format(date);
		userDao.save(new User());
		Assert.assertEquals(format, userDao.findAll().get(0).getRegTime());
	}

}
