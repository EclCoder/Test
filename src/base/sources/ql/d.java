package ql;

import com.bytedance.adsdk.ugeno.dkl.Rmg.PvZsvNiPV;
import java.io.File;
import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.io.AccessDeniedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import tl.o;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class d implements am.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f50890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f50891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Function1 f50892c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Function1 f50893d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final o f50894e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f50895f;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static abstract class a extends c {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(File rootDir) {
            super(rootDir);
            s.h(rootDir, "rootDir");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private final class b extends gl.c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ArrayDeque f50896c;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        private final class a extends a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private boolean f50898b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private File[] f50899c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f50900d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private boolean f50901e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ b f50902f;

            @Override // ql.d.c
            public File b() {
                if (!this.f50901e && this.f50899c == null) {
                    Function1 function1 = d.this.f50892c;
                    if (function1 != null && !((Boolean) function1.invoke(a())).booleanValue()) {
                        return null;
                    }
                    File[] fileArrListFiles = a().listFiles();
                    this.f50899c = fileArrListFiles;
                    if (fileArrListFiles == null) {
                        o oVar = d.this.f50894e;
                        if (oVar != null) {
                            oVar.invoke(a(), new AccessDeniedException(a(), null, "Cannot list files in a directory", 2, null));
                        }
                        this.f50901e = true;
                    }
                }
                File[] fileArr = this.f50899c;
                if (fileArr != null) {
                    int i10 = this.f50900d;
                    s.e(fileArr);
                    if (i10 < fileArr.length) {
                        File[] fileArr2 = this.f50899c;
                        s.e(fileArr2);
                        int i11 = this.f50900d;
                        this.f50900d = i11 + 1;
                        return fileArr2[i11];
                    }
                }
                if (!this.f50898b) {
                    this.f50898b = true;
                    return a();
                }
                Function1 function2 = d.this.f50893d;
                if (function2 != null) {
                    function2.invoke(a());
                }
                return null;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b bVar, File file) {
                super(file);
                s.h(file, PvZsvNiPV.lODpYOioa);
                this.f50902f = bVar;
            }
        }

        /* JADX INFO: renamed from: ql.d$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        private final class C0786b extends c {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private boolean f50903b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ b f50904c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0786b(b bVar, File rootFile) {
                super(rootFile);
                s.h(rootFile, "rootFile");
                this.f50904c = bVar;
            }

            @Override // ql.d.c
            public File b() {
                if (this.f50903b) {
                    return null;
                }
                this.f50903b = true;
                return a();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        private final class c extends a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private boolean f50905b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private File[] f50906c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f50907d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ b f50908e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(b bVar, File rootDir) {
                super(rootDir);
                s.h(rootDir, "rootDir");
                this.f50908e = bVar;
            }

            /* JADX WARN: Code restructure failed: missing block: B:30:0x007e, code lost:
            
                if (r0.length == 0) goto L31;
             */
            @Override // ql.d.c
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public java.io.File b() {
                /*
                    r9 = this;
                    boolean r0 = r9.f50905b
                    r1 = 0
                    if (r0 != 0) goto L28
                    ql.d$b r0 = r9.f50908e
                    ql.d r0 = ql.d.this
                    kotlin.jvm.functions.Function1 r0 = ql.d.d(r0)
                    if (r0 == 0) goto L20
                    java.io.File r2 = r9.a()
                    java.lang.Object r0 = r0.invoke(r2)
                    java.lang.Boolean r0 = (java.lang.Boolean) r0
                    boolean r0 = r0.booleanValue()
                    if (r0 != 0) goto L20
                    return r1
                L20:
                    r0 = 1
                    r9.f50905b = r0
                    java.io.File r0 = r9.a()
                    return r0
                L28:
                    java.io.File[] r0 = r9.f50906c
                    if (r0 == 0) goto L47
                    int r2 = r9.f50907d
                    kotlin.jvm.internal.s.e(r0)
                    int r0 = r0.length
                    if (r2 >= r0) goto L35
                    goto L47
                L35:
                    ql.d$b r0 = r9.f50908e
                    ql.d r0 = ql.d.this
                    kotlin.jvm.functions.Function1 r0 = ql.d.f(r0)
                    if (r0 == 0) goto L46
                    java.io.File r2 = r9.a()
                    r0.invoke(r2)
                L46:
                    return r1
                L47:
                    java.io.File[] r0 = r9.f50906c
                    if (r0 != 0) goto L92
                    java.io.File r0 = r9.a()
                    java.io.File[] r0 = r0.listFiles()
                    r9.f50906c = r0
                    if (r0 != 0) goto L76
                    ql.d$b r0 = r9.f50908e
                    ql.d r0 = ql.d.this
                    tl.o r0 = ql.d.e(r0)
                    if (r0 == 0) goto L76
                    java.io.File r2 = r9.a()
                    kotlin.io.AccessDeniedException r3 = new kotlin.io.AccessDeniedException
                    java.io.File r4 = r9.a()
                    r7 = 2
                    r8 = 0
                    r5 = 0
                    java.lang.String r6 = "Cannot list files in a directory"
                    r3.<init>(r4, r5, r6, r7, r8)
                    r0.invoke(r2, r3)
                L76:
                    java.io.File[] r0 = r9.f50906c
                    if (r0 == 0) goto L80
                    kotlin.jvm.internal.s.e(r0)
                    int r0 = r0.length
                    if (r0 != 0) goto L92
                L80:
                    ql.d$b r0 = r9.f50908e
                    ql.d r0 = ql.d.this
                    kotlin.jvm.functions.Function1 r0 = ql.d.f(r0)
                    if (r0 == 0) goto L91
                    java.io.File r2 = r9.a()
                    r0.invoke(r2)
                L91:
                    return r1
                L92:
                    java.io.File[] r0 = r9.f50906c
                    kotlin.jvm.internal.s.e(r0)
                    int r1 = r9.f50907d
                    int r2 = r1 + 1
                    r9.f50907d = r2
                    r0 = r0[r1]
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: ql.d.b.c.b():java.io.File");
            }
        }

        /* JADX INFO: renamed from: ql.d$b$d, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final /* synthetic */ class C0787d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f50909a;

            static {
                int[] iArr = new int[e.values().length];
                try {
                    iArr[e.TOP_DOWN.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[e.BOTTOM_UP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f50909a = iArr;
            }
        }

        public b() {
            ArrayDeque arrayDeque = new ArrayDeque();
            this.f50896c = arrayDeque;
            if (d.this.f50890a.isDirectory()) {
                arrayDeque.push(f(d.this.f50890a));
            } else if (d.this.f50890a.isFile()) {
                arrayDeque.push(new C0786b(this, d.this.f50890a));
            } else {
                b();
            }
        }

        private final a f(File file) {
            int i10 = C0787d.f50909a[d.this.f50891b.ordinal()];
            if (i10 == 1) {
                return new c(this, file);
            }
            if (i10 == 2) {
                return new a(this, file);
            }
            throw new NoWhenBranchMatchedException();
        }

        private final File g() {
            while (true) {
                c cVar = (c) this.f50896c.peek();
                if (cVar == null) {
                    return null;
                }
                File fileB = cVar.b();
                if (fileB == null) {
                    this.f50896c.pop();
                } else {
                    if (s.c(fileB, cVar.a()) || !fileB.isDirectory() || this.f50896c.size() >= d.this.f50895f) {
                        return fileB;
                    }
                    this.f50896c.push(f(fileB));
                }
            }
        }

        @Override // gl.c
        protected void a() {
            File fileG = g();
            if (fileG != null) {
                c(fileG);
            } else {
                b();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static abstract class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final File f50910a;

        public c(File root) {
            s.h(root, "root");
            this.f50910a = root;
        }

        public final File a() {
            return this.f50910a;
        }

        public abstract File b();
    }

    private d(File file, e eVar, Function1 function1, Function1 function2, o oVar, int i10) {
        this.f50890a = file;
        this.f50891b = eVar;
        this.f50892c = function1;
        this.f50893d = function2;
        this.f50894e = oVar;
        this.f50895f = i10;
    }

    @Override // am.g
    public Iterator iterator() {
        return new b();
    }

    /* synthetic */ d(File file, e eVar, Function1 function1, Function1 function2, o oVar, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, (i11 & 2) != 0 ? e.TOP_DOWN : eVar, function1, function2, oVar, (i11 & 32) != 0 ? Integer.MAX_VALUE : i10);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(File start, e direction) {
        this(start, direction, null, null, null, 0, 32, null);
        s.h(start, "start");
        s.h(direction, "direction");
    }
}
