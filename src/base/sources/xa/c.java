package xa;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f56808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f56809b;

    public c(e eVar, List list) {
        this.f56808a = eVar;
        this.f56809b = list;
    }

    @Override // xa.e
    public com.google.android.exoplayer2.upstream.d.a a() {
        return new qa.b(this.f56808a.a(), this.f56809b);
    }

    @Override // xa.e
    public com.google.android.exoplayer2.upstream.d.a b(com.google.android.exoplayer2.source.hls.playlist.d dVar, com.google.android.exoplayer2.source.hls.playlist.c cVar) {
        return new qa.b(this.f56808a.b(dVar, cVar), this.f56809b);
    }
}
