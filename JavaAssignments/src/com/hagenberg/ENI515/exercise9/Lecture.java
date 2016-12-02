package com.hagenberg.ENI515.exercise9;
import java.util.ArrayList;
import java.util.List;
public class Lecture {
	private Teacher teacher;
	private List<Student> students;
	private String lectureName;
	private final String NEWLINECHAR = System.getProperty("line.separator");

	public Lecture() {
		this(null, new ArrayList<Student>(), null);
	}

	public Lecture(Teacher teacher, List<Student> students, String className) {
		this.teacher = teacher;
		this.students = students;
		this.lectureName = className;
	}

	public String getLectureName() {
		return lectureName;
	}

	public void setLectureName(String lectureName) {
		this.lectureName = lectureName;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public void addStudent(Student student) {
		if (student != null)
			students.add(student);
		else
			throw new IllegalArgumentException(
					"Can not add a null student object");
	}

	public boolean removeStudent(Student student) {
		if (!students.contains(student)) {
			return false;
		}
		return students.remove(student);
	}

	public boolean changeTeacher(Teacher teacher) {
		if (teacher != null) {
			this.teacher = teacher;
			return true;
		}
		return false;
	}

	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("-----------------" + NEWLINECHAR);
		sb.append("Lecture Name: " + lectureName + NEWLINECHAR);
		sb.append("Teacher: " + teacher.toString() + NEWLINECHAR);
		sb.append("Students: " + NEWLINECHAR);
		sb.append(students.toString() + NEWLINECHAR);
		sb.append("-----------------" + NEWLINECHAR);
		return sb.toString();
	}

	public boolean equals(Object o) {
		if (o instanceof Lecture) {
			return false;
		}
		Lecture lect = (Lecture) o;
		return lectureName.equalsIgnoreCase(lect.getLectureName());
	}
}
