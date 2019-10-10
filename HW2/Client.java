import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Client {
    private String FileName = "test.txt";
    private String DatabaseType;
    private String AlgorithmType;
    Scanner s = new Scanner(System.in);
    public static void main(String args[]){
        Client C = new Client();
        try {
            C.client();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public void client() throws IOException {
        setDatabaseType();
        setStoreStratagy();
        store();

    }
    private void setDatabaseType(){
        System.out.println("What Database type would you like to use? (Relational,  NoSQL,  Graph)");
        DatabaseType = s.nextLine();
        System.out.println("DataBase type set.");

    }
    private void setStoreStratagy(){
        System.out.println("What Algorithm type would you like to use? (Table, Document, Node)");
        AlgorithmType = s.nextLine();
        System.out.println("Store Strategy Set");
    }
    private void store() throws IOException {
        switch (DatabaseType) {
            case "Relational":
                Relational R = new Relational();
                System.out.println("Creating "+ DatabaseType + " DB with type " + AlgorithmType);
                R.setStoreStratagy(AlgorithmType);
                R.Store(FileName);
                break;
            case "NoSQL":
                NoSQL n = new NoSQL();
                System.out.println("Creating "+ DatabaseType + " DB with type " + AlgorithmType);
                n.setStoreStratagy(AlgorithmType);
                n.Store(FileName);
                break;
            case "Graph":
                Graph g = new Graph();
                System.out.println("Creating "+ DatabaseType + " DB with type " + AlgorithmType);
                g.setStoreStratagy(AlgorithmType);
                g.Store(FileName);
                break;
            default:
                System.out.println("you messed up somewhere");
                break;
        }

    }


}
class Relational{
    private String AlgorythmType;
    public void Relational(){

    }
    public void setStoreStratagy(String alg){
        AlgorythmType = alg;
    }
    public void Store(String fileName) throws IOException {
        switch (AlgorythmType){
            case "Table":
                write(fileName);
                break;
            case "Document":
                write(fileName);
                break;
            case "Node":
                write(fileName);
                break;
            default:
                System.out.println("how did you mess this up?");
                break;
        }
    }
    private void write(String File) throws IOException {
        System.out.println("Writing output file using Store Stratagy" + AlgorythmType);
        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream(File);
            out = new FileOutputStream("output.txt");

            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        }finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}
class NoSQL{
    private String AlgorythmType;
    public void Relational(){

    }
    public void setStoreStratagy(String alg){
        AlgorythmType = alg;
    }
    public void Store(String fileName) throws IOException {
        switch (AlgorythmType){
            case "Table":
                write(fileName);
                break;
            case "Document":
                write(fileName);
                break;
            case "Node":
                write(fileName);
                break;
            default:
                System.out.println("how did you mess this up?");
                break;
        }
    }
    private void write(String File) throws IOException {
        System.out.println("Writing output file using Store Stratagy" + AlgorythmType);
        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream(File);
            out = new FileOutputStream("output.txt");

            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        }finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}
class Graph{
    private String AlgorythmType;
    public void Graph(){

    }
    public void setStoreStratagy(String alg){
        AlgorythmType = alg;
    }
    public void Store(String fileName) throws IOException {
        switch (AlgorythmType){
            case "Table":
                write(fileName);
                break;
            case "Document":
                write(fileName);
                break;
            case "Node":
                write(fileName);
                break;
            default:
                System.out.println("how did you mess this up?");
                break;
        }
    }
    private void write(String File) throws IOException {
        System.out.println("Writing output file using Store Stratagy" + AlgorythmType);
        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream(File);
            out = new FileOutputStream("output.txt");

            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        }finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}