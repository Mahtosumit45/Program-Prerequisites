import java.util.Scanner;
class areaofcircle {
  public static void main(String[] args) {
      
    float radius,area;
    Scanner myObj = new Scanner(System.in);
    
    System.out.println("enter radius :");
    radius = myObj.nextInt();
    
     area = (2*22*radius)/7;
    
    System.out.println("area of circle is : " + area); 
  }
} 