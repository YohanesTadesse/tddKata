import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class KataEightConflictingObjectives {
    public static List<String> getComposedWord(final String string) {
        final List<String> sixLetterWords = new ArrayList<String>();
        final String fileName = "resources/word.txt";
        String line;
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(new File(fileName));
            final BufferedReader bufferedReader = new BufferedReader(fileReader);

            while ( (line = bufferedReader.readLine()) != null) {
                if (line.equalsIgnoreCase(string)) {
                    sixLetterWords.addAll(findCombinationWord(bufferedReader, line));
                }
            }

            bufferedReader.close();
        }
        catch (final FileNotFoundException ex) {
            System.out.println("Unable to open file '" + fileName + "'");
        }
        catch (final IOException ex) {
            System.out.println("Error reading file '" + fileName + "'");
        } finally {

            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (final IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return sixLetterWords;
    }

    private static List<String> findCombinationWord(final BufferedReader bufferedReader, final String line) {
        final List<String> foundCombinationWords = new ArrayList<String>();
        for (int i = 0; i < line.length() - 1; i++) {
            final String pre = line.substring(0, line.charAt( i + 1));
            final String post = line.substring(line.charAt( i + 1));
            boolean preFound = false;
            boolean postFound = false;
            String foundStr;
            try {
                while ((foundStr = bufferedReader.readLine()) != null) {
                    if (foundStr.equalsIgnoreCase(pre))
                        preFound = true;
                    if (foundStr.equalsIgnoreCase(post))
                        postFound = true;
                }

                if (preFound && postFound) {
                    foundCombinationWords.add(line + " -> " + pre + "-" + post);
                }
            } catch (final IOException ex) {

            }
        }
        return foundCombinationWords;
    }
}
