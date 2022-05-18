package ua.lviv.iot.lab4.expression;

import java.util.Arrays;
import java.util.Comparator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regular {

    public String switchFirstVowelWordWithTheLongestOneInEachSentences() {
        String text = "Founded on 6 March 1902 as Madrid Football Club,"
                + " the club has traditionally worn a white home kit "
                + "since inception. The honorific title real is Spanish"
                + " for and was bestowed to the club by King Alfonso "
                + "XIII in 1920 together with the royal crown in the"
                + " emblem. The team has played its home matches in"
                + " the 81,044-capacity Santiago Bernabeu Stadium in"
                + " downtown Madrid since 1947. Unlike most European"
                + " sporting entities, Real Madrid's members have "
                + "owned and operated the club throughout its " + "history.";
        String[] arrayOfSentences = text.split("\\.");
        String firstVowelWord;
        StringBuilder result = new StringBuilder();
        for (String eachSentence : arrayOfSentences) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(eachSentence);
            Matcher matcher = Pattern.compile("\\b[AEIOUYaeiouy](\\w+)\\b")
                    .matcher(eachSentence);
            matcher.find();
            firstVowelWord = matcher.group();
            String helpfulVariableWhichHelpSwitchTwoWords = "###";
            stringBuilder.replace(matcher.start(), matcher.end(), helpfulVariableWhichHelpSwitchTwoWords);
            String[] arrayOfWords = eachSentence.split("\\W");
            Arrays.sort(arrayOfWords,
                    Comparator.comparingInt(String::length).reversed());
            String sentenceResult = stringBuilder.toString();
            sentenceResult = sentenceResult.replace(arrayOfWords[0],
                    firstVowelWord);
            sentenceResult = sentenceResult.replace("###", arrayOfWords[0]);
            result.append(sentenceResult + ".");
        }
        System.out.println(result.toString());
        return result.toString();
    }
}
