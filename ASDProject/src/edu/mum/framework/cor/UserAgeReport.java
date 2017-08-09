package edu.mum.framework.cor;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import edu.mum.framework.domain.User;

public class UserAgeReport extends Handler{

	@Override
	public void handleRequest(List<User> req) {
		List<User> listOfUserAgeGrt18=req.stream().filter(x->x.getAge()>18).collect(Collectors.toList());
		System.out.println("User age >18:    "+listOfUserAgeGrt18);
		if(nextAgent!=null)
		nextAgent.handleRequest(listOfUserAgeGrt18);
	}

}
