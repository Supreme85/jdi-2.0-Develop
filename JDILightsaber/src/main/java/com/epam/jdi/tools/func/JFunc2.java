package com.epam.jdi.tools.func;

/**
 * Created by Roman Iovlev on 14.02.2018
 * Email: roman.iovlev.jdi@gmail.com; Skype: roman.iovlev
 */

@FunctionalInterface
public interface JFunc2<T1, T2, R> {
    R invoke(T1 val1, T2 val2) throws Exception;

    default R execute(T1 val1, T2 val2) {
        try {
            return invoke(val1, val2);
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }
}