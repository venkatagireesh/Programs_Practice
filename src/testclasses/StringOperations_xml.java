package testclasses;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringOperations_xml {
	
	public static void main(String args [])
	{
		
		String jasondata = "{COUNTRY_OF_BIRTH=[سلطنة عمان], CSN=[3580003814D72A76], DATE_OF_BIRTH=[1980-03-05], ID_CIVIL_NUMBER=[31342712], ID_DATE_OF_EXPIRY=[2022-10-31], NATIONALITY_ARABIC=[عماني], NATIONALITY_ENGLISH=[OMANI], SEX_ARABIC=[ذكر], SEX_ENGLISH=[Male], TITLE_FULL_NAME_ARABIC=[بنك مسقط تيست], TITLE_FULL_NAME_ENGLISH=[BANK MUSCAT TEST]}";
		
		//jasondata = jasondata.replace("/[{\}[\]]/g","");
		
		jasondata = jasondata.replaceAll("\\[", "").replaceAll("\\]", "").replaceAll("\\{", "").replaceAll("\\}", "");
		
		System.out.println("jasondata---->>>"+jasondata);
		
		String jasonarray [] = jasondata.split(",");
		String response = "";
		for(int i=0; i<jasonarray.length;i++)
		{
			String tags [] = jasonarray[i].split("=");
			response = response+"<"+ tags[0].trim()+">"+tags[1]+"</"+tags[0].trim()+">";
		}
		
		response = "<output>"+response+"</output>";
		System.out.println("Response---->>>"+response);
		
		XMLParser parser= new XMLParser();
		parser.setInputXML(response);
		
		String name = parser.getValueOf("TITLE_FULL_NAME_ENGLISH");
		String nidnum = parser.getValueOf("ID_CIVIL_NUMBER");
		String nation = parser.getValueOf("NATIONALITY_ENGLISH");
		String gender = parser.getValueOf("SEX_ENGLISH");
		String dob = parser.getValueOf("DATE_OF_BIRTH");
		String idexpirydate = parser.getValueOf("ID_DATE_OF_EXPIRY");
		System.out.println("Name-->>"+name);
		System.out.println("nidnum-->>"+nidnum);
		System.out.println("nation-->>"+nation);
		System.out.println("gender-->>"+gender);
		System.out.println("dob-->>"+dob);
		System.out.println("idexpirydate-->>"+idexpirydate);
		
		List<String> class1 = new ArrayList<String>();
		List<String> class2 = new ArrayList<String>();
		List<String> class3 = new ArrayList<String>();
		
	    HashMap<String,List<String>> hmclass=new HashMap<String,List<String>>();   
	   	    
	    class1.add("11231467");
	    class2.add("2022-10-31");
	    class3.add("OMANI");
	    
	    hmclass.put("ID_CIVIL_NUMBER", class1);
	    hmclass.put("ID_DATE_OF_EXPIRY", class2);
	    hmclass.put("NATIONALITY_ENGLISH", class3);
	    
	    System.out.println("map data--->>>"+hmclass);
	    
	    
	    if(hmclass.get("ID_CIVIL_NUMBER")!=null)
	    {
	    	System.out.println("not null");
	    	String finalnid = hmclass.get("ID_CIVIL_NUMBER").toString().replaceAll("\\[", "").replaceAll("\\]", "");
		    System.out.println("finalnid--->>>"+finalnid);	    	
	    }
	    else
	    {
	    	System.out.println("null");
	    }
	    
	    
		
		
	}

}
