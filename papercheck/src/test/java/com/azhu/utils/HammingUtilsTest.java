package com.azhu.utils;

import org.junit.Test;

import java.util.Objects;

public class HammingUtilsTest {

    @Test
    public void getHammingDistanceTest() {
        String str0 = TxtIOUtils.readTxt("E:/test/orig.txt");
        String str1 = TxtIOUtils.readTxt("E:/test/orig_0.8_add.txt");
        int distance = HammingUtils.getHammingDistance(Objects.requireNonNull(SimHashUtils.getSimHash(str0)), Objects.requireNonNull(SimHashUtils.getSimHash(str1)));
        System.out.println("海明距离：" + distance);
        System.out.println("相似度：" + (100 - distance * 100 / 128) + "%");
    }

    @Test
    public void getHammingDistanceFailTest() {
        // 测试str0.length()!=str1.length()的情况
        String str0 = "10101010";
        String str1 = "1010101";
        System.out.println(HammingUtils.getHammingDistance(str0, str1));
    }

    @Test
    public void getSimilarityTest() {
        String str0 = TxtIOUtils.readTxt("E:/test/orig.txt");
        String str1 = TxtIOUtils.readTxt("E:/test/orig_0.8_add.txt");
        int distance = HammingUtils.getHammingDistance(Objects.requireNonNull(SimHashUtils.getSimHash(str0)), Objects.requireNonNull(SimHashUtils.getSimHash(str1)));
        double similarity = HammingUtils.getSimilarity(SimHashUtils.getSimHash(str0), SimHashUtils.getSimHash(str1));
        System.out.println("str0和str1的汉明距离：" + distance);
        System.out.println("str0和str1的相似度：" + similarity);
    }

}
