package test.util;

import net.sourceforge.pinyin4j.PinyinHelper;
import test.Customer;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author zhangda@sefonsoft.com
 * @title: Pinyin
 * @projectName saereport
 * @description: TODO
 * @date 2020/3/17 1:31 下午
 */
public class Pinyin {

    public static int compare(String s1, String s2) {
        for (int i = 0; i < s1.length() && i < s2.length(); i++) {
            int c1 = s1.charAt(i);
            int c2 = s2.charAt(i);
            boolean b = Character.isSupplementaryCodePoint(c1)
                    || Character.isSupplementaryCodePoint(c2);
            if (b) {
                i++;
            }

            if (c1 != c2) {
                if (b) {
                    return c1 - c2;
                }

                String pinyin1 = toPinyin((char) c1);
                String pinyin2 = toPinyin((char) c2);
                if (pinyin1 != null && pinyin2 != null) {
                    if (!pinyin1.equals(pinyin2))
                        return pinyin1.compareTo(pinyin2);
                } else {
                    return c1 - c2;
                }
            }
        }
        return s1.length() - s2.length();
    }

    private static String toPinyin(char c) {
        String[] pinyins = PinyinHelper.toHanyuPinyinStringArray(c);
        return pinyins == null ? null : pinyins[0];
    }

    public static List<String> sort(List<String> list) {
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Pinyin.compare(o1, o2);
            }
        });
        return list;
    }
}
