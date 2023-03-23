class q8 {

	static int findMinInsertions(char str[], int l,int h)
	{
		// Base Cases
		if (l > h) return Integer.MAX_VALUE;
		if (l == h) return 0;
		if (l == h - 1) return (str[l] == str[h])? 0 : 1;

		return (str[l] == str[h])?
			findMinInsertions(str, l + 1, h - 1):
			(Integer.min(findMinInsertions(str, l, h - 1),
			findMinInsertions(str, l + 1, h)) + 1);
	}

	// Driver program to test above functions
	public static void main(String args[])
	{
		String str= "geeks";
		System.out.println(findMinInsertions(str.toCharArray(),0, str.length()-1));
	}
}

