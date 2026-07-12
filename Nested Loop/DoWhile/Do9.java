public class Do9 {
  public static void main(String[] args) {

// 1 2 3 4 5 
// 6 7 8 9 10 

    int a = 1;
    do{
      int b = a;
      do{
        System.out.print(b+" ");
        b++;
      } while(b<=a+4);
      System.out.println();
      a+=5;
    }while(a <= 10);
  }
}
