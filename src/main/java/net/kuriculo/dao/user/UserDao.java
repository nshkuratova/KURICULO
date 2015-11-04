package net.kuriculo.dao.user;

import net.kuriculo.dao.Dao;
import net.kuriculo.entity.User;

import org.springframework.security.core.userdetails.UserDetailsService;


public interface UserDao extends Dao<User, Long>, UserDetailsService
{

	User findByName(String name);

}