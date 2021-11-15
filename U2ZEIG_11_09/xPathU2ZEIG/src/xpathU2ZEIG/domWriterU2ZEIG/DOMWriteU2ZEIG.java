package xpathU2ZEIG.domWriterU2ZEIG;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

class domWriterU2ZEIG {

    public static void main(String[] args) {
        Document newdoc;
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

        try {
            DocumentBuilder db = dbf.newDocumentBuilder();
            newdoc = db.newDocument();
            Element root = newdoc.createElementNS("domu2zeig","users");

            root.appendChild(createUser(newdoc, "0", "Juhász", "Balázs", "Student"));
            root.appendChild(createUser(newdoc, "1", "Kiss", "Piroska", "HR"));
            root.appendChild(createUser(newdoc, "2", "Ács", "Ferenc", "Salesman"));

            TransformerFactory tff = TransformerFactory.newInstance();
            Transformer tf = tff.newTransformer();

            tf.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
            tf.setOutputProperty(OutputKeys.INDENT, "yes");
            tf.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");

            newdoc.appendChild(root);
            DOMSource source = new DOMSource(newdoc);

            File myFile = new File("userU2ZEIG.xml");

            StreamResult console = new StreamResult(System.out);
            StreamResult file = new StreamResult(myFile);

            tf.transform(source, console);
            tf.transform(source, file);


        } catch(ParserConfigurationException | TransformerException e) {
            System.err.println(e.getMessage());
        }

    }

    private static Node createUser(Document doc, String id, String firstname, String lastname, String profession) {

        Element user = doc.createElement("user");

        user.setAttribute("id", id);
        user.appendChild(createUserElement(doc, "firstname", firstname));
        user.appendChild(createUserElement(doc, "lastname", lastname));
        user.appendChild(createUserElement(doc, "profession", profession));
        return (Node)user;
    }

    private static Node createUserElement(Document doc, String name, String value) {

        Element node = doc.createElement(name);
        node.appendChild(doc.createTextNode(value));

        return (Node)node;
    }

}
