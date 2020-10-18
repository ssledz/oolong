public class Main {

    private static void printUsage() {
        System.out.println("Usage oolong | gnoloo | dump-class");
    }

    private static String[] shift(String[] args) {
        String[] newArgs = new String[args.length - 1];
        System.arraycopy(args, 1, newArgs, 0, newArgs.length);
        return newArgs;
    }

    public static void main(String[] args) {
        if (args.length > 1) {
            switch (args[0]) {
                case "oolong":
                    COM.sootNsmoke.oolong.Oolong.main(shift(args));
                    break;
                case "gnoloo":
                    COM.sootNsmoke.oolong.Gnoloo.main(shift(args));
                    break;
                case "dump-class":
                    COM.sootNsmoke.oolong.DumpClass.main(shift(args));
                    break;
                default:
                    printUsage();
            }
        } else {
            printUsage();
        }
    }
}
