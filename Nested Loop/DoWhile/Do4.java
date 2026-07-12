public class Do4 {
  public static void main(String[] args) {

// 1 1 1 
// 1 1 1 
// 1 1 1 
// 1 1 1 
    
    int a = 1;
    do{
      int b = 1;
      do{
        System.out.print(1+" ");
        b++;
      } while(b<=3);
      System.out.println();
      a++;
    }while(a <= 4);
  }
}
