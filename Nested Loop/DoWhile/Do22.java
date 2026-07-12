public class Do22 {
  public static void main(String[] args) {
    char ch = 'A';
    do{
      char j = 'A';
      do{
        System.out.print(j + " ");
        j++;
      } while(j <= ch);
      System.out.println();
      ch++;
    }while(ch <= 'D');
  }
}
