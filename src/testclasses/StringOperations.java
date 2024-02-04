package testclasses;


public class StringOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sms = "Dear Customer,Your Consumer Loan application RefNo.RLOS-0000017518-LOS has been sent back by External Insurance coverage team. Kindly visit branch for more details.";
		
		//RLOS-0000017518-LOS
		System.out.println("sms length---->>>"+sms.length());
		
		String name = "Venkata Gireesh S Ram Charan Chiran";
		String input = "";
		//System.out.println("name length---->>>"+name.length());
		if(name.length()>34)
		{
			input = name.substring(0, 34);
		}
		else
		{
			input = name;
		}
		
		//System.out.println("Name--->>>"+input);
		
		
		
		
		
		String fullname = "Sanjeev Kumar jaudan";
        String firstName = "";
        String lastName = "";                    
        System.out.println("full name--->>"+fullname);
        try
        {
            if (fullname != null && !fullname.trim().equalsIgnoreCase("")) 
            {
                if(fullname.length()>0)
                {
                    fullname = fullname.trim();
                    
                    if (fullname.contains(" ")) 
                    {                    	
                        firstName = fullname.substring(0, fullname.indexOf(" "));

                        if(fullname.substring(fullname.indexOf(" ")).trim().length()>0)
                        {
                            lastName = fullname.substring(fullname.indexOf(" ")).trim();
                        }
                        else
                        {
                            lastName = firstName;
                        }
                    }
                    else
                    {
                        firstName = fullname;
                        lastName = fullname;
                    }                            
                }
            }	        	
        }
        catch(Exception e)
        {
        	System.out.println("Exception while doing full name splitting---->>>"+e.toString());
        }
        System.out.println("first name--->>>"+firstName);
        System.out.println("last Name--->>>"+lastName);		
		
        String str = "INDIA PaKiSTHAN";
        
        String words[]=str.split("\\s");  
        String capitalizeWord="";  
        for(String w:words)
        {  
            String first=w.substring(0,1);  
            String afterfirst=w.substring(1);  
            capitalizeWord+=first.toUpperCase()+afterfirst.toLowerCase()+" ";  
        }          
        System.out.println("camel case--->>>"+capitalizeWord);
        
        
        String num = "222,00";
        
        num = num.substring(0, num.indexOf(","));
        
        System.out.println("number--->>>"+num);
        
        
