
public class Personne {

	private String familyName;
	private String firstName;
	private int age;
	private String address;

	public Personne() {
		super();
	}

	public Personne(String familyName, String firstName, int age, String address) {
		super();
		this.familyName = familyName;
		this.firstName = firstName;
		this.age = age;
		this.address = address;
	}

	public String getFamilyName() {
		return familyName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
