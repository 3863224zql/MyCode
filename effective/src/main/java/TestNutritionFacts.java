/**
 * Baijiahulian.com Inc. Copyright (c) 2014-2018 All Rights Reserved.
 */

/**
 * @author zhouqinglai
 * @version version
 * @title TestNutritionFacts
 * @desc NutritionFacts测试
 * @date: 2018年08月13日
 */
public class TestNutritionFacts {
    public static void main(String[] args) {
        final NutritionFacts build = new NutritionFacts.Builder(240, 8).calories(100).sodium(35).carbohydrate(27).build();
        System.out.println(build);
    }
}
