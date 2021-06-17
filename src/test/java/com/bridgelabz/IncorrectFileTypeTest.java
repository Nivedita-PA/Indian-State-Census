package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class IncorrectFileTypeTest {

    private static final String TXT_FILE_PATH_INDIAN_STATE = "./src/main/resources/wrongcsv.txt";

    @Test
    public void givenCensusCSV_File_WithWrong_Extention_Returns_Exception(){
        IndianStateCensus3 indianStateCensus = new IndianStateCensus3();
        try {
            int noOfRecs = indianStateCensus.loadCensusData3(TXT_FILE_PATH_INDIAN_STATE);
        } catch (CensusAnalyserException e) {
            Assert.assertSame(CensusAnalyserException.ExceptionType.FILE_TYPE_PROBLEM, e.type);
        }
    }
}
