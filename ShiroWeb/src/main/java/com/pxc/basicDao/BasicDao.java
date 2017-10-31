package com.pxc.basicDao;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.io.Serializable;
import java.util.List;

/**
 * Created by pxc on 2017/10/31.
 */
public interface BasicDao<T>{

    Serializable save(T instance);
    void delete(T instance);
    void update(T instance);
    void saveOrUpdate(T instance);
    T findById(Serializable id);
    List<T> findAll();
    List<T> findByProperty(String propertyName, Object value);
    Object uniqueResult(final String hql,final Object... paras);
    List findByHql(String hql,Object... paras);
    Integer executeByHql(final String hql,final Object... paras);
    List findByHqlInCache(final String hql,final Object... paras);
    List findPage(final String hql,final int maxResult,final int firstResult,final Object... paras);
    List findBySQLQuery(final String sql,final Object... paras);

}
