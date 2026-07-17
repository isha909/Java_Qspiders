public class Method7 {
  public static void main(String[] args) {

    // Parameterized Method 

    square(8);
    cube(4);
    power4(16);
    product(1, 5);
    diff(3, 2);
    div(10, 5);
    stud_details(1, "Isha", "04/07/2004", "B.tech", 'A', 'B', "isha@gmail.com", 'F', 4, 8765427956l);
    num(50);
    num1(450);
    num2(30, 35);
    odd(10);
    even(30, 40);
    div3(1, 30);
  }

  private static void square(int a){
    int b = a*a;
    System.out.println(b);
  }

  private static void cube(int a){
    int b = a*a*a;
    System.out.println(b);
  }

  private static void power4(int a){
    int b = a*a*a*a;
    System.out.println(b);
  }

  private static void product(int a , int b){
    int c = a*b;
    System.out.println(c);
  }

  private static void diff(int a, int b){
    int c = a - b;
    System.out.println(c);
  }

  private static void div(int a , int b){
    int c = a/b;
    System.out.println(c);
  }

  private static void stud_details(int roll , String name, String dob , String course , char sec , char blood_grp , String mail_id , char gender , int year , long mob_no){
    System.out.println(roll + " " + name + " " + dob + " " + course + " " +sec + " " +blood_grp + " " +mail_id + " " +gender + " " +year + " " +mob_no);
  }

  private static void num(int n){
    for(int i = 1; i<= n; i++){
      System.out.println(i);
    }
  }

  private static void num1(int n){
    for(int i = n; i<= 500; i++){
      System.out.println(i);
    }
  }

  private static void num2(int m , int n){
    for(int i = m; i <= n ; i++){
      System.out.println(i);
    }
  }

  private static void odd(int n){
    for(int i = 1; i <= n ; i++){
      if(i%2!=0){
        System.out.println(i);
      }
    }
  }

  private static void even(int m , int n){
    for(int i = m; i <= n ; i++){
      if(i%2==0){
        System.out.println(i);
      }
    }
  }

  private static void div3(int m , int n){
    for(int i = m; i <= n ; i++){
      if(i%3==0){
        System.out.println(i);
      }
    }
  }

}
