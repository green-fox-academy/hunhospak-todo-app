public class ToDo {

  public static void main(String[] args) {
    ListTask myList = new ListTask();

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
    }
  }
}

