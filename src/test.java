import java.util.Scanner;
import java.io.*;
import java.util.Map;
import java.util.Stack;


public class test {

    tempMap map = new tempMap();
    char buf[] = new char[3];

    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Guadalupe\\IdeaProjects\\dictionary\\src\\src\\source.txt");
        Stack s = new Stack<String>(); //fill s with each character from the file in sequential order
        mapGenerator(s);
        }


    public static void mapGenerator(Stack<String> stack){
        String key, value;
        boolean onKey = true;

        for(String c : stack)
            // do stuff here
            
    }
}
  /*public static void lookingAtFile(File f) throws IOException {
        Scanner in = new Scanner(f);
        while(in.hasNext()){
               if(buff.equals("\";\"") && onKey==false){
                   onKey = true;
                   value += buff[3];
               }
               if(buff.equals("\",\"") && onKey){
                   onKey = false;
                   key += buff[3];
               }
               buff[0] = buff[1];
               buff[1] = buff[2];
               buff[2] = in.next().charAt(i);
       }
//            https://docs.google.com/document/d/12j9RDOletLUL42Sn_BffExvSUenzcRN2_LlqooTqYg8/edit?usp=sharing
    }*/
