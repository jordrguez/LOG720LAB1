package ca.etsmtl.log720.lab1;

/**
 *	Generated from IDL definition of exception "NoPermisExisteDejaException"
 *	@author JacORB IDL compiler 
 */

public final class NoPermisExisteDejaExceptionHolder
	implements org.omg.CORBA.portable.Streamable
{
	public ca.etsmtl.log720.lab1.NoPermisExisteDejaException value;

	public NoPermisExisteDejaExceptionHolder ()
	{
	}
	public NoPermisExisteDejaExceptionHolder(final ca.etsmtl.log720.lab1.NoPermisExisteDejaException initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ca.etsmtl.log720.lab1.NoPermisExisteDejaExceptionHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = ca.etsmtl.log720.lab1.NoPermisExisteDejaExceptionHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		ca.etsmtl.log720.lab1.NoPermisExisteDejaExceptionHelper.write(_out, value);
	}
}
