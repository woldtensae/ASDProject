package edu.mum.framework.cor;

import java.util.List;

import org.omg.CORBA.Request;

import edu.mum.framework.domain.User;

public abstract class Handler {
   protected Handler nextAgent;
  

abstract public void handleRequest(List<User> req);
   boolean canHandleRequest(Request req)
   {
	return false;
	 
   }
}
