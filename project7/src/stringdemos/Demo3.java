package stringdemos;
import java.util.StringTokenizer;

public class Demo3 {
	public static void main(String[] args) {
		int i,n,j;
		String quote = "Once upon a time,in Mumbai";
		StringTokenizer st = new StringTokenizer(quote,",");
		int len = st.countTokens();
		System.out.println(len);
		String q[] = new String[len];
		i=0;
		while(st.hasMoreTokens())
		{
			q[i]= st.nextToken();
			System.out.println(q[i]);
			i++;
		}
		for(j=len-1;j>=0;j--)
		{
			System.out.println(q[j]);
		}
	}

}
