package com.epam.mjc;

import java.util.ArrayList;
import java.util.List;

public class InterfaceCreator {

    public Operation<Integer> divideBy(Integer divider) {
        Operation<Integer> operation = arg -> {

            List<Integer> result = new ArrayList<>();

            if (arg.size() > 0) {
                
                for (int i = 0; i < arg.size(); i++) {
                    result.add(arg.get(i) / divider);
                }
                
            }

            return result;
        };

        return operation;
    }
}
