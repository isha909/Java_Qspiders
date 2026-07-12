public class Do16 {
  public static void main(String[] args) {

// 4 4 4 
// 3 3 3 
// 2 2 2 

    int a = 4;
    do{
      int b = 1;
      do{
        System.out.print(a+" ");
        b++;
      } while(b<=3);
      System.out.println();
      a--;
    }while(a >= 2);
  }
}
