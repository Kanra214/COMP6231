package MyApp;

/**
* MyApp/HandlerHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Handler.idl
* Saturday, June 22, 2019 4:51:00 PM EDT
*/

public final class HandlerHolder implements org.omg.CORBA.portable.Streamable
{
  public MyApp.Handler value = null;

  public HandlerHolder ()
  {
  }

  public HandlerHolder (MyApp.Handler initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = MyApp.HandlerHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    MyApp.HandlerHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return MyApp.HandlerHelper.type ();
  }

}
