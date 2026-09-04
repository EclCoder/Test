package androidx.core.app;

import android.content.res.Configuration;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f3290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Configuration f3291b;

    public j(boolean z10) {
        this.f3290a = z10;
    }

    public final boolean a() {
        return this.f3290a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j(boolean z10, Configuration newConfig) {
        this(z10);
        kotlin.jvm.internal.s.h(newConfig, "newConfig");
        this.f3291b = newConfig;
    }
}
