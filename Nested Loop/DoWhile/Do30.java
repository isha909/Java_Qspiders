public class Do30 {
  public static void main(String[] args) {
    int a = 1;
    do{
      int b = 1;
      do{
        System.out.print(b%2 + " ");
        b++;
      } while(b <= 5);
      System.out.println();
      a++;
    }while(a <= 4);
  }
}
