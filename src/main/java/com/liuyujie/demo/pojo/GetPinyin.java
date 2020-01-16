package com.liuyujie.demo.pojo;

import net.sourceforge.pinyin4j.PinyinHelper;
import net.sourceforge.pinyin4j.format.HanyuPinyinCaseType;
import net.sourceforge.pinyin4j.format.HanyuPinyinOutputFormat;
import net.sourceforge.pinyin4j.format.HanyuPinyinToneType;
import net.sourceforge.pinyin4j.format.HanyuPinyinVCharType;
import net.sourceforge.pinyin4j.format.exception.BadHanyuPinyinOutputFormatCombination;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: springBootDome
 * @description:
 * @author: liuyishou
 * @create: 2019-07-31 15:34
 **/
public class GetPinyin {
    /**
     * 得到 全拼
     *
     * @param
     * @return
     */
    public static List<String> getPingYin(String[] list) {
        ArrayList<String> strings = new ArrayList<>();
        for (String src : list) {
            char[] t1 = null;
            t1 = src.toCharArray();
            String[] t2 = new String[t1.length];
            HanyuPinyinOutputFormat t3 = new HanyuPinyinOutputFormat();
            t3.setCaseType(HanyuPinyinCaseType.LOWERCASE);
            t3.setToneType(HanyuPinyinToneType.WITHOUT_TONE);
            t3.setVCharType(HanyuPinyinVCharType.WITH_V);
            String t4 = "";
            int t0 = t1.length;
            try {
                for (int i = 0; i < t0; i++) {
                    // 判断是否为汉字字符
                    if (java.lang.Character.toString(t1[i]).matches("[\\u4E00-\\u9FA5]+")) {
                        t2 = PinyinHelper.toHanyuPinyinStringArray(t1[i], t3);
                        t4 += t2[0];
                    } else {
                        t4 += java.lang.Character.toString(t1[i]);
                    }
                }
            } catch (BadHanyuPinyinOutputFormatCombination e1) {
                e1.printStackTrace();
            }
            strings.add(t4);
        }
        return strings;
    }
    /**
     * 得到中文首字母
     *
     * @param str
     * @return
     */
    public static ArrayList<String> getPinYinHeadChar(String[] str) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < str.length; i++) {
            String convert = "";
            for (int j = 0; j < str[i].length(); j++) {
                char word = str[i].charAt(j);
                String[] pinyinArray = PinyinHelper.toHanyuPinyinStringArray(word);
                if (pinyinArray != null) {
                    convert += pinyinArray[0].charAt(0);
                } else {
                    convert += word;
                }
            }
            list.add(convert);
        }


        return list;
    }

    /**
     * 将字符串转移为ASCII码
     *
     * @param cnStr
     * @return
     */
    public static String getCnASCII(String cnStr) {
        StringBuffer strBuf = new StringBuffer();
        byte[] bGBK = cnStr.getBytes();
        for (int i = 0; i < bGBK.length; i++) {
            //System.out.println(Integer.toHexString(bGBK[i]&0xff));
            strBuf.append(Integer.toHexString(bGBK[i] & 0xff));
        }
        return strBuf.toString();
    }

    public static void main(String[] args) {

        //String cnStr = "今天天气好";
        //System.out.println(getPingYin(cnStr));
        String[] cnStr= {
                "牛露",
                "杨浩",
                "郭靖",
                "孙迎光",
                "张飞",
                "鹿筠",
                "侯嫄",
                "任俊莹",
                "李英",
                "薛倩",
                "陈桂玲",
                "袁满瀛",
                "李常胜",
                "刘刚",
                "陈晓宁",
                "邵秀丽",
                "杨晓慧",
                "乔东升",
                "代喜罕",
                "孙楠",
                "白杰",
                "乔永强",
                "田锋",
                "苏铁牛",
                "丁建政",
                "吕海宁",
                "冯晓鹏",
                "李飞",
                "张峰",

        };
        for (String s : getPinYinHeadChar(cnStr)) {
            System.out.println("ylq"+s);

        }
        ArrayList<String> pinYinHeadChar = getPinYinHeadChar(cnStr);
        System.out.println(pinYinHeadChar.toString());


      List<String> pingYin = getPingYin(cnStr);
        for (String s : pingYin) {
            System.out.println(s);
        }


    }

}

