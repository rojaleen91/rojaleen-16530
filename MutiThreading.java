package assignments;

class Printer{
    void printDocuments(int noOfCopies, String docName)
    {
        for (int i = 0; i < noOfCopies ; i++)
        {
            System.out.println("Printing"+docName+" "+i);
        }
    }
}

//main method represents main thread
public class MutiThreading {

    public static void main(String args[]) {
        System.out.println("-------Application started--------");
        Printer printer = new Printer();
        printer.printDocuments(10,"rojaaprofile.pdf");
        System.out.println("---------Application Finished---------");
    }
}
