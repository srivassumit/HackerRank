package com.hackerrank;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Queue;

public class HuffmanCodes {

	private static final int NUM_CHARS = 255;

	public static void main(String[] args) throws Exception {
		String[] charsetArray = generateCharset();
		Map<String, Integer> hm = new HashMap<String, Integer>();
		for (String str : charsetArray) {
			hm.put(str, 1);
		}
		String line = getLine();
		for (char ch : line.toCharArray()) {
			String str = String.valueOf(ch);
			int f1 = hm.get(str);
			hm.put(str, f1 + 1);
		}
		MinHeapComparator mihc = new MinHeapComparator();
		Queue<GraphNode> minPQueue = new PriorityQueue<GraphNode>(255, mihc);
		MinHeapComparator mahc = new MinHeapComparator();
		Queue<GraphNode> maxPQueue = new PriorityQueue<GraphNode>(255, mahc);

		List<GraphNode> nodes = new ArrayList<GraphNode>();

		for (Entry<String, Integer> e : hm.entrySet()) {
			GraphNode gn = new GraphNode(e.getKey(), e.getValue());
			nodes.add(gn);
			minPQueue.add(gn);
		}

		while (!minPQueue.isEmpty()) {
			if (minPQueue.size() == 1) {
				break;
			}
			GraphNode a = minPQueue.remove();
			GraphNode b = minPQueue.remove();
			GraphNode x = new GraphNode(a.label.concat(b.label), a.frequency + b.frequency);
			minPQueue.add(x);
			maxPQueue.add(a);
			maxPQueue.add(b);
			// maxPQueue.add(x);
		}

		while (!maxPQueue.isEmpty()) {
			GraphNode gn = maxPQueue.remove();
			System.out.println("Label: " + gn.label + ", Frequency: " + gn.frequency);
		}
		// String weight = "";
		// int counter = 0;
		// boolean flag = true;
		// while (!maxPQueue.isEmpty()) {
		// GraphNode gn = maxPQueue.remove();
		// if (gn.label.length() <= 2) {
		// if (flag) {
		// weight = weight.concat("0");
		// flag = false;
		// } else {
		// weight = weight.concat("1");
		// flag = true;
		// }
		// System.out.println(counter++ + ") " + gn.label + " = " + weight);
		// }
		// }
	}

	private static String getLine() throws Exception {
		String retVal = "";
		File f = new File("F:\\input.txt");
		BufferedReader br = new BufferedReader(new FileReader(f));
		String line = null;
		while ((line = br.readLine()) != null) {
			retVal = retVal.concat(line);
		}
		br.close();
		return retVal;
	}

	private static String[] generateCharset() {
		String[] returnVal = new String[NUM_CHARS + 1];
		Charset cs = Charset.forName("US-ASCII");

		for (int i = 0; i < NUM_CHARS + 1; i++) {
			ByteBuffer bb = ByteBuffer.allocate(4);
			bb.putInt(i);
			if (i > 126 || i < 33) {
				String s = Integer.toHexString(i).toUpperCase();
				if (s.length() == 1) {
					s = "0".concat(s);
				}
				returnVal[i] = s;
			} else {
				returnVal[i] = new String(bb.array(), cs).trim();
			}
		}
		return returnVal;
	}

}

class GraphNode {
	String label;
	int frequency;

	public GraphNode(String label, int frequency) {
		this.label = label;
		this.frequency = frequency;
	}
}

class MinHeapComparator implements Comparator<GraphNode> {
	@Override
	public int compare(GraphNode e1, GraphNode e2) {
		if (e1.frequency > e2.frequency) {
			return -1;
		} else if (e1.frequency < e2.frequency) {
			return 1;
		} else {
			return 0;
		}
	}
}

class MaxHeapComparator implements Comparator<GraphNode> {
	@Override
	public int compare(GraphNode e1, GraphNode e2) {
		if (e1.frequency > e2.frequency) {
			return 1;
		} else if (e1.frequency < e2.frequency) {
			return -1;
		} else {
			return 0;
		}
	}
}