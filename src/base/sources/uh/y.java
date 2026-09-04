package uh;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.StaticLayout;
import android.text.TextPaint;
import androidx.lifecycle.o1;
import androidx.lifecycle.q1;
import androidx.lifecycle.v0;
import com.google.android.exoplayer2.source.ClippingMediaSource;
import com.google.android.exoplayer2.x1;
import com.google.android.exoplayer2.y0;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.hecorat.screenrecorder.free.AzRecorderApp;
import com.hecorat.screenrecorder.free.R;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import em.c1;
import em.z1;
import java.io.File;
import java.io.FileFilter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class y extends androidx.lifecycle.a implements androidx.lifecycle.j {
    private final nb.p.a A;
    private androidx.lifecycle.p0 B;
    private androidx.lifecycle.p0 C;
    private androidx.lifecycle.p0 D;
    private androidx.lifecycle.p0 E;
    private final androidx.lifecycle.n0 F;
    private final androidx.lifecycle.n0 G;
    private final List H;
    private final List I;
    private final List J;
    private float K;
    private float L;
    private boolean M;
    private boolean N;
    private androidx.lifecycle.p0 O;
    private final p P;
    private List Q;
    private nf.w R;
    private String S;
    private boolean T;
    private final fl.k U;
    private final fl.k V;
    private final androidx.lifecycle.p0 W;
    private z1 X;
    private String Y;
    private long Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private final androidx.lifecycle.k0 f54584a0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private androidx.lifecycle.p0 f54585c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Handler f54586d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final androidx.lifecycle.p0 f54587e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.google.android.exoplayer2.k f54588f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private qh.a f54589g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private List f54590h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final androidx.lifecycle.p0 f54591i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final androidx.lifecycle.k0 f54592j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final androidx.lifecycle.p0 f54593k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final androidx.lifecycle.p0 f54594l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public qh.h f54595m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final hm.v f54596n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final hm.v f54597o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final hm.v f54598p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final hm.v f54599q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final hm.v f54600r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final hm.v f54601s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final hm.v f54602t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final hm.v f54603u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final hm.v f54604v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final hm.v f54605w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final hm.v f54606x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final hm.v f54607y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private com.google.android.exoplayer2.source.d f54608z;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f54609a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f54610b;

        static {
            int[] iArr = new int[of.a.values().length];
            try {
                iArr[of.a.NETWORK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[of.a.SERVER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[of.a.STORAGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[of.a.CORRUPT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[of.a.INCOMPLETE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[of.a.DOWNLOAD_UNKNOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f54609a = iArr;
            int[] iArr2 = new int[nf.p.values().length];
            try {
                iArr2[nf.p.MODEL_MISSING.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[nf.p.AUDIO_EXTRACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[nf.p.ENGINE.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[nf.p.NO_SPEECH.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[nf.p.NO_AUDIO.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[nf.p.TRANSCRIBE_UNKNOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            f54610b = iArr2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class b extends kotlin.coroutines.jvm.internal.m implements tl.o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f54611r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.k0 f54613t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(kotlin.jvm.internal.k0 k0Var, kl.f fVar) {
            super(2, fVar);
            this.f54613t = k0Var;
        }

        @Override // tl.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(em.o0 o0Var, kl.f fVar) {
            return ((b) create(o0Var, fVar)).invokeSuspend(fl.g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(Object obj, kl.f fVar) {
            return y.this.new b(this.f54613t, fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = ll.b.f();
            int i10 = this.f54611r;
            if (i10 == 0) {
                fl.s.b(obj);
                hm.v vVar = y.this.f54601s;
                Object obj2 = this.f54613t.f43597a;
                this.f54611r = 1;
                if (vVar.emit(obj2, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fl.s.b(obj);
            }
            return fl.g0.f38750a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class c extends kotlin.coroutines.jvm.internal.m implements tl.o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f54614r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private /* synthetic */ Object f54615s;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        static final class a extends kotlin.coroutines.jvm.internal.m implements tl.o {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f54617r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ y f54618s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ androidx.lifecycle.l0 f54619t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(y yVar, androidx.lifecycle.l0 l0Var, kl.f fVar) {
                super(2, fVar);
                this.f54618s = yVar;
                this.f54619t = l0Var;
            }

            @Override // tl.o
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(em.o0 o0Var, kl.f fVar) {
                return ((a) create(o0Var, fVar)).invokeSuspend(fl.g0.f38750a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kl.f create(Object obj, kl.f fVar) {
                return new a(this.f54618s, this.f54619t, fVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) throws IOException {
                Object objF = ll.b.f();
                int i10 = this.f54617r;
                if (i10 == 0) {
                    fl.s.b(obj);
                    AzRecorderApp azRecorderApp = (AzRecorderApp) this.f54618s.j();
                    File fileA = sh.b.A(azRecorderApp, "backgrounds");
                    File file = new File(fileA, "pure_black.jpg");
                    if (!file.exists()) {
                        sh.b.j(azRecorderApp, fileA, "backgrounds", "pure_black.jpg");
                    }
                    androidx.lifecycle.l0 l0Var = this.f54619t;
                    String absolutePath = file.getAbsolutePath();
                    kotlin.jvm.internal.s.g(absolutePath, "getAbsolutePath(...)");
                    this.f54617r = 1;
                    if (l0Var.emit(absolutePath, this) == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    fl.s.b(obj);
                }
                return fl.g0.f38750a;
            }
        }

        c(kl.f fVar) {
            super(2, fVar);
        }

        @Override // tl.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(androidx.lifecycle.l0 l0Var, kl.f fVar) {
            return ((c) create(l0Var, fVar)).invokeSuspend(fl.g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(Object obj, kl.f fVar) {
            c cVar = y.this.new c(fVar);
            cVar.f54615s = obj;
            return cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = ll.b.f();
            int i10 = this.f54614r;
            if (i10 == 0) {
                fl.s.b(obj);
                androidx.lifecycle.l0 l0Var = (androidx.lifecycle.l0) this.f54615s;
                em.k0 k0VarB = c1.b();
                a aVar = new a(y.this, l0Var, null);
                this.f54614r = 1;
                if (em.i.j(k0VarB, aVar, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fl.s.b(obj);
            }
            return fl.g0.f38750a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class d extends kotlin.coroutines.jvm.internal.m implements tl.o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f54620r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ int f54622t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(int i10, kl.f fVar) {
            super(2, fVar);
            this.f54622t = i10;
        }

        @Override // tl.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(em.o0 o0Var, kl.f fVar) {
            return ((d) create(o0Var, fVar)).invokeSuspend(fl.g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(Object obj, kl.f fVar) {
            return y.this.new d(this.f54622t, fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = ll.b.f();
            int i10 = this.f54620r;
            if (i10 == 0) {
                fl.s.b(obj);
                hm.v vVar = y.this.f54604v;
                Integer numD = kotlin.coroutines.jvm.internal.b.d(this.f54622t);
                this.f54620r = 1;
                if (vVar.emit(numD, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fl.s.b(obj);
            }
            return fl.g0.f38750a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class e extends kotlin.coroutines.jvm.internal.m implements tl.o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f54623r;

        e(kl.f fVar) {
            super(2, fVar);
        }

        @Override // tl.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(em.o0 o0Var, kl.f fVar) {
            return ((e) create(o0Var, fVar)).invokeSuspend(fl.g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(Object obj, kl.f fVar) {
            return y.this.new e(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = ll.b.f();
            int i10 = this.f54623r;
            if (i10 == 0) {
                fl.s.b(obj);
                hm.v vVar = y.this.f54598p;
                fl.g0 g0Var = fl.g0.f38750a;
                this.f54623r = 1;
                if (vVar.emit(g0Var, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fl.s.b(obj);
            }
            return fl.g0.f38750a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class f extends kotlin.coroutines.jvm.internal.m implements tl.o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f54625r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ String f54627t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, kl.f fVar) {
            super(2, fVar);
            this.f54627t = str;
        }

        @Override // tl.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(em.o0 o0Var, kl.f fVar) {
            return ((f) create(o0Var, fVar)).invokeSuspend(fl.g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(Object obj, kl.f fVar) {
            return y.this.new f(this.f54627t, fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = ll.b.f();
            int i10 = this.f54625r;
            if (i10 == 0) {
                fl.s.b(obj);
                hm.v vVar = y.this.f54600r;
                String str = this.f54627t;
                this.f54625r = 1;
                if (vVar.emit(str, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fl.s.b(obj);
            }
            return fl.g0.f38750a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class g extends kotlin.coroutines.jvm.internal.m implements tl.o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f54628r;

        g(kl.f fVar) {
            super(2, fVar);
        }

        @Override // tl.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(em.o0 o0Var, kl.f fVar) {
            return ((g) create(o0Var, fVar)).invokeSuspend(fl.g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(Object obj, kl.f fVar) {
            return y.this.new g(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = ll.b.f();
            int i10 = this.f54628r;
            if (i10 == 0) {
                fl.s.b(obj);
                hm.v vVar = y.this.f54603u;
                fl.g0 g0Var = fl.g0.f38750a;
                this.f54628r = 1;
                if (vVar.emit(g0Var, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fl.s.b(obj);
            }
            return fl.g0.f38750a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class h extends kotlin.coroutines.jvm.internal.m implements tl.o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f54630r;

        h(kl.f fVar) {
            super(2, fVar);
        }

        @Override // tl.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(em.o0 o0Var, kl.f fVar) {
            return ((h) create(o0Var, fVar)).invokeSuspend(fl.g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(Object obj, kl.f fVar) {
            return y.this.new h(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = ll.b.f();
            int i10 = this.f54630r;
            if (i10 == 0) {
                fl.s.b(obj);
                hm.v vVar = y.this.f54607y;
                fl.g0 g0Var = fl.g0.f38750a;
                this.f54630r = 1;
                if (vVar.emit(g0Var, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fl.s.b(obj);
            }
            return fl.g0.f38750a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class i extends kotlin.coroutines.jvm.internal.m implements tl.o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f54632r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ String f54634t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(String str, kl.f fVar) {
            super(2, fVar);
            this.f54634t = str;
        }

        @Override // tl.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(em.o0 o0Var, kl.f fVar) {
            return ((i) create(o0Var, fVar)).invokeSuspend(fl.g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(Object obj, kl.f fVar) {
            return y.this.new i(this.f54634t, fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = ll.b.f();
            int i10 = this.f54632r;
            if (i10 == 0) {
                fl.s.b(obj);
                hm.v vVar = y.this.f54602t;
                String str = this.f54634t;
                this.f54632r = 1;
                if (vVar.emit(str, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fl.s.b(obj);
            }
            return fl.g0.f38750a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class j extends kotlin.coroutines.jvm.internal.m implements tl.o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f54635r;

        j(kl.f fVar) {
            super(2, fVar);
        }

        @Override // tl.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(em.o0 o0Var, kl.f fVar) {
            return ((j) create(o0Var, fVar)).invokeSuspend(fl.g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(Object obj, kl.f fVar) {
            return y.this.new j(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = ll.b.f();
            int i10 = this.f54635r;
            if (i10 == 0) {
                fl.s.b(obj);
                hm.v vVar = y.this.f54605w;
                fl.g0 g0Var = fl.g0.f38750a;
                this.f54635r = 1;
                if (vVar.emit(g0Var, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fl.s.b(obj);
            }
            return fl.g0.f38750a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class k extends kotlin.coroutines.jvm.internal.m implements tl.o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f54637r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ String f54639t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(String str, kl.f fVar) {
            super(2, fVar);
            this.f54639t = str;
        }

        @Override // tl.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(em.o0 o0Var, kl.f fVar) {
            return ((k) create(o0Var, fVar)).invokeSuspend(fl.g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(Object obj, kl.f fVar) {
            return y.this.new k(this.f54639t, fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = ll.b.f();
            int i10 = this.f54637r;
            if (i10 == 0) {
                fl.s.b(obj);
                hm.v vVar = y.this.f54606x;
                String str = this.f54639t;
                this.f54637r = 1;
                if (vVar.emit(str, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fl.s.b(obj);
            }
            return fl.g0.f38750a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class l extends kotlin.coroutines.jvm.internal.m implements tl.o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f54640r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ qh.h f54642t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(qh.h hVar, kl.f fVar) {
            super(2, fVar);
            this.f54642t = hVar;
        }

        @Override // tl.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(em.o0 o0Var, kl.f fVar) {
            return ((l) create(o0Var, fVar)).invokeSuspend(fl.g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(Object obj, kl.f fVar) {
            return y.this.new l(this.f54642t, fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = ll.b.f();
            int i10 = this.f54640r;
            if (i10 == 0) {
                fl.s.b(obj);
                hm.v vVar = y.this.f54599q;
                qh.h hVar = this.f54642t;
                this.f54640r = 1;
                if (vVar.emit(hVar, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fl.s.b(obj);
            }
            return fl.g0.f38750a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class m extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f54643r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f54644s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f54645t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        Object f54646u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        /* synthetic */ Object f54647v;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        int f54649x;

        m(kl.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f54647v = obj;
            this.f54649x |= Integer.MIN_VALUE;
            return y.this.A1(null, null, null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class n extends kotlin.coroutines.jvm.internal.m implements tl.o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f54650r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ List f54651s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ String f54652t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(List list, String str, kl.f fVar) {
            super(2, fVar);
            this.f54651s = list;
            this.f54652t = str;
        }

        @Override // tl.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(em.o0 o0Var, kl.f fVar) {
            return ((n) create(o0Var, fVar)).invokeSuspend(fl.g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(Object obj, kl.f fVar) {
            return new n(this.f54651s, this.f54652t, fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ll.b.f();
            if (this.f54650r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fl.s.b(obj);
            return nf.t.f47632a.c(nf.o.e(nf.o.f47608a, this.f54651s, 0, 0L, 0L, 14, null), this.f54652t);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class o extends kotlin.coroutines.jvm.internal.m implements tl.o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f54653r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ List f54655t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ ng.d f54656u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(List list, ng.d dVar, kl.f fVar) {
            super(2, fVar);
            this.f54655t = list;
            this.f54656u = dVar;
        }

        @Override // tl.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(em.o0 o0Var, kl.f fVar) {
            return ((o) create(o0Var, fVar)).invokeSuspend(fl.g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(Object obj, kl.f fVar) {
            return y.this.new o(this.f54655t, this.f54656u, fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ll.b.f();
            if (this.f54653r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fl.s.b(obj);
            return nf.v.f47646a.a(y.this.j(), this.f54655t, y.this.v0(), this.f54656u.A(), this.f54656u.p());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class p implements x1.d {

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        static final class a extends kotlin.coroutines.jvm.internal.m implements tl.o {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f54658r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ y f54659s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ int f54660t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(y yVar, int i10, kl.f fVar) {
                super(2, fVar);
                this.f54659s = yVar;
                this.f54660t = i10;
            }

            @Override // tl.o
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(em.o0 o0Var, kl.f fVar) {
                return ((a) create(o0Var, fVar)).invokeSuspend(fl.g0.f38750a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kl.f create(Object obj, kl.f fVar) {
                return new a(this.f54659s, this.f54660t, fVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objF = ll.b.f();
                int i10 = this.f54658r;
                if (i10 == 0) {
                    fl.s.b(obj);
                    hm.v vVar = this.f54659s.f54597o;
                    Integer numD = kotlin.coroutines.jvm.internal.b.d(this.f54660t);
                    this.f54658r = 1;
                    if (vVar.emit(numD, this) == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    fl.s.b(obj);
                }
                return fl.g0.f38750a;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        static final class b extends kotlin.coroutines.jvm.internal.m implements tl.o {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f54661r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ y f54662s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(y yVar, kl.f fVar) {
                super(2, fVar);
                this.f54662s = yVar;
            }

            @Override // tl.o
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(em.o0 o0Var, kl.f fVar) {
                return ((b) create(o0Var, fVar)).invokeSuspend(fl.g0.f38750a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kl.f create(Object obj, kl.f fVar) {
                return new b(this.f54662s, fVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objF = ll.b.f();
                int i10 = this.f54661r;
                if (i10 == 0) {
                    fl.s.b(obj);
                    wp.a.a("onRenderedFirstFrame", new Object[0]);
                    hm.v vVar = this.f54662s.f54596n;
                    fl.g0 g0Var = fl.g0.f38750a;
                    this.f54661r = 1;
                    if (vVar.emit(g0Var, this) == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    fl.s.b(obj);
                }
                return fl.g0.f38750a;
            }
        }

        p() {
        }

        @Override // com.google.android.exoplayer2.x1.d
        public void P(y0 y0Var, int i10) {
            super.P(y0Var, i10);
            com.google.android.exoplayer2.k kVar = (com.google.android.exoplayer2.k) y.this.f54587e.f();
            if (kVar != null) {
                y yVar = y.this;
                if (kVar.getRepeatMode() != 1) {
                    yVar.f54594l.q(Integer.valueOf(kVar.l()));
                    em.k.d(q1.a(yVar), null, null, new a(yVar, i10, null), 3, null);
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("currentMediaIndex changed in onMediaItemTransition: ");
                sb2.append(yVar.f54594l.f());
                sb2.append(", reason ");
                sb2.append(i10);
                sb2.append(", mode_one ");
                sb2.append(kVar.getRepeatMode() != 1);
                sb2.append(' ');
                wp.a.a(sb2.toString(), new Object[0]);
            }
        }

        @Override // com.google.android.exoplayer2.x1.d
        public void onIsPlayingChanged(boolean z10) {
            super.onIsPlayingChanged(z10);
            wp.a.a("onIsPlayingChanged " + z10, new Object[0]);
            y.this.f54593k.q(Boolean.valueOf(z10));
            y.this.i0(z10 ^ true);
            if (!z10) {
                y.this.g2();
                return;
            }
            y.this.E1();
            if (((com.google.android.exoplayer2.k) y.this.W0().f()) != null) {
                final y yVar = y.this;
                yVar.f54586d.postDelayed(new Runnable() { // from class: uh.z
                    @Override // java.lang.Runnable
                    public final void run() {
                        yVar.F0();
                    }
                }, 100L);
            }
        }

        @Override // com.google.android.exoplayer2.x1.d
        public void onRenderedFirstFrame() {
            super.onRenderedFirstFrame();
            em.k.d(q1.a(y.this), null, null, new b(y.this, null), 3, null);
        }

        @Override // com.google.android.exoplayer2.x1.d
        public void onSurfaceSizeChanged(int i10, int i11) {
            super.onSurfaceSizeChanged(i10, i11);
            wp.a.a("onSurfaceSizeChanged: %s, %s", Integer.valueOf(i10), Integer.valueOf(i11));
        }

        @Override // com.google.android.exoplayer2.x1.d
        public void w(pb.z videoSize) {
            kotlin.jvm.internal.s.h(videoSize, "videoSize");
            super.w(videoSize);
            wp.a.a("onVideoSizeChanged: %s, %s", Integer.valueOf(videoSize.f49997a), Integer.valueOf(videoSize.f49998b));
        }

        @Override // com.google.android.exoplayer2.x1.d
        public void x(x1.e oldPosition, x1.e newPosition, int i10) {
            kotlin.jvm.internal.s.h(oldPosition, "oldPosition");
            kotlin.jvm.internal.s.h(newPosition, "newPosition");
            super.x(oldPosition, newPosition, i10);
            wp.a.a("onPositionDiscontinuity " + y.this.N + ", reason: " + i10, new Object[0]);
            if (i10 == 1) {
                if (y.this.N) {
                    y.this.N = false;
                } else {
                    com.google.android.exoplayer2.k kVar = (com.google.android.exoplayer2.k) y.this.f54587e.f();
                    if (kVar != null) {
                        kVar.setPlayWhenReady(false);
                    }
                }
                y.this.f54591i.q(Long.valueOf(newPosition.f18968g + sh.b.s(y.this.k1(), newPosition.f18964c)));
                wp.a.a("Player discontinue new position: %s", y.this.f54591i.f());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class q extends kotlin.coroutines.jvm.internal.m implements tl.o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f54663r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f54664s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f54665t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ AzRecorderApp f54666u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ String f54667v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        final /* synthetic */ y f54668w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        final /* synthetic */ ng.d f54669x;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        static final class a implements hm.f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ y f54670a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ AzRecorderApp f54671b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f54672c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.g0 f54673d;

            a(y yVar, AzRecorderApp azRecorderApp, String str, kotlin.jvm.internal.g0 g0Var) {
                this.f54670a = yVar;
                this.f54671b = azRecorderApp;
                this.f54672c = str;
                this.f54673d = g0Var;
            }

            @Override // hm.f
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(of.b bVar, kl.f fVar) {
                if (bVar instanceof of.b.c) {
                    of.b.c cVar = (of.b.c) bVar;
                    this.f54670a.W.q(new nf.u.b(cVar.b(), cVar.a(), cVar.c()));
                } else if ((bVar instanceof of.b.a) || kotlin.jvm.internal.s.c(bVar, of.b.e.f48549a)) {
                    this.f54670a.W.q(nf.u.e.f47642a);
                } else if (kotlin.jvm.internal.s.c(bVar, of.b.d.f48548a)) {
                    nf.l.f47604a.v(this.f54671b, this.f54672c);
                } else {
                    if (!(bVar instanceof of.b.C0748b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.f54673d.f43588a = true;
                    of.b.C0748b c0748b = (of.b.C0748b) bVar;
                    nf.l.f47604a.r(this.f54671b, this.f54672c, c0748b.a());
                    this.f54670a.W.q(new nf.u.c(this.f54670a.j0(c0748b.a())));
                }
                return fl.g0.f38750a;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        static final class b implements hm.f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ y f54674a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f54675b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ ng.d f54676c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ AzRecorderApp f54677d;

            b(y yVar, String str, ng.d dVar, AzRecorderApp azRecorderApp) {
                this.f54674a = yVar;
                this.f54675b = str;
                this.f54676c = dVar;
                this.f54677d = azRecorderApp;
            }

            @Override // hm.f
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(nf.s sVar, kl.f fVar) {
                if (sVar instanceof nf.s.b) {
                    this.f54674a.W.q(new nf.u.g(((nf.s.b) sVar).a()));
                } else if (kotlin.jvm.internal.s.c(sVar, nf.s.d.f47629a)) {
                    this.f54674a.W.q(nf.u.f.f47643a);
                } else if (sVar instanceof nf.s.f) {
                    this.f54674a.W.q(new nf.u.h(((nf.s.f) sVar).a()));
                } else {
                    if (sVar instanceof nf.s.a) {
                        Object objA1 = this.f54674a.A1(this.f54675b, ((nf.s.a) sVar).a(), this.f54676c, fVar);
                        return objA1 == ll.b.f() ? objA1 : fl.g0.f38750a;
                    }
                    if (sVar instanceof nf.s.c) {
                        nf.s.c cVar = (nf.s.c) sVar;
                        nf.l.f47604a.E(this.f54677d, this.f54675b, cVar.a());
                        this.f54674a.W.q(new nf.u.c(this.f54674a.e0(cVar.a())));
                    } else {
                        if (!kotlin.jvm.internal.s.c(sVar, nf.s.e.f47630a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        nf.l.f47604a.E(this.f54677d, this.f54675b, nf.p.NO_AUDIO);
                        this.f54674a.W.q(new nf.u.c(R.string.caption_error_no_audio_track));
                    }
                }
                return fl.g0.f38750a;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        static final class c extends kotlin.coroutines.jvm.internal.m implements tl.o {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f54678r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ y f54679s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(y yVar, kl.f fVar) {
                super(2, fVar);
                this.f54679s = yVar;
            }

            @Override // tl.o
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(em.o0 o0Var, kl.f fVar) {
                return ((c) create(o0Var, fVar)).invokeSuspend(fl.g0.f38750a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kl.f create(Object obj, kl.f fVar) {
                return new c(this.f54679s, fVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                ll.b.f();
                if (this.f54678r != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fl.s.b(obj);
                return kotlin.coroutines.jvm.internal.b.a(this.f54679s.u0().h(of.f.f48559a.a()));
            }
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        static final class d extends kotlin.coroutines.jvm.internal.m implements tl.o {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f54680r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ y f54681s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(y yVar, kl.f fVar) {
                super(2, fVar);
                this.f54681s = yVar;
            }

            @Override // tl.o
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(em.o0 o0Var, kl.f fVar) {
                return ((d) create(o0Var, fVar)).invokeSuspend(fl.g0.f38750a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kl.f create(Object obj, kl.f fVar) {
                return new d(this.f54681s, fVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                ll.b.f();
                if (this.f54680r != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fl.s.b(obj);
                this.f54681s.u0().f();
                return kotlin.coroutines.jvm.internal.b.a(this.f54681s.u0().i(of.f.f48559a.a()));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(AzRecorderApp azRecorderApp, String str, y yVar, ng.d dVar, kl.f fVar) {
            super(2, fVar);
            this.f54666u = azRecorderApp;
            this.f54667v = str;
            this.f54668w = yVar;
            this.f54669x = dVar;
        }

        @Override // tl.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(em.o0 o0Var, kl.f fVar) {
            return ((q) create(o0Var, fVar)).invokeSuspend(fl.g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(Object obj, kl.f fVar) {
            q qVar = new q(this.f54666u, this.f54667v, this.f54668w, this.f54669x, fVar);
            qVar.f54665t = obj;
            return qVar;
        }

        /* JADX WARN: Code duplicated, block: B:37:0x008f A[Catch: all -> 0x001e, CancellationException -> 0x0021, TryCatch #3 {CancellationException -> 0x0021, all -> 0x001e, blocks: (B:9:0x0019, B:18:0x0034, B:43:0x00e6, B:45:0x00ea, B:48:0x00ee, B:21:0x003d, B:35:0x0087, B:37:0x008f, B:39:0x00ae, B:24:0x0045, B:30:0x0068, B:32:0x0070, B:27:0x0051), top: B:62:0x000b }] */
        /* JADX WARN: Code duplicated, block: B:39:0x00ae A[Catch: all -> 0x001e, CancellationException -> 0x0021, TryCatch #3 {CancellationException -> 0x0021, all -> 0x001e, blocks: (B:9:0x0019, B:18:0x0034, B:43:0x00e6, B:45:0x00ea, B:48:0x00ee, B:21:0x003d, B:35:0x0087, B:37:0x008f, B:39:0x00ae, B:24:0x0045, B:30:0x0068, B:32:0x0070, B:27:0x0051), top: B:62:0x000b }] */
        /* JADX WARN: Code duplicated, block: B:41:0x00e3  */
        /* JADX WARN: Code duplicated, block: B:42:0x00e4  */
        /* JADX WARN: Code duplicated, block: B:45:0x00ea A[Catch: all -> 0x001e, CancellationException -> 0x0021, TryCatch #3 {CancellationException -> 0x0021, all -> 0x001e, blocks: (B:9:0x0019, B:18:0x0034, B:43:0x00e6, B:45:0x00ea, B:48:0x00ee, B:21:0x003d, B:35:0x0087, B:37:0x008f, B:39:0x00ae, B:24:0x0045, B:30:0x0068, B:32:0x0070, B:27:0x0051), top: B:62:0x000b }] */
        /* JADX WARN: Code duplicated, block: B:47:0x00ed  */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x0126, code lost:
        
            if (r11.collect(r3, r10) == r0) goto L50;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                Method dump skipped, instruction units count: 387
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: uh.y.q.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(Application application) {
        super(application);
        kotlin.jvm.internal.s.h(application, "application");
        Boolean bool = Boolean.FALSE;
        this.f54585c = new androidx.lifecycle.p0(bool);
        this.f54586d = new Handler(Looper.getMainLooper());
        this.f54587e = new androidx.lifecycle.p0();
        androidx.lifecycle.p0 p0Var = new androidx.lifecycle.p0(0L);
        this.f54591i = p0Var;
        this.f54592j = o1.d(p0Var, new Function1() { // from class: uh.o
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return y.F1((Long) obj);
            }
        });
        this.f54593k = new androidx.lifecycle.p0(bool);
        this.f54594l = new androidx.lifecycle.p0(0);
        this.f54596n = hm.b0.b(0, 0, null, 7, null);
        this.f54597o = hm.b0.b(0, 0, null, 7, null);
        this.f54598p = hm.b0.b(0, 0, null, 7, null);
        this.f54599q = hm.b0.b(0, 0, null, 7, null);
        this.f54600r = hm.b0.b(0, 0, null, 7, null);
        this.f54601s = hm.b0.b(0, 0, null, 7, null);
        this.f54602t = hm.b0.b(0, 0, null, 7, null);
        this.f54603u = hm.b0.b(0, 0, null, 7, null);
        this.f54604v = hm.b0.b(0, 0, null, 7, null);
        this.f54605w = hm.b0.b(0, 0, null, 7, null);
        this.f54606x = hm.b0.b(0, 0, null, 7, null);
        this.f54607y = hm.b0.b(0, 0, null, 7, null);
        this.A = new nb.p.a(j());
        this.B = new androidx.lifecycle.p0(720);
        this.C = new androidx.lifecycle.p0(30);
        this.D = new androidx.lifecycle.p0(rh.d.a(j()));
        this.E = new androidx.lifecycle.p0("720p");
        final androidx.lifecycle.n0 n0Var = new androidx.lifecycle.n0();
        n0Var.r(this.B, new a0(new Function1() { // from class: uh.p
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return y.l0(n0Var, this, (Integer) obj);
            }
        }));
        n0Var.r(this.C, new a0(new Function1() { // from class: uh.q
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return y.m0(n0Var, this, (Integer) obj);
            }
        }));
        this.F = n0Var;
        final androidx.lifecycle.n0 n0Var2 = new androidx.lifecycle.n0();
        n0Var2.r(this.D, new a0(new Function1() { // from class: uh.r
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return y.k0(n0Var2, this, (qh.d) obj);
            }
        }));
        this.G = n0Var2;
        this.H = new ArrayList();
        this.I = new ArrayList();
        this.J = new ArrayList();
        this.K = 1.0f;
        this.L = 1.0f;
        this.O = new androidx.lifecycle.p0(null);
        this.P = new p();
        this.Q = gl.r.l();
        this.R = nf.w.f47647h.a();
        this.U = fl.l.b(new tl.a() { // from class: uh.s
            @Override // tl.a
            public final Object invoke() {
                return y.f0(this.f54581a);
            }
        });
        this.V = fl.l.b(new tl.a() { // from class: uh.t
            @Override // tl.a
            public final Object invoke() {
                return y.g0(this.f54582a);
            }
        });
        this.W = new androidx.lifecycle.p0(nf.u.d.f47641a);
        this.Y = "";
        this.f54584a0 = androidx.lifecycle.i.b(q1.a(this).i0(), 0L, new c(null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object A1(String str, List list, ng.d dVar, kl.f fVar) {
        m mVar;
        y yVar;
        String str2;
        ng.d dVar2;
        y yVar2;
        if (fVar instanceof m) {
            mVar = (m) fVar;
            int i10 = mVar.f54649x;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                mVar.f54649x = i10 - Integer.MIN_VALUE;
            } else {
                mVar = new m(fVar);
            }
        } else {
            mVar = new m(fVar);
        }
        Object objJ = mVar.f54647v;
        Object objF = ll.b.f();
        int i11 = mVar.f54649x;
        if (i11 == 0) {
            fl.s.b(objJ);
            if (list.isEmpty()) {
                nf.l.f47604a.E(j(), str, nf.p.NO_SPEECH);
                this.W.q(new nf.u.c(R.string.caption_error_no_speech));
                return fl.g0.f38750a;
            }
            this.T = false;
            em.k0 k0VarA = c1.a();
            n nVar = new n(list, str, null);
            mVar.f54643r = this;
            mVar.f54644s = str;
            mVar.f54645t = list;
            mVar.f54646u = dVar;
            mVar.f54649x = 1;
            objJ = em.i.j(k0VarA, nVar, mVar);
            if (objJ != objF) {
                yVar = this;
            }
            return objF;
        }
        if (i11 == 1) {
            dVar = (ng.d) mVar.f54646u;
            list = (List) mVar.f54645t;
            str = (String) mVar.f54644s;
            yVar = (y) mVar.f54643r;
            fl.s.b(objJ);
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dVar2 = (ng.d) mVar.f54646u;
            list = (List) mVar.f54645t;
            String str3 = (String) mVar.f54644s;
            y yVar3 = (y) mVar.f54643r;
            fl.s.b(objJ);
            str2 = str3;
            yVar2 = yVar3;
        }
        yVar2.X((List) objJ);
        nf.l.f47604a.I(yVar2.j(), str2, (int) (dVar2.j() / 1000), list.size(), System.currentTimeMillis() - yVar2.Z);
        yVar2.W.q(nf.u.a.f47636a);
        return fl.g0.f38750a;
        List list2 = (List) objJ;
        yVar.Q = list2;
        em.k0 k0VarA2 = c1.a();
        o oVar = yVar.new o(list2, dVar, null);
        mVar.f54643r = yVar;
        mVar.f54644s = str;
        mVar.f54645t = list;
        mVar.f54646u = dVar;
        mVar.f54649x = 2;
        objJ = em.i.j(k0VarA2, oVar, mVar);
        if (objJ != objF) {
            y yVar4 = yVar;
            str2 = str;
            dVar2 = dVar;
            yVar2 = yVar4;
            yVar2.X((List) objJ);
            nf.l.f47604a.I(yVar2.j(), str2, (int) (dVar2.j() / 1000), list.size(), System.currentTimeMillis() - yVar2.Z);
            yVar2.W.q(nf.u.a.f47636a);
            return fl.g0.f38750a;
        }
        return objF;
    }

    private final ClippingMediaSource B0(ng.d dVar) {
        y0 y0VarD = y0.d(dVar.b());
        kotlin.jvm.internal.s.g(y0VarD, "fromUri(...)");
        com.google.android.exoplayer2.source.z zVarE = new com.google.android.exoplayer2.source.z.b(this.A).a(y0VarD);
        kotlin.jvm.internal.s.g(zVarE, "createMediaSource(...)");
        long j10 = 1000;
        return new ClippingMediaSource(zVarE, dVar.z() * j10, dVar.y() * j10);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private final void D1(qh.a aVar) {
        wp.a.a("Play audio item: %s", aVar.i());
        if (this.f54588f == null) {
            this.f54588f = new com.google.android.exoplayer2.k.b(j()).e();
        }
        com.google.android.exoplayer2.k kVar = (com.google.android.exoplayer2.k) this.f54587e.f();
        if (kVar != null) {
            kVar.setVolume(this.K);
        }
        y0.d dVarF = new y0.d.a().k(aVar.k()).h(aVar.j()).f();
        kotlin.jvm.internal.s.g(dVarF, "build(...)");
        y0 y0VarA = new y0.c().g(aVar.l()).b(dVarF).a();
        kotlin.jvm.internal.s.g(y0VarA, "build(...)");
        com.google.android.exoplayer2.k kVar2 = this.f54588f;
        if (kVar2 != null) {
            kVar2.A(y0VarA);
        }
        com.google.android.exoplayer2.k kVar3 = this.f54588f;
        if (kVar3 != null) {
            kVar3.setVolume(aVar.m());
        }
        com.google.android.exoplayer2.k kVar4 = this.f54588f;
        if (kVar4 != null) {
            kVar4.setRepeatMode(aVar.g() ? 1 : 0);
        }
        com.google.android.exoplayer2.k kVar5 = this.f54588f;
        if (kVar5 != null) {
            kVar5.a();
        }
        com.google.android.exoplayer2.k kVar6 = this.f54588f;
        if (kVar6 != null) {
            Object objF = this.f54591i.f();
            kotlin.jvm.internal.s.e(objF);
            kVar6.seekTo(((Number) objF).longValue() - aVar.c());
        }
        com.google.android.exoplayer2.k kVar7 = this.f54588f;
        if (kVar7 != null) {
            kVar7.setPlayWhenReady(true);
        }
        this.f54589g = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E1() {
        Long l10;
        com.google.android.exoplayer2.k kVar = (com.google.android.exoplayer2.k) this.f54587e.f();
        if ((kVar != null && kVar.getRepeatMode() == 1) || this.J.isEmpty() || (l10 = (Long) this.f54591i.f()) == null) {
            return;
        }
        long jLongValue = l10.longValue();
        qh.a aVar = this.f54589g;
        if (aVar != null) {
            if (jLongValue >= aVar.c() && jLongValue <= aVar.c() + aVar.b()) {
                return;
            } else {
                g2();
            }
        }
        for (qh.a aVar2 : this.J) {
            if (jLongValue >= aVar2.c() && jLongValue <= aVar2.c() + aVar2.b()) {
                D1(aVar2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F0() {
        com.google.android.exoplayer2.k kVar = (com.google.android.exoplayer2.k) this.f54587e.f();
        if (kVar != null) {
            this.f54591i.q(Long.valueOf(kVar.getCurrentPosition() + sh.b.s(k1(), kVar.l())));
            wp.a.a("Current playlist position: %s", this.f54591i.f());
            if (kVar.isPlaying()) {
                E1();
                this.f54586d.postDelayed(new Runnable() { // from class: uh.x
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f54583a.F0();
                    }
                }, 100L);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String F1(Long l10) {
        nh.l0 l0Var = nh.l0.f47742a;
        kotlin.jvm.internal.s.e(l10);
        return l0Var.d(l10.longValue());
    }

    private final void G1() {
        com.google.android.exoplayer2.k kVar = this.f54588f;
        if (kVar != null) {
            kVar.release();
        }
        this.f54588f = null;
    }

    private final void H1() {
        wp.a.a("Release player", new Object[0]);
        com.google.android.exoplayer2.k kVar = (com.google.android.exoplayer2.k) this.f54587e.f();
        if (kVar != null) {
            kVar.o(this.P);
        }
        com.google.android.exoplayer2.k kVar2 = (com.google.android.exoplayer2.k) this.f54587e.f();
        if (kVar2 != null) {
            kVar2.release();
        }
        this.f54587e.q(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean J1(qh.j it) {
        kotlin.jvm.internal.s.h(it, "it");
        return it.x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean M0(File file) {
        String name = file.getName();
        kotlin.jvm.internal.s.g(name, "getName(...)");
        if (bm.r.N(name, "temp_text_", false, 2, null)) {
            return true;
        }
        String name2 = file.getName();
        kotlin.jvm.internal.s.g(name2, "getName(...)");
        return bm.r.N(name2, "cached_font_", false, 2, null);
    }

    private final File P1(Context context, qh.j jVar, int i10, float f10) throws IOException {
        Typeface typefaceCreateFromFile;
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTextSize(sh.b.i(context, jVar.u()) * f10);
        textPaint.setColor((jVar.p() & 16777215) | (-16777216));
        textPaint.setAlpha((int) (jVar.q() * 255));
        try {
            typefaceCreateFromFile = Typeface.createFromFile(jVar.r().b());
        } catch (Exception e10) {
            wp.a.j(e10, "Failed to load font for PNG render: " + jVar.r().b(), new Object[0]);
            typefaceCreateFromFile = Typeface.DEFAULT;
        }
        textPaint.setTypeface(typefaceCreateFromFile);
        int iD = yl.g.d(vl.a.b(jVar.k() * f10), 1);
        int iD2 = yl.g.d(vl.a.b(jVar.g() * f10), 1);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iD, iD2, Bitmap.Config.ARGB_8888);
        kotlin.jvm.internal.s.g(bitmapCreateBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        StaticLayout staticLayoutBuild = StaticLayout.Builder.obtain(jVar.d(), 0, jVar.d().length(), textPaint, iD).setAlignment(jVar.o()).build();
        kotlin.jvm.internal.s.g(staticLayoutBuild, "build(...)");
        canvas.save();
        canvas.translate(0.0f, (iD2 - staticLayoutBuild.getHeight()) / 2.0f);
        if (jVar.w() > 0.0f) {
            Paint.Style style = textPaint.getStyle();
            int color = textPaint.getColor();
            textPaint.setStyle(Paint.Style.STROKE);
            textPaint.setStrokeWidth(jVar.w() * f10);
            textPaint.setStrokeJoin(Paint.Join.ROUND);
            textPaint.setStrokeCap(Paint.Cap.ROUND);
            textPaint.setColor(jVar.v());
            staticLayoutBuild.draw(canvas);
            textPaint.setStyle(style);
            textPaint.setColor(color);
        }
        staticLayoutBuild.draw(canvas);
        canvas.restore();
        File file = new File(context.getCacheDir(), "temp_text_" + i10 + ".png");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
            ql.b.a(fileOutputStream, null);
            bitmapCreateBitmap.recycle();
            return file;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                ql.b.a(fileOutputStream, th2);
                throw th3;
            }
        }
    }

    private final qh.h T0() {
        ng.d dVar = (ng.d) k1().get(0);
        int iA = dVar.A();
        int iP = dVar.p();
        RectF rectFI = dVar.i();
        if (rectFI != null) {
            iA = vl.a.b((rectFI.right - rectFI.left) * iA);
            iP = vl.a.b((rectFI.bottom - rectFI.top) * iP);
        }
        String string = ((AzRecorderApp) j()).getString(R.string.fit);
        kotlin.jvm.internal.s.g(string, "getString(...)");
        return new qh.h(iA, iP, string, Integer.valueOf(R.drawable.ic_baseline_crop_free_24), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Y(qh.j it) {
        kotlin.jvm.internal.s.h(it, "it");
        return it.x();
    }

    private final fl.q Z0(List list, long j10) {
        Iterator it = list.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            ng.d dVar = (ng.d) it.next();
            long jY = dVar.y() - dVar.z();
            if (j10 <= jY) {
                break;
            }
            j10 -= jY;
            i10++;
        }
        return new fl.q(Integer.valueOf(i10), Long.valueOf(j10));
    }

    private final fl.v a1(qh.i iVar, float[] fArr) {
        Matrix matrix = new Matrix();
        matrix.set(iVar.h());
        matrix.getValues(fArr);
        float f10 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[3];
        float fSqrt = (float) Math.sqrt((f10 * f10) + (f12 * f12));
        float f13 = -((float) Math.atan2(f11, f10));
        double d10 = ((double) f13) * 57.29577951308232d;
        wp.a.a("Rotate: " + d10, new Object[0]);
        float[] fArr2 = new float[2];
        matrix.mapPoints(fArr2, new float[]{((float) iVar.k()) / 2.0f, ((float) iVar.g()) / 2.0f});
        float f14 = fArr2[0];
        float f15 = fArr2[1];
        wp.a.a("CenterX: %s, centerY: %s", Float.valueOf(f14), Float.valueOf(f15));
        PointF pointFV = sh.b.v(iVar.k(), iVar.g(), f13, fSqrt);
        matrix.postRotate(-((float) d10), f14, f15);
        matrix.getValues(fArr);
        return new fl.v(Float.valueOf(fSqrt), Float.valueOf(f13), new PointF(fArr[2] + pointFV.x, fArr[5] + pointFV.y));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int e0(nf.p pVar) {
        switch (a.f54610b[pVar.ordinal()]) {
            case 1:
                return R.string.caption_error_model_missing;
            case 2:
                return R.string.caption_error_audio_extract;
            case 3:
                return R.string.caption_error_engine;
            case 4:
                return R.string.caption_error_no_speech;
            case 5:
                return R.string.caption_error_no_audio_track;
            case 6:
                return R.string.caption_error_unknown;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final of.e f0(y yVar) {
        return new of.e(yVar.j());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final nf.b0 g0(y yVar) {
        return new nf.b0(yVar.j(), yVar.u0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int j0(of.a aVar) {
        switch (a.f54609a[aVar.ordinal()]) {
            case 1:
                return R.string.caption_error_network;
            case 2:
                return R.string.caption_error_server;
            case 3:
                return R.string.caption_error_storage;
            case 4:
                return R.string.caption_error_corrupt;
            case 5:
                return R.string.caption_error_incomplete;
            case 6:
                return R.string.caption_error_unknown;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fl.g0 k0(androidx.lifecycle.n0 n0Var, y yVar, qh.d dVar) {
        n0Var.q(Integer.valueOf(sh.b.p("image/gif", yVar.k1(), dVar.c(), 12)));
        return fl.g0.f38750a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fl.g0 l0(androidx.lifecycle.n0 n0Var, y yVar, Integer num) {
        List listK1 = yVar.k1();
        kotlin.jvm.internal.s.e(num);
        int iIntValue = num.intValue();
        Object objF = yVar.C.f();
        kotlin.jvm.internal.s.e(objF);
        n0Var.q(Integer.valueOf(sh.b.p(MimeTypes.VIDEO_MP4, listK1, iIntValue, ((Number) objF).intValue())));
        return fl.g0.f38750a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fl.g0 m0(androidx.lifecycle.n0 n0Var, y yVar, Integer num) {
        List listK1 = yVar.k1();
        Object objF = yVar.B.f();
        kotlin.jvm.internal.s.e(objF);
        int iIntValue = ((Number) objF).intValue();
        kotlin.jvm.internal.s.e(num);
        n0Var.q(Integer.valueOf(sh.b.p(MimeTypes.VIDEO_MP4, listK1, iIntValue, num.intValue())));
        return fl.g0.f38750a;
    }

    private final void n1() {
        com.google.android.exoplayer2.source.d dVar;
        wp.a.a("initializePlayer", new Object[0]);
        if (this.f54587e.f() == null) {
            this.f54587e.q(new com.google.android.exoplayer2.k.b(j()).e());
        }
        com.google.android.exoplayer2.k kVar = (com.google.android.exoplayer2.k) this.f54587e.f();
        if (kVar != null) {
            this.f54608z = new com.google.android.exoplayer2.source.d(true, new com.google.android.exoplayer2.source.p[0]);
            Iterator it = k1().iterator();
            while (true) {
                dVar = null;
                if (!it.hasNext()) {
                    break;
                }
                ClippingMediaSource clippingMediaSourceB0 = B0((ng.d) it.next());
                com.google.android.exoplayer2.source.d dVar2 = this.f54608z;
                if (dVar2 == null) {
                    kotlin.jvm.internal.s.w("concatenatingMediaSource");
                } else {
                    dVar = dVar2;
                }
                dVar.P(clippingMediaSourceB0);
            }
            com.google.android.exoplayer2.source.d dVar3 = this.f54608z;
            if (dVar3 == null) {
                kotlin.jvm.internal.s.w("concatenatingMediaSource");
            } else {
                dVar = dVar3;
            }
            kVar.n(dVar);
            kVar.setPlayWhenReady(false);
            kVar.E(this.P);
            kVar.a();
            Object objF = this.f54594l.f();
            Object objF2 = this.f54591i.f();
            if (objF == null || objF2 == null) {
                return;
            }
            kVar.seekTo(((Number) objF).intValue(), ((Number) Z0(k1(), ((Number) objF2).longValue()).i()).longValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final of.e u0() {
        return (of.e) this.U.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final nf.b0 x0() {
        return (nf.b0) this.V.getValue();
    }

    private final void x1() {
        em.k.d(q1.a(this), null, null, new j(null), 3, null);
    }

    public final hm.z A0() {
        return this.f54600r;
    }

    public final void B1() {
        com.google.android.exoplayer2.k kVar = (com.google.android.exoplayer2.k) this.f54587e.f();
        if (kVar != null) {
            ng.d dVarG1 = g1();
            long currentPosition = (kVar.getCurrentPosition() + dVarG1.z()) - dVarG1.x();
            y0 y0VarD = y0.d(dVarG1.b());
            kotlin.jvm.internal.s.g(y0VarD, "fromUri(...)");
            com.google.android.exoplayer2.source.z zVarE = new com.google.android.exoplayer2.source.z.b(this.A).a(y0VarD);
            kotlin.jvm.internal.s.g(zVarE, "createMediaSource(...)");
            long j10 = 1000;
            kVar.n(new ClippingMediaSource(zVarE, dVarG1.x() * j10, dVarG1.n() * j10));
            kVar.seekTo(currentPosition);
        }
    }

    public final hm.z C0() {
        return this.f54603u;
    }

    public final void C1() {
        com.google.android.exoplayer2.k kVar = (com.google.android.exoplayer2.k) this.f54587e.f();
        if (kVar != null) {
            kVar.setPlayWhenReady(false);
        }
        g2();
    }

    public final androidx.lifecycle.k0 D0() {
        return this.f54594l;
    }

    public final long E0() {
        com.google.android.exoplayer2.k kVar = (com.google.android.exoplayer2.k) this.f54587e.f();
        if (kVar != null) {
            return kVar.getCurrentPosition();
        }
        return 0L;
    }

    public final androidx.lifecycle.k0 G0() {
        return this.f54584a0;
    }

    public final List H0() {
        return this.I;
    }

    public final boolean I0() {
        return this.M;
    }

    public final void I1() {
        if (gl.r.F(this.H, new Function1() { // from class: uh.w
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(y.J1((qh.j) obj));
            }
        })) {
            this.M = true;
        }
        this.Q = gl.r.l();
        androidx.lifecycle.p0 p0Var = this.f54591i;
        p0Var.q(p0Var.f());
    }

    public final androidx.lifecycle.n0 J0() {
        return this.G;
    }

    public final androidx.lifecycle.n0 K0() {
        return this.F;
    }

    public final void K1(qh.a item) {
        kotlin.jvm.internal.s.h(item, "item");
        this.J.remove(item);
        if (this.J.isEmpty()) {
            this.K = 1.0f;
        }
    }

    /* JADX WARN: Code duplicated, block: B:65:0x0352  */
    /* JADX WARN: Code duplicated, block: B:84:0x03a1  */
    public final fl.v L0(lg.a preferenceManager, boolean z10, int i10) {
        int iO;
        long j10;
        int i11;
        String str;
        y yVar;
        int i12;
        float f10;
        String string;
        y yVar2;
        int iIntValue;
        Object obj;
        String absolutePath;
        File file;
        String str2;
        y yVar3;
        int i13;
        int i14;
        String str3;
        float f11;
        y yVar4;
        int i15;
        float f12;
        float f13;
        float fA;
        y yVar5 = this;
        kotlin.jvm.internal.s.h(preferenceManager, "preferenceManager");
        boolean zC = kotlin.jvm.internal.s.c(yVar5.E.f(), "GIF");
        Bundle bundle = new Bundle();
        bundle.putBoolean("gif", zC);
        AzRecorderApp azRecorderApp = (AzRecorderApp) yVar5.j();
        File[] fileArrListFiles = azRecorderApp.getCacheDir().listFiles(new FileFilter() { // from class: uh.v
            @Override // java.io.FileFilter
            public final boolean accept(File file2) {
                return y.M0(file2);
            }
        });
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                file2.delete();
            }
            fl.g0 g0Var = fl.g0.f38750a;
        }
        long jJ1 = yVar5.j1();
        int size = yVar5.k1().size();
        int size2 = yVar5.J.size();
        bundle.putInt("size", size);
        bundle.putInt(MimeTypes.BASE_TYPE_AUDIO, size2);
        Object objF = yVar5.B.f();
        kotlin.jvm.internal.s.e(objF);
        int iIntValue2 = ((Number) objF).intValue();
        float fK = yVar5.q0().k() / yVar5.q0().g();
        if (Float.isNaN(fK) || fK <= 0.0f) {
            iO = iIntValue2;
        } else if (yVar5.q0().k() <= yVar5.q0().g()) {
            iO = sh.b.o(vl.a.b(iIntValue2 / fK));
        } else {
            iO = iIntValue2;
            iIntValue2 = sh.b.o(vl.a.b(iIntValue2 * fK));
        }
        String str4 = zC ? nh.e.f(azRecorderApp, preferenceManager) + File.separator + nh.e.d(null) + ".gif" : nh.e.l(azRecorderApp, preferenceManager) + File.separator + nh.e.d("_edited") + ".mp4";
        StringBuilder sb2 = new StringBuilder();
        sb2.append(" -y");
        Iterator it = yVar5.k1().iterator();
        float f14 = 0.0f;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        while (true) {
            Iterator it2 = it;
            j10 = jJ1;
            str4 = str4;
            size = size;
            if (!it.hasNext()) {
                break;
            }
            ng.d dVar = (ng.d) it2.next();
            kotlin.jvm.internal.o0 o0Var = kotlin.jvm.internal.o0.f43602a;
            Locale locale = Locale.US;
            iIntValue2 = iIntValue2;
            boolean z17 = z14;
            String str5 = String.format(locale, "%.3f", Arrays.copyOf(new Object[]{Double.valueOf(dVar.z() / 1000.0d)}, 1));
            kotlin.jvm.internal.s.g(str5, "format(...)");
            iO = iO;
            String str6 = String.format(locale, "%.3f", Arrays.copyOf(new Object[]{Double.valueOf(dVar.y() / 1000.0d)}, 1));
            kotlin.jvm.internal.s.g(str6, "format(...)");
            sb2.append(" -ss " + str5 + " -to " + str6 + "  -i ");
            StringBuilder sb3 = new StringBuilder();
            sb3.append('\"');
            sb3.append(dVar.t());
            sb3.append('\"');
            sb2.append(sb3.toString());
            if (dVar.z() > 0 || dVar.y() < dVar.n()) {
                z12 = true;
            }
            if (dVar.z() != dVar.x()) {
                z15 = true;
            }
            if (dVar.i() != null) {
                z11 = true;
            }
            if (dVar.u() != 0) {
                z13 = true;
            }
            z14 = dVar.f() != null ? true : z17;
            it = it2;
            jJ1 = j10;
            if (!dVar.o()) {
                z16 = true;
            }
        }
        int i16 = iIntValue2;
        int i17 = iO;
        bundle.putBoolean("trim", z12);
        bundle.putBoolean("cut_mid", z15);
        bundle.putBoolean("crop", z11);
        bundle.putInt("sticker", yVar5.I.size());
        bundle.putInt("text", yVar5.H.size());
        bundle.putBoolean("rotate", z13);
        bundle.putBoolean("background", z14);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(yVar5.q0().k());
        sb4.append(':');
        sb4.append(yVar5.q0().g());
        bundle.putString("ratio", sb4.toString());
        bundle.putFloat("speed", yVar5.L);
        if (z16) {
            sb2.append(" -f lavfi -t 0.1 -i anullsrc ");
            i11 = size + 1;
        } else {
            i11 = size;
        }
        Iterator it3 = yVar5.J.iterator();
        while (it3.hasNext()) {
            qh.a aVar = (qh.a) it3.next();
            kotlin.jvm.internal.o0 o0Var2 = kotlin.jvm.internal.o0.f43602a;
            Locale locale2 = Locale.US;
            Iterator it4 = it3;
            String str7 = String.format(locale2, "%.3f", Arrays.copyOf(new Object[]{Double.valueOf(aVar.k() / 1000.0d)}, 1));
            kotlin.jvm.internal.s.g(str7, "format(...)");
            String str8 = String.format(locale2, "%.3f", Arrays.copyOf(new Object[]{Double.valueOf(aVar.j() / 1000.0d)}, 1));
            kotlin.jvm.internal.s.g(str8, "format(...)");
            sb2.append(" -ss " + str7 + " -to " + str8 + ' ');
            StringBuilder sb5 = new StringBuilder();
            sb5.append(" -i \"");
            sb5.append(aVar.i());
            sb5.append('\"');
            sb2.append(sb5.toString());
            it3 = it4;
        }
        int i18 = 0;
        for (ng.d dVar2 : yVar5.k1()) {
            if (dVar2.f() == null) {
                RectF rectFI = dVar2.i();
                if (rectFI != null) {
                    float fP = (rectFI.bottom - rectFI.top) * dVar2.p();
                    if (fP == f14) {
                        fA = 1.0f;
                    } else {
                        fA = ((rectFI.right - rectFI.left) * dVar2.A()) / fP;
                    }
                } else if (dVar2.p() != 0) {
                    fA = dVar2.A() / dVar2.p();
                } else {
                    fA = 1.0f;
                }
                if (Float.isNaN(fK) || fK <= f14 || Float.isNaN(fA) || fA <= f14) {
                    Object objF2 = yVar5.f54584a0.f();
                    kotlin.jvm.internal.s.e(objF2);
                    float f15 = f14;
                    dVar2.B(new qh.b((String) objF2, f15, f15, 1.0f));
                } else {
                    float f16 = 100;
                    if (vl.a.b(fK * f16) != vl.a.b(fA * f16) || dVar2.u() == 90 || dVar2.u() == -90) {
                        Object objF3 = yVar5.f54584a0.f();
                        kotlin.jvm.internal.s.e(objF3);
                        float f17 = f14;
                        dVar2.B(new qh.b((String) objF3, f17, f17, 1.0f));
                    }
                }
            }
            qh.b bVarF = dVar2.f();
            if (bVarF != null) {
                sb2.append(" -i \"" + bVarF.a() + '\"');
                i18++;
            }
            f14 = 0.0f;
        }
        for (qh.c cVar : yVar5.I) {
            sb2.append(" -i \"" + cVar.p() + '\"');
            sh.b.e(cVar, (float) i16, (float) i17);
        }
        int i19 = i17;
        Iterator it5 = yVar5.H.iterator();
        while (it5.hasNext()) {
            sh.b.e((qh.j) it5.next(), i16, i19);
        }
        float[] fArr = new float[9];
        List list = yVar5.H;
        ArrayList arrayList = new ArrayList(gl.r.v(list, 10));
        int i20 = 0;
        for (Object obj2 : list) {
            int i21 = i20 + 1;
            if (i20 < 0) {
                gl.r.u();
            }
            qh.j jVar = (qh.j) obj2;
            arrayList.add(yVar5.P1(azRecorderApp, jVar, i20, ((Number) yVar5.a1(jVar, fArr).i()).floatValue()));
            i20 = i21;
        }
        int size3 = arrayList.size();
        int i22 = 0;
        while (i22 < size3) {
            Object obj3 = arrayList.get(i22);
            i22++;
            sb2.append(" -i \"" + ((File) obj3).getAbsolutePath() + '\"');
        }
        sb2.append(" -filter_complex \"");
        int i23 = i11 + size2;
        Iterator it6 = yVar5.k1().iterator();
        int i24 = i23;
        int i25 = 0;
        while (true) {
            String str9 = "";
            if (!it6.hasNext()) {
                break;
            }
            int i26 = i25 + 1;
            ng.d dVar3 = (ng.d) it6.next();
            String str10 = yVar5.L == 1.0f ? "" : ",setpts=1/" + yVar5.L + "*PTS";
            float fA2 = dVar3.A();
            int i27 = i11;
            float fP2 = dVar3.p();
            RectF rectFI2 = dVar3.i();
            if (rectFI2 != null) {
                float f18 = rectFI2.left;
                float f19 = fA2 * f18;
                float f20 = rectFI2.top;
                float f21 = fP2 * f20;
                float f22 = (rectFI2.right - f18) * fA2;
                f11 = (rectFI2.bottom - f20) * fP2;
                str3 = "crop=" + f22 + ':' + f11 + ':' + f19 + ':' + f21 + ',';
                fl.g0 g0Var2 = fl.g0.f38750a;
                fA2 = f22;
            } else {
                str3 = "";
                f11 = fP2;
            }
            if (dVar3.u() != -90 && dVar3.u() != 90) {
                float f23 = fA2;
                fA2 = f11;
                f11 = f23;
            }
            int iU = dVar3.u();
            if (iU == -180) {
                str9 = ",transpose=2,transpose=2";
            } else if (iU == -90) {
                str9 = ",transpose=1";
            } else if (iU == 90) {
                str9 = ",transpose=2";
            }
            String str11 = str9;
            qh.b bVarF2 = dVar3.f();
            float f24 = f11;
            if (bVarF2 != null) {
                float f25 = fA2;
                sb2.append('[' + i24 + "]setpts=PTS-STARTPTS,");
                if (i16 <= i19) {
                    sb2.append("crop=ih*" + i16 + '/' + i19 + ":ih,");
                } else {
                    sb2.append("crop=iw:iw*" + i19 + '/' + i16 + ',');
                }
                sb2.append("scale=" + i16 + ':' + i19 + "[bg];");
                int i28 = i24 + 1;
                float f26 = f24 / f25;
                if (fK > f26) {
                    f13 = i19;
                    f12 = f26 * f13;
                } else {
                    float f27 = i16;
                    float f28 = f27 / f26;
                    f12 = f27;
                    f13 = f28;
                }
                float f29 = f13;
                float f30 = i16;
                float fB = bVarF2.b() * f30;
                float f31 = i19;
                float fC = bVarF2.c() * f31;
                float fE = bVarF2.e();
                float f32 = f12 * fE;
                int i29 = (int) (fB + ((f30 - f32) / 2.0f));
                float f33 = fE * f29;
                int i30 = (int) (fC + ((f31 - f33) / 2.0f));
                kotlin.jvm.internal.i0 i0Var = new kotlin.jvm.internal.i0();
                i0Var.f43593a = sh.b.o(vl.a.b(f32));
                int iO2 = sh.b.o(vl.a.b(f33));
                int i31 = i19;
                if (dVar3.u() == -90 || dVar3.u() == 90) {
                    int i32 = i0Var.f43593a;
                    i0Var.f43593a = iO2;
                    iO2 = i32;
                }
                sb2.append('[' + i25 + ":v:0]setpts=PTS-STARTPTS," + str3 + "scale=" + i0Var.f43593a + ':' + iO2 + str11 + str10 + "[vs" + i25 + "];");
                StringBuilder sb6 = new StringBuilder();
                sb6.append("[bg][vs");
                sb6.append(i25);
                sb6.append("]overlay=");
                sb6.append(i29);
                sb6.append(':');
                sb6.append(i30);
                sb6.append(",setsar=1/1[v");
                sb6.append(i25);
                sb6.append("];");
                sb2.append(sb6.toString());
                i19 = i31;
                i24 = i28;
            } else {
                StringBuilder sb7 = new StringBuilder();
                sb7.append('[');
                sb7.append(i25);
                sb7.append(":v:0]");
                sb7.append(str3);
                sb7.append(" scale=");
                sb7.append(i16);
                sb7.append(':');
                i19 = i19;
                sb7.append(i19);
                sb7.append(str11);
                sb7.append(str10);
                sb7.append(",setsar=1/1[v");
                sb7.append(i25);
                sb7.append("];");
                sb2.append(sb7.toString());
            }
            if (zC) {
                yVar4 = this;
            } else {
                if (dVar3.o()) {
                    StringBuilder sb8 = new StringBuilder();
                    sb8.append('[');
                    sb8.append(i25);
                    sb8.append(":a:0]atempo=");
                    yVar4 = this;
                    sb8.append(yVar4.L);
                    sb8.append(",volume=");
                    sb8.append(yVar4.K);
                    sb8.append("[a");
                    sb8.append(i25);
                    sb8.append("];");
                    sb2.append(sb8.toString());
                } else {
                    yVar4 = this;
                    StringBuilder sb9 = new StringBuilder();
                    sb9.append('[');
                    i15 = size;
                    sb9.append(i15);
                    sb9.append(":a]volume=0[a");
                    sb9.append(i25);
                    sb9.append("];");
                    sb2.append(sb9.toString());
                }
                yVar5 = yVar4;
                size = i15;
                it6 = it6;
                i11 = i27;
                azRecorderApp = azRecorderApp;
                i18 = i18;
                i25 = i26;
                bundle = bundle;
                i23 = i23;
            }
            i15 = size;
            yVar5 = yVar4;
            size = i15;
            it6 = it6;
            i11 = i27;
            azRecorderApp = azRecorderApp;
            i18 = i18;
            i25 = i26;
            bundle = bundle;
            i23 = i23;
        }
        y yVar6 = yVar5;
        int i33 = i11;
        Bundle bundle2 = bundle;
        AzRecorderApp azRecorderApp2 = azRecorderApp;
        int i34 = i18;
        int i35 = i23;
        int i36 = size;
        int size4 = yVar6.k1().size();
        for (int i37 = 0; i37 < size4; i37++) {
            sb2.append(" [v" + i37 + "] ");
            if (!zC) {
                sb2.append("[a" + i37 + "] ");
            }
        }
        if (zC) {
            sb2.append("concat=n=" + i36 + ":v=1[conv]");
        } else {
            sb2.append("concat=n=" + i36 + ":v=1:a=1[conv][cona]");
        }
        String str12 = ";[";
        if (size2 <= 0 || zC) {
            str = ";[";
            yVar = yVar6;
            i12 = 0;
            f10 = 1000.0f;
        } else {
            Iterator it7 = yVar6.J.iterator();
            int i38 = 0;
            int i39 = 0;
            while (it7.hasNext()) {
                int i40 = i39 + 1;
                qh.a aVar2 = (qh.a) it7.next();
                int i41 = i33 + i39;
                long jC = aVar2.c();
                float fB2 = aVar2.b() / 1000.0f;
                if (jC + aVar2.b() > j10) {
                    fB2 = (j10 - jC) / 1000.0f;
                }
                String str13 = yVar6.L == 1.0f ? "" : ",atempo=" + yVar6.L;
                float f34 = yVar6.L;
                if (f34 != 1.0f) {
                    jC = (long) (jC / f34);
                }
                StringBuilder sb10 = new StringBuilder();
                sb10.append(str12);
                sb10.append(i41);
                Iterator it8 = it7;
                sb10.append("]volume=");
                sb10.append(aVar2.m());
                sb10.append(',');
                sb2.append(sb10.toString());
                if (aVar2.g()) {
                    long j11 = aVar2.j() - aVar2.k();
                    long jB = aVar2.b() / j11;
                    String str14 = str12;
                    long j12 = jB - 1;
                    i13 = i40;
                    int i42 = i38;
                    float fB3 = (aVar2.b() % j11) / 1000.0f;
                    wp.a.a("Loop number: " + j12 + ", extra duration: " + fB3 + " s", new Object[0]);
                    StringBuilder sb11 = new StringBuilder();
                    sb11.append("aresample=44100,aloop=");
                    sb11.append(j12);
                    sb11.append(":size=");
                    sb11.append((((long) 44100) * j11) / ((long) 1000));
                    sb2.append(sb11.toString());
                    sb2.append(str13 + ",adelay=" + jC + "[aa" + i42 + ']');
                    if (fB3 == 0.0f) {
                        yVar3 = this;
                        i14 = i42;
                        str2 = str14;
                    } else {
                        i14 = i42 + 1;
                        long jC2 = aVar2.c() + (jB * j11);
                        yVar3 = this;
                        float f35 = yVar3.L;
                        if (f35 != 1.0f) {
                            jC2 = (long) (jC2 / f35);
                        }
                        StringBuilder sb12 = new StringBuilder();
                        str2 = str14;
                        sb12.append(str2);
                        sb12.append(i41);
                        sb12.append("]atrim=end=");
                        sb12.append(fB3);
                        sb12.append(str13);
                        sb12.append(",adelay=");
                        sb12.append(jC2);
                        sb12.append("[aa");
                        sb12.append(i14);
                        sb12.append(']');
                        sb2.append(sb12.toString());
                    }
                    fl.g0 g0Var3 = fl.g0.f38750a;
                } else {
                    str2 = str12;
                    yVar3 = yVar6;
                    int i43 = i38;
                    i13 = i40;
                    sb2.append("atrim=end=" + fB2);
                    sb2.append(str13 + ",adelay=" + jC + "[aa" + i43 + ']');
                    i14 = i43;
                }
                i38 = i14 + 1;
                yVar6 = yVar3;
                str12 = str2;
                it7 = it8;
                i39 = i13;
            }
            str = str12;
            yVar = yVar6;
            int i44 = i38;
            i12 = 0;
            f10 = 1000.0f;
            sb2.append(";[cona]");
            for (int i45 = 0; i45 < i44; i45++) {
                sb2.append("[aa" + i45 + ']');
            }
            sb2.append("amix=" + (i44 + 1) + "[outa]");
        }
        float[] fArr2 = new float[9];
        int i46 = i35 + i34;
        Iterator it9 = yVar.I.iterator();
        int i47 = i46;
        int i48 = i12;
        while (it9.hasNext()) {
            qh.c cVar2 = (qh.c) it9.next();
            fl.v vVarA1 = yVar.a1(cVar2, fArr2);
            int i49 = i46;
            float fFloatValue = ((Number) vVarA1.i()).floatValue() * cVar2.q();
            Iterator it10 = it9;
            float fFloatValue2 = ((Number) vVarA1.j()).floatValue();
            PointF pointF = (PointF) vVarA1.k();
            float fC2 = cVar2.c() / f10;
            float fC3 = (cVar2.c() + cVar2.b()) / f10;
            StringBuilder sb13 = new StringBuilder();
            sb13.append(str);
            sb13.append(i47);
            int i50 = i47;
            sb13.append("]format=yuva444p,scale=iw*");
            sb13.append(fFloatValue);
            sb13.append(":ih*");
            sb13.append(fFloatValue);
            sb13.append(",setsar=1,rotate=");
            sb13.append(fFloatValue2);
            sb13.append(":c=none:ow=rotw(");
            sb13.append(fFloatValue2);
            sb13.append("):oh=roth(");
            sb13.append(fFloatValue2);
            sb13.append(")[sticker");
            sb13.append(i48);
            sb13.append(']');
            sb2.append(sb13.toString());
            if (i48 == 0) {
                sb2.append(";[conv]");
            } else {
                StringBuilder sb14 = new StringBuilder();
                sb14.append(";[sv");
                sb14.append(i48 - 1);
                sb14.append(']');
                sb2.append(sb14.toString());
            }
            sb2.append("[sticker" + i48 + "]overlay=" + pointF.x + ':' + pointF.y + ":enable='between(t," + fC2 + ',' + fC3 + ")'[sv" + i48 + ']');
            i47 = i50 + 1;
            i48++;
            it9 = it10;
            i46 = i49;
        }
        String str15 = ":enable='between(t,";
        int size5 = i46 + yVar.I.size();
        Iterator it11 = yVar.H.iterator();
        int i51 = 0;
        while (it11.hasNext()) {
            qh.j jVar2 = (qh.j) it11.next();
            fl.v vVarA2 = yVar.a1(jVar2, fArr2);
            ((Number) vVarA2.i()).floatValue();
            float[] fArr3 = fArr2;
            float fFloatValue3 = ((Number) vVarA2.j()).floatValue();
            Iterator it12 = it11;
            PointF pointF2 = (PointF) vVarA2.k();
            String str16 = str15;
            float fC4 = jVar2.c() / f10;
            float fC5 = (jVar2.c() + jVar2.b()) / f10;
            sb2.append(str + size5 + "]format=yuva444p,setsar=1,rotate=" + fFloatValue3 + ":c=none:ow=rotw(" + fFloatValue3 + "):oh=roth(" + fFloatValue3 + ")[txta" + i51 + ']');
            if (i48 == 0 && i51 == 0) {
                sb2.append(";[conv]");
            } else if (i51 == 0) {
                StringBuilder sb15 = new StringBuilder();
                sb15.append(";[sv");
                sb15.append(i48 - 1);
                sb15.append(']');
                sb2.append(sb15.toString());
            } else {
                StringBuilder sb16 = new StringBuilder();
                sb16.append(";[tv");
                sb16.append(i51 - 1);
                sb16.append(']');
                sb2.append(sb16.toString());
            }
            sb2.append("[txta" + i51 + "]overlay=" + pointF2.x + ':' + pointF2.y + str16 + fC4 + ',' + fC5 + ")'[tv" + i51 + ']');
            size5++;
            i51++;
            str15 = str16;
            it11 = it12;
            fArr2 = fArr3;
            yVar = this;
        }
        if (i48 == 0 && i51 == 0) {
            string = "conv";
        } else if (i51 == 0) {
            StringBuilder sb17 = new StringBuilder();
            sb17.append("sv");
            sb17.append(i48 - 1);
            string = sb17.toString();
        } else {
            StringBuilder sb18 = new StringBuilder();
            sb18.append("tv");
            sb18.append(i51 - 1);
            string = sb18.toString();
        }
        if (z10) {
            String string2 = azRecorderApp2.getString(R.string.az_recorder);
            kotlin.jvm.internal.s.g(string2, "getString(...)");
            float f36 = i16 / i10;
            float dimensionPixelSize = azRecorderApp2.getResources().getDimensionPixelSize(R.dimen.watermark_shadow_dx) * f36;
            float dimensionPixelSize2 = azRecorderApp2.getResources().getDimensionPixelSize(R.dimen.watermark_shadow_dy) * f36;
            float dimensionPixelSize3 = (azRecorderApp2.getResources().getDimensionPixelSize(R.dimen.watermark_margin_end) * f36) + dimensionPixelSize;
            float dimensionPixelSize4 = (azRecorderApp2.getResources().getDimensionPixelSize(R.dimen.watermark_margin_bottom) * f36) + dimensionPixelSize2;
            int iB = vl.a.b(azRecorderApp2.getResources().getDimensionPixelSize(R.dimen.watermark_text_size) * f36);
            String str17 = "/system/fonts/Roboto-Regular.ttf";
            List listO = gl.r.o("/system/fonts/Roboto-Regular.ttf", "/system/fonts/DroidSans.ttf", "/system/fonts/NotoSans-Regular.ttf");
            ArrayList arrayList2 = new ArrayList(gl.r.v(listO, 10));
            Iterator it13 = listO.iterator();
            while (it13.hasNext()) {
                arrayList2.add(new File((String) it13.next()));
            }
            int size6 = arrayList2.size();
            int i52 = 0;
            while (true) {
                if (i52 >= size6) {
                    obj = null;
                    break;
                }
                Object obj4 = arrayList2.get(i52);
                i52++;
                if (((File) obj4).exists()) {
                    obj = obj4;
                    break;
                }
            }
            File file3 = (File) obj;
            if (file3 != null) {
                File file4 = new File(azRecorderApp2.getCacheDir(), "cached_font_" + file3.getName());
                try {
                    if (file4.exists()) {
                        file = file4;
                    } else {
                        file = file4;
                        ql.f.n(file3, file, true, 0, 4, null);
                    }
                    absolutePath = file.getAbsolutePath();
                } catch (Exception unused) {
                    absolutePath = file3.getAbsolutePath();
                }
                str17 = absolutePath;
            }
            sb2.append(str + string + "]drawtext=fontfile=" + str17 + ":text=" + string2 + ":x=(w-text_w-" + dimensionPixelSize3 + "):y=(h-text_h-" + dimensionPixelSize4 + "):fontsize=" + iB + ":fontcolor=white:shadowcolor=black:shadowx=" + dimensionPixelSize + ":shadowy=" + dimensionPixelSize2 + '[' + string + ']');
        }
        if (zC) {
            sb2.append(str + string + "]split[_s0][_s1];[_s0]palettegen[_pal];[_s1][_pal]paletteuse[gifout]");
            sb2.append("\" -map \"[gifout]\"");
            yVar2 = this;
        } else {
            sb2.append("\" -map \"[" + string + "]\"");
            sb2.append(" -map ");
            yVar2 = this;
            if (yVar2.J.size() > 0) {
                sb2.append("\"[outa]\" ");
            } else {
                sb2.append("\"[cona]\" ");
            }
            sb2.append(" -c:v");
            sb2.append(" libx264 ");
            sb2.append("-force_key_frames 'expr:gte(t,n_forced*1)' ");
            sb2.append("-preset ultrafast ");
        }
        if (zC) {
            iIntValue = 12;
        } else {
            Object objF4 = yVar2.C.f();
            kotlin.jvm.internal.s.e(objF4);
            iIntValue = ((Number) objF4).intValue();
        }
        sb2.append(" -r " + iIntValue + ' ');
        sb2.append(str4);
        wp.a.a("Command: %s", sb2.toString());
        FirebaseAnalytics.getInstance(yVar2.j()).a("edit_actions", bundle2);
        return new fl.v(sb2.toString(), str4, Long.valueOf(vl.a.d(j10 / yVar2.L)));
    }

    public final void L1(long j10) {
        List list = this.Q;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((nf.m) obj).d() != j10) {
                arrayList.add(obj);
            }
        }
        this.Q = arrayList;
    }

    public final void M1(qh.c drawableItem) {
        kotlin.jvm.internal.s.h(drawableItem, "drawableItem");
        this.I.remove(drawableItem);
    }

    public final hm.z N0() {
        return this.f54607y;
    }

    public final void N1(qh.j textItem) {
        kotlin.jvm.internal.s.h(textItem, "textItem");
        this.H.remove(textItem);
    }

    public final hm.z O0() {
        return this.f54596n;
    }

    public final void O1(ng.d video) {
        int iIntValue;
        kotlin.jvm.internal.s.h(video, "video");
        int iIndexOf = k1().indexOf(video);
        k1().remove(video);
        com.google.android.exoplayer2.source.d dVar = this.f54608z;
        if (dVar == null) {
            kotlin.jvm.internal.s.w("concatenatingMediaSource");
            dVar = null;
        }
        dVar.k0(iIndexOf);
        Integer num = (Integer) this.f54594l.f();
        if (num == null || (iIntValue = num.intValue()) <= iIndexOf) {
            return;
        }
        this.f54594l.q(Integer.valueOf(iIntValue - 1));
    }

    public final androidx.lifecycle.p0 P0() {
        return this.C;
    }

    public final androidx.lifecycle.p0 Q0() {
        return this.D;
    }

    public final void Q1(long j10, long j11, long j12, long j13) {
        com.google.android.exoplayer2.source.d dVar;
        this.M = true;
        Object objF = this.f54587e.f();
        Object objF2 = this.f54594l.f();
        if (objF == null || objF2 == null) {
            return;
        }
        int iIntValue = ((Number) objF2).intValue();
        com.google.android.exoplayer2.k kVar = (com.google.android.exoplayer2.k) objF;
        ng.d dVar2 = (ng.d) k1().get(iIntValue);
        ng.d dVarE = ng.d.e(dVar2, sh.b.l(), null, null, null, null, 0L, 0, 0, 0L, 0, 0L, 0L, 0L, 0L, 0.0f, null, 0, null, 0, false, 1048574, null);
        dVar2.I(j10);
        dVar2.K(j10);
        dVar2.E(j11);
        dVar2.J(j11);
        dVarE.I(j12);
        dVarE.K(j12);
        dVarE.E(j13);
        dVarE.J(j13);
        ClippingMediaSource clippingMediaSourceB0 = B0(dVar2);
        ClippingMediaSource clippingMediaSourceB1 = B0(dVarE);
        com.google.android.exoplayer2.source.d dVar3 = this.f54608z;
        if (dVar3 == null) {
            kotlin.jvm.internal.s.w("concatenatingMediaSource");
            dVar3 = null;
        }
        dVar3.k0(iIntValue);
        com.google.android.exoplayer2.source.d dVar4 = this.f54608z;
        if (dVar4 == null) {
            kotlin.jvm.internal.s.w("concatenatingMediaSource");
            dVar4 = null;
        }
        dVar4.O(iIntValue, clippingMediaSourceB0);
        com.google.android.exoplayer2.source.d dVar5 = this.f54608z;
        if (dVar5 == null) {
            kotlin.jvm.internal.s.w("concatenatingMediaSource");
            dVar5 = null;
        }
        int i10 = iIntValue + 1;
        dVar5.O(i10, clippingMediaSourceB1);
        wp.a.a("video 2: startTime %s, endTime %s, trimStartTime %s, trimEndTime %s", Long.valueOf(dVarE.x()), Long.valueOf(dVarE.n()), Long.valueOf(dVarE.z()), Long.valueOf(dVarE.y()));
        k1().add(i10, dVarE);
        long currentPosition = kVar.getCurrentPosition();
        com.google.android.exoplayer2.source.d dVar6 = this.f54608z;
        if (dVar6 == null) {
            kotlin.jvm.internal.s.w("concatenatingMediaSource");
            dVar = null;
        } else {
            dVar = dVar6;
        }
        kVar.n(dVar);
        if (currentPosition <= j11 - j10) {
            kVar.seekTo(iIntValue, currentPosition);
        } else {
            kVar.seekTo(i10, currentPosition - (j12 - j10));
            this.f54594l.q(Integer.valueOf(i10));
        }
    }

    public final hm.z R0() {
        return this.f54597o;
    }

    public final void R1(long j10, long j11) {
        this.M = true;
        Object objF = this.f54587e.f();
        Object objF2 = this.f54594l.f();
        if (objF == null || objF2 == null) {
            return;
        }
        int iIntValue = ((Number) objF2).intValue();
        com.google.android.exoplayer2.k kVar = (com.google.android.exoplayer2.k) objF;
        wp.a.a("Update trim info", new Object[0]);
        ng.d dVar = (ng.d) k1().get(iIntValue);
        dVar.K(j10);
        dVar.J(j11);
        long currentPosition = kVar.getCurrentPosition() - (dVar.z() - dVar.x());
        ClippingMediaSource clippingMediaSourceB0 = B0(dVar);
        com.google.android.exoplayer2.source.d dVar2 = this.f54608z;
        com.google.android.exoplayer2.source.d dVar3 = null;
        if (dVar2 == null) {
            kotlin.jvm.internal.s.w("concatenatingMediaSource");
            dVar2 = null;
        }
        dVar2.k0(iIntValue);
        com.google.android.exoplayer2.source.d dVar4 = this.f54608z;
        if (dVar4 == null) {
            kotlin.jvm.internal.s.w("concatenatingMediaSource");
            dVar4 = null;
        }
        dVar4.O(iIntValue, clippingMediaSourceB0);
        com.google.android.exoplayer2.source.d dVar5 = this.f54608z;
        if (dVar5 == null) {
            kotlin.jvm.internal.s.w("concatenatingMediaSource");
        } else {
            dVar3 = dVar5;
        }
        kVar.n(dVar3);
        kVar.seekTo(iIntValue, currentPosition);
    }

    public final float S0() {
        return this.K;
    }

    public final void S1(long j10, boolean z10) {
        this.N = z10;
        com.google.android.exoplayer2.k kVar = (com.google.android.exoplayer2.k) this.f54587e.f();
        if (kVar != null) {
            kVar.seekTo(j10);
        }
    }

    public final void T1(long j10) {
        long jJ1 = j1();
        if (j10 < 0) {
            j10 = 0;
        } else if (j10 > jJ1) {
            j10 = jJ1;
        }
        this.f54591i.q(Long.valueOf(j10));
        fl.q qVarZ0 = Z0(k1(), j10);
        com.google.android.exoplayer2.k kVar = (com.google.android.exoplayer2.k) this.f54587e.f();
        if (kVar != null) {
            kVar.seekTo(((Number) qVarZ0.h()).intValue(), ((Number) qVarZ0.i()).longValue());
        }
    }

    public final androidx.lifecycle.p0 U0() {
        return this.E;
    }

    public final void U1(ng.d video) {
        kotlin.jvm.internal.s.h(video, "video");
        com.google.android.exoplayer2.k kVar = (com.google.android.exoplayer2.k) this.f54587e.f();
        if (kVar != null) {
            kVar.setPlayWhenReady(false);
        }
        com.google.android.exoplayer2.k kVar2 = (com.google.android.exoplayer2.k) this.f54587e.f();
        if (kVar2 != null) {
            kVar2.seekTo(k1().indexOf(video), -1L);
        }
    }

    public final String V0() {
        return this.S;
    }

    public final void V1(qh.h hVar) {
        kotlin.jvm.internal.s.h(hVar, "<set-?>");
        this.f54595m = hVar;
    }

    public final qh.a W(ng.a audioItem) {
        kotlin.jvm.internal.s.h(audioItem, "audioItem");
        Object objF = this.f54591i.f();
        kotlin.jvm.internal.s.e(objF);
        qh.a aVar = new qh.a(null, audioItem.b(), audioItem.f(), audioItem.e(), ((Number) objF).longValue(), 0L, audioItem.c(), 0L, 0L, 0.0f, false, 1953, null);
        this.J.add(aVar);
        gl.r.x(this.J);
        int iIndexOf = this.J.indexOf(aVar);
        long jJ1 = j1();
        if (iIndexOf != this.J.size() - 1) {
            qh.a aVar2 = (qh.a) this.J.get(iIndexOf + 1);
            if (aVar.c() + aVar.b() >= aVar2.c()) {
                aVar.e((aVar2.c() - aVar.c()) - 1);
            }
        } else if (aVar.c() + aVar.b() > jJ1) {
            aVar.e(jJ1 - aVar.c());
            return aVar;
        }
        return aVar;
    }

    public final androidx.lifecycle.k0 W0() {
        return this.f54587e;
    }

    public final void W1(List list) {
        kotlin.jvm.internal.s.h(list, "<set-?>");
        this.Q = list;
    }

    public final void X(List captions) {
        kotlin.jvm.internal.s.h(captions, "captions");
        gl.r.F(this.H, new Function1() { // from class: uh.u
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(y.Y((qh.j) obj));
            }
        });
        this.H.addAll(captions);
        gl.r.x(this.H);
        this.M = true;
        androidx.lifecycle.p0 p0Var = this.f54591i;
        p0Var.q(p0Var.f());
    }

    public final androidx.lifecycle.k0 X0() {
        return this.f54591i;
    }

    public final void X1(nf.w wVar) {
        kotlin.jvm.internal.s.h(wVar, "<set-?>");
        this.R = wVar;
    }

    public final androidx.lifecycle.k0 Y0() {
        return this.f54592j;
    }

    public final void Y1(boolean z10) {
        this.T = z10;
    }

    public final qh.c Z(ng.b imageItem, boolean z10) {
        boolean z11;
        kotlin.jvm.internal.s.h(imageItem, "imageItem");
        Object objF = this.f54591i.f();
        kotlin.jvm.internal.s.e(objF);
        long jLongValue = ((Number) objF).longValue();
        kotlin.jvm.internal.k0 k0Var = new kotlin.jvm.internal.k0();
        Iterator it = this.I.iterator();
        while (true) {
            if (!it.hasNext()) {
                z11 = z10;
                break;
            }
            qh.c cVar = (qh.c) it.next();
            if (cVar.c() <= jLongValue && jLongValue <= cVar.c() + cVar.b()) {
                k0Var.f43597a = cVar;
                cVar.w(imageItem.e());
                cVar.x(imageItem.b());
                cVar.u(imageItem.f());
                z11 = z10;
                cVar.t(z11);
                cVar.l(null);
                break;
            }
        }
        if (k0Var.f43597a == null) {
            String strE = imageItem.e();
            Uri uriB = imageItem.b();
            String strF = imageItem.f();
            Object objF2 = this.f54591i.f();
            kotlin.jvm.internal.s.e(objF2);
            qh.c cVar2 = new qh.c(null, strE, uriB, strF, z11, null, 0, 0, 0.0f, 0.0f, 0.0f, ((Number) objF2).longValue(), 2000L, 449, null);
            k0Var.f43597a = cVar2;
            this.I.add(cVar2);
            gl.r.x(this.I);
        }
        em.k.d(q1.a(this), null, null, new b(k0Var, null), 3, null);
        return (qh.c) k0Var.f43597a;
    }

    public final void Z1(boolean z10) {
        this.M = z10;
    }

    public final void a0(qh.j textItem) {
        kotlin.jvm.internal.s.h(textItem, "textItem");
        this.H.add(textItem);
        gl.r.x(this.H);
    }

    public final void a2(List initialVideoList) {
        kotlin.jvm.internal.s.h(initialVideoList, "initialVideoList");
        this.f54590h = initialVideoList;
        ng.d dVar = (ng.d) k1().get(0);
        this.B.q(Integer.valueOf(dVar.A() <= dVar.p() ? dVar.A() : dVar.p()));
        androidx.lifecycle.p0 p0Var = this.E;
        kotlin.jvm.internal.o0 o0Var = kotlin.jvm.internal.o0.f43602a;
        Object objF = this.B.f();
        kotlin.jvm.internal.s.e(objF);
        String str = String.format("%sp", Arrays.copyOf(new Object[]{objF}, 1));
        kotlin.jvm.internal.s.g(str, "format(...)");
        p0Var.q(str);
        V1(T0());
        v0.f4510i.a().getLifecycle().a(this);
    }

    public final void b0(List newVideos) {
        kotlin.jvm.internal.s.h(newVideos, "newVideos");
        ArrayList arrayList = new ArrayList();
        Iterator it = newVideos.iterator();
        while (it.hasNext()) {
            arrayList.add(B0((ng.d) it.next()));
        }
        com.google.android.exoplayer2.source.d dVar = this.f54608z;
        if (dVar == null) {
            kotlin.jvm.internal.s.w("concatenatingMediaSource");
            dVar = null;
        }
        dVar.R(arrayList);
        k1().addAll(newVideos);
        this.M = true;
    }

    public final hm.z b1() {
        return this.f54602t;
    }

    public final void b2(String str) {
        this.S = str;
    }

    public final void c0() {
        z1 z1Var = this.X;
        if (z1Var != null && z1Var.isActive()) {
            AzRecorderApp azRecorderApp = (AzRecorderApp) j();
            nf.u uVar = (nf.u) this.W.f();
            if ((uVar instanceof nf.u.b) || kotlin.jvm.internal.s.c(uVar, nf.u.e.f47642a)) {
                nf.l.f47604a.p(azRecorderApp, this.Y);
            } else {
                nf.l.f47604a.C(azRecorderApp, this.Y);
            }
        }
        z1 z1Var2 = this.X;
        if (z1Var2 != null) {
            z1.c0(z1Var2, null, 1, null);
        }
        this.X = null;
        this.W.q(nf.u.d.f47641a);
    }

    public final hm.z c1() {
        return this.f54605w;
    }

    public final void c2(boolean z10) {
        com.google.android.exoplayer2.k kVar = (com.google.android.exoplayer2.k) W0().f();
        if (kVar != null) {
            wp.a.a("Set play one media item: %s", Boolean.valueOf(z10));
            kVar.u(z10);
            kVar.setRepeatMode(z10 ? 1 : 0);
        }
    }

    public final void d0(ng.d video) {
        kotlin.jvm.internal.s.h(video, "video");
        Object objF = this.f54587e.f();
        Object objF2 = this.f54594l.f();
        if (objF == null || objF2 == null) {
            return;
        }
        int iIntValue = ((Number) objF2).intValue();
        com.google.android.exoplayer2.k kVar = (com.google.android.exoplayer2.k) objF;
        long currentPosition = kVar.getCurrentPosition() - (video.z() - video.x());
        com.google.android.exoplayer2.source.d dVar = this.f54608z;
        if (dVar == null) {
            kotlin.jvm.internal.s.w("concatenatingMediaSource");
            dVar = null;
        }
        kVar.n(dVar);
        kVar.seekTo(iIntValue, currentPosition);
    }

    public final androidx.lifecycle.p0 d1() {
        return this.B;
    }

    public final void d2(float f10) {
        this.L = f10;
    }

    public final hm.z e1() {
        return this.f54606x;
    }

    public final void e2(String lang) {
        kotlin.jvm.internal.s.h(lang, "lang");
        ng.d dVar = (ng.d) gl.r.d0(k1());
        this.Y = lang;
        AzRecorderApp azRecorderApp = (AzRecorderApp) j();
        if (dVar == null) {
            nf.l.f47604a.E(azRecorderApp, lang, nf.p.NO_AUDIO);
            this.W.q(new nf.u.c(R.string.caption_error_no_audio_track));
            return;
        }
        z1 z1Var = this.X;
        if (z1Var != null) {
            z1.c0(z1Var, null, 1, null);
        }
        this.W.q(nf.u.d.f47641a);
        nf.l.f47604a.G(azRecorderApp, lang);
        this.X = em.k.d(q1.a(this), null, null, new q(azRecorderApp, lang, this, dVar, null), 3, null);
    }

    public final hm.z f1() {
        return this.f54599q;
    }

    public final void f2() {
        com.google.android.exoplayer2.k kVar = (com.google.android.exoplayer2.k) this.f54587e.f();
        if (kVar != null) {
            kVar.setPlayWhenReady(true);
        }
    }

    @Override // androidx.lifecycle.p1
    protected void g() {
        super.g();
        H1();
        G1();
        v0.f4510i.a().getLifecycle().d(this);
    }

    public final ng.d g1() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("_currentMediaIndex.value!!: ");
        Object objF = this.f54594l.f();
        kotlin.jvm.internal.s.e(objF);
        sb2.append(((Number) objF).intValue());
        wp.a.a(sb2.toString(), new Object[0]);
        List listK1 = k1();
        Object objF2 = this.f54594l.f();
        kotlin.jvm.internal.s.e(objF2);
        return (ng.d) listK1.get(((Number) objF2).intValue());
    }

    public final void g2() {
        this.f54589g = null;
        com.google.android.exoplayer2.k kVar = this.f54588f;
        if (kVar != null) {
            kVar.setPlayWhenReady(false);
        }
    }

    @Override // androidx.lifecycle.j
    public void h(androidx.lifecycle.b0 owner) {
        kotlin.jvm.internal.s.h(owner, "owner");
        super.h(owner);
        wp.a.a("onResume ViewModel", new Object[0]);
        if (ob.r0.f48425a <= 23 || this.f54587e.f() == null) {
            n1();
        }
    }

    public final void h0() {
        ng.d dVarG1 = g1();
        dVarG1.G(dVarG1.u() != -180 ? dVarG1.u() - 90 : 90);
        Object objF = this.f54594l.f();
        kotlin.jvm.internal.s.e(objF);
        if (((Number) objF).intValue() == 0 && q0().l()) {
            qh.h hVarQ0 = q0();
            int iG = q0().g();
            q0().m(q0().k());
            hVarQ0.n(iG);
        }
        x1();
    }

    public final float h1() {
        return this.L;
    }

    public final void h2() {
        if (!o1() || rh.a.a().contains(q0())) {
            return;
        }
        V1(T0());
    }

    @Override // androidx.lifecycle.j
    public void i(androidx.lifecycle.b0 owner) {
        kotlin.jvm.internal.s.h(owner, "owner");
        super.i(owner);
        wp.a.a("onPause ViewModel", new Object[0]);
        if (ob.r0.f48425a <= 23) {
            H1();
        }
    }

    public final void i0(boolean z10) {
        if (z10) {
            com.google.android.exoplayer2.k kVar = (com.google.android.exoplayer2.k) this.f54587e.f();
            if (kVar != null) {
                kVar.v(o9.j0.f48293d);
                return;
            }
            return;
        }
        com.google.android.exoplayer2.k kVar2 = (com.google.android.exoplayer2.k) this.f54587e.f();
        if (kVar2 != null) {
            kVar2.v(o9.j0.f48292c);
        }
    }

    public final List i1() {
        return this.H;
    }

    public final void i2(float f10) {
        this.K = f10;
        com.google.android.exoplayer2.k kVar = (com.google.android.exoplayer2.k) this.f54587e.f();
        if (kVar != null) {
            kVar.setVolume(this.K);
        }
    }

    public final long j1() {
        return sh.b.x(k1());
    }

    public final List k1() {
        List list = this.f54590h;
        if (list != null) {
            return list;
        }
        kotlin.jvm.internal.s.w("videoList");
        return null;
    }

    public final String l1() {
        return nh.l0.f47742a.d(j1());
    }

    public final boolean m1() {
        List list = this.H;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((qh.j) it.next()).x()) {
                return true;
            }
        }
        return false;
    }

    public final androidx.lifecycle.p0 n0() {
        return this.O;
    }

    public final hm.z o0() {
        return this.f54601s;
    }

    public final boolean o1() {
        Object objF = this.f54594l.f();
        kotlin.jvm.internal.s.e(objF);
        return ((Number) objF).intValue() == 0;
    }

    @Override // androidx.lifecycle.j
    public void onStart(androidx.lifecycle.b0 owner) {
        kotlin.jvm.internal.s.h(owner, "owner");
        super.onStart(owner);
        wp.a.a("onStart ViewModel", new Object[0]);
        if (ob.r0.f48425a > 23) {
            n1();
        }
    }

    @Override // androidx.lifecycle.j
    public void onStop(androidx.lifecycle.b0 owner) {
        kotlin.jvm.internal.s.h(owner, "owner");
        super.onStop(owner);
        wp.a.a("onStop ViewModel", new Object[0]);
        if (ob.r0.f48425a > 23) {
            H1();
        }
    }

    public final List p0() {
        return this.J;
    }

    public final androidx.lifecycle.k0 p1() {
        return this.f54593k;
    }

    public final qh.h q0() {
        qh.h hVar = this.f54595m;
        if (hVar != null) {
            return hVar;
        }
        kotlin.jvm.internal.s.w("backgroundRatio");
        return null;
    }

    public final androidx.lifecycle.p0 q1() {
        return this.f54585c;
    }

    public final List r0() {
        return gl.r.s0(gl.r.e(T0()), rh.a.a());
    }

    public final void r1(int i10) {
        em.k.d(q1.a(this), null, null, new d(i10, null), 3, null);
    }

    public final hm.z s0() {
        return this.f54604v;
    }

    public final void s1() {
        C1();
        em.k.d(q1.a(this), null, null, new e(null), 3, null);
    }

    public final List t0() {
        return this.Q;
    }

    public final void t1(String path) {
        kotlin.jvm.internal.s.h(path, "path");
        em.k.d(q1.a(this), null, null, new f(path, null), 3, null);
    }

    public final void u1() {
        em.k.d(q1.a(this), null, null, new g(null), 3, null);
    }

    public final nf.w v0() {
        return this.R;
    }

    public final void v1() {
        C1();
        em.k.d(q1.a(this), null, null, new h(null), 3, null);
    }

    public final androidx.lifecycle.k0 w0() {
        return this.W;
    }

    public final void w1(String id2) {
        kotlin.jvm.internal.s.h(id2, "id");
        em.k.d(q1.a(this), null, null, new i(id2, null), 3, null);
    }

    public final boolean y0() {
        return this.T;
    }

    public final void y1(String str) {
        em.k.d(q1.a(this), null, null, new k(str, null), 3, null);
    }

    public final hm.z z0() {
        return this.f54598p;
    }

    public final void z1(qh.h ratioItem) {
        kotlin.jvm.internal.s.h(ratioItem, "ratioItem");
        em.k.d(q1.a(this), null, null, new l(ratioItem, null), 3, null);
    }
}
