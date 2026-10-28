public class Main {

   public static double feetToInches(double feet) {
      double inches;
      // TODO: Convert feet to inches (1 foot = 12 inches)
      inches = feet * 12;
      return inches;
   }

   public static double calcLadderSize(double height, double width) {
      double ladderSize; 
      ladderSize = Math.sqrt(Math.pow(height, 2 ) + Math.pow(width, 2));
      // TODO: Calculate using Pythagorean theorem
      // Use Math.sqrt and Math.pow or *
      return ladderSize;
  }



   public static void main(String []args) {
      double result = feetToInches(8);
      //8.0 feet = 96.0 inches
      System.out.println("8.0 feet = " + result + " inches");
      double size = calcLadderSize(30, 40);
      System.out.println("I need a " + size + " foot ladder");   

      int delivery1 = randomPlankDelivery();
      int delivery2 = randomPlankDelivery();
      int delivery3 = randomPlankDelivery();

      System.out.println("First truck delivered " + delivery1 + " planks.");
      System.out.println("Second truck delivered " + delivery2 + " planks.");
      System.out.println("Third truck delivered " + delivery3 + " planks.");

      // add up all the planks
      int total = delivery1 + delivery2 + delivery3;
      System.out.println("Total planks delivered: " + total);
   }
}
