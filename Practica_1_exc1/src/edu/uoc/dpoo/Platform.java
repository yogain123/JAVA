package edu.uoc.dpoo;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

public class Platform {
	/**
	 * Attributes for Platform.
	 */
	private ArrayList<User> users ;
	
	/**
	 * Constructor for Platform class
	 */
	public Platform(){
		this.users = new ArrayList<User>();
	}
	
	
	/**
	 * METHODS FROM PLATFORM
	 */
	
	
	/**
	 * Metods registerUser
	 * @param name
	 * @param password
	 * @param fullname
	 * @return
	 */
	public User registerUser(String name, String password, String fullname) {
		return null;
	}

	public User login(String username, String password) {
		return null;
	}

	public int getNumUsers() {
		return 0;
	}

	public int getNumCompetitions() {
		return 0;
	}

	public Message sendMessage(User from, String to, String subject,String message) {
		return null;
	}

	public void evaluteAll() {

	}

	public User findUser(String username) {
		return null;
	}

	public ArrayList<Competition> getOpenCompetitions() {
		return null;
	}
	
	
}
