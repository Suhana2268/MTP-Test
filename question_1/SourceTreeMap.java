package question_1;

import java.util.TreeMap;

public class SourceTreeMap {
private static TreeMap<String, String>data;
public SourceTreeMap() {
//Initialize the TreeMap here..
	data=new TreeMap<String,String>();
}
public String getNumber(String name) {
//Return the number corresponding to the name else return null...
	return data.get(name);

    }
public boolean getName(String number) {
//Return true if number corresponding to the name in the TreeMap else return false
	if(data.containsValue(number))
     return true;
	else
		return false;
}
public String putNumber(String name, String number) throws IllegalArgumentException {
//Add the (name, number) pair into TreeMap and return string "True"
        //Else throw an exception with the message "Name or Number: NULL Exception" (IllegalArgumentException)
	
	try {
		data.put(name, number);
		return "True";
	}
	catch(Exception e)
	{
		throw new IllegalArgumentException("Name or Number: NULL Exception");
	}
}
}
