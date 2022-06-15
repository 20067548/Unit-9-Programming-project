public class Electronics extends Product
{
  private boolean batteryIncluded;
  private int monthsWarranty;

  //Constructor
  public Electronics(double a, String b, String c, int d, boolean v, int w)
  {
    super(a,b,c,d);
    batteryIncluded=v;
     monthsWarranty=w;
  }

  //accessor
  public boolean getBatteryInc()
  {
    return batteryIncluded;
  }

  public int getmonthsWarranty()
  {
    return monthsWarranty;
  }

  //mutator
  public void setBatteryInc(boolean x)
  {
     batteryIncluded=x;
  }

  public void setmonthsWarranty(int y)
  {
    monthsWarranty=y;
  }

  public String toString()
  {
    return super.toString()+" " + batteryIncluded+ " "+monthsWarranty;
  }

}