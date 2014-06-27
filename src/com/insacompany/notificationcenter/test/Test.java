/**
 * Created by Kim on 14. 6. 27..
 */
public class Test{

    public static void main(String[] args){
        Test1 test1 = new Test1();
        test1.aa();
    }
}

class Test1 implements  INSANotificationListener{
    private INSANotificationCenter insaNotificationCenter = new INSANotificationCenter();

    public void aa(){
        insaNotificationCenter.setObserver("aa", this);
        Test2 test2 = new Test2(insaNotificationCenter);
        test2.sendMessage("TestCode");
        test2.sendMessage("TestCode2");
        insaNotificationCenter.removeInfo("aa");
        test2.sendMessage("Smile~!");
    }

    @Override
    public void getInfo(Object Info) {
        System.out.println((String)Info);
    }

    @Override
    public void getInfoNullable() {
        System.out.println("Nullable");
    }
}

class Test2{
    INSANotificationCenter insaNotificationCenter;

    Test2(INSANotificationCenter insaNotificationCenter){
        this.insaNotificationCenter = insaNotificationCenter;
    }

    public void sendMessage(String message){
        insaNotificationCenter.setInfo("aa", message);
    }
}
