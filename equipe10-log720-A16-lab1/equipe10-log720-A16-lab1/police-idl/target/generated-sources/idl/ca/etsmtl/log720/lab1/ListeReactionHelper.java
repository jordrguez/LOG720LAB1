package ca.etsmtl.log720.lab1;

/**
 *	Generated from IDL definition of alias "ListeReaction"
 *	@author JacORB IDL compiler 
 */

public final class ListeReactionHelper
{
	private static org.omg.CORBA.TypeCode _type = null;

	public static void insert (org.omg.CORBA.Any any, int[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static int[] extract (final org.omg.CORBA.Any any)
	{
		return read (any.create_input_stream ());
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_alias_tc(ca.etsmtl.log720.lab1.ListeReactionHelper.id(), "ListeReaction",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(3))));
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:ca/etsmtl/log720/lab1/ListeReaction:1.0";
	}
	public static int[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		int[] _result;
		int _l_result1 = _in.read_long();
		_result = new int[_l_result1];
	_in.read_long_array(_result,0,_l_result1);
		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, int[] _s)
	{
		
		_out.write_long(_s.length);
		_out.write_long_array(_s,0,_s.length);
	}
}
