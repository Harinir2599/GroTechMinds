package basicprogram;
abstract class Student_Abstract {
	abstract void student1();
	abstract void student2();
}

class Student_details extends Student_Abstract{
@Override
	void student1() {
		String name1 = "Harini Ravi";
		int mark1 = 95;
		System.out.println("The name of the student is->"+name1);
		System.out.println("The mark of the student is->"+mark1);
		}

	@Override
	void student2() {
		String name2 = "HamsaPriya Srinivasan";
		int mark2 = 96;
		System.out.println("The name of the student is->"+name2);
		System.out.println("The mark of the student is->"+mark2);
			}
public static void main(String[] args) {
	Student_details s1 = new Student_details();
	s1.student1();
	Student_details s2 = new Student_details();
	s2.student2();

}
}
