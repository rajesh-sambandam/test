package com.example.itext;



import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

@Service
public class Jasper  implements CommandLineRunner{

	@Override
	public void run(String... args) throws Exception {
	//	createJasperBoxDoc();
	}
//	private void createJasperBoxDoc() {
//		JasperReportBuilder report = DynamicReports.report();//a new report
//		report.title(//title of the report
//			      Components.text("SimpleReportExample")
//				  .setHorizontalAlignment(HorizontalAlignment.CENTER))
//				  .pageFooter(Components.pageXofY());
//		report.toPdf(new FileOutputStream("c:\\data\\report.pdf"));
//	}
}
