package vf;

import android.content.Context;
import android.view.LayoutInflater;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class e implements ek.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f55424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final el.a f55425b;

    public e(b bVar, el.a aVar) {
        this.f55424a = bVar;
        this.f55425b = aVar;
    }

    public static e a(b bVar, el.a aVar) {
        return new e(bVar, aVar);
    }

    public static LayoutInflater c(b bVar, Context context) {
        return (LayoutInflater) ek.e.c(bVar.c(context));
    }

    @Override // el.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LayoutInflater get() {
        return c(this.f55424a, (Context) this.f55425b.get());
    }
}
