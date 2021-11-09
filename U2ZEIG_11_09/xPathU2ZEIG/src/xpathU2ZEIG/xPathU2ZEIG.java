package xpathU2ZEIG;

import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.swing.*;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;
import java.io.File;
import java.io.IOException;

public class xPathU2ZEIG {
    DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newDefaultInstance();
    DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
    Document document =documentBuilder.parse("studentU2ZEIG.xml");
    document.getDocumentElement().normalize();

    XPath xPath = XPathFactory.newInstance().newXPath();
    String expression ="class";

    NodeList nodeList =(NodeList) xPath.complie(expression).evalute(document, XPathConstants.NODESET);

        for( int i=0; i<nodeList.getLenght(); i++)  {
        Node node = nodeList.item(i);
        System.out.println("\nAktuális elem: " + node.getNodeName());

        if (node.getNodeType()== Node.ATTRIBUTE_NODE && node.getNodeName().equals("student")) {
            Element element (Element) node;

            System.out.println("Hallgató ID:"+ element.getAttribute(id));
        }

            System.out.println("Keresztnév: "+ element.getElement);


}


