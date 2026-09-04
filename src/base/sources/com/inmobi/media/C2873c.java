package com.inmobi.media;

import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import com.inmobi.media.C2873c;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.inmobi.media.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C2873c extends AbstractC3422x5 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f26281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final tl.a f26282c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f26283d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f26284e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Handler f26285f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public em.o0 f26286g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2873c(long j10, final C3447y5 listener) {
        super(listener);
        kotlin.jvm.internal.s.h(listener, "listener");
        this.f26281b = j10;
        this.f26282c = new tl.a() { // from class: yh.e7
            @Override // tl.a
            public final Object invoke() {
                return C2873c.a(this.f57692a, listener);
            }
        };
        this.f26283d = new AtomicBoolean(false);
        this.f26284e = new AtomicBoolean(false);
        this.f26285f = new Handler(Looper.getMainLooper());
    }

    public static final fl.g0 a(C2873c c2873c, InterfaceC3396w5 interfaceC3396w5) {
        if (c2873c.f26283d.get()) {
            if (c2873c.f26285f.hasMessages(2023)) {
                c2873c.f26285f.removeMessages(2023);
                if (!Debug.isDebuggerConnected() && !Debug.waitingForDebugger() && c2873c.f26284e.get()) {
                    StackTraceElement[] stackTrace = Looper.getMainLooper().getThread().getStackTrace();
                    kotlin.jvm.internal.s.e(stackTrace);
                    ((C3447y5) interfaceC3396w5).a(new C3208oo(stackTrace));
                }
            }
            c2873c.f26284e.getAndSet(true);
            c2873c.f26285f.sendEmptyMessage(2023);
        }
        return fl.g0.f38750a;
    }

    @Override // com.inmobi.media.AbstractC3422x5
    public final void b() {
        if (this.f26283d.getAndSet(false)) {
            this.f26283d.set(false);
            this.f26284e.set(false);
            J3.a(this.f26286g);
        }
    }

    @Override // com.inmobi.media.AbstractC3422x5
    public final void a() {
        if (this.f26283d.getAndSet(true)) {
            return;
        }
        kotlin.jvm.internal.s.h("ANRWatchDog", "name");
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new I9("ANRWatchDog", false));
        kotlin.jvm.internal.s.g(executorServiceNewSingleThreadExecutor, "newSingleThreadExecutor(...)");
        em.o0 o0VarA = em.p0.a(em.r1.b(executorServiceNewSingleThreadExecutor));
        this.f26286g = o0VarA;
        if (o0VarA != null) {
            J3.a(o0VarA, 0L, this.f26281b, new C2847b(this.f26282c));
        }
    }
}
