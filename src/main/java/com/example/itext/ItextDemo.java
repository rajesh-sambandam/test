package com.example.itext;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.List;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.FontSelector;
import com.itextpdf.text.pdf.PdfWriter;

@Service
public class ItextDemo implements CommandLineRunner {

	public static File fontFile = new File(
			"C:\\Rajesh\\17dec2012Backup\\Rajesh\\eclipse-jee-mars-1-win32-x86_64\\eclipse\\workspace\\spj\\src\\main\\resources\\TSCu_SaiIndira.ttf");

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		createITextDocument(new File("C:\\data\\test.pdf"));
	}

	public static void createITextDocument(File to) throws DocumentException, IOException {

		Document document = new Document();
		PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(to));
		document.open();
		writer.getAcroForm().setNeedAppearances(true);
		BaseFont unicode = BaseFont.createFont(fontFile.getAbsolutePath(), BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
		FontSelector fs = new FontSelector();
		fs.addFont(new Font(unicode));

		ArrayList<String> content = new ArrayList<String>();
		String test = new String("\u0BA4\u0BAE\u0BBF\u0BB4\u0BCD\u0BA8\u0BBE\u0B9F\u0B89");
		//content.add(convertToUnicode(test));
		content.add(test);
		content.add(new String("\u0BA4\u0BAE\u0BBF\u0BB4\u0BCD\u0BA8\u0BBE\u0B9F\u0BC4"));
		content.add(new String("தமிழ் நாடு"));

		addContent(document, content, fs);
		document.close();
	}

	private static void addContent(Document document, ArrayList<String> paragraphs, FontSelector fs)
			throws DocumentException, UnsupportedEncodingException {

		for (int i = 0; i < paragraphs.size(); i++) {
			//Phrase phrase = fs.process(paragraphs.get(0));
			 Font font = FontFactory.getFont("C:\\Rajesh\\17dec2012Backup\\Rajesh\\eclipse-jee-mars-1-win32-x86_64\\eclipse\\workspace\\spj\\src\\main\\resources\\elcotuni.ttf", BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
			document.add(new Paragraph(paragraphs.get(i),font));
		}
	}



}
