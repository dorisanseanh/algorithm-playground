package com.leetcode.list;

import java.util.ArrayList;
import java.util.List;


public class KidsWithCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandies = candies[0];
        for (int i = 1; i < candies.length; i++) {
            maxCandies = Math.max(maxCandies, candies[i]);

        }
        List<Boolean> result = new ArrayList<>();
        for (int candy : candies) {
            // Kiểm tra nếu sau khi thêm extraCandies, đứa trẻ có số kẹo lớn nhất không
            if (candy + extraCandies >= maxCandies) {
                result.add(true);
            } else {
                result.add(false);
            }
        }

        // Bước 3: Trả về kết quả
        return result;

    }
    public static void main(String[] args) {
        KidsWithCandies solution = new KidsWithCandies();

        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;

        List<Boolean> result = solution.kidsWithCandies(candies, extraCandies);
        System.out.println(result);  // Output: [true, true, true, false, true]
    }
}
