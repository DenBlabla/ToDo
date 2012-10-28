package main;

import java.sql.SQLException;
import java.util.List;
import java.util.logging.Logger;

import object.BusinessEntity;

import dao.*;

public class Main {
	private static Logger logger = Logger.getLogger(Main.class.getName());

	public static void main(String[] args) throws SQLException {
		List<BusinessEntity> business = Factory.getInstance().getBusinessDAO()
				.getAllBusiness();
		logger.info("========Все дела=========");
		for (int i = 0; i < business.size(); ++i) {
			logger.info("Дело : " + business.get(i).getTitle());
			logger.info("=============================");
		}
	}
}