import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.IO;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListTask {
  int myNum;
  public Path myPath = Paths.get("text.txt");

  public void printTask() {
    try {
      myPath = Paths.get("text.txt");
      List<String> myFile = Files.readAllLines(myPath);
      if (myFile.size() == 0) {
        System.out.println("No tasks for today");
      } else {
        for (int i = 0; i < myFile.size(); i++) {
          System.out.println(i + 1 + " " + myFile.get(i));
        }
      }
    }
    catch (IOException e) {
    }
  }

  public void addTask(String added) {
    try {
      List<String> myFile;
      myFile = Files.readAllLines(myPath);
      myFile.add(added);
      Files.write(myPath,myFile);
    } catch (IOException e) {
    }
  }

  public void removeTask(String input) {
    myNum = Integer.parseInt(input);
    try {
      List<String> myFile;
      myFile = Files.readAllLines(myPath);
      myFile.remove(myNum-1);
      Files.write(myPath,myFile);
      } catch (IOException e) {
    }
  }

}
