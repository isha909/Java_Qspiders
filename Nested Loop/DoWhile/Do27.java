public class Do27 {
  public static void main(String[] args) {
    int i = 1;
    int a = 1;
    do{
      int b = 1;
      do{
        System.out.print(i + " ");
        i++;
        b++;
      } while(b <= a);
      System.out.println();
      a++;
    }while(a <= 4);
  }
}
