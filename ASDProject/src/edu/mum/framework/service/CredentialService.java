package edu.mum.framework.service;

import java.util.List;

import edu.mum.framework.domain.Category;
import edu.mum.framework.domain.Credential;
import edu.mum.framework.domain.Product;

public interface CredentialService {
	public void saveCredential(Credential credential);
	public void deletCredential(Credential credential);
	public void updateCredential(Credential credential);
	public Credential findCredentialByName(String username);
	public List<Credential> findAllCredential();
	public boolean login(String userName, String password);
}
