package jn;

import bm.o;
import bm.r;
import fl.g0;
import hn.m;
import hn.p;
import java.io.Closeable;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import o4.Wz.OGoz;
import xn.c0;
import xn.h0;
import xn.l;
import xn.o0;
import xn.q0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class f implements Closeable, Flushable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h0 f42720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f42721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f42722c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final l f42723d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f42724e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final h0 f42725f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final h0 f42726g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final h0 f42727h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f42728i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private xn.f f42729j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final LinkedHashMap f42730k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f42731l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f42732m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f42733n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f42734o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f42735p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f42736q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f42737r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f42738s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final kn.c f42739t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final e f42740u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final a f42715v = new a(null);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f42716w = "journal";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f42717x = "journal.tmp";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f42718y = "journal.bkp";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f42719z = "libcore.io.DiskLruCache";
    public static final String A = "1";
    public static final long B = -1;
    public static final o C = new o("[a-z0-9_-]{1,120}");
    public static final String D = "CLEAN";
    public static final String E = "DIRTY";
    public static final String F = "REMOVE";
    public static final String G = "READ";

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f42741a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean[] f42742b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f42743c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ f f42744d;

        public b(f fVar, c entry) {
            s.h(entry, "entry");
            this.f42744d = fVar;
            this.f42741a = entry;
            this.f42742b = entry.g() ? null : new boolean[fVar.p0()];
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final g0 h(f fVar, b bVar, IOException it) {
            s.h(it, "it");
            synchronized (fVar) {
                bVar.d();
            }
            return g0.f38750a;
        }

        public final void b() {
            f fVar = this.f42744d;
            synchronized (fVar) {
                try {
                    if (this.f42743c) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (s.c(this.f42741a.b(), this)) {
                        fVar.r(this, false);
                    }
                    this.f42743c = true;
                    g0 g0Var = g0.f38750a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public final void c() {
            f fVar = this.f42744d;
            synchronized (fVar) {
                try {
                    if (this.f42743c) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (s.c(this.f42741a.b(), this)) {
                        fVar.r(this, true);
                    }
                    this.f42743c = true;
                    g0 g0Var = g0.f38750a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public final void d() {
            if (s.c(this.f42741a.b(), this)) {
                if (this.f42744d.f42733n) {
                    this.f42744d.r(this, false);
                } else {
                    this.f42741a.q(true);
                }
            }
        }

        public final c e() {
            return this.f42741a;
        }

        public final boolean[] f() {
            return this.f42742b;
        }

        public final o0 g(int i10) {
            final f fVar = this.f42744d;
            synchronized (fVar) {
                if (this.f42743c) {
                    throw new IllegalStateException("Check failed.");
                }
                if (!s.c(this.f42741a.b(), this)) {
                    return c0.a();
                }
                if (!this.f42741a.g()) {
                    boolean[] zArr = this.f42742b;
                    s.e(zArr);
                    zArr[i10] = true;
                }
                try {
                    return new h(fVar.m0().d0((h0) this.f42741a.c().get(i10)), new Function1() { // from class: jn.g
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return f.b.h(fVar, this, (IOException) obj);
                        }
                    });
                } catch (FileNotFoundException unused) {
                    return c0.a();
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f42745a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long[] f42746b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List f42747c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final List f42748d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f42749e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f42750f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private b f42751g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f42752h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private long f42753i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ f f42754j;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class a extends xn.o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private boolean f42755a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ f f42756b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ c f42757c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(q0 q0Var, f fVar, c cVar) {
                super(q0Var);
                this.f42756b = fVar;
                this.f42757c = cVar;
            }

            @Override // xn.o, xn.q0, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                super.close();
                if (this.f42755a) {
                    return;
                }
                this.f42755a = true;
                f fVar = this.f42756b;
                c cVar = this.f42757c;
                synchronized (fVar) {
                    try {
                        cVar.n(cVar.f() - 1);
                        if (cVar.f() == 0 && cVar.i()) {
                            fVar.Z0(cVar);
                        }
                        g0 g0Var = g0.f38750a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }

        public c(f fVar, String key) {
            s.h(key, "key");
            this.f42754j = fVar;
            this.f42745a = key;
            this.f42746b = new long[fVar.p0()];
            this.f42747c = new ArrayList();
            this.f42748d = new ArrayList();
            StringBuilder sb2 = new StringBuilder(key);
            sb2.append('.');
            int length = sb2.length();
            int iP0 = fVar.p0();
            for (int i10 = 0; i10 < iP0; i10++) {
                sb2.append(i10);
                List list = this.f42747c;
                h0 h0VarI0 = this.f42754j.i0();
                String string = sb2.toString();
                s.g(string, "toString(...)");
                list.add(h0VarI0.i(string));
                sb2.append(".tmp");
                List list2 = this.f42748d;
                h0 h0VarI1 = this.f42754j.i0();
                String string2 = sb2.toString();
                s.g(string2, "toString(...)");
                list2.add(h0VarI1.i(string2));
                sb2.setLength(length);
            }
        }

        private final Void j(List list) throws IOException {
            throw new IOException("unexpected journal line: " + list);
        }

        private final q0 k(int i10) {
            q0 q0VarI0 = this.f42754j.m0().i0((h0) this.f42747c.get(i10));
            if (this.f42754j.f42733n) {
                return q0VarI0;
            }
            this.f42752h++;
            return new a(q0VarI0, this.f42754j, this);
        }

        public final List a() {
            return this.f42747c;
        }

        public final b b() {
            return this.f42751g;
        }

        public final List c() {
            return this.f42748d;
        }

        public final String d() {
            return this.f42745a;
        }

        public final long[] e() {
            return this.f42746b;
        }

        public final int f() {
            return this.f42752h;
        }

        public final boolean g() {
            return this.f42749e;
        }

        public final long h() {
            return this.f42753i;
        }

        public final boolean i() {
            return this.f42750f;
        }

        public final void l(b bVar) {
            this.f42751g = bVar;
        }

        public final void m(List strings) throws IOException {
            s.h(strings, "strings");
            if (strings.size() != this.f42754j.p0()) {
                j(strings);
                throw new KotlinNothingValueException();
            }
            try {
                int size = strings.size();
                for (int i10 = 0; i10 < size; i10++) {
                    this.f42746b[i10] = Long.parseLong((String) strings.get(i10));
                }
            } catch (NumberFormatException unused) {
                j(strings);
                throw new KotlinNothingValueException();
            }
        }

        public final void n(int i10) {
            this.f42752h = i10;
        }

        public final void o(boolean z10) {
            this.f42749e = z10;
        }

        public final void p(long j10) {
            this.f42753i = j10;
        }

        public final void q(boolean z10) {
            this.f42750f = z10;
        }

        public final d r() {
            f fVar = this.f42754j;
            if (p.f40722b && !Thread.holdsLock(fVar)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + fVar);
            }
            if (!this.f42749e) {
                return null;
            }
            if (!this.f42754j.f42733n && (this.f42751g != null || this.f42750f)) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            long[] jArr = (long[]) this.f42746b.clone();
            int i10 = 0;
            try {
                int iP0 = this.f42754j.p0();
                for (int i11 = 0; i11 < iP0; i11++) {
                    arrayList.add(k(i11));
                }
                return new d(this.f42754j, this.f42745a, this.f42753i, arrayList, jArr);
            } catch (FileNotFoundException unused) {
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    m.f((q0) obj);
                }
                try {
                    this.f42754j.Z0(this);
                } catch (IOException unused2) {
                }
                return null;
            }
        }

        public final void s(xn.f writer) {
            s.h(writer, "writer");
            for (long j10 : this.f42746b) {
                writer.writeByte(32).a0(j10);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public final class d implements Closeable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f42758a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f42759b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List f42760c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long[] f42761d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ f f42762e;

        public d(f fVar, String key, long j10, List sources, long[] lengths) {
            s.h(key, "key");
            s.h(sources, "sources");
            s.h(lengths, "lengths");
            this.f42762e = fVar;
            this.f42758a = key;
            this.f42759b = j10;
            this.f42760c = sources;
            this.f42761d = lengths;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            Iterator it = this.f42760c.iterator();
            while (it.hasNext()) {
                m.f((q0) it.next());
            }
        }

        public final b d() {
            return this.f42762e.t(this.f42758a, this.f42759b);
        }

        public final q0 h(int i10) {
            return (q0) this.f42760c.get(i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class e extends kn.a {
        e(String str) {
            super(str, false, 2, null);
        }

        @Override // kn.a
        public long f() {
            f fVar = f.this;
            synchronized (fVar) {
                if (!fVar.f42734o || fVar.g0()) {
                    return -1L;
                }
                try {
                    fVar.b1();
                } catch (IOException unused) {
                    fVar.f42736q = true;
                }
                try {
                    if (fVar.K0()) {
                        fVar.X0();
                        fVar.f42731l = 0;
                    }
                } catch (IOException unused2) {
                    fVar.f42737r = true;
                    xn.f fVar2 = fVar.f42729j;
                    if (fVar2 != null) {
                        m.f(fVar2);
                    }
                    fVar.f42729j = c0.b(c0.a());
                }
                return -1L;
            }
        }
    }

    /* JADX INFO: renamed from: jn.f$f, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class C0646f extends xn.m {
        C0646f(l lVar) {
            super(lVar);
        }

        @Override // xn.m, xn.l
        public o0 g0(h0 file, boolean z10) {
            s.h(file, "file");
            h0 h0VarG = file.g();
            if (h0VarG != null) {
                h(h0VarG);
            }
            return super.g0(file, z10);
        }
    }

    public f(l fileSystem, h0 directory, int i10, int i11, long j10, kn.d taskRunner) {
        s.h(fileSystem, "fileSystem");
        s.h(directory, "directory");
        s.h(taskRunner, "taskRunner");
        this.f42720a = directory;
        this.f42721b = i10;
        this.f42722c = i11;
        this.f42723d = new C0646f(fileSystem);
        this.f42724e = j10;
        this.f42730k = new LinkedHashMap(0, 0.75f, true);
        this.f42739t = taskRunner.k();
        this.f42740u = new e(p.f40723c + " Cache");
        if (j10 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i11 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0");
        }
        this.f42725f = directory.i(f42716w);
        this.f42726g = directory.i(f42717x);
        this.f42727h = directory.i(f42718y);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean K0() {
        int i10 = this.f42731l;
        return i10 >= 2000 && i10 >= this.f42730k.size();
    }

    private final xn.f N0() {
        return c0.b(new h(this.f42723d.a(this.f42725f), new Function1() { // from class: jn.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return f.T0(this.f42714a, (IOException) obj);
            }
        }));
    }

    private final void U0() {
        m.i(this.f42723d, this.f42726g);
        Iterator it = this.f42730k.values().iterator();
        while (it.hasNext()) {
            Object next = it.next();
            s.g(next, "next(...)");
            c cVar = (c) next;
            int i10 = 0;
            if (cVar.b() == null) {
                int i11 = this.f42722c;
                while (i10 < i11) {
                    this.f42728i += cVar.e()[i10];
                    i10++;
                }
            } else {
                cVar.l(null);
                int i12 = this.f42722c;
                while (i10 < i12) {
                    m.i(this.f42723d, (h0) cVar.a().get(i10));
                    m.i(this.f42723d, (h0) cVar.c().get(i10));
                    i10++;
                }
                it.remove();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00c3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:41:0x00c4  */
    private final void V0() throws Throwable {
        xn.g gVarC = c0.c(this.f42723d.i0(this.f42725f));
        try {
            String strR = gVarC.R();
            String strR2 = gVarC.R();
            String strR3 = gVarC.R();
            String strR4 = gVarC.R();
            String strR5 = gVarC.R();
            if (!s.c(f42719z, strR) || !s.c(A, strR2) || !s.c(String.valueOf(this.f42721b), strR3) || !s.c(String.valueOf(this.f42722c), strR4) || strR5.length() > 0) {
                throw new IOException("unexpected journal header: [" + strR + ", " + strR2 + ", " + strR4 + ", " + strR5 + ']');
            }
            int i10 = 0;
            while (true) {
                try {
                    W0(gVarC.R());
                    i10++;
                } catch (EOFException unused) {
                    this.f42731l = i10 - this.f42730k.size();
                    if (gVarC.n0()) {
                        xn.f fVar = this.f42729j;
                        if (fVar != null) {
                            m.f(fVar);
                        }
                        this.f42729j = N0();
                    } else {
                        X0();
                    }
                    g0 g0Var = g0.f38750a;
                    if (gVarC != null) {
                        try {
                            gVarC.close();
                        } catch (Throwable th2) {
                            th = th2;
                            if (th != null) {
                                throw th;
                            }
                        }
                    }
                    th = null;
                    if (th != null) {
                        throw th;
                    }
                }
            }
        } catch (Throwable th3) {
            th = th3;
            if (gVarC != null) {
                try {
                    gVarC.close();
                } catch (Throwable th4) {
                    fl.e.a(th, th4);
                }
            }
            if (th != null) {
                throw th;
            }
        }
    }

    private final void W0(String str) throws IOException {
        String strSubstring;
        int iE0 = r.e0(str, ' ', 0, false, 6, null);
        if (iE0 == -1) {
            throw new IOException("unexpected journal line: " + str);
        }
        int i10 = iE0 + 1;
        int iE1 = r.e0(str, ' ', i10, false, 4, null);
        if (iE1 == -1) {
            strSubstring = str.substring(i10);
            s.g(strSubstring, "substring(...)");
            String str2 = F;
            if (iE0 == str2.length() && r.N(str, str2, false, 2, null)) {
                this.f42730k.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i10, iE1);
            s.g(strSubstring, "substring(...)");
        }
        c cVar = (c) this.f42730k.get(strSubstring);
        if (cVar == null) {
            cVar = new c(this, strSubstring);
            this.f42730k.put(strSubstring, cVar);
        }
        if (iE1 != -1) {
            String str3 = D;
            if (iE0 == str3.length() && r.N(str, str3, false, 2, null)) {
                String strSubstring2 = str.substring(iE1 + 1);
                s.g(strSubstring2, "substring(...)");
                List listE0 = r.E0(strSubstring2, new char[]{' '}, false, 0, 6, null);
                cVar.o(true);
                cVar.l(null);
                cVar.m(listE0);
                return;
            }
        }
        if (iE1 == -1) {
            String str4 = E;
            if (iE0 == str4.length() && r.N(str, str4, false, 2, null)) {
                cVar.l(new b(this, cVar));
                return;
            }
        }
        if (iE1 == -1) {
            String str5 = G;
            if (iE0 == str5.length() && r.N(str, str5, false, 2, null)) {
                return;
            }
        }
        throw new IOException("unexpected journal line: " + str);
    }

    private final boolean a1() {
        for (Object obj : this.f42730k.values()) {
            s.g(obj, "next(...)");
            c cVar = (c) obj;
            if (!cVar.i()) {
                Z0(cVar);
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ b c0(f fVar, String str, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = B;
        }
        return fVar.t(str, j10);
    }

    private final void c1(String str) {
        if (C.h(str)) {
            return;
        }
        throw new IllegalArgumentException(("keys must match regex [a-z0-9_-]{1,120}: \"" + str + '\"').toString());
    }

    private final synchronized void q() {
        if (this.f42735p) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public final synchronized void F0() {
        try {
            if (p.f40722b && !Thread.holdsLock(this)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
            }
            if (this.f42734o) {
                return;
            }
            if (this.f42723d.q(this.f42727h)) {
                if (this.f42723d.q(this.f42725f)) {
                    this.f42723d.l(this.f42727h);
                } else {
                    this.f42723d.d(this.f42727h, this.f42725f);
                }
            }
            this.f42733n = m.x(this.f42723d, this.f42727h);
            if (this.f42723d.q(this.f42725f)) {
                try {
                    V0();
                    U0();
                    this.f42734o = true;
                    return;
                } catch (IOException e10) {
                    okhttp3.internal.platform.c.f48992a.e().m("DiskLruCache " + this.f42720a + " is corrupt: " + e10.getMessage() + ", removing", 5, e10);
                    try {
                        s();
                        this.f42735p = false;
                        X0();
                        this.f42734o = true;
                    } catch (Throwable th2) {
                        this.f42735p = false;
                        throw th2;
                    }
                }
            }
            X0();
            this.f42734o = true;
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final synchronized void X0() {
        Throwable th2;
        try {
            xn.f fVar = this.f42729j;
            if (fVar != null) {
                fVar.close();
            }
            xn.f fVarB = c0.b(this.f42723d.g0(this.f42726g, false));
            try {
                fVarB.N(f42719z).writeByte(10);
                fVarB.N(A).writeByte(10);
                fVarB.a0(this.f42721b).writeByte(10);
                fVarB.a0(this.f42722c).writeByte(10);
                fVarB.writeByte(10);
                for (Object obj : this.f42730k.values()) {
                    s.g(obj, "next(...)");
                    c cVar = (c) obj;
                    if (cVar.b() != null) {
                        fVarB.N(E).writeByte(32);
                        fVarB.N(cVar.d());
                        fVarB.writeByte(10);
                    } else {
                        fVarB.N(D).writeByte(32);
                        fVarB.N(cVar.d());
                        cVar.s(fVarB);
                        fVarB.writeByte(10);
                    }
                }
                g0 g0Var = g0.f38750a;
                if (fVarB != null) {
                    try {
                        fVarB.close();
                    } catch (Throwable th3) {
                        th2 = th3;
                    }
                }
                th2 = null;
            } catch (Throwable th4) {
                if (fVarB != null) {
                    try {
                        fVarB.close();
                    } catch (Throwable th5) {
                        fl.e.a(th4, th5);
                    }
                }
                th2 = th4;
            }
            if (th2 != null) {
                throw th2;
            }
            if (this.f42723d.q(this.f42725f)) {
                this.f42723d.d(this.f42725f, this.f42727h);
                this.f42723d.d(this.f42726g, this.f42725f);
                m.i(this.f42723d, this.f42727h);
            } else {
                this.f42723d.d(this.f42726g, this.f42725f);
            }
            xn.f fVar2 = this.f42729j;
            if (fVar2 != null) {
                m.f(fVar2);
            }
            this.f42729j = N0();
            this.f42732m = false;
            this.f42737r = false;
        } catch (Throwable th6) {
            throw th6;
        }
    }

    public final synchronized boolean Y0(String key) {
        s.h(key, "key");
        F0();
        q();
        c1(key);
        c cVar = (c) this.f42730k.get(key);
        if (cVar == null) {
            return false;
        }
        boolean zZ0 = Z0(cVar);
        if (zZ0 && this.f42728i <= this.f42724e) {
            this.f42736q = false;
        }
        return zZ0;
    }

    public final boolean Z0(c entry) {
        xn.f fVar;
        s.h(entry, "entry");
        if (!this.f42733n) {
            if (entry.f() > 0 && (fVar = this.f42729j) != null) {
                fVar.N(E);
                fVar.writeByte(32);
                fVar.N(entry.d());
                fVar.writeByte(10);
                fVar.flush();
            }
            if (entry.f() > 0 || entry.b() != null) {
                entry.q(true);
                return true;
            }
        }
        b bVarB = entry.b();
        if (bVarB != null) {
            bVarB.d();
        }
        int i10 = this.f42722c;
        for (int i11 = 0; i11 < i10; i11++) {
            m.i(this.f42723d, (h0) entry.a().get(i11));
            this.f42728i -= entry.e()[i11];
            entry.e()[i11] = 0;
        }
        this.f42731l++;
        xn.f fVar2 = this.f42729j;
        if (fVar2 != null) {
            fVar2.N(F);
            fVar2.writeByte(32);
            fVar2.N(entry.d());
            fVar2.writeByte(10);
        }
        this.f42730k.remove(entry.d());
        if (K0()) {
            kn.c.m(this.f42739t, this.f42740u, 0L, 2, null);
        }
        return true;
    }

    public final void b1() {
        while (this.f42728i > this.f42724e) {
            if (!a1()) {
                return;
            }
        }
        this.f42736q = false;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        b bVarB;
        try {
            if (this.f42734o && !this.f42735p) {
                Collection collectionValues = this.f42730k.values();
                s.g(collectionValues, "<get-values>(...)");
                for (c cVar : (c[]) collectionValues.toArray(new c[0])) {
                    s.e(cVar);
                    if (cVar.b() != null && (bVarB = cVar.b()) != null) {
                        bVarB.d();
                    }
                }
                b1();
                xn.f fVar = this.f42729j;
                if (fVar != null) {
                    m.f(fVar);
                }
                this.f42729j = null;
                this.f42735p = true;
                return;
            }
            this.f42735p = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized d d0(String key) {
        s.h(key, "key");
        F0();
        q();
        c1(key);
        c cVar = (c) this.f42730k.get(key);
        if (cVar == null) {
            return null;
        }
        d dVarR = cVar.r();
        if (dVarR == null) {
            return null;
        }
        this.f42731l++;
        xn.f fVar = this.f42729j;
        s.e(fVar);
        fVar.N(G).writeByte(32).N(key).writeByte(10);
        if (K0()) {
            kn.c.m(this.f42739t, this.f42740u, 0L, 2, null);
        }
        return dVarR;
    }

    @Override // java.io.Flushable
    public synchronized void flush() {
        if (this.f42734o) {
            q();
            b1();
            xn.f fVar = this.f42729j;
            s.e(fVar);
            fVar.flush();
        }
    }

    public final boolean g0() {
        return this.f42735p;
    }

    public final h0 i0() {
        return this.f42720a;
    }

    public final l m0() {
        return this.f42723d;
    }

    public final int p0() {
        return this.f42722c;
    }

    public final synchronized void r(b editor, boolean z10) {
        s.h(editor, "editor");
        c cVarE = editor.e();
        if (!s.c(cVarE.b(), editor)) {
            throw new IllegalStateException("Check failed.");
        }
        if (z10 && !cVarE.g()) {
            int i10 = this.f42722c;
            for (int i11 = 0; i11 < i10; i11++) {
                boolean[] zArrF = editor.f();
                s.e(zArrF);
                if (!zArrF[i11]) {
                    editor.b();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i11);
                }
                if (!this.f42723d.q((h0) cVarE.c().get(i11))) {
                    editor.b();
                    return;
                }
            }
        }
        int i12 = this.f42722c;
        for (int i13 = 0; i13 < i12; i13++) {
            h0 h0Var = (h0) cVarE.c().get(i13);
            if (!z10 || cVarE.i()) {
                m.i(this.f42723d, h0Var);
            } else if (this.f42723d.q(h0Var)) {
                h0 h0Var2 = (h0) cVarE.a().get(i13);
                this.f42723d.d(h0Var, h0Var2);
                long j10 = cVarE.e()[i13];
                Long lC = this.f42723d.s(h0Var2).c();
                long jLongValue = lC != null ? lC.longValue() : 0L;
                cVarE.e()[i13] = jLongValue;
                this.f42728i = (this.f42728i - j10) + jLongValue;
            }
        }
        cVarE.l(null);
        if (cVarE.i()) {
            Z0(cVarE);
            return;
        }
        this.f42731l++;
        xn.f fVar = this.f42729j;
        s.e(fVar);
        if (cVarE.g() || z10) {
            cVarE.o(true);
            fVar.N(D).writeByte(32);
            fVar.N(cVarE.d());
            cVarE.s(fVar);
            fVar.writeByte(10);
            if (z10) {
                long j11 = this.f42738s;
                this.f42738s = 1 + j11;
                cVarE.p(j11);
            }
        } else {
            this.f42730k.remove(cVarE.d());
            fVar.N(F).writeByte(32);
            fVar.N(cVarE.d());
            fVar.writeByte(10);
        }
        fVar.flush();
        if (this.f42728i > this.f42724e || K0()) {
            kn.c.m(this.f42739t, this.f42740u, 0L, 2, null);
        }
    }

    public final void s() throws IOException {
        close();
        m.h(this.f42723d, this.f42720a);
    }

    public final synchronized b t(String key, long j10) {
        s.h(key, "key");
        F0();
        q();
        c1(key);
        c cVar = (c) this.f42730k.get(key);
        if (j10 != B && (cVar == null || cVar.h() != j10)) {
            return null;
        }
        if ((cVar != null ? cVar.b() : null) != null) {
            return null;
        }
        if (cVar != null && cVar.f() != 0) {
            return null;
        }
        if (!this.f42736q && !this.f42737r) {
            xn.f fVar = this.f42729j;
            s.e(fVar);
            fVar.N(E).writeByte(32).N(key).writeByte(10);
            fVar.flush();
            if (this.f42732m) {
                return null;
            }
            if (cVar == null) {
                cVar = new c(this, key);
                this.f42730k.put(key, cVar);
            }
            b bVar = new b(this, cVar);
            cVar.l(bVar);
            return bVar;
        }
        kn.c.m(this.f42739t, this.f42740u, 0L, 2, null);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g0 T0(f fVar, IOException iOException) {
        s.h(iOException, OGoz.MUQA);
        if (!p.f40722b || Thread.holdsLock(fVar)) {
            fVar.f42732m = true;
            return g0.f38750a;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + fVar);
    }
}
