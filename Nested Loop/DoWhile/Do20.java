public class Do20 {
  public static void main(String[] args) {

// 3 9 
// 27 81 

    int i = 3;
    int a = 1;
    do{
      int b = 1;
      do{
        System.out.print(i+" ");
        i*=3;
        b++;
      } while(b <= 2);
      System.out.println();
      a++;
    }while(a <= 2);
  }
}
