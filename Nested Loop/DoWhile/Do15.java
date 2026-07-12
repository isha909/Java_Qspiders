public class Do15 {
  public static void main(String[] args) {

// 8 7 6 5 
// 8 7 6 5 
// 8 7 6 5 

    int a = 1;
    do{
      int b = 8;
      do{
        System.out.print(b+" ");
        b--;
      } while(b>=5);
      System.out.println();
      a++;
    }while(a <= 3);
  }
}
