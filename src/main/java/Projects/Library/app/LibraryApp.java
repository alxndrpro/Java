package Projects.Library.app;

class LibraryApp {
    public static void main(String[] args) {
        final String appName = "Library v0.9";
        System.out.println(appName);

        LibraryControl libControl = new LibraryControl();
        libControl.controlLoop();





    }

}
