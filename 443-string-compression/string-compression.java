class Solution{
    public int compress(char[] chars){
        int index = 0; 
        int i = 0;

        while(i < chars.length)
        {
            char ch = chars[i];
            int count = 0;

            while(i < chars.length && chars[i]==ch)
            {
                i++;
                count++;
            }
            chars[index] = ch;
            index++;

            if(count > 1)
            {
            String S = "" +count;

            for(int j = 0; j < S.length(); j++)
            {
                chars[index] = S.charAt(j);
                index++;
            }
            }
        }
        return index;
    }
    
}