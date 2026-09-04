package zg;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class w implements ek.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final el.a f58956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final el.a f58957b;

    public w(el.a aVar, el.a aVar2) {
        this.f58956a = aVar;
        this.f58957b = aVar2;
    }

    public static w a(el.a aVar, el.a aVar2) {
        return new w(aVar, aVar2);
    }

    public static v c(Context context, dk.a aVar) {
        return new v(context, aVar);
    }

    @Override // el.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public v get() {
        return c((Context) this.f58956a.get(), ek.b.a(this.f58957b));
    }
}
