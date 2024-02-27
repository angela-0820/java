package universiteti;

import java.util.ArrayList;
import java.util.List;

/**
 * Klasa Student perfaqeson nje student te Universitetit.
 * A student should have the following information as instance variable:
 * id - unique - type int
 * name - type String
 * fees paid - type double
 * add a method payFee to use for payment registration
 */
public class Student {
private int id;
private String name;
private Double feesPaid = 0.0; 
static final List<Integer> STUDENTIDLIST = new ArrayList<>();
 
 public Student(int id, String name)   {
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
 * @throws IllegalArgumentException   
 */
public void setId(Integer id) throws IllegalArgumentException  {
	if(id <= 0 ) throw new IllegalArgumentException("Error, Id is negative");
	if(STUDENTIDLIST.contains(id)) throw new IllegalArgumentException(" Error, ID "+ id + " exists");
	else {//good to go
		STUDENTIDLIST.add(id);
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
 * @return the feesPaid
 */
public Double getFeesPaid() {
	return feesPaid;
}
/**
 * @param i the feesPaid to set
 */
public void payFee(double i) {
	this.feesPaid += i;
}
/**
 * @param id
 * @param name
 * @param feesPaid
 * @throws IllegalAccessException 
 */

@Override
public String toString() {
	// TODO Auto-generated method stub
	return String.format("Id: %d, Name: %s Total  FeesPaid: %.2f ", id, name, feesPaid);
}




}
