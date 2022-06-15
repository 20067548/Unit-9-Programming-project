public class Media extends Product
{
  
  private String type;

  //constructor
  public Media(double a, String b, String c, int d, String t)
  {
    super(a,b,c,d);
    type=t;
  }
    
  // accessor
  public String getType()
  {
    return type;    
  }

  //constructor
  public void setType(String h)
  {
    type=h;
  }

  //to string
  public String toString()
  {
    return super.toString()+" "+ type;
  }

}