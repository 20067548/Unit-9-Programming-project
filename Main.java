import java.text.*;

class Main 
{
  public static void main(String[] args) 
  {

    Product[] list = new Product[6];
    list[0] = new Product(250.99, "Nike", "Vaporfly Next %", ((int)(Math.random()*4)+3));
    list[1] = new Electronics(650.97, "Apple", "iPhone 8", ((int)(Math.random()*4)+3), true, 6);
    list[2] = new Media(8.20, "Marvel Studios", "Iron Man", ((int)(Math.random()*4)+3),"movie"); //done.
    list[3] = new Clothing(9.00, "Mens warehouse", "Black uit", ((int)(Math.random()*4)+3), "three", 6);
    list[4] = new Men(14.99, "Gay Apparel", "tank top", ((int)(Math.random()*4)+3),"Gay Apparel", 30, false);
    list[5] = new Women(1250.00, "Dior Bridal Salon", "dress", ((int)(Math.random()*4)+3), "Dior Bridal Salon", 10, "white");

    for(Product e: list)
    {
      System.out.println(e);
    }

    System.out.println("\n\n");
    System.out.println("Name                      Company              Quantity   Price    Total Cost");
    System.out.println("****************************************************************************");
    NumberFormat nf=NumberFormat.getCurrencyInstance();

    for(Product yeah: list)
    {
      System.out.printf("%-26s%-25s%-7s%-10s%-2s",yeah.getName(),yeah.getCompany(), yeah.getQuantity(), nf.format(yeah.getPrice()),nf.format(ProductCost(yeah)));
      System.out.println();       
    }

    System.out.println("****************************************************************************");
    System.out.printf("Grand Total %13s",nf.format(grandTotal(list)));
    System.out.println(); 
    System.out.println("****************************************************************************");

  }

  

  public static double ProductCost(Product p)
  {
    return (p.getPrice())*(p.getQuantity());
  }

  public static double grandTotal(Product[] k) 
  {
    double gt=0;
    for(Product j: k)
    {
      gt+= ProductCost(j);
    }
    return gt;
  }

} 