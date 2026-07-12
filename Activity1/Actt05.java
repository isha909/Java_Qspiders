public class Actt05 {
  public static void main(String[] args) {
    
    //factorial of 8
    int num1 = 8;
    int factorial1 = 8 * 7 * 6 * 5 * 4 * 3 * 2 * 1;
    System.out.println("Factorial of " + num1 + " is " + factorial1);

    //factorial of 7
    int num2 = 7;
    int factorial2 = 7 * 6 * 5 * 4 * 3 * 2 * 1;
    System.out.println("Factorial of " + num2 + " is " + factorial2);

    //factorial of 4
    int num3 = 4;
    int factorial3 = 4 * 3 * 2 * 1;
    System.out.println("Factorial of " + num3 + " is " + factorial3);

    //simple interest
    float P = 8;
    float R = 12;
    float T = 60 / 12;
    System.out.println(T);
    float simpleInterest = (P * R * T) / 100;
    System.out.println(simpleInterest);

    //average 
    int num4 = 40;
    int num5 = 30;
    int num6 = 56;
    int num7 = 78;
    int average = (num4 + num5 + num6 + num7) / 4;
    System.out.println(average);

    //total marks and percentage
    int sciMarks = 78;
    int SSMarks = 89;
    int mathMarks = 99;
    int engMarks = 88;
    int hindiMarks = 67;
    int maxMarks = 500;

    int totalMarks = sciMarks + SSMarks + mathMarks + engMarks + hindiMarks;
    System.out.println(totalMarks);
    

    //doubt
    float percentage = (totalMarks / maxMarks) * 100;
    System.out.println(percentage);
  }
}
