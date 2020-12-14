/**
 * 
 */
package com.ss.assignments.five;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.YearMonth;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

/**
 * @author Samuel Johnson
 *
 */
public class DateTimeAPIPractice {

	/**
	 * @param year is the year desired
	 * @param month is the month desired
	 */
	public int returnMonthSize(int year, int month) {
		YearMonth curYear = YearMonth.of(year, month);
		return curYear.lengthOfMonth();
	}
	
	/**
	 * @param year is the year desired
	 * @param month is the month desired
	 */
	public int returnMondays(int year, int month) {
		LocalDate startingMonday = LocalDate.of(year, month, 1).with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
		LocalDate endingMonday = LocalDate.of(year, month, 1).with(TemporalAdjusters.lastInMonth(DayOfWeek.MONDAY));
		return (int) (ChronoUnit.WEEKS.between(startingMonday, endingMonday) + 1);
	}
	
	/**
	 * @param year is the year desired
	 * @param month is the month desired
	 * @param day is the day desired
	 */
	public boolean isFridayThirteenth(int year, int month, int day) {
		if(day == 13) {
			LocalDate date = LocalDate.of(year, month, day);
		     
		    //Getting the day of week for a given date
		    java.time.DayOfWeek dayOfWeek = date.getDayOfWeek();
			if(dayOfWeek.toString() == "FRIDAY") {
				return true;
			}
		}
		return false;
	}

}
