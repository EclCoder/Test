package nh;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class c {
    public static final int a(int i10, int i11) {
        if ((i10 & i11) == 0) {
            return i10;
        }
        wp.a.a("Remove flag " + i11, new Object[0]);
        return i10 & (~i11);
    }
}
