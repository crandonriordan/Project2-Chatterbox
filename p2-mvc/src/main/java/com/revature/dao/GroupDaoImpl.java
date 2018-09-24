package com.revature.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.revature.models.Group;
import com.revature.models.Post;
import com.revature.util.HibernateUtil;

public class GroupDaoImpl implements GroupDao {

	@Override
	public List<Group> getGroups() {
		Session s = HibernateUtil.getSession();
		Query q = s.createQuery("from Group");
		List<Group> groups = q.list();
		s.close();
		return groups;
	}

	@Override
	public Group getGroupById(int id) {
		Session s = HibernateUtil.getSession();
		Group g = (Group) s.get(Group.class, id);
		s.close();
		return g;
	}
	
	@Override
	public Group getGroupByName(String name) {
		Session s = HibernateUtil.getSession();
		Query q = s.createQuery("from Group g where g.name = :userName");
		q.setString("userName", name);
		// avoiding index out of bounds exception
		if(q.list().size() == 0) {
			return null;
		}
		
		Group g = (Group) q.list().get(0);
		s.close();
		return g;
	}
	
	

	@Override
	public Group createGroup(Group group) {
		Session s = HibernateUtil.getSession();
		Transaction tx = s.beginTransaction();
		int groupPK = (int) s.save(group);
		tx.commit();
		s.close();
		return group;
	}

	@Override
	public void deleteGroup(Group group) {
		Session s = HibernateUtil.getSession();
		Transaction tx = s.beginTransaction();
		s.delete(group);
		tx.commit();
		s.close();
	}
	public Group updateGroup(Group group) {
		Session s = HibernateUtil.getSession();
		Transaction tx = s.beginTransaction();
		s.update(group);
		s.close();
		tx.commit();
		return group;
	}

}