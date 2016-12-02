package com.hagenberg.ENI515.exercise9.test;

import com.hagenberg.ENI515.exercise9.Lecture;
import com.hagenberg.ENI515.exercise9.Student;
import com.hagenberg.ENI515.exercise9.Teacher;

public class TestLecture {
	public static void main(String[] args) {
		Lecture lecture=new Lecture();
		lecture.setLectureName("ENI 515: Java");
		lecture.addStudent(new Student("Pramod", 25, "ENI", 1));
		lecture.addStudent(new Student("Pramod1", 26, "ENI", 2));
		lecture.setTeacher(new Teacher("Person1",35,"Java"));
		System.out.println(lecture);
		System.out.println(lecture.removeStudent(new Student("Pramod1",20,"ENI",2)));
		System.out.println(lecture);
	}
}
