package com.psl.learning.demo;

public class StringManipulation {
	static int win[][] = {{0, 1, 2}, // Check first row.  
	    {3, 4, 5}, // Check second Row  
	    {6, 7, 8}, // Check third Row  
	    {0, 3, 6}, // Check first column  
	    {1, 4, 7}, // Check second Column  
	    {2, 5, 8}, // Check third Column  
	    {0, 4, 8}, // Check first Diagonal  
	    {2, 4, 6}}; // Check second Diagonal
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char board[] = {'X', 'O', 'O', 'O', 'X', 'O', 'O', 'O', 'X'}; 
		int arr[]={3,4,5,6,7};
		int a[]=findPrime(2,25);
		System.out.println(StringManipulation.count("hello hi bye hello", "hello"));
		System.out.println(StringManipulation.findPosition(5,arr));
		System.out.println(StringManipulation.makeReverse("To be or not to be"));
		printPermutn("123"," ");
		for(int i=0;i<a.length;i++)
		System.out.print(a[i]+" ");
		if(isValid(board))
			System.out.println("Valid");
		else
			System.out.println("Not valid");
	}
	static int count(String str, String word)  
	{ 
	    String a[] = str.split(" "); 
	    int count = 0; 
	    for (int i = 0; i < a.length; i++)  
	    { 
	    if (word.equals(a[i])) 
	        count++; 
	    } 
	  
	    return count; 
	}
	public static int findPosition(int num,int[] nos)
	{
		for(int i=0;i<nos.length;i++)
		{
			if(nos[i]==num)
				return i+1;
		}
		return -1;
	}
	public static String  makeReverse(String text) 
	{
		 boolean isWord = false;                                          
		   
		    String st;
		    StringBuffer reversedText = new StringBuffer();
		    StringBuffer word = new StringBuffer();
		    for(int i = 0 ; i  <text.length() ; ++i) {
		      if(!isWord) {                                                    
		        if(Character.isLetter(text.charAt(i))) {                      
		          word.append(text.charAt(i));                                 
		          isWord = true;                                               
		        } else {
		          reversedText.append(text.charAt(i));
		        }
		      } else {                                                        
		        if(Character.isLetter(text.charAt(i)) || text.charAt(i) == '\'') {
		          word.append(text.charAt(i));                                 
		          continue;
		        }
		        else {                                                         
		          reversedText.append(word.reverse());                         
		          reversedText.append(text.charAt(i));                         
		          word.delete(0,word.length());                                
		          isWord = false;                                              
		        }
		      }
		    }
		    if(word.length() > 0)                                              
		      reversedText.append(word.reverse());
		    st=reversedText.toString();
		    return st;
	}
	static void printPermutn(String str, String ans) 
    { 
        if (str.length() == 0) { 
            System.out.println(ans + " "); 
            return; 
        } 
  
        for (int i = 0; i < str.length(); i++) { 
            char ch = str.charAt(i);  
            String ros = str.substring(0, i) +str.substring(i + 1); 
            printPermutn(ros, ans + ch); 
        } 
    } 
	static int[] findPrime(int start,int end)
	{
		int flag,o=0;
		int arr[]=new int[10];
		for(int i=start;i<=end;i++)
		{
			if(i==1 || i==0)
				continue;
			flag=1;
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					flag=0;
					break;
				}
			}
			if(flag==1)
			{
				arr[o]=i;
				o++;
			}
		}
		return arr;
	}
	static boolean isValid(char board[]) { 
        int xCount = 0, oCount = 0; 
        for (int i = 0; i < 9; i++) { 
            if (board[i] == 'X') { 
                xCount++; 
            } 
            if (board[i] == 'O') { 
                oCount++; 
            } 
        }  
        if (xCount == oCount || xCount == oCount + 1) { 
            if (isCWin(board, 'O')) { 
                if (isCWin(board, 'X')) { 
                    return false; 
                }  
                return (xCount == oCount); 
            } 
            if (isCWin(board, 'X') && xCount != oCount + 1) { 
                return false; 
            } 
            return true; 
        } 
        return false; 
    } 
	 static boolean isCWin(char[] board, char c) {  
	        for (int i = 0; i < 8; i++) { 
	            if (board[win[i][0]] == c 
	                    && board[win[i][1]] == c 
	                    && board[win[i][2]] == c) { 
	                return true; 
	            } 
	        } 
	        return false; 
	    } 
	
}
