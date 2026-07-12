public class Do29 {
  public static void main(String[] args) {
    int a = 1;
    do{
      int b = 1;
      do{
        System.out.print(a%2 + " ");
        b++;
      } while(b <= 5);
      System.out.println();
      a++;
    }while(a <= 4);
  }
}
