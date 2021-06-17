package com.bridgelabz;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;

public class IndianStateCensus {

    private static final String FILE_PATH_INDIAN_STATE = "./src/test/resources/IndiaStateCensusData.csv";

    public int loadCensusData(String FILE_PATH_INDIAN_STATE) throws CensusAnalyserException {

        try {
            Reader reader = Files.newBufferedReader(Paths.get(FILE_PATH_INDIAN_STATE));
            CsvToBean<IndianCensusCsv> csvToBean = new CsvToBeanBuilder(reader).withType(IndianCensusCsv.class)
                    .withIgnoreLeadingWhiteSpace(true).build();
            Iterator<IndianCensusCsv> censusCsvIterator = csvToBean.iterator();
            int numOfEntries = 0;
            while (censusCsvIterator.hasNext()) {
                numOfEntries++;
                IndianCensusCsv censusCsv = censusCsvIterator.next();
            }
            return numOfEntries;
        } catch (IOException e) {
            throw new CensusAnalyserException(e.getMessage(), CensusAnalyserException.ExceptionType.CENSUS_FILE_PROBLEM);
        }
    }
}
