package edu.mum.cs.cs425.MyProductsMgmtWebApp.config;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

import edu.mum.cs.cs425.MyProductsMgmtWebApp.MyProductsMgmtWebAppApplication;



public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(MyProductsMgmtWebAppApplication.class);
	}

}