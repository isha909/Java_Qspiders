public class Method2 {
  public static void main(String[] args) {
    square();
    cube();
    power4();
    product();
    difference();
    division();
    counting();
    odd();
    even();
    div();
  }

  // square of number
  public static void square(){
    int a = 4;
    int sqr = a*a;
    System.out.println(sqr);
  } 

  // cube of a number
  public static void cube(){
    int a = 3;
    int cube = a*a*a;
    System.out.println(cube);
  }

  // 4th power of a number
  public static void power4(){
    int a = 2;
    int power = a*a*a*a;
    System.out.println(power);
  }

  // product of two numbers
  public static void product(){
    int a = 4;
    int b = 8;
    int c = a*b;
    System.out.println(c);
  }

  // difference between two numbers
  public static void difference(){
    int a = 7;
    int b = 2;
    int c = a-b;
    System.out.println(c);
  }

  // division between two numbers
  public static void division(){
    int a = 8;
    int b = 4;
    int c = a/b;
    System.out.println(c);
  }

  // print 1 to 100
  public static void counting(){
    for(int a = 1; a <= 100; a++){
      System.out.println(a);
    }
  }

  // odd numbers fromm 1 to 1000
  public static void odd(){
    for(int i = 1; i <= 1000; i+=2){
      System.out.println(i);
    }
  }
  // even numbers from 250 to 470
  public static void even(){
    for(int i = 250; i <= 470; i+=2){
      System.out.println(i);
    }
  }

  // number divisible by 3 between 300 to 550 
  public static void div(){
    for(int i = 300; i <= 550; i++){
      if(i%3==0){
        System.out.println(i);
      }
    }
  }
}
