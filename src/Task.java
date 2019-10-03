import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Task {

  public static void main(String[] args) {
    ListTask myList = new ListTask();
    CheckTask myTask = new CheckTask();

    if (args.length == 0) {
      System.out.println("Command Line Todo application\n"
          + "=============================\n"
          + "\n"
          + "Command line arguments:\n"
          + "    -l   Lists all the tasks\n"
          + "    -a   Adds a new task\n"
          + "    -r   Removes an task\n"
          + "    -c   Completes an task\n");
    } else if (args[0].equals("-l")) {
      myList.printTask();
    } else if (args[0].equals("-a")) {
      myList.addTask(args[1]);
    } else if (args[0].equals("-r")) {
      myList.removeTask(args[1]);
    } else if (args[0].equals("-c")) {
      myTask.CheckIt(args[1]);
    }
  }
}
