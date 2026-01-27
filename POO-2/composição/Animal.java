public class Animal { 
	
	private String name;
	private int age;
	private String ownerName;

	public Animal(String name, int age, Person Owner){
		
		setName(name);
		setAge(age);
		setOwnerName(Owner);
	
	}

	public void setName(String Name){
		this.name = Name;
	}

	public void setAge(int Age){
		this.age = Age;
	}

	public void setOwnerName(Person Owner){
		this.ownerName = Owner.getPetOwner();
	}

	public String getName(){
		return this.name;
	}

	public int getAge() {
		return this.age;
	}

	public String getOwnerName() {
		return this.ownerName;
	}

	public String toString(){
		return String.format("nome do Pet: %s, idade do Pet: %d, dono: %s", getName(), getAge(), getOwnerName());
	}


}
