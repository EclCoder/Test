package y3;

import android.content.Context;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b4.g f57360a;

    public z(y entry) {
        kotlin.jvm.internal.s.h(entry, "entry");
        this.f57360a = new b4.g(entry, entry.d().p());
    }

    public final Bundle a() {
        return this.f57360a.a();
    }

    public final int b() {
        return this.f57360a.b();
    }

    public final String c() {
        return this.f57360a.c();
    }

    public final y d(b4.h context, d1 destination, androidx.lifecycle.s.b hostLifecycleState, l0 l0Var) {
        kotlin.jvm.internal.s.h(context, "context");
        kotlin.jvm.internal.s.h(destination, "destination");
        kotlin.jvm.internal.s.h(hostLifecycleState, "hostLifecycleState");
        Bundle bundleA = a();
        return this.f57360a.d(context, destination, bundleA != null ? e(bundleA, context) : null, hostLifecycleState, l0Var);
    }

    public final Bundle e(Bundle args, b4.h context) {
        kotlin.jvm.internal.s.h(args, "args");
        kotlin.jvm.internal.s.h(context, "context");
        Context contextB = context.b();
        args.setClassLoader(contextB != null ? contextB.getClassLoader() : null);
        return args;
    }

    public final Bundle f() {
        return this.f57360a.e();
    }

    public z(Bundle state) {
        kotlin.jvm.internal.s.h(state, "state");
        state.setClassLoader(z.class.getClassLoader());
        this.f57360a = new b4.g(state);
    }
}
