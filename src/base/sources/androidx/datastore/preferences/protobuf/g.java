package androidx.datastore.preferences.protobuf;

import com.inmobi.media.core.config.models.AdConfig;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class g implements Iterable, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g f3535b = new i(x.f3754d);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final f f3536c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Comparator f3537d;
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f3538a = 0;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f3539a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f3540b;

        a() {
            this.f3540b = g.this.size();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f3539a < this.f3540b;
        }

        @Override // androidx.datastore.preferences.protobuf.g.InterfaceC0033g
        public byte nextByte() {
            int i10 = this.f3539a;
            if (i10 >= this.f3540b) {
                throw new NoSuchElementException();
            }
            this.f3539a = i10 + 1;
            return g.this.n(i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b implements Comparator {
        b() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(g gVar, g gVar2) {
            InterfaceC0033g interfaceC0033gO = gVar.o();
            InterfaceC0033g interfaceC0033gO2 = gVar2.o();
            while (interfaceC0033gO.hasNext() && interfaceC0033gO2.hasNext()) {
                int iCompareTo = Integer.valueOf(g.w(interfaceC0033gO.nextByte())).compareTo(Integer.valueOf(g.w(interfaceC0033gO2.nextByte())));
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
            }
            return Integer.valueOf(gVar.size()).compareTo(Integer.valueOf(gVar2.size()));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static abstract class c implements InterfaceC0033g {
        c() {
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Byte next() {
            return Byte.valueOf(nextByte());
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class d implements f {
        private d() {
        }

        @Override // androidx.datastore.preferences.protobuf.g.f
        public byte[] copyFrom(byte[] bArr, int i10, int i11) {
            return Arrays.copyOfRange(bArr, i10, i11 + i10);
        }

        /* synthetic */ d(a aVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class e extends i {
        private static final long serialVersionUID = 1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f3542f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f3543g;

        e(byte[] bArr, int i10, int i11) {
            super(bArr);
            g.e(i10, i10 + i11, bArr.length);
            this.f3542f = i10;
            this.f3543g = i11;
        }

        private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
            throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
        }

        @Override // androidx.datastore.preferences.protobuf.g.i
        protected int C() {
            return this.f3542f;
        }

        @Override // androidx.datastore.preferences.protobuf.g.i, androidx.datastore.preferences.protobuf.g
        public byte b(int i10) {
            g.d(i10, size());
            return this.f3544e[this.f3542f + i10];
        }

        @Override // androidx.datastore.preferences.protobuf.g.i, androidx.datastore.preferences.protobuf.g
        protected void m(byte[] bArr, int i10, int i11, int i12) {
            System.arraycopy(this.f3544e, C() + i10, bArr, i11, i12);
        }

        @Override // androidx.datastore.preferences.protobuf.g.i, androidx.datastore.preferences.protobuf.g
        byte n(int i10) {
            return this.f3544e[this.f3542f + i10];
        }

        @Override // androidx.datastore.preferences.protobuf.g.i, androidx.datastore.preferences.protobuf.g
        public int size() {
            return this.f3543g;
        }

        Object writeReplace() {
            return g.y(v());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private interface f {
        byte[] copyFrom(byte[] bArr, int i10, int i11);
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.g$g, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface InterfaceC0033g extends Iterator {
        byte nextByte();
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static abstract class h extends g {
        private static final long serialVersionUID = 1;

        /* synthetic */ h(a aVar) {
            this();
        }

        @Override // java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.o();
        }

        private h() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class i extends h {
        private static final long serialVersionUID = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        protected final byte[] f3544e;

        i(byte[] bArr) {
            super(null);
            bArr.getClass();
            this.f3544e = bArr;
        }

        @Override // androidx.datastore.preferences.protobuf.g
        final void A(androidx.datastore.preferences.protobuf.f fVar) {
            fVar.a(this.f3544e, C(), size());
        }

        final boolean B(g gVar, int i10, int i11) {
            if (i11 > gVar.size()) {
                throw new IllegalArgumentException("Length too large: " + i11 + size());
            }
            int i12 = i10 + i11;
            if (i12 > gVar.size()) {
                throw new IllegalArgumentException("Ran off end of other: " + i10 + ", " + i11 + ", " + gVar.size());
            }
            if (!(gVar instanceof i)) {
                return gVar.u(i10, i12).equals(u(0, i11));
            }
            i iVar = (i) gVar;
            byte[] bArr = this.f3544e;
            byte[] bArr2 = iVar.f3544e;
            int iC = C() + i11;
            int iC2 = C();
            int iC3 = iVar.C() + i10;
            while (iC2 < iC) {
                if (bArr[iC2] != bArr2[iC3]) {
                    return false;
                }
                iC2++;
                iC3++;
            }
            return true;
        }

        protected int C() {
            return 0;
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public byte b(int i10) {
            return this.f3544e[i10];
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof g) || size() != ((g) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof i)) {
                return obj.equals(this);
            }
            i iVar = (i) obj;
            int iR = r();
            int iR2 = iVar.r();
            if (iR == 0 || iR2 == 0 || iR == iR2) {
                return B(iVar, 0, size());
            }
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.g
        protected void m(byte[] bArr, int i10, int i11, int i12) {
            System.arraycopy(this.f3544e, i10, bArr, i11, i12);
        }

        @Override // androidx.datastore.preferences.protobuf.g
        byte n(int i10) {
            return this.f3544e[i10];
        }

        @Override // androidx.datastore.preferences.protobuf.g
        protected final int p(int i10, int i11, int i12) {
            return x.g(i10, this.f3544e, C() + i11, i12);
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public int size() {
            return this.f3544e.length;
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public final g u(int i10, int i11) {
            int iE = g.e(i10, i11, size());
            return iE == 0 ? g.f3535b : new e(this.f3544e, C() + i10, iE);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class j implements f {
        private j() {
        }

        @Override // androidx.datastore.preferences.protobuf.g.f
        public byte[] copyFrom(byte[] bArr, int i10, int i11) {
            byte[] bArr2 = new byte[i11];
            System.arraycopy(bArr, i10, bArr2, 0, i11);
            return bArr2;
        }

        /* synthetic */ j(a aVar) {
            this();
        }
    }

    static {
        a aVar = null;
        f3536c = androidx.datastore.preferences.protobuf.d.c() ? new j(aVar) : new d(aVar);
        f3537d = new b();
    }

    g() {
    }

    static void d(int i10, int i11) {
        if (((i11 - (i10 + 1)) | i10) < 0) {
            if (i10 < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i10);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i10 + ", " + i11);
        }
    }

    static int e(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
            return i13;
        }
        if (i10 < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i10 + " < 0");
        }
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i10 + ", " + i11);
        }
        throw new IndexOutOfBoundsException("End index: " + i11 + " >= " + i12);
    }

    public static g g(byte[] bArr) {
        return h(bArr, 0, bArr.length);
    }

    public static g h(byte[] bArr, int i10, int i11) {
        e(i10, i10 + i11, bArr.length);
        return new i(f3536c.copyFrom(bArr, i10, i11));
    }

    public static g k(String str) {
        return new i(str.getBytes(x.f3752b));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int w(byte b10) {
        return b10 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
    }

    private String x() {
        if (size() <= 50) {
            return h1.a(this);
        }
        return h1.a(u(0, 47)) + "...";
    }

    static g y(byte[] bArr) {
        return new i(bArr);
    }

    static g z(byte[] bArr, int i10, int i11) {
        return new e(bArr, i10, i11);
    }

    abstract void A(androidx.datastore.preferences.protobuf.f fVar);

    public abstract byte b(int i10);

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int iP = this.f3538a;
        if (iP == 0) {
            int size = size();
            iP = p(size, 0, size);
            if (iP == 0) {
                iP = 1;
            }
            this.f3538a = iP;
        }
        return iP;
    }

    protected abstract void m(byte[] bArr, int i10, int i11, int i12);

    abstract byte n(int i10);

    public InterfaceC0033g o() {
        return new a();
    }

    protected abstract int p(int i10, int i11, int i12);

    protected final int r() {
        return this.f3538a;
    }

    public abstract int size();

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()), x());
    }

    public abstract g u(int i10, int i11);

    public final byte[] v() {
        int size = size();
        if (size == 0) {
            return x.f3754d;
        }
        byte[] bArr = new byte[size];
        m(bArr, 0, 0, size);
        return bArr;
    }
}
