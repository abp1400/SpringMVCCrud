package web;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import data.Shoe;
import data.ShoeDAO;

@SessionAttributes("modelShoe")
@Controller
public class ShoeController {

	@Autowired
	ShoeDAO dao;
	
	@ModelAttribute("modelShoe")
	public Shoe newShoe() {
		return new Shoe();
	}
//	@RequestMapping("info.do")
//	public ModelAndView getGiraffebyId(@RequestParam("id") Integer id) {
//		Giraffe best = dao.getGiraffeById(id);
//		ModelAndView mv = new ModelAndView("info");
//		mv.addObject("giraffe",best);
//		return mv;
//	}
//	@RequestMapping("delete.do")
//	public ModelAndView deleteGiraffebyId(@RequestParam("id") Integer id) {
//		ModelAndView mv = new ModelAndView("deleted");
//		Giraffe best = dao.getGiraffeById(id);
//		dao.deleteGiraffe(best);
//		mv.addObject("name",best.getName());
//		return mv;
//	}
//	@RequestMapping(path="update.do", params="id")
//	public ModelAndView updateGiraffebyId(@RequestParam("id") Integer id) {
//		ModelAndView mv = new ModelAndView("update");
//		Giraffe best = dao.getGiraffeById(id);
//		mv.addObject("giraffe",best);
//		return mv;
//	}
//	
//	public String home() {
//	
//		return "index";
//	}
	
	
	@RequestMapping(path="home.do",method=RequestMethod.GET)
	public ModelAndView homeWithValidation() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index");
		ShoeForm f = new ShoeForm();
		mv.addObject("idForm", f);
//		
//		List<Giraffe> allGiraffes = dao.getAllGiraffes();
//		mv.addObject("list",allGiraffes);
		return mv;
	}
//	
//	@RequestMapping(path="getGiraffe.do", method=RequestMethod.POST)
//	public ModelAndView getGiraffebyIdForm(@Valid @ModelAttribute("idForm")GiraffeIdForm f, Errors e) {
//		ModelAndView mv = new ModelAndView("index2");
//		if(e.hasErrors()) {
//			mv.setViewName("index2");
//			return mv;
//		}
//		mv.setViewName("info");
//		Giraffe best = dao.getGiraffeById(f.getId());
//		mv.addObject("giraffe",best);
//		return mv;
//	}
//	
//	@RequestMapping(path="add.do", method=RequestMethod.GET)
//	public String addGiraffe(Model m) {
//		Giraffe g = new Giraffe();
//		m.addAttribute("giraffe", g);
//		return "add";
//	}
//	@RequestMapping(path="addGiraffe.do", method=RequestMethod.POST)
//	public ModelAndView makeNewGiraffe(@Valid Giraffe giraffe, Errors e) {
//		ModelAndView mv = new ModelAndView();
//		if(e.hasErrors()) {
//			mv.setViewName("add");
//			return mv;
//		}
//		dao.addGiraffe(giraffe);
//		mv.setViewName("added");
//		return mv;
//		
//	}
//	@RequestMapping(path="updateGiraffe.do", method=RequestMethod.POST)
//	public ModelAndView makeUpdateGiraffe(@Valid Giraffe giraffe, Errors e) {
//		ModelAndView mv = new ModelAndView();
//		if(e.hasErrors()) {
//			mv.setViewName("update");
//			return mv;
//		}
//		dao.updateGiraffe(giraffe);
//		mv.setViewName("added");
//		return mv;
//		
	}
	