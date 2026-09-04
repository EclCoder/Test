package com.apm.insight.runtime;

import android.os.SystemClock;
import android.util.Printer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static i f10983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f10984b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<Printer> f10985c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<Printer> f10986d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f10987e = false;

    static {
        new Printer() { // from class: com.apm.insight.runtime.i.1
            @Override // android.util.Printer
            public final void println(String str) {
                if (str == null) {
                    return;
                }
                if (str.charAt(0) == '>') {
                    i.a().a(str);
                } else if (str.charAt(0) == '<') {
                    i.a().b(str);
                }
                i.c();
            }
        };
    }

    private i() {
    }

    public static i a() {
        if (f10983a == null) {
            synchronized (i.class) {
                try {
                    if (f10983a == null) {
                        f10983a = new i();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f10983a;
    }

    static /* synthetic */ Printer c() {
        return null;
    }

    public final boolean b() {
        return this.f10984b != -1 && SystemClock.uptimeMillis() - this.f10984b > 5000;
    }

    final void b(String str) {
        this.f10984b = SystemClock.uptimeMillis();
        try {
            a(this.f10986d, str);
        } catch (Exception e10) {
            com.apm.insight.a.b((Throwable) e10);
        }
    }

    final void a(String str) {
        this.f10984b = -1L;
        try {
            a(this.f10985c, str);
        } catch (Exception e10) {
            com.apm.insight.a.a((Throwable) e10);
        }
    }

    private static void a(List<? extends Printer> list, String str) {
        if (list == null || list.isEmpty()) {
            return;
        }
        try {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                Printer printer = list.get(i10);
                if (printer == null) {
                    return;
                }
                printer.println(str);
            }
        } catch (Throwable th2) {
            com.apm.insight.a.a(th2);
        }
    }
}
