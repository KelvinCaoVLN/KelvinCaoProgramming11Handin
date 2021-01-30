public class Main {
    //Code your solution to problem number one here
    static int problemOne(String s){
        int answer = 0;
        //your code here
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'){
                answer++;
            }
        }

        return answer;
    }
    //Code your solution to problem number two here
    static int problemTwo(String s){
        int answer = 0;
        //your code here
        for (int i = 0; i < s.length() - 2;i++) {
            if ((s.charAt(i) == 'b') && (s.charAt(i + 1) == 'o')) {
                if (s.charAt(i + 2) == 'b') {
                    answer++;
                }
            }
        }

        return answer;
    }
    //Code your solution to problem number three here
    static String problemThree(String s){
        //your code here
        int count = 1;
        int highestCount = 0;
        int indexOfHighest = 0;
        int indexBeginning;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) <= s.charAt(i + 1)){
                count++;
            }
            if (count > highestCount) {
                highestCount = count;
                indexOfHighest = i + 2;
            }
            if (s.charAt(i) > s.charAt(i + 1)) {
                count = 1;
            }
        }
        indexBeginning = indexOfHighest - highestCount;
        if (indexBeginning == 1 && indexOfHighest == 2) {
            indexBeginning = 0; indexOfHighest = 1;
        }
        s = s.substring(indexBeginning,indexOfHighest);
        return s;
    }
    public static void main(String[] args) {
        /*
        Set s to a string and run your method using s as the parameter
        Run your method in a println statement to determine what the output was
        Once you think you have it working try running the tests.
        The tests will put your method through several different Strings to test
        all possible cases.  If you have 100% success then there is no bugs in your methods.
         */
        String s;
    }
}
