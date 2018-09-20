package com.revature.util;

import com.revature.dao.CommentDao;
import com.revature.dao.CommentDaoImpl;
import com.revature.dao.GroupDao;
import com.revature.dao.GroupDaoImpl;
import com.revature.dao.PostDao;
import com.revature.dao.PostDaoImpl;
import com.revature.dao.UserDao;
import com.revature.dao.UserDaoImpl;
import com.revature.dao.VoteDao;
import com.revature.dao.VoteDaoImpl;
import com.revature.models.Comment;
import com.revature.models.Group;
import com.revature.models.Post;
import com.revature.models.User;


public class Driver {

	public Driver() {
		super();
	}
	
	public static void main(String[] args) {
		// create some users
		UserDao ud = new UserDaoImpl();
		PostDao pd = new PostDaoImpl();
		CommentDao cd = new CommentDaoImpl();
		GroupDao gd = new GroupDaoImpl();
		VoteDao vd = new VoteDaoImpl();
		User u1 = ud.getUserById("ggl-123");
		User u2 = ud.getUserById("ggl-124");
		Group g1 = gd.getGroupByName("TestGroup");
		pd.createPost(new Post(u1, "Title One", "This is a test post meant to see if our application works. I sure hope it does.", g1));
		pd.createPost(new Post(u1, "Title Two", "Jan, if you're reading this you're the best team leader ever. Thanks for all the awesome design stuff", g1));
		pd.createPost(new Post(u2, "Big Three", "But I must explain to you how all this mistaken idea of denouncing pleasure and praising pain was born and I will give you a complete account of the system, and expound the actual teachings of the great explorer of the truth, the master-builder of human happiness. No one rejects, dislikes, or avoids pleasure itself, because it is pleasure, but because those who do not know how to pursue pleasure rationally encounter consequences that are extremely painful. ", g1));

//		Comment comment1 = new Comment();
	}

}
