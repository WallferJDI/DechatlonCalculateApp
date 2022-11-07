package utils;

import configuration.AppConfig;
import configuration.XmlConfig;
import model.Athletic;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.List;

public class GenerateXML {


    public void athleticToXML(List<Athletic> athleticPointsList){
        try {
            DocumentBuilderFactory factory  = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = factory.newDocumentBuilder();
            Document document =  documentBuilder.newDocument();

            Element root  = document.createElement(XmlConfig.NODE_ROOT);
            document.appendChild(root);
            for (Athletic athPoint: athleticPointsList){
                Element athleteNode = document.createElement(XmlConfig.NODE_OBJECT);
                athleteNode.appendChild(createNode(document,XmlConfig.NODE_NAME,athPoint.getName()));
                athleteNode.appendChild(createNode(document,XmlConfig.NODE_RANK,athPoint.getRank()));
                athleteNode.appendChild(createNode(document, XmlConfig.NODE_SCORE,athPoint.getPoints().toString()));
                athleteNode.appendChild(createNode(document,XmlConfig.NODE_RACE100,athPoint.getRace100m().toString()));
                athleteNode.appendChild(createNode(document,XmlConfig.NODE_LONG_JUMP,athPoint.getLongJump().toString()));
                athleteNode.appendChild(createNode(document,XmlConfig.NODE_SHOT_PUT,athPoint.getShotPut().toString()));
                athleteNode.appendChild(createNode(document,XmlConfig.NODE_HIGH_JUMP,athPoint.getHighJump().toString()));
                athleteNode.appendChild(createNode(document,XmlConfig.NODE_RACE400,athPoint.getRace400m().toString()));
                athleteNode.appendChild(createNode(document,XmlConfig.NODE_RACE110,athPoint.getRace110m().toString()));
                athleteNode.appendChild(createNode(document,XmlConfig.NODE_DISCUS_THROW,athPoint.getDiscusThrow().toString()));
                athleteNode.appendChild(createNode(document,XmlConfig.NODE_POLE_VAULT,athPoint.getPoleVault().toString()));
                athleteNode.appendChild(createNode(document,XmlConfig.NODE_JAVELIN_THROW,athPoint.getJavelinThrow().toString()));
                athleteNode.appendChild(createNode(document,XmlConfig.NODE_RACE1500m,athPoint.getRace1500m().toString()));

                root.appendChild(athleteNode);
            }
        saveXML(document);

        }catch (Exception e){

        }
    }

    public void saveXML(Document document) throws TransformerException {
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        transformer.setOutputProperty(OutputKeys.ENCODING, XmlConfig.SETTING_ENCODING);
        transformer.setOutputProperty(OutputKeys.INDENT, XmlConfig.SETTING_INDENT);
        DOMSource source = new DOMSource(document);
        StreamResult result = new StreamResult(new File(AppConfig.saveFilePath+ AppConfig.fileName));
        transformer.transform(source, result);
    }

    public Element createNode(Document document, String nodeName, String value){
        Element element = document.createElement(nodeName);
        element.appendChild(document.createTextNode(value));
        return element;
    }
}
