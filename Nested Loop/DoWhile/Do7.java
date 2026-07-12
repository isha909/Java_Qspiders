public class Do7 {
  public static void main(String[] args) {

// A B C D 
// A B C D 
// A B C D 

    char ch = 'A';
    do{
      char j = 'A';
      do{
        System.out.print(j + " ");
        j++;
      } while(j <= 'D');
      System.out.println();
      ch++;
    }while(ch <= 'C');
  }
}
