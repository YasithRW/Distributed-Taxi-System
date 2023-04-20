package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.net.UnknownHostException;
import java.util.ArrayList;


@SpringBootApplication()
public class DemoApplication {

	public static void main(String[] args) throws UnknownHostException {
		SpringApplication.run(DemoApplication.class, args);

		InetAddress ip = InetAddress.getLocalHost();
		String hostname = ip.getHostName();

		System.out.println("Hostname: " + hostname);
		System.out.println("IP Address: " + ip.getHostAddress());

	}


}
