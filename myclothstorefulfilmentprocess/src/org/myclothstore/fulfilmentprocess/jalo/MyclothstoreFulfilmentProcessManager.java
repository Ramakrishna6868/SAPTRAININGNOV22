/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package org.myclothstore.fulfilmentprocess.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import org.myclothstore.fulfilmentprocess.constants.MyclothstoreFulfilmentProcessConstants;

public class MyclothstoreFulfilmentProcessManager extends GeneratedMyclothstoreFulfilmentProcessManager
{
	public static final MyclothstoreFulfilmentProcessManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (MyclothstoreFulfilmentProcessManager) em.getExtension(MyclothstoreFulfilmentProcessConstants.EXTENSIONNAME);
	}
	
}
