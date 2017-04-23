package hello;

import java.util.List;

interface IStudent {
	public int getCount();
	public Student add(Student student);
	public boolean update(Student student);
	public boolean delete(Student student);
	public List<Student> getAll();
	public Student getOne(int id);
}