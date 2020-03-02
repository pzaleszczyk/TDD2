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
	String[] map_days = {
			"first","second","third","fourth","fifth","sixth","seventh","eighth","ninth","tenth","eleventh","twelfth"
	};
	String[] map_numbers = {
			"a","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve"
	};
	
	public String getVerse(int n) {
		String result = "On the ";
		result += map_days[n-1];
		result += " day of Christmas my true love gave to me: ";
		
		for(int i = n-1 ; i > 0; i --) {
			result += map_numbers[i]+" "+map[i]+", ";
		}
		if(n>1)
			result += "and ";
		result += map_numbers[0]+" "+map[0]+".";
		return result;
	}
	public String getVerse(int a, int b) {
		int start,end;
		if(a>b) {
			end = a;
			start = b;
		}
		else {
			end = b;
			start = a;
		}
				
		String result = "";
		for(int i = start; i <= end ; i++) {
			result += getVerse(i);
		}
		return result;
	}
}
