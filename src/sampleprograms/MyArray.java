package sampleprograms;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

	public class Source {
	    public static void main(String[] args) throws IOException {
	    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    	int number = Integer.parseInt(br.readLine());
	    	int nos[] = new int[number];
	    	String line = br.readLine();
	    	String[] strs = line.trim().split("\\s+"));
	    	for (int i = 0; i < number; i ++) {
	    		nos[i] = Integer.parseInt(strs[i]);
	    		if (nos[i] % 2 != 0)
	    		{
	    			System.out.printf("%d ",nos[i]+1);
	    		}
	    		else
	    		{
	    			System.out.printf("%d ",nos[i]);
	    		}
	    	}
	    	
	    }
	}

