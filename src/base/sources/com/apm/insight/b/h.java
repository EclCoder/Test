package com.apm.insight.b;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Printer;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile boolean f10600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Printer f10601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final CopyOnWriteArrayList<e> f10602c = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile boolean f10603d = false;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface a {
        String a();

        String b();

        String c();
    }

    public static void a() {
        if (f10600a) {
            return;
        }
        f10600a = true;
        f10601b = new Printer() { // from class: com.apm.insight.b.h.1
            @Override // android.util.Printer
            public final void println(String str) {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                if (str.charAt(0) == '>') {
                    h.a(true, str);
                } else if (str.charAt(0) == '<') {
                    h.a(false, str);
                }
            }
        };
        i.a();
        i.a(f10601b);
    }

    public static void a(e eVar) {
        CopyOnWriteArrayList<e> copyOnWriteArrayList = f10602c;
        synchronized (copyOnWriteArrayList) {
            copyOnWriteArrayList.add(eVar);
        }
    }

    public static void a(boolean z10, String str) {
        e.f10544a = System.nanoTime() / 1000000;
        e.f10545b = SystemClock.currentThreadTimeMillis();
        CopyOnWriteArrayList<e> copyOnWriteArrayList = f10602c;
        for (int i10 = 0; i10 < copyOnWriteArrayList.size(); i10++) {
            e eVar = copyOnWriteArrayList.get(i10);
            if (eVar == null || !eVar.a()) {
                if (!z10 && eVar.f10546c) {
                    eVar.b("");
                }
            } else if (z10) {
                if (!eVar.f10546c) {
                    eVar.a(str);
                }
            } else if (eVar.f10546c) {
                eVar.b(str);
            }
        }
    }
}
