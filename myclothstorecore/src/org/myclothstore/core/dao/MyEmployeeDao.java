/**
 *
 */
package org.myclothstore.core.dao;

import java.util.List;

import org.myclothstore.core.model.MyEmployeeModel;


/**
 * @author Ramakrishna.P
 *
 */
public interface MyEmployeeDao
{
    public List<MyEmployeeModel> getAllEmployees();





   public void saveEmployee(final MyEmployeeModel myEmployee);





}
