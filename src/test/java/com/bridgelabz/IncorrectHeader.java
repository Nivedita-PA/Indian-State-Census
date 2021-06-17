package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class IncorrectHeader {

    private static final String WRONG_HEADER_FILE_PATH_INDIAN_STATE = "./src/main/resources/Incorrect_Header.csv";

    @Test
    public void givenWrong_Header_Census_CSV_File_Should_Return_Exception(){
        IndianStateCensus5 indianStateCensus5 = new IndianStateCensus5();
        try {
            indianStateCensus5.loadCensusData5(WRONG_HEADER_FILE_PATH_INDIAN_STATE);
        } catch (CensusAnalyserException e) {
            Assert.assertSame(CensusAnalyserException.ExceptionType.INCORRECT_HEADER, e.type);
        }
    }
}
