package com.sudheer.hakers.rank;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * Created by Sudheer Chowdary on 10/23/2016.
 */
public class DateTimeChallenge {

    public static void main(String args[]) throws ParseException {
        String month = "08";
        String day = "05";
        String year = "2015";
        String inputDateStr = String.format("%s/%s/%s", month, day, year);
        Date inputDate = new SimpleDateFormat("MM/dd/yyyy").parse(inputDateStr);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(inputDate);
        String dayOfWeek = calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US).toUpperCase();
        System.out.println(dayOfWeek);
    }
}
