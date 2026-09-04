package uh;

import android.app.Application;
import androidx.lifecycle.q1;
import com.hecorat.screenrecorder.free.AzRecorderApp;
import em.c1;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class e extends androidx.lifecycle.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final androidx.lifecycle.k0 f54463c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class a extends kotlin.coroutines.jvm.internal.m implements tl.o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f54464r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private /* synthetic */ Object f54465s;

        /* JADX INFO: renamed from: uh.e$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        static final class C0820a extends kotlin.coroutines.jvm.internal.m implements tl.o {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            Object f54467r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            int f54468s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ androidx.lifecycle.l0 f54469t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            final /* synthetic */ e f54470u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0820a(androidx.lifecycle.l0 l0Var, e eVar, kl.f fVar) {
                super(2, fVar);
                this.f54469t = l0Var;
                this.f54470u = eVar;
            }

            @Override // tl.o
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(em.o0 o0Var, kl.f fVar) {
                return ((C0820a) create(o0Var, fVar)).invokeSuspend(fl.g0.f38750a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kl.f create(Object obj, kl.f fVar) {
                return new C0820a(this.f54469t, this.f54470u, fVar);
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
            
                if (r1.emit(r5, r4) == r0) goto L15;
             */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r5) {
                /*
                    r4 = this;
                    java.lang.Object r0 = ll.b.f()
                    int r1 = r4.f54468s
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L22
                    if (r1 == r3) goto L1a
                    if (r1 != r2) goto L12
                    fl.s.b(r5)
                    goto L40
                L12:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r0)
                    throw r5
                L1a:
                    java.lang.Object r1 = r4.f54467r
                    androidx.lifecycle.l0 r1 = (androidx.lifecycle.l0) r1
                    fl.s.b(r5)
                    goto L34
                L22:
                    fl.s.b(r5)
                    androidx.lifecycle.l0 r1 = r4.f54469t
                    uh.e r5 = r4.f54470u
                    r4.f54467r = r1
                    r4.f54468s = r3
                    java.lang.Object r5 = uh.e.k(r5, r4)
                    if (r5 != r0) goto L34
                    goto L3f
                L34:
                    r3 = 0
                    r4.f54467r = r3
                    r4.f54468s = r2
                    java.lang.Object r5 = r1.emit(r5, r4)
                    if (r5 != r0) goto L40
                L3f:
                    return r0
                L40:
                    fl.g0 r5 = fl.g0.f38750a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: uh.e.a.C0820a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        a(kl.f fVar) {
            super(2, fVar);
        }

        @Override // tl.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(androidx.lifecycle.l0 l0Var, kl.f fVar) {
            return ((a) create(l0Var, fVar)).invokeSuspend(fl.g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(Object obj, kl.f fVar) {
            a aVar = e.this.new a(fVar);
            aVar.f54465s = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = ll.b.f();
            int i10 = this.f54464r;
            if (i10 == 0) {
                fl.s.b(obj);
                androidx.lifecycle.l0 l0Var = (androidx.lifecycle.l0) this.f54465s;
                em.k0 k0VarB = c1.b();
                C0820a c0820a = new C0820a(l0Var, e.this, null);
                this.f54464r = 1;
                if (em.i.j(k0VarB, c0820a, this) == objF) {
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
        int f54471r;

        b(kl.f fVar) {
            super(2, fVar);
        }

        @Override // tl.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(em.o0 o0Var, kl.f fVar) {
            return ((b) create(o0Var, fVar)).invokeSuspend(fl.g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(Object obj, kl.f fVar) {
            return e.this.new b(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws IOException {
            ll.b.f();
            if (this.f54471r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fl.s.b(obj);
            ArrayList arrayList = new ArrayList();
            AzRecorderApp azRecorderApp = (AzRecorderApp) e.this.j();
            String[] list = azRecorderApp.getAssets().list("backgrounds");
            File fileA = sh.b.A(azRecorderApp, "backgrounds");
            String[] list2 = fileA.list();
            if (list != null) {
                for (String str : list) {
                    if (list2 != null && !gl.j.P(list2, str)) {
                        wp.a.a("Copy background file from asset to local: " + str, new Object[0]);
                        kotlin.jvm.internal.s.e(str);
                        sh.b.j(azRecorderApp, fileA, "backgrounds", str);
                    }
                    String absolutePath = new File(fileA, str).getAbsolutePath();
                    wp.a.a("Local path: " + absolutePath, new Object[0]);
                    kotlin.jvm.internal.s.e(absolutePath);
                    arrayList.add(absolutePath);
                }
            }
            return arrayList;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Application application) {
        super(application);
        kotlin.jvm.internal.s.h(application, "application");
        this.f54463c = androidx.lifecycle.i.b(q1.a(this).i0(), 0L, new a(null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object m(kl.f fVar) {
        return em.i.j(c1.b(), new b(null), fVar);
    }

    public final androidx.lifecycle.k0 l() {
        return this.f54463c;
    }
}
