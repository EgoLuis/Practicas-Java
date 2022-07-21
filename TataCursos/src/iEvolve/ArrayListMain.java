package iEvolve;

import java.util.*;

public class ArrayListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Ejercicio 1
		int n = 10; 
		int y = 4; 
		String x1 = "+2501 +2502 +2503 +2504";
		String x2 = "-2501 -2504 +2505 +2506 +2507 +2509";
		String x3 = "+2501 +2511 -2502 -2505";
		String x4 = "+2513 -2507 -2503 -2511 -2509";
		List<String> lista = new ArrayList<String>();
		lista.add(x1);
		lista.add(x2);
		lista.add(x3);
		lista.add(x4);
		String q = "2"; 
		
		//Ejercicio 2
		int n2 = 15; 
		int y2 = 6; 
		x1 = "+100 +101 +102 +103 +104 +105";
		x2 = "+106 +107 +108 -101 -104 -105 -103 -102";
		x3 = "+101 +109 +110 +111 -106 -100";
		x4 = "+112 +113 -101 +114 -109 -107 -110 -111";
		String x5 = "+101 -112 -113";
		String x6 = "+115 +116 -101 +112";
		List<String> lista2 = new ArrayList<String>();
		lista2.add(x1);
		lista2.add(x2);
		lista2.add(x3);
		lista2.add(x4);
		lista2.add(x5);
		lista2.add(x6);
		String q2 = "3,101";
		
		//test11
		int n11 = 8; 
		int y11 = 5;
		x1 = "+1001 +1002 +1003 +1004 +1005 +1015";
        x2 = "-1001 -1003 -1005 +1006 +1007 -1015";
        x3 = "+1008 -1004 -1002 +1009 -1006 +1001";
        x4 = "-1008 +1010 -1009 +1005 -1007";
        x5 = "+1011 -1010 -1005";
		List<String> lista11 = new ArrayList<String>();
		lista11.add(x1);
		lista11.add(x2);
		lista11.add(x3);
		lista11.add(x4);
		lista11.add(x5);
		String q11 = "1";
		
		//test12
		//capacity = 18, stops = 8 query = "2"
		List<String> lista12 = new ArrayList<String>();
		lista12.add("+12412 +5465 +5241 +52425 +21032 +21315");
		lista12.add("+5645 +56412 +41524 -12412 -21032 -21315");
		lista12.add("+56456 +46423 +12412 -5645 -52425 -5241 -5465");
		lista12.add("+1543 +1873 +28466 -12412 -56456 -41524");
		lista12.add("+35456 +36874 +4654 +12412 -1543");
		lista12.add("+4879 +4131 +532 +562 -28466 -12412");
		lista12.add("+65446 +10412 +12412 +68723 -532");
		lista12.add("+7545 +8651 -4131 -562");
		
		//test13
		//capacity = 30, stops = 12, query = "2"
		List<String> lista13 = new ArrayList<String>();
		lista13.add("+100 +101 +102 +103 +104 +105 +106 +107 +108 +109");
		lista13.add("+110 +111 +112 +113 +114 +115 +116 +117 +118 +119 -104 -107");
		lista13.add("+120 +121 +122 +123 +124 +125 -101 -111 -115 -112 -102");
		lista13.add("+126 +127 +128 +129 +130 +131 +132 +133 -120 -110");
		lista13.add("+134 +135 +136 +137 +138 -100 -103");
		lista13.add("+101 +104 +139 +140 -105 -106 -108 -109");
		lista13.add("-113 -114 -116 -117 -118 -119 -121 -122 -123 -124 -125 -126 -127 -128 -129 -130 -131 -132 -133 -134 -135 -136 -137");
		lista13.add("+141 +142");
		lista13.add("+143 +144 +121 +122 +123 +124 +125 +126 -101 -139 -138 -104");
		lista13.add("+145 +146 +147 +148 +149 -143 -144 -124 -125 -126");
		lista13.add("+150 +151 +152 +153 +154 +155 +101 +125 +124 +104 -123 -145 -146");
		lista13.add("+156 -101 -147 -148 -149 -150 -154");
		
		
		//test14
		//capacity = 8, stops = 5, query = "5, 1001"
		List<String> lista14 = new ArrayList<String>();
		lista14.add("+1001 +1002 +1003 +1004 +1005 +1015");
		lista14.add("-1001 -1003 -1005 +1006 +1007 -1015");
		lista14.add("+1008 -1004 -1002 +1009 -1006 +1001");
		lista14.add("-1008 +1010 -1009 +1005 -1007");
		lista14.add("+1011 -1010 -1005");
		
		//test 16
		//capacity 30, stops = 12, query = "3, 101"
		List<String> lista16 = new ArrayList<String>();
		lista16.add("+100 +101 +102 +103 +104 +105 +106 +107 +108 +109");
		lista16.add("+110 +111 +112 +113 +114 +115 +116 +117 +118 +119 -104 -107");
		lista16.add("+120 +121 +122 +123 +124 +125 -101 -111 -115 -112 -102");
		lista16.add("+126 +127 +128 +129 +130 +131 +132 +133 -120 -110");
		lista16.add("+134 +135 +136 +137 +138 -100 -103");
		lista16.add("+101 +104 +139 +140 -105 -106 -108 -109");
		lista16.add("-113 -114 -116 -117 -118 -119 -121 -122 -123 -124 -125 -126 -127 -128 -129 -130 -131 -132 -133 -134 -135 -136 -137");
		lista16.add("+141 +142");
		lista16.add("+143 +144 +121 +122 +123 +124 +125 +126 -101 -139 -138 -104");
		lista16.add("+145 +146 +147 +148 +149 -143 -144 -124 -125 -126");
		lista16.add("+150 +151 +152 +153 +154 +155 +101 +125 +124 +104 -123 -145 -146");
		lista16.add("+156 -101 -147 -148 -149 -150 -154");
		
		ArrayListBusProb autobus = new ArrayListBusProb();
		
		String resultado = autobus.output(30, 12, lista16, "3, 101");
		System.out.println(resultado);
		
		//test16
		//test17
		//test18

	}

}
