class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
    int min=0;
    int moves=0;
    Arrays.sort(seats);
    Arrays.sort(students);
     for(int i=0;i<seats.length;i++)
        {min+=Math.abs(students[i]-seats[i]);}
        
        
    return min;}    
    }
