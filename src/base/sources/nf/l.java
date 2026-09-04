package nf;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.adsdk.ugeno.dkl.Rmg.PvZsvNiPV;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f47604a = new l();

    private l() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fl.g0 A(w wVar, Bundle log) {
        kotlin.jvm.internal.s.h(log, "$this$log");
        log.putString("preset", wVar.name());
        return fl.g0.f38750a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fl.g0 D(String str, Bundle log) {
        kotlin.jvm.internal.s.h(log, "$this$log");
        log.putString("lang", str);
        return fl.g0.f38750a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fl.g0 F(String str, p pVar, Bundle log) {
        kotlin.jvm.internal.s.h(log, "$this$log");
        log.putString("lang", str);
        log.putString("error_kind", pVar.name());
        return fl.g0.f38750a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fl.g0 H(String str, Bundle log) {
        kotlin.jvm.internal.s.h(log, "$this$log");
        log.putString("lang", str);
        return fl.g0.f38750a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fl.g0 J(String str, int i10, int i11, long j10, Bundle log) {
        kotlin.jvm.internal.s.h(log, "$this$log");
        log.putString("lang", str);
        log.putInt("duration_s", i10);
        log.putInt("word_count", i11);
        log.putLong("processing_ms", j10);
        return fl.g0.f38750a;
    }

    private final FirebaseAnalytics l(Context context) {
        FirebaseAnalytics firebaseAnalytics = FirebaseAnalytics.getInstance(context.getApplicationContext());
        kotlin.jvm.internal.s.g(firebaseAnalytics, "getInstance(...)");
        return firebaseAnalytics;
    }

    private final void m(Context context, String str, Function1 function1) {
        Bundle bundle = new Bundle();
        bundle.putString("action", str);
        function1.invoke(bundle);
        l(context).a("auto_caption", bundle);
    }

    static /* synthetic */ void n(l lVar, Context context, String str, Function1 function1, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            function1 = new Function1() { // from class: nf.d
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return l.o((Bundle) obj2);
                }
            };
        }
        lVar.m(context, str, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fl.g0 o(Bundle bundle) {
        kotlin.jvm.internal.s.h(bundle, "<this>");
        return fl.g0.f38750a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fl.g0 s(String str, of.a aVar, Bundle log) {
        kotlin.jvm.internal.s.h(log, "$this$log");
        log.putString("lang", str);
        log.putString("error_kind", aVar.name());
        return fl.g0.f38750a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fl.g0 u(String str, Bundle log) {
        kotlin.jvm.internal.s.h(log, "$this$log");
        log.putString("lang", str);
        return fl.g0.f38750a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fl.g0 w(String str, Bundle log) {
        kotlin.jvm.internal.s.h(log, "$this$log");
        log.putString("lang", str);
        return fl.g0.f38750a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fl.g0 y(String str, Bundle log) {
        kotlin.jvm.internal.s.h(log, "$this$log");
        log.putString("source", str);
        return fl.g0.f38750a;
    }

    public final void B(Context context) {
        kotlin.jvm.internal.s.h(context, "context");
        n(this, context, "removed_all", null, 4, null);
    }

    public final void C(Context context, final String lang) {
        kotlin.jvm.internal.s.h(context, "context");
        kotlin.jvm.internal.s.h(lang, "lang");
        m(context, "transcribe_canceled", new Function1() { // from class: nf.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return l.D(lang, (Bundle) obj);
            }
        });
    }

    public final void E(Context context, final String lang, final p errorKind) {
        kotlin.jvm.internal.s.h(context, "context");
        kotlin.jvm.internal.s.h(lang, "lang");
        kotlin.jvm.internal.s.h(errorKind, "errorKind");
        m(context, "transcribe_failed", new Function1() { // from class: nf.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return l.F(lang, errorKind, (Bundle) obj);
            }
        });
    }

    public final void G(Context context, final String lang) {
        kotlin.jvm.internal.s.h(context, "context");
        kotlin.jvm.internal.s.h(lang, "lang");
        m(context, "transcribe_started", new Function1() { // from class: nf.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return l.H(lang, (Bundle) obj);
            }
        });
    }

    public final void I(Context context, final String lang, final int i10, final int i11, final long j10) {
        kotlin.jvm.internal.s.h(context, "context");
        kotlin.jvm.internal.s.h(lang, "lang");
        m(context, "transcribe_success", new Function1() { // from class: nf.j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return l.J(lang, i10, i11, j10, (Bundle) obj);
            }
        });
    }

    public final void p(Context context, final String lang) {
        kotlin.jvm.internal.s.h(context, "context");
        kotlin.jvm.internal.s.h(lang, "lang");
        m(context, "download_canceled", new Function1() { // from class: nf.k
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return l.q(lang, (Bundle) obj);
            }
        });
    }

    public final void r(Context context, final String lang, final of.a errorKind) {
        kotlin.jvm.internal.s.h(context, "context");
        kotlin.jvm.internal.s.h(lang, "lang");
        kotlin.jvm.internal.s.h(errorKind, "errorKind");
        m(context, "download_failed", new Function1() { // from class: nf.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return l.s(lang, errorKind, (Bundle) obj);
            }
        });
    }

    public final void t(Context context, final String lang) {
        kotlin.jvm.internal.s.h(context, "context");
        kotlin.jvm.internal.s.h(lang, "lang");
        m(context, "download_started", new Function1() { // from class: nf.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return l.u(lang, (Bundle) obj);
            }
        });
    }

    public final void v(Context context, final String lang) {
        kotlin.jvm.internal.s.h(context, "context");
        kotlin.jvm.internal.s.h(lang, "lang");
        m(context, "download_success", new Function1() { // from class: nf.i
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return l.w(lang, (Bundle) obj);
            }
        });
    }

    public final void x(Context context, final String source) {
        kotlin.jvm.internal.s.h(context, "context");
        kotlin.jvm.internal.s.h(source, "source");
        m(context, "caption_open", new Function1() { // from class: nf.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return l.y(source, (Bundle) obj);
            }
        });
    }

    public final void z(Context context, final w preset) {
        kotlin.jvm.internal.s.h(context, "context");
        kotlin.jvm.internal.s.h(preset, "preset");
        m(context, "preset_applied", new Function1() { // from class: nf.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return l.A(preset, (Bundle) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fl.g0 q(String str, Bundle log) {
        kotlin.jvm.internal.s.h(log, "$this$log");
        log.putString(PvZsvNiPV.TVSzrKLPQhc, str);
        return fl.g0.f38750a;
    }
}
