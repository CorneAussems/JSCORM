package com.arcusys.learn.persistence.liferay.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * <p>
 * This class is a wrapper for {@link LFActivityStateNodeLocalService}.
 * </p>
 *
 * @author    Brian Wing Shun Chan
 * @see       LFActivityStateNodeLocalService
 * @generated
 */
public class LFActivityStateNodeLocalServiceWrapper
    implements LFActivityStateNodeLocalService,
        ServiceWrapper<LFActivityStateNodeLocalService> {
    private LFActivityStateNodeLocalService _lfActivityStateNodeLocalService;

    public LFActivityStateNodeLocalServiceWrapper(
        LFActivityStateNodeLocalService lfActivityStateNodeLocalService) {
        _lfActivityStateNodeLocalService = lfActivityStateNodeLocalService;
    }

    /**
    * Adds the l f activity state node to the database. Also notifies the appropriate model listeners.
    *
    * @param lfActivityStateNode the l f activity state node
    * @return the l f activity state node that was added
    * @throws SystemException if a system exception occurred
    */
    public com.arcusys.learn.persistence.liferay.model.LFActivityStateNode addLFActivityStateNode(
        com.arcusys.learn.persistence.liferay.model.LFActivityStateNode lfActivityStateNode)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _lfActivityStateNodeLocalService.addLFActivityStateNode(lfActivityStateNode);
    }

    /**
    * Creates a new l f activity state node with the primary key. Does not add the l f activity state node to the database.
    *
    * @param id the primary key for the new l f activity state node
    * @return the new l f activity state node
    */
    public com.arcusys.learn.persistence.liferay.model.LFActivityStateNode createLFActivityStateNode(
        long id) {
        return _lfActivityStateNodeLocalService.createLFActivityStateNode(id);
    }

    /**
    * Deletes the l f activity state node with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the l f activity state node
    * @return the l f activity state node that was removed
    * @throws PortalException if a l f activity state node with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.arcusys.learn.persistence.liferay.model.LFActivityStateNode deleteLFActivityStateNode(
        long id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _lfActivityStateNodeLocalService.deleteLFActivityStateNode(id);
    }

    /**
    * Deletes the l f activity state node from the database. Also notifies the appropriate model listeners.
    *
    * @param lfActivityStateNode the l f activity state node
    * @return the l f activity state node that was removed
    * @throws SystemException if a system exception occurred
    */
    public com.arcusys.learn.persistence.liferay.model.LFActivityStateNode deleteLFActivityStateNode(
        com.arcusys.learn.persistence.liferay.model.LFActivityStateNode lfActivityStateNode)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _lfActivityStateNodeLocalService.deleteLFActivityStateNode(lfActivityStateNode);
    }

    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _lfActivityStateNodeLocalService.dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _lfActivityStateNodeLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @return the range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return _lfActivityStateNodeLocalService.dynamicQuery(dynamicQuery,
            start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _lfActivityStateNodeLocalService.dynamicQuery(dynamicQuery,
            start, end, orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _lfActivityStateNodeLocalService.dynamicQueryCount(dynamicQuery);
    }

    public com.arcusys.learn.persistence.liferay.model.LFActivityStateNode fetchLFActivityStateNode(
        long id) throws com.liferay.portal.kernel.exception.SystemException {
        return _lfActivityStateNodeLocalService.fetchLFActivityStateNode(id);
    }

    /**
    * Returns the l f activity state node with the primary key.
    *
    * @param id the primary key of the l f activity state node
    * @return the l f activity state node
    * @throws PortalException if a l f activity state node with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.arcusys.learn.persistence.liferay.model.LFActivityStateNode getLFActivityStateNode(
        long id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _lfActivityStateNodeLocalService.getLFActivityStateNode(id);
    }

    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _lfActivityStateNodeLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the l f activity state nodes.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param start the lower bound of the range of l f activity state nodes
    * @param end the upper bound of the range of l f activity state nodes (not inclusive)
    * @return the range of l f activity state nodes
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.arcusys.learn.persistence.liferay.model.LFActivityStateNode> getLFActivityStateNodes(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _lfActivityStateNodeLocalService.getLFActivityStateNodes(start,
            end);
    }

    /**
    * Returns the number of l f activity state nodes.
    *
    * @return the number of l f activity state nodes
    * @throws SystemException if a system exception occurred
    */
    public int getLFActivityStateNodesCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _lfActivityStateNodeLocalService.getLFActivityStateNodesCount();
    }

    /**
    * Updates the l f activity state node in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param lfActivityStateNode the l f activity state node
    * @return the l f activity state node that was updated
    * @throws SystemException if a system exception occurred
    */
    public com.arcusys.learn.persistence.liferay.model.LFActivityStateNode updateLFActivityStateNode(
        com.arcusys.learn.persistence.liferay.model.LFActivityStateNode lfActivityStateNode)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _lfActivityStateNodeLocalService.updateLFActivityStateNode(lfActivityStateNode);
    }

    /**
    * Updates the l f activity state node in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param lfActivityStateNode the l f activity state node
    * @param merge whether to merge the l f activity state node with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
    * @return the l f activity state node that was updated
    * @throws SystemException if a system exception occurred
    */
    public com.arcusys.learn.persistence.liferay.model.LFActivityStateNode updateLFActivityStateNode(
        com.arcusys.learn.persistence.liferay.model.LFActivityStateNode lfActivityStateNode,
        boolean merge)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _lfActivityStateNodeLocalService.updateLFActivityStateNode(lfActivityStateNode,
            merge);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public java.lang.String getBeanIdentifier() {
        return _lfActivityStateNodeLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _lfActivityStateNodeLocalService.setBeanIdentifier(beanIdentifier);
    }

    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _lfActivityStateNodeLocalService.invokeMethod(name,
            parameterTypes, arguments);
    }

    public com.arcusys.learn.persistence.liferay.model.LFActivityStateNode createLFActivityStateNode()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _lfActivityStateNodeLocalService.createLFActivityStateNode();
    }

    public java.util.List<com.arcusys.learn.persistence.liferay.model.LFActivityStateNode> findByTreeID(
        java.lang.Integer treeID)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _lfActivityStateNodeLocalService.findByTreeID(treeID);
    }

    public java.util.List<com.arcusys.learn.persistence.liferay.model.LFActivityStateNode> findByTreeIDAndParentID(
        java.lang.Integer treeID, java.lang.Integer parentID)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _lfActivityStateNodeLocalService.findByTreeIDAndParentID(treeID,
            parentID);
    }

    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        _lfActivityStateNodeLocalService.removeAll();
    }

    /**
     * @deprecated Renamed to {@link #getWrappedService}
     */
    public LFActivityStateNodeLocalService getWrappedLFActivityStateNodeLocalService() {
        return _lfActivityStateNodeLocalService;
    }

    /**
     * @deprecated Renamed to {@link #setWrappedService}
     */
    public void setWrappedLFActivityStateNodeLocalService(
        LFActivityStateNodeLocalService lfActivityStateNodeLocalService) {
        _lfActivityStateNodeLocalService = lfActivityStateNodeLocalService;
    }

    public LFActivityStateNodeLocalService getWrappedService() {
        return _lfActivityStateNodeLocalService;
    }

    public void setWrappedService(
        LFActivityStateNodeLocalService lfActivityStateNodeLocalService) {
        _lfActivityStateNodeLocalService = lfActivityStateNodeLocalService;
    }
}
