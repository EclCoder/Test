package com.apm.insight.a;

import com.apm.insight.CrashType;
import com.apm.insight.ICrashCallback;
import com.apm.insight.b.i;
import com.apm.insight.runtime.m;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class a implements ICrashCallback {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile a f10494d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile String f10495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile i.a f10496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile i.a f10497c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile boolean f10498e = false;

    private a() {
    }

    public static a a() {
        if (f10494d == null) {
            synchronized (a.class) {
                try {
                    if (f10494d == null) {
                        f10494d = new a();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f10494d;
    }

    @Override // com.apm.insight.ICrashCallback
    public void onCrash(CrashType crashType, String str, Thread thread) {
        crashType.equals(CrashType.NATIVE);
    }

    public final void a(String str, i.a aVar, i.a aVar2) {
        this.f10495a = str;
        this.f10496b = aVar;
        this.f10497c = aVar2;
        if (this.f10498e) {
            return;
        }
        this.f10498e = true;
        m.a().a(new Runnable() { // from class: com.apm.insight.a.a.1
            @Override // java.lang.Runnable
            public final void run() {
            }
        });
    }
}
