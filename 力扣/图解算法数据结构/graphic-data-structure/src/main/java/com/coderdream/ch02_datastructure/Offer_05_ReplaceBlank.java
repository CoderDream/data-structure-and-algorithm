package com.coderdream.ch02_datastructure;

/**
 * 剑指 Offer 05. 替换空格
 * 请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
 * 示例 1：
 * 输入：s = "We are happy."
 * 输出："We%20are%20happy."
 *  
 * <p>
 * 限制：
 * 0 <= s 的长度 <= 10000
 * <p>
 * 作者：Krahets
 * 链接：https://leetcode.cn/leetbook/read/illustration-of-algorithm/50ywkd/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class Offer_05_ReplaceBlank {
    public String replaceSpace(String s) {
        // 构造可变字符串对象
        StringBuffer stringBuffer = new StringBuffer();
        // 遍历字符串中的所有字符（使用toCharArray()返回字符数组）
        for (Character c : s.toCharArray()) {
            // 如果字符为空格，则使用"%20"替换
            if (c == ' ') {
                stringBuffer.append("%20");
            }
            // 如果字符不为空格，则直接将字符加在可变字符串对象后面
            else {
                stringBuffer.append(c);
            }
        }
        // 将可变字符串对象转成字符串对象返回
        return stringBuffer.toString();
    }
}
