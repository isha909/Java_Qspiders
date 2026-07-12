public class Do19 {
  public static void main(String[] args) {

// 5 25 
// 125 625 

    int i = 5;
    int a = 1;
    do{
      int b = 1;
      do{
        System.out.print(i+" ");
        i*=5;
        b++;
      } while(b <= 2);
      System.out.println();
      a++;
    }while(a <= 2);
  }
}
