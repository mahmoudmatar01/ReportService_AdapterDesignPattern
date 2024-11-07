package org.design_patterns;

public class LegacyClientReportService {

    private final ReportServiceThirdParty reportServiceThirdParty;

    public LegacyClientReportService(ReportServiceThirdParty reportServiceThirdParty) {
        this.reportServiceThirdParty = reportServiceThirdParty;
    }

    public CSVReport generateCSVReport(){
        return reportServiceThirdParty.receiveCSVReport();
    }
}
