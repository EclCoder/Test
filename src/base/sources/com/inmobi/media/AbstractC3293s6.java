package com.inmobi.media;

import com.inmobi.media.AbstractC3293s6;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: com.inmobi.media.s6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC3293s6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final fl.k f27436a = fl.l.b(new tl.a() { // from class: yh.kb
        @Override // tl.a
        public final Object invoke() {
            return AbstractC3293s6.a();
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final fl.k f27437b = fl.l.b(new tl.a() { // from class: yh.lb
        @Override // tl.a
        public final Object invoke() {
            return AbstractC3293s6.c();
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final fl.k f27438c = fl.l.b(new tl.a() { // from class: yh.mb
        @Override // tl.a
        public final Object invoke() {
            return AbstractC3293s6.e();
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final fl.k f27439d = fl.l.b(new tl.a() { // from class: yh.nb
        @Override // tl.a
        public final Object invoke() {
            return AbstractC3293s6.b();
        }
    });

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final fl.k f27440e = fl.l.b(new tl.a() { // from class: yh.ob
        @Override // tl.a
        public final Object invoke() {
            return AbstractC3293s6.d();
        }
    });

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final fl.k f27441f = fl.l.b(new tl.a() { // from class: yh.pb
        @Override // tl.a
        public final Object invoke() {
            return AbstractC3293s6.f();
        }
    });

    public static final ExecutorService a() {
        kotlin.jvm.internal.s.h("ExecutorProvider.IO", "name");
        return Executors.newCachedThreadPool(new I9("ExecutorProvider.IO", false));
    }

    public static final ExecutorService b() {
        kotlin.jvm.internal.s.h("ExecutorProvider.high", "name");
        return Executors.newCachedThreadPool(new I9("ExecutorProvider.high", false));
    }

    public static final ExecutorService c() {
        kotlin.jvm.internal.s.h("ExecutorProvider.highIO", "name");
        return Executors.newCachedThreadPool(new I9("ExecutorProvider.highIO", false));
    }

    public static final ExecutorC2937ec d() {
        return new ExecutorC2937ec();
    }

    public static final ExecutorService e() {
        kotlin.jvm.internal.s.h("ExecutorProvider.normal", "name");
        return Executors.newCachedThreadPool(new I9("ExecutorProvider.normal", false));
    }

    public static final ExecutorService f() {
        kotlin.jvm.internal.s.h("ExecutorProvider.single", "name");
        return Executors.newSingleThreadExecutor(new I9("ExecutorProvider.single", false));
    }
}
