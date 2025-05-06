public class Dog {

    //Instance variables - attributes
    private String name;
    private String breed;
    private int weight;

    /**
	 * Write your explanation of the method here
     * Different attributes of a dog
	 * @param name String, the name of the dog
	 * @param breed String, the breed of the dog
     * @param weight Integer, the weight of the dog 
	 */

    //Constructor - run when the object is created
    public Dog(String n, String b, int w){
        this.name = n;
        this.breed = b;
        this.weight = w;
    }

    //Methods

	//getters

    public String getName(){
        return this.name;

    }

    public String getBreed(){
        return this.breed;

    }

    public int getWeight(){
        return this.weight;

    }

    //setters

    public void setName(String newName) {
		this.name = newName;
    }

    public void setBreed(String newBreed) {
        this.breed = newBreed;
    }

    public void setWeight(int newWeight) {
        this.weight = newWeight;
    }
}
