package com.BestPay.Service;

import com.BestPay.entity.userEnity;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

public interface UserService {

    @Transactional
    public  List<userEnity> getAllUsers();
    public  void delete(Integer id);
}
