package com.sk;

public class Logical2 {

	public static void main(String[] args) {

		String s = "LLLLLLookmaaann";
		char[] ch = s.toCharArray();
		int count = 1;
		int i = 0;
		for (i = 0; i < ch.length; i++) {

			if (ch[i] != ' ') {

				for (int j = i + 1; j < ch.length; j++) {

					if (ch[i] == ch[j]) {
						ch[j] = ' ';
						count++;
					}
				}

				System.out.println(ch[i] + "----------" + count);
				count = 1;

			}
		}
	}
}
