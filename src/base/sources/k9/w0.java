package k9;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class w0 implements e9.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final el.a f43089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final el.a f43090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final el.a f43091c;

    public w0(el.a aVar, el.a aVar2, el.a aVar3) {
        this.f43089a = aVar;
        this.f43090b = aVar2;
        this.f43091c = aVar3;
    }

    public static w0 a(el.a aVar, el.a aVar2, el.a aVar3) {
        return new w0(aVar, aVar2, aVar3);
    }

    public static v0 c(Context context, String str, int i10) {
        return new v0(context, str, i10);
    }

    @Override // el.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public v0 get() {
        return c((Context) this.f43089a.get(), (String) this.f43090b.get(), ((Integer) this.f43091c.get()).intValue());
    }
}
