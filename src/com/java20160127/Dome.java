package com.java20160127;
//µ•œﬂ≥Ã≈‹¬Ì
class Horse {
	private String name;
	private int distance = 0;
	public Horse(String name) {
		this.name = name;
	}

	private void printTrace() {
		StringBuffer sb = new StringBuffer("");
		for (int i = 1; i <= distance; i++) {
			sb.append("*");
		}
		sb.append(this);
		System.out.println(sb);
	}
	
	public void run() {
		distance+= getRandom(0, 3);
		printTrace();
	}
	
	public int getDistance() {
		return distance;
	}
	
	
	private int getRandom(int low, int high) {
		if(low > high) {
			int t = low;
			low = high;
			high = t;
		}
		return (int)(Math.random() * (high - low + 1)) + low;
	}
	
	public String toString() {
		return name;
	}
}

public class Dome {
	public static final int FINISH_LINE = 75;
	private static void printFinishLine() {
		StringBuffer sb = new StringBuffer();
		for (int i = 1; i < FINISH_LINE; i++) {
			sb.append("=");
		}
		System.out.println(sb);
	}
	public static void main(String[] args) throws Exception {
		Horse[] hs = new Horse[5];
		String[] names = {"∫π—™±¶¬Ì", "±º≥€", "∞¬Õÿ", "∞¬¿˚∞¬", "∞¬√Ó"};
		for(int i = 0; i < hs.length; i++) {
			hs[i] = new Horse(names[i]);
		}
		Horse winHorse = null;
		while(winHorse == null) {
			printFinishLine();
			for (Horse h : hs) {
				h.run();
				if(h.getDistance() >= FINISH_LINE) {
					winHorse = h;
				}
			}
			Thread.sleep(100);
			
		}
		System.out.println(winHorse + "”Æ¡À");
	}
}
