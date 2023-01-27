package ua.robotdream.homework08;

public class EuropeanPlayerAdapter {
   
   private final int id;
   private final String name;
   private final double heightCm;

   public EuropeanPlayerAdapter(AmericanPlayer player) {
       this.id = player.getId();
       this.name = player.getName();
       this.heightCm = covertibleHeightToСentimeters(player.getHeightFootIn());
   }

   private double covertibleHeightToСentimeters(String heightFootIn) {
      double parseFromInches = 2.54;
      int parseFromFeet = 12;
      
      int feet = Integer.parseInt(heightFootIn.substring(0, heightFootIn.indexOf("'")));
      int inches = Integer.parseInt(heightFootIn.substring(heightFootIn.indexOf(" ") + 1, heightFootIn.indexOf("\"")));
      if(inches < 0 || inches > 11);
      return (int) Math.round((feet * parseFromFeet +inches) * parseFromInches);
  }


   public int getId() {
       return id;
   }

   public String getName() {
       return name;
   }

   public double getHeightCm() {
       return heightCm;
   }
}
