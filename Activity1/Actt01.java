public class Actt01{
  public static void main(String[] args) {
    
    //sum of two integer numbers
    int num1 = 100;
    int num2 = 200;
    int sum = num1 + num2;
    System.out.println(sum);

    //sum of two floating point numbers
    float num3 = 23.456f;
    float num4 = 56.3456f;
    float addition = num3 + num4;
    System.out.println(addition);

    //sum of integer and float
    int num5 = 24;
    float num6 = 345.3456f;
    float summ = num5 + num6;
    System.out.println(summ);

    //sum of two integer number stored in byte container
    byte add = (byte) sum;
    System.out.println(add);

    //sum of two integer number stored in short container
    short sum2 = (short) sum;
    System.out.println(sum2);

    //Calculating total number of pens
    byte Ram = 4;
    byte Hari = 7;
    byte Raghu = 9;
    byte Shyam = 11;

    int totalPens = Ram + Hari + Raghu + Shyam;
    System.out.println(totalPens);

  }
}