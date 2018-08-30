package br.univille.ShrinersSantaCatarinaSystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import br.univille.ShrinersSantaCatarinaSystem.model.City;
import br.univille.ShrinersSantaCatarinaSystem.model.WorkflowStatus;
import br.univille.ShrinersSantaCatarinaSystem.model.WorkflowStep;
import br.univille.ShrinersSantaCatarinaSystem.repository.CityRepository;
import br.univille.ShrinersSantaCatarinaSystem.repository.WorkflowStepRepository;

@Component
public class EventListenerExampleBean {
	@Autowired
	private CityRepository cityRepository;
	@Autowired
	private WorkflowStepRepository workflowStepRepository;

	@EventListener
	public void onApplicationEvent(ContextRefreshedEvent event) {
		if(cityRepository.findByName("Joinville").isEmpty()) {

			City c1 = new City();
			c1.setName("Joinville");
			c1.setState("SC");
			cityRepository.save(c1);

			City c2 = new City();
			c2.setName("Curitiba");
			c2.setState("PR");
			cityRepository.save(c2);
		}

		if(workflowStepRepository.findByworkflowStatus(WorkflowStatus.NEWREQUEST).isEmpty()) {

			WorkflowStep step1 = new WorkflowStep(WorkflowStatus.NEWREQUEST,true,false,null);

			WorkflowStep step2 = new WorkflowStep(WorkflowStatus.LOCALSHRINERAVALIATION,false,false,step1);
			step1.getNextWorkflowSteps().add(step2);

			WorkflowStep step3 = new WorkflowStep(WorkflowStatus.LOCALCOMMUNITYSOLUTION,false,true,step2);
			step2.getNextWorkflowSteps().add(step3);

			WorkflowStep step4 = new WorkflowStep(WorkflowStatus.REJECTNOTIFICATION,false,true,step2);
			step2.getNextWorkflowSteps().add(step4);

			WorkflowStep step5 = new WorkflowStep(WorkflowStatus.LOCALCLUBAVALIATION,false,false,step2);
			step2.getNextWorkflowSteps().add(step5);

			WorkflowStep step6 = new WorkflowStep(WorkflowStatus.REJECTNOTIFICATION,false,true,step5);
			step5.getNextWorkflowSteps().add(step6);

			WorkflowStep step7 = new WorkflowStep(WorkflowStatus.LOCALCLUBSOLUTION,false,true,step5);
			step5.getNextWorkflowSteps().add(step7);

			WorkflowStep step8 = new WorkflowStep(WorkflowStatus.TEMPLEAVALIATION,false,false,step5);
			step5.getNextWorkflowSteps().add(step8);

			WorkflowStep step9 = new WorkflowStep(WorkflowStatus.REJECTNOTIFICATION,false,true,step8);
			step8.getNextWorkflowSteps().add(step9);

			WorkflowStep step10 = new WorkflowStep(WorkflowStatus.TEMPLESOLUTION,false,true,step8);
			step8.getNextWorkflowSteps().add(step10);

			WorkflowStep step11 = new WorkflowStep(WorkflowStatus.INTERNATIONALSHRINERAVALIATION,false,false,step8);
			step8.getNextWorkflowSteps().add(step11);

			WorkflowStep step12 = new WorkflowStep(WorkflowStatus.INTERNATIONALSHRINERSOLUTION,false,true,step11);
			step11.getNextWorkflowSteps().add(step12);

			WorkflowStep step13 = new WorkflowStep(WorkflowStatus.INTERNATIONALSHRINERPARTNERFORWARD,false,true,step11);
			step11.getNextWorkflowSteps().add(step13);

			WorkflowStep step14 = new WorkflowStep(WorkflowStatus.INTERNATIONALSHRINERCLUBNOTIFICATION,false,true,step11);
			step11.getNextWorkflowSteps().add(step14);

			workflowStepRepository.save(step1);
		}

	}
}