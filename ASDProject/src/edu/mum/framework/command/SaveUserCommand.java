package edu.mum.framework.command;

import edu.mum.framework.domain.User;
import edu.mum.framework.service.UserService;
import edu.mum.framework.service.factory.ServiceFactory;

public class SaveUserCommand implements Command {
  private UserService userService;
  private User user;
  public SaveUserCommand(UserService userService,User user){
	  this.userService=userService;
	  this.user=user;
 }
@Override
public void execute() {
	userService.saveUser(user);
	
}
@Override
public void undo() {
	userService.deletUser(user);
	
}
}
//Invoker class is not define