package com.harman.lms.utility;

import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class Utility {

  public String calculateCurrentDate() {
    final Date date = new Date();
    final String modifiedDate = new SimpleDateFormat("yyyy-MM-dd").format(date);
    System.out.println(modifiedDate);
    return modifiedDate;
  }

  public String calculateToDate() {
    final Date today = new Date();
    final long ltime = today.getTime() + 15 * 24 * 60 * 60 * 1000;
    final Date today15 = new Date(ltime);
    final String modifiedDate1 = new SimpleDateFormat("yyyy-MM-dd").format(today15);
    System.out.println(modifiedDate1);
    return modifiedDate1;
  }
}
