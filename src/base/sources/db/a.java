package db;

import bb.h;
import bb.i;
import java.util.List;
import ob.d0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class a extends h {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final b f36552o;

    public a(List list) {
        super("DvbDecoder");
        d0 d0Var = new d0((byte[]) list.get(0));
        this.f36552o = new b(d0Var.N(), d0Var.N());
    }

    @Override // bb.h
    protected i v(byte[] bArr, int i10, boolean z10) {
        if (z10) {
            this.f36552o.r();
        }
        return new c(this.f36552o.b(bArr, i10));
    }
}
