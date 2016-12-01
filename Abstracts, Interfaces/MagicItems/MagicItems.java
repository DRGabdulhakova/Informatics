public class MagicItems {
	public static void main(String[] args) {

		MagicWind wind = new MagicWind();
		InvisibilityCloak cloak = new InvisibilityCloak();

		cloak.hide();
		wind.protect();
		wind.disarm();
		wind.paralyze();
		wind.kill();
	}
}