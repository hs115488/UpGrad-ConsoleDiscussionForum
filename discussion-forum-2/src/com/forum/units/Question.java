package com.forum.units;

public class Question extends AbstractEntity {

	//brief description of question
	private String title;
	//detail question
	private String message;
	//user who asked the question
	private User user;
	//number of upvotes for the question.
	private int upvoteCount = 0;
	//id of the last question asked on discussion forum
	private static Long lastEntry = 0L;

	//The autoGenerateId function will take the current last entry and set the id of the question
	public void autoGenerateId() { setId(lastEntry); }

	/**
	 * This method returns the title of the question
	 *
	 * @return the title of the question
	 */
	//A getter method implemented to return the title of the question
	public String getTitle() { return title; }


	/**
	 * This method sets the title of the question
	 *
	 * @param title: the title that we want to give to this question
	 */

	// A setter method implemented to set the instance's title to the one located as the parameter
	public void setTitle(String title) { this.title = title; }

	/**
	 * This method returns the details of this question
	 *
	 * @return details of the question
	 */
	// A getter to return the message within the question
	public String getMessage() { return message; }


	/**
	 * This method sets the message of the question
	 *
	 * @param message: the message that we want to set the details of this question to
	 */
	// A setter method implemented to set/update the message to the Question instance
	public void setMessage(String message) { this.message = message; }

	/**
	 * This method returns the user who wrote this question
	 *
	 * @return user who wrote this question
	 */
	// A getter method to retrieve the current instance being used of the User class used within the program
	public User getUser() { return user; }

	/**
	 * This method sets the user who wrote this question
	 *
	 * @param user: the user who wrote this question
	 */
	// This setter method sets/updates the User instance
	public void setUser(User user) { this.user = user; }

	/**
	 * This method returns the number of upvotes this question has received
	 *
	 * @return the number of upvotes this question has received
	 */

	// A getter method implemented to return
	// the amount of upvotes counted within this
	// particular Question instance
	public int getUpvoteCount() { return upvoteCount; }

	/**
	 * This question increases the number of upvotes by one
	 */

	//This method when called will increase the upvote count to the particular Question instance
	public void increaseUpvoteCount() { upvoteCount = upvoteCount + 1; }

}
