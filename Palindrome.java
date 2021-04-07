public class Palindrome{
    public static boolean is_palindrome(String s)
    {
	int a = 1;
   if (s.equals(""))
   {
	   return true;
   }
	  else
	  {
			 for (int i = 0;i < s.length();i++)
			 {
		 s = tangible.StringFunctions.changeCharacter(s, i, Character.toLowerCase(s.charAt(i)));

			 }

	   for (int i = 0;i < s.length() / 2;i++)

	   {

			if (s.charAt(i) == s.charAt(s.length() - i - 1))
			{
			   a = 1;
			}
	   else if (s.charAt(i) != s.charAt(s.length() - i - 1))
	   {
			a = 0;
		  break;
	   }
	   }
		if (a == 0)
		{
	return false;
		}
	 else
	 {
		 return true;
	 }
	  }

        return true;
    }
}
