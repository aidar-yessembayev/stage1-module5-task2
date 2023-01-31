package com.epam.mjc;

public class InterfaceCreator {

    public Operation<Integer> divideBy(Integer divider) {
        Operation<Integer> operation = (arg) -> {

            for (int i = 0; i < arg.size(); i++) {
                arg.set(i, (arg.get(i) / divider));
            }

            return arg;
        };

        return operation;
    }
}
