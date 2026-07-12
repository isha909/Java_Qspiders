public class Do8 {
  public static void main(String[] args) {

// A B C D 
// E F G H 
// I J K L 

    char ch = 'A';
    do{
      char j = ch;
      do{
        System.out.print(j + " ");
        j++;
      } while(j <= ch+3);
      System.out.println();
      ch+=4;
    }while(ch <= 'L');
  }
}
