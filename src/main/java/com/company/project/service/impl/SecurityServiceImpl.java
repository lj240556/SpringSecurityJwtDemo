package com.company.project.service.impl;

import com.company.project.dao.PlatformUserMapper;
import com.company.project.model.PlatformUser;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class SecurityServiceImpl {

    @Resource
    private PlatformUserMapper platformUserMapper;

    /**
     * 通过phoneNumber来查询
     * @param phone
     * @return
     * @throws UsernameNotFoundException
     */
    public UserDetails myloadUserByPhoneNumber(String phone) throws UsernameNotFoundException {
        PlatformUser platformUser=new PlatformUser();
        // userTab1.setUsername(username);
        platformUser.setPhone(phone);
        PlatformUser platformUser2=platformUserMapper.selectOne(platformUser);
        if (platformUser2==null){
            return null;
        }
        //从数据库读取权限信息（"add,delete,query,update"）
        String userpermission=platformUser2.getPermission();
        //将数组转换成集合
        if (userpermission.contains(",")) {
            List<String> permissiontList = new ArrayList<>(Arrays.asList(userpermission.split(",")));
            UserDetails user=new User(phone,platformUser2.getPasswd(),getAuthority(permissiontList));
            return user;
        }
        //不包含 就表示为空
        List<String> permissiontList = new ArrayList<>();
        permissiontList.add("test");
        UserDetails user=new User(phone,platformUser2.getPasswd(),getAuthority(permissiontList));
        return user;
    }

    /**
     * 通过用户名来查询
     * @param username
     * @return
     * @throws UsernameNotFoundException
     */
    public UserDetails myloadUserByUsername(String username) throws UsernameNotFoundException {
        PlatformUser platformUser=new PlatformUser();
        platformUser.setUsername(username);
       // userTab1.setUsername(username);
        PlatformUser platformUser2=platformUserMapper.selectOne(platformUser);
        if (platformUser2==null){
            return null;
        }
        //从数据库读取权限信息（"add,delete,query,updata"）
        //userpermission="add,delete,query,updata"
        String userpermission=platformUser2.getPermission();
        //将数组转换成集合
        List<String> permissiontList= new ArrayList<>(Arrays.asList(userpermission.split(",")));
        UserDetails user=new User(username,platformUser2.getPasswd(),getAuthority(permissiontList));
        return user;
    }

    //作用就是返回一个List集合，集合中装入的是角色描述
    public List<SimpleGrantedAuthority> getAuthority(List<String> roles) {
        List<SimpleGrantedAuthority> list = new ArrayList<>();
        for (String role : roles) {
            list.add(new SimpleGrantedAuthority(role));
        }
        return list;
    }
}
