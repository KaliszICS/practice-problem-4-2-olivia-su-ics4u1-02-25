public class Car {

    //Instance variables - attributes
    private String make;
    private String model;
    private int year;
    private double price;
    

    /**
	 * Write your explanation of the method here
     * Important infomation of a car
	 * @param make String, the manufacturer of the car
	 * @param model String, the model of the car
     * @param year Integer, how old is the car in years 
     * @param price Double, the cost of the car
	 */

     //Constructor - run when the object is created
     public Car(String ma, String mo, int y, double p){
        this.make = ma;
        this.model = mo;
        this.year = y;
        this.price = p;
     }

    //Methods

	//getters

     public String getMake(){
        return this.make;
     }

     public String getModel(){
        return this.model;
     }

     public int getYear(){
        return this.year;
     }

     public double getPrice(){
        return this.price;
     }

     //setters

     public void setMake(String newMake){
        this.make = newMake;
     }

     public void setModel(String newModel){
        this.model = newModel;
     }

     public void setYear(int newYear){
        this.year = newYear;
     }

     public void setPrice(double newPrice){
        this.price = newPrice;
     }

}
