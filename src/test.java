import java.util.Scanner;
import java.io.*;
import java.util.Map;
import java.util.Stack;


public class test {
    public tempMap map;
    static Stack s;

    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Guadalupe\\IdeaProjects\\dictionary\\src\\src\\source.txt");
        s = new Stack(); //fill this bitch with chars
        stackFiller(s, file);
        mapGenerator(s);
    }


    public static void mapGenerator(Stack<String> stack) {
        String buf[] = new String[3];
        buf[0] = "\"";
        buf[1] = ",";
        buf[2] = "\"";
        String key = "", value = "";
        boolean onKey = true;
        tempMap map = new tempMap();
        int x = 0;

        for (String c : stack) {
            buf[x++] = c;
            if (x ==3 )
                x=0;
            if (onKey)
                key = key.concat(c);

            else
                value = value.concat(c);

            if (buf[0].equals("\"") && buf[1].equals(":") && buf[2].equals("\""))
                onKey = !onKey;
            else if (buf[0].equals("\"") && buf[1].equals(",") && buf[2].equals("\"")) {
                map.put(key, value);
                key = "";
                value = "";
            }
        }

    }

    public static void stackFiller(Stack s, File f) {

    }
}
    /*in:
        s: stack to be
        f: file to be accessed and drawn from
      out:
        none



    public static boolean checkSeperators(String[] a){
            if ((a[0].equals("\"") && a[1].equals(",") && a[2].equals("\"")) //buf is ","
            || (a[0].equals("\"") && a[1].equals(":") && a[2].equals("\""))) //buf is ":"
            return true;
        return false;
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
    }*/