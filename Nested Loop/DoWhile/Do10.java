public class Do10 {
  public static void main(String[] args) {

// 1 1 1 1 
// 2 2 2 2 
// 3 3 3 3 

    int a = 1;
    do{
      int b = 1;
      do{
        System.out.print(a+" ");
        b++;
      } while(b<=4);
      System.out.println();
      a++;
    }while(a <= 3);
  }
}
