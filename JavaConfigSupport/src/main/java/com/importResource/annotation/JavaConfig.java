package com.importResource.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan(basePackages = {"com.importResource.annotation"})
@ImportResource("classpath:Application-context.xml")
public class JavaConfig {
	@Bean
	public Remoto remoto(Television television,Antino antino) {
		Remoto remoto=new Remoto();
		//remoto.onChannel();
		remoto.setTelevision(television);
		return remoto;
	}
}
