/*package cn.wallance.dao;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import cn.wallance.domain.User;

@Repository("userDao")
public class UserDaoImpl extends SqlSessionDaoSupport implements IUserDao {
	
	
	@Resource
    public void setSuperSessionFactory(SqlSessionFactory sessionFactory){
    	this.setSqlSessionFactory(sessionFactory);
    }
	
	
	public List<User> selectAll() {
		// TODO Auto-generated method stub
		List<User> users = this.getSqlSession().selectList("cn.wallance.mapping.classMapper.getUser");
		return users;
	}

}*/