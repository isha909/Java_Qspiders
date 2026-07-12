public class Method4 {
  public static void main(String[] args) {
    positive();
    zero();
  }

  public static void positive(){
    int a = 3;
    if(a > 0 ){
      System.out.println("Posiitive number");
    }
    else{
      System.out.println("Not positive number");
    }
  }

  public static void zero(){
    int a = 3;
    if(a == 0){
      System.out.println("Number is zero");
    }
    else{
      System.out.println("Number not zero");
    }
  }
}
