public class Do17 {
  public static void main(String[] args) {

// 9 8 7 
// 6 5 4 
// 3 2 1 

    int a = 9;
    do{
      int b = a;
      do{
        System.out.print(b+" ");
        b--;
      } while(b>=a-2);
      System.out.println();
      a-=3;
    }while(a >= 1);
  }
}
