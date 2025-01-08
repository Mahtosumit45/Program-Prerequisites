import java.util.Scanner;
class power {
  public static void main(String[] args) {
      
    double x,y,value;
    Scanner myObj = new Scanner(System.in);
    
    System.out.println("enter base :");
    x = myObj.nextInt();
    System.out.println("enter power :");
    y = myObj.nextInt();
    
    value = Math.pow(x,y)
    System.out.println("value is : " + value); 
  }
} 