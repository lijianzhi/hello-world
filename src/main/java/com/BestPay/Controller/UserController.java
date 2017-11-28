
package com.BestPay.Controller;

import com.BestPay.Service.UserService;
import com.BestPay.entity.userEnity;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

    @Controller
    public class UserController {
        @Autowired
        private UserService userService;

        public UserController() {
        }

        @RequestMapping(
                value = {"/"},
                method = {RequestMethod.GET}
        )
        public String getUsers(ModelMap map) {
            List<userEnity> userEnityList = this.userService.getAllUsers();
            map.addAttribute("userList", userEnityList);
            return "users";
        }

        @RequestMapping(
                value = {"admin/users/delete/{userID}"},
                method = {RequestMethod.GET}
        )
        public String deleteuser(@PathVariable("userID") Integer id) {
            this.userService.delete(id);
            return "redirect:/";
        }
    }


