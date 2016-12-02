package com.hagenberg.ENI515.exercise9.test;
import org.junit.Test;
import static org.junit.Assert.*;

import com.hagenberg.ENI515.exercise9.Department;
import com.hagenberg.ENI515.exercise9.Lecture;
import com.hagenberg.ENI515.exercise9.Student;
import com.hagenberg.ENI515.exercise9.Teacher;
public class TestClass {
	@Test
	public void testTeachers() {
		Department department = new Department();
		department.addTeacher(new Teacher("Selinger", 40, "Java"));
		assertTrue("[Selinger]".equals(department.getTeachers().toString()));
		department.addTeacher(new Teacher("Fredil", 40, "Energy"));
		assertTrue("[Selinger, Fredil]".equals(department.getTeachers().toString()));
		department.addTeacher(new Teacher("Aur", 30, "Process"));
		assertTrue("[Selinger, Fredil, Aur]".equals(department.getTeachers().toString()));
		assertFalse(department.removeTeacher(new Teacher("Pramod", 25, "ENI")));
		assertTrue(department.removeTeacher(new Teacher("Selinger", 55, "Advane java")));
	}
	@Test
	public void testStudents() {
		Department department = new Department();
		department.addStudent(new Student("Pramod",25,"ENI",1));
		assertTrue("[Pramod]".equals(department.getStudents().toString()));
		department.addStudent(new Student("Ben", 25, "ENI",1));
		assertTrue("[Pramod, Ben]".equals(department.getStudents().toString()));
		department.addStudent(new Student("Sam", 25, "ENI",1));
		assertTrue("[Pramod, Ben, Sam]".equals(department.getStudents().toString()));
		assertFalse(department.removeStudent(new Student("Pramod1", 25, "ENI",2)));
		assertTrue(department.removeStudent(new Student("Pramod", 55, "Advane java",2)));
	}
	@Test
	public void testLectures(){
		Lecture l1=new Lecture();
		Department dept=new Department();
		l1.setTeacher(new Teacher("Johannes Sametinger", 30, "Advanced Java"));
		l1.setLectureName("ENI 515 Advanced Java");
		l1.addStudent(new Student("Pramod", 25, "EN", 1));
		l1.addStudent(new Student("Ben", 25, "ENI", 1));
		l1.addStudent(new Student("Sam", 25, "ENI", 1));
		l1.addStudent(new Student("Johans", 25, "ENI", 1));
		dept.addLecture(l1);
		assertTrue(1==dept.getLectures().size());
		Lecture l2=new Lecture();
		l2.setTeacher(new Teacher("Stephan Selinger", 30, "System enginering"));
		l2.setLectureName("ENI 404 System engineering");
		l2.addStudent(new Student("Pramod", 25, "EN", 1));
		l2.addStudent(new Student("Ben", 25, "ENI", 1));
		l2.addStudent(new Student("Sam", 25, "ENI", 1));
		l2.addStudent(new Student("Johans", 25, "ENI", 1));
		dept.addLecture(l2);
		assertTrue(2==dept.getLectures().size());
		Lecture l3=new Lecture();
		l3.setLectureName("Process and process modelling");
		assertFalse(dept.getLectures().remove(l3));
		System.out.println(dept.getLectures());
		System.out.println(dept.getLectures().remove(l2));
		assertTrue(dept.getLectures().remove(l2));
	}
}
