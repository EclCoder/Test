package com.apm.insight.k;

import android.content.Context;
import com.apm.insight.nativecrash.NativeImpl;
import com.apm.insight.runtime.m;
import com.apm.insight.runtime.o;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class h implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f10820a;

    private h(Context context) {
        this.f10820a = context;
    }

    public static boolean a() {
        return b.a().c() || !com.apm.insight.l.a.b(com.apm.insight.e.g());
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            com.apm.insight.b.f.a(this.f10820a).a().f();
        } catch (Throwable unused) {
        }
        try {
            if (com.apm.insight.l.a.b(this.f10820a)) {
                b.a().a(com.apm.insight.l.k.b(this.f10820a));
            } else {
                NativeImpl.j();
            }
            o.a().a(com.apm.insight.e.a().b(), com.apm.insight.entity.b.b());
            if (m.a().a() == null) {
            }
        } catch (Throwable th2) {
            try {
                com.apm.insight.a.b(th2);
            } finally {
                o.a().a(com.apm.insight.e.a().b(), com.apm.insight.entity.b.b());
                if (m.a().a() != null) {
                    com.apm.insight.j.d.a(m.a().a(), this.f10820a).a();
                }
            }
        }
    }

    public static void a(Context context) {
        m.a().a(new h(context), 0L);
    }
}
