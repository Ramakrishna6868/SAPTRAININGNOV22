/**
 *
 */
package org.myclothstore.core.service;

import java.util.List;

import org.myclothstore.core.model.MyEmployeeModel;


/**
 * @author Ramakrishna.P
 *
 */
public interface MyEmployeeService
{

	public List<MyEmployeeModel> getAllEmployees();





	public void saveEmployee(final MyEmployeeModel myEmployee);


}
