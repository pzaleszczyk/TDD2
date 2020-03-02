package Test;
import org.junit.Test;

import App.Song;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Ignore;

public class SongTest {

    private Song song;
    
    @Before
    public void setup() {
    	song = new Song();
    }
    


    @Test
    public void test1getverse1() {
        assertEquals("On the first day of Christmas my true love gave to me: a Partridge in a Pear Tree.",
        		song.getVerse(1));
    }

    
    @Test
    public void test2getverse2() {
    	assertEquals("On the second day of Christmas my true love gave to me: two Turtle Doves, and a Partridge in a Pear Tree.",
        		song.getVerse(2));
    }

    
    @Test
    public void test3getverse12() {
    	assertEquals("On the twelfth day of Christmas my true love gave to me:"
    			+ " twelve Drummers Drumming, eleven Pipers Piping, ten Lords-a-Leaping,"
    			+ " nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying,"
    			+ " five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.", 
        		song.getVerse(12));
    }
    
    
    @Test
    public void test4getverse1to2() {
    	assertEquals(
    			"On the first day of Christmas my true love gave to me: a Partridge in a Pear Tree."+
    			"On the second day of Christmas my true love gave to me: two Turtle Doves, and a Partridge in a Pear Tree.",
        		song.getVerse(1,2));
    }
    
    @Test
    public void test5getverse2to1() {
    	assertEquals(
    			"On the first day of Christmas my true love gave to me: a Partridge in a Pear Tree."+
    			"On the second day of Christmas my true love gave to me: two Turtle Doves, and a Partridge in a Pear Tree.",
        		song.getVerse(2,1));
    }
    
    @Test
    public void test6getverse1to1() {
    	assertEquals(
    			"On the first day of Christmas my true love gave to me: a Partridge in a Pear Tree.",
        		song.getVerse(1,1));
    }

    @Test (expected = IllegalArgumentException.class)
    public void test7getverseFromToWithNegative() {
    	assertEquals(
    			"On the first day of Christmas my true love gave to me: a Partridge in a Pear Tree.",
        		song.getVerse(-1,1));
    }
    
    @Test (expected = IllegalArgumentException.class)
    public void test7getverseWithNegative() {
    	assertEquals(
    			"On the first day of Christmas my true love gave to me: a Partridge in a Pear Tree.",
        		song.getVerse(-1));
    }
    
    @Test (expected = IllegalArgumentException.class)
    public void test7getverseFromToOver12() {
    	assertEquals(
    			"On the first day of Christmas my true love gave to me: a Partridge in a Pear Tree.",
        		song.getVerse(1,13));
    }
    
    @Test (expected = IllegalArgumentException.class)
    public void test7getverseOver12() {
    	assertEquals(
    			"On the first day of Christmas my true love gave to me: a Partridge in a Pear Tree.",
        		song.getVerse(13));
    }

    
    @Test
    public void testfullsong() {
        assertEquals("On the first day of Christmas my true love gave to me: a Partridge in a Pear Tree."+
        		"On the second day of Christmas my true love gave to me: two Turtle Doves, and a Partridge in a Pear Tree." + 
        		"On the third day of Christmas my true love gave to me: three French Hens, two Turtle Doves, and a Partridge in a Pear Tree." + 
        		"On the fourth day of Christmas my true love gave to me: four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree." +  
        		"On the fifth day of Christmas my true love gave to me: five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree." + 
        		"On the sixth day of Christmas my true love gave to me: six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree." + 
        		"On the seventh day of Christmas my true love gave to me: seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree." + 
        		"On the eighth day of Christmas my true love gave to me: eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree." + 
        		"On the ninth day of Christmas my true love gave to me: nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree." + 
        		"On the tenth day of Christmas my true love gave to me: ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree." + 
        		"On the eleventh day of Christmas my true love gave to me: eleven Pipers Piping, ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree." + 
        		"On the twelfth day of Christmas my true love gave to me: twelve Drummers Drumming, eleven Pipers Piping, ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.",
        		song.getVerse());
    }

}