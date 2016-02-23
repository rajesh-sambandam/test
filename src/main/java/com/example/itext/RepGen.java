package com.example.itext;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.HashMap;

import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;

public class RepGen {

	public static void main(String[] args) {
		try {
			// get the JRXML template as a stream
			InputStream template = new FileInputStream(new File("c:\\data\\rep.jrxml"));
			System.out.println(template);
			
			// compile the report from the stream
			JasperReport report = JasperCompileManager.compileReport(template);
			// fill out the report into a print object, ready for export.
			HashMap map=new HashMap<String, String>();
			map.put("name", "தமிழ் நாடு");
			JasperPrint print = JasperFillManager.fillReport(report,map );
			// export it!
			// File pdf = File.createTempFile("output.", ".pdf");
			JasperExportManager.exportReportToPdfFile(print, "test.pdf");
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

}
