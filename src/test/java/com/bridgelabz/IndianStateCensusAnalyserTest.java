package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class IndianStateCensusAnalyserTest {

    private static final String FILE_PATH_INDIAN_STATE = "./src/test/resources/IndiaStateCensusData.csv";

    @Test
    public void givenIndianCensus_CSV_File_Should_Return_Correct_Record() throws CensusAnalyserException {
        IndianStateCensus2 indianStateCensus = new IndianStateCensus2();
        try {
            int numOfRecs = indianStateCensus.loadCensusData2(FILE_PATH_INDIAN_STATE);
            Assert.assertEquals(29, numOfRecs);
        }catch (CensusAnalyserException e){
            e.printStackTrace();
        }
    }

}
