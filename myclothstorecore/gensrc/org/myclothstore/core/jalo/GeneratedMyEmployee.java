/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 10-Nov-2022, 4:01:50 PM                     ---
 * ----------------------------------------------------------------
 */
package org.myclothstore.core.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.myclothstore.core.constants.MyclothstoreCoreConstants;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem MyEmployee}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedMyEmployee extends GenericItem
{
	/** Qualifier of the <code>MyEmployee.employeeId</code> attribute **/
	public static final String EMPLOYEEID = "employeeId";
	/** Qualifier of the <code>MyEmployee.employeeName</code> attribute **/
	public static final String EMPLOYEENAME = "employeeName";
	/** Qualifier of the <code>MyEmployee.employeeSalary</code> attribute **/
	public static final String EMPLOYEESALARY = "employeeSalary";
	/** Qualifier of the <code>MyEmployee.employeeAddress</code> attribute **/
	public static final String EMPLOYEEADDRESS = "employeeAddress";
	/** Qualifier of the <code>MyEmployee.employeeWorkType</code> attribute **/
	public static final String EMPLOYEEWORKTYPE = "employeeWorkType";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(EMPLOYEEID, AttributeMode.INITIAL);
		tmp.put(EMPLOYEENAME, AttributeMode.INITIAL);
		tmp.put(EMPLOYEESALARY, AttributeMode.INITIAL);
		tmp.put(EMPLOYEEADDRESS, AttributeMode.INITIAL);
		tmp.put(EMPLOYEEWORKTYPE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyEmployee.employeeAddress</code> attribute.
	 * @return the employeeAddress - Employee Address
	 */
	public String getEmployeeAddress(final SessionContext ctx)
	{
		return (String)getProperty( ctx, EMPLOYEEADDRESS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyEmployee.employeeAddress</code> attribute.
	 * @return the employeeAddress - Employee Address
	 */
	public String getEmployeeAddress()
	{
		return getEmployeeAddress( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyEmployee.employeeAddress</code> attribute. 
	 * @param value the employeeAddress - Employee Address
	 */
	public void setEmployeeAddress(final SessionContext ctx, final String value)
	{
		setProperty(ctx, EMPLOYEEADDRESS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyEmployee.employeeAddress</code> attribute. 
	 * @param value the employeeAddress - Employee Address
	 */
	public void setEmployeeAddress(final String value)
	{
		setEmployeeAddress( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyEmployee.employeeId</code> attribute.
	 * @return the employeeId - Employee ID
	 */
	public Integer getEmployeeId(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, EMPLOYEEID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyEmployee.employeeId</code> attribute.
	 * @return the employeeId - Employee ID
	 */
	public Integer getEmployeeId()
	{
		return getEmployeeId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyEmployee.employeeId</code> attribute. 
	 * @return the employeeId - Employee ID
	 */
	public int getEmployeeIdAsPrimitive(final SessionContext ctx)
	{
		Integer value = getEmployeeId( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyEmployee.employeeId</code> attribute. 
	 * @return the employeeId - Employee ID
	 */
	public int getEmployeeIdAsPrimitive()
	{
		return getEmployeeIdAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyEmployee.employeeId</code> attribute. 
	 * @param value the employeeId - Employee ID
	 */
	public void setEmployeeId(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, EMPLOYEEID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyEmployee.employeeId</code> attribute. 
	 * @param value the employeeId - Employee ID
	 */
	public void setEmployeeId(final Integer value)
	{
		setEmployeeId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyEmployee.employeeId</code> attribute. 
	 * @param value the employeeId - Employee ID
	 */
	public void setEmployeeId(final SessionContext ctx, final int value)
	{
		setEmployeeId( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyEmployee.employeeId</code> attribute. 
	 * @param value the employeeId - Employee ID
	 */
	public void setEmployeeId(final int value)
	{
		setEmployeeId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyEmployee.employeeName</code> attribute.
	 * @return the employeeName - Employee Name
	 */
	public String getEmployeeName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, EMPLOYEENAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyEmployee.employeeName</code> attribute.
	 * @return the employeeName - Employee Name
	 */
	public String getEmployeeName()
	{
		return getEmployeeName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyEmployee.employeeName</code> attribute. 
	 * @param value the employeeName - Employee Name
	 */
	public void setEmployeeName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, EMPLOYEENAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyEmployee.employeeName</code> attribute. 
	 * @param value the employeeName - Employee Name
	 */
	public void setEmployeeName(final String value)
	{
		setEmployeeName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyEmployee.employeeSalary</code> attribute.
	 * @return the employeeSalary - Employee Salary
	 */
	public Double getEmployeeSalary(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, EMPLOYEESALARY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyEmployee.employeeSalary</code> attribute.
	 * @return the employeeSalary - Employee Salary
	 */
	public Double getEmployeeSalary()
	{
		return getEmployeeSalary( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyEmployee.employeeSalary</code> attribute. 
	 * @return the employeeSalary - Employee Salary
	 */
	public double getEmployeeSalaryAsPrimitive(final SessionContext ctx)
	{
		Double value = getEmployeeSalary( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyEmployee.employeeSalary</code> attribute. 
	 * @return the employeeSalary - Employee Salary
	 */
	public double getEmployeeSalaryAsPrimitive()
	{
		return getEmployeeSalaryAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyEmployee.employeeSalary</code> attribute. 
	 * @param value the employeeSalary - Employee Salary
	 */
	public void setEmployeeSalary(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, EMPLOYEESALARY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyEmployee.employeeSalary</code> attribute. 
	 * @param value the employeeSalary - Employee Salary
	 */
	public void setEmployeeSalary(final Double value)
	{
		setEmployeeSalary( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyEmployee.employeeSalary</code> attribute. 
	 * @param value the employeeSalary - Employee Salary
	 */
	public void setEmployeeSalary(final SessionContext ctx, final double value)
	{
		setEmployeeSalary( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyEmployee.employeeSalary</code> attribute. 
	 * @param value the employeeSalary - Employee Salary
	 */
	public void setEmployeeSalary(final double value)
	{
		setEmployeeSalary( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyEmployee.employeeWorkType</code> attribute.
	 * @return the employeeWorkType - Employee Work Type
	 */
	public EnumerationValue getEmployeeWorkType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, EMPLOYEEWORKTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyEmployee.employeeWorkType</code> attribute.
	 * @return the employeeWorkType - Employee Work Type
	 */
	public EnumerationValue getEmployeeWorkType()
	{
		return getEmployeeWorkType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyEmployee.employeeWorkType</code> attribute. 
	 * @param value the employeeWorkType - Employee Work Type
	 */
	public void setEmployeeWorkType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, EMPLOYEEWORKTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyEmployee.employeeWorkType</code> attribute. 
	 * @param value the employeeWorkType - Employee Work Type
	 */
	public void setEmployeeWorkType(final EnumerationValue value)
	{
		setEmployeeWorkType( getSession().getSessionContext(), value );
	}
	
}
