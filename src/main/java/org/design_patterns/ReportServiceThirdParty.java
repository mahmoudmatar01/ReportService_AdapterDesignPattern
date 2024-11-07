package org.design_patterns;

public class ReportServiceThirdParty {

    public CSVReport receiveCSVReport(){
        System.out.println("Receiving CSV report....");
        return new CSVReport("CSV report");
    }

}
