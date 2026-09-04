package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.l;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import i5.p;
import j5.k;
import j5.o;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class d implements e5.c, b5.b, o.b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f7883j = l.f("DelayMetCommandHandler");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f7884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f7885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f7886c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final e f7887d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final e5.d f7888e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private PowerManager.WakeLock f7891h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f7892i = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f7890g = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Object f7889f = new Object();

    d(Context context, int i10, String str, e eVar) {
        this.f7884a = context;
        this.f7885b = i10;
        this.f7887d = eVar;
        this.f7886c = str;
        this.f7888e = new e5.d(context, eVar.f(), this);
    }

    private void c() {
        synchronized (this.f7889f) {
            try {
                this.f7888e.e();
                this.f7887d.h().c(this.f7886c);
                PowerManager.WakeLock wakeLock = this.f7891h;
                if (wakeLock != null && wakeLock.isHeld()) {
                    l.c().a(f7883j, String.format("Releasing wakelock %s for WorkSpec %s", this.f7891h, this.f7886c), new Throwable[0]);
                    this.f7891h.release();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void g() {
        synchronized (this.f7889f) {
            try {
                if (this.f7890g < 2) {
                    this.f7890g = 2;
                    l lVarC = l.c();
                    String str = f7883j;
                    lVarC.a(str, String.format("Stopping work for WorkSpec %s", this.f7886c), new Throwable[0]);
                    Intent intentF = b.f(this.f7884a, this.f7886c);
                    e eVar = this.f7887d;
                    eVar.k(new e.b(eVar, intentF, this.f7885b));
                    if (this.f7887d.e().g(this.f7886c)) {
                        l.c().a(str, String.format("WorkSpec %s needs to be rescheduled", this.f7886c), new Throwable[0]);
                        Intent intentE = b.e(this.f7884a, this.f7886c);
                        e eVar2 = this.f7887d;
                        eVar2.k(new e.b(eVar2, intentE, this.f7885b));
                    } else {
                        l.c().a(str, String.format("Processor does not have WorkSpec %s. No need to reschedule ", this.f7886c), new Throwable[0]);
                    }
                } else {
                    l.c().a(f7883j, String.format("Already stopped work for %s", this.f7886c), new Throwable[0]);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // j5.o.b
    public void a(String str) {
        l.c().a(f7883j, String.format("Exceeded time limits on execution for %s", str), new Throwable[0]);
        g();
    }

    @Override // e5.c
    public void b(List list) {
        g();
    }

    @Override // b5.b
    public void d(String str, boolean z10) {
        l.c().a(f7883j, String.format("onExecuted %s, %s", str, Boolean.valueOf(z10)), new Throwable[0]);
        c();
        if (z10) {
            Intent intentE = b.e(this.f7884a, this.f7886c);
            e eVar = this.f7887d;
            eVar.k(new e.b(eVar, intentE, this.f7885b));
        }
        if (this.f7892i) {
            Intent intentA = b.a(this.f7884a);
            e eVar2 = this.f7887d;
            eVar2.k(new e.b(eVar2, intentA, this.f7885b));
        }
    }

    void e() {
        this.f7891h = k.b(this.f7884a, String.format("%s (%s)", this.f7886c, Integer.valueOf(this.f7885b)));
        l lVarC = l.c();
        String str = f7883j;
        lVarC.a(str, String.format("Acquiring wakelock %s for WorkSpec %s", this.f7891h, this.f7886c), new Throwable[0]);
        this.f7891h.acquire();
        p pVarG = this.f7887d.g().o().B().g(this.f7886c);
        if (pVarG == null) {
            g();
            return;
        }
        boolean zB = pVarG.b();
        this.f7892i = zB;
        if (zB) {
            this.f7888e.d(Collections.singletonList(pVarG));
        } else {
            l.c().a(str, String.format("No constraints for %s", this.f7886c), new Throwable[0]);
            f(Collections.singletonList(this.f7886c));
        }
    }

    @Override // e5.c
    public void f(List list) {
        if (list.contains(this.f7886c)) {
            synchronized (this.f7889f) {
                try {
                    if (this.f7890g == 0) {
                        this.f7890g = 1;
                        l.c().a(f7883j, String.format("onAllConstraintsMet for %s", this.f7886c), new Throwable[0]);
                        if (this.f7887d.e().j(this.f7886c)) {
                            this.f7887d.h().b(this.f7886c, TTAdConstant.AD_MAX_EVENT_TIME, this);
                        } else {
                            c();
                        }
                    } else {
                        l.c().a(f7883j, String.format("Already started work for %s", this.f7886c), new Throwable[0]);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}
