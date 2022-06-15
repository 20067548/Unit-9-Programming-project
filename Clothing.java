public class Clothing extends Product
  {
    private String brand;
    private int size;

    //constructor
    public Clothing(double a, String b, String c, int d, String n, int s)
    {
      super(a,b,c,d);
      brand=n;
      size=s;
    }

    //accessor
    public String getBrand()
    {
      return brand;
    }

    public int getSize()
    {
      return size;
    }

    //constructor
    public void setBrand(String o)
    {
      brand=o;
    }

    public void setSize(int m)
    {
      size=m;
    }

    //to string 
    public String toString()
    {
      return super.toString() + " " + brand + " " + size;
    }




    
  }