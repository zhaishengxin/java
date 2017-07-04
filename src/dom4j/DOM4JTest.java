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
		//创建一个SAXReader对象
				SAXReader reader = new SAXReader();
				//通过reader的read方法加载xml文件
				try {
					Document document = reader.read(new File("books.xml"));
					//通过document对象获得根节点
					Element element = document.getRootElement();
					//通过elementIterator()获得迭代器
					Iterator it = element.elementIterator();
					//遍历迭代器获得根节点信息
					while(it.hasNext()){
						Element book = (Element) it.next();
						//获得book的属性名以及属性值
						List<Attribute> bookAttrs = book.attributes();
						for (Attribute attribute : bookAttrs) {
							System.out.println("节点属性名" + attribute.getName()
							+ "--节点属性值" + attribute.getValue());
						}
						//获取子节点信息
						Iterator<Element>itt = book.elementIterator();
						while (itt.hasNext()) {
							Element bookChild = itt.next();
							System.out.println("子节点名" + bookChild.getName()
							+ "子节点值" + bookChild.getStringValue());
						}
					}
				} catch (DocumentException e) {
					e.printStackTrace();
				}
	}
	private void createXML(){
		//1.创建document对象，代表整个xml文档
		Document document = DocumentHelper.createDocument();
		//2.创建根节点rss
		Element rss = document.addElement("rss");
		//3.想rss节点添加version属性
		rss.addAttribute("version","2.0" );
		//4.生成子节点及节点内容
		Element channal = rss.addElement("channal");
		Element tiltle = channal.addElement("title");
		tiltle.addText("国内新闻");
		//5.创建xml格式
		OutputFormat format = OutputFormat.createPrettyPrint();
		//6.生成xml文件
		File file = new File("rss.xml");
		XMLWriter writer;
		try {
			writer = new XMLWriter(new FileOutputStream(file),format);
			//设置是否转义
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
