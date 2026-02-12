package strings;

public class enumsStrings {

	public static void main(String[] args) {
		
		String s = "Daniel";
		System.out.println(s.charAt(2)); // n
		System.out.println(String.format("LowerCase: %s - UpperCase: %s", s.toLowerCase(), s.toUpperCase()));
		char[] sa = s.toCharArray();
		for (char i : sa) {
			System.out.print(i + " ");
		}
		System.out.println("");
		System.out.println(s.startsWith("d"));  // Case sensitive
		System.out.println(s.endsWith("l"));
		
		System.out.println(s.indexOf("n")); // 2
		System.out.println(s.indexOf("v")); // -1
		String lname = "Porter";
		String fullname = s + " " + lname;
		System.out.println(fullname);
		
		
		// String Builder
		StringBuilder sb = new StringBuilder ("Bruce Springsteen ");
		System.out.println(sb);
		sb.append("is the artist ever");
		System.out.println(sb);
		sb.insert(25, "greatest ");
		System.out.println(sb);
		sb.insert(sb.indexOf("the"), "not ");
		System.out.println(sb);
		
		sb.replace(38, 44, "rock singer");
		System.out.println(sb);
		
		
		String[] pP = {
				"A man, Aplan, A canal, Panama!",
				"Was it a car or a cat I saw?",
				"No 'x in Nixon.",
				"Eva, can I see bees in a cave?!@!!",
				"Madam, in Edem, I'm Adam!!%%!!!@@",
				"thing"
		};
		
		for (String paslStr :pP) {
			isPNR(paslStr);
			isPR(paslStr);
		}
		
	}
	
	public static void isPNR(String input) {
		String[] junk = {"!","@","'"};
	}
	
	public static void isPR(String input) {
		String clean = input.replaceAll("[^A-Za-z]", "").toLowerCase();
		StringBuilder rev = new StringBuilder(clean).reverse();
		String reva = rev.toString();
		boolean a = clean.equals(reva) ? true : false;
		System.out.println(String.format("%s is %b", input, a));
	}
}
