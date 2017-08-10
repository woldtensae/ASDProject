package edu.mum.framework.dao.impl;

import edu.mum.framework.dao.CredentialDao;
import edu.mum.framework.domain.ACredential;

public class ACredentialDaoImpl<T> extends DaoImpl<T> implements CredentialDao<T>{

	public ACredentialDaoImpl(Class<T> daoType, String className) {
		super(daoType, className);
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean update(ACredential credential) {
		this.findAll().remove(findByUserName(credential.getUserName()));
		return this.findAll().add((T) credential);
	}

	@Override
	public T findByUserName(String userName) {		
		return this.findAll().stream()
				  .filter(c -> ((ACredential)c).getUserName().equals(userName))
				  .findFirst()
				  .orElse(null);
	}

}
