class Student {
  public Student(){
    System.out.println("hii");
  }
  public Student(int x){
    System.out.println("bye");
  }
  public static void main(String[] args) {
    new Student();
    System.out.println("welcome");
    new Student(1);
  }
}
