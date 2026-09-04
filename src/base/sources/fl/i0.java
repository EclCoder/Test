package fl;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class i0 {
    public static final int a(int i10, int i11) {
        return kotlin.jvm.internal.s.i(i10 ^ Integer.MIN_VALUE, i11 ^ Integer.MIN_VALUE);
    }

    public static final int b(long j10, long j11) {
        return kotlin.jvm.internal.s.j(j10 ^ Long.MIN_VALUE, j11 ^ Long.MIN_VALUE);
    }

    public static final String c(long j10, int i10) {
        if (j10 >= 0) {
            String string = Long.toString(j10, bm.a.a(i10));
            kotlin.jvm.internal.s.g(string, "toString(...)");
            return string;
        }
        long j11 = i10;
        long j12 = ((j10 >>> 1) / j11) << 1;
        long j13 = j10 - (j12 * j11);
        if (j13 >= j11) {
            j13 -= j11;
            j12++;
        }
        StringBuilder sb2 = new StringBuilder();
        String string2 = Long.toString(j12, bm.a.a(i10));
        kotlin.jvm.internal.s.g(string2, "toString(...)");
        sb2.append(string2);
        String string3 = Long.toString(j13, bm.a.a(i10));
        kotlin.jvm.internal.s.g(string3, "toString(...)");
        sb2.append(string3);
        return sb2.toString();
    }
}
