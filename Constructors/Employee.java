class Employee {
  public Employee(){
    System.out.println("hello");
  }
  public Employee(int x){
    System.out.println("bye");
  }
  public static void main(String[] args) {
    new Employee();
    System.out.println("Hii");
    new Employee(5);
  }
}
