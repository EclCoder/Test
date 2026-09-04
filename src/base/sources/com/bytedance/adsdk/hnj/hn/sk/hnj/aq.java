package com.bytedance.adsdk.hnj.hn.sk.hnj;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class aq {
    private static Object hnj(int i10, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return Integer.valueOf(i10 + number.intValue());
        }
        if (number instanceof Long) {
            return Long.valueOf(((long) i10) + number.longValue());
        }
        if (number instanceof Float) {
            return Float.valueOf(i10 + number.floatValue());
        }
        if (number instanceof Double) {
            return Double.valueOf(((double) i10) + number.doubleValue());
        }
        throw new UnsupportedOperationException(number.getClass().getName() + "This type of addition operation is not supported");
    }

    private static Object hnj(long j10, Number number) {
        if (!(number instanceof Integer) && !(number instanceof Short) && !(number instanceof Byte)) {
            if (number instanceof Long) {
                return Long.valueOf(j10 + number.longValue());
            }
            if (number instanceof Float) {
                return Float.valueOf(j10 + number.floatValue());
            }
            if (number instanceof Double) {
                return Double.valueOf(j10 + number.doubleValue());
            }
            throw new UnsupportedOperationException(number.getClass().getName() + "This type of addition operation is not supported");
        }
        return Long.valueOf(j10 + ((long) number.intValue()));
    }

    private static Object hnj(float f10, Number number) {
        if (!(number instanceof Integer) && !(number instanceof Short) && !(number instanceof Byte)) {
            if (number instanceof Long) {
                return Float.valueOf(f10 + number.longValue());
            }
            if (number instanceof Float) {
                return Float.valueOf(f10 + number.floatValue());
            }
            if (number instanceof Double) {
                return Double.valueOf(((double) f10) + number.doubleValue());
            }
            throw new UnsupportedOperationException(number.getClass().getName() + "This type of addition operation is not supported");
        }
        return Float.valueOf(f10 + number.intValue());
    }

    private static Object hnj(double d10, Number number) {
        if (!(number instanceof Integer) && !(number instanceof Short) && !(number instanceof Byte)) {
            if (number instanceof Long) {
                return Double.valueOf(d10 + number.longValue());
            }
            if (number instanceof Float) {
                return Double.valueOf(d10 + ((double) number.floatValue()));
            }
            if (number instanceof Double) {
                return Double.valueOf(d10 + number.doubleValue());
            }
            throw new UnsupportedOperationException(number.getClass().getName() + "This type of addition operation is not supported");
        }
        return Double.valueOf(d10 + ((double) number.intValue()));
    }

    public static Object hnj(Number number, Number number2) {
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
