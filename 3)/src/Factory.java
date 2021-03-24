public class Factory {
    public static IEditor create(Editor obj) {
        switch(obj.name()) {
            case "WORD" : {
                return new Word();
            }
            case "NOTEPAD" : {
                return new Notepad();
            }
            case "NOTE" : {
                return new Note();
            }
            default : {
                System.err.println("Factory.create: Enum not found");
                System.exit(0);
                return null;
            }
        }
    }
}
