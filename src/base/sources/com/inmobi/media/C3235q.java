package com.inmobi.media;

import android.content.Context;
import android.media.AudioManager;
import com.inmobi.media.C3235q;
import com.inmobi.media.J2;
import com.inmobi.media.core.config.models.AdConfig;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.inmobi.media.q, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3235q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static AudioManager f27290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static C3079k f27291c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static em.z1 f27294f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static Function1 f27297i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3235q f27289a = new C3235q();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicBoolean f27292d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AtomicReference f27293e = new AtomicReference(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final em.o0 f27295g = H9.f24931d;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final CopyOnWriteArraySet f27296h = new CopyOnWriteArraySet();

    public static final fl.g0 a(long j10, J2 it) {
        kotlin.jvm.internal.s.h(it, "it");
        int i10 = it.f25043a;
        if (i10 != 101) {
            if (i10 == 102) {
                em.z1 z1Var = f27294f;
                if (z1Var != null) {
                    em.z1.c0(z1Var, null, 1, null);
                }
                f27294f = null;
            }
        } else if (f27294f == null && f27292d.get()) {
            f27294f = J3.a(f27295g, 0L, j10, new C3183o(null));
        }
        return fl.g0.f38750a;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0023 A[Catch: all -> 0x002a, TRY_LEAVE, TryCatch #0 {all -> 0x002a, blocks: (B:2:0x0000, B:4:0x000d, B:6:0x0011, B:14:0x0023, B:9:0x0018, B:11:0x001c), top: B:21:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:17:0x0028 A[RETURN] */
    public static boolean b() {
        try {
            B5.f24500a.getClass();
            if (B5.y()) {
                AudioManager audioManager = f27290b;
                if (audioManager == null || !audioManager.isStreamMute(3)) {
                    if (Xi.f26026f) {
                        return false;
                    }
                }
            } else {
                AudioManager audioManager2 = f27290b;
                if (audioManager2 == null || audioManager2.getStreamVolume(3) != 0) {
                    if (Xi.f26026f) {
                        return false;
                    }
                }
            }
            return true;
        } catch (Throwable unused) {
            return Xi.f26026f;
        }
    }

    public static void a(final long j10) {
        Function1 function1 = new Function1() { // from class: yh.va
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C3235q.a(j10, (J2) obj);
            }
        };
        f27297i = function1;
        ((Fc) Xi.f26025e.getValue()).a(new int[]{102, 101}, function1);
    }

    public static void a(final InterfaceC3322t9 interfaceC3322t9) {
        final Context context = Xi.f26021a;
        if (context == null) {
            if (interfaceC3322t9 != null) {
                ((C3348u9) interfaceC3322t9).b("AdAudioTracker", "Context is null. Cannot start audio volume tracking");
            }
            a((Float) null);
            return;
        }
        C3136m4 c3136m4 = AbstractC2878c4.f26300a;
        kotlin.jvm.internal.s.h(AdConfig.class, "clazz");
        final long muteChangeInterval = ((AdConfig) AbstractC2878c4.f26300a.a(AdConfig.class)).getMraid3().getMuteChangeInterval();
        Throwable thE = fl.r.e(L3.a(new tl.a() { // from class: yh.ya
            @Override // tl.a
            public final Object invoke() {
                return C3235q.a(interfaceC3322t9, context, muteChangeInterval);
            }
        }));
        if (thE != null) {
            if (interfaceC3322t9 != null) {
                ((C3348u9) interfaceC3322t9).b("AdAudioTracker", "Error starting audio volume tracking - " + thE.getMessage());
            }
            a((Float) null);
        }
    }

    public static final Object a(InterfaceC3322t9 interfaceC3322t9, Context context, long j10) {
        if (f27292d.compareAndSet(false, true)) {
            return em.k.d(f27295g, null, null, new C3209p(interfaceC3322t9, context, j10, null), 3, null);
        }
        if (interfaceC3322t9 == null) {
            return null;
        }
        ((C3348u9) interfaceC3322t9).c("AdAudioTracker", "Audio volume tracking is already started");
        return fl.g0.f38750a;
    }

    public static void a(final Context context, InterfaceC3322t9 interfaceC3322t9) {
        Throwable thE = fl.r.e(L3.a(new tl.a() { // from class: yh.wa
            @Override // tl.a
            public final Object invoke() {
                return C3235q.a(context);
            }
        }));
        if (thE == null || interfaceC3322t9 == null) {
            return;
        }
        ((C3348u9) interfaceC3322t9).b("AdAudioTracker", "Error cleaning up audio volume tracker - " + thE.getMessage());
    }

    public static final fl.g0 a(final Context context) {
        final C3079k c3079k = f27291c;
        if (c3079k != null) {
            L3.a(new tl.a() { // from class: yh.xa
                @Override // tl.a
                public final Object invoke() {
                    return C3235q.a(context, c3079k);
                }
            });
            f27291c = null;
        }
        em.z1 z1Var = f27294f;
        if (z1Var != null) {
            em.z1.c0(z1Var, null, 1, null);
        }
        Function1 function1 = f27297i;
        if (function1 != null) {
            ((Fc) Xi.f26025e.getValue()).a(function1);
        }
        f27297i = null;
        f27294f = null;
        return fl.g0.f38750a;
    }

    public static final fl.g0 a(Context context, C3079k c3079k) {
        context.unregisterReceiver(c3079k);
        return fl.g0.f38750a;
    }

    public final synchronized float a() {
        try {
            boolean zB = b();
            AudioManager audioManager = f27290b;
            int streamVolume = audioManager != null ? audioManager.getStreamVolume(3) : 0;
            AudioManager audioManager2 = f27290b;
            int streamMaxVolume = audioManager2 != null ? audioManager2.getStreamMaxVolume(3) : 0;
            if (zB) {
                return 0.0f;
            }
            if (streamVolume < 0) {
                return 0.0f;
            }
            if (streamVolume > streamMaxVolume) {
                return 1.0f;
            }
            if (streamMaxVolume == 0) {
                return 0.0f;
            }
            return streamVolume / streamMaxVolume;
        } catch (Throwable unused) {
            return 0.0f;
        }
    }

    public static void a(Float f10) {
        if (kotlin.jvm.internal.s.b((Float) f27293e.getAndSet(f10), f10)) {
            return;
        }
        Iterator it = f27296h.iterator();
        kotlin.jvm.internal.s.g(it, "iterator(...)");
        while (it.hasNext()) {
            InterfaceC3053j interfaceC3053j = (InterfaceC3053j) ((WeakReference) it.next()).get();
            if (interfaceC3053j != null) {
                ((Yh) interfaceC3053j).a(f10 != null ? Float.valueOf(J3.a(f10.floatValue() * 100.0f)) : null);
            }
        }
    }
}
