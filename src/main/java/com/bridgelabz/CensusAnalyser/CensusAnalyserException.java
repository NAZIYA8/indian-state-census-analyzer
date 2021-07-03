/**
 * ****************************************************************************
 * Purpose: This is a Census Analyzer Exception class which throws custom exceptions.
 *
 * @author Syeda Naziya
 * @version 1.0
 * @since 30-06-2021
 * ****************************************************************************
 */

package com.bridgelabz.CensusAnalyser;

@SuppressWarnings("serial")
public class CensusAnalyserException extends Exception {
	enum CensusExceptionType {
		CENSUS_FILE_PROBLEM, INCORRECT_TYPE_ISSUE, DELIMITER_ISSUE, INCORRECT_HEADER
	}

	CensusExceptionType exceptionType;

	public CensusAnalyserException(CensusExceptionType exceptionType, String message) {
		super(message);
		this.exceptionType = exceptionType;
	}
}
