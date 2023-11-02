import java.util.*;

public class Likou {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(nums));
    }

    /**
     * 给定两个大小分别为 m 和 n 的正序（从小到大）数组 nums1 和 nums2。请你找出并返回这两个正序数组的 中位数 。
     */
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        //  新数组长度
        int len = nums1.length + nums2.length;
        int[] arr = new int[len];
        double results = 0;

        System.arraycopy(nums1, 0, arr, 0, nums1.length);
        System.arraycopy(nums2, 0, arr, nums1.length, nums2.length);
        int temp;
        /**
         * 冒泡排序
         * 让数组从小到大排序
         */
        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        if (len % 2 == 0) {
            int x = len / 2;
            double i = arr[x - 1] + arr[x];
            results = i / 2;
        } else {
            results = arr[len / 2];
        }

        return results;
    }

    /**
     * 最优解
     * 简单粗暴，先将两个数组合并，两个有序数组的合并也是归并排序中的一部分。然后根据奇数，还是偶数，返回中位数。
     * 时间复杂度：遍历全部数组 (m+n)(m+n)(m+n)
     * 空间复杂度：开辟了一个数组，保存合并后的两个数组 O(m+n)O(m+n)O(m+n)
     * <p>
     * 归并排序
     * 1、申请空间，使其大小为两个已经排序序列之和，该空间用来存放合并后的序列
     * 2、设定两个指针，最初位置分别为两个已经排序序列的起始位置
     * 3、比较两个指针所指向的元素，选择相对小的元素放入到合并空间，并移动指针到下一 位置
     * 重复步骤3直到某一 指针超出序列尾
     * 将另一 序列剩下的所有元素直接复制到合并序列尾
     * <p>
     * 两数组比较 谁小谁先放进去
     * <p>
     * <p>
     */

    //        给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
    //
    //        请必须使用时间复杂度为 O(log n) 的算法。
    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i]) return i;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) return i;
        }
        return nums.length;
    }

    /*
     * 3.无重复字符的最长子串
    public static int lengthOfLongestSubstring(String s) {
        int length = s.length();
        int index = 0;
        int len = 0;
        int maxLen = 0;
        if (length == 0 || length == 1) return length;
        for (int i = 0; i < length; i++) {
            index = i + 1;
            while (index < length - 1 && s.charAt(i) != s.charAt(index)) {
                if (s.charAt(i) != s.charAt(index)) {
                    System.out.print(i + "\t-->" + s.charAt(i) + "\t" + s.charAt(index) + "\t");
                    index = index + 1;
                    len = len + 1;
                }
            }
            System.out.println();
            if (len > maxLen) {
                maxLen = len;
                System.out.println(maxLen);
            }
            len = 1;
            count = 0;
        }
        return maxLen;
    }
    */
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> dic = new HashMap<>();
        int res = 0, tmp = 0, len = s.length();
        for (int j = 0; j < len; j++) {
            int i = dic.getOrDefault(s.charAt(j), -1); // 获取索引 i
            dic.put(s.charAt(j), j); // 更新 哈希表
            tmp = tmp < j - i ? tmp + 1 : j - i; // dp[j - 1] -> dp[j]
            res = Math.max(res, tmp); // max(dp[j - 1], dp[j])
        }
        return res;
    }


    /**
     * 5.最长回文子串
     * 中心扩散法
     */
    public static String longestPalindrome(String s) {
        int length = s.length();
        if (length < 2) return s;
        int start = 0, end = 0;
        int left = 0;
        int right = 0;
        int len = 0;

        for (int i = 0; i < length; i++) {
            left = i - 1;
            right = i + 1;
            //  截取左边 是否跟中间一样
            while (left >= 0 && s.charAt(left) == s.charAt(i)) {
                len++;
                left--;
            }
            //  截取右边是否跟中间一样
            while (right < length && s.charAt(right) == s.charAt(i)) {
                len++;
                right++;
            }
            //  边界前 判断中间值的左右是否相等
            while (left >= 0 && right < length && s.charAt(right) == s.charAt(left)) {
                len = len + 2;
                right++;
                left--;
            }
            //  记录最长回文字符的大小比较 以及回文的第一个位置
            if (len > end) {
                end = len;
                start = left;
            }
            len = 1;
        }
        return s.substring(start + 1, start + end + 1);
    }


    /**
     * 7.整数翻转
     * 给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。
     * <p>
     * 如果反转后整数超过 32 位的有符号整数的范围 [−231,  231 − 1] ，就返回 0。
     */
    public static int reverse(int x) {
        int count = 0;
        while (x != 0) {
            if (count < Integer.MIN_VALUE / 10 || count > Integer.MAX_VALUE / 10) return 0;
            count = x % 10 + count * 10;
            x = x / 10;
        }
        return count;
    }

    /**
     * 9.回文数
     * <p>
     * 给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。
     * <p>
     * 回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
     *
     * @param x
     * @return
     */
    public boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        String str1 = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            str1 = str1 + str.charAt(i);
        }
        if (str.equals(str1)) {
            return true;
        }
        return false;
    }

    /**
     * 15. 三数之和
     * 给你一个整数数组 nums ，判断是否存在三元组 [nums[i], nums[j], nums[k]] 满足 i != j、i != k 且 j != k ，同时还满足 nums[i] + nums[j] + nums[k] == 0 。请
     * 你返回所有和为 0 且不重复的三元组。
     * 注意：答案中不可以包含重复的三元组。
     */
    public static List<List<Integer>> threeSum(int[] nums) {
        //  创建一个装List的List
        List<List<Integer>> list = new ArrayList<>();
        //  判断 nums的长度，如果小于3 就是说 数组的三数之和不成立
        if (nums == null || nums.length < 3) {
            return list;
        }
        //  Arrays.sort ， 排序数组，从小到大排序
        Arrays.sort(nums);// 排序
        for (int i = 0; i < nums.length; i++) {
            //  排序完之后 说明 当循环到i的时候 ，i已经大于0了 后面的数怎么加 都不可能小于等于o
            if (nums[i] > 0) break;
            //  去重
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            //  i的后一个数
            int L = i + 1;
            //  最后一个数
            int R = nums.length - 1;
            while (L < R) {
                int sum = nums[i] + nums[L] + nums[R];
                if (sum == 0) {
                    list.add(Arrays.asList(nums[i], nums[L], nums[R]));
                    while (L < R && nums[L] == nums[L + 1]) L++;
                    while (L < R && nums[R] == nums[R - 1]) R--;
                    L++;
                    R--;
                } else if (sum < 0) L++;
                else if (sum > 0) R--;
            }
        }
        return list;
    }



    /*
     * 26.删除有序数组中的重复项
     * 给你一个 非严格递增排列 的数组 nums ，请你 原地 删除重复出现的元素，使每个元素 只出现一次 ，返回删除后数组的新长度。元素的 相对顺序 应该保持 一致 。然后返回 nums 中唯一元素的个数。
     */

    /**
     * public static int removeDuplicates(int[] nums){
     * int index = 0;
     * Map<Integer,Integer> map = new HashMap<>();
     * for(int i = 0;i<nums.length;i++){
     * if(map.get(nums[i]) == null){
     * map.put(nums[i],index);
     * index++;
     * }
     * continue;
     * }
     * int[] newArr = new int[map.size()];
     * for (int i = 0; i < map.size(); i++) {
     * Integer j = map.get(i);
     * newArr[i] = j;
     * }
     * return newArr.length;
     * }
     */
    public static int removeDuplicates(int[] nums) {
        int index = 0;
        for (int i = 1; i < nums.length; i++) {
            //找到不重复的元素，赋值到数组的开头
            if (nums[i] != nums[index]) {
                index++;
                nums[index] = nums[i];
            }
        }
        return index + 1;
    }

    /**
     * 32.最长有效括号
     * <p>
     * 给你一个只包含 '(' 和 ')' 的字符串，找出最长有效（格式正确且连续）括号子串的长度。
     */
    public int longestValidParentheses(String s) {
        Stack<Integer> st = new Stack<Integer>();
        int ans = 0;
        for (int i = 0, start = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') st.add(i);
            else {
                if (!st.isEmpty()) {
                    st.pop();
                    if (st.isEmpty()) ans = Math.max(ans, i - start + 1);
                    else ans = Math.max(ans, i - st.peek());
                } else start = i + 1;
            }
        }
        return ans;
    }


    /**
     * 260.只出现一次的数字|||
     * 给你一个整数数组 nums，其中恰好有两个元素只出现一次，其余所有元素均出现两次。 找出只出现一次的那两个元素。你可以按 任意顺序 返回答案。
     */
    public static int[] singleNumber260(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }

        for (Map.Entry entry : map.entrySet()) {
            Integer mapValue = (Integer) entry.getValue();
            if (mapValue == 1) {
                index++;
            }
        }
        int[] newArr = new int[index];
        index = 0;
        for (Map.Entry entry : map.entrySet()) {
            Integer mapKey = (Integer) entry.getKey();
            Integer mapValue = (Integer) entry.getValue();
            if (mapValue == 1) {
                newArr[index] = mapKey;
                index++;
            }
        }

        return newArr;
    }


    /**
     * 2091.从数组中一处最大值和最小值
     * 给你一个下标从 0 开始的数组 nums ，数组由若干 互不相同 的整数组成。
     * <p>
     * nums 中有一个值最小的元素和一个值最大的元素。分别称为 最小值 和 最大值 。你的目标是从数组中移除这两个元素。
     * <p>
     * 一次 删除 操作定义为从数组的 前面 移除一个元素或从数组的 后面 移除一个元素。
     * <p>
     * 返回将数组中最小值和最大值 都 移除需要的最小删除次数。
     *
     * @param nums
     * @return
     */
    public static int minimumDeletions(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int minLen = -1;
        int maxLen = -1;
        //  找到最大值最小值
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                maxLen = i;
            }
            if (nums[i] < min) {
                min = nums[i];
                minLen = i;
            }
        }

        //  从左边 删除
        int a = Math.max(maxLen, minLen) + 1;
        int b = nums.length - Math.min(maxLen, minLen);
        int c = 0;
        if (maxLen > minLen) {
            c = nums.length - maxLen + minLen + 1;
        } else {
            c = nums.length - minLen + maxLen + 1;
        }
        return Math.min(Math.min(a, b), c);
    }

    /**
     * 2520.统计能整出数字的位数
     * <p>
     * 给你一个整数 num ，返回 num 中能整除 num 的数位的数目。
     * <p>
     * 如果满足 nums % val == 0 ，则认为整数 val 可以整除 nums 。
     *
     * @param num
     * @return
     */
    public static int countDigits(int num) {
        int count = 0;
        int i = num;
        while (i != 0) {
            int index = i % 10;
            if (num % index == 0) {
                count++;
            }
            i = i / 10;
        }

        return count;
    }


    /**
     * 2652.倍数求和
     * 给你一个正整数 n ，请你计算在 [1，n] 范围内能被 3、5、7 整除的所有整数之和。
     * <p>
     * 返回一个整数，用于表示给定范围内所有满足约束条件的数字之和。
     */
    public int sumOfMultiples(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
