/**
 * Klasa Credit Card modelon nje karte krediti konsumatore.
 * @author Anxhela
 * 
 */
public class CreditCard {
protected String customer;  // emri i klientit
protected String bank;     // emri i bankes qe emeton kete karte
protected String account; // numri i llogarise qe lidhet me karten 
protected int limit;      // limiti i shpenzimit
protected double balance; // balanca e kartes qe perfCard(aqeson detyrimin e klientit
 
/**
 * Krijon nje karte te re krediti
 * @param customer emri i klientit
 * @param bank     emri i bankes
 * @param account  numri i llogarise p.sh 5391 0375 9387 5309
 * @param limit    limiti i kreditit ne euro p.sh 3000
 * @param balance  balanca fillestare e matur ne euro
 */
public CreditCard(String customer, String bank, String account, int limit, double balance) {
	this.customer = customer;
	this.bank = bank;
	this.account = account;
	this.limit = limit;
	this.balance = balance;
}

/**
 * Konstruktori Default
 */

public CreditCard() {
	
}


/**
 * @return emrin e klientit
 */
public String getCustomer() {
	return customer;
}

/**
 * @param customer vendos emrin e klientit
 */
public void setCustomer(String customer) {
	this.customer = customer;
}

/**
 * @return emrin e bankes
 */
public String getBank() {
	return bank;
}

/**
 * @param bank vendos emrin e bankes
 */
public void setBank(String bank) {
	this.bank = bank;
}

/**
 * @return numrin e llogarise
 */
public String getAccount() {
	return account;
}

/**
 * @param account vendos numrin e llogarise
 */
public void setAccount(String account) {
	this.account = account;
}

/**
 * @return limitin
 */
public int getLimit() {
	return limit;
}

/**
 * @param limit vendos limitin
 */
public void setLimit(int limit) {
	this.limit = limit;
}

/**
 * @return balancen
 */
public double getBalance() {
	return balance;
}

/**
 * @param balance vendos balancen
 */
public void setBalance(double balance) {
	this.balance = balance;
}
/**
 * Metoda realizon blerjen me nje karte krediti. Blerja konsiderohet e sukseshme nese balanca + amount nuk e kalon limitin.
 * @param amount shuma e blerjes
 * @return true nese blerja realizohet dhe false perndryshe 
 */
public boolean charge(double amount) {
	if(amount + this.getBalance() > this.getLimit())
		
		return false; // dalim nga metoda; blerja nuk u realizua
	setBalance(amount + this.getBalance());
	return true;
}

/**
 * Metoda ben nje pagese te kartes dhe zvogelon detyrimin nga fusha balance
 * @param amount vlera e pageses se kartes
 */
public void makePayement(double amount) {
	if (amount > 0 )
		setBalance(this.getBalance() - amount);
}
}