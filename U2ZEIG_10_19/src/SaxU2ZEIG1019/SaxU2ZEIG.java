package SaxU2ZEIG1019;

import java.io.File;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

public class SaxU2ZEIG {

    public static void main(String[] args) {

        try {
            File inputFile = new File("szemelyekU2ZEIG.xml");
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();
            Handler handler = new Handler();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
