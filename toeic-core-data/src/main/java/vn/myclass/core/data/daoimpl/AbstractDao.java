package vn.myclass.core.data.daoimpl;

import org.hibernate.Session;
import vn.myclass.core.common.utils.HibernateUtil;
import vn.myclass.core.data.dao.GenericDao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

public class AbstractDao<ID extends Serializable, T> implements GenericDao<ID,T> {
    private Class<T> persitenceClass;

    public AbstractDao(){
        this.persitenceClass = (Class<T>) ((ParameterizedType)getClass().getGenericSuperclass()).getActualTypeArguments()[1];
    }
    protected Session getSession(){
        return HibernateUtil.getSessionFactory().openSession();
    }
    @Override
    public List<T> findAll() {
        return null;
    }
}
