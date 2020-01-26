//*******************************************************************
// Main
//
// Print date and time.
//
// History:
// 01/12/2020 Initial version
//*******************************************************************
import java.util.*;
import java.text.*;

class Main {
  public static void main(String[] args) {

  Date date;
  SimpleDateFormat date_format, time_format;

  date = new Date();
 
  date_format = new SimpleDateFormat ("E MM/dd/yyyy");
  time_format = new SimpleDateFormat ("hh:mm:ss a z");

  System.out.println("Current Date: " + date_format.format(date));
  System.out.println("Current Time: " + time_format.format(date));
  }
}
