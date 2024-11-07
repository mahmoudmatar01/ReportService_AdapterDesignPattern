package org.design_patterns;

public class JsonClientReportAdaptee implements JsonClientReportAdapter{

    private final LegacyClientReportService clientReportService;

    public JsonClientReportAdaptee(LegacyClientReportService clientReportService) {
        this.clientReportService = clientReportService;
    }

    @Override
    public JsonReport generateJsonClientReport() {
        System.out.println("Getting a json report for out client.........");
        return convertCSVReportToJsonReport();
    }

    private JsonReport convertCSVReportToJsonReport(){
        CSVReport csvReport = clientReportService.generateCSVReport();
        System.out.println("Converting csv report to json report.........");
        return new JsonReport(csvReport.csvReport());
    }
}
