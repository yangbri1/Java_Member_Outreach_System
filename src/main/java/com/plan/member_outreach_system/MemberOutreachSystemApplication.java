package com.plan.member_outreach_system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MemberOutreachSystemApplication {

	public static void main(String[] args) {
		/* 'SpringApplication.run()' bootstraps the application & launches the Spring container */
		// 1. creates an ApplicationContext -- initializes central container which manages all application beans
		// 2. scans components -- scans classpath for classes annotated w/ '@Component', '@Service', or '@Controller'
		// 3. applies auto-configuration -- automatically configures beans based on classpath & properties (ex. starting an embedded web server if web starter present)
		// 4. loads env -- processes 'application.properties' & CL args

		/*--- 'SpringApplication.run()' instance --- customize settings (ex. disabling banner) & static 'run()' method acts as entry pt for starting SB app */
		SpringApplication.run(MemberOutreachSystemApplication.class, args);
	}

}
