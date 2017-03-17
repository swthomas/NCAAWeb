package com.sd.ncaaweb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import data.College;
import data.CollegeDAO;

@Controller
@SessionAttributes({"collegeList", "college"})
public class CollegeController {
	@Autowired
	private CollegeDAO dao;

	@RequestMapping(path="GetColleges.do", method=RequestMethod.GET)
	public ModelAndView getAll(){
		ModelAndView mv = new ModelAndView();
	
	    List<College> colleges = dao.getAll();    
	    if(colleges.size()==0){
	    	mv.setViewName("error");
	    }
	    else{
	    	mv.setViewName("home");
	    	mv.addObject("collegeList", colleges);
	    }
	    return mv;
	}
	
	@RequestMapping(path="GetTeams.do", method=RequestMethod.GET)
	public ModelAndView getTeams(){
		System.out.println("get Teams");
		ModelAndView mv = new ModelAndView();
	
	    List<College> colleges = dao.getAll();    
	    if(colleges.size()==0){
	    	mv.setViewName("error");
	    }
	    else{
	    	mv.setViewName("allTeams");
	    	mv.addObject("collegeList", colleges);
	    }
	    return mv;
	}

	@RequestMapping(path="GetCollege.do", params="name", method=RequestMethod.GET)
	public ModelAndView getByName(@RequestParam("name") String n){
		ModelAndView mv = new ModelAndView();
	
	    College col = dao.getByName(n);
	    if(col == null){
	    	mv.setViewName("error");
	    }
	    else{
	    	mv.setViewName("result2");
	    	mv.addObject("college", col);
	    }
	    return mv;
	}
	
	@RequestMapping(path="GetColleges.do", params="conference", method=RequestMethod.GET)
	public ModelAndView getByConference(@RequestParam("conference") String n){
		ModelAndView mv = new ModelAndView();
	    List<College> colleges = dao.getByConference(n);
	    
	    if(colleges.size()==0){
	    	mv.setViewName("error");
	    }
	    else{
	    	mv.setViewName("conference");
	    	mv.addObject("collegeList", colleges);
	    	mv.addObject("conference", n);
	    }
	    return mv;
	}
	
	@RequestMapping(path="GetColleges.do", params="division", method=RequestMethod.GET)
	public ModelAndView getByDivision(@RequestParam("division") String n){
		ModelAndView mv = new ModelAndView();
	    List<College> colleges = dao.getByDivision(n);
	    
	    if(colleges.size()==0){
	    	mv.setViewName("error");
	    }
	    else{
	    	mv.setViewName("division");
	    	mv.addObject("collegeList", colleges);
	    	mv.addObject("division", n);
	    }
	    return mv;
	}
	
	@RequestMapping(path="addCollege.do", method=RequestMethod.POST)
	public ModelAndView addCollege(College c) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("result2");
		mv.addObject("college", dao.addCollege(c));
		return mv;
	}

	@RequestMapping(path="DeleteCollege.do", params="name", method=RequestMethod.POST)
	public ModelAndView deleteCollege(@RequestParam("name")String n, List<College> l) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("college", dao.deleteCollege(n, l));
		for (College college : l) {
			System.out.println(college);
		}
		mv.setViewName("result2");
		return mv;
	}
	
	@RequestMapping(path="EditCollege.do", method=RequestMethod.POST)
	public ModelAndView editCollege(College c) {
		dao.editCollege(c);
		ModelAndView mv = new ModelAndView();
		mv.addObject("college", dao.getByName(c.getName()));
		mv.setViewName("result2");
		return mv;
	}
	
	@RequestMapping(path="Next.do", method=RequestMethod.GET)
	public ModelAndView nextCollege(College college, List<College> l) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("college", dao.nextCollege(college.getName(), l));
		mv.setViewName("result2");
		return mv;
	}
	
	@RequestMapping(path="Back.do", method=RequestMethod.GET)
	public ModelAndView lastCollege(College college, List<College> l) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("college", dao.nextCollege(college.getName(), l));
		mv.setViewName("result2");
		return mv;
	}
	
}
