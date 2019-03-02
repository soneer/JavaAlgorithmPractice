import java.util.HashSet;
import java.util.Set;


public class LC_E_UniqueEmailAddressess {
	/**
	 * very email consists of a local name and a domain name, separated by the @ sign.

For example, in alice@leetcode.com, alice is the local name, and leetcode.com is the domain name.

Besides lowercase letters, these emails may contain '.'s or '+'s.

If you add periods ('.') between some characters in the local name part of an email address, mail sent there will be forwarded to the same address without dots in the local name.  For example, "alice.z@leetcode.com" and "alicez@leetcode.com" forward to the same email address.  (Note that this rule does not apply for domain names.)

If you add a plus ('+') in the local name, everything after the first plus sign will be ignored. This allows certain emails to be filtered, for example m.y+name@email.com will be forwarded to my@email.com.  (Again, this rule does not apply for domain names.)

It is possible to use both of these rules at the same time.

Given a list of emails, we send one email to each address in the list.  How many different addresses actually receive mails? 

Input: ["test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"]
Output: 2
Explanation: "testemail@leetcode.com" and "testemail@lee.tcode.com" actually receive mails

	 */
	
public static void main(String args[]) {
	LC_E_UniqueEmailAddressess x =  new LC_E_UniqueEmailAddressess();

}
	
	public LC_E_UniqueEmailAddressess() {
		String[] emails = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
		System.out.println(numUniqueEmails(emails));
	}


	public static int numUniqueEmails(String[] emails) {
		//Factors
		//1. ignore everything after "+"" sign
		//2. ignore "."

		//Approach
		//Loop through array
		// Filter Case 1
		// Filter Case 2

		//Complexity n
		Set uniqueEmails = new HashSet<String>();
		for(int i = 0; i < emails.length; i++){

			// Split string into 2 string at the @ sign
			String[] split =  emails[i].split("@");

			if(split[0].contains(".")&& split[0].length() > 0){
				split[0] = split[0].replaceAll("\\.","");   
			}
			if(split[0].contains("+") && split[0].length() > 0){
				split[0] = split[0].substring(0,   split[0].indexOf("+"));
			}

			if(split[0].length() > 0){
				uniqueEmails.add(split[0]+"@"+split[1]);
			}

		}

		return uniqueEmails.size();


	}
}
