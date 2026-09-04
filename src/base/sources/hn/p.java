package hn;

import gl.j0;
import gl.r;
import gn.b0;
import gn.f0;
import gn.q;
import gn.s;
import gn.x;
import gn.y;
import j$.util.DesugarTimeZone;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o0;
import o4.Wz.OGoz;
import re.xQrM.UoyZyZEcGYBpIg;
import xn.q0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final TimeZone f40721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f40722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f40723c;

    public static final s.c c(final s sVar) {
        kotlin.jvm.internal.s.h(sVar, "<this>");
        return new s.c() { // from class: hn.n
            @Override // gn.s.c
            public final s a(gn.e eVar) {
                return p.d(sVar, eVar);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s d(s sVar, gn.e it) {
        kotlin.jvm.internal.s.h(it, "it");
        return sVar;
    }

    public static final void e(q qVar) {
        kotlin.jvm.internal.s.h(qVar, "<this>");
        if (f40722b && Thread.holdsLock(qVar)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + qVar);
        }
    }

    public static final boolean f(y yVar, y other) {
        kotlin.jvm.internal.s.h(yVar, "<this>");
        kotlin.jvm.internal.s.h(other, "other");
        return kotlin.jvm.internal.s.c(yVar.g(), other.g()) && yVar.l() == other.l() && kotlin.jvm.internal.s.c(yVar.p(), other.p());
    }

    public static final void h(Socket socket) {
        kotlin.jvm.internal.s.h(socket, "<this>");
        try {
            socket.close();
        } catch (AssertionError e10) {
            throw e10;
        } catch (RuntimeException e11) {
            if (!kotlin.jvm.internal.s.c(e11.getMessage(), "bio == null")) {
                throw e11;
            }
        } catch (Exception unused) {
        }
    }

    public static final boolean i(q0 q0Var, int i10, TimeUnit timeUnit) {
        kotlin.jvm.internal.s.h(q0Var, "<this>");
        kotlin.jvm.internal.s.h(timeUnit, "timeUnit");
        try {
            return o(q0Var, i10, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final String j(String format, Object... args) {
        kotlin.jvm.internal.s.h(format, "format");
        kotlin.jvm.internal.s.h(args, "args");
        o0 o0Var = o0.f43602a;
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
        String str = String.format(locale, format, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        kotlin.jvm.internal.s.g(str, "format(...)");
        return str;
    }

    public static final long k(f0 f0Var) {
        kotlin.jvm.internal.s.h(f0Var, "<this>");
        String strA = f0Var.d0().a("Content-Length");
        if (strA != null) {
            return m.C(strA, -1L);
        }
        return -1L;
    }

    public static final List l(Object... elements) {
        kotlin.jvm.internal.s.h(elements, "elements");
        return w(elements);
    }

    public static final boolean m(Socket socket, xn.g source) {
        kotlin.jvm.internal.s.h(socket, "<this>");
        kotlin.jvm.internal.s.h(source, "source");
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                return !source.n0();
            } finally {
                socket.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public static final Charset n(xn.g gVar, Charset charset) {
        kotlin.jvm.internal.s.h(gVar, "<this>");
        kotlin.jvm.internal.s.h(charset, "default");
        int iF = gVar.f(m.m());
        if (iF == -1) {
            return charset;
        }
        if (iF == 0) {
            return bm.d.f9079b;
        }
        if (iF == 1) {
            return bm.d.f9081d;
        }
        if (iF == 2) {
            return bm.d.f9078a.b();
        }
        if (iF == 3) {
            return bm.d.f9082e;
        }
        if (iF == 4) {
            return bm.d.f9078a.a();
        }
        throw new AssertionError();
    }

    public static final boolean o(q0 q0Var, int i10, TimeUnit timeUnit) {
        kotlin.jvm.internal.s.h(q0Var, "<this>");
        kotlin.jvm.internal.s.h(timeUnit, "timeUnit");
        long jNanoTime = System.nanoTime();
        long jC = q0Var.timeout().e() ? q0Var.timeout().c() - jNanoTime : Long.MAX_VALUE;
        q0Var.timeout().d(Math.min(jC, timeUnit.toNanos(i10)) + jNanoTime);
        try {
            xn.e eVar = new xn.e();
            while (q0Var.read(eVar, 8192L) != -1) {
                eVar.k();
            }
            if (jC == Long.MAX_VALUE) {
                q0Var.timeout().a();
                return true;
            }
            q0Var.timeout().d(jNanoTime + jC);
            return true;
        } catch (InterruptedIOException unused) {
            if (jC == Long.MAX_VALUE) {
                q0Var.timeout().a();
                return false;
            }
            q0Var.timeout().d(jNanoTime + jC);
            return false;
        } catch (Throwable th2) {
            if (jC == Long.MAX_VALUE) {
                q0Var.timeout().a();
            } else {
                q0Var.timeout().d(jNanoTime + jC);
            }
            throw th2;
        }
    }

    public static final ThreadFactory p(final String name, final boolean z10) {
        kotlin.jvm.internal.s.h(name, "name");
        return new ThreadFactory() { // from class: hn.o
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return p.q(name, z10, runnable);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread q(String str, boolean z10, Runnable runnable) {
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(z10);
        return thread;
    }

    public static final List r(x xVar) {
        kotlin.jvm.internal.s.h(xVar, "<this>");
        yl.f fVarM = yl.g.m(0, xVar.size());
        ArrayList arrayList = new ArrayList(r.v(fVarM, 10));
        Iterator it = fVarM.iterator();
        while (it.hasNext()) {
            int iNextInt = ((j0) it).nextInt();
            arrayList.add(new on.c(xVar.d(iNextInt), xVar.h(iNextInt)));
        }
        return arrayList;
    }

    public static final x s(List list) {
        kotlin.jvm.internal.s.h(list, "<this>");
        x.a aVar = new x.a();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            on.c cVar = (on.c) it.next();
            aVar.c(cVar.a().K(), cVar.b().K());
        }
        return aVar.d();
    }

    public static final String t(y yVar, boolean z10) {
        String strG;
        kotlin.jvm.internal.s.h(yVar, "<this>");
        if (bm.r.T(yVar.g(), ":", false, 2, null)) {
            strG = '[' + yVar.g() + ']';
        } else {
            strG = yVar.g();
        }
        if (!z10 && yVar.l() == y.f39776j.b(yVar.p())) {
            return strG;
        }
        return strG + ':' + yVar.l();
    }

    public static /* synthetic */ String u(y yVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return t(yVar, z10);
    }

    public static final List v(List list) {
        kotlin.jvm.internal.s.h(list, "<this>");
        if (list.isEmpty()) {
            return r.l();
        }
        if (list.size() == 1) {
            List listSingletonList = Collections.singletonList(list.get(0));
            kotlin.jvm.internal.s.g(listSingletonList, "singletonList(...)");
            return listSingletonList;
        }
        Object[] array = list.toArray();
        kotlin.jvm.internal.s.g(array, "toArray(...)");
        List listUnmodifiableList = Collections.unmodifiableList(gl.j.e(array));
        kotlin.jvm.internal.s.g(listUnmodifiableList, "unmodifiableList(...)");
        kotlin.jvm.internal.s.f(listUnmodifiableList, "null cannot be cast to non-null type kotlin.collections.List<T of okhttp3.internal._UtilJvmKt.toImmutableList>");
        return listUnmodifiableList;
    }

    public static final List w(Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            return r.l();
        }
        if (objArr.length == 1) {
            List listSingletonList = Collections.singletonList(objArr[0]);
            kotlin.jvm.internal.s.g(listSingletonList, "singletonList(...)");
            return listSingletonList;
        }
        List listUnmodifiableList = Collections.unmodifiableList(gl.j.e((Object[]) objArr.clone()));
        kotlin.jvm.internal.s.g(listUnmodifiableList, "unmodifiableList(...)");
        return listUnmodifiableList;
    }

    static {
        TimeZone timeZone = DesugarTimeZone.getTimeZone(OGoz.rUWjYxWmpijdOs);
        kotlin.jvm.internal.s.e(timeZone);
        f40721a = timeZone;
        f40722b = false;
        String name = b0.class.getName();
        kotlin.jvm.internal.s.g(name, "getName(...)");
        f40723c = bm.r.z0(bm.r.y0(name, "okhttp3."), "Client");
    }

    public static final int g(String name, long j10, TimeUnit timeUnit) {
        kotlin.jvm.internal.s.h(name, "name");
        kotlin.jvm.internal.s.h(timeUnit, UoyZyZEcGYBpIg.iHpikz);
        if (j10 < 0) {
            throw new IllegalStateException((name + " < 0").toString());
        }
        long millis = timeUnit.toMillis(j10);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException((name + " too large").toString());
        }
        if (millis != 0 || j10 <= 0) {
            return (int) millis;
        }
        throw new IllegalArgumentException((name + " too small").toString());
    }
}
