package rj;

import kotlin.jvm.internal.s;
import oj.e;
import oj.i;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class a extends i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f51351c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(int i10, int i11, e basicHeader) {
        super(basicHeader);
        s.h(basicHeader, "basicHeader");
        b().h(this.f51351c);
        b().k(i10);
        b().i(i11);
    }

    @Override // oj.i
    public int c() {
        return this.f51351c;
    }

    protected final int k() {
        return this.f51351c;
    }

    protected final void l(int i10) {
        this.f51351c = i10;
    }
}
