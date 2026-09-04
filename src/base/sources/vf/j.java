package vf;

import android.content.Context;
import android.view.WindowManager;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class j implements ek.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f55433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final el.a f55434b;

    public j(b bVar, el.a aVar) {
        this.f55433a = bVar;
        this.f55434b = aVar;
    }

    public static j a(b bVar, el.a aVar) {
        return new j(bVar, aVar);
    }

    public static WindowManager c(b bVar, Context context) {
        return (WindowManager) ek.e.c(bVar.h(context));
    }

    @Override // el.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public WindowManager get() {
        return c(this.f55433a, (Context) this.f55434b.get());
    }
}
