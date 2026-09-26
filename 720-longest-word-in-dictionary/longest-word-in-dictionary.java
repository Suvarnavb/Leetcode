class Solution {
    public String longestWord(String[] words) {
        String ans = "";
        for(int i=0; i<words.length; i++)
        {
            String word = words[i];
            boolean valid = true;

            for(int j=1; j<word.length(); j++)
            {
                String prefix = word.substring(0,j);
                boolean found = false;

                for(int k=0; k<words.length; k++)
                {
                    if(words[k].equals(prefix))
                    {
                        found = true;
                        break;
                    }
                }
                if(!found)
                {
                    valid = false;
                    break;
                }
            }
            if(valid)
            {
                if(word.length() > ans.length() || (word.length() == ans.length()&& word.compareTo(ans) < 0))
                {
                    ans = word;
                }
            }
        }
        return ans;
    }
}