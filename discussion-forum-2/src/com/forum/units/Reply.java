package com.forum.units;

public class Reply extends AbstractEntity {
	//TODO: Done

	//reply body
	private String message;
	//user who replied to the question
	private User user;
	//question for which user has replied
	private Question question;
	//id of the last reply posted on discussion forum
	private static Long lastEntry = 0L;

	//This method is calling upon the parent class(Abstract Entity)'s
	//setId() function to set an id using the last entry as the parameter
	public void autoGenerateId() { setId(lastEntry); }

	/**
	 * This method returns the reply body
	 *
	 * @return the reply body
	 */
	//A getter method to return the contents within the message variable
	public String getMessage() { return message; }

	/**
	 * This method sets the body of the reply
	 *
	 * @param message: the message that we want to set as the reply body
	 */
	//A setter implemented to set/update the message within the post
	public void setMessage(String message) { this.message = message; }

	/**
	 * This method returns the user who wrote the reply
	 *
	 * @return the user who wrote this reply
	 */
	// A getter method to return the User instance that is being implemented
	// from the User class
	public User getUser() { return user; }

	/**
	 * This method sets the user who wrote the reply
	 *
	 * @param user: the user who wrote this reply
	 */
	// A setter method used to set/update the current User instance to the Reply class
	public void setUser(User user) { this.user = user; }

	/**
	 * This method returns the question that this reply belongs to
	 *
	 * @return the question to which this reply belongs to
	 */

	// This is a getter method used to return current instance of the Question class
	public Question getQuestion() { return question; }

	/**
	 * This method sets the question that this reply belongs to
	 *
	 * @param question: the question that this reply belongs to
	 */
	// A setter method is set/update the current Question instance
	// being used/viewed by the User
	public void setQuestion(Question question) {
		this.question = question;
	}
}
