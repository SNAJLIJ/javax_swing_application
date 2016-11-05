
public class App {

	public static void main(String[] args) {
		
		Personne p = new Personne();
		
		p.setFamilyName("NAJAH");
		p.setAddress("123, av Oued eddahab");
		p.setFirstName("Soufiane");
		p.setAge(25);
		
		System.out.println(p.toString());
	}
}