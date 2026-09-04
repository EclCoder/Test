package com.bytedance.adsdk.hnj.hn.sk.hnj;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class qor {
    private static Object hnj(int i10, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return Boolean.valueOf(i10 > number.intValue());
        }
        if (number instanceof Long) {
            return Boolean.valueOf(((long) i10) > number.longValue());
        }
        if (number instanceof Float) {
            return Boolean.valueOf(((float) i10) > number.floatValue());
        }
        if (number instanceof Double) {
            return Boolean.valueOf(((double) i10) > number.doubleValue());
        }
        throw new UnsupportedOperationException(number.getClass().getName() + "This type of addition operation is not supported");
    }

    private static Object hnj(long j10, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return Boolean.valueOf(j10 > ((long) number.intValue()));
        }
        if (number instanceof Long) {
            return Boolean.valueOf(j10 > number.longValue());
        }
        if (number instanceof Float) {
            return Boolean.valueOf(((float) j10) > number.floatValue());
        }
        if (number instanceof Double) {
            return Boolean.valueOf(((double) j10) > number.doubleValue());
        }
        throw new UnsupportedOperationException(number.getClass().getName() + "This type of addition operation is not supported");
    }

    private static Object hnj(float f10, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return Boolean.valueOf(f10 > ((float) number.intValue()));
        }
        if (number instanceof Long) {
            return Boolean.valueOf(f10 > ((float) number.longValue()));
        }
        if (number instanceof Float) {
            return Boolean.valueOf(f10 > number.floatValue());
        }
        if (number instanceof Double) {
            return Boolean.valueOf(((double) f10) > number.doubleValue());
        }
        throw new UnsupportedOperationException(number.getClass().getName() + "This type of addition operation is not supported");
    }

    private static Object hnj(double d10, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return Boolean.valueOf(d10 > ((double) number.intValue()));
        }
        if (number instanceof Long) {
            return Boolean.valueOf(d10 > ((double) number.longValue()));
        }
        if (number instanceof Float) {
            return Boolean.valueOf(d10 > ((double) number.floatValue()));
        }
        if (number instanceof Double) {
            return Boolean.valueOf(d10 > number.doubleValue());
        }
        throw new UnsupportedOperationException(number.getClass().getName() + "This type of addition operation is not supported");
    }

    public static Object hnj(Object obj, Number number) {
        if (!(obj instanceof Integer) && !(obj instanceof Short) && !(obj instanceof Byte)) {
            if (obj instanceof Long) {
                return hnj(((Long) obj).longValue(), number);
            }
            if (obj instanceof Float) {
                return hnj(((Float) obj).floatValue(), number);
            }
            if (obj instanceof Double) {
                return hnj(((Double) obj).doubleValue(), number);
            }
            if (obj instanceof String) {
                try {
                    return hnj(Float.parseFloat((String) obj), number);
                } catch (NumberFormatException unused) {
                    throw new UnsupportedOperationException(obj.getClass().getName() + "This type of addition operation is not supported");
                }
            }
            throw new UnsupportedOperationException(obj.getClass().getName() + "This type of addition operation is not supported");
        }
        return hnj(((Number) obj).intValue(), number);
    }
}
