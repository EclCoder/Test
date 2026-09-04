package androidx.lifecycle;

import android.app.Application;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class a extends p1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Application f4335b;

    public a(Application application) {
        kotlin.jvm.internal.s.h(application, "application");
        this.f4335b = application;
    }

    public Application j() {
        Application application = this.f4335b;
        kotlin.jvm.internal.s.f(application, "null cannot be cast to non-null type T of androidx.lifecycle.AndroidViewModel.getApplication");
        return application;
    }
}
