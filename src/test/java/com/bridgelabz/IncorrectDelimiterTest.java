package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class IncorrectDelimiterTest {

    private static final String WRONG_DATA_FILE_PATH_INDIAN_STATE = "./src/main/resources/wrong_delimiter.csv";

    @Test
    public void givenCensus_File_With_Wrong_Delimiter_Should_Return_Exception(){
        IndianStateCensus4 indianStateCensus4 = new IndianStateCensus4();
        try {
            int numOfRecs = indianStateCensus4.loadCensusData4(WRONG_DATA_FILE_PATH_INDIAN_STATE);
        } catch (CensusAnalyserException e) {
            Assert.assertSame(CensusAnalyserException.ExceptionType.INCORRECT_DELIMITER, e.type);
        }
    }
}
