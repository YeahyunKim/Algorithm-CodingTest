class Solution {
    
    static int answer = 0;
    static int count = 0 ;
    public int solution(String word) {
        String[] alphabetList = {"A", "E", "I", "O", "U"};
        
        dfs("", word, alphabetList);
        
        
        return count - 1;
    }
    
    public static void dfs(String words, String word, String[] alphabetList) {
        answer++;
        // System.out.println(words + " // " + answer);

        
        if (words.equals(word)) {
            count = answer;
        }
        
        if (words.length() == 5) return;
        
        for(int i = 0 ; i < alphabetList.length; i++) {
            dfs(words + alphabetList[i], word, alphabetList);
        }      
    }
}





// ['A', 'AA', 'AAA', 'AAAA', 'AAAAA', 'AAAAE', 'AAAAI', 'AAAAO', 'AAAAU', 'AAAE', 'AAAEA', 'AAAEE', 'AAAEI', 'AAAEO', 'AAAEU', 'AAAI', 'AAAIA', 'AAAIE', 'AAAII', 'AAAIO', 'AAAIU', 'AAAO', 'AAAOA', 'AAAOE', 'AAAOI', 'AAAOO', 'AAAOU', 'AAAU', 'AAAUA', 'AAAUE', 'AAAUI', 'AAAUO', 'AAAUU', 'AAE', 'AAEA', 'AAEAA', 'AAEAE', 'AAEAI', 'AAEAO', 'AAEAU', 'AAEE', 'AAEEA', 'AAEEE', 'AAEEI', 'AAEEO', 'AAEEU', 'AAEI', 'AAEIA', 'AAEIE', 'AAEII', 'AAEIO', 'AAEIU', 'AAEO', 'AAEOA', 'AAEOE', 'AAEOI', 'AAEOO', 'AAEOU', 'AAEU', 'AAEUA', 'AAEUE', 'AAEUI', 'AAEUO', 'AAEUU', 'AAI', 'AAIA', 'AAIAA', 'AAIAE', 'AAIAI', 'AAIAO', 'AAIAU', 'AAIE', 'AAIEA', 'AAIEE', 'AAIEI', 'AAIEO', 'AAIEU', 'AAII', 'AAIIA', 'AAIIE', 'AAIII', 'AAIIO', 'AAIIU', 'AAIO', 'AAIOA', 'AAIOE', 'AAIOI', 'AAIOO', 'AAIOU', 'AAIU', 'AAIUA', 'AAIUE', 'AAIUI', 'AAIUO', 'AAIUU', 'AAO', 'AAOA', 'AAOAA', 'AAOAE',