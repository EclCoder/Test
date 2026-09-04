package com.inmobi.media;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class F8 implements gn.z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f24759a;

    public F8(long j10) {
        this.f24759a = j10;
    }

    @Override // gn.z
    public final gn.f0 intercept(gn.z.a chain) throws C3040ib {
        kotlin.jvm.internal.s.h(chain, "chain");
        gn.f0 f0VarC = chain.c(chain.e());
        gn.g0 g0VarD = f0VarC.d();
        long jContentLength = g0VarD != null ? g0VarD.contentLength() : 0L;
        if (jContentLength <= this.f24759a) {
            kotlin.jvm.internal.s.e(f0VarC);
            return f0VarC;
        }
        f0VarC.close();
        throw new C3040ib("Image size exceeds limit: " + jContentLength + " Bytes");
    }
}
