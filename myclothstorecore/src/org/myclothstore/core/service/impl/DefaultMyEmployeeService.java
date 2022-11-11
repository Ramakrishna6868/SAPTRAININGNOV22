/**
 *
 */
package org.myclothstore.core.service.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.myclothstore.core.dao.MyEmployeeDao;
import org.myclothstore.core.model.MyEmployeeModel;
import org.myclothstore.core.service.MyEmployeeService;


/**
 * @author Ramakrishna.P
 *
 */
public class DefaultMyEmployeeService implements MyEmployeeService
{
	private MyEmployeeDao myEmployeeDao;



	/**
	 * @return the myEmployeeDao
	 */
	public MyEmployeeDao getMyEmployeeDao()
	{
		return myEmployeeDao;
	}



	/**
	 * @param myEmployeeDao
	 *           the myEmployeeDao to set
	 */
	public void setMyEmployeeDao(final MyEmployeeDao myEmployeeDao)
	{
		this.myEmployeeDao = myEmployeeDao;
	}



	private static final Logger LOG = Logger.getLogger(DefaultMyEmployeeService.class);



	@Override
	public List<MyEmployeeModel> getAllEmployees()
	{
		LOG.info("########################### DefaultMyEmployeeService ###############");
		return myEmployeeDao.getAllEmployees();
	}



	@Override
	public void saveEmployee(final MyEmployeeModel myEmployee)
	{



		myEmployeeDao.saveEmployee(myEmployee);
	}





}