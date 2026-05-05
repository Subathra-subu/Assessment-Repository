package assessment_answers;


abstract class BankTransactionException extends Exception{
	
	BankTransactionException(String message,int code){
		
		System.out.print(message+" [code:"+code+"]");
	}	
}

class InsufficientFundsException extends BankTransactionException{

	InsufficientFundsException(String s, int i) {
		super(s, i);
	}
	
}

class InvalidAccountException extends BankTransactionException{

	InvalidAccountException(String s, int i) {
		super(s, i);
	}
	
}

class TransactionLimitException extends BankTransactionException{

	TransactionLimitException(String s, int i) {
		super(s, i);
	}
	
}

public class BankingTransactionValidator {
	
	static int code = 1001;
	
	public static void ValidateTransaction(String accountId,double balance,double amount,double daily_limit) throws InvalidAccountException, InsufficientFundsException, TransactionLimitException {
		
		if(accountId=="") throw new InvalidAccountException("Account ID cannot be empty",code++);
		
		else if(balance < amount) throw new InsufficientFundsException("Shortfall:",code++);
		
		else if(balance > daily_limit) throw new TransactionLimitException(": Limit:",code++);
		
		else System.out.println("Validated");
	}

	public static void main(String[] args) {
		
		try {
			
			ValidateTransaction("",1000,500,2000);
			ValidateTransaction("ACC001",200,500,2000);
			ValidateTransaction("ACC002",5000,300,2000);
		}
		
		catch(InsufficientFundsException m) {
		}
		
		catch(TransactionLimitException m) {
		}
		
		catch(InvalidAccountException m) {
		}
		
		finally {
			System.out.print(" Validation Complete");
		}

	}

}
