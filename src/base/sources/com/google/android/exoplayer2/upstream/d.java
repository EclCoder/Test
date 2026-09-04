package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import java.io.InputStream;
import java.util.Map;
import nb.j;
import nb.k;
import nb.z;
import ob.r0;
import ra.i;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class d implements Loader.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f18811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.google.android.exoplayer2.upstream.a f18812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f18813c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final z f18814d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a f18815e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile Object f18816f;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface a {
        Object parse(Uri uri, InputStream inputStream);
    }

    public d(j jVar, Uri uri, int i10, a aVar) {
        this(jVar, new com.google.android.exoplayer2.upstream.a.b().i(uri).b(1).a(), i10, aVar);
    }

    public long a() {
        return this.f18814d.f();
    }

    public Map b() {
        return this.f18814d.j();
    }

    public final Object c() {
        return this.f18816f;
    }

    public Uri d() {
        return this.f18814d.i();
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.e
    public final void load() {
        this.f18814d.k();
        k kVar = new k(this.f18814d, this.f18812b);
        try {
            kVar.h();
            this.f18816f = this.f18815e.parse((Uri) ob.a.e(this.f18814d.getUri()), kVar);
        } finally {
            r0.n(kVar);
        }
    }

    public d(j jVar, com.google.android.exoplayer2.upstream.a aVar, int i10, a aVar2) {
        this.f18814d = new z(jVar);
        this.f18812b = aVar;
        this.f18813c = i10;
        this.f18815e = aVar2;
        this.f18811a = i.a();
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.e
    public final void cancelLoad() {
    }
}
