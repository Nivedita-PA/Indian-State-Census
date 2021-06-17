package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class IndianStateCensusAnalyserTest2 {

    private static final String WRONG_FILE_PATH_INDIAN_STATE = "./src/main/resources/IndiaStateCensusData.csv";

    @Test
    public void given_Wrong_Census_CSV_File_Should_Return_Exception(){
        IndianStateCensus indianStateCensus = new IndianStateCensus();
        try {
            int noOfRecs = indianStateCensus.loadCensusData(WRONG_FILE_PATH_INDIAN_STATE);
        } catch (CensusAnalyserException e) {
            Assert.assertSame(CensusAnalyserException.ExceptionType.FILE_TYPE_NULL, e.type);
        }

    }
}
