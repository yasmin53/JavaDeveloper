import java.time.LocalDate;
import java.time.Month;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class DateDemo {
	
	public static void main(String[] args)
	{
		
		//LocalDate date=LocalDate.now();
		//System.out.println("today's date is :"+date);
		
		/*LocalDate date1=LocalDate.now();
		int day=date1.getDayOfMonth();
		int month=date1.getMonthValue();
		int year=date1.getYear();
		
		System.out.printf("Year : %d , Month : %d , Day : %d \t %n",year,month,day);
		*/
		
		
        //LocalDate birthday=LocalDate.of(1998, 03, 24);
		
	//	System.out.println("Your birthday is :"+birthday);
		
		//LocalDate today=LocalDate.now();
	//	LocalDate birthday=LocalDate.of(1985, 01, 10);
		
		//if(birthday.equals(today))
		//{
			//System.out.printf("Today %s and birthday %s are same dates %n",today,birthday);
		//}
		//else
		//{
			//System.out.println("Dates are not Equal");
		//}
//LocalDate today=LocalDate.now();
		
	//	LocalDate next=today.plus(1, ChronoUnit.WEEKS);
		//System.out.println("Today's date is :"+today);
		//System.out.println("1 week Later date is :"+next);
		
		

		//LocalDate today=LocalDate.now();
		//LocalDate previous=today.minus(1, ChronoUnit.YEARS);
		//LocalDate next=today.plus(1, ChronoUnit.YEARS);
		//System.out.println("previous Years' date is :"+previous);
		//System.out.println("Today's date is :"+today);
		//System.out.println("1 Year Later date is :"+next);
		
		
    //YearMonth today=YearMonth.now();
		
		//System.out.printf("The current %s : %d \t %n",today,today.getMonthValue());
		
	//	YearMonth creditExpiry=YearMonth.of(2020, Month.OCTOBER);
		//System.out.println("Your Creadit Card Expiry is :"+creditExpiry);

		
//LocalDate today=LocalDate.now();
		
		//if(today.isLeapYear())
		//{
			//System.out.printf("The Year %s is a Leap Year %n",today);
		//}
		//else
		//{
			//System.out.printf("The Year %s is not a Leap year %n",today);
		//}
		
		String birthday="Jan 10 1985";
		try
		{
			DateTimeFormatter formatter=DateTimeFormatter.ofPattern("MMM dd yyyy");
			LocalDate birth=LocalDate.parse(birthday, formatter);
			System.out.printf("The Date %s is formatted in %s %n",birthday,birth);
		}
		catch (Exception e) {
			e.printStackTrace();
		
		

		/*
		 * Date date=new Date();
		 
		int day=date.getDay();
		switch(day)
		{
		case 0:
			System.out.println("sunday");
		break;
		case 1:
			System.out.println("monday");
		break;
		
		case 2:
			System.out.println("tuesday");
		break;
		
		case 3:
			System.out.println("wednesday");
		break;
		
		case 4:
			System.out.println("thursday");
		break;
		case 5:
			System.out.println("friday");
		break;
		case 6:
			System.out.println("satday");
		break;
		}
		*/
		
		}
	}
	
