package edu.uoc.dpoo;
import java.util.Date;

public class Submission {
	/**
	 * Attributes from Submission class
	 */
	private int id;
	private Participant participant;
	private Competition competition;
	private SubmissionStatus status;
	private Date submitedAt;
	private float prediction;
	private float error;

	/**
	 * Methods for Submission class
	 */
	public SubmissionStatus getStatus() {
		return null;
	}

	public float getError() {
		return 0;
	}

	public float getPrediction() {
		return 0;
	}
}
