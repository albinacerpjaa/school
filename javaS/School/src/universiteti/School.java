package universiteti;

import java.util.ArrayList;
import java.util.List;

public class School {
	private List<Student> students;
	private List<Teacher> teachers;
	private double totalMoneyEarned;
	private double totalMoneySpent;

	public School() {
		this.students = new ArrayList<>();
		this.teachers = new ArrayList<>();
		this.totalMoneyEarned = 0.0;
		this.totalMoneySpent = 0.0;
	}

	public void addTeacher(Teacher teacher) {
		teachers.add(teacher);
	}

	public void addStudent(Student student) {
		students.add(student);
	}

	public List<Student> getStudents() {
		return students;
	}

	public List<Teacher> getTeachers() {
		return teachers;
	}

	public double getTotalMoneyEarned() {
		return totalMoneyEarned;
	}

	public void updateTotalMoneyEarned(double moneyEarned) {
		totalMoneyEarned += moneyEarned;
	}

	public double getTotalMoneySpent() {
		return totalMoneySpent;
	}

	public void updateTotalMoneySpent(double moneySpent) {
		totalMoneySpent += moneySpent;
	}

	@Override
	public String toString() {
		return String.format(
				"School Information:\n" + "Total Students: %d\n" + "Total Teachers: %d\n" + "Total Money Earned: %.2f\n"
						+ "Total Money Spent: %.2f",
				students.size(), teachers.size(), totalMoneyEarned, totalMoneySpent);
	}

	public void addSubject(Subject math) {
		// TODO Auto-generated method stub

	}
}
