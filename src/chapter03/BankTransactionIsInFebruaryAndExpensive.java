package chapter03;

import java.time.Month;

import chapter02.BankTransaction;

public class BankTransactionIsInFebruaryAndExpensive implements BankTransactionFilter{
	@Override
	public boolean test(final BankTransaction bankTransaction) {
		return bankTransaction.getDate().getMonth() == Month.FEBRUARY
			&& bankTransaction.getAmount() >= 1_000;
	}
}
