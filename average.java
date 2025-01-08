import java.util.Scanner;
class average {
  public static void main(String[] args) {
      
    double x,y,z,avg;
    Scanner myObj = new Scanner(System.in);
    
    System.out.println("enter no 1 :");
    x = myObj.nextInt();
    System.out.println("enter no 2 :");
    y = myObj.nextInt();
    System.out.println("enter no 3 :");
    z = myObj.nextInt();
    
    avg = (x+y+z)/3;
    System.out.println("average is : " + avg); 
  }
} 