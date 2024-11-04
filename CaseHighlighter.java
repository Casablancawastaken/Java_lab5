package java_labs.Lab5;

import java.util.regex.*;

public class CaseHighlighter {
    public static void main(String[] args) {
        String str = "cat wOman higH";
        System.out.println(highlightCase(str));
    }

    public static String highlightCase(String str) {
        Pattern p = Pattern.compile("([a-zа-я])([A-ZА-Я])");
        Matcher m = p.matcher(str);
        return m.replaceAll("!$1$2!");
    }
}