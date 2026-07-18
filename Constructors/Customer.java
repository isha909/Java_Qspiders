class Customer {
  public Customer(){
    System.out.println("It is good");
  }
  public Customer(boolean a){
    System.out.println("I know");
  }
  public static void main(String[] args) {
    new Customer();
    System.out.println("It is amazing ");
    new Customer(true);
  }
}