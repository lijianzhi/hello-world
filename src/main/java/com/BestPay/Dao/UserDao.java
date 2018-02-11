package com.BestPay.Dao;

import com.BestPay.entity.userEnity;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service("userDao")
public interface UserDao {
    public  List<userEnity> getAllUsers();
    public void delete(Integer id);
}
