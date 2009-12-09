package org.xtreemfs.interfaces.MRCInterface;

import java.io.StringWriter;
import org.xtreemfs.*;
import org.xtreemfs.common.buffer.ReusableBuffer;
import org.xtreemfs.interfaces.*;
import org.xtreemfs.interfaces.utils.*;
import yidl.runtime.Marshaller;
import yidl.runtime.PrettyPrinter;
import yidl.runtime.Struct;
import yidl.runtime.Unmarshaller;




public class accessResponse extends org.xtreemfs.interfaces.utils.Response
{
    public static final int TAG = 2009121111;
    
    public accessResponse() {  }
    public accessResponse( boolean returnValue ) { this.returnValue = returnValue; }

    public boolean getReturnValue() { return returnValue; }
    public void setReturnValue( boolean returnValue ) { this.returnValue = returnValue; }

    // java.lang.Object
    public String toString() 
    { 
        StringWriter string_writer = new StringWriter();
        string_writer.append(this.getClass().getCanonicalName());
        string_writer.append(" ");
        PrettyPrinter pretty_printer = new PrettyPrinter( string_writer );
        pretty_printer.writeStruct( "", this );
        return string_writer.toString();
    }


    // java.io.Serializable
    public static final long serialVersionUID = 2009121111;    

    // yidl.runtime.Object
    public int getTag() { return 2009121111; }
    public String getTypeName() { return "org::xtreemfs::interfaces::MRCInterface::accessResponse"; }
    
    public int getXDRSize()
    {
        int my_size = 0;
        my_size += Integer.SIZE / 8; // returnValue
        return my_size;
    }    
    
    public void marshal( Marshaller marshaller )
    {
        marshaller.writeBoolean( "returnValue", returnValue );
    }
    
    public void unmarshal( Unmarshaller unmarshaller ) 
    {
        returnValue = unmarshaller.readBoolean( "returnValue" );    
    }
        
    

    private boolean returnValue;    

}

