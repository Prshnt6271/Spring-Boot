package com.Springbootcurd.MobRepo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.Springbootcurd.MobEntity.Mobile;



public interface MobRepos extends CrudRepository<Mobile, Integer >{
	
	
}