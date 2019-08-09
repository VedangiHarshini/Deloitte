package com.deloitte.mma.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deloitte.mma.dao.MovieDAO;
import com.deloitte.mma.model.Movie;

@RestController
public class MovieAppController {
	
	

	@Autowired
	MovieDAO movieDAO;
	

	@RequestMapping("/watchMovie")
	public String watchMovie() {
			return "Watching movie";
		}
	
	@RequestMapping("/downloadMovie")
		public String downloadMovie() {
		Movie movie = new Movie(8,"Titanic","James",90000);
		movieDAO.save(movie);
		return "Movie is downloading";
		}

}
