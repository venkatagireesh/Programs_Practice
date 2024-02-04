package testclasses;

public class GenCorrectNID {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String tempNID = "3";
        int tempNIDlength = 0;
        int origNIDlength = 8;
        int reqdigits = 0;
        String correctNID = "";
        if(tempNID.length()!=8)
        {
            tempNIDlength = tempNID.length();
            reqdigits = origNIDlength - tempNIDlength;
            
            for(int i=0;i<reqdigits;i++)
            {
                correctNID = correctNID+"0";
            }
            
            correctNID = correctNID+tempNID;
        }
        else
        {
            correctNID = tempNID;
        }
        //this.setCustAuthnidID(correctNID);
        System.out.println("Correct NID is---->>>>"+correctNID);
        //CommonUtilities.DebugMsg("Final NID is---->>>>"+this.getCustAuthnidID());		

	}

}
