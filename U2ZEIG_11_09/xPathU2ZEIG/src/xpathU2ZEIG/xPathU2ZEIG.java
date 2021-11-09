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
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException, XPathExpressionException {
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();

        Document document = documentBuilder.parse("src/main/java/xPathU2ZEIG_11_09/studentU2ZEIG.xml");
        document.getDocumentElement().normalize();

        XPath xPath = XPathFactory.newInstance().newXPath();
        String expression = "class";

        NodeList nodeList = (NodeList) xPath.compile(expression).evaluate(document, XPathConstants.NODESET);

        for (int i = 0; i< nodeList.getLength(); i++){
            Node node = nodeList.item(i);
            System.out.println("\nAktuális elem:" + node.getNodeName());
            if(node.getNodeType() == Node.ELEMENT_NODE && node.getNodeName().equals("student")){
                Element element = (Element) node;

                System.out.println("Hallgató id: "+ element.getAttribute("id"));
                System.out.println("Keresztnev: "+element.getElementsByTagName("keresztnev").item(0).getTextContent());
                System.out.println("Vezeteknev: "+element.getElementsByTagName("vezeteknev").item(0).getTextContent());
                System.out.println("Becenev: "+element.getElementsByTagName("becenev").item(0).getTextContent());
            }
        }
        expression = "class/student";
        nodeList = (NodeList) xPath.compile(expression).evaluate(document, XPathConstants.NODESET);


    }
}
