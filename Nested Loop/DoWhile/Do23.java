public class Do23 {
  public static void main(String[] args) {
    char ch = 'A';
    do{
      char j = 'A';
      do{
        System.out.print(ch + " ");
        j++;
      } while(j <= ch);
      System.out.println();
      ch++;
    }while(ch <= 'D');
  }
}
