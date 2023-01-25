package Easy;

class problem35 {
    public int searchInsert(int[] nums, int target) {
        int s = 0;
        int e = nums.length-1;
        while (s <= e) {
        int mid = s + (e - s) / 2;
        if (target < nums[mid]) {
            e = mid - 1;
        }
        else if (target > nums[mid]) {
            s = mid + 1;
        }

        else {
            return mid;
        }
    }
    return s;
    }
}