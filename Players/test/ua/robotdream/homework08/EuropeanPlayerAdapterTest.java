package ua.robotdream.homework08;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EuropeanPlayerAdapterTest {

   @Test
   void correctTransformation(){
       AmericanPlayer babe_ruth = new AmericanPlayer(123, "Babe Ruth", "6' 2\"");
       EuropeanPlayerAdapter europeanPlayerAdapter = new EuropeanPlayerAdapter(babe_ruth);

       assertEquals(babe_ruth.getId(), europeanPlayerAdapter.getId());
       assertEquals(babe_ruth.getName(), europeanPlayerAdapter.getName());
       assertEquals(188, europeanPlayerAdapter.getHeightCm());
   }

}
