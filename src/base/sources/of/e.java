package of;

import android.content.Context;
import android.content.res.AssetManager;
import bm.r;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.CacheDataSource;
import em.c1;
import em.p0;
import fl.g0;
import fl.v;
import gl.j;
import gm.q;
import gm.u;
import gn.b0;
import gn.d0;
import gn.f0;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ConnectException;
import java.net.NoRouteToHostException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import javax.net.ssl.SSLException;
import kotlin.coroutines.jvm.internal.m;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.i0;
import kotlin.jvm.internal.s;
import tl.o;
import xn.c0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f48550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final File f48551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AssetManager f48552c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b0 f48553d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile boolean f48554e;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class a extends m implements o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f48555r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private /* synthetic */ Object f48556s;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ g f48558u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(g gVar, kl.f fVar) {
            super(2, fVar);
            this.f48558u = gVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final g0 r() {
            return g0.f38750a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CharSequence s(byte b10) {
            String str = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b10)}, 1));
            s.g(str, "format(...)");
            return str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(Object obj, kl.f fVar) {
            a aVar = e.this.new a(this.f48558u, fVar);
            aVar.f48556s = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            long jLongValue;
            int i10;
            Object objF = ll.b.f();
            int i11 = this.f48555r;
            if (i11 == 0) {
                fl.s.b(obj);
                gm.s sVar = (gm.s) this.f48556s;
                File fileJ = e.this.j(this.f48558u.c());
                File file = new File(e.this.f48551b, this.f48558u.c() + ".zip.part");
                try {
                    if (e.this.i(this.f48558u)) {
                        sVar.e(b.d.f48548a);
                        u.f(sVar, null, 1, null);
                        return g0.f38750a;
                    }
                    f0 f0VarExecute = e.this.f48553d.a(new d0.a().v(this.f48558u.g()).b()).execute();
                    if (!f0VarExecute.i0()) {
                        sVar.e(new b.C0748b(of.a.SERVER, null, 2, null));
                        u.f(sVar, null, 1, null);
                        return g0.f38750a;
                    }
                    gn.g0 g0VarD = f0VarExecute.d();
                    if (g0VarD == null) {
                        sVar.e(new b.C0748b(of.a.SERVER, null, 2, null));
                        u.f(sVar, null, 1, null);
                        return g0.f38750a;
                    }
                    Long lE = kotlin.coroutines.jvm.internal.b.e(g0VarD.contentLength());
                    if (lE.longValue() <= 0) {
                        lE = null;
                    }
                    if (lE != null) {
                        jLongValue = lE.longValue();
                    } else {
                        long jE = this.f48558u.e();
                        long j10 = UserVerificationMethods.USER_VERIFY_ALL;
                        jLongValue = jE * j10 * j10;
                    }
                    long j11 = jLongValue;
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                    xn.g gVarSource = g0VarD.source();
                    xn.f fVarB = c0.b(xn.d0.c(file, false, 1, null));
                    try {
                        byte[] bArr = new byte[8192];
                        int i12 = -1;
                        long j12 = 0;
                        for (int i13 = -1; p0.f(sVar) && (i10 = gVarSource.read(bArr)) != i13; i13 = -1) {
                            fVarB.u().write(bArr, 0, i10);
                            fVarB.C();
                            messageDigest.update(bArr, 0, i10);
                            xn.g gVar = gVarSource;
                            j12 += (long) i10;
                            int i14 = yl.g.i((int) ((((long) 100) * j12) / j11), 0, 100);
                            if (i14 != i12) {
                                sVar.e(new b.c(j12, j11, i14));
                                i12 = i14;
                            }
                            gVarSource = gVar;
                        }
                        g0 g0Var = g0.f38750a;
                        ql.b.a(fVarB, null);
                        f0VarExecute.close();
                        if (!p0.f(sVar)) {
                            file.delete();
                            u.f(sVar, null, 1, null);
                            return g0.f38750a;
                        }
                        if (!r.h0(this.f48558u.d())) {
                            sVar.e(b.e.f48549a);
                            byte[] bArrDigest = messageDigest.digest();
                            s.g(bArrDigest, "digest(...)");
                            String strK0 = j.k0(bArrDigest, "", null, null, 0, null, new Function1() { // from class: of.c
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    return e.a.s(((Byte) obj2).byteValue());
                                }
                            }, 30, null);
                            if (!r.A(strK0, this.f48558u.d(), true)) {
                                file.delete();
                                wp.a.i("Model hash mismatch: expected %s, got %s", r.e1(this.f48558u.d(), 8), r.e1(strK0, 8));
                                sVar.e(new b.C0748b(of.a.CORRUPT, null, 2, null));
                                u.f(sVar, null, 1, null);
                                return g0.f38750a;
                            }
                        }
                        if (fileJ.exists()) {
                            ql.f.o(fileJ);
                        }
                        fileJ.mkdirs();
                        i0 i0Var = new i0();
                        ZipInputStream zipInputStream = new ZipInputStream(new BufferedInputStream(new FileInputStream(file), 8192));
                        try {
                            for (ZipEntry nextEntry = zipInputStream.getNextEntry(); nextEntry != null && p0.f(sVar); nextEntry = zipInputStream.getNextEntry()) {
                                File file2 = new File(fileJ, nextEntry.getName());
                                String canonicalPath = file2.getCanonicalPath();
                                s.g(canonicalPath, "getCanonicalPath(...)");
                                if (!r.N(canonicalPath, fileJ.getCanonicalPath() + File.separator, false, 2, null) && !s.c(file2.getCanonicalPath(), fileJ.getCanonicalPath())) {
                                    throw new IOException("Blocked zip entry outside target: " + nextEntry.getName());
                                }
                                if (nextEntry.isDirectory()) {
                                    kotlin.coroutines.jvm.internal.b.a(file2.mkdirs());
                                } else {
                                    File parentFile = file2.getParentFile();
                                    if (parentFile != null) {
                                        kotlin.coroutines.jvm.internal.b.a(parentFile.mkdirs());
                                    }
                                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                                    try {
                                        ql.a.b(zipInputStream, fileOutputStream, 0, 2, null);
                                        ql.b.a(fileOutputStream, null);
                                        int i15 = i0Var.f43593a + 1;
                                        i0Var.f43593a = i15;
                                        if (i15 % 16 == 0) {
                                            sVar.e(new b.a(i15));
                                        }
                                    } catch (Throwable th2) {
                                        try {
                                            throw th2;
                                        } catch (Throwable th3) {
                                            ql.b.a(fileOutputStream, th2);
                                            throw th3;
                                        }
                                    }
                                }
                                zipInputStream.closeEntry();
                            }
                            g0 g0Var2 = g0.f38750a;
                            ql.b.a(zipInputStream, null);
                            file.delete();
                            if (!p0.f(sVar)) {
                                ql.f.o(fileJ);
                                u.f(sVar, null, 1, null);
                                return g0.f38750a;
                            }
                            if (e.this.k(this.f48558u) == null) {
                                ql.f.o(fileJ);
                                sVar.e(new b.C0748b(of.a.INCOMPLETE, null, 2, null));
                                u.f(sVar, null, 1, null);
                                return g0.f38750a;
                            }
                            sVar.e(b.d.f48548a);
                            u.f(sVar, null, 1, null);
                        } catch (Throwable th4) {
                            try {
                                throw th4;
                            } catch (Throwable th5) {
                                ql.b.a(zipInputStream, th4);
                                throw th5;
                            }
                        }
                    } catch (Throwable th6) {
                        try {
                            throw th6;
                        } catch (Throwable th7) {
                            ql.b.a(fVarB, th6);
                            throw th7;
                        }
                    }
                } catch (Throwable th8) {
                    wp.a.f(th8, "Model download failed for %s", this.f48558u.c());
                    of.a aVarD = e.this.d(th8);
                    if (aVarD == of.a.DOWNLOAD_UNKNOWN) {
                        g gVar2 = this.f48558u;
                        try {
                            fl.r.a aVar = fl.r.f38769b;
                            com.google.firebase.crashlytics.a aVarB = com.google.firebase.crashlytics.a.b();
                            aVarB.e("caption_failure_site", "model_download");
                            aVarB.e("caption_model_id", gVar2.c());
                            aVarB.e("caption_exception_class", th8.getClass().getName());
                            aVarB.d(th8);
                            fl.r.b(aVarB);
                        } catch (Throwable th9) {
                            fl.r.a aVar2 = fl.r.f38769b;
                            fl.r.b(fl.s.a(th9));
                        }
                    }
                    try {
                        fl.r.a aVar3 = fl.r.f38769b;
                        fl.r.b(kotlin.coroutines.jvm.internal.b.a(file.delete()));
                    } catch (Throwable th10) {
                        fl.r.a aVar4 = fl.r.f38769b;
                        fl.r.b(fl.s.a(th10));
                    }
                    try {
                        fl.r.b(kotlin.coroutines.jvm.internal.b.a(ql.f.o(fileJ)));
                    } catch (Throwable th11) {
                        fl.r.a aVar5 = fl.r.f38769b;
                        fl.r.b(fl.s.a(th11));
                    }
                    sVar.e(new b.C0748b(aVarD, th8));
                    u.f(sVar, null, 1, null);
                }
                tl.a aVar6 = new tl.a() { // from class: of.d
                    @Override // tl.a
                    public final Object invoke() {
                        return e.a.r();
                    }
                };
                this.f48555r = 1;
                if (q.a(sVar, aVar6, this) == objF) {
                    return objF;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fl.s.b(obj);
            }
            return g0.f38750a;
        }

        @Override // tl.o
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(gm.s sVar, kl.f fVar) {
            return ((a) create(sVar, fVar)).invokeSuspend(g0.f38750a);
        }
    }

    public e(Context context) {
        s.h(context, "context");
        File file = new File(context.getFilesDir(), "stt");
        if (!file.exists()) {
            file.mkdirs();
        }
        this.f48550a = file;
        File file2 = new File(context.getCacheDir(), "stt-downloads");
        if (!file2.exists()) {
            file2.mkdirs();
        }
        this.f48551b = file2;
        this.f48552c = context.getAssets();
        b0.a aVar = new b0.a();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.f48553d = aVar.e(30L, timeUnit).R(60L, timeUnit).c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final of.a d(Throwable th2) {
        String lowerCase;
        while (th2 != null) {
            if ((th2 instanceof UnknownHostException) || (th2 instanceof ConnectException) || (th2 instanceof NoRouteToHostException) || (th2 instanceof SocketTimeoutException) || (th2 instanceof SSLException)) {
                return of.a.NETWORK;
            }
            if (th2 instanceof IOException) {
                String message = ((IOException) th2).getMessage();
                if (message != null) {
                    lowerCase = message.toLowerCase(Locale.ROOT);
                    s.g(lowerCase, "toLowerCase(...)");
                } else {
                    lowerCase = null;
                }
                if (lowerCase == null) {
                    lowerCase = "";
                }
                if (r.T(lowerCase, "enospc", false, 2, null) || r.T(lowerCase, "no space", false, 2, null)) {
                    return of.a.STORAGE;
                }
                if (r.T(lowerCase, "zip", false, 2, null) || r.T(lowerCase, "eof", false, 2, null)) {
                    return of.a.CORRUPT;
                }
            }
            th2 = th2.getCause();
        }
        return of.a.DOWNLOAD_UNKNOWN;
    }

    private final void e() {
        g0 g0Var;
        try {
            fl.r.a aVar = fl.r.f38769b;
            String strC = f.f48559a.a().c();
            File[] fileArrListFiles = this.f48550a.listFiles();
            if (fileArrListFiles != null) {
                for (File file : fileArrListFiles) {
                    if (file.isDirectory() && !s.c(file.getName(), strC)) {
                        s.e(file);
                        if (ql.f.o(file)) {
                            wp.a.a("Removed stale model dir: %s", file.getName());
                        }
                    }
                }
                g0Var = g0.f38750a;
            } else {
                g0Var = null;
            }
            fl.r.b(g0Var);
        } catch (Throwable th2) {
            fl.r.a aVar2 = fl.r.f38769b;
            fl.r.b(fl.s.a(th2));
        }
    }

    public final void f() {
        if (this.f48554e) {
            return;
        }
        synchronized (this) {
            if (this.f48554e) {
                return;
            }
            e();
            this.f48554e = true;
            g0 g0Var = g0.f38750a;
        }
    }

    public final hm.e g(g entry) {
        s.h(entry, "entry");
        return hm.g.u(hm.g.d(new a(entry, null)), c1.b());
    }

    public final boolean h(g entry) {
        s.h(entry, "entry");
        return this.f48550a.getUsableSpace() >= ((long) entry.e()) * CacheDataSource.DEFAULT_MAX_CACHE_FILE_SIZE;
    }

    public final boolean i(g entry) {
        s.h(entry, "entry");
        return k(entry) != null;
    }

    public final File j(String id2) {
        s.h(id2, "id");
        return new File(this.f48550a, id2);
    }

    public final v k(g entry) {
        s.h(entry, "entry");
        File fileJ = j(entry.c());
        if (!fileJ.isDirectory()) {
            return null;
        }
        File file = null;
        File file2 = null;
        File file3 = null;
        for (File file4 : ql.f.l(fileJ)) {
            if (file4.isFile()) {
                String name = file4.getName();
                if (s.c(name, entry.b())) {
                    file = file4;
                } else if (s.c(name, entry.a())) {
                    file2 = file4;
                } else if (s.c(name, entry.f())) {
                    file3 = file4;
                }
            }
        }
        if (file == null || file2 == null || file3 == null) {
            return null;
        }
        return new v(file, file2, file3);
    }

    public final File l() throws IOException {
        File file = new File(this.f48550a, "silero_vad.onnx");
        if (file.exists() && file.length() != 0) {
            return file;
        }
        InputStream inputStreamOpen = this.f48552c.open("silero_vad.onnx");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                s.e(inputStreamOpen);
                ql.a.b(inputStreamOpen, fileOutputStream, 0, 2, null);
                ql.b.a(fileOutputStream, null);
                ql.b.a(inputStreamOpen, null);
                return file;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    ql.b.a(fileOutputStream, th2);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                ql.b.a(inputStreamOpen, th4);
                throw th5;
            }
        }
    }
}
