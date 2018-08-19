package com.enquiry.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.enquiry.model.UsersQueries;

@Repository
public class EnquiryRepository {
	
	@Autowired
	public HibernateTemplate ht;
	
	/**
	 * this method is used for save enquiry in the database.
	 * */
	
	public void saveEnquiry(UsersQueries usersQueries)
	{
		ht.save("UsersQueries", usersQueries);
	}
	
}
