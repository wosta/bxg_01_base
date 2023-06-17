package com.olive.obj;

import com.google.gson.Gson;

/**
 * @description: Demo01
 * @date: 2023/6/11 12:31
 * @author: olive
 * @version: 1.0
 */
public class Demo01 {
    public static void main(String[] args) {
        User user = new User();
        user.setName("zs");
        user.setAge(18);
        int[] scores = {98, 99, 100};
        user.setScores(scores);
        User clone = user.clone();

        Gson gson = new Gson();
        String json = gson.toJson(user);
//        System.out.println(json);
        User user1 = gson.fromJson(json, User.class);

        // 基本类型无影响
//        user.setAge(20);
//        clone.setAge(20);
//        user1.setAge(20);
        scores[1] = 88;
//        user.setScores(scores);
        clone.setScores(scores);

        System.out.println("初始："+user);
        System.out.println("clone: "+clone.toString());
        System.out.println("user1 = " + user1);
    }
}
