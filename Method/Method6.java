public class Method6 {
  public static void main(String[] args) {
    demo1('Z');
    demo2('a');
    demo3('a', 'g');
    demo4(7);
    demo5(0);
    demo6('H');
    demo7('e');
    demo8(7);
    demo9(5);
    demo10(97.6f);
    check(12, 15);
    month(4);
  }

  public static void demo1(char n) {
    for(char i = 'A' ; i<= n; i++){
      System.out.println(i);
    }
  }

  public static void demo2(char n) {
    for(char i = n ; i<= 'z'; i++){
      System.out.println(i);
    }
  }

  public static void demo3(char m, char n) {
    for(char i = m ; i<= n; i++){
      System.out.println(i);
    }
  }

  public static void demo4(int n) {
    if(n>0){
      System.out.println("Positive number");
    }
    else{
      System.out.println("Not positive number");
    }
  }

  public static void demo5(int n) {
    if(n==0){
      System.out.println("Number is zero");
    }
  else{
      System.out.println("Number is not zero");
    }
  }

  public static void demo6(char n) {
    if (n=='A' || n=='E' || n=='I' || n=='O' || n=='U' ){
      System.out.println("Uppercase vowel");
    }
    else{
      System.out.println("Not Uppercase vowel");
    }
  }

  public static void demo7(char n) {
    if (n=='a' || n=='e' || n=='i' || n=='o' || n=='u' ){
      System.out.println("Lowercase vowel");
    }
    else{
      System.out.println("Not lowercase vowel");
    }
  }

  public static void demo8(int n) {
    if(n>=0 && n <= 9){
      System.out.println("Character is digit");
     }
    else{
      System.out.println("Character is not digit");
    }
  }

  public static void demo9(int n) {
    double i= (double) n;
    System.out.println(i);
  }

  public static void demo10(float n) {
    char i= (char) n;
    System.out.println(i);
  }

  public static void check(int a, int b){
    System.out.println(a>b ? "a is greater" : "b is greater");
  }

  public static void month(int monthNo){
    switch(monthNo){
      case 1,3,5,7,8,10,12:
        {
        System.out.println("It has 31 days");
        }
        break;
      case 2:
        {
          System.out.println("It has 28 or 29 days");
        }
        break;
      case 4,6,9,11:
        {
          System.out.println("It has 30 days");
        }
        break;
      default:
        {
          System.out.println("Invalid choice");
        }
    }
  }

  }
