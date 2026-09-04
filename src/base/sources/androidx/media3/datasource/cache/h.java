package androidx.media3.datasource.cache;

import android.os.ConditionVariable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import w1.n;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class h implements Cache {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final HashSet f4843l = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f4844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f4845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f f4846c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final d f4847d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashMap f4848e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Random f4849f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f4850g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f4851h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f4852i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f4853j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Cache.CacheException f4854k;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends Thread {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ConditionVariable f4855a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, ConditionVariable conditionVariable) {
            super(str);
            this.f4855a = conditionVariable;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            synchronized (h.this) {
                this.f4855a.open();
                h.this.o();
                h.this.f4845b.onCacheInitialized();
            }
        }
    }

    public h(File file, b bVar, y1.a aVar) {
        this(file, bVar, aVar, null, false, false);
    }

    private static synchronized void A(File file) {
        f4843l.remove(file.getAbsoluteFile());
    }

    private void i(i iVar) {
        this.f4846c.k(iVar.f88a).a(iVar);
        this.f4852i += iVar.f90c;
        s(iVar);
    }

    private static void k(File file) throws Cache.CacheException {
        if (file.mkdirs() || file.isDirectory()) {
            return;
        }
        String str = "Failed to create cache directory: " + file;
        n.c("SimpleCache", str);
        throw new Cache.CacheException(str);
    }

    private static long l(File file) throws IOException {
        long jNextLong = new SecureRandom().nextLong();
        long jAbs = jNextLong == Long.MIN_VALUE ? 0L : Math.abs(jNextLong);
        File file2 = new File(file, Long.toString(jAbs, 16) + ".uid");
        if (file2.createNewFile()) {
            return jAbs;
        }
        throw new IOException("Failed to create UID file: " + file2);
    }

    private i n(String str, long j10, long j11) {
        i iVarE;
        e eVarF = this.f4846c.f(str);
        if (eVarF == null) {
            return i.g(str, j10, j11);
        }
        while (true) {
            iVarE = eVarF.e(j10, j11);
            if (!iVarE.f91d || ((File) w1.a.e(iVarE.f92e)).length() == iVarE.f90c) {
                break;
            }
            y();
        }
        return iVarE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        if (!this.f4844a.exists()) {
            try {
                k(this.f4844a);
            } catch (Cache.CacheException e10) {
                this.f4854k = e10;
                return;
            }
        }
        File[] fileArrListFiles = this.f4844a.listFiles();
        if (fileArrListFiles == null) {
            String str = "Failed to list cache directory files: " + this.f4844a;
            n.c("SimpleCache", str);
            this.f4854k = new Cache.CacheException(str);
            return;
        }
        long jQ = q(fileArrListFiles);
        this.f4851h = jQ;
        if (jQ == -1) {
            try {
                this.f4851h = l(this.f4844a);
            } catch (IOException e11) {
                String str2 = "Failed to create cache UID: " + this.f4844a;
                n.d("SimpleCache", str2, e11);
                this.f4854k = new Cache.CacheException(str2, e11);
                return;
            }
        }
        try {
            this.f4846c.l(this.f4851h);
            d dVar = this.f4847d;
            if (dVar != null) {
                dVar.e(this.f4851h);
                Map mapB = this.f4847d.b();
                p(this.f4844a, true, fileArrListFiles, mapB);
                this.f4847d.g(mapB.keySet());
            } else {
                p(this.f4844a, true, fileArrListFiles, null);
            }
            this.f4846c.p();
            try {
                this.f4846c.q();
            } catch (IOException e12) {
                n.d("SimpleCache", "Storing index file failed", e12);
            }
        } catch (IOException e13) {
            String str3 = "Failed to initialize cache indices: " + this.f4844a;
            n.d("SimpleCache", str3, e13);
            this.f4854k = new Cache.CacheException(str3, e13);
        }
    }

    private void p(File file, boolean z10, File[] fileArr, Map map) {
        long j10;
        long j11;
        if (fileArr == null || fileArr.length == 0) {
            if (z10) {
                return;
            }
            file.delete();
            return;
        }
        for (File file2 : fileArr) {
            String name = file2.getName();
            if (z10 && name.indexOf(46) == -1) {
                p(file2, false, file2.listFiles(), map);
            } else if (!z10 || (!f.m(name) && !name.endsWith(".uid"))) {
                c cVar = map != null ? (c) map.remove(name) : null;
                if (cVar != null) {
                    j10 = cVar.f4812a;
                    j11 = cVar.f4813b;
                } else {
                    j10 = -1;
                    j11 = C.TIME_UNSET;
                }
                i iVarE = i.e(file2, j10, j11, this.f4846c);
                if (iVarE != null) {
                    i(iVarE);
                } else {
                    file2.delete();
                }
            }
        }
    }

    private static long q(File[] fileArr) {
        int length = fileArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            File file = fileArr[i10];
            String name = file.getName();
            if (name.endsWith(".uid")) {
                try {
                    return v(name);
                } catch (NumberFormatException unused) {
                    n.c("SimpleCache", "Malformed UID file: " + file);
                    file.delete();
                }
            }
        }
        return -1L;
    }

    private static synchronized boolean r(File file) {
        return f4843l.add(file.getAbsoluteFile());
    }

    private void s(i iVar) {
        ArrayList arrayList = (ArrayList) this.f4848e.get(iVar.f88a);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((Cache.a) arrayList.get(size)).b(this, iVar);
            }
        }
        this.f4845b.b(this, iVar);
    }

    private void t(a2.c cVar) {
        ArrayList arrayList = (ArrayList) this.f4848e.get(cVar.f88a);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((Cache.a) arrayList.get(size)).c(this, cVar);
            }
        }
        this.f4845b.c(this, cVar);
    }

    private void u(i iVar, a2.c cVar) {
        ArrayList arrayList = (ArrayList) this.f4848e.get(iVar.f88a);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((Cache.a) arrayList.get(size)).a(this, iVar, cVar);
            }
        }
        this.f4845b.a(this, iVar, cVar);
    }

    private static long v(String str) {
        return Long.parseLong(str.substring(0, str.indexOf(46)), 16);
    }

    private void x(a2.c cVar) {
        e eVarF = this.f4846c.f(cVar.f88a);
        if (eVarF == null || !eVarF.k(cVar)) {
            return;
        }
        this.f4852i -= cVar.f90c;
        if (this.f4847d != null) {
            String name = ((File) w1.a.e(cVar.f92e)).getName();
            try {
                this.f4847d.f(name);
            } catch (IOException unused) {
                n.h("SimpleCache", "Failed to remove file index entry for: " + name);
            }
        }
        this.f4846c.n(eVarF.f4818b);
        t(cVar);
    }

    private void y() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f4846c.g().iterator();
        while (it.hasNext()) {
            for (a2.c cVar : ((e) it.next()).f()) {
                if (((File) w1.a.e(cVar.f92e)).length() != cVar.f90c) {
                    arrayList.add(cVar);
                }
            }
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            x((a2.c) arrayList.get(i10));
        }
    }

    private i z(String str, i iVar) {
        boolean z10;
        if (!this.f4850g) {
            return iVar;
        }
        String name = ((File) w1.a.e(iVar.f92e)).getName();
        long j10 = iVar.f90c;
        long jCurrentTimeMillis = System.currentTimeMillis();
        d dVar = this.f4847d;
        if (dVar != null) {
            try {
                dVar.h(name, j10, jCurrentTimeMillis);
            } catch (IOException unused) {
                n.h("SimpleCache", "Failed to update index with new touch timestamp.");
            }
            z10 = false;
        } else {
            z10 = true;
        }
        i iVarL = ((e) w1.a.e(this.f4846c.f(str))).l(iVar, jCurrentTimeMillis, z10);
        u(iVar, iVarL);
        return iVarL;
    }

    @Override // androidx.media3.datasource.cache.Cache
    public synchronized void a(a2.c cVar) {
        w1.a.g(!this.f4853j);
        x(cVar);
    }

    @Override // androidx.media3.datasource.cache.Cache
    public synchronized a2.c b(String str, long j10, long j11) throws Throwable {
        try {
            try {
                w1.a.g(!this.f4853j);
                j();
                i iVarN = n(str, j10, j11);
                if (iVarN.f91d) {
                    return z(str, iVarN);
                }
                if (this.f4846c.k(str).j(j10, iVarN.f90c)) {
                    return iVarN;
                }
                return null;
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // androidx.media3.datasource.cache.Cache
    public synchronized void c(a2.c cVar) {
        w1.a.g(!this.f4853j);
        e eVar = (e) w1.a.e(this.f4846c.f(cVar.f88a));
        eVar.m(cVar.f89b);
        this.f4846c.n(eVar.f4818b);
        notifyAll();
    }

    @Override // androidx.media3.datasource.cache.Cache
    public synchronized void d(String str, a2.e eVar) {
        w1.a.g(!this.f4853j);
        j();
        this.f4846c.d(str, eVar);
        try {
            this.f4846c.q();
        } catch (IOException e10) {
            throw new Cache.CacheException(e10);
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:? -> B:10:0x001e). Please report as a decompilation issue!!! */
    @Override // androidx.media3.datasource.cache.Cache
    public synchronized a2.c e(String str, long j10, long j11) throws Throwable {
        try {
            w1.a.g(!this.f4853j);
            j();
            while (true) {
                a2.c cVarB = b(str, j10, j11);
                long j12 = j11;
                long j13 = j10;
                String str2 = str;
                if (cVarB != null) {
                    return cVarB;
                }
                try {
                    wait();
                    str = str2;
                    j10 = j13;
                    j11 = j12;
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    @Override // androidx.media3.datasource.cache.Cache
    public synchronized void f(File file, long j10) {
        boolean z10 = true;
        w1.a.g(!this.f4853j);
        if (file.exists()) {
            if (j10 == 0) {
                file.delete();
                return;
            }
            i iVar = (i) w1.a.e(i.f(file, j10, this.f4846c));
            e eVar = (e) w1.a.e(this.f4846c.f(iVar.f88a));
            w1.a.g(eVar.h(iVar.f89b, iVar.f90c));
            long jB = a2.d.b(eVar.d());
            if (jB != -1) {
                if (iVar.f89b + iVar.f90c > jB) {
                    z10 = false;
                }
                w1.a.g(z10);
            }
            if (this.f4847d == null) {
                i(iVar);
                this.f4846c.q();
                notifyAll();
                return;
            }
            try {
                this.f4847d.h(file.getName(), iVar.f90c, iVar.f93f);
                i(iVar);
                try {
                    this.f4846c.q();
                    notifyAll();
                    return;
                } catch (IOException e10) {
                    throw new Cache.CacheException(e10);
                }
            } catch (IOException e11) {
                throw new Cache.CacheException(e11);
            }
            throw th;
        }
    }

    @Override // androidx.media3.datasource.cache.Cache
    public synchronized a2.d getContentMetadata(String str) {
        w1.a.g(!this.f4853j);
        return this.f4846c.h(str);
    }

    public synchronized void j() {
        Cache.CacheException cacheException = this.f4854k;
        if (cacheException != null) {
            throw cacheException;
        }
    }

    public synchronized long m(String str, long j10, long j11) {
        e eVarF;
        w1.a.g(!this.f4853j);
        if (j11 == -1) {
            j11 = Long.MAX_VALUE;
        }
        eVarF = this.f4846c.f(str);
        return eVarF != null ? eVarF.c(j10, j11) : -j11;
    }

    @Override // androidx.media3.datasource.cache.Cache
    public synchronized File startFile(String str, long j10, long j11) throws Throwable {
        Throwable th2;
        try {
            try {
                w1.a.g(!this.f4853j);
                j();
                e eVarF = this.f4846c.f(str);
                w1.a.e(eVarF);
                w1.a.g(eVarF.h(j10, j11));
                if (!this.f4844a.exists()) {
                    try {
                        k(this.f4844a);
                        y();
                    } catch (Throwable th3) {
                        th2 = th3;
                        throw th2;
                    }
                }
                this.f4845b.e(this, str, j10, j11);
                File file = new File(this.f4844a, Integer.toString(this.f4849f.nextInt(10)));
                if (!file.exists()) {
                    k(file);
                }
                return i.i(file, eVarF.f4817a, j10, System.currentTimeMillis());
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                throw th2;
            }
        } catch (Throwable th5) {
            th = th5;
            th2 = th;
            throw th2;
        }
    }

    public synchronized void w() {
        File file;
        if (this.f4853j) {
            return;
        }
        this.f4848e.clear();
        y();
        try {
            try {
                this.f4846c.q();
                file = this.f4844a;
            } catch (IOException e10) {
                n.d("SimpleCache", "Storing index file failed", e10);
                file = this.f4844a;
            }
            A(file);
            this.f4853j = true;
        } catch (Throwable th2) {
            A(this.f4844a);
            this.f4853j = true;
            throw th2;
        }
    }

    public h(File file, b bVar, y1.a aVar, byte[] bArr, boolean z10, boolean z11) {
        this(file, bVar, new f(aVar, file, bArr, z10, z11), (aVar == null || z11) ? null : new d(aVar));
    }

    h(File file, b bVar, f fVar, d dVar) {
        if (r(file)) {
            this.f4844a = file;
            this.f4845b = bVar;
            this.f4846c = fVar;
            this.f4847d = dVar;
            this.f4848e = new HashMap();
            this.f4849f = new Random();
            this.f4850g = bVar.d();
            this.f4851h = -1L;
            ConditionVariable conditionVariable = new ConditionVariable();
            new a("ExoPlayer:SimpleCacheInit", conditionVariable).start();
            conditionVariable.block();
            return;
        }
        throw new IllegalStateException("Another SimpleCache instance uses the folder: " + file);
    }
}
