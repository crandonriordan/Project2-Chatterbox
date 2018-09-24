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
		
		/*
		Group g1 = new Group("Coding");
		Group g2 = new Group("WaterPolo");
		Group g3 = new Group("Basketball");
		Group g4 = new Group("Knitting");
		Group g5 = new Group("Cars");
		Group g6 = new Group("GrapeJuiceConnoiseurs");
		Group g7 = new Group("SkyWatching");
		Group g8 = new Group("ProudToBeWomen");
		
		gd.createGroup(g1);
		gd.createGroup(g2);
		gd.createGroup(g3);
		gd.createGroup(g4);
		gd.createGroup(g5);
		gd.createGroup(g6);
		gd.createGroup(g7);
		gd.createGroup(g8);
		
		User u1 = new User("ggl-125", "Elvis");
		User u2 = new User("ggl-126", "Madonna");
		User u3 = new User("ggl-127", "Beyonce");
		User u4 = new User("ggl-128", "Tupac");
		User u5 = new User("ggl-129", "Cher");
		User u6 = new User("ggl-130", "Shakira");
		User u7 = new User("ggl-131", "Adele");
		User u8 = new User("ggl-132", "Rihanna");
		User u9 = new User("ggl-133", "Barack");
		User u10 = new User("ggl-134", "LeBron");
		User u11 = new User("ggl-135", "Sia");
		User u12 = new User("ggl-136", "Usher");
		User u13 = new User("ggl-137", "Shaquille");
		User u14 = new User("ggl-138", "Aaliyah");
		User u15 = new User("ggl-139", "Kobe");
		User u16 = new User("ggl-140", "RuPaul");
		User u17 = new User("ggl-141", "Dolly");
		
		ud.createUser(u1);
		ud.createUser(u2);
		ud.createUser(u3);
		ud.createUser(u4);
		ud.createUser(u5);
		ud.createUser(u6);
		ud.createUser(u7);
		ud.createUser(u8);
		ud.createUser(u9);
		ud.createUser(u10);
		ud.createUser(u11);
		ud.createUser(u12);
		ud.createUser(u13);
		ud.createUser(u14);
		ud.createUser(u15);
		ud.createUser(u16);
		ud.createUser(u17);
=======
//		Group g1 = new Group("Coding");
//		Group g2 = new Group("WaterPolo");
//		Group g3 = new Group("Basketball");
//		Group g4 = new Group("Knitting");
//		Group g5 = new Group("Cars");
//		Group g6 = new Group("GrapeJuiceConnoiseurs");
//		Group g7 = new Group("SkyWatching");
//		Group g8 = new Group("ProudToBeWomen");
>>>>>>> 12eca82716b273a0401971991fd5e8dcf100aafa
		
//		gd.createGroup(g1);
//		gd.createGroup(g2);
//		gd.createGroup(g3);
//		gd.createGroup(g4);
//		gd.createGroup(g5);
//		gd.createGroup(g6);
//		gd.createGroup(g7);
//		gd.createGroup(g8);
//		
//		User u1 = new User("ggl-125", "Elvis");
//		User u2 = new User("ggl-126", "Madonna");
//		User u3 = new User("ggl-127", "Beyonce");
//		User u4 = new User("ggl-128", "Tupac");
//		User u5 = new User("ggl-129", "Cher");
//		User u6 = new User("ggl-130", "Shakira");
//		User u7 = new User("ggl-131", "Adele");
//		User u8 = new User("ggl-132", "Rihanna");
//		User u9 = new User("ggl-133", "Barack");
//		User u10 = new User("ggl-134", "LeBron");
//		User u11 = new User("ggl-135", "Sia");
//		User u12 = new User("ggl-136", "Usher");
//		User u13 = new User("ggl-137", "Shaquille");
//		User u14 = new User("ggl-138", "Aaliyah");
//		User u15 = new User("ggl-139", "Kobe");
//		User u16 = new User("ggl-140", "RuPaul");
//		User u17 = new User("ggl-141", "Dolly");
//		
//		ud.createUser(u1);
//		ud.createUser(u2);
//		ud.createUser(u3);
//		ud.createUser(u4);
//		ud.createUser(u5);
//		ud.createUser(u6);
//		ud.createUser(u7);
//		ud.createUser(u8);
//		ud.createUser(u9);
//		ud.createUser(u10);
//		ud.createUser(u11);
//		ud.createUser(u12);
//		ud.createUser(u13);
//		ud.createUser(u14);
//		ud.createUser(u15);
//		ud.createUser(u16);
//		ud.createUser(u17);
//		
		// Adding user to group and group to user???
		
//		Post p1 = new Post(u10, "Go Browns!", "Congrats to the Browns for their first win in 635 days.", g3);
//		Post p3 = new Post(u15, "LJ Dissing Me?", "LeBron and I are friends, he wasn't dissing me through Drake lyrics.", g3);
//		Post p4 = new Post(u3, "Who run the world?", "Girls.", g8);
//		
//		pd.createPost(p1);
//		pd.createPost(p3);
//		pd.createPost(p4);

		// public Comment(String content, Post post, User user
<<<<<<< HEAD
		Comment c1 = new Comment("That's right. Papa don't preach.", p4, u2);
		Comment c2 = new Comment("I never made it to the school choir because the music teacher didn't like my voice. I was pretty sad. But he was probably right; I did have a voice a bit like a goat, but my dad told me to never give up and to keep going, and it's paid off.\r\n", p4, u6);
		Comment c3 = new Comment("I just want to be the only girl in the world.", p4, u8);
		
		cd.createComment(c1);
		cd.createComment(c2);
		cd.createComment(c3);
		
		// public VoteId(String userId, int postId)
		Vote v1 = new Vote(new VoteId("ggl-126", 3));
		Vote v2 = new Vote(new VoteId("ggl-127", 3));
		Vote v3 = new Vote(new VoteId("ggl-129", 3));
		Vote v4 = new Vote(new VoteId("ggl-130", 3));
		Vote v5 = new Vote(new VoteId("ggl-131", 3));
		Vote v6 = new Vote(new VoteId("ggl-132", 3));
		Vote v7 = new Vote(new VoteId("ggl-135", 3));
		Vote v8 = new Vote(new VoteId("ggl-138", 3));
		Vote v9 = new Vote(new VoteId("ggl-141", 3));
		
		vd.createVote(v1);
		vd.createVote(v2);
		vd.createVote(v3);
		vd.createVote(v4);
		vd.createVote(v5);
		vd.createVote(v6);
		vd.createVote(v7);
		vd.createVote(v8);
		vd.createVote(v9);
		*/
//		Comment c1 = new Comment("That's right. Papa don't preach.", p4, u2);
//		Comment c2 = new Comment("I never made it to the school choir because the music teacher didn't like my voice. I was pretty sad. But he was probably right; I did have a voice a bit like a goat, but my dad told me to never give up and to keep going, and it's paid off.\r\n", p4, u6);
//		Comment c3 = new Comment("I just want to be the only girl in the world.", p4, u8);

		/*
		Group group = gd.getGroupByName("TestGroup");
		User user = new User("twt-512342", "testTwoUser");
		group.addUser(user);
		gd.updateGroup(group);
		System.out.println("test group " + gd.getGroupByName("TestGroup"));
		*/
		
//		user.addGroup(group);
//		ud.createUser(user);
//		ud.updateUser(user);
//		group.addUser(user);
//		gd.updateGroup(group);
//		Group group =
//		group.setId(6);
//		group.setName("SecondTest");
//		gd.createGroup(group);
//		group.addUser();
//		new User("twt-652534", "testTwo").addGroup();
	}

}
