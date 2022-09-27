/**
*a class representing a pizza order filled with pizza objects
*fills an order with pizza
*/
public class PizzaOrder {
  /**
  *an order array of type Pizza
  */
  private Pizza[] m_order;
  /**
  *the number of pizza objects
  */
  private int m_numPizzas = 0;

  /**
  *default constructor that sets the pizza order to a small cheese pizza
  */
  public PizzaOrder(){
    Pizza pizza = new Pizza("small", 1, 0 , 0);
    m_order[m_numPizzas] = pizza;
    ++ m_numPizzas;
  }

  /**
  *overload constructor that sets the number of Pizza objects that will be in the order
  *param pizzaCount: initializes the order array with how many pizzas will be in the order
  */
  public PizzaOrder(int pizzaCount) {
    this.m_order = new Pizza[pizzaCount];
  }

  /**
  *method that adds a pizza to the order array in a null index
  *param pizza: takes in a Pizza object to be added to the order array
  *@returns an integer 1 if the pizza has been successfully added to the order array
  *@returns an integer -1 if the pizza has been uncessfully added to the order array
  */
  public int addPizza(Pizza pizza) {
    for (int i = 0; i<this.m_order.length; ++i) {
      if (m_order[i] == null) {       //if the index is null, the pizza will be added to that index
        m_order[i] = pizza;           //and the method will return a 1
        m_numPizzas += 1;
        return 1;
      }
    }
    return -1;                        //all of the indexes are full and the method will return -1 to indicate that the pizza couldn't be added
  }

  /**
  *method that calculates the total of the order
  *uses method calcCost from Pizza.java to get the cost of each pizza and add it to the orderTotal
  *@see Pizza#calcCost()
  *@returns a double that represents the total cost of the order
  */
  public double calcTotal() {
    double orderTotal = 0.0;                       //initializes orderTotal
    for (int i = 0; i < m_numPizzas; ++i) {       //iterates through each pizza to find the total of each pizza
      orderTotal += m_order[i].calcCost();        //adds the pizza cost to the order total
    }
    return orderTotal;
  }

  /**
  *returns a string with a description of how many pizzas were order and the order total cost
  */
  public String toString() {
    for (int i = 0; i<m_order.length; ++i) {
      System.out.println(m_order[i].toString());
    }
    return "Order Total: $" + calcTotal();
  }
}
