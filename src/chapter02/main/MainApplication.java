package chapter02.main;

import java.io.IOException;

import chapter02.BankStatementAnalyzer;
import chapter02.BankStatementCSVParser;
import chapter02.BankStatementParser;

public class MainApplication {
	public static void main(String[] args) throws IOException {
		final String fileName = "test.csv";
		final BankStatementAnalyzer bankStatementAnalyzer = new BankStatementAnalyzer();

		final BankStatementParser bankStatementParser = new BankStatementCSVParser();

		bankStatementAnalyzer.analyze(fileName, bankStatementParser);
	}
}
