package edu.uoc.dpoo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Platform {
    private List<User> users;
    private List<Competition> competitions;
       
    public Platform() {
        /**
         * PR1 Ex 2.1: We need to initialize the list of users and competitions
        */
        users = new ArrayList<User>();
        competitions= new ArrayList<Competition>();
    }
    
    private User findUser(String username) { 
        /**
         * PR1 Ex 2.1: Implementation of method findUser to find a user in the list users by username
        */
        User user = null;
        
        Iterator<User> itr = this.users.iterator();      
        while(itr.hasNext() && user == null) {
            User u = itr.next();
            if(u.getUserName().equals(username)) {
                user = u;
            }
        }
        
        return user;
    }
        
    public User registerUser(String username, String password, String fullname) {        
        /**
         * PR1 Ex 2.1: Register a new user, checking that it does not exist 
        */
        User newUser = null;
        
        // Check if the user is new or already exists
        User queryUser = findUser(username);
        
        if(queryUser==null) {
            newUser = new User(this, username, password, fullname);
            this.users.add(newUser);
        }      
        return newUser;
    }

    public User login(String username, String password) {    
        /**
         * PR1 Ex 2.2: Login an already existing user
        */
        User user = null;
        
        // Find the user in the list of registered users
        User queryUser = findUser(username);        
        
        // If the user exists, check the password
        if(queryUser!=null && queryUser.checkPassword(password)) {
            user = queryUser;
        }
        
        return user;        
    }    
        
    public Integer getNumUsers() {
        /**
         * PR1 Ex 2.1: Required for test, to check if a new user is registered 
        */
        return this.users.size();
    }
    
    public Integer getNumCompetitions() {        
    	return this.competitions.size();
    }

    public Message sendMessage(User from, String to, String subject, String message) throws CompetitionException {               
    	
    	User sender =this.findUser(from.getUserName()); 
    	User receiver = this.findUser(to);
    	// Check if the sender exists on the system.
    	if( sender == null) throw new CompetitionException(CompetitionException.SENDER_NOT_FOUND);
    	// Check that the receiver exists and it's not null.
    	if ( receiver==null ) throw new CompetitionException(CompetitionException.RECIPIENT_NOT_FOUND);	
    	Message newMessage=new Message(from,receiver,subject,message);
    	sender.getOutbox().add(newMessage);
    	receiver.getInbox().add(newMessage);
    	return newMessage;
    	
    }
    
    
    public void registerCompetition(Competition competition) {
    	this.competitions.add(competition);
    }    
    
    public List<Competition> getOpenCompetitions() {        
        return null;
    }
    
    public void run() {
        // Simulates system call for evaluation
        evaluateAll();
    }
    
    
    /**	
     * PRIVATE METHODS ----------------
     * 
     */
    private void evaluateAll() {
        
    }
    
}
