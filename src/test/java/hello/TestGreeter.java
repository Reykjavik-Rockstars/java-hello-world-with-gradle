package hello;



import static org.junit.Assert.*;



import org.junit.Before;

import org.junit.Test;





public class TestGreeter {



   private Greeter g;

	

   @Before

   public void setUp() throws Exception 

   {

      g = new Greeter();

   }



   @Test

   public void testGreeterEmpty() 

   {

      assertEquals(g.getName(),"");

      assertEquals(g.sayHello(),"Hello!");

   }

	
	
   @Test

   public void testGreeter() 

   {

      g.setName("World");

      assertEquals(g.getName(),"World");

      assertEquals(g.sayHello(),"Hello World!");

   }

   @Test

   public void newtest_DEO_GreeterPass()
   {
      g.setName("I love it when you call me...")
      assertNotEquals(g.getName(),"Big Pappa");
   }
   
   @Test
	
   public void newtest_DEO_GreeterFail()
   {
      String wrongName = "Jimmy";
      String correctName = "Timmy";
      g.setName(correctName);
      assertEquals(g.getName(),wrongName);
   }
   
}
