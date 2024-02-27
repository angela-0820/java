
package universiteti;

import java.util.ArrayList;
import java.util.List;

/**
 * KLasa subject krijon nje subjekt per te perfaqesuar nje subjekt te Universitetit.
 * A subject should have the following information as instance variable:
 * id - unique - type int
 * name - type String
 * teacher - type Teacher A subject is taught by a teacher
 * student list - List<Student> A subject is followed by many students
 * @param <Teacher>
 */

public class Subject<Teacher> {
private static final List<Integer>SUBJECTIDLIST = new ArrayList<>();
private Integer id;
private String name;
private Teacher teacher;
private List<Student> studentList = new ArrayList<>();
/**
 * @param id
 * @param name
 * @param teacher
 * @param studentList
 */
public Subject(Integer id, String name) {
	setId(id);
	setName(name);

}
/**
 * @return the id
 */
public Integer getId() {
	return id;
}
/**
 * @param id the id to set
 * @param throw IllegalArgumentException
 */
public void setId(Integer id) {
	if(id <= 0 ) throw new IllegalArgumentException("Error, Id is negative");
	if(SUBJECTIDLIST.contains(id)) throw new IllegalArgumentException(" Error, subject ID  "+ id + " exists");
	else { // good to go 
		SUBJECTIDLIST.add(id);
	this.id = id;
	}
}
/**
 * @return the name
 */
public String getName() {
	return name;
}
/**
 * @param name the name to set
 */
public void setName(String name) {
	this.name = name;
}
/**
 * @return the teacher
 */
public Teacher getTeacher() {
	return teacher;
}
/**
 * @param teacher the teacher to set
 */
public void setTeacher(Teacher teacher) {
	this.teacher = teacher;
}
public void addStudent(Student student) {
	if(!Student.STUDENTIDLIST.contains(student.getId()))
		studentList.add(student);
}
/** Get students of the subject */
public List<Student> getStudents() {return studentList;}
@Override
public String toString() {
	// TODO Auto-generated method stub
	String output = String.format("Subject id: %d, Subject Name: %s\n, Teacher: %s\n", id, name, 
			((Student) this.getTeacher()).getName());
	output += "Subject followed by: \n";
	for(Student student:getStudents())
		output += "ID " + student.getId() + ", Name: "+ student.getName()+"\n";
	return output;
}


}
 