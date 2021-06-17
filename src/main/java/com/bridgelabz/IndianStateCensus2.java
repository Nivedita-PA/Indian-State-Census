package com.bridgelabz;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.stream.StreamSupport;

public class IndianStateCensus2 {
    public int loadCensusData2(String FILE_PATH) throws CensusAnalyserException {

        try {
            Reader reader = Files.newBufferedReader(Paths.get(FILE_PATH));
            CsvToBean<IndianCensusCsv> csvToBean = new CsvToBeanBuilder(reader).withType(IndianCensusCsv.class)
                    .withIgnoreLeadingWhiteSpace(true).build();
            Iterator<IndianCensusCsv> censusCsvIterator = csvToBean.iterator();
            int numOfEntries = 0;
            Iterable<IndianCensusCsv> censusCsvIterable = () -> censusCsvIterator;
            numOfEntries = (int) StreamSupport.stream(censusCsvIterable.spliterator(), false).count();
            return numOfEntries;
        }catch (IOException ex) {
            throw new CensusAnalyserException(ex.getMessage(), CensusAnalyserException.ExceptionType.CENSUS_FILE_PROBLEM);
        }

    }
}
