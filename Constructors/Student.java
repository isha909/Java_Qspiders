class Student {

  int roll;
  String name;
  int yop;
  double percentage;
  static String college_name;
  static String college_address;
  long phno;
  char section;
  static long college_phno;
  String degree;

  public static void m1(){
    System.out.println(college_name);
    System.out.println(college_address);
    System.out.println(college_phno);
  }

  public void m2(){
    System.out.println(roll);
    System.out.println(name);
    System.out.println(yop);
    System.out.println(percentage);
    System.out.println(phno);
    System.out.println(section);
    System.out.println(degree);
  }

  public Student(){
    System.out.println("hii");
  }
  public Student(int x){
    System.out.println("bye");
  }
  public Student(int x, int y){
    System.out.println("bye");
  }
  public Student(String a){
    System.out.println("bye");
  }
  
  public static void main(String[] args) {
    // new Student();
    // System.out.println("welcome");
    // new Student(1);

    m1();
    Student a = new Student();
    a.m2();
  }
}
