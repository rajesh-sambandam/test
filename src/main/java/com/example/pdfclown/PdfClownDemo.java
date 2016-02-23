package com.example.pdfclown;

import java.awt.geom.Point2D;

/*import org.pdfclown.documents.Document;
import org.pdfclown.documents.Page;
import org.pdfclown.documents.contents.composition.PrimitiveComposer;
import org.pdfclown.documents.contents.fonts.StandardType1Font;
import org.pdfclown.files.File;
import org.pdfclown.files.SerializationModeEnum;*/
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;
@Service
public class PdfClownDemo implements CommandLineRunner  {

	@Override
	public void run(String... args) throws Exception {
		/*// TODO Auto-generated method stub
		
		Document document = new File().getDocument();
		 
		// 2. Add a page to the document!
		Page page = new Page(document); // Instantiates the page inside the document context.
		document.getPages().add(page); // Puts the page in the pages collection (you may choose an arbitrary position).
		 
		// 3. Create a content composer for the page!
		PrimitiveComposer composer = new PrimitiveComposer(page);
		 
		// 4. Add contents through the composer!
		composer.setFont(new StandardType1Font(document, StandardType1Font.FamilyEnum.Courier, true, false), 32);
		composer.showText("\u0BA4\u0BAE\u0BBF\u0BB4\u0BCD\u0BA8\u0BBE\u0B9F\u0BC3", new Point2D.Double(32,48));
		 
		// 5. Flush the contents into the page!
		composer.flush();
		 
		// 6. Save the document!
		document.getFile().save("C:\\data\\testpdfclown.pdf", SerializationModeEnum.Standard);
		*/
	}

	
	
	
}
