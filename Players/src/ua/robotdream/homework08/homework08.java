package ua.robotdream.homework08;

public class homework08 {

   public static void main(String[] args) {
      System.out.println("Starting Homework #08");

      EuropeanPlayer euPlayer = new EuropeanPlayer(11, "John Smith", 188);
      AmericanPlayerAdapter adaptedPlayer = new AmericanPlayerAdapter(euPlayer);

      System.out.printf("Original player: %d, %s, %s%n", 
            euPlayer.getId(),
            euPlayer.getName(), 
            euPlayer.getHeightCm());
      System.out.printf("Adapted player: %d, %s, %s%n", 
            adaptedPlayer.getId(), 
            adaptedPlayer.getName(),
            adaptedPlayer.getHeightFootIn());

   }
}
