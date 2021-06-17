package com.bridgelabz;

public class CensusAnalyserException extends Throwable {


    enum ExceptionType{
        CENSUS_FILE_PROBLEM, FILE_TYPE_NULL, FILE_TYPE_PROBLEM, INCORRECT_DELIMITER;
    }

    ExceptionType type;

    public CensusAnalyserException(String message, ExceptionType type) {
        super(message);
        this.type = type;
    }

}
