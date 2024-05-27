package universiteti;

public class SubjectTest {
	public static void main(String[] args) {

		Teacher teacher = new Teacher(1, "Luan Dema", 50000.0);

		Student student1 = new Student(1, "Aleks");
		Student student2 = new Student(2, "Beni");
		Student student3 = new Student(3, "Besarta");

		Subject subject = new Subject(1, "Math");
		subject.setTeacher(teacher);

		subject.addStudent(student1);
		subject.addStudent(student2);
		subject.addStudent(student3);

		System.out.println(subject);

		// Simulate fee payment for students
		student1.payFee(500.0);
		student2.payFee(700.0);
		student3.payFee(600.0);

		// Print updated student information
		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student3);

	}
}
