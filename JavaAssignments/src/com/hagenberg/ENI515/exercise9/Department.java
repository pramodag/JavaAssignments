package com.hagenberg.ENI515.exercise9;
import java.util.ArrayList;
import java.util.List;
public class Department {
	private List<Student> students;
	private List<Teacher> teachers;
	private List<Lecture> lectures;
	private String department;
	private final String NEWLINECHAR = System.getProperty("line.separator");

	public Department() {
		students = new ArrayList<Student>();
		teachers = new ArrayList<Teacher>();
		lectures = new ArrayList<Lecture>();
		department = null;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		if (students != null) {
			this.students = students;
		} else
			throw new IllegalArgumentException("Invalid students");
	}

	public List<Teacher> getTeachers() {
		return teachers;
	}

	public void setTeachers(List<Teacher> teachers) {
		if (teachers != null) {
			this.teachers = teachers;
		} else
			throw new IllegalArgumentException("Invalid teachers");
	}

	public List<Lecture> getLectures() {
		return lectures;
	}

	public void setLectures(List<Lecture> lectures) {
		if (lectures != null) {
			this.lectures = lectures;
		} else
			throw new IllegalArgumentException("Invalid lectures");
	}

	public void addStudent(Student student) {
		students.add(student);
	}

	public void addTeacher(Teacher teacher) {
		teachers.add(teacher);
	}

	public boolean removeTeacher(Teacher teacher) {
		return teachers.remove(teacher);
	}

	public boolean removeStudent(Student student) {
		return students.remove(student);
	}

	
	public void addLecture(Lecture lecture) {
		if (lecture != null)
			lectures.add(lecture);
		else
			throw new IllegalArgumentException("Invalid Lecture");
	}
	abstract public void sampleabstartc();

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("Department: " + department + NEWLINECHAR);
		sb.append("List of teachers" + NEWLINECHAR);
		sb.append(teachers.toString() + NEWLINECHAR);
		sb.append("Students:" + NEWLINECHAR);
		sb.append(students.toString() + NEWLINECHAR);
		sb.append("Lectures:" + NEWLINECHAR);
		sb.append(lectures.toString() + NEWLINECHAR);
		return sb.toString();
	}
}
