package k4;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import p4.e;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class c implements e, p4.d {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final TreeMap f42972i = new TreeMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile String f42973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final long[] f42974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final double[] f42975c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final String[] f42976d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final byte[][] f42977e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int[] f42978f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final int f42979g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f42980h;

    private c(int i10) {
        this.f42979g = i10;
        int i11 = i10 + 1;
        this.f42978f = new int[i11];
        this.f42974b = new long[i11];
        this.f42975c = new double[i11];
        this.f42976d = new String[i11];
        this.f42977e = new byte[i11][];
    }

    public static c c(String str, int i10) {
        TreeMap treeMap = f42972i;
        synchronized (treeMap) {
            try {
                Map.Entry entryCeilingEntry = treeMap.ceilingEntry(Integer.valueOf(i10));
                if (entryCeilingEntry == null) {
                    c cVar = new c(i10);
                    cVar.h(str, i10);
                    return cVar;
                }
                treeMap.remove(entryCeilingEntry.getKey());
                c cVar2 = (c) entryCeilingEntry.getValue();
                cVar2.h(str, i10);
                return cVar2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static void k() {
        TreeMap treeMap = f42972i;
        if (treeMap.size() <= 15) {
            return;
        }
        int size = treeMap.size() - 10;
        Iterator it = treeMap.descendingKeySet().iterator();
        while (true) {
            int i10 = size - 1;
            if (size <= 0) {
                return;
            }
            it.next();
            it.remove();
            size = i10;
        }
    }

    @Override // p4.d
    public void E0(int i10) {
        this.f42978f[i10] = 1;
    }

    @Override // p4.e
    public void a(p4.d dVar) {
        for (int i10 = 1; i10 <= this.f42980h; i10++) {
            int i11 = this.f42978f[i10];
            if (i11 == 1) {
                dVar.E0(i10);
            } else if (i11 == 2) {
                dVar.s0(i10, this.f42974b[i10]);
            } else if (i11 == 3) {
                dVar.e(i10, this.f42975c[i10]);
            } else if (i11 == 4) {
                dVar.h0(i10, this.f42976d[i10]);
            } else if (i11 == 5) {
                dVar.u0(i10, this.f42977e[i10]);
            }
        }
    }

    @Override // p4.e
    public String d() {
        return this.f42973a;
    }

    @Override // p4.d
    public void e(int i10, double d10) {
        this.f42978f[i10] = 3;
        this.f42975c[i10] = d10;
    }

    void h(String str, int i10) {
        this.f42973a = str;
        this.f42980h = i10;
    }

    @Override // p4.d
    public void h0(int i10, String str) {
        this.f42978f[i10] = 4;
        this.f42976d[i10] = str;
    }

    public void release() {
        TreeMap treeMap = f42972i;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f42979g), this);
            k();
        }
    }

    @Override // p4.d
    public void s0(int i10, long j10) {
        this.f42978f[i10] = 2;
        this.f42974b[i10] = j10;
    }

    @Override // p4.d
    public void u0(int i10, byte[] bArr) {
        this.f42978f[i10] = 5;
        this.f42977e[i10] = bArr;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
