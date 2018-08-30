package br.univille.ShrinersSantaCatarinaSystem.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.univille.ShrinersSantaCatarinaSystem.model.RequestForTreatment;
import br.univille.ShrinersSantaCatarinaSystem.model.StatusRequestChangeRegistry;
import br.univille.ShrinersSantaCatarinaSystem.repository.CityRepository;
import br.univille.ShrinersSantaCatarinaSystem.repository.RequestForTreatmentRepository;
import br.univille.ShrinersSantaCatarinaSystem.repository.StatusRequestChangeRegistryRepository;

@Controller
@RequestMapping("/statusrequestchangeregistry")
public class StatusRequestChangeRegistryController {
	@Autowired
	private RequestForTreatmentRepository requestForTreatmentRepository;
	@Autowired
	private CityRepository cityRepository;
	@Autowired
	private StatusRequestChangeRegistryRepository statusRequestChangeRegistryRepository;
	
	@Secured("ROLE_ADMIN")
	@GetMapping(value="/changestatus/{id}")
	public ModelAndView changeStatus(@PathVariable("id") RequestForTreatment req) {
		
		
		List<StatusRequestChangeRegistry> listStatusReq = this.statusRequestChangeRegistryRepository.findByrequest(req);
		StatusRequestChangeRegistry newStatusRequestChangeRegistry = new StatusRequestChangeRegistry();
		HashMap<String, Object> dados = new HashMap<String, Object>();
		dados.put("requestbase",req);
		dados.put("listStatusReq",listStatusReq);
		dados.put("statusRequestChangeRegistry",newStatusRequestChangeRegistry);
		
		
		return new ModelAndView("statusrequestchangeregistry/statuschange",dados);
	}
	@PostMapping(params="form")
	public ModelAndView saveStatusChange(@Valid StatusRequestChangeRegistry statusRequestChangeRegistry, BindingResult result, RedirectAttributes redirect) {
		
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		boolean hasUserRole = authentication.getAuthorities().stream()
		          .anyMatch(r -> r.getAuthority().equals("ADMIN"));
		
		if(!hasUserRole) {
			return new ModelAndView("redirect:/");
		}
		
		statusRequestChangeRegistry.setDateChange(new Date());
		statusRequestChangeRegistry = this.statusRequestChangeRegistryRepository.save(statusRequestChangeRegistry);
		
		RequestForTreatment request = statusRequestChangeRegistry.getRequest();
		request.setWorkflowStep(statusRequestChangeRegistry.getWorkflowStep());
		this.requestForTreatmentRepository.save(request);
		
		return new ModelAndView("redirect:/statusrequestchangeregistry/changestatus/" + statusRequestChangeRegistry.getRequest().getId());
	}
}