String outputxml = "<Output><ReqRefNum>294984672</ReqRefNum><EsbResStatus>0</EsbResStatus><CustDtlsRes><CustInfo><PersonInfo><TitlePrefix/><Name1stLine>NAME</Name1stLine><Name2ndLine/><ShortName>SHORTNAME</ShortName><Nationality>OM</Nationality><DateOfBirth>1983-11-08</DateOfBirth><MaritalStatus>MARRIED</MaritalStatus><Gender>MALE</Gender><NumOfDependents>1</NumOfDependents><Language>1</Language><ContactGSM/><ContactEmail/><SMS>0000000333681</SMS><ContactDate>2008-12-02</ContactDate><SMSCountryCode>00968</SMSCountryCode><Address><Residence>OM</Residence><ResidenceType>OTHERS</ResidenceType><ResidenceStatus>WITHPARENTS</ResidenceStatus><Street>134</Street><PostalCode>111</PostalCode><Town>Town-country 333681</Town><Address1>AL SEEB</Address1><City/><Country>Sultanate Of Oman</Country><Zip/><PrmStAdd>734</PrmStAdd></Address><Address><Residence/><ResidenceType/><ResidenceStatus/><Street/><PostalCode/><Town/><Address1/><City/><Country/><Zip/><PrmStAdd>MBL SOUTH</PrmStAdd></Address><Address><Residence/><ResidenceType/><ResidenceStatus/><Street/><PostalCode/><Town/><Address1/><City/><Country/><Zip/><PrmStAdd>A'SEEB</PrmStAdd></Address><Address><Residence/><ResidenceType/><ResidenceStatus/><Street/><PostalCode/><Town/><Address1/><City/><Country/><Zip/><PrmStAdd>MCT</PrmStAdd></Address><Address><Residence/><ResidenceType/><ResidenceStatus/><Street/><PostalCode/><Town/><Address1/><City/><Country/><Zip/><PrmStAdd>OM</PrmStAdd></Address><Address><Residence/><ResidenceType/><ResidenceStatus/><Street/><PostalCode/><Town/><Address1/><City/><Country/><Zip/><PrmStAdd>111</PrmStAdd></Address></PersonInfo><Telephone><Phone>91309339</Phone><CustOfficePhone>91309339</CustOfficePhone></Telephone><Sector>1001</Sector><CustomerStatus>1</CustomerStatus><CustType>INDIVIDUAL</CustType><CustSubType/><HomeBranchCode>OM0010311</HomeBranchCode><BranchDesc/><CustTitle>Mr.</CustTitle></CustInfo><EmpDtls><EduQual>SCNDRY.SCHOOL.CERTF.ONE</EduQual><Occupation>gen</Occupation><OccType>EMPLOYED</OccType><BasicSal>514</BasicSal><EmployerId>400869</EmployerId><EmployersName>MINISTRY OF DEFENCE</EmployersName><EmplType>GOVERNMENT</EmplType><TypeOfEmployment>PERMANENT</TypeOfEmployment><EmployeeStatus>EMPLOYED</EmployeeStatus><EmploymentStatus>GOVERNMENT</EmploymentStatus><EmplLevel>JR.OFFICER</EmplLevel><Designation>GURD</Designation><DOJ>2012-11-10</DOJ><Salary>551.500</Salary><OtherIncome>519</OtherIncome><EmployersAdd>721</EmployersAdd><RiskClassify>3</RiskClassify><Dept>GEN</Dept></EmpDtls><EmpDtls><EduQual/><Occupation/><OccType/><BasicSal/><EmployerId/><EmployersName/><EmplType/><TypeOfEmployment/><EmployeeStatus/><EmploymentStatus/><EmplLevel/><Designation/><DOJ/><Salary/><OtherIncome/><EmployersAdd>MABELA</EmployersAdd><RiskClassify/><Dept/></EmpDtls><EmpDtls><EduQual/><Occupation/><OccType/><BasicSal/><EmployerId/><EmployersName/><EmplType/><TypeOfEmployment/><EmployeeStatus/><EmploymentStatus/><EmplLevel/><Designation/><DOJ/><Salary/><OtherIncome/><EmployersAdd>111</EmployersAdd><RiskClassify/><Dept/></EmpDtls><EmpDtls><EduQual/><Occupation/><OccType/><BasicSal/><EmployerId/><EmployersName/><EmplType/><TypeOfEmployment/><EmployeeStatus/><EmploymentStatus/><EmplLevel/><Designation/><DOJ/><Salary/><OtherIncome/><EmployersAdd>OM</EmployersAdd><RiskClassify/><Dept/></EmpDtls><EmpDtls><EduQual/><Occupation/><OccType/><BasicSal/><EmployerId/><EmployersName/><EmplType/><TypeOfEmployment/><EmployeeStatus/><EmploymentStatus/><EmplLevel/><Designation/><DOJ/><Salary/><OtherIncome/><EmployersAdd/><RiskClassify/><Dept/></EmpDtls><EmpDtls><EduQual/><Occupation/><OccType/><BasicSal/><EmployerId/><EmployersName/><EmplType/><TypeOfEmployment/><EmployeeStatus/><EmploymentStatus/><EmplLevel/><Designation/><DOJ/><Salary/><OtherIncome/><EmployersAdd/><RiskClassify/><Dept/></EmpDtls><CustAddDtls><Target>998</Target><Industry>1000</Industry><EOSBAmt>1</EOSBAmt><SMSLang>1</SMSLang><BuildingNum>7157</BuildingNum><Landmark1>5156</Landmark1><Location>A'SEEB</Location><Landmark2>MCT</Landmark2><Landmark3>MBL SOUTH</Landmark3><OfficialEmail/><ContExpDate/><WILAYAT>43</WILAYAT><NumYrsCurRes>60</NumYrsCurRes><CustCurrency>OMR</CustCurrency><CustSince>2008-12-02</CustSince><FatherName>ALI</FatherName></CustAddDtls><InternalFields><BCSBId>02389393</BCSBId></InternalFields><LglDocDtls><BMLglDocName>NID</BMLglDocName><LegalId>0003/0238939</LegalId><LegalDocId>02389393</LegalDocId><LglExpDt>2019-05-01</LglExpDt><BMLglIssAuth>ROP</BMLglIssAuth><LglIssueDate/></LglDocDtls><LglDocDtls><BMLglDocName/><LegalId/><LegalDocId/><LglExpDt/><BMLglIssAuth/><LglIssueDate/></LglDocDtls><LglDocDtls><BMLglDocName/><LegalId/><LegalDocId/><LglExpDt/><BMLglIssAuth/><LglIssueDate/></LglDocDtls><LglDocDtls><BMLglDocName/><LegalId/><LegalDocId/><LglExpDt/><BMLglIssAuth/><LglIssueDate/></LglDocDtls><LglDocDtls><BMLglDocName/><LegalId/><LegalDocId/><LglExpDt/><BMLglIssAuth/><LglIssueDate/></LglDocDtls><LglDocDtls><BMLglDocName/><LegalId/><LegalDocId/><LglExpDt/><BMLglIssAuth/><LglIssueDate/></LglDocDtls><CorpDtls><SEMSClassification/><NoOfEmployees/><TurnOverStat/><ShareHolderName/><ShareHolderPer/><ShareHolderId/></CorpDtls><AccountDetails><AccountOfficer>90143</AccountOfficer></AccountDetails></CustDtlsRes></Output>";
System.out.println("output xml--->>>"+outputxml);
outputxml = outputxml.replaceAll("'", "''");
System.out.println("output xml final--->>>"+outputxml);



        

	}

}
