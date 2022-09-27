/**
*a class representing a pizza
*describes the pizza's size and toppings
*/
public class Pizza {
  /**
  *the size of the pizza
  */
  private String size;
  /**
  *the number of a specific topping on the pizza
  */
  private int numCheeseTopping;
  private int numPepperoniTopping;
  private int numVeggieTopping;

  /**
  *default Constructor
  *initializes a pizza to size none and toppings -1 if no input is entered
  */
  public Pizza () {
    this.size = "None";
    this.numCheeseTopping = -1;
    this.numPepperoniTopping = -1;
    this.numVeggieTopping = -1;
  }

  /**
  *overload constructor that initializes this to the parameters
  *@param size: size portion of the pizza
  *@param numCheeseTopping: the number of cheese toppings on the pizza
  *@param numPepperoniTopping: the number of pepperoni toppings on the pizza
  *@param numVeggieTopping: the number of vegetable toppings on the pizza
  */
  public Pizza (String size, int numCheeseTopping, int numPepperoniTopping, int numVeggieTopping) {
    this.size = size;
    this.numCheeseTopping = numCheeseTopping;
    this.numPepperoniTopping = numPepperoniTopping;
    this.numVeggieTopping = numVeggieTopping;
  }

  /**copy constructor to make a copy of the pizza in the parameter
  @param pizza: pizza object that is going to be copied with the same exact values
  */
  public Pizza (Pizza pizza) {
    this.size = pizza.size;
    this.numCheeseTopping = pizza.numCheeseTopping;
    this.numPepperoniTopping = pizza.numPepperoniTopping;
    this.numVeggieTopping = pizza.numVeggieTopping;
  }

  /**
  *mutator to set this to the values in the parameters
  */
  public void setSize(String size) {
    this.size = size;
  }
  public void setNumCheeseTopping(int numCheeseTopping) {
    this.numCheeseTopping = numCheeseTopping;
  }
  public void setNumPepperoniTopping(int numPepperoniTopping) {
    this.numPepperoniTopping = numPepperoniTopping;
  }
  public void setNumVeggieTopping(int numVeggieTopping) {
    this.numVeggieTopping = numVeggieTopping;
  }

  /**
  *accessor for the Mutators
  */
  public String getSize() {
    return this.size;
  }
  public int getNumCheeseTopping() {
    return this.numCheeseTopping;
  }
  public int getNumPepperoniTopping() {
    return this.numPepperoniTopping;
  }
  public int getNumVeggieTopping() {
    return this.numVeggieTopping;
  }

  /**
  *Calculates the cost of a pizza given the number of toppings and the size of a pizza
  *@returns a double that represents the cost of the pizza
  */
  public double calcCost() {
    double pizzaCost = 0;           //stores costs of the pizza
    int numTopping = 0;             //stores the number of toppings on the pizza
    numTopping = getNumCheeseTopping() + getNumPepperoniTopping() + getNumVeggieTopping();    //gets the total number of toppings by adding each of the three types of toppings
    if (getSize().equals("small")){
      pizzaCost = 10 + (numTopping * 2);
    }
    else if (getSize().equals("medium")){
      pizzaCost = 12 + (numTopping * 2);
    }
    else if (getSize().equals("large")){
      pizzaCost = 14 + (numTopping * 2);
    }
    return pizzaCost;
  }

  /**
  *prints out the total cost of a pizza with all its description
  */
  public String toString() {
    return getSize() + " pizza w/ " + getNumCheeseTopping() + " cheese toppings, " + getNumPepperoniTopping() + " pepperoni toppings, and " + getNumVeggieTopping() + " veggie toppings: $" + calcCost();
  }

  /**
  *checks if two pizzas are equal
  *param pizza: Pizza object that is going to get compared to the pizza object that is calling on the method
  *@returns a boolean that represents whether two pizzas are equal
  */
  public boolean equals(Pizza pizza) {
    if (this.getSize() != pizza.getSize()) {                              //returns false when the size isn't the same
      return false;
    }
    else if (this.getNumCheeseTopping() != pizza.getNumCheeseTopping()) { //returns false when the number of cheese topping isn't the same
      return false;
    }
    else if (this.getNumPepperoniTopping() != pizza.getNumPepperoniTopping()) {   //returns false when the number of pepperoni topping isn't the same
      return false;
    }
    else if (this.getNumVeggieTopping() != pizza.getNumVeggieTopping()) {         //returns false when the number of veggie topping isn't the same
      return false;
    }
    else {                                                                        //both pizzas have the same values in all aspects so the pizzas are equal and returns true
      return true;
    }
  }
}
