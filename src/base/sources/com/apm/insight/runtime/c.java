package com.apm.insight.runtime;

import com.apm.insight.CrashType;
import com.apm.insight.ICrashCallback;
import com.apm.insight.IOOMCallback;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<ICrashCallback> f10962a = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<ICrashCallback> f10963b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<ICrashCallback> f10964c = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<ICrashCallback> f10965d = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<IOOMCallback> f10966e = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: com.apm.insight.runtime.c$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f10967a;

        static {
            int[] iArr = new int[CrashType.values().length];
            f10967a = iArr;
            try {
                iArr[CrashType.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10967a[CrashType.ANR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10967a[CrashType.JAVA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10967a[CrashType.LAUNCH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f10967a[CrashType.NATIVE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    final void a(ICrashCallback iCrashCallback, CrashType crashType) {
        int i10 = AnonymousClass1.f10967a[crashType.ordinal()];
        if (i10 == 1) {
            this.f10962a.add(iCrashCallback);
            this.f10963b.add(iCrashCallback);
            this.f10964c.add(iCrashCallback);
            this.f10965d.add(iCrashCallback);
            return;
        }
        if (i10 == 2) {
            this.f10965d.add(iCrashCallback);
            return;
        }
        if (i10 == 3) {
            this.f10963b.add(iCrashCallback);
        } else if (i10 == 4) {
            this.f10962a.add(iCrashCallback);
        } else {
            if (i10 != 5) {
                return;
            }
            this.f10964c.add(iCrashCallback);
        }
    }

    final void b(ICrashCallback iCrashCallback, CrashType crashType) {
        int i10 = AnonymousClass1.f10967a[crashType.ordinal()];
        if (i10 == 1) {
            this.f10962a.remove(iCrashCallback);
            this.f10963b.remove(iCrashCallback);
            this.f10964c.remove(iCrashCallback);
            this.f10965d.remove(iCrashCallback);
            return;
        }
        if (i10 == 2) {
            this.f10965d.remove(iCrashCallback);
            return;
        }
        if (i10 == 3) {
            this.f10963b.remove(iCrashCallback);
        } else if (i10 == 4) {
            this.f10962a.remove(iCrashCallback);
        } else {
            if (i10 != 5) {
                return;
            }
            this.f10964c.remove(iCrashCallback);
        }
    }

    public final List<ICrashCallback> c() {
        return this.f10963b;
    }

    public final List<ICrashCallback> d() {
        return this.f10964c;
    }

    public final List<ICrashCallback> e() {
        return this.f10965d;
    }

    final void a(IOOMCallback iOOMCallback) {
        this.f10966e.add(iOOMCallback);
    }

    final void b(IOOMCallback iOOMCallback) {
        this.f10966e.remove(iOOMCallback);
    }

    public final List<IOOMCallback> a() {
        return this.f10966e;
    }

    public final List<ICrashCallback> b() {
        return this.f10962a;
    }
}
