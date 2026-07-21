class Page4 {
  int x = 450;
  static int y;
  void m1()
  {
    int z = 2;
    System.out.println(z);
    System.out.println(y);
  }  
  public static void m2(){
    System.out.println("heyy");
  }
  public static void main(String[] args) {
    int p = 3;
    System.out.println(p);
    System.out.println(y);
    m2();
    // m1();  //error
    Page4 a1 = new Page4();
    System.out.println(a1);
    // System.out.println(x); // error because x is non static so we can't directly access it
    System.out.println(a1.x);
    a1.m1();
    // System.out.println(z); // error because z is a local variable
  }
}