class Customer {

  int customerId;
  String customerName;
  int customerAge;
  char customerGender;
  String customerEmail;
  static String companyName;
  static String companyAddress;
  long customerPhno;
  String customerAddress;
  static long companyPhno;

  public static void m1(){
    System.out.println(companyName);
    System.out.println(companyAddress);
    System.out.println(companyPhno);
  }

  public void m2(){
    System.out.println(customerId);
    System.out.println(customerName);
    System.out.println(customerAge);
    System.out.println(customerGender);
    System.out.println(customerEmail);
    System.out.println(customerPhno);
    System.out.println(customerAddress);
  }

  public Customer(){
    System.out.println("It is good");
  }
  public Customer(boolean a){
    System.out.println("I know");
  }
  public Customer(int x , int y){
    System.out.println("It is good");
  }
  public Customer(int x){
    System.out.println("I know");
  }
  public static void main(String[] args) {
    // new Customer();
    // System.out.println("It is amazing ");
    // new Customer(true);

    m1();
    Customer a = new Customer();
    a.m2();
  }
}