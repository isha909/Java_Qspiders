public class Actt04 {
  public static void main(String[] args) {
    
    //all digits
    short num1 = 1234;
    short dig1 = 1, dig2 = 2, dig3 = 3, dig4 = 4;
    System.out.println(num1);
    System.out.println(dig1);
    System.out.println(dig2);
    System.out.println(dig3);
    System.out.println(dig4);

    //sum of all digitsw
    int sum = dig1 + dig2 + dig3 + dig4;
    System.out.println(sum);

    //product of all digits
    int product = dig1 * dig2 * dig3 *dig4;
    System.out.println(product);

    //sum of even digits i.e. 2,4
    int evenSum = dig2 + dig4;
    System.out.println(evenSum);

    //sum of odd digits i.e. 1,3
    int oddSum = dig1 + dig3;
    System.out.println(oddSum);

    //sum of prime digits i.e. 2,3
    int primeSum = dig2 + dig3;
    System.out.println(primeSum);

    //square of 4
    int num2 = 4;
    int sqr4 = num2 * num2;
    System.out.println(sqr4);

    //square of 7
    int num3 = 7;
    int sqr7 = num3 * num3;
    System.out.println(sqr7);

    //square of 9
    int num4 = 9;
    int sqr9 = num4 * num4;
    System.out.println(sqr9);

    //cube of 5
    int num5 = 5;
    int cube5 = num5 * num5 * num5;
    System.out.println(cube5);

    //cube of 2
    int num6 = 2;
    int cube2 = num6 * num6 * num6;
    System.out.println(cube2);

    //cube of 15
    int num7 = 15;
    int cube15 = num7 * num7 * num7;
    System.out.println(cube15);

    // 4th power of 5 
    int num8 = 5;
    int power4 = num8 * num8 * num8 * num8;
    System.out.println(power4);

    //6th power of 3
    int num9 = 3;
    int power6 = num9 * num9 * num9 * num9 * num9 * num9;
    System.out.println(power6);

    //2nd power of 6
    int num10 = 6;
    int power2 = num10 * num10;
    System.out.println(power2);

    //3rd power of 8 
    int num11 = 8;
    int power3 = num11 * num11 * num11;
    System.out.println(power3);

    //area of rectangle
    int length = 4;
    float width = 5.6f;
    float area = length * width;
    System.out.println(area);

    //perimeter of rectangle
    float length1 = 4.1f;
    float width1 = 3.2f;
    float perimeter = 2 * (length1 + width1);
    System.out.println(perimeter);

    //area and perimeter of square
    int side = 6;
    int sqrArea = side * side;
    int sqrPerimeter = 4 * side;
    System.out.println(sqrArea);
    System.out.println(sqrPerimeter);
  }
}
