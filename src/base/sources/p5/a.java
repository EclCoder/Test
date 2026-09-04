package p5;

import android.os.Build;
import android.os.StrictMode;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f49516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final File f49517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final File f49518c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final File f49519d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f49520e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f49521f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f49522g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Writer f49524i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f49526k;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f49523h = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final LinkedHashMap f49525j = new LinkedHashMap(0, 0.75f, true);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f49527l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final ThreadPoolExecutor f49528m = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new b(null));

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Callable f49529n = new CallableC0763a();

    /* JADX INFO: renamed from: p5.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class CallableC0763a implements Callable {
        CallableC0763a() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            synchronized (a.this) {
                try {
                    if (a.this.f49524i == null) {
                        return null;
                    }
                    a.this.W0();
                    if (a.this.m0()) {
                        a.this.T0();
                        a.this.f49526k = 0;
                    }
                    return null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class b implements ThreadFactory {
        private b() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }

        /* synthetic */ b(CallableC0763a callableC0763a) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d f49531a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean[] f49532b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f49533c;

        /* synthetic */ c(a aVar, d dVar, CallableC0763a callableC0763a) {
            this(dVar);
        }

        public void a() {
            a.this.r(this, false);
        }

        public void b() {
            if (this.f49533c) {
                return;
            }
            try {
                a();
            } catch (IOException unused) {
            }
        }

        public void e() {
            a.this.r(this, true);
            this.f49533c = true;
        }

        public File f(int i10) {
            File fileK;
            synchronized (a.this) {
                try {
                    if (this.f49531a.f49540f != this) {
                        throw new IllegalStateException();
                    }
                    if (!this.f49531a.f49539e) {
                        this.f49532b[i10] = true;
                    }
                    fileK = this.f49531a.k(i10);
                    a.this.f49516a.mkdirs();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return fileK;
        }

        private c(d dVar) {
            this.f49531a = dVar;
            this.f49532b = dVar.f49539e ? null : new boolean[a.this.f49522g];
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f49535a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long[] f49536b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        File[] f49537c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        File[] f49538d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f49539e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private c f49540f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f49541g;

        /* synthetic */ d(a aVar, String str, CallableC0763a callableC0763a) {
            this(str);
        }

        private IOException m(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void n(String[] strArr) throws IOException {
            if (strArr.length != a.this.f49522g) {
                throw m(strArr);
            }
            for (int i10 = 0; i10 < strArr.length; i10++) {
                try {
                    this.f49536b[i10] = Long.parseLong(strArr[i10]);
                } catch (NumberFormatException unused) {
                    throw m(strArr);
                }
            }
        }

        public File j(int i10) {
            return this.f49537c[i10];
        }

        public File k(int i10) {
            return this.f49538d[i10];
        }

        public String l() {
            StringBuilder sb2 = new StringBuilder();
            for (long j10 : this.f49536b) {
                sb2.append(' ');
                sb2.append(j10);
            }
            return sb2.toString();
        }

        private d(String str) {
            this.f49535a = str;
            this.f49536b = new long[a.this.f49522g];
            this.f49537c = new File[a.this.f49522g];
            this.f49538d = new File[a.this.f49522g];
            StringBuilder sb2 = new StringBuilder(str);
            sb2.append('.');
            int length = sb2.length();
            for (int i10 = 0; i10 < a.this.f49522g; i10++) {
                sb2.append(i10);
                this.f49537c[i10] = new File(a.this.f49516a, sb2.toString());
                sb2.append(".tmp");
                this.f49538d[i10] = new File(a.this.f49516a, sb2.toString());
                sb2.setLength(length);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f49543a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f49544b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long[] f49545c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final File[] f49546d;

        /* synthetic */ e(a aVar, String str, long j10, File[] fileArr, long[] jArr, CallableC0763a callableC0763a) {
            this(str, j10, fileArr, jArr);
        }

        public File a(int i10) {
            return this.f49546d[i10];
        }

        private e(String str, long j10, File[] fileArr, long[] jArr) {
            this.f49543a = str;
            this.f49544b = j10;
            this.f49546d = fileArr;
            this.f49545c = jArr;
        }
    }

    private a(File file, int i10, int i11, long j10) {
        this.f49516a = file;
        this.f49520e = i10;
        this.f49517b = new File(file, "journal");
        this.f49518c = new File(file, "journal.tmp");
        this.f49519d = new File(file, "journal.bkp");
        this.f49522g = i11;
        this.f49521f = j10;
    }

    private void F0() throws IOException {
        t(this.f49518c);
        Iterator it = this.f49525j.values().iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            int i10 = 0;
            if (dVar.f49540f == null) {
                while (i10 < this.f49522g) {
                    this.f49523h += dVar.f49536b[i10];
                    i10++;
                }
            } else {
                dVar.f49540f = null;
                while (i10 < this.f49522g) {
                    t(dVar.j(i10));
                    t(dVar.k(i10));
                    i10++;
                }
                it.remove();
            }
        }
    }

    private void K0() {
        p5.b bVar = new p5.b(new FileInputStream(this.f49517b), p5.c.f49554a);
        try {
            String strK = bVar.k();
            String strK2 = bVar.k();
            String strK3 = bVar.k();
            String strK4 = bVar.k();
            String strK5 = bVar.k();
            if (!"libcore.io.DiskLruCache".equals(strK) || !"1".equals(strK2) || !Integer.toString(this.f49520e).equals(strK3) || !Integer.toString(this.f49522g).equals(strK4) || !"".equals(strK5)) {
                throw new IOException("unexpected journal header: [" + strK + ", " + strK2 + ", " + strK4 + ", " + strK5 + "]");
            }
            int i10 = 0;
            while (true) {
                try {
                    N0(bVar.k());
                    i10++;
                } catch (EOFException unused) {
                    this.f49526k = i10 - this.f49525j.size();
                    if (bVar.h()) {
                        T0();
                    } else {
                        this.f49524i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f49517b, true), p5.c.f49554a));
                    }
                    p5.c.a(bVar);
                    return;
                }
            }
        } catch (Throwable th2) {
            p5.c.a(bVar);
            throw th2;
        }
    }

    private void N0(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            throw new IOException("unexpected journal line: " + str);
        }
        int i10 = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i10);
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i10);
            if (iIndexOf == 6 && str.startsWith("REMOVE")) {
                this.f49525j.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i10, iIndexOf2);
        }
        d dVar = (d) this.f49525j.get(strSubstring);
        CallableC0763a callableC0763a = null;
        if (dVar == null) {
            dVar = new d(this, strSubstring, callableC0763a);
            this.f49525j.put(strSubstring, dVar);
        }
        if (iIndexOf2 != -1 && iIndexOf == 5 && str.startsWith("CLEAN")) {
            String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
            dVar.f49539e = true;
            dVar.f49540f = null;
            dVar.n(strArrSplit);
            return;
        }
        if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
            dVar.f49540f = new c(this, dVar, callableC0763a);
            return;
        }
        if (iIndexOf2 == -1 && iIndexOf == 4 && str.startsWith("READ")) {
            return;
        }
        throw new IOException("unexpected journal line: " + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void T0() {
        try {
            Writer writer = this.f49524i;
            if (writer != null) {
                q(writer);
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f49518c), p5.c.f49554a));
            try {
                bufferedWriter.write("libcore.io.DiskLruCache");
                bufferedWriter.write("\n");
                bufferedWriter.write("1");
                bufferedWriter.write("\n");
                bufferedWriter.write(Integer.toString(this.f49520e));
                bufferedWriter.write("\n");
                bufferedWriter.write(Integer.toString(this.f49522g));
                bufferedWriter.write("\n");
                bufferedWriter.write("\n");
                for (d dVar : this.f49525j.values()) {
                    if (dVar.f49540f != null) {
                        bufferedWriter.write("DIRTY " + dVar.f49535a + '\n');
                    } else {
                        bufferedWriter.write("CLEAN " + dVar.f49535a + dVar.l() + '\n');
                    }
                }
                q(bufferedWriter);
                if (this.f49517b.exists()) {
                    V0(this.f49517b, this.f49519d, true);
                }
                V0(this.f49518c, this.f49517b, false);
                this.f49519d.delete();
                this.f49524i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f49517b, true), p5.c.f49554a));
            } catch (Throwable th2) {
                q(bufferedWriter);
                throw th2;
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    private static void V0(File file, File file2, boolean z10) throws IOException {
        if (z10) {
            t(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W0() {
        while (this.f49523h > this.f49521f) {
            U0((String) ((Map.Entry) this.f49525j.entrySet().iterator().next()).getKey());
        }
    }

    private synchronized c d0(String str, long j10) {
        m();
        d dVar = (d) this.f49525j.get(str);
        CallableC0763a callableC0763a = null;
        if (j10 != -1 && (dVar == null || dVar.f49541g != j10)) {
            return null;
        }
        if (dVar == null) {
            dVar = new d(this, str, callableC0763a);
            this.f49525j.put(str, dVar);
        } else if (dVar.f49540f != null) {
            return null;
        }
        c cVar = new c(this, dVar, callableC0763a);
        dVar.f49540f = cVar;
        this.f49524i.append((CharSequence) "DIRTY");
        this.f49524i.append(' ');
        this.f49524i.append((CharSequence) str);
        this.f49524i.append('\n');
        g0(this.f49524i);
        return cVar;
    }

    private static void g0(Writer writer) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            writer.flush();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    private void m() {
        if (this.f49524i == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean m0() {
        int i10 = this.f49526k;
        return i10 >= 2000 && i10 >= this.f49525j.size();
    }

    public static a p0(File file, int i10, int i11, long j10) throws IOException {
        if (j10 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i11 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0");
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                V0(file2, file3, false);
            }
        }
        a aVar = new a(file, i10, i11, j10);
        if (aVar.f49517b.exists()) {
            try {
                aVar.K0();
                aVar.F0();
                return aVar;
            } catch (IOException e10) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e10.getMessage() + ", removing");
                aVar.s();
            }
        }
        file.mkdirs();
        a aVar2 = new a(file, i10, i11, j10);
        aVar2.T0();
        return aVar2;
    }

    private static void q(Writer writer) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            writer.close();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void r(c cVar, boolean z10) {
        d dVar = cVar.f49531a;
        if (dVar.f49540f != cVar) {
            throw new IllegalStateException();
        }
        if (z10 && !dVar.f49539e) {
            for (int i10 = 0; i10 < this.f49522g; i10++) {
                if (!cVar.f49532b[i10]) {
                    cVar.a();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i10);
                }
                if (!dVar.k(i10).exists()) {
                    cVar.a();
                    return;
                }
            }
        }
        for (int i11 = 0; i11 < this.f49522g; i11++) {
            File fileK = dVar.k(i11);
            if (!z10) {
                t(fileK);
            } else if (fileK.exists()) {
                File fileJ = dVar.j(i11);
                fileK.renameTo(fileJ);
                long j10 = dVar.f49536b[i11];
                long length = fileJ.length();
                dVar.f49536b[i11] = length;
                this.f49523h = (this.f49523h - j10) + length;
            }
        }
        this.f49526k++;
        dVar.f49540f = null;
        if (dVar.f49539e || z10) {
            dVar.f49539e = true;
            this.f49524i.append((CharSequence) "CLEAN");
            this.f49524i.append(' ');
            this.f49524i.append((CharSequence) dVar.f49535a);
            this.f49524i.append((CharSequence) dVar.l());
            this.f49524i.append('\n');
            if (z10) {
                long j11 = this.f49527l;
                this.f49527l = 1 + j11;
                dVar.f49541g = j11;
            }
        } else {
            this.f49525j.remove(dVar.f49535a);
            this.f49524i.append((CharSequence) "REMOVE");
            this.f49524i.append(' ');
            this.f49524i.append((CharSequence) dVar.f49535a);
            this.f49524i.append('\n');
        }
        g0(this.f49524i);
        if (this.f49523h > this.f49521f || m0()) {
            this.f49528m.submit(this.f49529n);
        }
    }

    private static void t(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public synchronized boolean U0(String str) {
        try {
            m();
            d dVar = (d) this.f49525j.get(str);
            if (dVar != null && dVar.f49540f == null) {
                for (int i10 = 0; i10 < this.f49522g; i10++) {
                    File fileJ = dVar.j(i10);
                    if (fileJ.exists() && !fileJ.delete()) {
                        throw new IOException("failed to delete " + fileJ);
                    }
                    this.f49523h -= dVar.f49536b[i10];
                    dVar.f49536b[i10] = 0;
                }
                this.f49526k++;
                this.f49524i.append((CharSequence) "REMOVE");
                this.f49524i.append(' ');
                this.f49524i.append((CharSequence) str);
                this.f49524i.append('\n');
                this.f49525j.remove(str);
                if (m0()) {
                    this.f49528m.submit(this.f49529n);
                }
                return true;
            }
            return false;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public c c0(String str) {
        return d0(str, -1L);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        try {
            if (this.f49524i == null) {
                return;
            }
            ArrayList arrayList = new ArrayList(this.f49525j.values());
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                d dVar = (d) obj;
                if (dVar.f49540f != null) {
                    dVar.f49540f.a();
                }
            }
            W0();
            q(this.f49524i);
            this.f49524i = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized e i0(String str) throws Throwable {
        Throwable th2;
        try {
            try {
                m();
                d dVar = (d) this.f49525j.get(str);
                if (dVar == null) {
                    return null;
                }
                if (!dVar.f49539e) {
                    return null;
                }
                for (File file : dVar.f49537c) {
                    try {
                        if (!file.exists()) {
                            return null;
                        }
                    } catch (Throwable th3) {
                        th2 = th3;
                    }
                }
                this.f49526k++;
                this.f49524i.append((CharSequence) "READ");
                this.f49524i.append(' ');
                this.f49524i.append((CharSequence) str);
                this.f49524i.append('\n');
                if (m0()) {
                    this.f49528m.submit(this.f49529n);
                }
                return new e(this, str, dVar.f49541g, dVar.f49537c, dVar.f49536b, null);
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
            }
        } catch (Throwable th5) {
            th = th5;
            th2 = th;
        }
        throw th2;
    }

    public void s() throws IOException {
        close();
        p5.c.b(this.f49516a);
    }
}
