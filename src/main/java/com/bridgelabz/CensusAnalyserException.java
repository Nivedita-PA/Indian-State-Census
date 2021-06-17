package com.bridgelabz;

public class CensusAnalyserException extends Throwable {


    enum ExceptionType{
        CENSUS_FILE_PROBLEM,NULL_TYPE_FILE
    }

    ExceptionType type;
    String message;
    public CensusAnalyserException(String message, ExceptionType type) {
        super(message);
        this.message = "INVALID_FILE";
    }
}
