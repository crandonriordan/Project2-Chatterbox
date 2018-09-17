package com.revature.dao;

import java.util.List;

import com.revature.models.Group;

public interface GroupDao {
	List<Group> getGroups();
	Group getGroupsByUserId(String id);
	int createGroup(Group group);
}
