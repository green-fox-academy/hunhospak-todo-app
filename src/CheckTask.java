import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CheckTask {

  public Path myPath = Paths.get("text.txt");
  List<String> myFile;

  public void CheckIt(String input) {
    int myNum = Integer.parseInt(input);
    try {
      myFile = Files.readAllLines(myPath);
      for (int i = 0; i < myFile.size(); i++) {
        if (i == myNum - 1) {
          myFile.set(i, "[x] " + myFile.get(i));
        } else {
          myFile.set(i, "[ ] " + myFile.get(i));
        }
      }
      Files.write(myPath,myFile);
    } catch (IOException e) {
    }
  }
}
