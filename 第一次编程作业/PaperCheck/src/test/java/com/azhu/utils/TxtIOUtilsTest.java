package com.azhu.utils;

import org.junit.Test;

public class TxtIOUtilsTest {

    @Test
    public void readTxtTest() {
        // 路径存在，正常读取
        String str = TxtIOUtils.readTxt("C:/Users/AIERXUAN/Desktop/第一次编程作业/test/测试文本/orig.txt");
        String[] strings = str.split(" ");
        for (String string : strings) {
            System.out.println(string);
        }
    }

    @Test
    public void writeTxtTest() {
        // 路径存在，正常写入
        double[] elem = {0.11, 0.22, 0.33, 0.44, 0.55};
        for (double v : elem) {
            TxtIOUtils.writeTxt(v, "C:/Users/AIERXUAN/Desktop/第一次编程作业/test/测试文本/ans.txt");
        }
    }

    @Test
    public void readTxtFailTest() {
        // 路径不存在，读取失败
        String str = TxtIOUtils.readTxt("C:/Users/AIERXUAN/Desktop/第一次编程作业/test/测试文本/none.txt");
        printf (" 路径不存在，读取失败");
    }

    private void printf(String s) {
    }

    @Test
    public void writeTxtFailTest() {
        // 路径错误，写入失败
        double[] elem = {0.11, 0.22, 0.33, 0.44, 0.55};
        for (double v : elem) {
            TxtIOUtils.writeTxt(v, "C:/Users/AIERXUAN/Desktop/第一次编程作业/test/测试文本/ans.txt");
        }
        printf ("路径错误，写入失败");
    }

}
