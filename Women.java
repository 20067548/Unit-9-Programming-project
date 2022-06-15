public class Women extends Clothing
{
  private String color;
  
  //Constructor
  public Women(double a, String b, String c, int d, String n, int s, String h)
  {
    super(a,b,c,d,n,s);
    color=h;
  }

  //accessor
  public String getColor()
  {
    return color;
  }

  //mutator
  public void setColor(String r)
  {
    color=r;
  }

  //to string
  public String toString()
  {
    return super.toString()+" "+color;
  }

}