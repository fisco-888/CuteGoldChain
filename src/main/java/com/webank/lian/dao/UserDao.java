package com.webank.lian.dao;

import com.webank.lian.domain.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

@org.apache.ibatis.annotations.Mapper
@Component
public interface UserDao {
	
	String TABLE_NAME = "user";
	
	@Select({"select * from", TABLE_NAME, "where name=#{name}"})
	User getUserByName(@Param("name") String name);
}
