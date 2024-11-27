package basicprogram;

interface Concept_interface {
	void getName();

}
class Language implements Concept_interface{

	@Override
	public void getName() {
		System.out.println("The Programming language is Java");
		System.out.println("The Programming language is Python");
		
	}
public static void main(String[] args) {
	Language l = new Language();
	l.getName();
}
	
}