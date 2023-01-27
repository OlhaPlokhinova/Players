package ua.robotdream.homework08;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AmericanPlayerAdapterTest {

   @Test
   void correctTransformation(){
       EuropeanPlayer babe_ruth = new EuropeanPlayer(123, "Babe Ruth", 188);
       AmericanPlayerAdapter americanPlayerAdapter = new AmericanPlayerAdapter(babe_ruth);

       assertEquals(babe_ruth.getId(), americanPlayerAdapter.getId());
       assertEquals(babe_ruth.getName(), americanPlayerAdapter.getName());
       assertEquals("6' 2\"", americanPlayerAdapter.getHeightFootIn());
   }
  
}
