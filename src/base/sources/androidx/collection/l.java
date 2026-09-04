package androidx.collection;

import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class l implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ boolean f1920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ long[] f1921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object[] f1922c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ int f1923d;

    public l() {
        this(0, 1, null);
    }

    public void b() {
        int i10 = this.f1923d;
        Object[] objArr = this.f1922c;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.f1923d = 0;
        this.f1920a = false;
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public l clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        kotlin.jvm.internal.s.f(objClone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        l lVar = (l) objClone;
        lVar.f1921b = (long[]) this.f1921b.clone();
        lVar.f1922c = (Object[]) this.f1922c.clone();
        return lVar;
    }

    public boolean d(long j10) {
        return f(j10) >= 0;
    }

    public Object e(long j10) {
        int iB = s.a.b(this.f1921b, this.f1923d, j10);
        if (iB < 0 || this.f1922c[iB] == m.f1924a) {
            return null;
        }
        return this.f1922c[iB];
    }

    public int f(long j10) {
        if (this.f1920a) {
            int i10 = this.f1923d;
            long[] jArr = this.f1921b;
            Object[] objArr = this.f1922c;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != m.f1924a) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            this.f1920a = false;
            this.f1923d = i11;
        }
        return s.a.b(this.f1921b, this.f1923d, j10);
    }

    public boolean g() {
        return l() == 0;
    }

    public long h(int i10) {
        if (!(i10 >= 0 && i10 < this.f1923d)) {
            s.d.a("Expected index to be within 0..size()-1, but was " + i10);
        }
        if (this.f1920a) {
            int i11 = this.f1923d;
            long[] jArr = this.f1921b;
            Object[] objArr = this.f1922c;
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                Object obj = objArr[i13];
                if (obj != m.f1924a) {
                    if (i13 != i12) {
                        jArr[i12] = jArr[i13];
                        objArr[i12] = obj;
                        objArr[i13] = null;
                    }
                    i12++;
                }
            }
            this.f1920a = false;
            this.f1923d = i12;
        }
        return this.f1921b[i10];
    }

    public void i(long j10, Object obj) {
        int iB = s.a.b(this.f1921b, this.f1923d, j10);
        if (iB >= 0) {
            this.f1922c[iB] = obj;
            return;
        }
        int i10 = ~iB;
        if (i10 < this.f1923d && this.f1922c[i10] == m.f1924a) {
            this.f1921b[i10] = j10;
            this.f1922c[i10] = obj;
            return;
        }
        if (this.f1920a) {
            int i11 = this.f1923d;
            long[] jArr = this.f1921b;
            if (i11 >= jArr.length) {
                Object[] objArr = this.f1922c;
                int i12 = 0;
                for (int i13 = 0; i13 < i11; i13++) {
                    Object obj2 = objArr[i13];
                    if (obj2 != m.f1924a) {
                        if (i13 != i12) {
                            jArr[i12] = jArr[i13];
                            objArr[i12] = obj2;
                            objArr[i13] = null;
                        }
                        i12++;
                    }
                }
                this.f1920a = false;
                this.f1923d = i12;
                i10 = ~s.a.b(this.f1921b, i12, j10);
            }
        }
        int i14 = this.f1923d;
        if (i14 >= this.f1921b.length) {
            int iF = s.a.f(i14 + 1);
            long[] jArrCopyOf = Arrays.copyOf(this.f1921b, iF);
            kotlin.jvm.internal.s.g(jArrCopyOf, "copyOf(...)");
            this.f1921b = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f1922c, iF);
            kotlin.jvm.internal.s.g(objArrCopyOf, "copyOf(...)");
            this.f1922c = objArrCopyOf;
        }
        int i15 = this.f1923d;
        if (i15 - i10 != 0) {
            long[] jArr2 = this.f1921b;
            int i16 = i10 + 1;
            gl.j.j(jArr2, jArr2, i16, i10, i15);
            Object[] objArr2 = this.f1922c;
            gl.j.k(objArr2, objArr2, i16, i10, this.f1923d);
        }
        this.f1921b[i10] = j10;
        this.f1922c[i10] = obj;
        this.f1923d++;
    }

    public void j(long j10) {
        int iB = s.a.b(this.f1921b, this.f1923d, j10);
        if (iB < 0 || this.f1922c[iB] == m.f1924a) {
            return;
        }
        this.f1922c[iB] = m.f1924a;
        this.f1920a = true;
    }

    public void k(int i10) {
        if (this.f1922c[i10] != m.f1924a) {
            this.f1922c[i10] = m.f1924a;
            this.f1920a = true;
        }
    }

    public int l() {
        if (this.f1920a) {
            int i10 = this.f1923d;
            long[] jArr = this.f1921b;
            Object[] objArr = this.f1922c;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != m.f1924a) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            this.f1920a = false;
            this.f1923d = i11;
        }
        return this.f1923d;
    }

    public Object m(int i10) {
        if (!(i10 >= 0 && i10 < this.f1923d)) {
            s.d.a("Expected index to be within 0..size()-1, but was " + i10);
        }
        if (this.f1920a) {
            int i11 = this.f1923d;
            long[] jArr = this.f1921b;
            Object[] objArr = this.f1922c;
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                Object obj = objArr[i13];
                if (obj != m.f1924a) {
                    if (i13 != i12) {
                        jArr[i12] = jArr[i13];
                        objArr[i12] = obj;
                        objArr[i13] = null;
                    }
                    i12++;
                }
            }
            this.f1920a = false;
            this.f1923d = i12;
        }
        return this.f1922c[i10];
    }

    public String toString() {
        if (l() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f1923d * 28);
        sb2.append('{');
        int i10 = this.f1923d;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            sb2.append(h(i11));
            sb2.append('=');
            Object objM = m(i11);
            if (objM != sb2) {
                sb2.append(objM);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        String string = sb2.toString();
        kotlin.jvm.internal.s.g(string, "toString(...)");
        return string;
    }

    public l(int i10) {
        if (i10 == 0) {
            this.f1921b = s.a.f51435b;
            this.f1922c = s.a.f51436c;
        } else {
            int iF = s.a.f(i10);
            this.f1921b = new long[iF];
            this.f1922c = new Object[iF];
        }
    }

    public /* synthetic */ l(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 10 : i10);
    }
}
