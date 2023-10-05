package com.example11.amdocs;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demo12 {
	@GetMapping("/get")
	public String show() {

String s="Welcome jenkins and docker...";
return s + "ID : 12890";
}
}
