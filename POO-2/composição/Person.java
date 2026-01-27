public class Person {
	
	private String name;
	private int age;
	private String parent;
	private String petName;
	
	public Person(String name, int age){
		setName(name);
		setAge(age);
		this.petName = "sem pet no momento";
	}

	public void setName(String Name){
		this.name = Name;
	}

	public void setAge(int Age){
		this.age = Age;
	}

	public void setParent(String Parent){
		this.parent = Parent;
	}

	public void setPetName(Animal Pet){
		this.petName = Pet.getName();
	}

	public String getName(){
		return this.name;
	}

	public int getAge(){
		return this.age;
	}

	public String getParent(){
		return this.parent;
	}

	public String getPetName(){
		return this.petName;
	}

	public String getPetOwner(){

		String OwnerName;
		if (this.age >= 18){
			OwnerName = this.name;

		} else {
			OwnerName = this.parent;
		}

		return OwnerName;
	}

	public String toString(){

		String frase;
		if (this.age >= 18){
			 frase =  String.format("Nome: %s, idade: %d, nome do Pet: %s", getName(), getAge(), getPetName());
		} else {
			frase = String.format("Nome: %s, idade: %d, nome do responsável: %s, nome do Pet: %s", getName(), getAge(), getParent(), getPetName());
		}

		return frase;
	} 





}
