insa-notifcation-center
=======================

This can make in Java like NSNotificationCenter.
If you use this, I sure you comfortable Object to Object communication.

How to use?
=======================
1.Make Object

```Java
//Make NotificationCenter
INSANotificationCenter noti = new INSANotificationCenter();
//Make Observer
INSANotificationObserver obse = new INSANotificationObserver(INSANotificationCenter Center);
//Make Sender
INSANotificationSender send = new INSANotificationSender(INSANotificationCenter Center);
```

2.Set Observer

```Java
obse.addObserver(String ObserverName, INSANotificationListener);
```

3.Make Listener

```Javq
new INSANotificationListener()
//or

implements INSANotificaionListenr {
//...
public 
```
