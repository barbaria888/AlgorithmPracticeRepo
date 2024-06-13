class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
    int min=0;
    int moves=0;
    seats=Arrays.stream(seats).sorted().toArray();
    students=Arrays.stream(students).sorted().toArray();
     for(int i=0;i<seats.length;i++)
       min+=Math.abs(students[i]-seats[i]);
    return min;}    
    }
