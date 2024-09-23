package com.xworkz.shop.things;

public class Gpay {
	public static String appName = "Google Pay";
    public static String version = "1.0";
    public static double maxTransactionLimit = 10000.00;
    public static boolean isSupportedInIndia = true;
    public static String[] supportedCurrencies = {"USD", "INR"};

	public static void getDetails(String appNames) {
		if(appName == appNames) {
			System.out.println("its matiched");
		}
		else {
			System.out.println("no its doesn't");
			}
		}
	public static String getDetails(String verSion , String appNam) {
		System.out.println("version:"+verSion);
		System.out.println("appNam:"+appNam);
		return verSion + appNam;
	}
	public static void getDetails( String verSio , String apPname, Double maxTransactionLimits) {
		if( maxTransactionLimit == maxTransactionLimits ) { 				
			System.out.println("max Transaction:" +maxTransactionLimits);
			}
		else{
			System.out.println("max Transaction:"+maxTransactionLimits);
		}
	}
	public static void getDetails(boolean isSupportedInIndi) {
		if( isSupportedInIndia ==  isSupportedInIndi) {
			System.out.println("is Supported In India:" +isSupportedInIndi);
		}
	}
	public static void getDetails(String supportedCurrencie[]) {
		//for(int i = 0 ;i<supportedCurrencies.length; i++) {
//			if(supportedCurrencies == supportedCurrencie) {
//				System.out.println("supported Currencie:"+supportedCurrencie[i]);
//			}
//			else {
//				System.out.println("it doesn't match:"+supportedCurrencie[i]);
//				}
			//}
		}
		
}
