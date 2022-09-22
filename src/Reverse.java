
class Reverse
{
    // Complete the function
    // str: input string
    //psvm

    public static String reverseWord(String str)
    {int i;
        char ch;
        String hello="";
        // Reverse the string str

        for(i=0;i<str.length();i++){
            ch= str.charAt(i);
            hello=ch+hello;
        }
        return hello;
    }
}