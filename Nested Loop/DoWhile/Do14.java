public class Do14 {
  public static void main(String[] args) {

// I H G 
// F E D 
// C B A 

    char ch = 'I';
    do{
      char j = ch;
      do{
        System.out.print(j + " ");
        j--;
      } while(j >= ch-2);
      System.out.println();
      ch-=3;
    }while(ch >= 'A');
  }
}
