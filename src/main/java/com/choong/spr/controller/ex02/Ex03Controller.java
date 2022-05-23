package com.choong.spr.controller.ex02;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.choong.spr.domain.ex02.Book;

//@Controller
//@ResponseBody
@RestController
@RequestMapping("ex03")
public class Ex03Controller {
	
	@RequestMapping("sub01")
	public String method01() {
		return "string data";
	}
	
	@RequestMapping("sub02")
	public Book method02() {
		Book b = new Book();
		b.setTitle("soccer");
		b.setWriter("jimin");
		
		return b;
	}
	
	@RequestMapping("sub03")
	public String method03() {
		System.out.println("ex03/sub03 일함!!");
		return "hello ajax";
	}
	
	@RequestMapping("sub04")
	public String method04() {
		System.out.println("ex03/sub04 일함!@!@!@!");
		return "hello ajax";
	}
	
	@GetMapping("sub05")
	public String method05() {
		System.out.println("ex03/sub05 일함!!");
		return "hello";
	}
	
	@PostMapping("sub06")
	public String method06() {
		System.out.println("ex03/sub06 일함@@");
		return "hello java";
	}
	
	@DeleteMapping("sub07")
	public String method07() {
		System.out.println("ex03/sub07 일함!@!@");
		return "hello delete";
	}
	
	@PutMapping("sub08")
	public String method08() {
		System.out.println("ex03/sub08 일함!@#!@#");
		return "hello put";
	}
	
	@GetMapping("sub09")
	public String method09(String title, String writer) {
		System.out.println("##받은 데이터");
		System.out.println("title:" + title);
		System.out.println("writer:" + writer);
		
		return null;
	}
	
	@PostMapping("sub10")
	public String method10(String name, String address) {
		System.out.println("name:" + name);
		System.out.println("address:" + address);
		return "Good~~~!!!";
	}
	
	@PostMapping("sub11")
	public String method11(Book b) {
		System.out.println(b);
		
		return null;
	}
	
	@PostMapping("sub12")
	public String method12() {
		System.out.println("12번째 메소드 일함");
		
		return "hi";
	}
	
	@GetMapping("sub13")
	public Integer method13() {
		return (int) (Math.random() * 45 + 1);
	}
	
	@GetMapping("sub14")
	public Book method14() {
		Book b = new Book();
		b.setTitle("스프링");
		b.setWriter("홍길동");
		
		return b;
	}
	
	@GetMapping("sub15")
	public Map<String, String> method15() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("name", "손흥민");
		map.put("age", "30");
		map.put("address", "seoul");
		
		return map;
	}
}
