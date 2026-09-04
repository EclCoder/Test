package com.inmobi.media;

import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.inmobi.media.zh, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3484zh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nm.a f28020a = nm.g.b(false, 1, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WeakReference f28021b = new WeakReference(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f28022c;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(kotlin.coroutines.jvm.internal.d dVar) {
        C3434xh c3434xh;
        kl.j jVar;
        if (dVar instanceof C3434xh) {
            c3434xh = (C3434xh) dVar;
            int i10 = c3434xh.f27861d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c3434xh.f27861d = i10 - Integer.MIN_VALUE;
            } else {
                c3434xh = new C3434xh(this, dVar);
            }
        } else {
            c3434xh = new C3434xh(this, dVar);
        }
        Object obj = c3434xh.f27859b;
        Object objF = ll.b.f();
        int i11 = c3434xh.f27861d;
        if (i11 == 0) {
            fl.s.b(obj);
            kl.j context = c3434xh.getContext();
            System.out.println(c3434xh.getContext());
            if (kotlin.jvm.internal.s.c(this.f28021b.get(), context)) {
                this.f28022c++;
                return fl.g0.f38750a;
            }
            nm.a aVar = this.f28020a;
            c3434xh.f27858a = context;
            c3434xh.f27861d = 1;
            if (nm.a.a(aVar, null, c3434xh, 1, null) == objF) {
                return objF;
            }
            jVar = context;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jVar = c3434xh.f27858a;
            fl.s.b(obj);
        }
        this.f28021b = new WeakReference(jVar);
        this.f28022c = 1;
        return fl.g0.f38750a;
    }

    public final fl.g0 a(C3459yh c3459yh) {
        kl.j context = c3459yh.getContext();
        System.out.println(c3459yh.getContext());
        if (kotlin.jvm.internal.s.c(this.f28021b.get(), context)) {
            int i10 = this.f28022c - 1;
            this.f28022c = i10;
            if (i10 == 0) {
                this.f28021b = new WeakReference(null);
                nm.a.b(this.f28020a, null, 1, null);
            }
            return fl.g0.f38750a;
        }
        throw new IllegalStateException("ReentrantMutex is not locked by this coroutine.");
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0077 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(I3 i10, kotlin.coroutines.jvm.internal.d dVar) throws Throwable {
        C3459yh c3459yh;
        Function1 function1;
        if (dVar instanceof C3459yh) {
            c3459yh = (C3459yh) dVar;
            int i11 = c3459yh.f27957d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c3459yh.f27957d = i11 - Integer.MIN_VALUE;
            } else {
                c3459yh = new C3459yh(this, dVar);
            }
        } else {
            c3459yh = new C3459yh(this, dVar);
        }
        Object objInvoke = c3459yh.f27955b;
        Object objF = ll.b.f();
        int i12 = c3459yh.f27957d;
        try {
            if (i12 == 0) {
                fl.s.b(objInvoke);
                c3459yh.f27954a = i10;
                c3459yh.f27957d = 1;
                if (a((kotlin.coroutines.jvm.internal.d) c3459yh) != objF) {
                }
                function1 = i10;
                return objF;
            }
            if (i12 == 1) {
                Function1 function2 = (Function1) c3459yh.f27954a;
                fl.s.b(objInvoke);
                function1 = function2;
            } else {
                if (i12 != 2) {
                    if (i12 == 3) {
                        Object obj = c3459yh.f27954a;
                        fl.s.b(objInvoke);
                        return obj;
                    }
                    if (i12 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Throwable th2 = (Throwable) c3459yh.f27954a;
                    fl.s.b(objInvoke);
                    throw th2;
                }
                fl.s.b(objInvoke);
            }
            c3459yh.f27954a = objInvoke;
            c3459yh.f27957d = 3;
            if (a(c3459yh) == objF) {
                return objInvoke;
            }
            function1 = i10;
            return objF;
            function1 = i10;
            c3459yh.f27954a = null;
            c3459yh.f27957d = 2;
            objInvoke = function1.invoke(c3459yh);
            if (objInvoke != objF) {
                c3459yh.f27954a = objInvoke;
                c3459yh.f27957d = 3;
                if (a(c3459yh) == objF) {
                    return objInvoke;
                }
            }
        } catch (Throwable th3) {
            c3459yh.f27954a = th3;
            c3459yh.f27957d = 4;
            if (a(c3459yh) != objF) {
                throw th3;
            }
        }
        function1 = i10;
        return objF;
    }
}
