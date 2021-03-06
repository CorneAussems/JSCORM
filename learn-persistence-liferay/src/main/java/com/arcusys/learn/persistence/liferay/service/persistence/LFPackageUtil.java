package com.arcusys.learn.persistence.liferay.service.persistence;

import com.arcusys.learn.persistence.liferay.model.LFPackage;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the l f package service. This utility wraps {@link LFPackagePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LFPackagePersistence
 * @see LFPackagePersistenceImpl
 * @generated
 */
public class LFPackageUtil {
    private static LFPackagePersistence _persistence;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
     */
    public static void clearCache() {
        getPersistence().clearCache();
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
     */
    public static void clearCache(LFPackage lfPackage) {
        getPersistence().clearCache(lfPackage);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
     */
    public long countWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().countWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
     */
    public static List<LFPackage> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<LFPackage> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<LFPackage> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
     */
    public static LFPackage update(LFPackage lfPackage, boolean merge)
        throws SystemException {
        return getPersistence().update(lfPackage, merge);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
     */
    public static LFPackage update(LFPackage lfPackage, boolean merge,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(lfPackage, merge, serviceContext);
    }

    /**
    * Caches the l f package in the entity cache if it is enabled.
    *
    * @param lfPackage the l f package
    */
    public static void cacheResult(
        com.arcusys.learn.persistence.liferay.model.LFPackage lfPackage) {
        getPersistence().cacheResult(lfPackage);
    }

    /**
    * Caches the l f packages in the entity cache if it is enabled.
    *
    * @param lfPackages the l f packages
    */
    public static void cacheResult(
        java.util.List<com.arcusys.learn.persistence.liferay.model.LFPackage> lfPackages) {
        getPersistence().cacheResult(lfPackages);
    }

    /**
    * Creates a new l f package with the primary key. Does not add the l f package to the database.
    *
    * @param id the primary key for the new l f package
    * @return the new l f package
    */
    public static com.arcusys.learn.persistence.liferay.model.LFPackage create(
        long id) {
        return getPersistence().create(id);
    }

    /**
    * Removes the l f package with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the l f package
    * @return the l f package that was removed
    * @throws com.arcusys.learn.persistence.liferay.NoSuchLFPackageException if a l f package with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.arcusys.learn.persistence.liferay.model.LFPackage remove(
        long id)
        throws com.arcusys.learn.persistence.liferay.NoSuchLFPackageException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().remove(id);
    }

    public static com.arcusys.learn.persistence.liferay.model.LFPackage updateImpl(
        com.arcusys.learn.persistence.liferay.model.LFPackage lfPackage,
        boolean merge)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(lfPackage, merge);
    }

    /**
    * Returns the l f package with the primary key or throws a {@link com.arcusys.learn.persistence.liferay.NoSuchLFPackageException} if it could not be found.
    *
    * @param id the primary key of the l f package
    * @return the l f package
    * @throws com.arcusys.learn.persistence.liferay.NoSuchLFPackageException if a l f package with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.arcusys.learn.persistence.liferay.model.LFPackage findByPrimaryKey(
        long id)
        throws com.arcusys.learn.persistence.liferay.NoSuchLFPackageException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByPrimaryKey(id);
    }

    /**
    * Returns the l f package with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param id the primary key of the l f package
    * @return the l f package, or <code>null</code> if a l f package with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.arcusys.learn.persistence.liferay.model.LFPackage fetchByPrimaryKey(
        long id) throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(id);
    }

    /**
    * Returns the l f package where assetRefID = &#63; or throws a {@link com.arcusys.learn.persistence.liferay.NoSuchLFPackageException} if it could not be found.
    *
    * @param assetRefID the asset ref i d
    * @return the matching l f package
    * @throws com.arcusys.learn.persistence.liferay.NoSuchLFPackageException if a matching l f package could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.arcusys.learn.persistence.liferay.model.LFPackage findByRefID(
        java.lang.Long assetRefID)
        throws com.arcusys.learn.persistence.liferay.NoSuchLFPackageException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByRefID(assetRefID);
    }

    /**
    * Returns the l f package where assetRefID = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param assetRefID the asset ref i d
    * @return the matching l f package, or <code>null</code> if a matching l f package could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.arcusys.learn.persistence.liferay.model.LFPackage fetchByRefID(
        java.lang.Long assetRefID)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByRefID(assetRefID);
    }

    /**
    * Returns the l f package where assetRefID = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param assetRefID the asset ref i d
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching l f package, or <code>null</code> if a matching l f package could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.arcusys.learn.persistence.liferay.model.LFPackage fetchByRefID(
        java.lang.Long assetRefID, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByRefID(assetRefID, retrieveFromCache);
    }

    /**
    * Returns all the l f packages where courseID = &#63;.
    *
    * @param courseID the course i d
    * @return the matching l f packages
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.arcusys.learn.persistence.liferay.model.LFPackage> findByInstance(
        java.lang.Integer courseID)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByInstance(courseID);
    }

    /**
    * Returns a range of all the l f packages where courseID = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param courseID the course i d
    * @param start the lower bound of the range of l f packages
    * @param end the upper bound of the range of l f packages (not inclusive)
    * @return the range of matching l f packages
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.arcusys.learn.persistence.liferay.model.LFPackage> findByInstance(
        java.lang.Integer courseID, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByInstance(courseID, start, end);
    }

    /**
    * Returns an ordered range of all the l f packages where courseID = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param courseID the course i d
    * @param start the lower bound of the range of l f packages
    * @param end the upper bound of the range of l f packages (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching l f packages
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.arcusys.learn.persistence.liferay.model.LFPackage> findByInstance(
        java.lang.Integer courseID, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByInstance(courseID, start, end, orderByComparator);
    }

    /**
    * Returns the first l f package in the ordered set where courseID = &#63;.
    *
    * @param courseID the course i d
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching l f package
    * @throws com.arcusys.learn.persistence.liferay.NoSuchLFPackageException if a matching l f package could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.arcusys.learn.persistence.liferay.model.LFPackage findByInstance_First(
        java.lang.Integer courseID,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.arcusys.learn.persistence.liferay.NoSuchLFPackageException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByInstance_First(courseID, orderByComparator);
    }

    /**
    * Returns the first l f package in the ordered set where courseID = &#63;.
    *
    * @param courseID the course i d
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching l f package, or <code>null</code> if a matching l f package could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.arcusys.learn.persistence.liferay.model.LFPackage fetchByInstance_First(
        java.lang.Integer courseID,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByInstance_First(courseID, orderByComparator);
    }

    /**
    * Returns the last l f package in the ordered set where courseID = &#63;.
    *
    * @param courseID the course i d
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching l f package
    * @throws com.arcusys.learn.persistence.liferay.NoSuchLFPackageException if a matching l f package could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.arcusys.learn.persistence.liferay.model.LFPackage findByInstance_Last(
        java.lang.Integer courseID,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.arcusys.learn.persistence.liferay.NoSuchLFPackageException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByInstance_Last(courseID, orderByComparator);
    }

    /**
    * Returns the last l f package in the ordered set where courseID = &#63;.
    *
    * @param courseID the course i d
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching l f package, or <code>null</code> if a matching l f package could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.arcusys.learn.persistence.liferay.model.LFPackage fetchByInstance_Last(
        java.lang.Integer courseID,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByInstance_Last(courseID, orderByComparator);
    }

    /**
    * Returns the l f packages before and after the current l f package in the ordered set where courseID = &#63;.
    *
    * @param id the primary key of the current l f package
    * @param courseID the course i d
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next l f package
    * @throws com.arcusys.learn.persistence.liferay.NoSuchLFPackageException if a l f package with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.arcusys.learn.persistence.liferay.model.LFPackage[] findByInstance_PrevAndNext(
        long id, java.lang.Integer courseID,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.arcusys.learn.persistence.liferay.NoSuchLFPackageException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByInstance_PrevAndNext(id, courseID, orderByComparator);
    }

    /**
    * Returns all the l f packages where courseID = any &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param courseIDs the course i ds
    * @return the matching l f packages
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.arcusys.learn.persistence.liferay.model.LFPackage> findByInstance(
        java.lang.Integer[] courseIDs)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByInstance(courseIDs);
    }

    /**
    * Returns a range of all the l f packages where courseID = any &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param courseIDs the course i ds
    * @param start the lower bound of the range of l f packages
    * @param end the upper bound of the range of l f packages (not inclusive)
    * @return the range of matching l f packages
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.arcusys.learn.persistence.liferay.model.LFPackage> findByInstance(
        java.lang.Integer[] courseIDs, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByInstance(courseIDs, start, end);
    }

    /**
    * Returns an ordered range of all the l f packages where courseID = any &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param courseIDs the course i ds
    * @param start the lower bound of the range of l f packages
    * @param end the upper bound of the range of l f packages (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching l f packages
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.arcusys.learn.persistence.liferay.model.LFPackage> findByInstance(
        java.lang.Integer[] courseIDs, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByInstance(courseIDs, start, end, orderByComparator);
    }

    /**
    * Returns all the l f packages where courseID = &#63;.
    *
    * @param courseID the course i d
    * @return the matching l f packages
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.arcusys.learn.persistence.liferay.model.LFPackage> findByCourseID(
        java.lang.Integer courseID)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByCourseID(courseID);
    }

    /**
    * Returns a range of all the l f packages where courseID = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param courseID the course i d
    * @param start the lower bound of the range of l f packages
    * @param end the upper bound of the range of l f packages (not inclusive)
    * @return the range of matching l f packages
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.arcusys.learn.persistence.liferay.model.LFPackage> findByCourseID(
        java.lang.Integer courseID, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByCourseID(courseID, start, end);
    }

    /**
    * Returns an ordered range of all the l f packages where courseID = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param courseID the course i d
    * @param start the lower bound of the range of l f packages
    * @param end the upper bound of the range of l f packages (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching l f packages
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.arcusys.learn.persistence.liferay.model.LFPackage> findByCourseID(
        java.lang.Integer courseID, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByCourseID(courseID, start, end, orderByComparator);
    }

    /**
    * Returns the first l f package in the ordered set where courseID = &#63;.
    *
    * @param courseID the course i d
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching l f package
    * @throws com.arcusys.learn.persistence.liferay.NoSuchLFPackageException if a matching l f package could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.arcusys.learn.persistence.liferay.model.LFPackage findByCourseID_First(
        java.lang.Integer courseID,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.arcusys.learn.persistence.liferay.NoSuchLFPackageException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByCourseID_First(courseID, orderByComparator);
    }

    /**
    * Returns the first l f package in the ordered set where courseID = &#63;.
    *
    * @param courseID the course i d
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching l f package, or <code>null</code> if a matching l f package could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.arcusys.learn.persistence.liferay.model.LFPackage fetchByCourseID_First(
        java.lang.Integer courseID,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByCourseID_First(courseID, orderByComparator);
    }

    /**
    * Returns the last l f package in the ordered set where courseID = &#63;.
    *
    * @param courseID the course i d
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching l f package
    * @throws com.arcusys.learn.persistence.liferay.NoSuchLFPackageException if a matching l f package could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.arcusys.learn.persistence.liferay.model.LFPackage findByCourseID_Last(
        java.lang.Integer courseID,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.arcusys.learn.persistence.liferay.NoSuchLFPackageException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByCourseID_Last(courseID, orderByComparator);
    }

    /**
    * Returns the last l f package in the ordered set where courseID = &#63;.
    *
    * @param courseID the course i d
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching l f package, or <code>null</code> if a matching l f package could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.arcusys.learn.persistence.liferay.model.LFPackage fetchByCourseID_Last(
        java.lang.Integer courseID,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByCourseID_Last(courseID, orderByComparator);
    }

    /**
    * Returns the l f packages before and after the current l f package in the ordered set where courseID = &#63;.
    *
    * @param id the primary key of the current l f package
    * @param courseID the course i d
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next l f package
    * @throws com.arcusys.learn.persistence.liferay.NoSuchLFPackageException if a l f package with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.arcusys.learn.persistence.liferay.model.LFPackage[] findByCourseID_PrevAndNext(
        long id, java.lang.Integer courseID,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.arcusys.learn.persistence.liferay.NoSuchLFPackageException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByCourseID_PrevAndNext(id, courseID, orderByComparator);
    }

    /**
    * Returns all the l f packages.
    *
    * @return the l f packages
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.arcusys.learn.persistence.liferay.model.LFPackage> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the l f packages.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param start the lower bound of the range of l f packages
    * @param end the upper bound of the range of l f packages (not inclusive)
    * @return the range of l f packages
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.arcusys.learn.persistence.liferay.model.LFPackage> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the l f packages.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param start the lower bound of the range of l f packages
    * @param end the upper bound of the range of l f packages (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of l f packages
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.arcusys.learn.persistence.liferay.model.LFPackage> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes the l f package where assetRefID = &#63; from the database.
    *
    * @param assetRefID the asset ref i d
    * @return the l f package that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.arcusys.learn.persistence.liferay.model.LFPackage removeByRefID(
        java.lang.Long assetRefID)
        throws com.arcusys.learn.persistence.liferay.NoSuchLFPackageException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().removeByRefID(assetRefID);
    }

    /**
    * Removes all the l f packages where courseID = &#63; from the database.
    *
    * @param courseID the course i d
    * @throws SystemException if a system exception occurred
    */
    public static void removeByInstance(java.lang.Integer courseID)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByInstance(courseID);
    }

    /**
    * Removes all the l f packages where courseID = &#63; from the database.
    *
    * @param courseID the course i d
    * @throws SystemException if a system exception occurred
    */
    public static void removeByCourseID(java.lang.Integer courseID)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByCourseID(courseID);
    }

    /**
    * Removes all the l f packages from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of l f packages where assetRefID = &#63;.
    *
    * @param assetRefID the asset ref i d
    * @return the number of matching l f packages
    * @throws SystemException if a system exception occurred
    */
    public static int countByRefID(java.lang.Long assetRefID)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByRefID(assetRefID);
    }

    /**
    * Returns the number of l f packages where courseID = &#63;.
    *
    * @param courseID the course i d
    * @return the number of matching l f packages
    * @throws SystemException if a system exception occurred
    */
    public static int countByInstance(java.lang.Integer courseID)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByInstance(courseID);
    }

    /**
    * Returns the number of l f packages where courseID = any &#63;.
    *
    * @param courseIDs the course i ds
    * @return the number of matching l f packages
    * @throws SystemException if a system exception occurred
    */
    public static int countByInstance(java.lang.Integer[] courseIDs)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByInstance(courseIDs);
    }

    /**
    * Returns the number of l f packages where courseID = &#63;.
    *
    * @param courseID the course i d
    * @return the number of matching l f packages
    * @throws SystemException if a system exception occurred
    */
    public static int countByCourseID(java.lang.Integer courseID)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByCourseID(courseID);
    }

    /**
    * Returns the number of l f packages.
    *
    * @return the number of l f packages
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static LFPackagePersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (LFPackagePersistence) PortletBeanLocatorUtil.locate(com.arcusys.learn.persistence.liferay.service.ClpSerializer.getServletContextName(),
                    LFPackagePersistence.class.getName());

            ReferenceRegistry.registerReference(LFPackageUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated
     */
    public void setPersistence(LFPackagePersistence persistence) {
    }
}
