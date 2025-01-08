import java.util.Scanner;
class kmtomile {
  public static void main(String[] args) {
      
    float k,mile;
    Scanner myObj = new Scanner(System.in);
    
    System.out.println("kilometer :");
    k = myObj.nextInt();
    
    mile=k*0.621371
    System.out.println("Mile is : " + mile); 
  }
} 