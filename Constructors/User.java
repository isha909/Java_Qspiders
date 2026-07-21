class User {

  int userId;
  String userName;
  int userAge;
  char userGender;
  String userEmail;
  String userPassword;
  static String appName;
  static String appVersion;
  long userPhno;
  static String companyName;

  public static void m1(){
    System.out.println(appName);
    System.out.println(appVersion);
    System.out.println(companyName);
  }

  public void m2(){
    System.out.println(userId);
    System.out.println(userName);
    System.out.println(userGender);
    System.out.println(userEmail);
    System.out.println(userPassword);
    System.out.println(userPhno);
    System.out.println(userAge);
  }

  public User(){
    System.out.println("Hii");
  }
  public User(int x){
    System.out.println("byee");
  }
  public User(String a){
    System.out.println("Hii");
  }
  public User(int x,int y){
    System.out.println("byee");
  }

  public static void main(String[] args) {
    // new User();
    // System.out.println("I am Isha Sharma");
    // new User(4);

    m1();
    User a = new User();
    a.m2();
  }
}
