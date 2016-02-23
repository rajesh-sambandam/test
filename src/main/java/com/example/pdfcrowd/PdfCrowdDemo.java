package com.example.pdfcrowd;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import com.pdfcrowd.Client;
import com.pdfcrowd.PdfcrowdError;

@Service
public class PdfCrowdDemo implements CommandLineRunner {
	public static void test(){
        try 
        {
        	System.out.println("Pdd crowd");
            FileOutputStream fileStream;     
 
            // create an API client instance
            Client client = new Client("ssrajesh74", "03235c44884b15fae0e7c150a5a32aa6");

            // convert a web page and save the PDF to a file
          /*  fileStream = new FileOutputStream("example.pdf");
            client.convertURI("http://example.com/", fileStream);
            fileStream.close();*/

            // convert an HTML string and store the PDF into a byte array
           // ByteArrayOutputStream memStream  = new ByteArrayOutputStream();
          //  String html = "<html><body>TamilNadu. தமிழ்நாடு</body></html>";
           // client.convertHtml(html, memStream);

            // convert an HTML file
            fileStream = new FileOutputStream("C:\\data\\file.pdf");
            client.convertFile("C:\\data\\temp1.html", fileStream);
            fileStream.close();

            // retrieve the number of tokens in your account
            Integer ntokens = client.numTokens();
        }
        catch(PdfcrowdError why) {
            System.err.println(why.getMessage());
        }
        catch(IOException exc) {
            // handle the exception
        	exc.printStackTrace();
        }
    }

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		test();
	}
}
