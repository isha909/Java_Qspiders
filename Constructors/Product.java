class Product {

  int productId;
  String productName;
  String productCategory;
  double productPrice;
  int productQuantity;
  String productBrand;
  String productDescription;
  static String companyName;
  static String companyAddress;
  static long companyPhno;

  public static void m1(){
    System.out.println(companyName);
    System.out.println(companyAddress);
    System.out.println(companyPhno);
  }

  public void m2(){
    System.out.println(productId);
    System.out.println(productName);
    System.out.println(productCategory);
    System.out.println(productPrice);
    System.out.println(productQuantity);
    System.out.println(productBrand);
    System.out.println(productDescription);
  }

  public Product(){
    System.out.println("hello");
  }
  public Product(int x){
    System.out.println("hey");
  }
  public Product(String x){
    System.out.println("hello");
  }
  public Product(int x, int y){
    System.out.println("hey");
  }
  public static void main(String[] args) {
    // new Product();
    // System.out.println("Hii");
    // new Product(5);

    m1();
    Product a = new Product();
    a.m2();
  }
}
