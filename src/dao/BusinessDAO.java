package dao;

import java.sql.SQLException;
import java.util.List;

import object.BusinessEntity;

public interface BusinessDAO {
	public void addBusiness(BusinessEntity business) throws SQLException;
    public void updateBusiness(BusinessEntity business) throws SQLException;
    public BusinessEntity getBusinessById(Long id) throws SQLException;
    public List<BusinessEntity> getAllBusiness() throws SQLException;
    public void deleteBusiness(BusinessEntity business) throws SQLException;
}