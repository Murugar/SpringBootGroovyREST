package com.iqmsoft.boot.groovy

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration

import com.iqmsoft.boot.groovy.SpringRESTGroovyApplication;


@SpringBootApplication(exclude = SecurityAutoConfiguration)
class SpringRESTGroovyApplication {

   
	static void main(String[] args) {
		SpringApplication.run(SpringRESTGroovyApplication, args)
	}
}
