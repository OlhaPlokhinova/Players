package ua.robotdream.homework08;

public class AmericanPlayerAdapter {
   
   private final int id;
   private final String name;
   private final String heightFootIn;

   public AmericanPlayerAdapter(EuropeanPlayer player) {
       this.id = player.getId();
       this.name = player.getName();
       this.heightFootIn = covertibleHeightToInches (player.getHeightCm());
   }

   private String covertibleHeightToInches(double heightCm) {
   double parseToInches = 2.54;
   
   int inches = (int) (heightCm/parseToInches);
   int feetPart = inches / 12;
   int inchesPart = inches % 12;
   return "" + feetPart + "' " + inchesPart + "\"";

   }

   public int getId() {
       return id;
   }

   public String getName() {
       return name;
   }

   public String getHeightFootIn() {
       return heightFootIn;
   }
}
