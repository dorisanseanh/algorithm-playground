package com.leetcode.list;

public class CanPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;  // Biến đếm số hoa đã trồng
        for (int i = 0; i < flowerbed.length; i++) {
            // Kiểm tra điều kiện có thể trồng hoa ở vị trí i
            // Điều kiện là flowerbed[i] = 0 và hai bên flowerbed[i-1] và flowerbed[i+1] đều là 0
            // Chú ý: Phải kiểm tra rìa mảng để tránh lỗi ArrayIndexOutOfBounds
            if (flowerbed[i] == 0 &&
                    (i == 0 || flowerbed[i - 1] == 0) &&  // Điều kiện trái không có hoa hoặc là vị trí đầu mảng
                    (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {  // Điều kiện phải không có hoa hoặc là vị trí cuối mảng
                flowerbed[i] = 1;  // Trồng hoa ở vị trí i
                count++;  // Tăng số hoa đã trồng
                if (count >= n) {  // Kiểm tra nếu đã trồng đủ n bông hoa
                    return true;
                }
            }
        }
        return false;  // Nếu không trồng đủ n bông hoa thì trả về false
    }
    public static void main(String[] args) {
        CanPlaceFlowers cpf = new CanPlaceFlowers();
        int[] flowerbed = {1, 0, 0, 0, 1};
        System.out.println(cpf.canPlaceFlowers(flowerbed, 1)); // true
        System.out.println(cpf.canPlaceFlowers(flowerbed, 2)); // false
    }
}
