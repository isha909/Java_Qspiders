public class Do12 {
  public static void main(String[] args) {

// C C C 
// B B B 
// A A A 

    char ch = 'C';
    do{
      char j = 1;
      do{
        System.out.print(ch + " ");
        j++;
      } while(j <= 3);
      System.out.println();
      ch--;
    }while(ch >= 'A');
  }
}
