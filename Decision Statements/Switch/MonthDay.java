public class MonthDay {
  public static void main(String[] args) {
    int monthNo = 3;
    switch(monthNo){
      case 1,3,5,7,8,10,12:
        {
        System.out.println("It has 31 days");
        }
        break;
      case 2:
        {
          System.out.println("It has 28 or 29 days");
        }
        break;
      case 4,6,9,11:
        {
          System.out.println("It has 30 days");
        }
        break;
      default:
        {
          System.out.println("Invalid choice");
        }
    }
  }
}
