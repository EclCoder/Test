package im;

import hm.a0;
import hm.i0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class v extends a0 implements i0 {
    public v(int i10) {
        super(1, Integer.MAX_VALUE, gm.a.DROP_OLDEST);
        b(Integer.valueOf(i10));
    }

    @Override // hm.i0
    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
    public Integer getValue() {
        Integer numValueOf;
        synchronized (this) {
            numValueOf = Integer.valueOf(((Number) M()).intValue());
        }
        return numValueOf;
    }

    public final boolean a0(int i10) {
        boolean zB;
        synchronized (this) {
            zB = b(Integer.valueOf(((Number) M()).intValue() + i10));
        }
        return zB;
    }
}
