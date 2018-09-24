package com.revature.dao;

import java.util.List;

import com.revature.models.Group;

public interface GroupDao {
	List<Group> getGroups();
	Group getGroupById(int id);
	Group getGroupByName(String name);
	Group createGroup(Group group);
	void deleteGroup(Group group);
	Group updateGroup(Group group);
}
