package com.facebook.internal;

import com.bytedance.adsdk.ugeno.ojm.hnj.mzIi.obFGmWgqyy;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class e0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final c f15173i = new c(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f15174j = e0.class.getSimpleName();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final AtomicLong f15175k = new AtomicLong();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f15176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f15177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final File f15178c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f15179d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f15180e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ReentrantLock f15181f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Condition f15182g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AtomicLong f15183h;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f15184a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final FilenameFilter f15185b = new FilenameFilter() { // from class: com.facebook.internal.c0
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                return e0.a.f(file, str);
            }
        };

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final FilenameFilter f15186c = new FilenameFilter() { // from class: com.facebook.internal.d0
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                return e0.a.g(file, str);
            }
        };

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean f(File file, String filename) {
            kotlin.jvm.internal.s.g(filename, "filename");
            return !bm.r.N(filename, "buffer", false, 2, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean g(File file, String filename) {
            kotlin.jvm.internal.s.g(filename, "filename");
            return bm.r.N(filename, "buffer", false, 2, null);
        }

        public final void c(File root) {
            kotlin.jvm.internal.s.h(root, "root");
            File[] fileArrListFiles = root.listFiles(e());
            if (fileArrListFiles != null) {
                for (File file : fileArrListFiles) {
                    file.delete();
                }
            }
        }

        public final FilenameFilter d() {
            return f15185b;
        }

        public final FilenameFilter e() {
            return f15186c;
        }

        public final File h(File file) {
            return new File(file, "buffer" + e0.f15175k.incrementAndGet());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class b extends OutputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final OutputStream f15187a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final g f15188b;

        public b(OutputStream innerStream, g callback) {
            kotlin.jvm.internal.s.h(innerStream, "innerStream");
            kotlin.jvm.internal.s.h(callback, "callback");
            this.f15187a = innerStream;
            this.f15188b = callback;
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            try {
                this.f15187a.close();
            } finally {
                this.f15188b.a();
            }
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() throws IOException {
            this.f15187a.flush();
        }

        @Override // java.io.OutputStream
        public void write(byte[] buffer, int i10, int i11) throws IOException {
            kotlin.jvm.internal.s.h(buffer, "buffer");
            this.f15187a.write(buffer, i10, i11);
        }

        @Override // java.io.OutputStream
        public void write(byte[] buffer) throws IOException {
            kotlin.jvm.internal.s.h(buffer, "buffer");
            this.f15187a.write(buffer);
        }

        @Override // java.io.OutputStream
        public void write(int i10) throws IOException {
            this.f15187a.write(i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a() {
            return e0.f15174j;
        }

        private c() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f15191a = ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f15192b = UserVerificationMethods.USER_VERIFY_ALL;

        public final int a() {
            return this.f15191a;
        }

        public final int b() {
            return this.f15192b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class f implements Comparable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f15193c = new a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final File f15194a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f15195b;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        public f(File file) {
            kotlin.jvm.internal.s.h(file, "file");
            this.f15194a = file;
            this.f15195b = file.lastModified();
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(f another) {
            kotlin.jvm.internal.s.h(another, "another");
            long j10 = this.f15195b;
            long j11 = another.f15195b;
            if (j10 < j11) {
                return -1;
            }
            if (j10 > j11) {
                return 1;
            }
            return this.f15194a.compareTo(another.f15194a);
        }

        public final File b() {
            return this.f15194a;
        }

        public final long c() {
            return this.f15195b;
        }

        public boolean equals(Object obj) {
            return (obj instanceof f) && compareTo((f) obj) == 0;
        }

        public int hashCode() {
            return ((1073 + this.f15194a.hashCode()) * 37) + ((int) (this.f15195b % ((long) Integer.MAX_VALUE)));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private interface g {
        void a();
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h f15196a = new h();

        private h() {
        }

        public final JSONObject a(InputStream stream) throws IOException {
            kotlin.jvm.internal.s.h(stream, "stream");
            if (stream.read() != 0) {
                return null;
            }
            int i10 = 0;
            int i11 = 0;
            for (int i12 = 0; i12 < 3; i12++) {
                int i13 = stream.read();
                if (i13 == -1) {
                    r0.a aVar = r0.f15352e;
                    com.facebook.r0 r0Var = com.facebook.r0.CACHE;
                    String TAG = e0.f15173i.a();
                    kotlin.jvm.internal.s.g(TAG, "TAG");
                    aVar.b(r0Var, TAG, "readHeader: stream.read returned -1 while reading header size");
                    return null;
                }
                i11 = (i11 << 8) + (i13 & 255);
            }
            byte[] bArr = new byte[i11];
            while (i10 < i11) {
                int i14 = stream.read(bArr, i10, i11 - i10);
                if (i14 < 1) {
                    r0.a aVar2 = r0.f15352e;
                    com.facebook.r0 r0Var2 = com.facebook.r0.CACHE;
                    String TAG2 = e0.f15173i.a();
                    kotlin.jvm.internal.s.g(TAG2, "TAG");
                    aVar2.b(r0Var2, TAG2, "readHeader: stream.read stopped at " + Integer.valueOf(i10) + " when expected " + i11);
                    return null;
                }
                i10 += i14;
            }
            try {
                Object objNextValue = new JSONTokener(new String(bArr, bm.d.f9079b)).nextValue();
                if (objNextValue instanceof JSONObject) {
                    return (JSONObject) objNextValue;
                }
                r0.a aVar3 = r0.f15352e;
                com.facebook.r0 r0Var3 = com.facebook.r0.CACHE;
                String TAG3 = e0.f15173i.a();
                kotlin.jvm.internal.s.g(TAG3, "TAG");
                aVar3.b(r0Var3, TAG3, "readHeader: expected JSONObject, got " + objNextValue.getClass().getCanonicalName());
                return null;
            } catch (JSONException e10) {
                throw new IOException(e10.getMessage());
            }
        }

        public final void b(OutputStream stream, JSONObject header) throws IOException {
            kotlin.jvm.internal.s.h(stream, "stream");
            kotlin.jvm.internal.s.h(header, "header");
            String string = header.toString();
            kotlin.jvm.internal.s.g(string, "header.toString()");
            byte[] bytes = string.getBytes(bm.d.f9079b);
            kotlin.jvm.internal.s.g(bytes, "this as java.lang.String).getBytes(charset)");
            stream.write(0);
            stream.write((bytes.length >> 16) & 255);
            stream.write((bytes.length >> 8) & 255);
            stream.write(bytes.length & 255);
            stream.write(bytes);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class i implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f15197a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ e0 f15198b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ File f15199c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f15200d;

        i(long j10, e0 e0Var, File file, String str) {
            this.f15197a = j10;
            this.f15198b = e0Var;
            this.f15199c = file;
            this.f15200d = str;
        }

        @Override // com.facebook.internal.e0.g
        public void a() {
            if (this.f15197a < this.f15198b.f15183h.get()) {
                this.f15199c.delete();
            } else {
                this.f15198b.m(this.f15200d, this.f15199c);
            }
        }
    }

    public e0(String tag, e limits) {
        kotlin.jvm.internal.s.h(tag, "tag");
        kotlin.jvm.internal.s.h(limits, "limits");
        this.f15176a = tag;
        this.f15177b = limits;
        File file = new File(com.facebook.h0.r(), tag);
        this.f15178c = file;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f15181f = reentrantLock;
        this.f15182g = reentrantLock.newCondition();
        this.f15183h = new AtomicLong(0L);
        if (file.mkdirs() || file.isDirectory()) {
            a.f15184a.c(file);
        }
    }

    public static /* synthetic */ InputStream g(e0 e0Var, String str, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        return e0Var.f(str, str2);
    }

    public static /* synthetic */ OutputStream j(e0 e0Var, String str, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        return e0Var.i(str, str2);
    }

    private final void k() {
        ReentrantLock reentrantLock = this.f15181f;
        reentrantLock.lock();
        try {
            if (!this.f15179d) {
                this.f15179d = true;
                com.facebook.h0.v().execute(new Runnable() { // from class: com.facebook.internal.b0
                    @Override // java.lang.Runnable
                    public final void run() {
                        e0.l(this.f15142a);
                    }
                });
            }
            fl.g0 g0Var = fl.g0.f38750a;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(e0 this$0) {
        kotlin.jvm.internal.s.h(this$0, "this$0");
        this$0.n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m(String str, File file) {
        if (!file.renameTo(new File(this.f15178c, e1.o0(str)))) {
            file.delete();
        }
        k();
    }

    public final InputStream f(String key, String str) throws IOException {
        kotlin.jvm.internal.s.h(key, "key");
        File file = new File(this.f15178c, e1.o0(key));
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file), 8192);
            try {
                JSONObject jSONObjectA = h.f15196a.a(bufferedInputStream);
                if (jSONObjectA == null) {
                    bufferedInputStream.close();
                    return null;
                }
                if (!kotlin.jvm.internal.s.c(jSONObjectA.optString("key"), key)) {
                    bufferedInputStream.close();
                    return null;
                }
                String strOptString = jSONObjectA.optString("tag", null);
                if (str != null && !kotlin.jvm.internal.s.c(str, strOptString)) {
                    bufferedInputStream.close();
                    return null;
                }
                long time = new Date().getTime();
                r0.a aVar = r0.f15352e;
                com.facebook.r0 r0Var = com.facebook.r0.CACHE;
                String TAG = f15174j;
                kotlin.jvm.internal.s.g(TAG, "TAG");
                aVar.b(r0Var, TAG, "Setting lastModified to " + Long.valueOf(time) + " for " + file.getName());
                file.setLastModified(time);
                return bufferedInputStream;
            } catch (Throwable th2) {
                bufferedInputStream.close();
                throw th2;
            }
        } catch (IOException unused) {
            return null;
        }
    }

    public final InputStream h(String key, InputStream input) {
        kotlin.jvm.internal.s.h(key, "key");
        kotlin.jvm.internal.s.h(input, "input");
        return new d(input, j(this, key, null, 2, null));
    }

    public final OutputStream i(String key, String str) throws IOException {
        kotlin.jvm.internal.s.h(key, "key");
        File fileH = a.f15184a.h(this.f15178c);
        fileH.delete();
        if (!fileH.createNewFile()) {
            throw new IOException("Could not create file at " + fileH.getAbsolutePath());
        }
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new b(new FileOutputStream(fileH), new i(System.currentTimeMillis(), this, fileH, key)), 8192);
            try {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("key", key);
                    if (!e1.e0(str)) {
                        jSONObject.put("tag", str);
                    }
                    h.f15196a.b(bufferedOutputStream, jSONObject);
                    return bufferedOutputStream;
                } catch (JSONException e10) {
                    r0.a aVar = r0.f15352e;
                    com.facebook.r0 r0Var = com.facebook.r0.CACHE;
                    String TAG = f15174j;
                    kotlin.jvm.internal.s.g(TAG, "TAG");
                    aVar.a(r0Var, 5, TAG, "Error creating JSON header for cache file: " + e10);
                    throw new IOException(e10.getMessage());
                }
            } catch (Throwable th2) {
                bufferedOutputStream.close();
                throw th2;
            }
        } catch (FileNotFoundException e11) {
            r0.a aVar2 = r0.f15352e;
            com.facebook.r0 r0Var2 = com.facebook.r0.CACHE;
            String TAG2 = f15174j;
            kotlin.jvm.internal.s.g(TAG2, "TAG");
            aVar2.a(r0Var2, 5, TAG2, "Error creating buffer output stream: " + e11);
            throw new IOException(e11.getMessage());
        }
    }

    public String toString() {
        return "{FileLruCache: tag:" + this.f15176a + " file:" + this.f15178c.getName() + '}';
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class d extends InputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final InputStream f15189a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final OutputStream f15190b;

        public d(InputStream input, OutputStream output) {
            kotlin.jvm.internal.s.h(input, "input");
            kotlin.jvm.internal.s.h(output, "output");
            this.f15189a = input;
            this.f15190b = output;
        }

        @Override // java.io.InputStream
        public int available() {
            return this.f15189a.available();
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            try {
                this.f15189a.close();
            } finally {
                this.f15190b.close();
            }
        }

        @Override // java.io.InputStream
        public void mark(int i10) {
            throw new UnsupportedOperationException();
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return false;
        }

        @Override // java.io.InputStream
        public int read(byte[] buffer) throws IOException {
            kotlin.jvm.internal.s.h(buffer, "buffer");
            int i10 = this.f15189a.read(buffer);
            if (i10 > 0) {
                this.f15190b.write(buffer, 0, i10);
            }
            return i10;
        }

        @Override // java.io.InputStream
        public synchronized void reset() {
            throw new UnsupportedOperationException();
        }

        @Override // java.io.InputStream
        public long skip(long j10) {
            int i10;
            byte[] bArr = new byte[UserVerificationMethods.USER_VERIFY_ALL];
            long j11 = 0;
            while (j11 < j10 && (i10 = read(bArr, 0, (int) Math.min(j10 - j11, UserVerificationMethods.USER_VERIFY_ALL))) >= 0) {
                j11 += (long) i10;
            }
            return j11;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            int i10 = this.f15189a.read();
            if (i10 >= 0) {
                this.f15190b.write(i10);
            }
            return i10;
        }

        @Override // java.io.InputStream
        public int read(byte[] buffer, int i10, int i11) throws IOException {
            kotlin.jvm.internal.s.h(buffer, "buffer");
            int i12 = this.f15189a.read(buffer, i10, i11);
            if (i12 > 0) {
                this.f15190b.write(buffer, i10, i12);
            }
            return i12;
        }
    }

    private final void n() {
        PriorityQueue priorityQueue;
        long j10;
        ReentrantLock reentrantLock = this.f15181f;
        reentrantLock.lock();
        try {
            this.f15179d = false;
            this.f15180e = true;
            fl.g0 g0Var = fl.g0.f38750a;
            reentrantLock.unlock();
            try {
                r0.a aVar = r0.f15352e;
                com.facebook.r0 r0Var = com.facebook.r0.CACHE;
                String TAG = f15174j;
                kotlin.jvm.internal.s.g(TAG, "TAG");
                aVar.b(r0Var, TAG, "trim started");
                PriorityQueue priorityQueue2 = new PriorityQueue();
                File[] fileArrListFiles = this.f15178c.listFiles(a.f15184a.d());
                long length = 0;
                if (fileArrListFiles != null) {
                    int length2 = fileArrListFiles.length;
                    int i10 = 0;
                    j10 = 0;
                    while (i10 < length2) {
                        File file = fileArrListFiles[i10];
                        kotlin.jvm.internal.s.g(file, "file");
                        f fVar = new f(file);
                        priorityQueue2.add(fVar);
                        r0.a aVar2 = r0.f15352e;
                        com.facebook.r0 r0Var2 = com.facebook.r0.CACHE;
                        String TAG2 = f15174j;
                        kotlin.jvm.internal.s.g(TAG2, "TAG");
                        aVar2.b(r0Var2, TAG2, obFGmWgqyy.XyQbWzriHSwZ + Long.valueOf(fVar.c()) + " name=" + fVar.b().getName());
                        length += file.length();
                        j10++;
                        i10++;
                        priorityQueue2 = priorityQueue2;
                    }
                    priorityQueue = priorityQueue2;
                } else {
                    priorityQueue = priorityQueue2;
                    j10 = 0;
                }
                while (true) {
                    if (length <= this.f15177b.a() && j10 <= this.f15177b.b()) {
                        ReentrantLock reentrantLock2 = this.f15181f;
                        reentrantLock2.lock();
                        try {
                            this.f15180e = false;
                            this.f15182g.signalAll();
                            fl.g0 g0Var2 = fl.g0.f38750a;
                            return;
                        } finally {
                            reentrantLock2.unlock();
                        }
                    }
                    File fileB = ((f) priorityQueue.remove()).b();
                    r0.a aVar3 = r0.f15352e;
                    com.facebook.r0 r0Var3 = com.facebook.r0.CACHE;
                    String TAG3 = f15174j;
                    kotlin.jvm.internal.s.g(TAG3, "TAG");
                    aVar3.b(r0Var3, TAG3, "  trim removing " + fileB.getName());
                    length -= fileB.length();
                    j10 += -1;
                    fileB.delete();
                }
            } catch (Throwable th2) {
                ReentrantLock reentrantLock3 = this.f15181f;
                reentrantLock3.lock();
                try {
                    this.f15180e = false;
                    this.f15182g.signalAll();
                    fl.g0 g0Var3 = fl.g0.f38750a;
                    throw th2;
                } finally {
                    reentrantLock3.unlock();
                }
            }
        } catch (Throwable th3) {
            reentrantLock.unlock();
            throw th3;
        }
    }
}
