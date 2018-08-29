package br.univille.ShrinersSantaCatarinaSystem.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.univille.ShrinersSantaCatarinaSystem.model.City;
import br.univille.ShrinersSantaCatarinaSystem.model.RequestForTreatment;
import br.univille.ShrinersSantaCatarinaSystem.repository.CityRepository;
import br.univille.ShrinersSantaCatarinaSystem.repository.RequestForTreatmentRepository;

@Controller
@RequestMapping("/requestfortreatment")
public class RequestForTreatmentController {
	@Autowired
	private RequestForTreatmentRepository requestForTreatmentRepository;
	@Autowired
	private CityRepository cityRepository;
	
	@RequestMapping("/new")
	public ModelAndView newrequestfortreatment() {
		RequestForTreatment req = new RequestForTreatment();
		List<City> listCity = cityRepository.findAll();
		HashMap<String, Object> dados = new HashMap<String, Object>();
		dados.put("request",req);
		dados.put("listcity",listCity);
		
		return new ModelAndView("requestfortreatment/form",dados);
	}
	
	@PostMapping(params="form")
	public ModelAndView save(@Valid RequestForTreatment request, BindingResult result, RedirectAttributes redirect) {
		request.setRequestDate(new Date());
		request = this.requestForTreatmentRepository.save(request);
		return new ModelAndView("redirect:/");
	}
	
}
