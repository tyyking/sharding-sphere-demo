package com.szss.shardingjdbc.demo.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.szss.shardingjdbc.demo.MybatisRwApplication;
import com.szss.shardingjdbc.demo.dao.UserDAO;
import com.szss.shardingjdbc.demo.domain.UserDO;

import lombok.extern.slf4j.Slf4j;

/**
 * @author 鼠笑天
 * @date 2018/8/5
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes = MybatisRwApplication.class)
public class MybatisRwUserServiceTest {

    @Autowired
    private UserService userService;

    @Autowired
    private UserDAO userDAO;

    @Test
    public void testInsertUser() {
        for (long i = 0; i < 10; i++) {
            UserDO userDO = new UserDO();
            userDO.setUsername("zcg");
            userDO.setPassword("123456");
            userDAO.insertUser(userDO);
            log.debug("user id:{}", userDO.getUserId());
        }
    }

    @Test
    public void testFindByid() {
        UserDO userDO = userDAO.findById(234346881143013376L);
        log.debug("user:{}}", userDO);

    }
}