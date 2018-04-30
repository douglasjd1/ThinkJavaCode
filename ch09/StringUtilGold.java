public class StringUtilGold
{
    public static void main(String[] args)
    {
        String[] test = {"zebra", "ant", "car", "boat", "alien", "aardvark", "giraffe", "owl", "earth" };
        for(int i=0;i<test.length;i++)
        {
            System.out.println(sort(test)[i]);
        }

        String[] str = {"dog", "dog"};
        System.out.println(sameCount(str));

    }

    private static boolean sameCount(String[] str)
    {
        int count = 0;
        int prevCount = 0;
        String prevString = "";
        boolean[] doIt = new boolean[str.length];

        for(int i=0;i<str.length;i++)
        {
            doIt[i]=true;
        }

        for(int i=0;i<str.length;i++)
        {
            count=0;
             if(doIt[i])
             {
                 for (int j = i; j < str.length; j++)
                 {
                     if (str[j].equals(str[i]))
                     {
                         count++;
                         doIt[j] = false;
                     }
                 }
                 if (count != prevCount && i > 0)
                     return false;
                 prevCount = count;
             }
        }
        return true;
    }

    private static String[] sort(String[] str)
    {

        String holder;
        for(int i=0;i<str.length;i++)
        {
            for (int j = i+1; j < str.length; j++)
            {
                if(str[i].compareTo(str[j])>0)
                {
                    holder=str[i];
                    str[i]=str[j];
                    str[j]=holder;
                }

            }
        }

        return str;
    }

}
