package com.example.itext;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
/*
import org.apache.pdfbox.cos.COSName;
import org.apache.pdfbox.encoding.Encoding;
import org.apache.pdfbox.encoding.EncodingManager;
import org.apache.pdfbox.exceptions.COSVisitorException;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.edit.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDFont;
import org.apache.pdfbox.pdmodel.font.PDTrueTypeFont;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;
*/
//@Service
/*public class PdfBoxDemo  implements CommandLineRunner{

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//createPdfBoxDoc();
	}*/
	/*private void createPdfBoxDoc() throws IOException, FileNotFoundException, COSVisitorException {
	    PDDocument document = new PDDocument();
	    PDPage page = new PDPage();
	    document.addPage(page);
	    PDPageContentStream contentStream = new PDPageContentStream(document, page);
	    File f = new  File("C:\\Rajesh\\17dec2012Backup\\Rajesh\\eclipse-jee-mars-1-win32-x86_64\\eclipse\\workspace\\spj\\src\\main\\resources\\baamini.ttf");
	    InputStream is = new FileInputStream(f);
	    Encoding e =
                EncodingManager.INSTANCE.getEncoding(COSName.WIN_ANSI_ENCODING);    
	    PDFont font = PDTrueTypeFont.loadTTF(document,is ,e);
	    contentStream.setFont(font, 12);
	    contentStream.beginText();
	    contentStream.moveTextPositionByAmount(100, 400);
	    String te = new String("\u0BA4\u0BAE\u0BBF\u0BB4\u0BCD\u0BA8\u0BBE\u0B9F\u0BC1");
	    byte [] myBytes = te.getBytes("UTF8");
	    contentStream.drawString(new String(myBytes,"UTF8"));
	    contentStream.endText();
	    contentStream.close();
	    document.save("C:\\data\\testpdfbox.pdf");
	    document.close();
	}*/
//}
