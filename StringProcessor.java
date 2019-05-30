package ua.iot.lviv;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringProcessor {


  public static String readInputText() throws IOException {
    Scanner sc = new Scanner(new InputStreamReader(System.in));
    System.out.print("Enter String");
    return sc.nextLine();

  }
  public String showResults(String st) {
     
    Pattern patern = Pattern.compile("([A-Za-z]{1,}\\sN[0-9][0-9].[0-9][0-9]'[0-9][0-9]\"\\sE[0-9][0-9].[0-9][0-9]'[0-9][0-9]\")");
    
    Matcher matcher = patern.matcher(st);
    while (matcher.find()) {
      String result = matcher.group();
        System.out.println(result);
        //sfsdff N12.12'12" E12.12'12" dsfdsffs

    }
    return null;
  }

  public static void main(String[] args) throws IOException {
    StringProcessor sp = new StringProcessor();
    String st = new String();
    st = sp.readInputText();
    sp.showResults(st);

  }

}
