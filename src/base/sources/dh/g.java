package dh;

import android.view.LayoutInflater;
import android.view.WindowManager;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class g implements ek.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final el.a f36881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final el.a f36882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final el.a f36883c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final el.a f36884d;

    public g(el.a aVar, el.a aVar2, el.a aVar3, el.a aVar4) {
        this.f36881a = aVar;
        this.f36882b = aVar2;
        this.f36883c = aVar3;
        this.f36884d = aVar4;
    }

    public static g a(el.a aVar, el.a aVar2, el.a aVar3, el.a aVar4) {
        return new g(aVar, aVar2, aVar3, aVar4);
    }

    public static f c(WindowManager windowManager, LayoutInflater layoutInflater, dk.a aVar, dk.a aVar2) {
        return new f(windowManager, layoutInflater, aVar, aVar2);
    }

    @Override // el.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public f get() {
        return c((WindowManager) this.f36881a.get(), (LayoutInflater) this.f36882b.get(), ek.b.a(this.f36883c), ek.b.a(this.f36884d));
    }
}
