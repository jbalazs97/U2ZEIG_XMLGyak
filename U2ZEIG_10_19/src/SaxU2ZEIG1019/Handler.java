package SaxU2ZEIG1019;

import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

public class Handler extends DefaultHandler {

    private int incident = 0;

    private void formatAttribute(Attributes attributes) {
        int attrLenght = attributes.getLength();
        if (attrLenght == 0) {
            return;
        }
    }
}