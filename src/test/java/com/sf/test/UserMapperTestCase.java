package com.sf.test;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.sf.mapper.UserMapper;
import com.sf.model.User;
import com.sf.model.UserExample;

public class UserMapperTestCase extends AbstractBaseTestCase {
  @Autowired
  UserMapper userMapper;

  @Test
  @Transactional("transactionManager")
  public void testInsert() {
    User user = new User();
    user.setUsername("heiheihei");
    userMapper.insert(user);

  }

  @Test
  public void testSelect() {
    UserExample example = new UserExample();
    example.createCriteria().andUsernameEqualTo("sfsafs");
    List<User> users = userMapper.selectByExample(example);
    System.out.println(users);
  }
}
