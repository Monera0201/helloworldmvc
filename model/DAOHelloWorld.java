public class DAOHelloWorld {
    private static DAOHelloWorld instance = null;
    private String fileName = "HelloWorld.txt";
    private String helloWorldMessage = null;

    private DAOHelloWorld() {}

    public static DAOHelloWorld getInstance() {
        if (instance == null) {
            instance = new DAOHelloWorld();
        }
        return instance;
    }

    public void setInstance(DAOHelloWorld instance) {
        DAOHelloWorld.instance = instance;
    }

    public void readFile() {
        // Logique pour lire le fichier HelloWorld.txt
    }

    public String getHelloWorldMessage() {
        return helloWorldMessage;
    }
    public void setHelloWorldMessage(String helloWorldMessage) {
        this.helloWorldMessage = helloWorldMessage;
    }
}
