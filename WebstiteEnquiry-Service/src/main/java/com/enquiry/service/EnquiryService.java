package com.enquiry.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.enquiry.model.UsersQueries;
import com.enquiry.repo.EnquiryRepository;


@Service
public class EnquiryService {

	
	@Autowired
	private EnquiryRepository enquiryRepository;
	
	/**
	 * this method is used for communicate the DataLayer.
	 * */
	
	public void saveEnquiry(UsersQueries usersQueries )
	{
		enquiryRepository.saveEnquiry(usersQueries);
	}
	
}
