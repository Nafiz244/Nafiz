public class MultipleParameter {
  static void myMethod(String fname, int age) {
    System.out.println(fname + " is " + age);
  }

  public static void main(String[] args) {
    myMethod("Nafiz", 5);
    myMethod("Fahad", 8);
    myMethod("Nafi", 31);
  }
}