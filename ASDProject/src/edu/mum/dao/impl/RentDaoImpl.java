package edu.mum.dao.impl;

import edu.mum.dao.RentDao;
import edu.mum.framework.domain.Rent;

public class RentDaoImpl extends DaoImpl<Rent> implements RentDao{

	public RentDaoImpl() {
		super(Rent.class, Rent.class.getSimpleName());
	}

}
