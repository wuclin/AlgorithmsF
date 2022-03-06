/**
 * 替换空格
 */
public class demo3 {
    public String replaceSpace(String s) {
        if (s == null || s.length() == 0)
            return "";

        int count = 0;
        for (int i = 0; i < s.length(); i++)
        {
            if (s.charAt(i) == ' ')
                count++;
        }
        char[] a = new char[2*count + s.length()];
        int size = 0;
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if (c == ' ')
            {
                a[size++] = '%';
                a[size++] = '2';
                a[size++] = '0';
            }
            else{
                a[size++] = c;
            }
        }


        String newStr = new String(a, 0, size);
        return newStr;
    }
}
