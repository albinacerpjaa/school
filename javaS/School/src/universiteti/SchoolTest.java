package universiteti;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class SchoolTest {
	public static void main(String[] args) {
		// Create a school
		School mySchool = new School();

		// Add subjects and teachers
		Subject math = new Subject(1, "Math");
		Teacher mathTeacher = new Teacher(1, "Luan Dema", 50000.0);
		math.setTeacher(mathTeacher);
		mySchool.addSubject(math);

		Subject physics = new Subject(2, "Physics");
		Teacher physicsTeacher = new Teacher(2, "Dod Prenga", 55000.0);
		physics.setTeacher(physicsTeacher);
		mySchool.addSubject(physics);

		Subject chemistry = new Subject(3, "Chemistry");
		Teacher chemistryTeacher = new Teacher(3, "Arben Dema", 52000.0);
		chemistry.setTeacher(chemistryTeacher);
		mySchool.addSubject(chemistry);

		Subject literature = new Subject(4, "Literature");
		Teacher literatureTeacher = new Teacher(4, "Aferdita Cejku", 48000.0);
		literature.setTeacher(literatureTeacher);
		mySchool.addSubject(literature);

		// Add students for each subject
		Student student1 = new Student(101, "Aleks");
		Student student2 = new Student(102, "Beni");
		Student student3 = new Student(103, "Besarta");
		Student student4 = new Student(104, "David");
		Student student5 = new Student(105, "Ela");

		math.addStudent(student1);
		math.addStudent(student2);
		physics.addStudent(student2);
		physics.addStudent(student3);
		chemistry.addStudent(student3);
		chemistry.addStudent(student4);
		literature.addStudent(student4);
		literature.addStudent(student5);

		// Simulate tuition fee payments
		student1.payFee(2000.0);
		student2.payFee(1500.0);
		student3.payFee(3000.0);
		student4.payFee(4000.0);
		student5.payFee(5000.0);

		// Calculate total earnings from tuition fees
		double totalEarnings = student1.getFeesPaid() + student2.getFeesPaid() + student3.getFeesPaid()
				+ student4.getFeesPaid() + student5.getFeesPaid();

		// Calculate total spending on teachers' salaries
		double totalSpending = mathTeacher.getSalary() + physicsTeacher.getSalary() + chemistryTeacher.getSalary()
				+ literatureTeacher.getSalary();

		// Calculate net earnings/losses
		double netEarnings = totalEarnings - totalSpending;

		// Output the list of students and their paid fees ordered alphabetically into a
		// text file
		List<Student> allStudents = new ArrayList<>();
		allStudents.addAll(math.getStudents());
		allStudents.addAll(physics.getStudents());
		allStudents.addAll(chemistry.getStudents());
		allStudents.addAll(literature.getStudents());

		Collections.sort(allStudents, Comparator.comparing(Student::getName));

		try (FileWriter writer = new FileWriter("student.txt")) {
			for (Student student : allStudents) {
				writer.write(student.toString() + "\n");
			}
		} catch (IOException e) {
			System.err.println("Error writing to file: " + e.getMessage());
		}

		System.out.println("Total Earnings from Tuition Fees: $" + totalEarnings);
		System.out.println("Total Spending on Teachers' Salaries: $" + totalSpending);
		System.out.println("Net Earnings/Losses: $" + netEarnings);
		System.out.println("Student list saved to student.txt");
	}
}
