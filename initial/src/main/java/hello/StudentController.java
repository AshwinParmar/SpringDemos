package hello;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
 
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@RestController
public class StudentController {

	private StudentImpl studentImpl = new StudentImpl();

    @RequestMapping(value="/student", method=RequestMethod.GET)
	@ResponseBody
    public List<Student> students() {
        return studentImpl.getAll();
    }
	
	@RequestMapping(value="/student/count", method=RequestMethod.GET)
	@ResponseBody
    public int studentsCount() {
        return studentImpl.getCount();
    }
	
	@RequestMapping(value="/student/{studentId}")
	@ResponseBody
	public Student getOne(@PathVariable("studentId") int id) {
		return studentImpl.getOne(id);
	}
	
	@RequestMapping(value="/student/add", method=RequestMethod.POST, consumes="application/json")
	@ResponseBody
	public Student add(Student student) {
		studentImpl.add(student);
		return student;
	}
	
	@RequestMapping("*")
	@ResponseBody
	public String fallbackMethod(){
		return "fallback method";
	}
}