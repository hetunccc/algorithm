package array;

import java.util.ArrayList;
import java.util.List;

public class KidsWiththeGreatestNumberofCandies1431 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        // 遍历数组 然后比最大值？

        int maxCandies = 0 ;
        for (int i = 0; i < candies.length; i++) {
            maxCandies = Math.max(maxCandies,candies[i]);
        }

        ArrayList<Boolean> list = new ArrayList<>();
        for (int candy:candies)
        {
            if (candy + extraCandies >= maxCandies)
                list.add(true);
            else
                list.add(false);
        }
        return list;
    }
}
