package em;

import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class z2 {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        long f38080r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f38081s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f38082t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        /* synthetic */ Object f38083u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f38084v;

        a(kl.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f38083u = obj;
            this.f38084v |= Integer.MIN_VALUE;
            return z2.d(0L, null, this);
        }
    }

    public static final TimeoutCancellationException a(long j10, x0 x0Var, z1 z1Var, String str) {
        String string = "Timed out waiting for " + j10 + " ms";
        if (str != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Coroutine \"");
            sb2.append(str);
            sb2.append("\" ");
            if (string.length() > 0) {
                char lowerCase = Character.toLowerCase(string.charAt(0));
                String strSubstring = string.substring(1);
                kotlin.jvm.internal.s.g(strSubstring, "substring(...)");
                string = lowerCase + strSubstring;
            }
            sb2.append(string);
            string = sb2.toString();
        }
        return new TimeoutCancellationException(string, z1Var);
    }

    private static final Object b(y2 y2Var, tl.o oVar) {
        b2.f(y2Var, y0.b(y2Var.f42693d.getContext()).i(y2Var.f38076e, y2Var, y2Var.getContext()));
        return km.b.f(y2Var, y2Var, oVar);
    }

    public static final Object c(long j10, tl.o oVar, kl.f fVar) {
        if (j10 <= 0) {
            throw new TimeoutCancellationException("Timed out immediately");
        }
        Object objB = b(new y2(j10, fVar), oVar);
        if (objB == ll.b.f()) {
            kotlin.coroutines.jvm.internal.h.c(fVar);
        }
        return objB;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object d(long j10, tl.o oVar, kl.f fVar) {
        a aVar;
        kotlin.jvm.internal.k0 k0Var;
        if (fVar instanceof a) {
            aVar = (a) fVar;
            int i10 = aVar.f38084v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f38084v = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(fVar);
            }
        } else {
            aVar = new a(fVar);
        }
        Object obj = aVar.f38083u;
        Object objF = ll.b.f();
        int i11 = aVar.f38084v;
        if (i11 == 0) {
            fl.s.b(obj);
            if (j10 <= 0) {
                return null;
            }
            kotlin.jvm.internal.k0 k0Var2 = new kotlin.jvm.internal.k0();
            try {
                aVar.f38081s = oVar;
                aVar.f38082t = k0Var2;
                aVar.f38080r = j10;
                aVar.f38084v = 1;
                y2 y2Var = new y2(j10, aVar);
                k0Var2.f43597a = y2Var;
                Object objB = b(y2Var, oVar);
                if (objB == ll.b.f()) {
                    kotlin.coroutines.jvm.internal.h.c(aVar);
                }
                return objB == objF ? objF : objB;
            } catch (TimeoutCancellationException e10) {
                e = e10;
                k0Var = k0Var2;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            k0Var = (kotlin.jvm.internal.k0) aVar.f38082t;
            try {
                fl.s.b(obj);
                return obj;
            } catch (TimeoutCancellationException e11) {
                e = e11;
            }
        }
        if (e.coroutine == k0Var.f43597a) {
            return null;
        }
        throw e;
    }
}
