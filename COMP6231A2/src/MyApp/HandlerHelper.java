package MyApp;


/**
* MyApp/HandlerHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Handler.idl
* Saturday, June 22, 2019 4:51:00 PM EDT
*/

abstract public class HandlerHelper
{
  private static String  _id = "IDL:MyApp/Handler:1.0";

  public static void insert (org.omg.CORBA.Any a, MyApp.Handler that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static MyApp.Handler extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (MyApp.HandlerHelper.id (), "Handler");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static MyApp.Handler read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_HandlerStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, MyApp.Handler value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static MyApp.Handler narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof MyApp.Handler)
      return (MyApp.Handler)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      MyApp._HandlerStub stub = new MyApp._HandlerStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static MyApp.Handler unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof MyApp.Handler)
      return (MyApp.Handler)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      MyApp._HandlerStub stub = new MyApp._HandlerStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
