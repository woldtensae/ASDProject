package edu.mum.framework.service.impl;

import java.util.List;

import edu.mum.dao.CredentialDao;
import edu.mum.framework.domain.Credential;
import edu.mum.framework.service.CredentialService;



public class CredentialServiceImpl implements CredentialService{
    private CredentialDao credentialDao;
    public CredentialServiceImpl(CredentialDao credentialDao){
    	this.credentialDao=credentialDao;
    }
    

	@Override
	public void saveCredential(Credential credential) {
		if(credentialDao.findAll().stream().filter(x->x.getUserName()== credential.getUserName())==null);
		   credentialDao.add(credential);
		
	}

	@Override
	public void deletCredential(Credential credential) {
		credentialDao.remove(credential);
		
	}

	@Override
	public void updateCredential(Credential credential) {
		//credentialDao.up(credential);
		
	}

	@Override
	public  Credential findCredentialByName(String username) {
		//return credentialDao.findCredentialByName(username);
		return null;
	}

	@Override
	public List<Credential> findAllCredential() {
		return credentialDao.findAll();
	}
	
   public boolean login(String userName, String password)
   {
	   if(credentialDao.findAll().stream().anyMatch(x->x.getUserName().equals(userName) && x.getPassword().equals(password)))
			  return true;
		return 	false;	  
   }
}
