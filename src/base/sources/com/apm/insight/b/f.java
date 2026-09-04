package com.apm.insight.b;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile f f10547a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static g f10548c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f10549b;

    private f(Context context) {
        this.f10549b = new b(context);
        g gVar = new g();
        f10548c = gVar;
        gVar.a();
    }

    public static f a(Context context) {
        if (f10547a == null) {
            synchronized (f.class) {
                try {
                    if (f10547a == null) {
                        f10547a = new f(context);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f10547a;
    }

    public static g b() {
        return f10548c;
    }

    public final void c() {
        this.f10549b.a();
    }

    public final void d() {
        this.f10549b.b();
    }

    public final b a() {
        return this.f10549b;
    }
}
