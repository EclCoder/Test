package ip;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public abstract class f {
    public static boolean a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static boolean b(Object[] objArr, Object[] objArr2) {
        if (objArr == null) {
            return objArr2 == null;
        }
        if (objArr2 == null || objArr.length != objArr2.length) {
            return false;
        }
        for (int i10 = 0; i10 < objArr.length; i10++) {
            if (!a(objArr[i10], objArr2[i10])) {
                return false;
            }
        }
        return true;
    }

    public static int c(int i10, int i11) {
        return (i10 * 37) + i11;
    }

    public static int d(int i10, Object obj) {
        return c(i10, obj != null ? obj.hashCode() : 0);
    }

    public static int e(int i10, boolean z10) {
        return c(i10, z10 ? 1 : 0);
    }
}
