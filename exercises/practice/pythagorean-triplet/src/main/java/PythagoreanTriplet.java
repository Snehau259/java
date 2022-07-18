
public class pythagoreanTriplet {
int a,b,c,n;
void findpair(int n)
{for (int i=1;i<n;i++)
{
	for(int j=i+1;j<n;j++)
	{
		for(int k=j+1;k<n;k++)
		{
			if (i+j+k==n)
			{
			//System.out.printf("%d,%d,%d\n",i,j,k);
			if (i*i + j*j==k*k)
			{
				System.out.printf("{%d,%d,%d}\n",i,j,k);
			}
			}
		}
	}
}
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pythagoreanTriplet obj=new pythagoreanTriplet();
		obj.findpair(1000);

	}

}
