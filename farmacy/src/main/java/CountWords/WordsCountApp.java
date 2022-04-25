package CountWords;

import org.apache.commons.io.FileUtils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.IOException;

import java.util.Arrays;

import java.util.HashSet;
import java.util.Set;

public class WordsCountApp {
    private static final Logger LOGGER = LogManager.getLogger(WordsCountApp.class);

    public static void main (String[] args) {
        // We locate the file with the text
        String text = "";
        try {
            text = FileUtils.readFileToString(new File("src/main/resources/ARTICLE.txt"), "UTF-8");
        } catch (IOException e) {
            LOGGER.error(e);
        }
        //Calculate the number of unique words
        String[] words = text.split("\\s+");
        Set<String> uniqueWordsSet = new HashSet<String>(Arrays.asList(words));
        System.out.println("Number of unique words in the text file: " + uniqueWordsSet.size());

        //Create a second txtfile with the count of words in the article (word - count)
        try {
            FileUtils.writeStringToFile(new File(
                            "src/main/result/textcountresult.txt"),
                    uniqueWordsSet.toString() + "\n" + uniqueWordsSet.size() + " unique words",
                    "UTF-8");
        } catch (IOException e) {
            LOGGER.error(e);
        }
    }
}

