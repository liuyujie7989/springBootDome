package com.liuyujie.demo.utils;
import com.ohaotian.plugin.db.Sequence;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: springBootDome
 * @description:
 * @author: liuyishou
 * @create: 2019-05-30 09:32
 **/
public class getSnowFlake {

    public static void main(String[] args) {

        List<Long> snow = getSnow(1000);
        for (Long aLong : snow) {
            System.out.println(aLong);
        }
    }

    public static List<Long> getSnow(int a ) {
        List<Long> longs = new ArrayList<>();
        for (int i = 0; i < a; i++) {
            Sequence instance = Sequence.getInstance();
            long l = instance.nextId();
            longs.add(l);
        }

return longs;
    }
}
