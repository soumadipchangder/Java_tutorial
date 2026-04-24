package m1;

import java.util.*;

public class ErrorLogExtractor {

    static class LogEntry {
        long arrivalTime;
        String[] log;

        LogEntry(long arrivalTime, String[] log) {
            this.arrivalTime = arrivalTime;
            this.log = log;
        }
    }

    public static List<String[]> extractErrorLog(String[][] logs) {

        List<LogEntry> filteredLogs = new ArrayList<>();

        for (String[] log : logs) {
            String date = log[0];
            String time = log[1];
            String status = log[2];

            // Step 1: Filter ERROR or CRITICAL
            if (status.equals("ERROR") || status.equals("CRITICAL")) {

                // Split date
                String[] d = date.split("-");
                String day = d[0];
                String month = d[1];
                String year = d[2];

                // Split time
                String[] t = time.split(":");
                String hour = t[0];
                String minute = t[1];

                // Create arrival time: YYYYMMDDHHMM
                long arrivalTime = Long.parseLong(
                        year + month + day + hour + minute
                );

                filteredLogs.add(new LogEntry(arrivalTime, log));
            }
        }

        // Step 2: Stable sort by arrival time
        Collections.sort(filteredLogs, (a, b) ->
                Long.compare(a.arrivalTime, b.arrivalTime)
        );

        // Step 3: Extract logs
        List<String[]> result = new ArrayList<>();
        for (LogEntry entry : filteredLogs) {
            result.add(entry.log);
        }

        return result;
    }

    // Testing
    public static void main(String[] args) {

        String[][] logs = {
                {"01-01-2023", "14:00", "ERROR", "failed"},
                {"01-01-2023", "15:00", "INFO", "established"},
                {"01-01-2023", "01:30", "ERROR", "failed"}
        };

        List<String[]> output = extractErrorLog(logs);

        for (String[] log : output) {
            System.out.println(Arrays.toString(log));
        }
    }
}