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
	@RequestMapping("info.do")
	public ModelAndView getGiraffebyIndex(@RequestParam("id") Integer index) {
		Shoe s = dao.getShoeByIndex(index);
		ModelAndView mv = new ModelAndView("info");
		mv.addObject("shoe",s);
		return mv;
	}
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
		ShoeIdForm f = new ShoeIdForm();
		mv.addObject("idForm", f);
//		
		List<Shoe> allShoes = dao.getAllShoes();
		mv.addObject("list",allShoes);
		return mv;
	}
//	
	@RequestMapping(path="getShoe.do", method=RequestMethod.POST)
	public ModelAndView getShoeByBrand(@Valid @ModelAttribute("idForm") ShoeIdForm f, Errors e) {
		ModelAndView mv = new ModelAndView("index");
		if(e.hasErrors()) {
			mv.setViewName("index");
			return mv;
		}
		mv.setViewName("info2");
		List<Shoe> l = dao.getShoeByBrand(f.getBrand());
		mv.addObject("shoes",l);
		return mv;
	}
	
	@RequestMapping(path="selectAlt.do", method=RequestMethod.POST,params="brand")
	public ModelAndView getShoeByBrandAlt(@RequestParam(name="brand") String s) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("info2");
		List<Shoe> l = dao.getShoeByBrand(s);
		mv.addObject("shoes",l);
		return mv;
	}
//	
	@RequestMapping(path="add.do", method=RequestMethod.GET)
	public String addShoe(Model m) {
		Shoe s = new Shoe();
		m.addAttribute("shoe", s);
		return "add";
	}
@RequestMapping(path="addShoe.do", method=RequestMethod.POST)
public ModelAndView makeNewShoe(@Valid Shoe shoe, Errors e) {
	ModelAndView mv = new ModelAndView();
	if(e.hasErrors()) {
		mv.setViewName("add");
		return mv;
		}
		dao.addShoe(shoe);
		mv.setViewName("added");
		return mv;
		
	}
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
	