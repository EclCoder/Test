package jh;

import android.content.Intent;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.k0;
import androidx.lifecycle.l0;
import androidx.lifecycle.p0;
import androidx.lifecycle.q1;
import bg.q;
import bg.u;
import bg.w;
import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.googleapis.json.GoogleJsonError;
import com.google.api.client.googleapis.json.GoogleJsonResponseException;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.client.util.DateTime;
import com.google.api.services.youtube.YouTube;
import com.google.api.services.youtube.model.CdnSettings;
import com.google.api.services.youtube.model.LiveBroadcast;
import com.google.api.services.youtube.model.LiveBroadcastContentDetails;
import com.google.api.services.youtube.model.LiveBroadcastSnippet;
import com.google.api.services.youtube.model.LiveBroadcastStatus;
import com.google.api.services.youtube.model.LiveStream;
import com.google.api.services.youtube.model.LiveStreamSnippet;
import com.hecorat.screenrecorder.free.AzRecorderApp;
import com.hecorat.screenrecorder.free.R;
import com.hecorat.screenrecorder.free.models.EncodeParam;
import em.o0;
import fl.g0;
import fl.s;
import gl.r;
import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import net.openid.appauth.AuthorizationException;
import nh.j0;
import nh.p;
import vl.Rlkc.CIdIVqKnNZ;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public final class j extends fh.j {
    public static final b F = new b(null);
    private final k0 A;
    private final k0 B;
    private final k0 C;
    private net.openid.appauth.c D;
    private final net.openid.appauth.f E;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final bg.a f42473i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final bg.m f42474j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final bg.e f42475k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final bg.k f42476l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final bg.i f42477m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final q f42478n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final w f42479o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final u f42480p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final bg.g f42481q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final em.k0 f42482r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final dg.a f42483s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final rf.d f42484t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private p0 f42485u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private String f42486v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private String f42487w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final String[] f42488x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private String f42489y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final p0 f42490z;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    static final class a extends kotlin.coroutines.jvm.internal.m implements tl.o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f42491r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f42492s;

        /* JADX INFO: renamed from: jh.j$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        static final class C0643a extends kotlin.coroutines.jvm.internal.m implements tl.o {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            Object f42494r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            int f42495s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ String f42496t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            final /* synthetic */ j f42497u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            final /* synthetic */ AuthorizationException f42498v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0643a(String str, j jVar, AuthorizationException authorizationException, kl.f fVar) {
                super(2, fVar);
                this.f42496t = str;
                this.f42497u = jVar;
                this.f42498v = authorizationException;
            }

            @Override // tl.o
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(o0 o0Var, kl.f fVar) {
                return ((C0643a) create(o0Var, fVar)).invokeSuspend(g0.f38750a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kl.f create(Object obj, kl.f fVar) {
                return new C0643a(this.f42496t, this.f42497u, this.f42498v, fVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                p0 p0Var;
                Object objF = ll.b.f();
                int i10 = this.f42495s;
                if (i10 == 0) {
                    s.b(obj);
                    if (this.f42496t != null) {
                        p0 p0VarD0 = this.f42497u.d0();
                        bg.m mVar = this.f42497u.f42474j;
                        String str = this.f42496t;
                        this.f42494r = p0VarD0;
                        this.f42495s = 1;
                        Object objB = mVar.b(str, this);
                        if (objB == objF) {
                            return objF;
                        }
                        p0Var = p0VarD0;
                        obj = objB;
                    } else {
                        this.f42497u.r().q(new wg.a(g0.f38750a));
                        wp.a.e(this.f42498v);
                        j0.h(R.string.toast_common_error);
                    }
                    return g0.f38750a;
                }
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p0Var = (p0) this.f42494r;
                s.b(obj);
                p0Var.q(wg.d.b((wg.c) obj, null));
                this.f42497u.s().q(kotlin.coroutines.jvm.internal.b.a(false));
                return g0.f38750a;
            }
        }

        a(kl.f fVar) {
            super(2, fVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void k(j jVar, String str, String str2, AuthorizationException authorizationException) {
            em.k.d(q1.a(jVar), null, null, new C0643a(str, jVar, authorizationException, null), 3, null);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(Object obj, kl.f fVar) {
            return j.this.new a(fVar);
        }

        @Override // tl.o
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, kl.f fVar) {
            return ((a) create(o0Var, fVar)).invokeSuspend(g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            j jVar;
            Object objF = ll.b.f();
            int i10 = this.f42492s;
            if (i10 == 0) {
                s.b(obj);
                j.this.s().q(kotlin.coroutines.jvm.internal.b.a(true));
                j jVar2 = j.this;
                bg.a aVar = jVar2.f42473i;
                g0 g0Var = g0.f38750a;
                this.f42491r = jVar2;
                this.f42492s = 1;
                Object objB = aVar.b(g0Var, this);
                if (objB == objF) {
                    return objF;
                }
                jVar = jVar2;
                obj = objB;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jVar = (j) this.f42491r;
                s.b(obj);
            }
            jVar.D = (net.openid.appauth.c) wg.d.b((wg.c) obj, null);
            net.openid.appauth.c cVar = j.this.D;
            if (cVar != null) {
                net.openid.appauth.f fVar = j.this.E;
                final j jVar3 = j.this;
                cVar.p(fVar, new net.openid.appauth.c.b() { // from class: jh.i
                    @Override // net.openid.appauth.c.b
                    public final void a(String str, String str2, AuthorizationException authorizationException) {
                        j.a.k(jVar3, str, str2, authorizationException);
                    }
                });
            }
            return g0.f38750a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    static final class c extends kotlin.coroutines.jvm.internal.m implements tl.o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f42499r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private /* synthetic */ Object f42500s;

        c(kl.f fVar) {
            super(2, fVar);
        }

        @Override // tl.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(l0 l0Var, kl.f fVar) {
            return ((c) create(l0Var, fVar)).invokeSuspend(g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(Object obj, kl.f fVar) {
            c cVar = j.this.new c(fVar);
            cVar.f42500s = obj;
            return cVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x004e, code lost:
        
            if (r1.emit(r6, r5) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = ll.b.f()
                int r1 = r5.f42499r
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                fl.s.b(r6)
                goto L51
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                java.lang.Object r1 = r5.f42500s
                androidx.lifecycle.l0 r1 = (androidx.lifecycle.l0) r1
                fl.s.b(r6)
                goto L3d
            L22:
                fl.s.b(r6)
                java.lang.Object r6 = r5.f42500s
                r1 = r6
                androidx.lifecycle.l0 r1 = (androidx.lifecycle.l0) r1
                jh.j r6 = jh.j.this
                bg.e r6 = jh.j.F(r6)
                fl.g0 r4 = fl.g0.f38750a
                r5.f42500s = r1
                r5.f42499r = r3
                java.lang.Object r6 = r6.b(r4, r5)
                if (r6 != r0) goto L3d
                goto L50
            L3d:
                wg.c r6 = (wg.c) r6
                java.lang.String r3 = ""
                java.lang.Object r6 = wg.d.b(r6, r3)
                r3 = 0
                r5.f42500s = r3
                r5.f42499r = r2
                java.lang.Object r6 = r1.emit(r6, r5)
                if (r6 != r0) goto L51
            L50:
                return r0
            L51:
                fl.g0 r6 = fl.g0.f38750a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: jh.j.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    static final class d extends kotlin.coroutines.jvm.internal.m implements tl.o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f42502r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private /* synthetic */ Object f42503s;

        d(kl.f fVar) {
            super(2, fVar);
        }

        @Override // tl.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(l0 l0Var, kl.f fVar) {
            return ((d) create(l0Var, fVar)).invokeSuspend(g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(Object obj, kl.f fVar) {
            d dVar = j.this.new d(fVar);
            dVar.f42503s = obj;
            return dVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
        
            if (r1.emit(r6, r5) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = ll.b.f()
                int r1 = r5.f42502r
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                fl.s.b(r6)
                goto L54
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                java.lang.Object r1 = r5.f42503s
                androidx.lifecycle.l0 r1 = (androidx.lifecycle.l0) r1
                fl.s.b(r6)
                goto L3d
            L22:
                fl.s.b(r6)
                java.lang.Object r6 = r5.f42503s
                r1 = r6
                androidx.lifecycle.l0 r1 = (androidx.lifecycle.l0) r1
                jh.j r6 = jh.j.this
                bg.i r6 = jh.j.H(r6)
                fl.g0 r4 = fl.g0.f38750a
                r5.f42503s = r1
                r5.f42502r = r3
                java.lang.Object r6 = r6.b(r4, r5)
                if (r6 != r0) goto L3d
                goto L53
            L3d:
                wg.c r6 = (wg.c) r6
                r3 = 0
                java.lang.Integer r3 = kotlin.coroutines.jvm.internal.b.d(r3)
                java.lang.Object r6 = wg.d.b(r6, r3)
                r3 = 0
                r5.f42503s = r3
                r5.f42502r = r2
                java.lang.Object r6 = r1.emit(r6, r5)
                if (r6 != r0) goto L54
            L53:
                return r0
            L54:
                fl.g0 r6 = fl.g0.f38750a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: jh.j.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    static final class e extends kotlin.coroutines.jvm.internal.m implements tl.o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f42505r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private /* synthetic */ Object f42506s;

        e(kl.f fVar) {
            super(2, fVar);
        }

        @Override // tl.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(l0 l0Var, kl.f fVar) {
            return ((e) create(l0Var, fVar)).invokeSuspend(g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(Object obj, kl.f fVar) {
            e eVar = j.this.new e(fVar);
            eVar.f42506s = obj;
            return eVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x004e, code lost:
        
            if (r1.emit(r6, r5) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = ll.b.f()
                int r1 = r5.f42505r
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                fl.s.b(r6)
                goto L51
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                java.lang.Object r1 = r5.f42506s
                androidx.lifecycle.l0 r1 = (androidx.lifecycle.l0) r1
                fl.s.b(r6)
                goto L3d
            L22:
                fl.s.b(r6)
                java.lang.Object r6 = r5.f42506s
                r1 = r6
                androidx.lifecycle.l0 r1 = (androidx.lifecycle.l0) r1
                jh.j r6 = jh.j.this
                bg.k r6 = jh.j.I(r6)
                fl.g0 r4 = fl.g0.f38750a
                r5.f42506s = r1
                r5.f42505r = r3
                java.lang.Object r6 = r6.b(r4, r5)
                if (r6 != r0) goto L3d
                goto L50
            L3d:
                wg.c r6 = (wg.c) r6
                java.lang.String r3 = ""
                java.lang.Object r6 = wg.d.b(r6, r3)
                r3 = 0
                r5.f42506s = r3
                r5.f42505r = r2
                java.lang.Object r6 = r1.emit(r6, r5)
                if (r6 != r0) goto L51
            L50:
                return r0
            L51:
                fl.g0 r6 = fl.g0.f38750a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: jh.j.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    static final class f extends kotlin.coroutines.jvm.internal.m implements tl.o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f42508r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ int f42510t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ Intent f42511u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ String f42512v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(int i10, Intent intent, String str, kl.f fVar) {
            super(2, fVar);
            this.f42510t = i10;
            this.f42511u = intent;
            this.f42512v = str;
        }

        @Override // tl.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, kl.f fVar) {
            return ((f) create(o0Var, fVar)).invokeSuspend(g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(Object obj, kl.f fVar) {
            return j.this.new f(this.f42510t, this.f42511u, this.f42512v, fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = ll.b.f();
            int i10 = this.f42508r;
            if (i10 == 0) {
                s.b(obj);
                j.this.s().q(kotlin.coroutines.jvm.internal.b.a(true));
                bg.g gVar = j.this.f42481q;
                g0 g0Var = g0.f38750a;
                this.f42508r = 1;
                obj = gVar.b(g0Var, this);
                if (obj == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            EncodeParam encodeParam = (EncodeParam) wg.d.b((wg.c) obj, p.a());
            if (j.this.f42483s.o(this.f42510t, this.f42511u, encodeParam)) {
                j.this.k0(this.f42512v, encodeParam);
            } else {
                j.this.t().q(new wg.a(kotlin.coroutines.jvm.internal.b.d(R.string.toast_common_error)));
                j.this.s().q(kotlin.coroutines.jvm.internal.b.a(false));
            }
            return g0.f38750a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    static final class g extends kotlin.coroutines.jvm.internal.m implements tl.o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f42513r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ String f42515t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(String str, kl.f fVar) {
            super(2, fVar);
            this.f42515t = str;
        }

        @Override // tl.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, kl.f fVar) {
            return ((g) create(o0Var, fVar)).invokeSuspend(g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(Object obj, kl.f fVar) {
            return j.this.new g(this.f42515t, fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = ll.b.f();
            int i10 = this.f42513r;
            if (i10 == 0) {
                s.b(obj);
                q qVar = j.this.f42478n;
                String str = this.f42515t;
                this.f42513r = 1;
                if (qVar.b(str, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return g0.f38750a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    static final class h extends kotlin.coroutines.jvm.internal.m implements tl.o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f42516r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ int f42518t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(int i10, kl.f fVar) {
            super(2, fVar);
            this.f42518t = i10;
        }

        @Override // tl.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, kl.f fVar) {
            return ((h) create(o0Var, fVar)).invokeSuspend(g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(Object obj, kl.f fVar) {
            return j.this.new h(this.f42518t, fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = ll.b.f();
            int i10 = this.f42516r;
            if (i10 == 0) {
                s.b(obj);
                u uVar = j.this.f42480p;
                Integer numD = kotlin.coroutines.jvm.internal.b.d(this.f42518t);
                this.f42516r = 1;
                if (uVar.b(numD, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return g0.f38750a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    static final class i extends kotlin.coroutines.jvm.internal.m implements tl.o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f42519r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ String f42521t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(String str, kl.f fVar) {
            super(2, fVar);
            this.f42521t = str;
        }

        @Override // tl.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, kl.f fVar) {
            return ((i) create(o0Var, fVar)).invokeSuspend(g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(Object obj, kl.f fVar) {
            return j.this.new i(this.f42521t, fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = ll.b.f();
            int i10 = this.f42519r;
            if (i10 == 0) {
                s.b(obj);
                w wVar = j.this.f42479o;
                String str = this.f42521t;
                this.f42519r = 1;
                if (wVar.b(str, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return g0.f38750a;
        }
    }

    /* JADX INFO: renamed from: jh.j$j, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    static final class C0644j extends kotlin.coroutines.jvm.internal.m implements tl.o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f42522r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ String f42524t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ EncodeParam f42525u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ String f42526v;

        /* JADX INFO: renamed from: jh.j$j$a */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        static final class a extends kotlin.coroutines.jvm.internal.m implements tl.o {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f42527r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ j f42528s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ String f42529t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(j jVar, String str, kl.f fVar) {
                super(2, fVar);
                this.f42528s = jVar;
                this.f42529t = str;
            }

            @Override // tl.o
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(o0 o0Var, kl.f fVar) {
                return ((a) create(o0Var, fVar)).invokeSuspend(g0.f38750a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kl.f create(Object obj, kl.f fVar) {
                return new a(this.f42528s, this.f42529t, fVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                ll.b.f();
                if (this.f42527r != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                this.f42528s.f42483s.p(this.f42529t, 1);
                this.f42528s.u().q(kotlin.coroutines.jvm.internal.b.a(true));
                this.f42528s.s().q(kotlin.coroutines.jvm.internal.b.a(false));
                return g0.f38750a;
            }
        }

        /* JADX INFO: renamed from: jh.j$j$b */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        static final class b extends kotlin.coroutines.jvm.internal.m implements tl.o {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f42530r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ j f42531s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ GoogleJsonResponseException f42532t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(j jVar, GoogleJsonResponseException googleJsonResponseException, kl.f fVar) {
                super(2, fVar);
                this.f42531s = jVar;
                this.f42532t = googleJsonResponseException;
            }

            @Override // tl.o
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(o0 o0Var, kl.f fVar) {
                return ((b) create(o0Var, fVar)).invokeSuspend(g0.f38750a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kl.f create(Object obj, kl.f fVar) {
                return new b(this.f42531s, this.f42532t, fVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                ll.b.f();
                if (this.f42530r != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                this.f42531s.s().q(kotlin.coroutines.jvm.internal.b.a(false));
                for (GoogleJsonError.ErrorInfo errorInfo : this.f42532t.getDetails().getErrors()) {
                    if (errorInfo.getReason().equals("quotaExceeded")) {
                        j0.h(R.string.toast_yt_livestream_quota_exceeded);
                    }
                    if (errorInfo.getReason().equals("liveStreamingNotEnabled")) {
                        this.f42531s.f42490z.q(new wg.a(g0.f38750a));
                        break;
                    }
                }
                return g0.f38750a;
            }
        }

        /* JADX INFO: renamed from: jh.j$j$c */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        static final class c extends kotlin.coroutines.jvm.internal.m implements tl.o {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f42533r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ j f42534s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(j jVar, kl.f fVar) {
                super(2, fVar);
                this.f42534s = jVar;
            }

            @Override // tl.o
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(o0 o0Var, kl.f fVar) {
                return ((c) create(o0Var, fVar)).invokeSuspend(g0.f38750a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kl.f create(Object obj, kl.f fVar) {
                return new c(this.f42534s, fVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                ll.b.f();
                if (this.f42533r != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                this.f42534s.s().q(kotlin.coroutines.jvm.internal.b.a(false));
                return g0.f38750a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0644j(String str, EncodeParam encodeParam, String str2, kl.f fVar) {
            super(2, fVar);
            this.f42524t = str;
            this.f42525u = encodeParam;
            this.f42526v = str2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void k(String str, HttpRequest httpRequest) {
            httpRequest.getHeaders().setAuthorization("Bearer " + str);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(Object obj, kl.f fVar) {
            return j.this.new C0644j(this.f42524t, this.f42525u, this.f42526v, fVar);
        }

        @Override // tl.o
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, kl.f fVar) {
            return ((C0644j) create(o0Var, fVar)).invokeSuspend(g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ll.b.f();
            if (this.f42522r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            try {
                HttpTransport httpTransportNewCompatibleTransport = AndroidHttp.newCompatibleTransport();
                JacksonFactory defaultInstance = JacksonFactory.getDefaultInstance();
                final String str = this.f42526v;
                YouTube youTubeBuild = new YouTube.Builder(httpTransportNewCompatibleTransport, defaultInstance, new HttpRequestInitializer() { // from class: jh.k
                    @Override // com.google.api.client.http.HttpRequestInitializer
                    public final void initialize(HttpRequest httpRequest) {
                        j.C0644j.k(str, httpRequest);
                    }
                }).setApplicationName(j.this.X()).build();
                j jVar = j.this;
                kotlin.jvm.internal.s.e(youTubeBuild);
                String strV = jVar.V(youTubeBuild, this.f42524t, j.this.Y(), j.this.f42489y);
                LiveStream liveStreamW = j.this.W(youTubeBuild, this.f42524t, this.f42525u);
                System.out.println(youTubeBuild.liveBroadcasts().bind(strV, r.o("id", "snippet", "contentDetails", NotificationCompat.CATEGORY_STATUS)).setStreamId(liveStreamW.getId()).execute());
                String str2 = liveStreamW.getCdn().getIngestionInfo().getIngestionAddress() + '/' + liveStreamW.getCdn().getIngestionInfo().getStreamName();
                wp.a.a("rtmp url: %s", str2);
                em.k.d(q1.a(j.this), null, null, new a(j.this, str2, null), 3, null);
            } catch (GoogleJsonResponseException e10) {
                em.k.d(q1.a(j.this), null, null, new b(j.this, e10, null), 3, null);
                wp.a.e(e10);
                com.google.firebase.crashlytics.a.b().d(e10);
            } catch (Exception e11) {
                em.k.d(q1.a(j.this), null, null, new c(j.this, null), 3, null);
                wp.a.e(e11);
                com.google.firebase.crashlytics.a.b().d(e11);
                j0.h(R.string.toast_common_error);
            }
            return g0.f38750a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(bg.a getAuthStateUseCase, bg.m getYtUserUseCase, bg.e getYtDescriptionUseCase, bg.k getYtTitleUseCase, bg.i getYtPrivacyStatusUseCase, q setYtDescriptionUseCase, w setYtTitleUseCase, u setYtPrivacyStatusUseCase, bg.g getYtEncodeParamUseCase, em.k0 ioDispatcher, dg.a azLive, rf.d liveYtRepository) {
        super(azLive);
        kotlin.jvm.internal.s.h(getAuthStateUseCase, "getAuthStateUseCase");
        kotlin.jvm.internal.s.h(getYtUserUseCase, "getYtUserUseCase");
        kotlin.jvm.internal.s.h(getYtDescriptionUseCase, "getYtDescriptionUseCase");
        kotlin.jvm.internal.s.h(getYtTitleUseCase, "getYtTitleUseCase");
        kotlin.jvm.internal.s.h(getYtPrivacyStatusUseCase, "getYtPrivacyStatusUseCase");
        kotlin.jvm.internal.s.h(setYtDescriptionUseCase, "setYtDescriptionUseCase");
        kotlin.jvm.internal.s.h(setYtTitleUseCase, "setYtTitleUseCase");
        kotlin.jvm.internal.s.h(setYtPrivacyStatusUseCase, "setYtPrivacyStatusUseCase");
        kotlin.jvm.internal.s.h(getYtEncodeParamUseCase, "getYtEncodeParamUseCase");
        kotlin.jvm.internal.s.h(ioDispatcher, "ioDispatcher");
        kotlin.jvm.internal.s.h(azLive, "azLive");
        kotlin.jvm.internal.s.h(liveYtRepository, "liveYtRepository");
        this.f42473i = getAuthStateUseCase;
        this.f42474j = getYtUserUseCase;
        this.f42475k = getYtDescriptionUseCase;
        this.f42476l = getYtTitleUseCase;
        this.f42477m = getYtPrivacyStatusUseCase;
        this.f42478n = setYtDescriptionUseCase;
        this.f42479o = setYtTitleUseCase;
        this.f42480p = setYtPrivacyStatusUseCase;
        this.f42481q = getYtEncodeParamUseCase;
        this.f42482r = ioDispatcher;
        this.f42483s = azLive;
        this.f42484t = liveYtRepository;
        this.f42485u = new p0();
        this.f42487w = "";
        String[] stringArray = AzRecorderApp.e().getResources().getStringArray(R.array.yt_privacy_status_values);
        kotlin.jvm.internal.s.g(stringArray, "getStringArray(...)");
        this.f42488x = stringArray;
        this.f42489y = stringArray[0];
        this.f42490z = new p0();
        this.A = androidx.lifecycle.i.b(null, 0L, new e(null), 3, null);
        this.B = androidx.lifecycle.i.b(null, 0L, new c(null), 3, null);
        this.C = androidx.lifecycle.i.b(null, 0L, new d(null), 3, null);
        this.E = new net.openid.appauth.f(AzRecorderApp.e().getApplicationContext());
        em.k.d(q1.a(this), null, null, new a(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String V(YouTube youTube, String str, String str2, String str3) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US);
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        long jCurrentTimeMillis = System.currentTimeMillis() + ((long) 5000);
        Date date = new Date();
        date.setTime(jCurrentTimeMillis);
        wp.a.a("Creating event: title='%s', description='%s', date='%s'.", str, str2, simpleDateFormat.format(date));
        LiveBroadcastSnippet liveBroadcastSnippet = new LiveBroadcastSnippet();
        liveBroadcastSnippet.setScheduledStartTime(new DateTime(date).toString());
        liveBroadcastSnippet.setTitle(str);
        liveBroadcastSnippet.setDescription(str2);
        LiveBroadcastContentDetails liveBroadcastContentDetails = new LiveBroadcastContentDetails();
        Boolean bool = Boolean.TRUE;
        liveBroadcastContentDetails.setEnableDvr(bool);
        liveBroadcastContentDetails.setRecordFromStart(bool);
        liveBroadcastContentDetails.setEnableAutoStart(bool);
        liveBroadcastContentDetails.setEnableAutoStop(bool);
        LiveBroadcastStatus liveBroadcastStatus = new LiveBroadcastStatus();
        liveBroadcastStatus.setPrivacyStatus(str3);
        LiveBroadcast liveBroadcast = new LiveBroadcast();
        liveBroadcast.setSnippet(liveBroadcastSnippet);
        liveBroadcast.setStatus(liveBroadcastStatus);
        liveBroadcast.setContentDetails(liveBroadcastContentDetails);
        LiveBroadcast liveBroadcastExecute = youTube.liveBroadcasts().insert(r.o("id", "snippet", NotificationCompat.CATEGORY_STATUS, "contentDetails"), liveBroadcast).execute();
        this.f42484t.f(youTube);
        this.f42484t.e(liveBroadcastExecute.getSnippet().getLiveChatId());
        String id2 = liveBroadcastExecute.getId();
        kotlin.jvm.internal.s.g(id2, "getId(...)");
        return id2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LiveStream W(YouTube youTube, String str, EncodeParam encodeParam) {
        LiveStreamSnippet liveStreamSnippet = new LiveStreamSnippet();
        liveStreamSnippet.setTitle(str);
        CdnSettings cdnSettings = new CdnSettings();
        cdnSettings.setFrameRate(encodeParam.getFrameRate().getName());
        cdnSettings.setResolution(encodeParam.getResolution().getName());
        cdnSettings.setIngestionType("rtmp");
        LiveStream liveStream = new LiveStream();
        liveStream.setSnippet(liveStreamSnippet);
        liveStream.setCdn(cdnSettings);
        YouTube.LiveStreams.Insert insert = youTube.liveStreams().insert(r.o("id", "snippet", "cdn", NotificationCompat.CATEGORY_STATUS), liveStream);
        kotlin.jvm.internal.s.g(insert, "insert(...)");
        LiveStream liveStreamExecute = insert.execute();
        kotlin.jvm.internal.s.e(liveStreamExecute);
        return liveStreamExecute;
    }

    private final void g0(int i10) {
        em.k.d(q1.a(this), null, null, new h(i10, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k0(final String str, final EncodeParam encodeParam) {
        net.openid.appauth.c cVar = this.D;
        if (cVar != null) {
            cVar.p(this.E, new net.openid.appauth.c.b() { // from class: jh.h
                @Override // net.openid.appauth.c.b
                public final void a(String str2, String str3, AuthorizationException authorizationException) {
                    j.l0(this.f42469a, str, encodeParam, str2, str3, authorizationException);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l0(j jVar, String str, EncodeParam encodeParam, String str2, String str3, AuthorizationException authorizationException) {
        em.k.d(q1.a(jVar), jVar.f42482r, null, jVar.new C0644j(str, encodeParam, str2, null), 2, null);
    }

    public final String X() {
        return this.f42486v;
    }

    public final String Y() {
        return this.f42487w;
    }

    public final k0 Z() {
        return this.B;
    }

    public final k0 a0() {
        return this.C;
    }

    public final k0 b0() {
        return this.A;
    }

    public final k0 c0() {
        return this.f42490z;
    }

    public final p0 d0() {
        return this.f42485u;
    }

    public final void e0(int i10) {
        String str = (String) gl.j.X(this.f42488x, i10);
        if (str == null) {
            str = this.f42488x[0];
        }
        this.f42489y = str;
        g0(i10);
    }

    public final void f0(String description) {
        kotlin.jvm.internal.s.h(description, "description");
        em.k.d(q1.a(this), null, null, new g(description, null), 3, null);
    }

    public final void i0(String str) {
        this.f42486v = str;
    }

    public final void j0(String str) {
        kotlin.jvm.internal.s.h(str, "<set-?>");
        this.f42487w = str;
    }

    @Override // fh.j
    public void w(int i10, Intent intent, String title) {
        kotlin.jvm.internal.s.h(title, "title");
        em.k.d(q1.a(this), null, null, new f(i10, intent, title, null), 3, null);
    }

    public void h0(String str) {
        kotlin.jvm.internal.s.h(str, CIdIVqKnNZ.MYeplcDArd);
        em.k.d(q1.a(this), null, null, new i(str, null), 3, null);
    }
}
