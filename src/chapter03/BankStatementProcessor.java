package chapter03;

import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import chapter02.BankTransaction;

public class BankStatementProcessor {

	private final List<BankTransaction> bankTransactions;

	public BankStatementProcessor(final List<BankTransaction> bankTransactions) {
		this.bankTransactions = bankTransactions;
	}

	public double calculateTotalAmount() {
		double total = 0d;
		for (final BankTransaction bankTransaction : bankTransactions) {
			total += bankTransaction.getAmount();
		}
		return total;
	}

	public double calculateTotalInMonth(final Month month) {
		double total = 0d;
		for (final BankTransaction bankTransaction : bankTransactions) {
			if (bankTransaction.getDate().getMonth() == month) {
				total += bankTransaction.getAmount();
			}
		}
		return total;
	}

	public double calculateTotalForCategory(final String category) {
		double total = 0d;
		for (final BankTransaction bankTransaction : bankTransactions) {
			if (bankTransaction.getDescription().equals(category)) {
				total += bankTransaction.getAmount();
			}
		}
		return total;
	}

	public List<BankTransaction> findTransactionsGreaterThanEqual(final int amount) {
		final List<BankTransaction> result = new ArrayList<>();
		for (final BankTransaction bankTransaction : bankTransactions) {
			if (bankTransaction.getAmount() >= amount) {
				result.add(bankTransaction);
			}
		}
		return result;
	}

	public List<BankTransaction> findTransactionsInMonth(final Month month) {
		final List<BankTransaction> result = new ArrayList<>();
		for (final BankTransaction bankTransaction : bankTransactions) {
			if (bankTransaction.getDate().getMonth() == month) {
				result.add(bankTransaction);
			}
		}
		return result;
	}

	// 거래 내역에 대한 조건들이 많을수록 코드가 복잡해짐
	// 반복되는 로직과 비즈니스 로직이 결합되어 분리가 어려움
	public List<BankTransaction> findTransactionsInMonthAndGreater(final Month month, final int amount) {
		final List<BankTransaction> result = new ArrayList<>();
		for (final BankTransaction bankTransaction : bankTransactions) {
			if (bankTransaction.getDate().getMonth() == month && bankTransaction.getAmount() >= amount) {
				result.add(bankTransaction);
			}
		}
		return result;
	}
}
