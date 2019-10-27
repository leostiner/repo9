package com.itheima.test;

import com.itheima.dao.UserDao;
import com.itheima.domain.User;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext_dao.xml")
public class MyBatisTest {

    @Autowired
    private UserDao userDao;


    public void test1() {
        User user = userDao.findById(1);
        System.out.println(user);
    }

    public void test2() {

        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext_dao.xml");
        UserDao dao = applicationContext.getBean(UserDao.class);
        User user = dao.findById(1);
        System.out.println(user);
    }

}
