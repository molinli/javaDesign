package com.imooc.mvcdemo.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.imooc.mvcdemo.model.Chapter;
import com.imooc.mvcdemo.model.Course;
import com.imooc.mvcdemo.service.CourseService;


@Service("courseService")
public class CourseServiceImpl implements CourseService {

	public Course getCoursebyId(Integer courseId) {
		
		Course course = new Course();
		
		course.setCourseId(courseId);
		course.setTitle("数据挖掘");
		course.setImgPath("resources/imgs/course-img.jpg");
		course.setLearningNum(12345);
		course.setLevel(2);
		course.setLevelDesc("中级");
		course.setDuration(7200l);
		course.setDescr("数据挖掘是日常开发中的常用知识，也是难用知识。bala bala...");
		
		List<Chapter> chapterList = new ArrayList<Chapter>();
		
		warpChapterList(courseId,chapterList);
		
		course.setChapterList(chapterList);
		
		return course;
	}

	private void warpChapterList(Integer courseId,List<Chapter> chapterList) {
		Chapter chapter = new Chapter();
		chapter.setId(1);
		chapter.setCourseId(courseId);
		chapter.setOrder(1);
		chapter.setTitle("第1章 数据挖掘背景知识介绍");
		chapter.setDescr("本章将介绍与数据挖掘编程相关的背景概念");	
		chapterList.add(chapter);
		
		chapter = new Chapter();
		chapter.setId(2);
		chapter.setCourseId(courseId);
		chapter.setOrder(2);
		chapter.setTitle("第2章 数据挖掘初体验");
		chapter.setDescr("数据挖掘");
		chapterList.add(chapter);
		
		chapter = new Chapter();
		chapter.setId(3);
		chapter.setCourseId(courseId);
		chapter.setOrder(3);
		chapter.setTitle("第3章 数据挖掘的正确停止");
		chapter.setDescr("数据挖掘");		
		chapterList.add(chapter);
		
		chapter = new Chapter();
		chapter.setId(4);
		chapter.setCourseId(courseId);
		chapter.setOrder(4);
		chapter.setTitle("第4章 数据挖掘交互");
		chapter.setDescr("数据挖掘");		
		chapterList.add(chapter);
		
		chapter = new Chapter();
		chapter.setId(5);
		chapter.setCourseId(courseId);
		chapter.setOrder(5);
		chapter.setTitle("第5章 数据挖掘进阶展望");
		chapter.setDescr("简单介绍 数据挖掘编程模型。");		
		chapterList.add(chapter);
		
	}




}
