package com.google.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class g1 extends c implements RandomAccess {
    private static final g1 EMPTY_LIST = new g1(new Object[0], 0, false);
    private Object[] array;
    private int size;

    g1() {
        this(new Object[10], 0, true);
    }

    private static <E> E[] createArray(int i10) {
        return (E[]) new Object[i10];
    }

    public static <E> g1 emptyList() {
        return EMPTY_LIST;
    }

    private void ensureIndexInRange(int i10) {
        if (i10 < 0 || i10 >= this.size) {
            throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(i10));
        }
    }

    private String makeOutOfBoundsExceptionMessage(int i10) {
        return "Index:" + i10 + ", Size:" + this.size;
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        ensureIsMutable();
        int i10 = this.size;
        Object[] objArr = this.array;
        if (i10 == objArr.length) {
            this.array = Arrays.copyOf(objArr, ((i10 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.array;
        int i11 = this.size;
        this.size = i11 + 1;
        objArr2[i11] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i10) {
        ensureIndexInRange(i10);
        return this.array[i10];
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.List
    public Object remove(int i10) {
        ensureIsMutable();
        ensureIndexInRange(i10);
        Object[] objArr = this.array;
        Object obj = objArr[i10];
        int i11 = this.size;
        if (i10 < i11 - 1) {
            System.arraycopy(objArr, i10 + 1, objArr, i10, (i11 - i10) - 1);
        }
        this.size--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.List
    public Object set(int i10, Object obj) {
        ensureIsMutable();
        ensureIndexInRange(i10);
        Object[] objArr = this.array;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.size;
    }

    private g1(Object[] objArr, int i10, boolean z10) {
        super(z10);
        this.array = objArr;
        this.size = i10;
    }

    @Override // com.google.protobuf.c, com.google.protobuf.a0.i
    public g1 mutableCopyWithCapacity(int i10) {
        if (i10 >= this.size) {
            return new g1(Arrays.copyOf(this.array, i10), this.size, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.List
    public void add(int i10, Object obj) {
        int i11;
        ensureIsMutable();
        if (i10 >= 0 && i10 <= (i11 = this.size)) {
            Object[] objArr = this.array;
            if (i11 < objArr.length) {
                System.arraycopy(objArr, i10, objArr, i10 + 1, i11 - i10);
            } else {
                Object[] objArrCreateArray = createArray(((i11 * 3) / 2) + 1);
                System.arraycopy(this.array, 0, objArrCreateArray, 0, i10);
                System.arraycopy(this.array, i10, objArrCreateArray, i10 + 1, this.size - i10);
                this.array = objArrCreateArray;
            }
            this.array[i10] = obj;
            this.size++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(i10));
    }
}
