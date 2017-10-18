package com.example.android.reportcard;

import android.widget.ArrayAdapter;

/**
 * Created by JesseRich on 10/17/17.
 */

public class ReportCard {

    private String mStudentName;
    private String mHistoryGrade;
    private String mMathGrade;
    private String mEnglishGrade;
    private String mBiologyGrade;
    private String mGeologyGrade;
    private String mBandGrade;
    private String mChemistryGrade;

    public ReportCard(String studentName, String historyGrade, String mathGrade, String englishGrade, String biologyGrade, String geologyGrade, String bandGrade, String chemistryGrade) {
        this.mStudentName = studentName;
        this.mHistoryGrade = historyGrade;
        this.mMathGrade = mathGrade;
        this.mEnglishGrade = englishGrade;
        this.mBiologyGrade = biologyGrade;
        this.mGeologyGrade = geologyGrade;
        this.mBandGrade = bandGrade;
        this.mChemistryGrade = chemistryGrade;
    }

    public String getStudentName() {
        return mStudentName;
    }

    public void setSudentName(String studentName) {
        mStudentName = studentName;
    }

    public String getHistoryGrade() {
        return mHistoryGrade;
    }

    public void setHistoryGrade(String historyGrade) {
        mHistoryGrade = historyGrade;
    }

    public String getMathGrade() {
        return mMathGrade;
    }

    public void setMathGrade(String mathGrade) {
        mMathGrade = mathGrade;
    }

    public String getEnglishGrade() {
        return mEnglishGrade;
    }

    public void setEnglishGrade(String englishGrade) {
        mEnglishGrade = englishGrade;
    }

    public String getBiologyGrade() {
        return mBiologyGrade;
    }

    public void setBiologyGrade(String biologyGrade) {
        mBiologyGrade = biologyGrade;
    }

    public String getGeologyGrade() {
        return mGeologyGrade;
    }

    public void setGeologyGrade(String geologyGrade) {
        mGeologyGrade = geologyGrade;
    }

    public String getBandGrade() {
        return mBandGrade;
    }

    public void setBandGrade(String bandGrade) {
        mBandGrade = bandGrade;
    }

    public String getChemistryGrade() {
        return mChemistryGrade;
    }

    public void setChemistryGrade(String chemistryGrade) {
        mChemistryGrade = chemistryGrade;
    }

    @Override
    public String toString() {
        return "Name: " + mStudentName +
                "\nHistory Grade: " + mHistoryGrade +
                "\nMath Grade: " + mMathGrade +
                "\nEnglish Grade: " + mEnglishGrade +
                "\nBiology Grade: " + mBiologyGrade +
                "\nGeology Grade: " + mGeologyGrade +
                "\nBand Grade: " + mBandGrade +
                "\nChemistry Grade: " + mChemistryGrade;
    }

}
