package com.revature.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.revature.dao.GroupDao;
import com.revature.dao.GroupDaoImpl;
import com.revature.models.Group;

@Service
public class GroupService {

	private GroupDao gd = new GroupDaoImpl();
	
	public GroupService() {
		super();
	}
	
	public List<Group> listAllGroups() {
		return gd.getGroups();
	}
	
	public Group findGroupById(int id) {
		return gd.getGroupById(id);
	}
	
	public Group findGroupByName(String name) {
		return gd.getGroupByName(name);
	}
	
	public Group createGroup(Group group) {
		return gd.createGroup(group);
	}
}
