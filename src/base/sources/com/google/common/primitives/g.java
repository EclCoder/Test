package com.google.common.primitives;

import com.inmobi.media.core.config.models.AdConfig;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import sc.p;
import tn.xQIL.Saucuwx;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class g extends h {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class a extends AbstractList implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int[] f21923a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f21924b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f21925c;

        a(int[] iArr) {
            this(iArr, 0, iArr.length);
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer get(int i10) {
            p.m(i10, size());
            return Integer.valueOf(this.f21923a[this.f21924b + i10]);
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Integer set(int i10, Integer num) {
            p.m(i10, size());
            int[] iArr = this.f21923a;
            int i11 = this.f21924b;
            int i12 = iArr[i11 + i10];
            iArr[i11 + i10] = ((Integer) p.o(num)).intValue();
            return Integer.valueOf(i12);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return (obj instanceof Integer) && g.k(this.f21923a, ((Integer) obj).intValue(), this.f21924b, this.f21925c) != -1;
        }

        int[] d() {
            return Arrays.copyOfRange(this.f21923a, this.f21924b, this.f21925c);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return super.equals(obj);
            }
            a aVar = (a) obj;
            int size = size();
            if (aVar.size() != size) {
                return false;
            }
            for (int i10 = 0; i10 < size; i10++) {
                if (this.f21923a[this.f21924b + i10] != aVar.f21923a[aVar.f21924b + i10]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int i10 = 1;
            for (int i11 = this.f21924b; i11 < this.f21925c; i11++) {
                i10 = (i10 * 31) + g.i(this.f21923a[i11]);
            }
            return i10;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            int iK;
            if (!(obj instanceof Integer) || (iK = g.k(this.f21923a, ((Integer) obj).intValue(), this.f21924b, this.f21925c)) < 0) {
                return -1;
            }
            return iK - this.f21924b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            int iL;
            if (!(obj instanceof Integer) || (iL = g.l(this.f21923a, ((Integer) obj).intValue(), this.f21924b, this.f21925c)) < 0) {
                return -1;
            }
            return iL - this.f21924b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f21925c - this.f21924b;
        }

        @Override // java.util.AbstractList, java.util.List
        public List subList(int i10, int i11) {
            p.u(i10, i11, size());
            if (i10 == i11) {
                return Collections.EMPTY_LIST;
            }
            int[] iArr = this.f21923a;
            int i12 = this.f21924b;
            return new a(iArr, i10 + i12, i12 + i11);
        }

        a(int[] iArr, int i10, int i11) {
            this.f21923a = iArr;
            this.f21924b = i10;
            this.f21925c = i11;
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb2 = new StringBuilder(size() * 5);
            sb2.append('[');
            sb2.append(this.f21923a[this.f21924b]);
            int i10 = this.f21924b;
            while (true) {
                i10++;
                if (i10 >= this.f21925c) {
                    sb2.append(']');
                    return sb2.toString();
                }
                sb2.append(Saucuwx.zujda);
                sb2.append(this.f21923a[i10]);
            }
        }
    }

    public static List c(int... iArr) {
        return iArr.length == 0 ? Collections.EMPTY_LIST : new a(iArr);
    }

    public static int d(long j10) {
        int i10 = (int) j10;
        p.i(((long) i10) == j10, "Out of range: %s", j10);
        return i10;
    }

    public static int e(int i10, int i11) {
        if (i10 < i11) {
            return -1;
        }
        return i10 > i11 ? 1 : 0;
    }

    public static int f(int i10, int i11, int i12) {
        p.h(i11 <= i12, "min (%s) must be less than or equal to max (%s)", i11, i12);
        return Math.min(Math.max(i10, i11), i12);
    }

    public static int g(byte[] bArr) {
        p.h(bArr.length >= 4, "array too small: %s < %s", bArr.length, 4);
        return h(bArr[0], bArr[1], bArr[2], bArr[3]);
    }

    public static int h(byte b10, byte b11, byte b12, byte b13) {
        return (b10 << 24) | ((b11 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((b12 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (b13 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
    }

    public static int j(int[] iArr, int i10) {
        return k(iArr, i10, 0, iArr.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int k(int[] iArr, int i10, int i11, int i12) {
        while (i11 < i12) {
            if (iArr[i11] == i10) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int l(int[] iArr, int i10, int i11, int i12) {
        for (int i13 = i12 - 1; i13 >= i11; i13--) {
            if (iArr[i13] == i10) {
                return i13;
            }
        }
        return -1;
    }

    public static int m(long j10) {
        if (j10 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j10 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j10;
    }

    public static int[] n(Collection collection) {
        if (collection instanceof a) {
            return ((a) collection).d();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = ((Number) p.o(array[i10])).intValue();
        }
        return iArr;
    }

    public static Integer o(String str) {
        return p(str, 10);
    }

    public static Integer p(String str, int i10) {
        Long lD = i.d(str, i10);
        if (lD == null || lD.longValue() != lD.intValue()) {
            return null;
        }
        return Integer.valueOf(lD.intValue());
    }

    public static int i(int i10) {
        return i10;
    }
}
