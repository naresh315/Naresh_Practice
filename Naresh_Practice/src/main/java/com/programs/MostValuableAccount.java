package com.programs;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class MostValuableAccount {
	public static void main(String[] args) {
		System.out.println("Please specify how many lines");
		Scanner scanner = new Scanner(System.in);
		int count = scanner.nextInt();
		System.out.println(" count:" + count);
		Account[] accounts = new Account[count];
		System.out.println("[Owner Name] [numberOfRegularMovies]] [numberOfExclusiveMovies]");
		String line = scanner.nextLine();
		for (int i = 0; i < accounts.length; i++) {
			line = scanner.nextLine();
			String[] attrs = line.split("\\s");
			accounts[i] = new Account(Integer.parseInt(attrs[1]), Integer.parseInt(attrs[2]), attrs[0]);
		}
		Account maxAccount = Arrays.asList(accounts).stream().max(Comparator.comparingInt(acc -> acc.monthlyCost()))
				.get();
		System.out.println(maxAccount);

	}
}

interface OnlineAccount {
	public int basePrice = 120;
	public int regularMoviePrice = 45;
	public int exclusiveMoviePrice = 80;
}

class Account implements OnlineAccount, Comparable<Account> {
	public int numOfRegularMoviews;
	public int numOfExclusiveMoviews;
	public String ownerName;

	public Account(int numOfRegularMoviews, int numOfExclusiveMoviews, String ownerName) {
		this.numOfRegularMoviews = numOfRegularMoviews;
		this.numOfExclusiveMoviews = numOfExclusiveMoviews;
		this.ownerName = ownerName;
	}

	public int monthlyCost() {
		return basePrice + (numOfRegularMoviews * regularMoviePrice) + (numOfExclusiveMoviews * exclusiveMoviePrice);

	}

	@Override
	public int compareTo(Account accountObj) {

		// TODO Auto-generated method stub
		// return this.monthlyCost() - accountObj.monthlyCost() ;
		return ((Integer) (this.monthlyCost())).compareTo(accountObj.monthlyCost());
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Owner is:  " + ownerName + ":   Monthly cost is:  " + monthlyCost() + "USD";
	}
}




