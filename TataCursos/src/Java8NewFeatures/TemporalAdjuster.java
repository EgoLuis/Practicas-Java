package Java8NewFeatures;

import java.io.*;
import java.time.*;
import java.time.format.*;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjuster {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 int inputYear = Integer.parseInt(br.readLine().trim());
		 br.close();
		 String result = TemporalAdjusterSolution.friendShipDay(inputYear);
		 System.out.println("In the year " + inputYear + ", Friendship Day falls on " + result);
	}

}

class TemporalAdjusterSolution 
{
public static String friendShipDay(int inputYear) {
	  DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy");
      LocalDate date = LocalDate.of(inputYear, Month.AUGUST,15);
      return date.with(TemporalAdjusters.firstInMonth(DayOfWeek.SUNDAY)).format(df).toString();
    }
}
