/**
 *
 */
package org.myclothstore.core.dao.impl;

import de.hybris.platform.servicelayer.internal.dao.AbstractItemDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;

import java.util.List;

import org.apache.log4j.Logger;
import org.myclothstore.core.dao.MyEmployeeDao;
import org.myclothstore.core.model.MyEmployeeModel;

/**
 * @author Ramakrishna.P
 *
 */

public class DefaultMyEmployeeDao extends AbstractItemDao implements MyEmployeeDao
{
	private static final Logger LOG = Logger.getLogger(MyEmployeeDao.class);



	private FlexibleSearchService flexibleSearchService;



	@Override
	public List<MyEmployeeModel> getAllEmployees()
	{
		LOG.info("############################# MyEmployeeDao ########");
		final String query = "SELECT {PK} FROM {MyEmployeeModel}";
		final FlexibleSearchQuery searchQuery = new FlexibleSearchQuery(query.toString());
		final SearchResult searchResult = getFlexibleSearchService().search(searchQuery);
		return searchResult.getResult();
	}





	@Override
	public void saveEmployee(final MyEmployeeModel myEmployee)
	{
		getModelService().save(myEmployee);
	}





}