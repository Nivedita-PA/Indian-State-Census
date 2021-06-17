package com.bridgelabz;

import com.opencsv.bean.CsvBindByName;

public class IndianCensusCsv {

        @CsvBindByName(column = "State")
        public String state;

        @CsvBindByName(column = "Population")
        public String population;

        @CsvBindByName(column = "AreaInSqKm")
        public String area;

        @CsvBindByName(column = "DensityPerSqKm")
        public String density;

        @Override
        public String toString() {
            return "IndianCensusCsv{" +
                    "state='" + state + '\'' +
                    ", population='" + population + '\'' +
                    ", area='" + area + '\'' +
                    ", density='" + density + '\'' +
                    '}';
        }

}
