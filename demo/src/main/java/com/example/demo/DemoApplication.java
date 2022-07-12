package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	} //grazie alla chiamata della classe eseguita dal metodo, il programma riesce a ricavare le informazioni
	// che gli servono per eseguire l'applicazione(BOOTSTRAP). Un pò come l'avvio del sistema operativo.

}
