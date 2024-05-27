package universiteti;

import java.util.ArrayList;
import java.util.List;

/**
 * Klasa Teacher perdoret per te krijuar nje teacher te Universitetit A Teacher
 * has the following information as instance variables: id – unique – type int
 * name – type String salary – type double
 */
public class Teacher {
	private int id;
	private String name;
	private double salary;
	// Teacher's ID list should hold unique values
	static final List<Integer> TEACHERIDLIST = new ArrayList<>();

	public Teacher(Integer id, String name, double salary) {
		setId(id);
		setName(name);
		setSalary(salary);
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 * @throw IllegalArgumentException when ID <= 0 or ID exists
	 */
	public void setId(int id) {
		if (id <= 0)
			throw new IllegalArgumentException("Error, negative ID!");
		if (TEACHERIDLIST.contains(id))
			throw new IllegalArgumentException("Error, ID " + id + " exists!");
		else { // good to go
			TEACHERIDLIST.add(id);
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
	 * @return the salary
	 */
	public double getSalary() {
		return salary;
	}

	/**
	 * @param salary the salary to set
	 * @throw IllegalArgumentException when salary < 0
	 */
	public void setSalary(double salary) {
		if (salary < 0)
			throw new IllegalArgumentException("Error, negative salary");
		this.salary = salary;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Id: %d, Name: %s, Salary: %.2f ", id, name, salary);
	}

}