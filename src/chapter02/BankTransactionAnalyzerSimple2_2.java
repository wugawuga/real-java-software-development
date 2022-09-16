package chapter02;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class BankTransactionAnalyzerSimple2_2 {
	private static final String RESOURCES = "src/chapter02/main/resources/";

	public static void main(String[] args) throws IOException {
		args = new String[1];
		args[0] = "test.csv";
		final Path path = Paths.get(RESOURCES + args[0]);
		final List<String> lines = Files.readAllLines(path);

		double total = 0d;
		final DateTimeFormatter DATE_PATTERN = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		for (String line : lines) {
			final String[] columns = line.split(",");
			final LocalDate date = LocalDate.parse(columns[0], DATE_PATTERN);
			if (date.getMonth() == Month.JANUARY) {
				final double amount = Double.parseDouble(columns[1]);
				total += amount;
			}
		}

		System.out.println("The total for all transactions in January is " + total);
	}
}
