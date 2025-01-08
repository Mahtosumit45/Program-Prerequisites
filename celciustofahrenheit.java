import java.util.Scanner;
class celciustofahrenheit {
  public static void main(String[] args) {
      
    float cel,fer;
    Scanner myObj = new Scanner(System.in);
    
    System.out.println("temperature in celcius:");
    cel = myObj.nextInt();
    
    fer = ((cel * 9)/5)+32; 
    
    System.out.println("temperature in Fahrenheit is : " + fer); 
  }
} 