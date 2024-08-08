public class SwitchMonth {
  public static void main(String args[]) {
    String month = args[0];

    int length =
        switch (month) {
          case "Jan", "Mar", "May", "Jul", "Aug", "Oct", "Dec" -> 31;
          case "Apr", "Jun", "Sep", "Nov" -> 30;
          case "Feb" -> 28;
          default -> 0;
        };

    if (length > 0) {
      System.out.println(month + " has " + length + " days");
    } else {
      System.out.println("Unrecognized month: " + month);
    }
  }
}
