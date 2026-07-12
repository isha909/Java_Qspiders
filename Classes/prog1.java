class prog1{
  public static void main(String[] args) {

    //int to long
    int a= 45;
    long b = a; //widening
    System.out.println(a); //45
    System.out.println(b); //45

    //short to float
    short c = 56;
    float d = a; //widening
    System.out.println(c); //56
    System.out.println(d); //56.0

    //char to long
    char e = 'A';
    long f = e;
    System.out.println(e); //A
    System.out.println(f); //65
  }
}