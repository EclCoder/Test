package j2;

import l3.j;
import l3.k;
import l3.r;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class b extends j {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final r f41913p;

    public b(String str, r rVar) {
        super(str);
        this.f41913p = rVar;
    }

    @Override // l3.j
    protected k y(byte[] bArr, int i10, boolean z10) {
        if (z10) {
            this.f41913p.reset();
        }
        return this.f41913p.b(bArr, 0, i10);
    }
}
