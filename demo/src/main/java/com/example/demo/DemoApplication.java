package com.example.demo;


//import com.example.demo.entity.Dep;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@ComponentScan({"com.example.demo.*"})
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
//	public List<Dep> getDep() {
////		List<Dep> obj = new ArrayList<>();
//
//
//            return List.of(
//                    new Dep(1L, "abc","abc123@gmail.com" ,"abc")
//
//            );
	}



