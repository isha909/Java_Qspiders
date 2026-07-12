public class Do6 {
  public static void main(String[] args) {

// A A A 
// B B B 

    char ch = 'A';
    do{
      char j = 'A';
      do{
        System.out.print(ch + " ");
        j++;
      } while(j <= 'C');
      System.out.println();
      ch++;
    }while(ch <= 'B');
  }
}
