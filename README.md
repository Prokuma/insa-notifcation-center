insa-notifcation-center
=======================

This can make in Java like NSNotificationCenter.
If you use this, I sure you comfortable Object to Object communication.
It is very simple, So, I think about you use easy this.
How about use this?

You can see sample code in com.insacompany.notificationcenter.test package.
Thank you for watch.

How to use?
=======================
1.Make INSANotificationCenter Object

```Java
//Methods argument names may different to real code
//Make NotificationCenter
INSANotificationCenter noti = new INSANotificationCenter();
```

2.Set Observer

```Java
noti.setObserver(String ObserverName, INSANotificationListener listener);
```

3.Set Listener

```Java
new INSANotificationListener{
  public getInfo(Object Data){
    //
  }
}

//or

class test implements INSANotificaionListenr {
//...
  public getInfo(Object Data){
    //
  }
}
```

3-1.Send Data

```Java
noti.sendInfo(String ObserverName, Object Data);
```

4.Remove Observer, Remove Info

```Java
//Remove Info
noti.removeInfo(String ObserverName);
//Remove Observer
noti.removeObserver(String ObserverName);
```
