package vf;

import com.squareup.moshi.r;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class g implements ek.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f55428a;

    public g(b bVar) {
        this.f55428a = bVar;
    }

    public static g a(b bVar) {
        return new g(bVar);
    }

    public static r c(b bVar) {
        return (r) ek.e.c(bVar.e());
    }

    @Override // el.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public r get() {
        return c(this.f55428a);
    }
}
