package chapter03;

import chapter02.BankTransaction;

@FunctionalInterface
public interface BankTransactionSummarizer {
	double summarize(double accumulator, BankTransaction bankTransaction);
}
