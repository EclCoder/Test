package l1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class o extends d {
    public o() {
        super(null, 1, null);
    }

    private final void r(q qVar, int i10) {
        int i11 = i10 + 1;
        long jA = qVar.a(j()[i10], j()[i11]);
        j()[i10] = Float.intBitsToFloat((int) (jA >> 32));
        j()[i11] = Float.intBitsToFloat((int) (jA & 4294967295L));
    }

    public final void q(q f10) {
        kotlin.jvm.internal.s.h(f10, "f");
        r(f10, 0);
        r(f10, 2);
        r(f10, 4);
        r(f10, 6);
    }
}
