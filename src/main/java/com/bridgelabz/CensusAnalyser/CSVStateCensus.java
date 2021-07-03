/**
 * ****************************************************************************
 * Purpose: This is a pojo for State Census csv file.
 *
 * @author Syeda Naziya
 * @version 1.0
 * @since 30-06-2021
 * ****************************************************************************
 */

package com.bridgelabz.CensusAnalyser;

import com.opencsv.bean.CsvBindByName;

public class CSVStateCensus {
	@CsvBindByName(column = "State")
	private String stateName;

	@CsvBindByName(column = "Population", required = true)
	private int population;

	@CsvBindByName(column = "AreaInSqKm")
	private double areaInSqKm;

	@CsvBindByName(column = "DensityPerSqKm", required = true)
	private double densityPerSqKm;

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public double getAreaInSqKm() {
		return areaInSqKm;
	}

	public void setAreaInSqKm(double areaInSqKm) {
		this.areaInSqKm = areaInSqKm;
	}

	public double getDensityPerSqKm() {
		return densityPerSqKm;
	}

	public void setDensityPerSqKm(double densityPerSqKm) {
		this.densityPerSqKm = densityPerSqKm;
	}

	@Override
	public String toString() {
		return "StateName='" + stateName + ", Population='" + population + ", Area In Square Km='" + areaInSqKm
				+ ", DensityPerSqKm='" + densityPerSqKm + "\n";
	}
}
