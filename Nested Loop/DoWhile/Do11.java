public class Do11 {
  public static void main(String[] args) {

// 1 2 
// 1 2 
// 1 2 
// 1 2 

    int a = 1;
    do{
      int b = 1;
      do{
        System.out.print(b+" ");
        b++;
      } while(b<=2);
      System.out.println();
      a++;
    }while(a <= 4);
  }
}
