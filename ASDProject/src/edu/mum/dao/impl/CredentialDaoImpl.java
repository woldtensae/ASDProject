package edu.mum.dao.impl;

import edu.mum.dao.CredentialDao;
import edu.mum.framework.domain.Credential;

public class CredentialDaoImpl extends DaoImpl<Credential> implements CredentialDao{

	public CredentialDaoImpl() {
		super(Credential.class, Credential.class.getSimpleName());
	}

}
