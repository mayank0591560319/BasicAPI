package com.Mayank.MMI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Mayank.MMI.entity.course;
import com.Mayank.MMI.services.CourseService;

@RestController

public class MyController {
	@ Autowired
	private CourseService courseservice;
	@GetMapping("/course")
 public String resident() {
	return "Welcome to courses";
}
	//get the courses
	@GetMapping("/courses")
	public List<course> getCourses(){
		return this.courseservice.getCourses();
	}
	@GetMapping("/courses/{courseId}")
	public course getCourse(@PathVariable String courseId) {
		return this.courseservice.getCourse(Long.parseLong(courseId));
	}
	@ PostMapping(path="/courses")
	public course addCourse( @ RequestBody course Course) {
		return this.courseservice.addCourse(Course);
	}
}
