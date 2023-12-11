// creating a program that reverses a string the user enters (e.g., “HELLO” to “OLLEH”)
//count entered characters
//use while to revert one by one
//print the result
//save it in history (the before and after) (A .csv file will be enough this time)
//make available to run again

public class ReverseString {

    public String RevertString(String text){
        int length=text.length();
        char[] characters = new char[length];
        int lengthPlus=length;

        for (int i=0;i<length;i++){
            lengthPlus=lengthPlus-1;
            characters[lengthPlus]=text.charAt(i);

        }

        String revertWord=new String(characters);

        return revertWord;
    }
}
