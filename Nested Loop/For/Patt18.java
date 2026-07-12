public class Patt18 {
  public static void main(String[] args) {
    for(int i = 1; i <= 12; i+=3){
      for(int j = i; j <= i+2 ; j++){
        System.out.print(j*2+" ");
      }
      System.out.println();
    }
  }
}

