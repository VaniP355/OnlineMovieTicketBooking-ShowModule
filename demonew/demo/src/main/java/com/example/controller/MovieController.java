package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.MovieRepository;
import com.example.dao.ScreenRepository;
import com.example.dao.ShowRepository;
import com.example.dao.TheatreRepository;
import com.example.dto.Movie;
import com.example.dto.Screen;
import com.example.dto.Show;
import com.example.dto.Theatre;

@RestController
@CrossOrigin(origins = "*",allowedHeaders = "*")
public class MovieController {
@Autowired
TheatreRepository theatreRepository;
@Autowired
ScreenRepository screenRepository;
@Autowired
ShowRepository showRepository;
@Autowired
MovieRepository movieRepsitory;

@PostMapping("/addTheatre")
public List<Theatre> addTheatre(@RequestBody Theatre theatre1){
	System.out.println(theatre1.getTheatreName());
	System.out.println(theatre1.getTheatreId());
	System.out.println(theatre1.getTheatreLocation());

	Theatre theatre=new Theatre();
	 theatre.setTheatreName(theatre1.getTheatreName());
	 theatre.setTheatreLocation(theatre1.getTheatreLocation());
	 theatre.setContact(theatre1.getContact());
	 theatre.setCity(theatre1.getCity());
	 
	 List<Screen> screenList=new ArrayList<>();
	 System.out.println(theatre1.getTheatreId());
	 for(int i=1;i<=theatre1.getTheatreId();i++) {
		 Screen screen=new Screen();
		 screen.setScreenNo(i);
		 List<Show> showList=new ArrayList<>();
		 for(int j=1;j<=4;j++) {
			 if(j==1) {
		 Show show=new Show();
		    
		 show.setShowName("Morning Show");
			show.setShowTime("11:00AM");
			show.setScreen(screen);
			
			Movie movie1=new Movie();
			show.setMovie(movie1);
			movie1.setShow(show);
		     showList.add(show);	
			 }
			 else if(j==2) {
				 Show show=new Show();
				 show.setShowName("Afternoon Show");
					show.setShowTime("2:00PM");
					show.setScreen(screen);
					
					Movie movie1=new Movie();
					show.setMovie(movie1);
					movie1.setShow(show);
				     showList.add(show);	
			 }
			 else if(j==3) {
				 Show show=new Show();
				 show.setShowName("Evening Show");
					show.setShowTime("6:00PM");
					show.setScreen(screen);
					
					Movie movie1=new Movie();
					show.setMovie(movie1);
					movie1.setShow(show);
				     showList.add(show);	
			 }
			 else if(j==4) {
				 Show show=new Show();
				 show.setShowName("Last Show");
					show.setShowTime("9:30PM");
					show.setScreen(screen);
					
					Movie movie1=new Movie();
					show.setMovie(movie1);
					movie1.setShow(show);
				     showList.add(show);	
			 }
			 else
			 {
				 
			 }
		 }
		 screen.setShows(showList);
		 screen.setTheatre(theatre);
		 screenList.add(screen);
	 }
//	System.out.println("abc");
//	Screen screen1=new Screen();
//	screen1.setTheatre(theatre);
//	screen1.setScreenNo(1);
//	Show show1=new Show();
//	show1.setShowTime("11:00AM");
//	show1.setScreen(screen1);
//	
//	Show show2=new Show();
//	show2.setShowTime("2:00PM");
//	show2.setScreen(screen1);
//	
//	Movie movie1=new Movie();
//	show1.setMovie(movie1);
//	movie1.setShow(show1);
//	
//	Movie movie2=new Movie();
//	show2.setMovie(movie2);
//	movie2.setShow(show2);
//	
//	List<Show> showList=new ArrayList<>();
//     showList.add(show1);
//     showList.add(show2);
//     screen1.setShows(showList);
//     List<Screen> screenList=new ArrayList<>();
//     screenList.add(screen1);
//     theatre.setScreens(screenList);
	 theatre.setScreens(screenList);
     theatreRepository.save(theatre);
     return theatreRepository.findAll();
}

@DeleteMapping("/deleteTheatre/{theatreId}")
 public void deleteTheatre(@PathVariable int theatreId) {
	 theatreRepository.deleteById(theatreId);
 }
 
@GetMapping("/insertScreen/{theatreId}/{noOfScreens}")
public void addNewScreen(@PathVariable int theatreId,@PathVariable int noOfScreens) {
	Theatre theatre=theatreRepository.getOne(theatreId);
	List<Screen> screenList=theatre.getScreens();
	    
	    int size=        screenList.size();
	     
	
	 for(int i=size+1;i<=size+noOfScreens;i++) {
		 Screen screen=new Screen();
		 screen.setScreenNo(i);
		 List<Show> showList=new ArrayList<>();
		 for(int j=1;j<=4;j++) {
			 if(j==1) {
		 Show show=new Show();
		    
		 show.setShowName("Morning Show");
			show.setShowTime("11:00AM");
			show.setScreen(screen);
			
			Movie movie1=new Movie();
			show.setMovie(movie1);
			movie1.setShow(show);
		     showList.add(show);	
			 }
			 else if(j==2) {
				 Show show=new Show();
				 show.setShowName("Afternoon Show");
					show.setShowTime("2:00PM");
					show.setScreen(screen);
					
					Movie movie1=new Movie();
					show.setMovie(movie1);
					movie1.setShow(show);
				     showList.add(show);	
			 }
			 else if(j==3) {
				 Show show=new Show();
				 show.setShowName("Evening Show");
					show.setShowTime("6:00PM");
					show.setScreen(screen);
					
					Movie movie1=new Movie();
					show.setMovie(movie1);
					movie1.setShow(show);
				     showList.add(show);	
			 }
			 else if(j==4) {
				 Show show=new Show();
				 show.setShowName("Last Show");
					show.setShowTime("9:30PM");
					show.setScreen(screen);
					
					Movie movie1=new Movie();
					show.setMovie(movie1);
					movie1.setShow(show);
				     showList.add(show);	
			 }
			 else
			 {
				 
			 }
		 }
		 screen.setShows(showList);
		 screen.setTheatre(theatre);
		 screenList.add(screen);
	 }
	 theatre.setScreens(screenList);
	 theatreRepository.save(theatre);
}
@GetMapping("/getAllTheatres")
public List<Theatre> getAllTheatres(){
	return theatreRepository.findAll();
}

}
