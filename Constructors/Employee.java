class Employee {

  int employeeId;
  String employeeName;
  int employeeAge;
  char employeeGender;
  double employeeSalary;
  static String company_name;
  static String comapny_address;
  String employeeEmail;
  long employeePhno;
  static long company_phno;

  public static void m1(){
    System.out.println(company_name);
    System.out.println(comapny_address);
    System.out.println(company_phno);
  }

  public void m2(){
    System.out.println(employeeId);
    System.out.println(employeeName);
    System.out.println(employeeAge);
    System.out.println(employeeGender);
    System.out.println(employeeSalary);
    System.out.println(employeeEmail);
    System.out.println(employeePhno);
  }

  public Employee(){
    System.out.println("hello");
  }
  public Employee(int x){
    System.out.println("bye");
  }
  public Employee(int x, int y){
    System.out.println("bye");
  }
  public Employee(String x){
    System.out.println("bye");
  }
  
  public static void main(String[] args) {
    // new Employee();
    // System.out.println("Hii");
    // new Employee(5);

    m1();
    Employee a = new Employee();
    a.m2();
  }
}
