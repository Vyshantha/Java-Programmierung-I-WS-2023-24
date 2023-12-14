
public class Stadt {
	
	String stadtName;
	
	public Stadt(String nameDerStadt) {
		this.stadtName = nameDerStadt;
	}

	public void wieHeisstDieStadt() {
		System.out.println("Die Stadt heißt " + this.stadtName);
	}
	
	public void wieGrossIstDieStadt(int einwohner) {
		if (einwohner < 10000) {
			System.out.println("Die Stadt " + this.stadtName + " ist einer kleiner Stadt");
		} else if (einwohner >= 10000 && einwohner < 50000) {
			System.out.println("Die Stadt " + this.stadtName + " ist einer mittlegroßer Stadt");
		} else if (einwohner >= 50000 && einwohner < 1000000) {
			System.out.println("Die Stadt " + this.stadtName + " ist einer großer Stadt");
		} else if (einwohner >= 1000000) {
			System.out.println("Die Stadt " + this.stadtName + " ist einer sehr-großer Stadt");
		}
	}
	
	public static void main(String[] args) {
		Stadt s1 = new Stadt("Köln");
		s1.wieHeisstDieStadt();
		s1.wieGrossIstDieStadt(1086000);

		Stadt s2 = new Stadt("Aachen");
		s2.wieHeisstDieStadt();
		s2.wieGrossIstDieStadt(245885);
		
		Stadt s3 = new Stadt("Oberammergau");
		s3.wieHeisstDieStadt();
		s2.wieGrossIstDieStadt(5250);
		
	}

}
