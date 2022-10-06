package ar.com.cdt.scheduler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import ar.com.cdt.service.ProyectoService;

@Configuration
@EnableScheduling
public class Scheduler {

	@Autowired
	ProyectoService proyectoService;

	//todos los días a las 12
	// @Scheduled(cron = "0 0 0 * * ?")
	//cada 10 seg
	@Scheduled(cron = "*/10 * * * * *")
	public void scheduleFixedRateTask() {
		System.out.println(proyectoService.checkProyectosDates());
	}
}
