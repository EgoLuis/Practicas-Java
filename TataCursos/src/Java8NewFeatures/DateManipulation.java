package Java8NewFeatures;

import java.io.*;
import java.time.*;
import java.time.format.*;

public class DateManipulation {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String stringInputDate = br.readLine();
		int days = Integer.parseInt(br.readLine().trim());
		int months = Integer.parseInt(br.readLine().trim());
		int years = Integer.parseInt(br.readLine().trim());
		br.close();
		String result = Solution.manipulation(stringInputDate, days, months, years);
		System.out.println(result);

	}

}

class Solution 
{
public static String manipulation(String stringInputDate, int days, int months, int years) {
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate localDate = LocalDate.parse(stringInputDate,df);
        LocalDate newd = localDate.plusDays(days).plusMonths(months).plusYears(years);
        String date = df.format(newd);
        return date;
    }
}
