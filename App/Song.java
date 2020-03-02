package App;

public class Song {

	String[] map = {
			"Partridge in a Pear Tree",
			"Turtle Doves",
			"French Hens",
			"Calling Birds",
			"Gold Rings",
			"Geese-a-Laying",
			"Swans-a-Swimming",
			"Maids-a-Milking",
			"Ladies Dancing",
			"Lords-a-Leaping",
			"Pipers Piping",
			"Drummers Drumming"
			};
	
	public String getVerse(int n) {
		if(n == 2)
			return "On the second day of Christmas my true love gave to me: two Turtle Doves, and a Partridge in a Pear Tree.";
		else
			return "On the first day of Christmas my true love gave to me: a Partridge in a Pear Tree.";
	}
}
