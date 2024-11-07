package org.design_patterns;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ReportServiceThirdParty thirdParty = new ReportServiceThirdParty();
        LegacyClientReportService clientReportService = new LegacyClientReportService(thirdParty);

        CSVReport csvReport = clientReportService.generateCSVReport();
        System.out.println(csvReport.csvReport());

        System.out.println("---------------------------------");
        
        JsonClientReportAdapter jsonClientReportAdapter = new JsonClientReportAdaptee(clientReportService);
        JsonReport jsonReport =  jsonClientReportAdapter.generateJsonClientReport();
        System.out.println(jsonReport.jsonReport());

    }
}