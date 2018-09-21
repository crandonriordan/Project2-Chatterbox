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
import com.revature.models.User;
import com.revature.models.Vote;
import com.revature.models.VoteId;


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
//		ud.createUser(new User("ggl-123", "bob"));
//		ud.createUser(new User("ggl-124", "bob1"));
//		ud.createUser(new User("ggl-125", "bob2"));
//		ud.createUser(new User("ggl-126", "bob3"));
//		User u1 = ud.getUserById("ggl-123");
//		User u2 = ud.getUserById("ggl-124");
//		gd.createGroup(new Group("Test Group"));
//		Group g1 = gd.getGroupByName("Test Group");
//		pd.createPost(new Post(u1, "Title One", "This is a test post meant to see if our application works. I sure hope it does.", g1));
//		pd.createPost(new Post(u1, "Title Two", "Jan, if you're reading this you're the best team leader ever. Thanks for all the awesome design stuff", g1));
//		pd.createPost(new Post(u2, "Big Three", "LOREM IPSUMDasdffFfdsafsd SAFSDFASDFASDF ASfsdfasdfDFASDFASDF fsadfasdfASD", g1));

//		VoteId voteId = new VoteId("ggl-123", 3);
//		Vote vote = new Vote(voteId);
//		vd.createVote(vote);
		
		System.out.println(pd.getPostsByGroupName("TestGroup"));
	}

}
