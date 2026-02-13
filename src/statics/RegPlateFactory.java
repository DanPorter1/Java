package statics;

public class RegPlateFactory {
	
	public static int id = -1;
	private static String[] registrationPlates = {
			"LA05 XYZ", // London
			"NG58 JKL", // Nottingham
//			"MA13 HYP", // Manchester
//			"BX06 TUV", // Birmingham
//			"CF67 QRS", // Cardiff
//			"YS09 PQR", // Yorkshire
//			"WD21 NML", // Exeter area (Western region)
//			"KR16 FGH", // Northampton
//			"SJ04 UVW", // Glasgow
//			"LV22 ABC", // Liverpool
//			"WX19 XYZ" // Bristol
	};
	
	public static RegistrationPlate getNextRegPlate() {
		id++;
		if (id < registrationPlates.length) {
			String plate = registrationPlates[id];
			RegistrationPlate reg = new RegistrationPlate(plate);
			return reg;
		}
		else {
			throw new IndexOutOfBoundsException("No more plate available");
//			String plate = registrationPlates[id];
//			RegistrationPlate reg = new RegistrationPlate(plate);
		}
	}
}
