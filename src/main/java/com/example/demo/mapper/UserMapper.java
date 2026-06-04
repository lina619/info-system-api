package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.demo.entity.User;

@Mapper
public interface  UserMapper {

	@Select("SELECT * FROM sys_user order by id")
	List<User> findAll();
	
	@Insert("""
	        insert into sys_user(
	            username,
	            create_time
	        )
	        values(
	            #{username},
	            now()
	        )
	    """)
	    int add(User user);
	
	@Delete("""
		    delete from sys_user
		    where id = #{id}
		""")
		int delete(Long id);
	
	@Update("""
		    update sys_user
		    set username = #{username},
		    where id = #{id}
		""")
		int update(User user);
	
	@Select("""
		    select *
		    from sys_user
		    where username like concat('%',#{username},'%')
		""")
		List<User> search(String username);
}
