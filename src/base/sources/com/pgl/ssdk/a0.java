package com.pgl.ssdk;

import android.os.HandlerThread;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a3<a1> f35268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a4 f35269b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final a0 f35270a = new a0();
    }

    public static a0 a() {
        return b.f35270a;
    }

    public a4 b() {
        if (this.f35269b == null) {
            synchronized (a0.class) {
                try {
                    if (this.f35269b == null) {
                        this.f35269b = a("pags_net_handler");
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f35269b;
    }

    public a4 c() {
        if (this.f35269b == null) {
            synchronized (a0.class) {
                try {
                    if (this.f35269b == null) {
                        this.f35269b = a("pags_ssdk_handler");
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f35269b;
    }

    private a0() {
        this.f35268a = a3.a(2);
    }

    public a4 a(String str) {
        return b(null, str);
    }

    private a1 a(a4.a aVar, String str) {
        try {
            HandlerThread handlerThread = new HandlerThread(str);
            handlerThread.start();
            return new a1(handlerThread, aVar);
        } catch (Throwable unused) {
            return null;
        }
    }

    public a4 b(a4.a aVar, String str) {
        a1 a1Var = (a1) this.f35268a.a();
        if (a1Var != null) {
            a1Var.a(aVar);
            a1Var.a(str);
            return a1Var;
        }
        return a(aVar, str);
    }
}
