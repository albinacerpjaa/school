package universiteti;

public class TeacherTest {

	public static void main(String[] args) {
		try {
			Teacher teacher1 = new Teacher(1, "Luan Dema", 50000.0);
			System.out.println(teacher1);
			Teacher teacher2 = new Teacher(2, "Dod Prenga", 55000.0);
			System.out.println(teacher2);
			Teacher teacher3 = new Teacher(3, "Arben Dema", 52000.0);
			System.out.println(teacher3);
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Programi vazhdon.....");
		}

	}

}