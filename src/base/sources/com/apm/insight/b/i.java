package com.apm.insight.b;

import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.util.Printer;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f10604a = 5;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static b f10605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f10606c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Printer f10607d;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface a {
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class b implements Printer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        List<Printer> f10608a = new ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private List<Printer> f10611d = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        List<Printer> f10609b = new ArrayList();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f10612e = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f10610c = false;

        b() {
        }

        @Override // android.util.Printer
        public final void println(String str) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            i.b();
            if (str.charAt(0) == '>' && this.f10610c) {
                for (Printer printer : this.f10609b) {
                    if (!this.f10608a.contains(printer)) {
                        this.f10608a.add(printer);
                    }
                }
                this.f10609b.clear();
                this.f10610c = false;
            }
            if (this.f10608a.size() > i.f10604a) {
                Log.e("LooperPrinterUtils", "wrapper contains too many printer,please check if the useless printer have been removed");
            }
            for (Printer printer2 : this.f10608a) {
                if (printer2 != null) {
                    printer2.println(str);
                }
            }
            str.charAt(0);
            i.b();
        }
    }

    public static void a() {
        if (f10606c) {
            return;
        }
        f10606c = true;
        f10605b = new b();
        Printer printerD = d();
        f10607d = printerD;
        if (printerD != null) {
            f10605b.f10608a.add(printerD);
        }
        if (com.apm.insight.e.s()) {
            Looper.getMainLooper().setMessageLogging(f10605b);
        }
    }

    static /* synthetic */ a b() {
        return null;
    }

    private static Printer d() {
        try {
            Field declaredField = Class.forName("android.os.Looper").getDeclaredField("mLogging");
            declaredField.setAccessible(true);
            return (Printer) declaredField.get(Looper.getMainLooper());
        } catch (Exception unused) {
            return null;
        }
    }

    public static void a(Printer printer) {
        if (printer == null || f10605b.f10609b.contains(printer)) {
            return;
        }
        f10605b.f10609b.add(printer);
        f10605b.f10610c = true;
    }
}
