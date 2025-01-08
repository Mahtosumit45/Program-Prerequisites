import java.util.Scanner;
class volumeofcylinder {
  public static void main(String[] args) {
      
    float radius,height,volume;
    Scanner myObj = new Scanner(System.in);
    
    System.out.println("enter radius :");
    radius = myObj.nextInt();
    System.out.println("enter height :");
    height = myObj.nextInt();
    volume= (22*radius*radius*height)/7;
    
    System.out.println("volume of cylinder is : " + volume); 
  }
} 