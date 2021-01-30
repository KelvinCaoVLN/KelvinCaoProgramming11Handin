public class Main {
    //Code your solution to problem number one here
    static int problemOne(String s){
        int answer = 0;
        //your code here
        //Using the for and if statements I go through every index positions of the string and check if they equal any vowel.
        //If the character in the index position matches a vowel it increments the answer by one.
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
        // The for and if statements checks an index position and the one following it if they are equal to 'b' and 'o'.
        // If this comes out as true the next if statement would check if the 2nd index position following the original index position is equal to 'b'.
        // If this also comes out as true it will then add one to the 'bob' counter.
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

        // In this for loop the first if statement checks every index position one by one and compares it to the 1st index position that follows.
        // If the following character in the index position is greater than the from before than it will add one to the count.
        // The second if statement checks if the count is larger than the highestCount and if it is then the highest count will then be set to the count.
        // Also it will let the program know which index position the longest substring that is in alphabetical order ends.
        // The third if statement resets the count if the following character in the next index position is smaller than the one from before.
        // The final if statement is making it so that if the highest count is 1 then the answer would equal to the letter int the first index position.

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
        //sets the answer
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
