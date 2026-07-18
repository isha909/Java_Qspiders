class Product {
  public Product(){
    System.out.println("hello");
  }
  public Product(int x){
    System.out.println("hey");
  }
  public static void main(String[] args) {
    new Product();
    System.out.println("Hii");
    new Product(5);
  }
}
