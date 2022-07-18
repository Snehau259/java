
public class theTwelveDays {

String S1,S2,S3,S4,S5;


	public void composeSong()
	{//String verse_no="";
	String startverse="On the ";
//	+verse_no+
	String endverse=" day of Christmas my true love gave to me: ";

	for(int i=0;i<5;i++)
	{
		if (i==0)
		{
			String verse_no="first";
			S1="a Partridge in a Pear Tree.";
			System.out.println(startverse+verse_no+endverse+S1);
		}
		else if (i==1)
		{String verse_no="second";
		S2="two Turtle Doves,"+"and "+S1;
		System.out.println(startverse+verse_no+endverse+S2);
			
		}
		else if (i==2)
		{String verse_no="third";
		S3="three French Hens,"+S2;
		System.out.println(startverse+verse_no+endverse+S3);
			
		}
		else if (i==3)
		{String verse_no="fourth";
		S4="four Calling Birds,"+S3;
		System.out.println(startverse+verse_no+endverse+S4);
		}
		else
		{String verse_no="fifth";
		S5="five Gold Rings,"+S4;
		System.out.println(startverse+verse_no+endverse+S5);
		}
	}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		theTwelveDays obj=new theTwelveDays();
		obj.composeSong();

	}

}
