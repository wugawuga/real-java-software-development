package chapter03;

import java.time.Month;
import java.util.List;

import chapter02.BankTransaction;
import jdk.jfr.Category;

public interface BankTransactionProcessor {
	double calculateTotalAmount();

	double calculateTotalInMonth(Month month);

	double calculateTotalInJanuary();

	double calculateAverageAmount();

	double calculateAverageAmountForCategory(Category category);

	List<BankTransaction> findTransactions(BankTransactionFilter bankTransactionFilter);
}
