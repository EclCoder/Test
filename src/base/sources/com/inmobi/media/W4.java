package com.inmobi.media;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class W4 extends AbstractC3422x5 implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f25925b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W4(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, C3447y5 listener) {
        super(listener);
        kotlin.jvm.internal.s.h(listener, "listener");
        this.f25925b = uncaughtExceptionHandler;
    }

    @Override // com.inmobi.media.AbstractC3422x5
    public final void a() {
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    @Override // com.inmobi.media.AbstractC3422x5
    public final void b() {
        Thread.setDefaultUncaughtExceptionHandler(this.f25925b);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread t10, Throwable e10) {
        kotlin.jvm.internal.s.h(t10, "t");
        kotlin.jvm.internal.s.h(e10, "e");
        this.f27829a.a(new X4(t10, e10));
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f25925b;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(t10, e10);
        }
    }
}
