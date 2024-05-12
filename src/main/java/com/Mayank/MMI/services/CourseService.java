package com.Mayank.MMI.services;

import java.util.List;

import com.Mayank.MMI.entity.course;

public interface CourseService {

public List<course>getCourses();
public course getCourse(long courseId);
public course addCourse(course Course);
}