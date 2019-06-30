package Model;

import

//import java.io.FileInputStream;
import java.io.FileOutputStream;
//import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import android.content.Context;

public class BiblioCard {
    public FlashCard [] biblio;

    public SaveBiblio(String fileName, Context context){
        FileOutputStream fos = context.openFileOutput(fileName, Context.MODE_PRIVATE);
        ObjectOutputStream os = new ObjectOutputStream(fos);
        os.writeObject(this);
        os.close();
        fos.close();
    }

/*    public readBiblio(String fileName, Context context  ){
        FileInputStream fis = context.openFileInput(fileName);
        ObjectInputStream is = new ObjectInputStream(fis);
        FlashCard flashCard = (FlashCard) is.readObject();
        is.close();
        fis.close();
    }
*\
}
