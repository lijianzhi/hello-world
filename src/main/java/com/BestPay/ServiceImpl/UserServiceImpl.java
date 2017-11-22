package com.BestPay.ServiceImpl;

import com.BestPay.Dao.UserDao;
import com.BestPay.Service.UserService;
import com.BestPay.entity.userEnity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service("userService")
public class UserServiceImpl implements UserService {
@Autowired
   UserDao userDao;
  @Transactional
    public List<userEnity> getAllUsers() {
        return userDao.getAllUsers();
    }

    public void delete(Integer id) {
         userDao.delete(id);
    }

}
