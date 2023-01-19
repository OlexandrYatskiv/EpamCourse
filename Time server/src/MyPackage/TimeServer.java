package MyPackage;

import java.time.*;
public interface TimeServer {

    void setDateAndTime(int day, int month, int year,
                        int hour, int minute, int second);
    LocalDateTime getLocalDateTime();


}
