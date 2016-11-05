
public class App {

	public static void main(String[] args) {
		
		Personne p = new Personne();
		
		p.setFamilyName("NAJAH");
		p.setAddress("123, av Oued eddahab");
		p.setFirstName("Soufiane");
		p.setAge(25);
		
		p.setAddress("55555555555");
		System.out.println(p.toString());
		
		System.out.println(p.toString());
		
		p.setAddress("55555555555");
		System.out.println(p.toString());
		
		p.setFirstName("Soufiane");
		p.setAge(25);
		
		p.setFirstName("Soufiane");
		p.setAge(25);
		
		System.out.println();
		
		
	}
}