package com.deloitte.mma.dao;


import org.springframework.stereotype.Repository;

import com.deloitte.mma.model.Movie;

import org.springframework.data.repository.CrudRepository;

@Repository
public interface MovieDAO extends CrudRepository<Movie,Integer>  {

}
