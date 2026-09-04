package yn;

import java.util.GregorianCalendar;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f58166a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte[] f58167b = new byte[0];

    public static final long a(int i10, int i11, int i12, int i13, int i14, int i15) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(14, 0);
        gregorianCalendar.set(i10, i11 - 1, i12, i13, i14, i15);
        return gregorianCalendar.getTime().getTime();
    }

    public static final int b() {
        return f58166a;
    }

    public static final byte[] c() {
        return f58167b;
    }
}
