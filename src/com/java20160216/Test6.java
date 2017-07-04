package com.java20160216;
import java.io.File;
//6. 扫描你的电脑，把所有txt文件的绝对路径，输出到控制台。

public class Test6 {
	public static void walk(File file) {
		
			try {
				File[] files = file.listFiles();
				for(File ff : files) {
					if(ff.isDirectory()) {
						walk(ff);
					}
					if((ff.getName().substring(ff.getName().length()-3)).equals("txt")){
						System.out.println(ff.getAbsolutePath());
					}
				}
			} catch (Exception e) {
			}
	}
	public static void main(String[] args) throws Exception {
		walk(new File("c:\\"));
	}
}
