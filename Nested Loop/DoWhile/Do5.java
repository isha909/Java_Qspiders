public class Do5 {
  public static void main(String[] args) {

// 9 9 9 9 
// 9 9 9 9 

    int a = 1;
    do{
      int b = 1;
      do{
        System.out.print(9+" ");
        b++;
      } while(b<=4);
      System.out.println();
      a++;
    }while(a <= 2);
  }
}
