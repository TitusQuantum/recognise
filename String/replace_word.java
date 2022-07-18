/*
 * Consider the sentence as given below:
 * Blue bottle is in Blue bag lying on Blue carpet
 * Write a program to assign the given sentence to a string variable. Replace the word Blue with Red at all its occurrence. Display the new string as shown below:
 * Red bottle is in Red bag lying on Red carpet
*/

class replace_word {
    public static void main(String args[])
    {
        String s = "Blue bottle is in Blue bag lying on Blue carpet";
        s=s+" ";
        String ns="",w="",t="Blue",nw="Red"; 
        /*
         * ns for new string in which output will be stored;
         * w for storing words;
         * t for target word that is "Blue";
         * and nw for new word with which we will replace the target word that is "Red";
        */
        int l = s.length();
        for(int i=0;i<l;i++)
        {
            char ab=s.charAt(i);
            if(ab==32)
            {
                if(w.equals(t))
                    ns=ns+nw+" ";
                else
                    ns=ns+w+" ";
                w="";
            }
            else
            {
                w=w+ab;
            }
        }
        System.out.println(ns);
    }
}
