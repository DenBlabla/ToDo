package dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.hibernate.Session;

import object.BusinessEntity;
import util.HibernateUtil;
import dao.BusinessDAO;

public class BusinessDAOImpl implements BusinessDAO {
	private static Logger logger = Logger.getLogger(BusinessDAOImpl.class
			.getName());

	public void addBusiness(BusinessEntity business) throws SQLException {
		Session session = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			session.save(business);
			session.getTransaction().commit();
		} catch (Exception e) {
			logger.info("Error: " + e);
		} finally {
			if (session != null && session.isOpen()) {
				session.close();
			}
		}
	}

	public void updateBusiness(BusinessEntity business) throws SQLException {
		Session session = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			session.update(business);
			session.getTransaction().commit();
		} catch (Exception e) {
			logger.info("Error: " + e);
		} finally {
			if (session != null && session.isOpen()) {
				session.close();
			}
		}
	}

	public BusinessEntity getBusinessById(Long id) throws SQLException {
		Session session = null;
		BusinessEntity business = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			business = (BusinessEntity) session.load(BusinessEntity.class, id);
		} catch (Exception e) {
			logger.info("Error: " + e);
		} finally {
			if (session != null && session.isOpen()) {
				session.close();
			}
		}
		return business;
	}

	public List<BusinessEntity> getAllBusiness() throws SQLException {
		Session session = null;
		List<BusinessEntity> business = new ArrayList<BusinessEntity>();
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			business = session.createCriteria(BusinessEntity.class).list();
		} catch (Exception e) {
			logger.info("Error: " + e);
		} finally {
			if (session != null && session.isOpen()) {
				session.close();
			}
		}
		return business;
	}

	public void deleteBusiness(BusinessEntity business) throws SQLException {
		Session session = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			session.delete(business);
			session.getTransaction().commit();
		} catch (Exception e) {
			logger.info("Error: " + e);
		} finally {
			if (session != null && session.isOpen()) {
				session.close();
			}
		}
	}
}
