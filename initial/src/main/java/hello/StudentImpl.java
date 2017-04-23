package hello;

import java.util.List;
import java.util.ArrayList;

class StudentImpl implements IStudent {
	
	private List<Student> students;
	
	public StudentImpl() {
		students = new ArrayList<Student>();
		students.add(new Student(1, "Ashwin"));
		students.add(new Student(2, "Umang"));
		students.add(new Student(3, "Kishan"));
	}
	
	public int getCount() {
		return students.size();
	}
	public Student add(Student student) {
		students.add(new Student(student.getId(), student.getName()));
		return student;
	}
	public boolean update(Student student) {
		return true;
	}
	public boolean delete(Student student) {
		return students.remove(student);
	}
	public List<Student> getAll() {
		return students;
	}
	public Student getOne(int id) {
		return students.get(id - 1);
	}
}