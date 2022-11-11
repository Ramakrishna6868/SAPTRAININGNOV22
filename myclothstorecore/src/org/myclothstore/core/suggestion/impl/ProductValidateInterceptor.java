//package de.hybris.platform.validate.interceptors;
package org.myclothstore.core.suggestion.impl;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.core.model.type.TypeModel;
import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.ValidateInterceptor;
import de.hybris.platform.servicelayer.type.TypeService;
import de.hybris.platform.variants.model.VariantProductModel;
import de.hybris.platform.variants.model.VariantTypeModel;
import org.springframework.beans.factory.annotation.Required;
/**
 * Interceptor, which makes some operations (checking base product and base variant type) on variant product, which is
 * being created.
 * <p> * Interceptor is being performed only if the given {@link VariantProductModel} is newly created or it's
 * {@link VariantProductModel#BASEPRODUCT} is modified.
 */
public class ProductValidateInterceptor implements ValidateInterceptor<ProductModel>
{
    private static final String NOT_ALLOWED_ERROR ="NUMBERS ARE not allowed";

    public static boolean isNumeric(String str) {

        return str != null && str.matches("[-+]?\\d*\\.?\\d+");
    }



    @Override
    public void onValidate(final ProductModel productModel, final InterceptorContext ctx) throws InterceptorException
    {
		System.out.println("##############################################################################");
		System.out.println("######################ProductValidateInterceptor##############################");
        if (productModel instanceof ProductModel)
        {
           if (isNumeric(productModel.getName()))
            {
				System.out.println("productModel:::Name::"+productModel.getName());
				System.out.println("productModel:::Code::"+productModel.getCode());
                throw new InterceptorException(NOT_ALLOWED_ERROR);
            }

			
        }
    }

	
}
