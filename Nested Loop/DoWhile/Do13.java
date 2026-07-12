public class Do13 {
  public static void main(String[] args) {

// D C B A 
// D C B A 
// D C B A

    int ch = 1;
    do{
      char j = 'D';
      do{
        System.out.print(j + " ");
        j--;
      } while(j >= 'A');
      System.out.println();
      ch++;
    }while(ch <= 3);
  }
}
