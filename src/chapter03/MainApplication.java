package chapter03;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import chapter02.BankStatementAnalyzer;
import chapter02.BankStatementCSVParser;
import chapter02.BankStatementParser;
import chapter02.BankTransaction;

public class MainApplication {

	private static final String RESOURCES = "src/chapter02/main/resources/";
	private static final BankStatementCSVParser bankStatementParser = new BankStatementCSVParser();

	public static void main(String[] args) throws IOException {
		final String fileName = "test.csv";
		final Path path = Paths.get(RESOURCES + fileName);
		final List<String> lines = Files.readAllLines(path);

		final List<BankTransaction> bankTransactions = bankStatementParser.parseLinesFrom(lines);
		final BankStatementProcessor bankStatementProcessor = new BankStatementProcessor(bankTransactions);

		final List<BankTransaction> transactions =
			bankStatementProcessor.findTransactions(new BankTransactionIsInFebruaryAndExpensive());
	}
}
