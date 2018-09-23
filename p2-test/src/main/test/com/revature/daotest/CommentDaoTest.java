package com.revature.daotest;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;

import com.revature.dao.CommentDaoImpl;
import com.revature.models.Comment;
import p2-mvc

public class CommentDaoTest {
	static final Logger logger = Logger.getLogger(CommentDaoTest.class);
	CommentDaoImpl cdi = new CommentDaoImpl();
	
	@Test 
	public void canRetrieveAllComments() {
		List<Comment> comments = cdi.getComments();
		
		// User a = new User();
		// User b = new User();

        assertThat(comments, hasItems(
        		new Comment()
                // new Comment("COMMENT 1 GOES HERE", new Post(a, "TITLE 1")),
                // new Comment("COMMENT 2 GOES HERE", new Post(b, "TITLE 2"))
        ));
	}
	
	@Test
	public void canRetrieveCommentByUserId() {
		cdi.getCommentsByUserId();
	}
}


/*
 * 
public class DaoTest {

	
	static final Logger logger = Logger.getLogger(DaoTest.class);
	
	@Test
	public void canCreateManager() {
		Hasher hasher = new Hasher();
		try(Connection con = ConnectionUtil.getConnection()) {
			con.commit();
			con.setAutoCommit(false);
			EmpDaoImpl edi = new EmpDaoImpl();
			Employee employee = new Employee();
			employee.setId(52125);
			employee.setName("Karen Goslo");
			employee.setIsManager(1);
			employee.setUsername("kgoslo");
			employee.setPassword(hasher.getHashPassword("password"));
			employee.setEmail("kgoslo@gmail.com");
			assertEquals(1, edi.createManager(employee));
			con.rollback();
		} catch (SQLException | IOException e) {
			logger.info("createUserWorks() test threw exception " + e.getMessage());
		}
	}
	
	@Test
	public void canCreateEmployee() {
		Hasher hasher = new Hasher();
		
		try(Connection con = ConnectionUtil.getConnection()) {
			con.commit();
			con.setAutoCommit(false);
			EmpDaoImpl edi = new EmpDaoImpl();
			Employee employee = new Employee();
			employee.setId(52121);
			employee.setName("Karen Goslo");
			employee.setIsManager(0);
			employee.setUsername("kgoslo");
			employee.setPassword(hasher.getHashPassword("password"));
			employee.setEmail("kgoslo@gmail.com");
			assertEquals(1, edi.createEmployee(employee));
			con.rollback();
		} catch (SQLException | IOException e) {
			logger.info("createUserWorks() test threw exception " + e.getMessage());
		}
	}
	
	@Test 
	public void canRetrieveEmployeeByEmail() {
		EmpDaoImpl edi = new EmpDaoImpl();
		Employee emp = edi.getEmployeeByEmail("michaelscott@gmail.com");
		assertEquals("michaelscott", emp.getUsername());
	}
	
	@Test 
	public void canRetrieveManagerByUsername() {
		EmpDaoImpl edi = new EmpDaoImpl();
		Employee emp = edi.getEmployeeByUsername("michaelscott");
		assertEquals("michaelscott", emp.getUsername());
	}
	
	@Test
	public void canRetrieveEmployeeById() {
		EmpDaoImpl edi = new EmpDaoImpl();
		Employee emp = edi.getEmployeeById(21);
		assertEquals("michaelscott", emp.getUsername());
	}
	
	@Test
	public void cantRetrieveNonExistentEmlpoyee() {
		EmpDaoImpl edi = new EmpDaoImpl();
		Employee emp = edi.getEmployeeById(90);
		assertEquals(null, emp);
	}
	
	@Test
	public void canCreateReimbursment() {
		try(Connection con = ConnectionUtil.getConnection()) {
			con.commit();
			con.setAutoCommit(false);
			Reimbursment reimbursment = new Reimbursment();
			reimbursment.setAmount(new BigDecimal(500));
			reimbursment.setCurrentState("pending");
			reimbursment.setEmployeeId(52121);
			reimbursment.setManagerId(51215);
			reimbursment.setReimbursmentId(1000);
			
			ReimbursmentDaoImpl rdi = new ReimbursmentDaoImpl();
			assertEquals(1, rdi.createReimbursment(reimbursment));
			con.rollback();
		} catch (SQLException | IOException e) {
			logger.info("test threw exception " + e.getMessage());
		}
		
	}
	
	@Test
	public void canCreateReimbursmentWithIncompleteData() {
		try(Connection con = ConnectionUtil.getConnection()) {
			con.commit();
			con.setAutoCommit(false);
			Reimbursment reimbursment = new Reimbursment();
			reimbursment.setAmount(new BigDecimal(24124));
			reimbursment.setEmployeeId(52121);
			
			ReimbursmentDaoImpl rdi = new ReimbursmentDaoImpl();
			assertEquals(1, rdi.createReimbursment(reimbursment));
			con.rollback();
		} catch (SQLException | IOException e) {
			logger.info("test threw exception " + e.getMessage());
		}
		
	}
	
	
	

}
 */