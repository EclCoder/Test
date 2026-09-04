package ui;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class b {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f54685a;

        static {
            int[] iArr = new int[vi.a.values().length];
            f54685a = iArr;
            try {
                iArr[vi.a.YUV420PLANAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f54685a[vi.a.YUV420SEMIPLANAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static byte[] a(byte[] bArr, int i10, int i11, vi.a aVar) {
        int i12 = a.f54685a[aVar.ordinal()];
        if (i12 == 1) {
            return ui.a.e(bArr, i10, i11);
        }
        if (i12 != 2) {
            return null;
        }
        return ui.a.f(bArr, i10, i11);
    }

    public static byte[] b(byte[] bArr, int i10, int i11, vi.a aVar) {
        int i12 = a.f54685a[aVar.ordinal()];
        if (i12 == 1) {
            return c.e(bArr, i10, i11);
        }
        if (i12 != 2) {
            return null;
        }
        return c.f(bArr, i10, i11);
    }

    public static void c(int i10) {
        ui.a.a(i10);
        c.a(i10);
    }

    public static byte[] d(byte[] bArr, int i10, int i11, int i12) {
        if (i12 == 0) {
            return bArr;
        }
        if (i12 == 90) {
            return ui.a.d(bArr, i10, i11);
        }
        if (i12 == 180) {
            return ui.a.b(bArr, i10, i11);
        }
        if (i12 != 270) {
            return null;
        }
        return ui.a.c(bArr, i10, i11);
    }

    public static byte[] e(byte[] bArr, int i10, int i11, int i12) {
        if (i12 == 0) {
            return bArr;
        }
        if (i12 == 90) {
            return c.d(bArr, i10, i11);
        }
        if (i12 == 180) {
            return c.b(bArr, i10, i11);
        }
        if (i12 != 270) {
            return null;
        }
        return c.c(bArr, i10, i11);
    }
}
