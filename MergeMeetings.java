import java.util.*;
import java.lang.Math;

/**
 * Created by priyankananna on 1/13/19.
 */
//Merge the overlapping meetings
public class MergeMeetings {

    public static class Meeting {

        private int startTime;
        private int endTime;

        public Meeting(int startTime, int endTime) {
            this.startTime = startTime;
            this.endTime = endTime;

        }

        public int getStartTime() {
            return startTime;

        }

        public void setStartTime(int startTime) {
            this.startTime = startTime;
        }

        public int getEndTime() {
            return endTime;
        }

        public void setEndTime(int endTime) {
            this.endTime = endTime;
        }
    }



    public List<Meeting> mergedmeetings(List<Meeting> meetings){

        List<Meeting> copiedMeetings = new ArrayList<>(meetings);

        List<Meeting> result = new ArrayList<>();

        Collections.sort(copiedMeetings, Comparator.comparingInt(Meeting::getStartTime));

        result.add(copiedMeetings.get(0));
        for(Meeting currMeeting : copiedMeetings) {
            Meeting lastMerged = result.get(result.size() - 1);
            if (currMeeting.startTime <= lastMerged.getEndTime()) {
                lastMerged.setEndTime(Math.max(lastMerged.getEndTime(), currMeeting.getEndTime()));
            } else {
                result.add(currMeeting);

            }
        }
     return result;
    }


    public static void main(String args[]){
        MergeMeetings m = new MergeMeetings();
        final List<Meeting> meetings = Arrays.asList(
                new Meeting(1, 4), new Meeting(2, 5), new Meeting (5, 8));
        ;
        List<Meeting> resMeet = m.mergedmeetings(meetings);
        for(Meeting res : resMeet){
            System.out.println("MergedMeeting Start Time " + res.getStartTime() + "End Time "+ res.getEndTime() );
        }

    }
}
