/**
 * @author Anxhela
 * Klasa PredatoryCreditCrad zgjeron klasen CreditCard ne menyra:
 * (1) nëse një kreditim i tentuar refuzohet sepse do të kishte tejkaluar kufirin e
       fushës limit, një tarifë prej 5 euro do te shtohet ne balancën e kartës dhe 
   (2) do të ketë një mekanizëm për llogaritjen e tarifës mujore bazuar ne balancën e
       kartës, duke përdorur një interes përqindjeje vjetore i specifikuar si një
       parametër i ri ne konstruktorin e klasës.
       
 * Fjala kyce extends krijon nje nenklase te klases CreditCrad.
 * Themi qe CreditCard eshte nje super klase e PredatoryCreditCard dhe PredatoryCreditCard eshte nenklase e klases CreditCard.
 * 
 * Trashegimia shton nje marredhenie qe njihet si eshte-nje.
 * Kemi nje PredatoryCreditCard eshte-nje CreditCard.
 * Nenklasa trashegon te gjitha variablat e instances dhe metodat e superklases.
 *  E vetmja gje qe nuk trashegohet eshte konstruktori i klases. Nese duam ta therrasim konstruktorin e superklases duhet perdorur 
 *  fjala kyce super(). Te githa variablat private te superklases mbeten te paaksesueshem tek nenklasa 
 *  dhe mund te aksesohen vetem nepermjet metodave publike.
 *  Nese duam qe nje fushe private ta aksesojme brenda klases duhet ta ndryshojme ne protected.
 */
public class PredatoryCreditCard extends CreditCard{
private double apr; // anuual proccesing rate, perdoret per llogaritjen e tarifes mujore

/**
 * @param customer
 * @param bank
 * @param account
 * @param limit
 * @param balance
 * @param apr
 */
public PredatoryCreditCard(String customer, String bank, String account, int limit, double balance, double apr) {
	super(customer, bank, account, limit, balance);
	this.apr = apr;
}

/**
 * @return the apr
 */
public double getApr() {
	return apr;
}

/**
 * @param apr the apr to set
 */
public void setApr(double apr) {
	this.apr = apr;
}
@Override
public boolean charge(double amount) {
	if(!super.charge(amount)== false)
	{
		this.setBalance(this.getBalance()+5);
		return false;
	}
     return true; 
	}
/**
 * Metode e re specifike per kete klase e cila nje here ne muaj aplikon interes mujor ne baze te detyrimit qe ka klienti.
 */

public void processMonthly() {
	double interes = Math.pow(1 + apr, 1/12.0)* getBalance();
	setBalance(interes + this.getBalance());
}

}
