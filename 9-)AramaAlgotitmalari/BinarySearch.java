
public class BinarySearch {
    public BinarySearch() {
    }

    public static void main(String[] args) {
        int[] nums = {2, 12, 15, 17, 27, 29, 45};//sıralı
        int target = 29;
        System.out.println(target + " sayısı "+search(nums, target)+". sıradadır ");
    }

    static int search(int[] nums, int target) {
        int start = 0; int sayac=0;
        int end = nums.length - 1;

        while (start <= end) {//dizide eleman var mı, 
            int mid = start + (end - start) / 2;
            sayac=sayac+1;
            if (nums[mid] > target)
                end = mid-1;
            else if (nums[mid] < target)
                start = mid + 1;
            else
            {//sayı bulunduğunda
                System.out.println(sayac);
                return mid;
            }
        }
        return -1;
    }
}