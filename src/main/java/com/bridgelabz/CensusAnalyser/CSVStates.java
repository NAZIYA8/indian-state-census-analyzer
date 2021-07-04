/**
 * ****************************************************************************
 * Purpose: This is a POJO for State CSV file.
 *
 * @author Syeda Naziya
 * @version 1.0
 * @since 30-06-2021
 * ****************************************************************************
 */

package com.bridgelabz.CensusAnalyser;

import com.opencsv.bean.CsvBindByName;

public class CSVStates {

	@CsvBindByName(column = "state name", required = true)
	private String stateName;

	@CsvBindByName(column = "state code", required = true)
	private int stateCode;

	@Override
	public String toString() {
		return "CSVStates [ stateName=" + stateName + ", stateCode=" + stateCode + "]";
	}
}
