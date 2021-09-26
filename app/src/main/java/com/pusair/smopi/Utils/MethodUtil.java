package com.pusair.smopi.Utils;

import android.annotation.SuppressLint;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class MethodUtil {
    public static String getDateSet(int year, int monthOfYear, int datOfMonth) {

        int month = monthOfYear + 1;
        String formattedMonth = "" + month;
        String day = "" + datOfMonth;

        if(month < 10){

            formattedMonth = "0" + month;
        }
        if(datOfMonth < 10){

            day  = "0" + day ;
        }
        Date convertedDate = null;
        @SuppressLint("SimpleDateFormat") SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        try {
            convertedDate = format.parse(day + "-" + formattedMonth + "-" + year);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        @SuppressLint("SimpleDateFormat") SimpleDateFormat sdfnewformat = new SimpleDateFormat("dd MMM yyyy");
        return sdfnewformat.format(Objects.requireNonNull(convertedDate));
    }

    public static String formatDateString(String date, String oldFormat, String newFormat) {
        @SuppressLint("SimpleDateFormat") SimpleDateFormat dateFormat = new SimpleDateFormat(oldFormat);
        Date convertedDate;
        try {
            convertedDate = dateFormat.parse(date);
            @SuppressLint("SimpleDateFormat") SimpleDateFormat sdfnewformat = new SimpleDateFormat(newFormat);
            return sdfnewformat.format(Objects.requireNonNull(convertedDate));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return "";
    }
}
