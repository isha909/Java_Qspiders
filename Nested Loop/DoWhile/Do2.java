public class Do2 {
  public static void main(String[] args) {

// A A 
// A A 
// A A 

    int a = 1;
    do{
      int b = 1;
      do{
        System.out.print("A ");
        b++;
      } while(b<=2);
      System.out.println();
      a++;
    }while(a <= 3);
  }
}
