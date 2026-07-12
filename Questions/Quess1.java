public class Quess1{
  public static void main(String[] args) {
    int age = 16;
    int num1 = 2;
    if(age >= 18){
      System.out.println("Eligible to vote");
    } else {
      System.out.println("Not eligible to vote");
    }

    if(num1 > 0){
      System.out.println("Number is positive");
    } 
    else if(num1 == 0){
      System.out.println("Number is zero");
    } else {
      System.out.println("NUmber is negative");
    }
  }
}