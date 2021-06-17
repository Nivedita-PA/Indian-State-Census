package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class IndianStateCensusAnalyserTest {

    private static final String FILE_PATH_INDIAN_STATE = "./src/test/resources/IndiaStateCensusData.csv";
    private static final String WRONG_FILE_PATH_INDIAN_STATE = "./src/main/resources/IndiaStateCensusData.csv";


    @Test
    public void givenIndianCensus_CSV_File_Should_Return_Correct_Record() throws CensusAnalyserException {
        IndianStateCensus indianStateCensus = new IndianStateCensus();
        int numOfRecs = indianStateCensus.loadCensusData(FILE_PATH_INDIAN_STATE);
        Assert.assertEquals(29,numOfRecs);
    }

}
