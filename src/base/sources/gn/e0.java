package gn;

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import kotlin.jvm.internal.DefaultConstructorMarker;
import vl.Rlkc.CIdIVqKnNZ;
import xn.q0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class e0 {
    public static final a Companion;
    public static final e0 EMPTY;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {

        /* JADX INFO: renamed from: gn.e0$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class C0595a extends e0 {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a0 f39566b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ File f39567c;

            C0595a(a0 a0Var, File file) {
                this.f39566b = a0Var;
                this.f39567c = file;
            }

            @Override // gn.e0
            public long contentLength() {
                return this.f39567c.length();
            }

            @Override // gn.e0
            public a0 contentType() {
                return this.f39566b;
            }

            @Override // gn.e0
            public void writeTo(xn.f sink) throws IOException {
                kotlin.jvm.internal.s.h(sink, "sink");
                q0 q0VarH = xn.c0.h(this.f39567c);
                try {
                    sink.C0(q0VarH);
                    ql.b.a(q0VarH, null);
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        ql.b.a(q0VarH, th2);
                        throw th3;
                    }
                }
            }
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class b extends e0 {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a0 f39568b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ xn.l f39569c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ xn.h0 f39570d;

            b(a0 a0Var, xn.l lVar, xn.h0 h0Var) {
                this.f39568b = a0Var;
                this.f39569c = lVar;
                this.f39570d = h0Var;
            }

            @Override // gn.e0
            public long contentLength() {
                Long lC = this.f39569c.s(this.f39570d).c();
                if (lC != null) {
                    return lC.longValue();
                }
                return -1L;
            }

            @Override // gn.e0
            public a0 contentType() {
                return this.f39568b;
            }

            @Override // gn.e0
            public void writeTo(xn.f sink) throws IOException {
                kotlin.jvm.internal.s.h(sink, "sink");
                q0 q0VarI0 = this.f39569c.i0(this.f39570d);
                try {
                    sink.C0(q0VarI0);
                    ql.b.a(q0VarI0, null);
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        ql.b.a(q0VarI0, th2);
                        throw th3;
                    }
                }
            }
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class c extends e0 {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a0 f39571b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ xn.h f39572c;

            c(a0 a0Var, xn.h hVar) {
                this.f39571b = a0Var;
                this.f39572c = hVar;
            }

            @Override // gn.e0
            public long contentLength() {
                return this.f39572c.D();
            }

            @Override // gn.e0
            public a0 contentType() {
                return this.f39571b;
            }

            @Override // gn.e0
            public void writeTo(xn.f sink) {
                kotlin.jvm.internal.s.h(sink, "sink");
                sink.k0(this.f39572c);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class d extends e0 {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a0 f39573b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ FileDescriptor f39574c;

            d(a0 a0Var, FileDescriptor fileDescriptor) {
                this.f39573b = a0Var;
                this.f39574c = fileDescriptor;
            }

            @Override // gn.e0
            public a0 contentType() {
                return this.f39573b;
            }

            @Override // gn.e0
            public boolean isOneShot() {
                return true;
            }

            @Override // gn.e0
            public void writeTo(xn.f sink) throws IOException {
                kotlin.jvm.internal.s.h(sink, "sink");
                FileInputStream fileInputStream = new FileInputStream(this.f39574c);
                try {
                    sink.u().C0(xn.c0.i(fileInputStream));
                    ql.b.a(fileInputStream, null);
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        ql.b.a(fileInputStream, th2);
                        throw th3;
                    }
                }
            }
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class e extends e0 {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a0 f39575b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f39576c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ byte[] f39577d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ int f39578e;

            e(a0 a0Var, int i10, byte[] bArr, int i11) {
                this.f39575b = a0Var;
                this.f39576c = i10;
                this.f39577d = bArr;
                this.f39578e = i11;
            }

            @Override // gn.e0
            public long contentLength() {
                return this.f39576c;
            }

            @Override // gn.e0
            public a0 contentType() {
                return this.f39575b;
            }

            @Override // gn.e0
            public void writeTo(xn.f sink) {
                kotlin.jvm.internal.s.h(sink, "sink");
                sink.write(this.f39577d, this.f39578e, this.f39576c);
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ e0 p(a aVar, a0 a0Var, byte[] bArr, int i10, int i11, int i12, Object obj) {
            if ((i12 & 4) != 0) {
                i10 = 0;
            }
            if ((i12 & 8) != 0) {
                i11 = bArr.length;
            }
            return aVar.f(a0Var, bArr, i10, i11);
        }

        public static /* synthetic */ e0 q(a aVar, xn.h hVar, a0 a0Var, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                a0Var = null;
            }
            return aVar.j(hVar, a0Var);
        }

        public static /* synthetic */ e0 r(a aVar, byte[] bArr, a0 a0Var, int i10, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                a0Var = null;
            }
            if ((i12 & 2) != 0) {
                i10 = 0;
            }
            if ((i12 & 4) != 0) {
                i11 = bArr.length;
            }
            return aVar.o(bArr, a0Var, i10, i11);
        }

        public final e0 a(a0 a0Var, File file) {
            kotlin.jvm.internal.s.h(file, "file");
            return g(file, a0Var);
        }

        public final e0 b(a0 a0Var, String content) {
            kotlin.jvm.internal.s.h(content, "content");
            return i(content, a0Var);
        }

        public final e0 c(a0 a0Var, xn.h content) {
            kotlin.jvm.internal.s.h(content, "content");
            return j(content, a0Var);
        }

        public final e0 d(a0 a0Var, byte[] content) {
            kotlin.jvm.internal.s.h(content, "content");
            return p(this, a0Var, content, 0, 0, 12, null);
        }

        public final e0 e(a0 a0Var, byte[] content, int i10) {
            kotlin.jvm.internal.s.h(content, "content");
            return p(this, a0Var, content, i10, 0, 8, null);
        }

        public final e0 g(File file, a0 a0Var) {
            kotlin.jvm.internal.s.h(file, "<this>");
            return new C0595a(a0Var, file);
        }

        public final e0 h(FileDescriptor fileDescriptor, a0 a0Var) {
            kotlin.jvm.internal.s.h(fileDescriptor, "<this>");
            return new d(a0Var, fileDescriptor);
        }

        public final e0 i(String str, a0 a0Var) {
            kotlin.jvm.internal.s.h(str, "<this>");
            fl.q qVarB = hn.b.b(a0Var);
            Charset charset = (Charset) qVarB.d();
            a0 a0Var2 = (a0) qVarB.g();
            byte[] bytes = str.getBytes(charset);
            kotlin.jvm.internal.s.g(bytes, "getBytes(...)");
            return o(bytes, a0Var2, 0, bytes.length);
        }

        public final e0 j(xn.h hVar, a0 a0Var) {
            kotlin.jvm.internal.s.h(hVar, "<this>");
            return new c(a0Var, hVar);
        }

        public final e0 k(xn.h0 h0Var, xn.l fileSystem, a0 a0Var) {
            kotlin.jvm.internal.s.h(h0Var, "<this>");
            kotlin.jvm.internal.s.h(fileSystem, "fileSystem");
            return new b(a0Var, fileSystem, h0Var);
        }

        public final e0 l(byte[] bArr) {
            kotlin.jvm.internal.s.h(bArr, "<this>");
            return r(this, bArr, null, 0, 0, 7, null);
        }

        public final e0 m(byte[] bArr, a0 a0Var) {
            kotlin.jvm.internal.s.h(bArr, "<this>");
            return r(this, bArr, a0Var, 0, 0, 6, null);
        }

        public final e0 n(byte[] bArr, a0 a0Var, int i10) {
            kotlin.jvm.internal.s.h(bArr, "<this>");
            return r(this, bArr, a0Var, i10, 0, 4, null);
        }

        public final e0 o(byte[] bArr, a0 a0Var, int i10, int i11) {
            kotlin.jvm.internal.s.h(bArr, "<this>");
            hn.m.e(bArr.length, i10, i11);
            return new e(a0Var, i11, bArr, i10);
        }

        private a() {
        }

        public final e0 f(a0 a0Var, byte[] bArr, int i10, int i11) {
            kotlin.jvm.internal.s.h(bArr, CIdIVqKnNZ.cysMiAd);
            return o(bArr, a0Var, i10, i11);
        }
    }

    static {
        a aVar = new a(null);
        Companion = aVar;
        EMPTY = a.q(aVar, xn.h.f56913e, null, 1, null);
    }

    public static final e0 create(a0 a0Var, File file) {
        return Companion.a(a0Var, file);
    }

    public long contentLength() {
        return -1L;
    }

    public abstract a0 contentType();

    public boolean isDuplex() {
        return false;
    }

    public boolean isOneShot() {
        return false;
    }

    public final xn.h sha256() throws IOException {
        xn.s sVarA = xn.s.f56984d.a(xn.c0.a());
        xn.f fVarB = xn.c0.b(sVarA);
        try {
            writeTo(fVarB);
            fl.g0 g0Var = fl.g0.f38750a;
            ql.b.a(fVarB, null);
            return sVarA.d();
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                ql.b.a(fVarB, th2);
                throw th3;
            }
        }
    }

    public abstract void writeTo(xn.f fVar);

    public static final e0 create(a0 a0Var, String str) {
        return Companion.b(a0Var, str);
    }

    public static final e0 create(a0 a0Var, xn.h hVar) {
        return Companion.c(a0Var, hVar);
    }

    public static final e0 create(a0 a0Var, byte[] bArr) {
        return Companion.d(a0Var, bArr);
    }

    public static final e0 create(a0 a0Var, byte[] bArr, int i10) {
        return Companion.e(a0Var, bArr, i10);
    }

    public static final e0 create(a0 a0Var, byte[] bArr, int i10, int i11) {
        return Companion.f(a0Var, bArr, i10, i11);
    }

    public static final e0 create(File file, a0 a0Var) {
        return Companion.g(file, a0Var);
    }

    public static final e0 create(FileDescriptor fileDescriptor, a0 a0Var) {
        return Companion.h(fileDescriptor, a0Var);
    }

    public static final e0 create(String str, a0 a0Var) {
        return Companion.i(str, a0Var);
    }

    public static final e0 create(xn.h hVar, a0 a0Var) {
        return Companion.j(hVar, a0Var);
    }

    public static final e0 create(xn.h0 h0Var, xn.l lVar, a0 a0Var) {
        return Companion.k(h0Var, lVar, a0Var);
    }

    public static final e0 create(byte[] bArr) {
        return Companion.l(bArr);
    }

    public static final e0 create(byte[] bArr, a0 a0Var) {
        return Companion.m(bArr, a0Var);
    }

    public static final e0 create(byte[] bArr, a0 a0Var, int i10) {
        return Companion.n(bArr, a0Var, i10);
    }

    public static final e0 create(byte[] bArr, a0 a0Var, int i10, int i11) {
        return Companion.o(bArr, a0Var, i10, i11);
    }
}
