package e6;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u5.d f37160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f37161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e f37162c;

    public c(u5.d dVar, e eVar, e eVar2) {
        this.f37160a = dVar;
        this.f37161b = eVar;
        this.f37162c = eVar2;
    }

    @Override // e6.e
    public t5.c a(t5.c cVar, r5.g gVar) {
        Drawable drawable = (Drawable) cVar.get();
        if (drawable instanceof BitmapDrawable) {
            return this.f37161b.a(com.bumptech.glide.load.resource.bitmap.f.d(((BitmapDrawable) drawable).getBitmap(), this.f37160a), gVar);
        }
        if (drawable instanceof d6.c) {
            return this.f37162c.a(b(cVar), gVar);
        }
        return null;
    }

    private static t5.c b(t5.c cVar) {
        return cVar;
    }
}
