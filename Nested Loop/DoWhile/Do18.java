public class Do18 {
  public static void main(String[] args) {

// 2 4 6 
// 8 10 12 
// 14 16 18 
// 20 22 24 

    int a = 1;
    do{
      int b = a;
      do{
        System.out.print(b*2+" ");
        b++;
      } while(b <= a+2);
      System.out.println();
      a+=3;
    }while(a <= 12);
  }
}
