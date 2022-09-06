package net.edwardsonthe.rest;

import java.io.IOException;

import lombok.extern.slf4j.Slf4j;
import net.edwardsonthe.common.Greeting;
import net.edwardsonthe.common.Proxy;

@Slf4j
public class Client {

   Proxy proxy = new Proxy();

   public Greeting invokeGreeting(String name) throws IOException {
      log.info("invoking greeting with name {}", name);
      return proxy.greeting(name);
   }

}
