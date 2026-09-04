package com.inmobi.media;

import com.google.firebase.installations.ktx.gUsI.dmHT;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public final class L5 implements Closeable {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Pattern f25174p = Pattern.compile("[a-z0-9_-]{1,64}");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final E5 f25175q = new E5();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f25177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final File f25178c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final File f25179d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final File f25180e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final J5 f25182g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f25185j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public BufferedWriter f25187l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f25188m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ThreadPoolExecutor f25176a = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final LinkedHashMap f25184i = new LinkedHashMap(0, 0.75f, true);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f25186k = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f25189n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final F5 f25190o = new F5(this);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f25181f = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f25183h = 2;

    public L5(File file, long j10, J5 j11) {
        this.f25177b = file;
        this.f25178c = new File(file, "journal");
        this.f25179d = new File(file, "journal.tmp");
        this.f25180e = new File(file, "journal.bkp");
        this.f25185j = j10;
        this.f25182g = j11;
    }

    public final void a() throws IOException {
        File file = this.f25179d;
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
        Iterator it = this.f25184i.values().iterator();
        while (it.hasNext()) {
            I5 i10 = (I5) it.next();
            int i11 = 0;
            if (i10.f24985d == null) {
                while (i11 < this.f25183h) {
                    this.f25186k += i10.f24983b[i11];
                    i11++;
                }
            } else {
                i10.f24985d = null;
                while (i11 < this.f25183h) {
                    File fileA = i10.a(i11);
                    if (fileA.exists() && !fileA.delete()) {
                        throw new IOException();
                    }
                    File fileB = i10.b(i11);
                    if (fileB.exists() && !fileB.delete()) {
                        throw new IOException();
                    }
                    i11++;
                }
                it.remove();
            }
        }
    }

    public final void b() {
        Xj xj2 = new Xj(new FileInputStream(this.f25178c), AbstractC3308sl.f27479a);
        try {
            String strA = xj2.a();
            String strA2 = xj2.a();
            String strA3 = xj2.a();
            String strA4 = xj2.a();
            String strA5 = xj2.a();
            if (!"libcore.io.DiskLruCache".equals(strA) || !"1".equals(strA2) || !Integer.toString(this.f25181f).equals(strA3) || !Integer.toString(this.f25183h).equals(strA4) || !"".equals(strA5)) {
                throw new IOException("unexpected journal header: [" + strA + ", " + strA2 + ", " + strA4 + ", " + strA5 + "]");
            }
            int i10 = 0;
            while (true) {
                try {
                    c(xj2.a());
                    i10++;
                } catch (EOFException unused) {
                    this.f25188m = i10 - this.f25184i.size();
                    AbstractC3308sl.a(xj2);
                    return;
                }
            }
        } catch (Throwable th2) {
            AbstractC3308sl.a(xj2);
            throw th2;
        }
    }

    public final void c(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
        int i10 = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i10);
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i10);
            if (iIndexOf == 6 && str.startsWith("REMOVE")) {
                this.f25184i.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i10, iIndexOf2);
        }
        I5 i11 = (I5) this.f25184i.get(strSubstring);
        if (i11 == null) {
            i11 = new I5(this, strSubstring);
            this.f25184i.put(strSubstring, i11);
        }
        if (iIndexOf2 == -1 || iIndexOf != 5 || !str.startsWith("CLEAN")) {
            if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
                i11.f24985d = new H5(this, i11);
                return;
            } else {
                if (iIndexOf2 != -1 || iIndexOf != 4 || !str.startsWith("READ")) {
                    throw new IOException("unexpected journal line: ".concat(str));
                }
                return;
            }
        }
        String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
        i11.f24984c = true;
        i11.f24985d = null;
        if (strArrSplit.length != i11.f24986e.f25183h) {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArrSplit));
        }
        for (int i12 = 0; i12 < strArrSplit.length; i12++) {
            try {
                i11.f24983b[i12] = Long.parseLong(strArrSplit[i12]);
            } catch (NumberFormatException unused) {
                throw new IOException("unexpected journal line: " + Arrays.toString(strArrSplit));
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.f25187l == null) {
                return;
            }
            ArrayList arrayList = new ArrayList(this.f25184i.values());
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                H5 h10 = ((I5) obj).f24985d;
                if (h10 != null) {
                    h10.f24921d.a(h10, false);
                }
            }
            while (this.f25186k > this.f25185j) {
                d((String) ((Map.Entry) this.f25184i.entrySet().iterator().next()).getKey());
            }
            this.f25187l.close();
            this.f25187l = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void d(String str) {
        if (this.f25187l == null) {
            throw new IllegalStateException("cache is closed");
        }
        if (!f25174p.matcher(str).matches()) {
            throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,64}: \"" + str + "\"");
        }
        I5 i10 = (I5) this.f25184i.get(str);
        if (i10 != null && i10.f24985d == null) {
            for (int i11 = 0; i11 < this.f25183h; i11++) {
                File file = i10.a(i11);
                if (this.f25182g != null) {
                    kotlin.jvm.internal.s.h(file, "file");
                    if (str != null && i11 == 0) {
                        String str2 = "";
                        try {
                            String strA = AbstractC3308sl.a(new InputStreamReader(new FileInputStream(file), AbstractC3308sl.f27480b));
                            kotlin.jvm.internal.s.g(strA, "readFully(...)");
                            str2 = strA;
                        } catch (Exception unused) {
                        }
                        Map mapM = gl.l0.m(fl.w.a("urlKey", str), fl.w.a("url", str2));
                        C3178nk c3178nk = C3178nk.f27064a;
                        C3178nk.b("ResourceDiskCacheFileEvicted", mapM, EnumC3281rk.SDK);
                    }
                }
                if (file.exists() && !file.delete()) {
                    throw new IOException(dmHT.XiESrCUAdaUeWb + file);
                }
                long j10 = this.f25186k;
                long[] jArr = i10.f24983b;
                this.f25186k = j10 - jArr[i11];
                jArr[i11] = 0;
            }
            this.f25188m++;
            this.f25187l.append((CharSequence) ("REMOVE " + str + '\n'));
            this.f25184i.remove(str);
            int i12 = this.f25188m;
            if (i12 >= 2000 && i12 >= this.f25184i.size()) {
                this.f25176a.submit(this.f25190o);
            }
        }
    }

    public final H5 a(String str) {
        synchronized (this) {
            try {
                if (this.f25187l != null) {
                    if (f25174p.matcher(str).matches()) {
                        I5 i10 = (I5) this.f25184i.get(str);
                        if (i10 == null) {
                            i10 = new I5(this, str);
                            this.f25184i.put(str, i10);
                        } else if (i10.f24985d != null) {
                            return null;
                        }
                        H5 h10 = new H5(this, i10);
                        i10.f24985d = h10;
                        this.f25187l.write("DIRTY " + str + '\n');
                        this.f25187l.flush();
                        return h10;
                    }
                    throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,64}: \"" + str + "\"");
                }
                throw new IllegalStateException("cache is closed");
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final synchronized K5 b(String key) {
        InputStream inputStream;
        if (this.f25187l != null) {
            if (f25174p.matcher(key).matches()) {
                I5 i10 = (I5) this.f25184i.get(key);
                if (i10 == null) {
                    return null;
                }
                if (!i10.f24984c) {
                    return null;
                }
                InputStream[] inputStreamArr = new InputStream[this.f25183h];
                for (int i11 = 0; i11 < this.f25183h; i11++) {
                    try {
                        inputStreamArr[i11] = new FileInputStream(i10.a(i11));
                    } catch (FileNotFoundException unused) {
                        if (this.f25182g != null) {
                            kotlin.jvm.internal.s.h(key, "key");
                            Map mapM = gl.l0.m(fl.w.a("urlKey", key));
                            C3178nk c3178nk = C3178nk.f27064a;
                            C3178nk.b("ResourceDiskCacheFileMissing", mapM, EnumC3281rk.SDK);
                        }
                        for (int i12 = 0; i12 < this.f25183h && (inputStream = inputStreamArr[i12]) != null; i12++) {
                            AbstractC3308sl.a(inputStream);
                        }
                        return null;
                    }
                }
                this.f25188m++;
                this.f25187l.append((CharSequence) ("READ " + key + '\n'));
                int i13 = this.f25188m;
                if (i13 >= 2000 && i13 >= this.f25184i.size()) {
                    this.f25176a.submit(this.f25190o);
                }
                return new K5(inputStreamArr);
            }
            throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,64}: \"" + key + "\"");
        }
        throw new IllegalStateException("cache is closed");
    }

    public final synchronized void c() {
        try {
            BufferedWriter bufferedWriter = this.f25187l;
            if (bufferedWriter != null) {
                bufferedWriter.close();
            }
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f25179d), AbstractC3308sl.f27479a));
            try {
                bufferedWriter2.write("libcore.io.DiskLruCache");
                bufferedWriter2.write("\n");
                bufferedWriter2.write("1");
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.f25181f));
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.f25183h));
                bufferedWriter2.write("\n");
                bufferedWriter2.write("\n");
                for (I5 i10 : this.f25184i.values()) {
                    if (i10.f24985d != null) {
                        bufferedWriter2.write("DIRTY " + i10.f24982a + '\n');
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("CLEAN ");
                        sb2.append(i10.f24982a);
                        StringBuilder sb3 = new StringBuilder();
                        for (long j10 : i10.f24983b) {
                            sb3.append(' ');
                            sb3.append(j10);
                        }
                        sb2.append(sb3.toString());
                        sb2.append('\n');
                        bufferedWriter2.write(sb2.toString());
                    }
                }
                bufferedWriter2.close();
                if (this.f25178c.exists()) {
                    File file = this.f25178c;
                    File file2 = this.f25180e;
                    if (file2.exists() && !file2.delete()) {
                        throw new IOException();
                    }
                    if (!file.renameTo(file2)) {
                        throw new IOException();
                    }
                }
                if (this.f25179d.renameTo(this.f25178c)) {
                    this.f25180e.delete();
                    this.f25187l = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f25178c, true), AbstractC3308sl.f27479a));
                } else {
                    throw new IOException();
                }
            } catch (Throwable th2) {
                bufferedWriter2.close();
                throw th2;
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final synchronized void a(H5 h10, boolean z10) {
        int i10;
        I5 i11 = h10.f24918a;
        if (i11.f24985d == h10) {
            if (z10 && !i11.f24984c) {
                for (int i12 = 0; i12 < this.f25183h; i12++) {
                    if (h10.f24919b[i12]) {
                        if (!i11.b(i12).exists()) {
                            h10.f24921d.a(h10, false);
                            return;
                        }
                    } else {
                        h10.f24921d.a(h10, false);
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i12);
                    }
                }
            }
            for (int i13 = 0; i13 < this.f25183h; i13++) {
                File fileB = i11.b(i13);
                if (z10) {
                    if (fileB.exists()) {
                        File fileA = i11.a(i13);
                        fileB.renameTo(fileA);
                        long j10 = i11.f24983b[i13];
                        long length = fileA.length();
                        i11.f24983b[i13] = length;
                        this.f25186k = (this.f25186k - j10) + length;
                    }
                } else if (fileB.exists() && !fileB.delete()) {
                    throw new IOException();
                }
            }
            this.f25188m++;
            i11.f24985d = null;
            if (i11.f24984c | z10) {
                i11.f24984c = true;
                BufferedWriter bufferedWriter = this.f25187l;
                StringBuilder sb2 = new StringBuilder("CLEAN ");
                sb2.append(i11.f24982a);
                StringBuilder sb3 = new StringBuilder();
                for (long j11 : i11.f24983b) {
                    sb3.append(' ');
                    sb3.append(j11);
                }
                sb2.append(sb3.toString());
                sb2.append('\n');
                bufferedWriter.write(sb2.toString());
                if (z10) {
                    this.f25189n++;
                }
            } else {
                this.f25184i.remove(i11.f24982a);
                this.f25187l.write("REMOVE " + i11.f24982a + '\n');
            }
            this.f25187l.flush();
            if (this.f25186k > this.f25185j || ((i10 = this.f25188m) >= 2000 && i10 >= this.f25184i.size())) {
                this.f25176a.submit(this.f25190o);
                return;
            }
            return;
        }
        throw new IllegalStateException("CurrentEditor of Entry didn't match with CurrentEditor instance.");
    }
}
