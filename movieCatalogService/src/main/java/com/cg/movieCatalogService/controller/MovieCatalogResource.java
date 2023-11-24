package com.cg.movieCatalogService.controller;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.cg.movieCatalogService.models.CatalogItem;
import com.cg.movieCatalogService.models.Movie;
import com.cg.movieCatalogService.models.UserRating;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {
	
	 	@Autowired
	    private RestTemplate restTemplate;

	    @Autowired
	    private WebClient.Builder webClientBuilder;
	    
	    @RequestMapping("/{userId}")
	    public UserRating getCatalog(@PathVariable("userId") String userId) {
	        UserRating userRating = restTemplate.getForObject("http://rating-data-service/ratingsdata/user/" + userId, UserRating.class); //parameters (url ,type we want to cast into)
	        return userRating;
	    }

//	    @RequestMapping("/{userId}")
//	    public List<CatalogItem> getCatalog(@PathVariable("userId") String userId) {
//
//	        UserRating userRating = restTemplate.getForObject("http://rating-data-service/ratingsdata/user/" + userId, UserRating.class); //parameters (url ,type we want to cast into)
//
//	       return userRating.getRatings().stream()
//	                .map(rating -> {
//	                	//For each movie ID, call movie info service and get details 
//	                    Movie movie = restTemplate.getForObject("http://movie-info-service/movies" + rating.getMovieId(),Movie.class);
//	                    //Put them all together
//	                    return new CatalogItem(movie.getName(), "Desc", rating.getRating());
//	                })
//	                .collect(Collectors.toList()); //movie.getDescription()
//	                
//	    }
	    
	    

}
