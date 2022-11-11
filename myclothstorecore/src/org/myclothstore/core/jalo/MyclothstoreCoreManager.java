/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package org.myclothstore.core.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import org.myclothstore.core.constants.MyclothstoreCoreConstants;
import org.myclothstore.core.setup.CoreSystemSetup;


/**
 * Do not use, please use {@link CoreSystemSetup} instead.
 * 
 */
public class MyclothstoreCoreManager extends GeneratedMyclothstoreCoreManager
{
	public static final MyclothstoreCoreManager getInstance()
	{
		final ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (MyclothstoreCoreManager) em.getExtension(MyclothstoreCoreConstants.EXTENSIONNAME);
	}
}
