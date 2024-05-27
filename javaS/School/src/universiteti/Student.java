package universiteti;

import java.util.ArrayList;
import java.util.List;

public class Student {
	private Integer id;
	private String name;
	private double feesPaid = 0.0;
	static final List<Integer> STUDENTIDLIST = new ArrayList<>();

	public Student(Integer id, String name) {
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
	 */
	public void setId(Integer id) {
		if (id <= 0)
			throw new IllegalArgumentException("Error, Id is negative");
		if (STUDENTIDLIST.contains(id))
			throw new IllegalArgumentException("Error, ID " + id + " exists");
		else { // good to go
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
	public double getFeesPaid() {
		return feesPaid;
	}

	/**
	 * @param feesPaid the feesPaid to add
	 */
	public void payFee(double feesPaid) {
		this.feesPaid += feesPaid;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("ID: %d, Name: %s, Total Fees Paid %.2f euro", id, name, feesPaid);
	}

}