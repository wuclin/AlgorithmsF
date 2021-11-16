package ST;

/***
 * 二分查找
 * rank1：递归
 * rank2：迭代，该版本在循环结束时lo的值正好等于表中小于被查找的键的键的个数，lo的初始值为0，且永远不会变小
 */
public class RankMethod {
    public int rank1(Key key, int lo, int hi){
        if (hi < lo) return lo;
        int mid = lo + (hi - lo)/2;
        int cmp = key.compareTo(keys[mid]);
        if (cmp < 0)
            return rank1(key, lo, mid-1);
        else if (cmp > 0)
            return rank1(key, mid+1, hi);
        else return mid;
    }

    public int rank2(Key key){
        int lo = 0, hi = N-1;
        while (lo <= hi){
            int mid = lo + (hi - lo)/2;
            int cmp = key.compareTo(keys[mid]);
            if (cmp < 0) hi = mid - 1;
            else if (cmp > 0) lo = mid + 1;
            else return mid;
        }
        return lo;
    }
}
