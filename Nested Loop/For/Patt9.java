public class Patt9 {
  public static void main(String[] args) {
    for(int i = 1; i <= 10; i+=5){
      for(int j = i; j <= i+4 ; j++){
        System.out.print(j+" ");
      }
      System.out.println();
    }
  }
}
