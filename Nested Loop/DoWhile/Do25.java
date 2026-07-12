public class Do25 {
  public static void main(String[] args) {
    int a = 1;
    do{
      int b = 1;
      do{
        System.out.print(1 + " ");
        b++;
      } while(b <= a);
      System.out.println();
      a++;
    }while(a <= 4);
  }
}
