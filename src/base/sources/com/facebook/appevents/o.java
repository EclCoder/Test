package com.facebook.appevents;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f14964b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f14965c = o.class.getCanonicalName();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s f14966a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(Application application, String str) {
            kotlin.jvm.internal.s.h(application, "application");
            s.f14988c.f(application, str);
        }

        public final String b(Context context) {
            kotlin.jvm.internal.s.h(context, "context");
            return s.f14988c.j(context);
        }

        public final b c() {
            return s.f14988c.k();
        }

        public final String d() {
            return c.b();
        }

        public final void e(Context context, String str) {
            kotlin.jvm.internal.s.h(context, "context");
            s.f14988c.n(context, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final o f(Context context) {
            kotlin.jvm.internal.s.h(context, "context");
            return new o(context, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0);
        }

        public final void g() {
            s.f14988c.t();
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public enum b {
        AUTO,
        EXPLICIT_ONLY
    }

    public /* synthetic */ o(Context context, String str, com.facebook.a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, aVar);
    }

    public final void a() {
        this.f14966a.l();
    }

    public final void b(String str, Bundle bundle) {
        this.f14966a.o(str, bundle);
    }

    private o(Context context, String str, com.facebook.a aVar) {
        this.f14966a = new s(context, str, aVar);
    }
}
