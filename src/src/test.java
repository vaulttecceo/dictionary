import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.util.Scanner;
import java.io.*;
import java.util.Map;


public class test {
    static char[] buff = new char[3];
    static String key, value;
    static boolean onKey = true;
    static int i = 0;

    public static void main(String[] args) throws IOException {
        File file = new File("/Users/johnmcguinness/Desktop/JavaPrograms/dictwitherik/src/src/source.txt");
        Scanner start = new Scanner(file);
        buff[0] = start.next().charAt(2);
        buff[1] = start.next().charAt(3);
        buff[2] = start.next().charAt(4);
        key = ""+ buff[0] + buff[1];

        for(; 0 < file.length(); i++){
            lookingAtFile(file);
            //add key and value into map here?? Does it work?
        }
    }
    public static void lookingAtFile(File f) throws IOException {
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
    }

}
