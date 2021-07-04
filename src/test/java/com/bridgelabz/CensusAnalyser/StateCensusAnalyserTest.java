/**
 * ****************************************************************************
 * Purpose: This is a Test class for State Census Analyzer where all the test cases 
 * are carried out.
 *
 * @author Syeda Naziya
 * @version 1.0
 * @since 30-06-2021
 * ****************************************************************************
 */

package com.bridgelabz.CensusAnalyser;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.bridgelabz.CensusAnalyser.CensusAnalyserException.CensusExceptionType;

public class StateCensusAnalyserTest {

	public static final String CENSUS_CSV_FILE = "src/main/java/resources/IndianStateCensus.csv";
	public static final String INCORRECT_FILE = "src/main/java/resources/useless.docx";
	public static final String INCORRECT_CSV_FILE = "src/main/java/resources/InvalidDataType.csv";
	public static final String WRONGDELIMITER_CENSUS_CSV = "src/main/java/resources/stateCensusDelimiter.csv";
	public static final String INCORRECT_HEADER_CSV = "src/main/java/resources/stateCensusWithoutHeader.csv";
	public static final String STATE_CSV_FILE = "src/main/java/resources/Statecode.csv";
	public static final String INCORRECTSTATE_FILE = "src/main/java/resources/useless.docx";
	public static final String WRONGDELIMITERSTATE_CENSUS_CSV = "src/main/java/resources/stateCensusDelimiter.csv";
	public static final String INCORRECTSTATE_HEADER_CSV = "src/main/java/resources/stateCensusWithoutHeader.csv";

	@Test
	public void givenIndiaCensusDataCsvShouldReturnExactCount() {
		StateCensusAnalyser stateCensusAnalyser = new StateCensusAnalyser();
		try {
			int numberOfEntries = stateCensusAnalyser.loadStateCensusData(CENSUS_CSV_FILE);
			Assert.assertEquals(29, numberOfEntries);
		} catch (CensusAnalyserException e) {
			e.printStackTrace();
		}

	}

	@Test
	public void GivenTheStateCensusCsvFile_IfDoesntExist_ShouldThrowCensusAnalyserException() throws IOException {
		try {
			StateCensusAnalyser stateCensusAnalyser = new StateCensusAnalyser();
			ExpectedException exceptionRule = ExpectedException.none();
			exceptionRule.expect(CensusAnalyserException.class);
			stateCensusAnalyser.loadStateCensusData(INCORRECT_FILE);
		} catch (CensusAnalyserException e) {
			Assert.assertEquals(CensusExceptionType.CENSUS_FILE_PROBLEM, e.exceptionType);
		}
	}

	@Test
	public void givenWrongTypeCSVFile_ShouldThrowExceptionOfType_IncorrectTypeOfCSV() {
		try {
			StateCensusAnalyser stateCensusAnalyser = new StateCensusAnalyser();
			ExpectedException exceptionRule = ExpectedException.none();
			exceptionRule.expect(CensusAnalyserException.class);
			stateCensusAnalyser.loadStateCensusData(INCORRECT_CSV_FILE);
		}
		catch (CensusAnalyserException e) {
			Assert.assertEquals(CensusExceptionType.INCORRECT_TYPE_ISSUE, e.exceptionType);
		} catch (Exception e) {
System.out.print(e);
		}
	}

	@Test
	public void givenCsvFile_IFDelimiterIsWrong_ShouldThrowExceptionOfDelimiterISSUE() {
		try {
			StateCensusAnalyser stateCensusAnalyser = new StateCensusAnalyser();
			ExpectedException exceptionRule = ExpectedException.none();
			exceptionRule.expect(CensusAnalyserException.class);
			stateCensusAnalyser.loadStateCensusData(WRONGDELIMITER_CENSUS_CSV);
		} catch (CensusAnalyserException e) {
			Assert.assertEquals(CensusExceptionType.DELIMITER_ISSUE, e.exceptionType);
		}
	}

	@Test
	public void givenCsvFile_WrongHeaderShouldThrowExceptionOfTypeIncorrectHeader() {
		try {
			StateCensusAnalyser stateCensusAnalyser = new StateCensusAnalyser();
			ExpectedException exceptionRule = ExpectedException.none();
			exceptionRule.expect(CensusAnalyserException.class);
			stateCensusAnalyser.loadStateCensusData(INCORRECT_HEADER_CSV);
		} catch (CensusAnalyserException e) {
			Assert.assertEquals(CensusExceptionType.INCORRECT_HEADER, e.exceptionType);
		}
	}

	@Test
	public void givenIndiaStateCodeDataCsv_ShouldReturnExactCount() {
		StateCensusAnalyser stateCensusAnalyser = new StateCensusAnalyser();
		try {
			int numberOfEntries = stateCensusAnalyser.loadIndianStateData(STATE_CSV_FILE);
			Assert.assertEquals(4, numberOfEntries);
		} catch (CensusAnalyserException e) {
			e.printStackTrace();
		}

	}

	@Test
	public void GivenTheStateCsvFile_IfDoesntExist_ShouldThrowCensusAnalyserException() throws IOException {
		try {
			StateCensusAnalyser stateCensusAnalyser = new StateCensusAnalyser();
			ExpectedException exceptionRule = ExpectedException.none();
			exceptionRule.expect(CensusAnalyserException.class);
			stateCensusAnalyser.loadIndianStateData(INCORRECT_FILE);
		} catch (CensusAnalyserException e) {
			Assert.assertEquals(CensusExceptionType.CENSUS_FILE_PROBLEM, e.exceptionType);
		}
	}

	@Test
	public void givenStateCsvFile_IFDelimiterIsWrong_ShouldThrowExceptionOfDelimiterISSUE() {
		try {
			StateCensusAnalyser stateCensusAnalyser = new StateCensusAnalyser();
			ExpectedException exceptionRule = ExpectedException.none();
			exceptionRule.expect(CensusAnalyserException.class);
			stateCensusAnalyser.loadStateCensusData(WRONGDELIMITER_CENSUS_CSV);
		} catch (CensusAnalyserException e) {
			Assert.assertEquals(CensusExceptionType.DELIMITER_ISSUE, e.exceptionType);
		}
	}

	@Test
	public void givenStateCsvFile_WrongHeaderShouldThrowExceptionOfTypeIncorrectHeader() {
		try {
			StateCensusAnalyser stateCensusAnalyser = new StateCensusAnalyser();
			ExpectedException exceptionRule = ExpectedException.none();
			exceptionRule.expect(CensusAnalyserException.class);
			stateCensusAnalyser.loadIndianStateData(INCORRECT_HEADER_CSV);
		} catch (CensusAnalyserException e) {
			Assert.assertEquals(CensusExceptionType.INCORRECT_HEADER, e.exceptionType);
		}
	}

}
