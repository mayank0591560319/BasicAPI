package com.Mayank.MMI.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.Mayank.MMI.entity.course;
@ Service
public class CourseServiceImpl implements CourseService {

	List<course>list;
	public CourseServiceImpl() {
		list=new ArrayList<>();
		list.add(new course(145,"Java Core Course","this course contains basics of Java"));
		list.add(new course(147,"DSA","this course contains basics of Data Structure and Algorithm"));
	}
	@Override
	public List<course> getCourses() {
		// TODO Auto-generated method stub
		return list;
	}
@Override
public course getCourse(long courseId) {
	course c=null;
	for(course course:list) {
		if(course.getId()==courseId) {
			c=course;
			break;
		}
	}
	return c;
}
@ Override
public course addCourse(course Course) {
	list.add(Course);
	return Course;
}
}
