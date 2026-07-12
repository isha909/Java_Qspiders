public class Do24 {
  public static void main(String[] args) {
    char i = 'A';
    int ch = 1;
    do{
      int j = 1;
      do{
        System.out.print(i + " ");
        i++;
        j++;
      } while(j <= ch);
      System.out.println();
      ch++;
    }while(ch <= 4);
  }
}
