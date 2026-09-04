package androidx.databinding;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class c implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List f3438a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f3439b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long[] f3440c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f3441d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a f3442e;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static abstract class a {
        public abstract void a(Object obj, Object obj2, int i10, Object obj3);
    }

    public c(a aVar) {
        this.f3442e = aVar;
    }

    private boolean d(int i10) {
        int i11;
        if (i10 < 64) {
            return ((1 << i10) & this.f3439b) != 0;
        }
        long[] jArr = this.f3440c;
        if (jArr != null && (i11 = (i10 / 64) - 1) < jArr.length) {
            return ((1 << (i10 % 64)) & jArr[i11]) != 0;
        }
        return false;
    }

    private void f(Object obj, int i10, Object obj2, int i11, int i12, long j10) {
        long j11 = 1;
        while (i11 < i12) {
            if ((j10 & j11) == 0) {
                this.f3442e.a(this.f3438a.get(i11), obj, i10, obj2);
            }
            j11 <<= 1;
            i11++;
        }
    }

    private void g(Object obj, int i10, Object obj2) {
        f(obj, i10, obj2, 0, Math.min(64, this.f3438a.size()), this.f3439b);
    }

    private void h(Object obj, int i10, Object obj2) {
        int size = this.f3438a.size();
        long[] jArr = this.f3440c;
        int length = jArr == null ? -1 : jArr.length - 1;
        i(obj, i10, obj2, length);
        f(obj, i10, obj2, (length + 2) * 64, size, 0L);
    }

    private void i(Object obj, int i10, Object obj2, int i11) {
        if (i11 < 0) {
            g(obj, i10, obj2);
            return;
        }
        long j10 = this.f3440c[i11];
        int i12 = (i11 + 1) * 64;
        int iMin = Math.min(this.f3438a.size(), i12 + 64);
        i(obj, i10, obj2, i11 - 1);
        f(obj, i10, obj2, i12, iMin, j10);
    }

    private void k(int i10, long j10) {
        long j11 = Long.MIN_VALUE;
        for (int i11 = i10 + 63; i11 >= i10; i11--) {
            if ((j10 & j11) != 0) {
                this.f3438a.remove(i11);
            }
            j11 >>>= 1;
        }
    }

    private void l(int i10) {
        if (i10 < 64) {
            this.f3439b = (1 << i10) | this.f3439b;
            return;
        }
        int i11 = (i10 / 64) - 1;
        long[] jArr = this.f3440c;
        if (jArr == null) {
            this.f3440c = new long[this.f3438a.size() / 64];
        } else if (jArr.length <= i11) {
            long[] jArr2 = new long[this.f3438a.size() / 64];
            long[] jArr3 = this.f3440c;
            System.arraycopy(jArr3, 0, jArr2, 0, jArr3.length);
            this.f3440c = jArr2;
        }
        long j10 = 1 << (i10 % 64);
        long[] jArr4 = this.f3440c;
        jArr4[i11] = j10 | jArr4[i11];
    }

    public synchronized void b(Object obj) {
        try {
            if (obj == null) {
                throw new IllegalArgumentException("callback cannot be null");
            }
            int iLastIndexOf = this.f3438a.lastIndexOf(obj);
            if (iLastIndexOf < 0 || d(iLastIndexOf)) {
                this.f3438a.add(obj);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public synchronized c clone() {
        c cVar;
        CloneNotSupportedException e10;
        try {
            cVar = (c) super.clone();
            try {
                cVar.f3439b = 0L;
                cVar.f3440c = null;
                cVar.f3441d = 0;
                cVar.f3438a = new ArrayList();
                int size = this.f3438a.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (!d(i10)) {
                        cVar.f3438a.add(this.f3438a.get(i10));
                    }
                }
            } catch (CloneNotSupportedException e11) {
                e10 = e11;
                e10.printStackTrace();
            }
        } catch (CloneNotSupportedException e12) {
            cVar = null;
            e10 = e12;
        }
        return cVar;
    }

    public synchronized void e(Object obj, int i10, Object obj2) {
        try {
            this.f3441d++;
            h(obj, i10, obj2);
            int i11 = this.f3441d - 1;
            this.f3441d = i11;
            if (i11 == 0) {
                long[] jArr = this.f3440c;
                if (jArr != null) {
                    for (int length = jArr.length - 1; length >= 0; length--) {
                        long j10 = this.f3440c[length];
                        if (j10 != 0) {
                            k((length + 1) * 64, j10);
                            this.f3440c[length] = 0;
                        }
                    }
                }
                long j11 = this.f3439b;
                if (j11 != 0) {
                    k(0, j11);
                    this.f3439b = 0L;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void j(Object obj) {
        try {
            if (this.f3441d == 0) {
                this.f3438a.remove(obj);
            } else {
                int iLastIndexOf = this.f3438a.lastIndexOf(obj);
                if (iLastIndexOf >= 0) {
                    l(iLastIndexOf);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
