package com.zdnf.bbs.service;

import com.zdnf.bbs.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zdnf.bbs.dao.LoginDao;

/**
 * Created by ZDNF on 2017/5/7.
 */
@Service
public class LoginService {
    @Autowired
    LoginDao LoginDao;
    //用来添加用户即注册
    public void adduser(User user){LoginDao.adduser(user);}
    //返回用户密码
    public Boolean get_passwd(String name,String passwd){
        String real_passwd=LoginDao.get_passwd(name);
        if (real_passwd.equals(passwd)){return true;}
        return false;
    }
}
