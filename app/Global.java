import models.*;
import play.*;

public class Global extends GlobalSettings {

    @Override
    public void onStart(Application app) {

        Entries.save(newEntry("Guillaume Bort", "+33 5 55 55 55 55"));
        Entries.save(newEntry("Sadak Drobi", "+33 5 55 55 55 55"));
    }

    private Entry newEntry(String name, String phone) {

        Entry entry = new Entry();
        entry.name = name;
        entry.phone = phone;
        return entry;
    }
}