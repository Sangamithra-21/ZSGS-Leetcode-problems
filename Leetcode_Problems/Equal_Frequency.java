package Leetcode_Problems;


class Equal_Frequency {
    public boolean equalFrequency(String word) {
        int count[]=new int[26];
        for(int i=0;i<word.length();i++)
        {
            count[word.charAt(i)-'a']++;
        }
        for(int i=0;i<word.length();i++)
        {
            count[word.charAt(i)-'a']--;
            if(checkFreq(count))
            {
                return true;
            }
            count[word.charAt(i)-'a']++;
        }
        return false;
    }
    private boolean checkFreq(int[] count)
    {
        int freq=0;
        for(int i=0;i<26;i++)
        {
            if(count[i]>0){
                if(freq==0)
                {
                    freq=count[i];
                }
                else if(freq!=count[i])
                {
                    return false;
                }
            }
        }
        return true;
    }
}
