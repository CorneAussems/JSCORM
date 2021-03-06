package com.arcusys.learn.persistence.liferay.model.impl;

import com.arcusys.learn.persistence.liferay.model.LFBigDecimal;
import com.arcusys.learn.persistence.liferay.service.LFBigDecimalLocalServiceUtil;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * The extended model base implementation for the LFBigDecimal service. Represents a row in the &quot;Learn_LFBigDecimal&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link LFBigDecimalImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LFBigDecimalImpl
 * @see com.arcusys.learn.persistence.liferay.model.LFBigDecimal
 * @generated
 */
public abstract class LFBigDecimalBaseImpl extends LFBigDecimalModelImpl
    implements LFBigDecimal {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a l f big decimal model instance should use the {@link LFBigDecimal} interface instead.
     */
    public void persist() throws SystemException {
        if (this.isNew()) {
            LFBigDecimalLocalServiceUtil.addLFBigDecimal(this);
        } else {
            LFBigDecimalLocalServiceUtil.updateLFBigDecimal(this);
        }
    }
}
