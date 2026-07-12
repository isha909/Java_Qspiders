public class Ques2 {
  public static void main(String[] args) {
    
      // Ques 1: Check the number is positive or not positive
      int num1 = 45;
      System.out.println(num1 > 0 ? "positive" : "not positive");

      // Ques 2: Check the number is negative or not negative
      int num2 = 12;
      System.out.println(num2 < 0 ? "negative" : "not negative");

      // Ques 3: Check the number is zero or non zero
      int num3 = 3;
      System.out.println(num3 == 0 ? "Number is zero" : "Number is not zero");

      // Ques 4: Check the number is larger than 50 or not
      int num4 = 23;
      System.out.println(num4 > 50 ? "Number is larger than 50" : "Number is less than 50");

      // Ques 5: Check the price is more than 125.75 or not
      double price = 234.23;
      System.out.println(price > 125.75 ? "Number greater than 125.75" : "Number less tha 125.75");

      // Ques 6: Check the number is in between 500 to 1000 or not excluding the given number
      int num5 = 454;
      String res = (num5 > 500 || num5 < 1000 ? "The number is in between 500 to 1000" : "The number is not in between 500 to 1000");
      System.out.println(res);

      // Ques 7: Check the number is a two digit number or not
      int num6 = 67;
      String result = (num6 >= 10 && num6 <= 99 ? "Number is two digit number" : "Number is not two digit number");
      System.out.println(result);

      // Ques 8: Check the number is divisible by 5 or not 
      int num7 = 2345;
      String res2 = (num7 % 5 == 0 ? "Divisible by 5" : "Not divisible by 5");
      System.out.println(res2);

      // Ques 9: Check the number is divisible by 7 or not 
      int num8 = 23234;
      String res3 = (num8 % 7 == 0 ? "Divisible by 7" : "Not divisible by 7");
      System.out.println(res3);

      // Ques 10: Check the number is even or not
      int num9 = 34;
      String res4 = (num9 % 2 == 0 ? "Even number" : "Not even number");
      System.out.println(res4);

      // Ques 11: Check the number is odd or not 
      int num10 = 65;
      String res5 = (num10 % 2 != 0 ? "Odd number" : "Not odd number");
      System.out.println(res5);

      // Ques 12: Check the number is divisible by 6 or not without directly dividing or modulusing by 6
      int num11 = 37;
      String res6 = (num11 % 2 == 0 && num11 % 3 == 0 ? "Divisible by 6" : "Not divisible by 6");
      System.out.println(res6);

      // Ques 13: Check the number is even or not without using modulus operator 
      int num12 = 23;
      String res7 = (num12 / 2 * 2 == num12? "Even number" : "Not even number");
      System.out.println(res7);

      // Ques 25: Check if the person is eligible to vote or not
      int age = 10;
      String eligible = (age >= 18 ? "Eligible to vote" : "Not eligible to vote");
      System.out.println(eligible); 

      // Ques 26: Find out largest among 3 numbers without using and operator and with using and operator
      // by using AND operator
      int num13 = 345, num14 = 343, num15 = 432;
      int largest1 = (num13 > num14 && num13 > num15) ? num13 : (num14 > num15 ? num14 : num15);
      System.out.println(largest1);
      
      // without using AND operator
      int num16 = 23, num17 = 76, num18 = 56;
      int largest2 = (num16 > num17) ? (num16 > num18 ? num16 : num18) : (num17 > num18 ? num17 : num18);
      System.out.println(largest2);
      
      // Ques 27: Find out smallest among 3 numbers without using and operator and with using and operator
      // by using AND operator
      int smallest1 = (num13 < num14 && num13 < num15) ? num13 : (num14 < num15 ? num14 : num15);
      System.out.println(smallest1);
      
      // without using AND operator
      int smallest2 = (num16 < num17) ? (num16 < num18 ? num16 : num18) : (num17 < num18 ? num17 : num18);
      System.out.println(smallest2);

  } 
}
