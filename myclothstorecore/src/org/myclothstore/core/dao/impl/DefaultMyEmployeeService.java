/**
 *
 */
package org.myclothstore.core.dao.impl;

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


	private static final Logger LOG = Logger.getLogger(DefaultMyEmployeeService.class);


	@Override
	public List<MyEmployeeModel> getAllEmployees()
	{
		return myEmployeeDao.getAllEmployees();
	}


	@Override
	public void saveEmployee(final MyEmployeeModel myEmployee)
	{
		myEmployeeDao.saveEmployee(myEmployee);
	}

}
