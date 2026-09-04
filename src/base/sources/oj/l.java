package oj;

import java.io.InputStream;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class l extends i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final fj.b f48973c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(fj.b flvPacket, int i10) {
        super(new e(nj.b.TYPE_0, nj.a.VIDEO.g()));
        s.h(flvPacket, "flvPacket");
        this.f48973c = flvPacket;
        b().i(i10);
        b().k((int) flvPacket.c());
        b().h(flvPacket.b());
    }

    @Override // oj.i
    public int c() {
        return this.f48973c.b();
    }

    @Override // oj.i
    public f d() {
        return f.VIDEO;
    }

    @Override // oj.i
    public void f(InputStream input) {
        s.h(input, "input");
    }

    @Override // oj.i
    public byte[] g() {
        return this.f48973c.a();
    }

    public String toString() {
        return "Video, size: " + c();
    }

    public /* synthetic */ l(fj.b bVar, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? new fj.b(null, 0L, 0, null, 15, null) : bVar, (i11 & 2) != 0 ? 0 : i10);
    }
}
