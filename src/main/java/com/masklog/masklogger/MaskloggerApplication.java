package com.masklog.masklogger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.masklog.masklogger.dao.Dao;
import com.masklog.masklogger.domain.User;

@SpringBootApplication
public class MaskloggerApplication implements CommandLineRunner {

	private static final Logger LOG = LoggerFactory.getLogger(MaskloggerApplication.class);

	@Autowired
	private Dao dao;

	public static void main(String[] args) {
		SpringApplication.run(MaskloggerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		User user = new User("John", "01-12-1989", "john@gmail.com");
		dao.addUser(user);
		LOG.info("User added with dob : {}", user.getDob());
		LOG.info("User added with email : {}", user.getEmail());
	}

}
