package dao;

import dao.impl.BusinessDAOImpl;

public class Factory {

	private Factory(){
		
	}
	
	private static BusinessDAO businessDAO = null;
	private static Factory instance = null;

	public static synchronized Factory getInstance() {
		if (instance == null) {
			instance = new Factory();
		}
		return instance;
	}

	public BusinessDAO getBusinessDAO() {
		if (businessDAO == null) {
			businessDAO = new BusinessDAOImpl();
		}
		return businessDAO;
	}
}
