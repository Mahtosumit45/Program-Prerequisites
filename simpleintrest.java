import java.util.Scanner;
class simpleintrest {
  public static void main(String[] args) {
      
    float p,r,t,si;
    Scanner myObj = new Scanner(System.in);
    
    System.out.println("enter principle :");
    p = myObj.nextInt();
    System.out.println("enter rate :");
    r = myObj.nextInt();
    System.out.println("enter time :");
    t = myObj.nextInt();
    
    si = (p*r*t)/100;
    System.out.println("simple intrest is : " + si); 
  }
} 