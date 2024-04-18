import java.util.Collections;
import java.util.HashSet;
import java.util.Random;

class RandomizedSet {
HashSet <Integer> set;

    public RandomizedSet() {
        this.set =new HashSet<>();
    }

    public boolean insert(int val) {
            if(set.contains(val)){
                return true;
            }
            set.add(val);
            return false;
    }

    public boolean remove(int val) {
if(set.contains(val))
{set.remove(val);
return true;}
return false;
    }

    public int getRandom() {
int min=0;
        Integer [] arr =set.toArray(new Integer[0]);
        int max=arr.length;
        int random = (int)((Math.random() * (max - min)) + min);
        return arr[random];
    }

    public static void main(String[] args) {
        RandomizedSet set =new RandomizedSet();

        set.insert(5);set.insert(4);set.insert(3);set.insert(2);set.insert(1);set.insert(0);
        for(int i=0;i<5;i++)
        {
        System.out.println(set.getRandom());}
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */