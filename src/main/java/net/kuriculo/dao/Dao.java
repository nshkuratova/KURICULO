package net.kuriculo.dao;

import java.util.List;

import net.kuriculo.entity.Entity;


public interface Dao<T extends Entity, I>
{

	List<T> findAll();


	T find(I id);


	T save(T newsEntry);


	void delete(I id);

}