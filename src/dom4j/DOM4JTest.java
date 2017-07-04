package dom4j;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

public class DOM4JTest {
	private void parseXML(){
		//����һ��SAXReader����
				SAXReader reader = new SAXReader();
				//ͨ��reader��read��������xml�ļ�
				try {
					Document document = reader.read(new File("books.xml"));
					//ͨ��document�����ø��ڵ�
					Element element = document.getRootElement();
					//ͨ��elementIterator()��õ�����
					Iterator it = element.elementIterator();
					//������������ø��ڵ���Ϣ
					while(it.hasNext()){
						Element book = (Element) it.next();
						//���book���������Լ�����ֵ
						List<Attribute> bookAttrs = book.attributes();
						for (Attribute attribute : bookAttrs) {
							System.out.println("�ڵ�������" + attribute.getName()
							+ "--�ڵ�����ֵ" + attribute.getValue());
						}
						//��ȡ�ӽڵ���Ϣ
						Iterator<Element>itt = book.elementIterator();
						while (itt.hasNext()) {
							Element bookChild = itt.next();
							System.out.println("�ӽڵ���" + bookChild.getName()
							+ "�ӽڵ�ֵ" + bookChild.getStringValue());
						}
					}
				} catch (DocumentException e) {
					e.printStackTrace();
				}
	}
	private void createXML(){
		//1.����document���󣬴�������xml�ĵ�
		Document document = DocumentHelper.createDocument();
		//2.�������ڵ�rss
		Element rss = document.addElement("rss");
		//3.��rss�ڵ����version����
		rss.addAttribute("version","2.0" );
		//4.�����ӽڵ㼰�ڵ�����
		Element channal = rss.addElement("channal");
		Element tiltle = channal.addElement("title");
		tiltle.addText("��������");
		//5.����xml��ʽ
		OutputFormat format = OutputFormat.createPrettyPrint();
		//6.����xml�ļ�
		File file = new File("rss.xml");
		XMLWriter writer;
		try {
			writer = new XMLWriter(new FileOutputStream(file),format);
			//�����Ƿ�ת��
			writer.setEscapeText(false);
			writer.write(document);
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new DOM4JTest().createXML();
	}
}
