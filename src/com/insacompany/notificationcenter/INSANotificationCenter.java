import java.util.HashMap;

/**
 * Made By INSA Company
 * Author: Usaki or Prokuma (Kim Do Hyun)
 *
 */
public class INSANotificationCenter {

    private HashMap<String,Object> Storage = new HashMap<String, Object>();
    private HashMap<String,INSANotificationListener> Observers = new HashMap<String, INSANotificationListener>();

    public INSANotificationCenter(){

    }

    public void setObserver(String name, INSANotificationListener listener){
        Observers.put(name, listener);
    }

    public void setInfo(String name, Object Info){
        if(Storage.get(name) != null){
            Storage.remove(name);
        }
        Storage.put(name, Info);
        INSANotificationListener listener = Observers.get(name);
        listener.getInfo(Storage.get(name));
    }

    public void removeInfo(String name){
        Storage.remove(name);
        INSANotificationListener listener = Observers.get(name);
        listener.getInfoNullable();
    }

    public void removeObserver(String name){
        Observers.remove(name);
    }
}