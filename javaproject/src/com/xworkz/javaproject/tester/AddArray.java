package com.xworkz.javaproject.tester;

public class AddArray {
	public String str[] = { null, null };

	public int getlength() {
		return this.str.length;
	}

	public String getSave(String st) {
		int index = 0;
		if (st.length() < 16 && st.length() > 3) {
			if (st != null && st.startsWith("s") && st.endsWith("a")) {

				if (index < getlength()) {
					str[index] = st;
					index++;
					return " yes it accept all the condutions " + st;
				}

			} else {
				return "give the prover sentences";

			}

		}
		return "";

	}

	public void addElement() {
		for (int i = 0; i < str.length; i++) {
			str[i] = str[i];

		}
	}

	public static void main(String[] args) {
		AddArray re = new AddArray();
		re.addElement();
		String ste = re.getSave("shsha");
		System.out.println(ste);
	}

}
