class RnaTranscription {

    


String rnaString="";
	public String transcribe(String a)
	{
		for (int i =0;i<a.length();i++)
		{
			if (a.charAt(i)=='G')
				rnaString+='C';
			if (a.charAt(i)=='C')
				rnaString+='G';
			if (a.charAt(i)=='T')
				rnaString+='A';
			if (a.charAt(i)=='A')
				rnaString+='U';
		}
	return rnaString;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rnaTranscription rna=new rnaTranscription();
		System.out.println( rna.transcribe("ATGCAGT"));

	}

}


