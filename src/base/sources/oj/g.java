package oj;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class g {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f48951f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private e f48952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f48953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f48954c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private f f48955d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f48956e;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {

        /* JADX INFO: renamed from: oj.g$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public /* synthetic */ class C0754a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f48957a;

            static {
                int[] iArr = new int[nj.b.values().length];
                try {
                    iArr[nj.b.TYPE_0.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[nj.b.TYPE_1.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[nj.b.TYPE_2.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[nj.b.TYPE_3.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f48957a = iArr;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ g b(a aVar, InputStream inputStream, tj.c cVar, int i10, int i11, Object obj) {
            if ((i11 & 4) != 0) {
                i10 = 0;
            }
            return aVar.a(inputStream, cVar, i10);
        }

        public final g a(InputStream input, tj.c commandSessionHistory, int i10) throws IOException {
            int iD;
            f fVarB;
            int iF;
            s.h(input, "input");
            s.h(commandSessionHistory, "commandSessionHistory");
            e eVarA = e.f48929c.a(input);
            g gVarA = commandSessionHistory.a(eVarA.a());
            int i11 = C0754a.f48957a[eVarA.b().ordinal()];
            if (i11 != 1) {
                iD = 0;
                if (i11 != 2) {
                    fVarB = null;
                    if (i11 == 3) {
                        if (gVarA != null) {
                            iD = gVarA.b();
                            fVarB = gVarA.d();
                            iF = gVarA.c();
                        } else {
                            iF = 0;
                        }
                        i10 = tj.e.d(input);
                        if (i10 >= 16777215) {
                            i10 = tj.e.e(input);
                        }
                    } else {
                        if (i11 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        if (gVarA != null) {
                            i10 = gVarA.f();
                            iD = gVarA.b();
                            fVarB = gVarA.d();
                            iF = gVarA.c();
                        } else {
                            iF = 0;
                        }
                        if (i10 >= 16777215) {
                            i10 = tj.e.e(input);
                        }
                    }
                } else {
                    iD = gVarA != null ? gVarA.c() : 0;
                    i10 = tj.e.d(input);
                    int iD2 = tj.e.d(input);
                    fVarB = i.f48961b.b(input.read());
                    if (i10 >= 16777215) {
                        i10 = tj.e.e(input);
                    }
                    int i12 = iD;
                    iD = iD2;
                    iF = i12;
                }
            } else {
                i10 = tj.e.d(input);
                iD = tj.e.d(input);
                fVarB = i.f48961b.b(input.read());
                iF = tj.e.f(input);
                if (i10 >= 16777215) {
                    i10 = tj.e.e(input);
                }
            }
            g gVar = new g(eVarA);
            gVar.k(i10);
            gVar.h(iD);
            gVar.j(fVarB);
            gVar.i(iF);
            return gVar;
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f48958a;

        static {
            int[] iArr = new int[nj.b.values().length];
            try {
                iArr[nj.b.TYPE_0.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[nj.b.TYPE_1.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[nj.b.TYPE_2.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[nj.b.TYPE_3.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f48958a = iArr;
        }
    }

    public g(e basicHeader) {
        s.h(basicHeader, "basicHeader");
        this.f48952a = basicHeader;
    }

    public final e a() {
        return this.f48952a;
    }

    public final int b() {
        return this.f48954c;
    }

    public final int c() {
        return this.f48956e;
    }

    public final f d() {
        return this.f48955d;
    }

    public final int e() {
        return this.f48954c + this.f48952a.c(this.f48953b);
    }

    public final int f() {
        return this.f48953b;
    }

    public final void g(e eVar) {
        s.h(eVar, "<set-?>");
        this.f48952a = eVar;
    }

    public final void h(int i10) {
        this.f48954c = i10;
    }

    public final void i(int i10) {
        this.f48956e = i10;
    }

    public final void j(f fVar) {
        this.f48955d = fVar;
    }

    public final void k(int i10) {
        this.f48953b = i10;
    }

    public final void l(OutputStream output) throws IOException {
        s.h(output, "output");
        m(this.f48952a, output);
    }

    public final void m(e basicHeader, OutputStream output) throws IOException {
        s.h(basicHeader, "basicHeader");
        s.h(output, "output");
        output.write((basicHeader.b().h() << 6) | basicHeader.a());
        int i10 = b.f48958a[basicHeader.b().ordinal()];
        if (i10 == 1) {
            tj.e.k(output, Math.min(this.f48953b, 16777215));
            tj.e.k(output, this.f48954c);
            f fVar = this.f48955d;
            if (fVar != null) {
                output.write(fVar.h());
            }
            tj.e.m(output, this.f48956e);
            int i11 = this.f48953b;
            if (i11 > 16777215) {
                tj.e.l(output, i11);
                return;
            }
            return;
        }
        if (i10 == 2) {
            tj.e.k(output, Math.min(this.f48953b, 16777215));
            tj.e.k(output, this.f48954c);
            f fVar2 = this.f48955d;
            if (fVar2 != null) {
                output.write(fVar2.h());
            }
            int i12 = this.f48953b;
            if (i12 > 16777215) {
                tj.e.l(output, i12);
                return;
            }
            return;
        }
        if (i10 == 3) {
            tj.e.k(output, Math.min(this.f48953b, 16777215));
            int i13 = this.f48953b;
            if (i13 > 16777215) {
                tj.e.l(output, i13);
                return;
            }
            return;
        }
        if (i10 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        int i14 = this.f48953b;
        if (i14 > 16777215) {
            tj.e.l(output, i14);
        }
    }

    public String toString() {
        return "RtmpHeader(timeStamp=" + this.f48953b + ", messageLength=" + this.f48954c + ", messageType=" + this.f48955d + ", messageStreamId=" + this.f48956e + ", basicHeader=" + this.f48952a + ")";
    }
}
