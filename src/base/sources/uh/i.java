package uh;

import android.app.Application;
import androidx.lifecycle.p1;
import androidx.lifecycle.s1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class i extends s1.d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Application f54503e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ng.d f54504f;

    public i(Application application, ng.d video) {
        kotlin.jvm.internal.s.h(application, "application");
        kotlin.jvm.internal.s.h(video, "video");
        this.f54503e = application;
        this.f54504f = video;
    }

    @Override // androidx.lifecycle.s1.d, androidx.lifecycle.s1.c
    public p1 a(Class modelClass) {
        kotlin.jvm.internal.s.h(modelClass, "modelClass");
        return new h(this.f54503e, this.f54504f);
    }
}
