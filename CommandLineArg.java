class CommandLineArg {
  public static void main(String[] args) {
    System.out.println("Program for displaying Command Line Arguments in Java!!");
    System.out.println("Command Line Arguments: ");
    for(int i = 0; i < args.length; i++) {
      if(i!=0) System.out.print(" ");
      System.out.print(args[i]);
    }
  }
}
