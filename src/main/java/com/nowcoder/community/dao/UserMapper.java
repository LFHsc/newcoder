package com.nowcoder.community.dao;

import com.nowcoder.community.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    User selectById(int id);

    User selectByName(String username);

    User selectByEmail(String email);

    int insertByUser(User user);

    int updateByStatus(int id,int status);

    int updateByHeader(int id,String headerUrl);

    int updateByPassword(int id, String password);


}
