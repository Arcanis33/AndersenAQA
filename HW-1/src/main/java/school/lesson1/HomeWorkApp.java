package school.lesson1;

public class HomeWorkApp {
 public static void main(String[] args) {
  printThreeWords();
  checkSumSign();
  printColor();
  compareNumbers();
 }

  static void printThreeWords() {
    System.out.println("Orange");
    System.out.println("Banana");
    System.out.println("Apple");
}
  static void checkSumSign(){
      int first = 10;
      int second = 2;
      int third = (first + second);
      if (third >=0) {
          System.out.println("Сумма положительная и равняется " + third);
      } else {
          System.out.println("Сумма отрицательная и равняется " + third);
      }

    }
  static void printColor(){
     int value = 101;
     if(value <= 0) {
         System.out.println("Красный");
     } else if (value <= 100) {
         System.out.println("Желтый");
     } else {
         System.out.println("Зеленый");
      }


  }
  static void compareNumbers() {
      int a = 50;
      int b = 2;
      if (a >= b) {
          System.out.println("a >= b");
      } else {
          System.out.println("a < b");
      }
  }
}
