package sjc.app.repository.hibernate;

import java.util.List;

import org.hibernate.criterion.Criterion;

import sjc.app.repository.base.GenericDao;

public interface HibernateDao<T> extends GenericDao<T> {
	
	List<T> findByCriteria(Criterion criterion);

}
