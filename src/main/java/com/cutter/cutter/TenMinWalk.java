package com.cutter.cutter;

import org.springframework.stereotype.Component;


@Component
public class TenMinWalk {
    public static boolean isValid(char[] walk) {
        // Insert brilliant code here
        long northSouth = 0;
        long eastWest = 0;
        for (char c : walk) {
            if (c == 'n') {
                northSouth = northSouth + 1;
            }
            if (c == 's') {
                northSouth = northSouth - 1;

            }
            if (c == 'w') {
                eastWest = eastWest + 1;
            }
            if (c == 'e') {
                eastWest = eastWest - 1;

            }

        }
        return walk.length == 10 && eastWest == 0 && northSouth == 0;

    }
}

