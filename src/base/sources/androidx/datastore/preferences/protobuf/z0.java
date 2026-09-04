package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class z0 extends c implements RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final z0 f3780d = new z0(new Object[0], 0, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object[] f3781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f3782c;

    private z0(Object[] objArr, int i10, boolean z10) {
        super(z10);
        this.f3781b = objArr;
        this.f3782c = i10;
    }

    private static Object[] b(int i10) {
        return new Object[i10];
    }

    public static z0 d() {
        return f3780d;
    }

    private void e(int i10) {
        if (i10 < 0 || i10 >= this.f3782c) {
            throw new IndexOutOfBoundsException(f(i10));
        }
    }

    private String f(int i10) {
        return "Index:" + i10 + ", Size:" + this.f3782c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        a();
        int i10 = this.f3782c;
        Object[] objArr = this.f3781b;
        if (i10 == objArr.length) {
            this.f3781b = Arrays.copyOf(objArr, ((i10 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f3781b;
        int i11 = this.f3782c;
        this.f3782c = i11 + 1;
        objArr2[i11] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.x.b
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public z0 mutableCopyWithCapacity(int i10) {
        if (i10 >= this.f3782c) {
            return new z0(Arrays.copyOf(this.f3781b, i10), this.f3782c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i10) {
        e(i10);
        return this.f3781b[i10];
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.List
    public Object remove(int i10) {
        a();
        e(i10);
        Object[] objArr = this.f3781b;
        Object obj = objArr[i10];
        int i11 = this.f3782c;
        if (i10 < i11 - 1) {
            System.arraycopy(objArr, i10 + 1, objArr, i10, (i11 - i10) - 1);
        }
        this.f3782c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i10, Object obj) {
        a();
        e(i10);
        Object[] objArr = this.f3781b;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f3782c;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, Object obj) {
        int i11;
        a();
        if (i10 >= 0 && i10 <= (i11 = this.f3782c)) {
            Object[] objArr = this.f3781b;
            if (i11 < objArr.length) {
                System.arraycopy(objArr, i10, objArr, i10 + 1, i11 - i10);
            } else {
                Object[] objArrB = b(((i11 * 3) / 2) + 1);
                System.arraycopy(this.f3781b, 0, objArrB, 0, i10);
                System.arraycopy(this.f3781b, i10, objArrB, i10 + 1, this.f3782c - i10);
                this.f3781b = objArrB;
            }
            this.f3781b[i10] = obj;
            this.f3782c++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(f(i10));
    }
}
