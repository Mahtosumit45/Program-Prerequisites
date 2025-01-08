import java.util.Scanner;
class perimeterofrectangle {
  public static void main(String[] args) {
      
    float l,w,p;
    Scanner myObj = new Scanner(System.in);
    
    System.out.println("enter length :");
    l= myObj.nextInt();
    System.out.println("enter wedith :");
    w = myObj.nextInt();
    
    p = 2*(l+w);
    System.out.println("perimeter is : " + p); 
  }
} 