package dom4j;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Dom {
	public static void main(String[] args) {
		DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
		try {
			//ȡ��document����
			DocumentBuilder db = documentBuilderFactory.newDocumentBuilder();
			Document document = db.parse("books.xml");
			//ȡ�ýڵ㼯��
			NodeList nodeList = document.getElementsByTagName("book");
			
			for (int i = 0; i < nodeList.getLength(); i++) {
				//ȡ�ýڵ�
				Node book = nodeList.item(i);
				//ȡ�ýڵ�����
				NamedNodeMap attrs = book.getAttributes();
				
				for (int j = 0; j < attrs.getLength(); j++) {
					Node att = attrs.item(j);
					System.out.println(att.getNodeName());
					System.out.println(att.getNodeValue());
				}
				//ȡ���ӽڵ㼯
				NodeList bookDettil = book.getChildNodes();
				for (int j = 0; j < bookDettil.getLength(); j++) {
					Node bookItem = bookDettil.item(j);
					if (bookItem.getNodeType() == Node.ELEMENT_NODE) {
						String str = bookItem.getNodeName();
						String strvualue1 = bookItem.getFirstChild().getNodeValue();
						String strvualue2 = bookItem.getTextContent();
						System.out.println(str);
						System.out.println(strvualue1);
						System.out.println(strvualue2);
					}
				}
			}
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
