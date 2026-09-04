package uh;

import android.app.Application;
import android.content.Context;
import android.net.Uri;
import androidx.lifecycle.q1;
import em.c1;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class o0 extends androidx.lifecycle.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final androidx.lifecycle.k0 f54537c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class a extends kotlin.coroutines.jvm.internal.m implements tl.o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f54538r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ Context f54539s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, kl.f fVar) {
            super(2, fVar);
            this.f54539s = context;
        }

        @Override // tl.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(em.o0 o0Var, kl.f fVar) {
            return ((a) create(o0Var, fVar)).invokeSuspend(fl.g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(Object obj, kl.f fVar) {
            return new a(this.f54539s, fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws IOException {
            ll.b.f();
            if (this.f54538r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fl.s.b(obj);
            ArrayList arrayList = new ArrayList();
            String[] list = this.f54539s.getAssets().list("stickers");
            File fileA = sh.b.A(this.f54539s, "stickers");
            String[] list2 = fileA.list();
            if (list != null) {
                Context context = this.f54539s;
                for (String str : list) {
                    if (list2 != null && !gl.j.P(list2, str)) {
                        kotlin.jvm.internal.s.e(str);
                        sh.b.j(context, fileA, "stickers", str);
                    }
                    String absolutePath = new File(fileA, str).getAbsolutePath();
                    Uri uri = Uri.parse("file:///android_asset/stickers/" + str);
                    kotlin.jvm.internal.s.e(uri);
                    kotlin.jvm.internal.s.e(absolutePath);
                    kotlin.jvm.internal.s.e(str);
                    ng.b bVar = new ng.b(null, uri, absolutePath, "stickers", str, 0, true, 33, null);
                    wp.a.a("New sticker added: %s ", bVar.f());
                    arrayList.add(bVar);
                }
            }
            return arrayList;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class b extends kotlin.coroutines.jvm.internal.m implements tl.o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f54540r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private /* synthetic */ Object f54541s;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ Application f54543u;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        static final class a extends kotlin.coroutines.jvm.internal.m implements tl.o {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            Object f54544r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            int f54545s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ androidx.lifecycle.l0 f54546t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            final /* synthetic */ o0 f54547u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            final /* synthetic */ Application f54548v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(androidx.lifecycle.l0 l0Var, o0 o0Var, Application application, kl.f fVar) {
                super(2, fVar);
                this.f54546t = l0Var;
                this.f54547u = o0Var;
                this.f54548v = application;
            }

            @Override // tl.o
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(em.o0 o0Var, kl.f fVar) {
                return ((a) create(o0Var, fVar)).invokeSuspend(fl.g0.f38750a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kl.f create(Object obj, kl.f fVar) {
                return new a(this.f54546t, this.f54547u, this.f54548v, fVar);
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
            
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
                    int r1 = r5.f54545s
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L22
                    if (r1 == r3) goto L1a
                    if (r1 != r2) goto L12
                    fl.s.b(r6)
                    goto L42
                L12:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r0)
                    throw r6
                L1a:
                    java.lang.Object r1 = r5.f54544r
                    androidx.lifecycle.l0 r1 = (androidx.lifecycle.l0) r1
                    fl.s.b(r6)
                    goto L36
                L22:
                    fl.s.b(r6)
                    androidx.lifecycle.l0 r1 = r5.f54546t
                    uh.o0 r6 = r5.f54547u
                    android.app.Application r4 = r5.f54548v
                    r5.f54544r = r1
                    r5.f54545s = r3
                    java.lang.Object r6 = uh.o0.k(r6, r4, r5)
                    if (r6 != r0) goto L36
                    goto L41
                L36:
                    r3 = 0
                    r5.f54544r = r3
                    r5.f54545s = r2
                    java.lang.Object r6 = r1.emit(r6, r5)
                    if (r6 != r0) goto L42
                L41:
                    return r0
                L42:
                    fl.g0 r6 = fl.g0.f38750a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: uh.o0.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Application application, kl.f fVar) {
            super(2, fVar);
            this.f54543u = application;
        }

        @Override // tl.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(androidx.lifecycle.l0 l0Var, kl.f fVar) {
            return ((b) create(l0Var, fVar)).invokeSuspend(fl.g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(Object obj, kl.f fVar) {
            b bVar = o0.this.new b(this.f54543u, fVar);
            bVar.f54541s = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = ll.b.f();
            int i10 = this.f54540r;
            if (i10 == 0) {
                fl.s.b(obj);
                androidx.lifecycle.l0 l0Var = (androidx.lifecycle.l0) this.f54541s;
                em.k0 k0VarB = c1.b();
                a aVar = new a(l0Var, o0.this, this.f54543u, null);
                this.f54540r = 1;
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(Application application) {
        super(application);
        kotlin.jvm.internal.s.h(application, "application");
        this.f54537c = androidx.lifecycle.i.b(q1.a(this).i0(), 0L, new b(application, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object m(Context context, kl.f fVar) {
        return em.i.j(c1.b(), new a(context, null), fVar);
    }

    public final androidx.lifecycle.k0 l() {
        return this.f54537c;
    }
}
