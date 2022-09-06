package net.edwardsonthe.rest;

import static org.junit.Assert.assertNotNull;

import java.io.IOException;

import org.junit.Test;

import net.edwardsonthe.common.Greeting;

public class ClientTest {

   Client client = new Client();

   @Test
   public void testInvokeGreeting() throws IOException {
      Greeting greeting = client.invokeGreeting("Jeff");
      assertNotNull(greeting);
   }

}
