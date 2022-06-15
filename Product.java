public class Product
{
  private double price;
  private String company;
  private String name;
  private int quantity;

  //Constructor
  public Product(double p, String c, String n, int a)
  {
    price = p;
    company = c;
    name = n;
    quantity = a;
  }

  //accessor
  public double getPrice()
  {
    return price;
  }

  public String getName()
  {
    return name;
  }
    
  public int getQuantity()
  {
    return quantity;
  }
  
  public String getCompany()
  {
    return company;
  }


  //mutator methods
  public void setPrice(double d)
  {
    price=d;
  }

  public void setQuantity(int x)
  {
    quantity=x;
  }

  public void setName(String s)
  {
    name=s;
  }
    
  public void setCompany(String s)
  {
    company=s;
  }

  //to string
  public String toString()
  {
    return name+ " " + company + " "+ quantity + " $" + price;  
  }
  
}