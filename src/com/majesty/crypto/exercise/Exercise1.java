package com.majesty.crypto.exercise;

public class Exercise1 {
	public static void Ques01() {
		System.out.println("7503 mod 81 = " + (Math.floorMod(7503, 81)));
		System.out.println("(-7503) mod 81 = " + (Math.floorMod(-7503, 81)));
		System.out.println("81 mod 7503 = " + (Math.floorMod(81, 7503)));
		System.out.println("(-81) mod 7503 = " + (Math.floorMod(-81, 7503)));
	}

	public static void Ques02() {
		/**
		 * ((-a) mod m) + (a mod m) = ((am-a) mod m) + (a mod m) =
		 */
		System.out.println("");
	}

	public static void Ques05() {
		// k is 10
		// x is "LOOK UP IN THE AIR ITS A BIRD ITS A PLANE ITS SUPERMAN"
		String y = "BEEAKFYDJXUQYHYJIQRYHTYJIQFBQDUYJIIKFUHCQD";
		System.out.println("y is :" + y);
		for (int i = 1; i < 26; i++) {
			System.out.println("k = " + i + ": ");
			StringBuilder sb = new StringBuilder();
			for (int j = 0; j < y.length(); j++) {
				char ch = y.charAt(j);
				ch = (char) (Math.floorMod(ch - 'A' + i, 26) + 'A');
				sb.append(ch);
			}
			System.out.println(sb.toString());
		}
	}

	public static void Ques06(){
		//K=13
		//K=-13
	}
	
	
	public static void Ques07(){
		//30=2^1*3^1*5*1
		//Φ(m)=(2-1)*(3-1)*(5-1)=8
		//keyspace=8*30=240
		
		//100=2^2**5*2
		//Φ(100)=(4-2)*(25-5)=40
		//keyspace=40*100=4000
		
		//1225=5*245=5*5*49=5^2*7^2
		//Φ(1225)=(25-5)*(49-7)=840
		//keyspace=840*1225=1029000
	}
	
	
	
	
	
	
	
	
	
	
	
}
