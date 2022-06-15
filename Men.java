public class Men extends Clothing
{

  private boolean machineWash;
  
  //Constructor
  public Men(double a, String b, String c, int d, String n, int s, boolean w)
  {
    super(a,b,c,d,n,s);
    machineWash=w;
  }

  //accessor
  public boolean getMachineWash()
  {
    return machineWash;
  }

  //mutator
  public void getMachineWash(boolean t)
  {
    machineWash=t;
  }

  //to string
  public String toString()
  {
    return super.toString()+" "+this.getMachineWash();
  }
    
}