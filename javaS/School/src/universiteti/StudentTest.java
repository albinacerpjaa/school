package universiteti;

public class StudentTest {

	public static void main(String[] args) {
		try {
			Student student101 = new Student(101, "Aleks");
			student101.payFee(2000.0);
			System.out.println(student101);
			Student student102 = new Student(102, "Beni");
			student102.payFee(1500.0);
			System.out.println(student102);
			Student student103 = new Student(103, "Besarta");
			student103.payFee(3000.0);
			System.out.println(student103);
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}