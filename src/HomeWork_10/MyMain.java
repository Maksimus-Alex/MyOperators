package HomeWork_10;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static HomeWork_10.ProcesDocument.ProcessDocument.*;

public class MyMain {

        public static void main(String[] args) {
            String documentNumber = "5896-uer-1816-izi-1p3q";// примерный номер документа
            System.out.println("Document Number is: "+documentNumber + "\n");
            functionalDocument(documentNumber);
            replaceAll( documentNumber);
            numDocument(documentNumber);
            originalDocument( documentNumber);
            checkDocument(documentNumber);

        }

    }


