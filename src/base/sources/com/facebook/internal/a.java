package com.facebook.internal;

import android.content.Intent;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0265a f15112d = new C0265a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static a f15113e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f15114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final UUID f15115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Intent f15116c;

    /* JADX INFO: renamed from: com.facebook.internal.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class C0265a {
        public /* synthetic */ C0265a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final synchronized boolean d(a aVar) {
            a aVarC;
            aVarC = c();
            a.b(aVar);
            return aVarC != null;
        }

        public final synchronized a b(UUID callId, int i10) {
            kotlin.jvm.internal.s.h(callId, "callId");
            a aVarC = c();
            if (aVarC != null && kotlin.jvm.internal.s.c(aVarC.c(), callId) && aVarC.d() == i10) {
                d(null);
                return aVarC;
            }
            return null;
        }

        public final a c() {
            return a.a();
        }

        private C0265a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(int i10) {
        this(i10, null, 2, 0 == true ? 1 : 0);
    }

    public static final /* synthetic */ a a() {
        if (x7.a.c(a.class)) {
            return null;
        }
        try {
            return f15113e;
        } catch (Throwable th2) {
            x7.a.b(th2, a.class);
            return null;
        }
    }

    public static final /* synthetic */ void b(a aVar) {
        if (x7.a.c(a.class)) {
            return;
        }
        try {
            f15113e = aVar;
        } catch (Throwable th2) {
            x7.a.b(th2, a.class);
        }
    }

    public final UUID c() {
        if (x7.a.c(this)) {
            return null;
        }
        try {
            return this.f15115b;
        } catch (Throwable th2) {
            x7.a.b(th2, this);
            return null;
        }
    }

    public final int d() {
        if (x7.a.c(this)) {
            return 0;
        }
        try {
            return this.f15114a;
        } catch (Throwable th2) {
            x7.a.b(th2, this);
            return 0;
        }
    }

    public final Intent e() {
        if (x7.a.c(this)) {
            return null;
        }
        try {
            return this.f15116c;
        } catch (Throwable th2) {
            x7.a.b(th2, this);
            return null;
        }
    }

    public final boolean f() {
        if (x7.a.c(this)) {
            return false;
        }
        try {
            return f15112d.d(this);
        } catch (Throwable th2) {
            x7.a.b(th2, this);
            return false;
        }
    }

    public final void g(Intent intent) {
        if (x7.a.c(this)) {
            return;
        }
        try {
            this.f15116c = intent;
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }

    public a(int i10, UUID callId) {
        kotlin.jvm.internal.s.h(callId, "callId");
        this.f15114a = i10;
        this.f15115b = callId;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ a(int i10, UUID uuid, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i11 & 2) != 0) {
            uuid = UUID.randomUUID();
            kotlin.jvm.internal.s.g(uuid, "randomUUID()");
        }
        this(i10, uuid);
    }
}
