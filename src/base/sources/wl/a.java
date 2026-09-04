package wl;

import java.util.Random;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a extends c {
    @Override // wl.c
    public double g() {
        return j().nextDouble();
    }

    @Override // wl.c
    public int h() {
        return j().nextInt();
    }

    @Override // wl.c
    public int i(int i10) {
        return j().nextInt(i10);
    }

    public abstract Random j();
}
