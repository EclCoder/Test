package com.bytedance.adsdk.hnj.hn.sk.hnj;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hn {
    private static boolean hnj(int i10, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return i10 == number.intValue();
        }
        if (number instanceof Long) {
            return ((long) i10) == number.longValue();
        }
        if (number instanceof Float) {
            return ((float) i10) == number.floatValue();
        }
        if (number instanceof Double) {
            return ((double) i10) == number.doubleValue();
        }
        throw new UnsupportedOperationException(number.getClass().getName() + "This type of addition operation is not supported");
    }

    private static boolean hnj(long j10, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return j10 == ((long) number.intValue());
        }
        if (number instanceof Long) {
            return j10 == number.longValue();
        }
        if (number instanceof Float) {
            return ((float) j10) == number.floatValue();
        }
        if (number instanceof Double) {
            return ((double) j10) == number.doubleValue();
        }
        throw new UnsupportedOperationException(number.getClass().getName() + "This type of addition operation is not supported");
    }

    private static boolean hnj(float f10, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return f10 == ((float) number.intValue());
        }
        if (number instanceof Long) {
            return f10 == ((float) number.longValue());
        }
        if (number instanceof Float) {
            return f10 == number.floatValue();
        }
        if (number instanceof Double) {
            return ((double) f10) == number.doubleValue();
        }
        throw new UnsupportedOperationException(number.getClass().getName() + "This type of addition operation is not supported");
    }

    private static boolean hnj(double d10, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return d10 == ((double) number.intValue());
        }
        if (number instanceof Long) {
            return d10 == ((double) number.longValue());
        }
        if (number instanceof Float) {
            return d10 == ((double) number.floatValue());
        }
        if (number instanceof Double) {
            return d10 == number.doubleValue();
        }
        throw new UnsupportedOperationException(number.getClass().getName() + "This type of addition operation is not supported");
    }

    public static boolean hnj(Number number, Number number2) {
        if (!(number instanceof Integer) && !(number instanceof Short) && !(number instanceof Byte)) {
            if (number instanceof Long) {
                return hnj(number.longValue(), number2);
            }
            if (number instanceof Float) {
                return hnj(number.floatValue(), number2);
            }
            if (number instanceof Double) {
                return hnj(number.doubleValue(), number2);
            }
            throw new UnsupportedOperationException(number.getClass().getName() + "This type of addition operation is not supported");
        }
        return hnj(number.intValue(), number2);
    }
}
