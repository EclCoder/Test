package com.squareup.moshi;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
final class m extends i {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Object f35503h = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Object[] f35504g;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class a implements Iterator, Cloneable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final i.b f35505a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Object[] f35506b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f35507c;

        a(i.b bVar, Object[] objArr, int i10) {
            this.f35505a = bVar;
            this.f35506b = objArr;
            this.f35507c = i10;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a clone() {
            return new a(this.f35505a, this.f35506b, this.f35507c);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f35507c < this.f35506b.length;
        }

        @Override // java.util.Iterator
        public Object next() {
            Object[] objArr = this.f35506b;
            int i10 = this.f35507c;
            this.f35507c = i10 + 1;
            return objArr[i10];
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    m(Object obj) {
        int[] iArr = this.f35470b;
        int i10 = this.f35469a;
        iArr[i10] = 7;
        Object[] objArr = new Object[32];
        this.f35504g = objArr;
        this.f35469a = i10 + 1;
        objArr[i10] = obj;
    }

    private void b1(Object obj) {
        int i10 = this.f35469a;
        if (i10 == this.f35504g.length) {
            if (i10 == 256) {
                throw new JsonDataException("Nesting too deep at " + w());
            }
            int[] iArr = this.f35470b;
            this.f35470b = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f35471c;
            this.f35471c = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f35472d;
            this.f35472d = Arrays.copyOf(iArr2, iArr2.length * 2);
            Object[] objArr = this.f35504g;
            this.f35504g = Arrays.copyOf(objArr, objArr.length * 2);
        }
        Object[] objArr2 = this.f35504g;
        int i11 = this.f35469a;
        this.f35469a = i11 + 1;
        objArr2[i11] = obj;
    }

    private void c1() {
        int i10 = this.f35469a;
        int i11 = i10 - 1;
        this.f35469a = i11;
        Object[] objArr = this.f35504g;
        objArr[i11] = null;
        this.f35470b[i11] = 0;
        if (i11 > 0) {
            int[] iArr = this.f35472d;
            int i12 = i10 - 2;
            iArr[i12] = iArr[i12] + 1;
            Object obj = objArr[i10 - 2];
            if (obj instanceof Iterator) {
                Iterator it = (Iterator) obj;
                if (it.hasNext()) {
                    b1(it.next());
                }
            }
        }
    }

    private Object d1(Class cls, i.b bVar) {
        int i10 = this.f35469a;
        Object obj = i10 != 0 ? this.f35504g[i10 - 1] : null;
        if (cls.isInstance(obj)) {
            return cls.cast(obj);
        }
        if (obj == null && bVar == i.b.NULL) {
            return null;
        }
        if (obj == f35503h) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw Z0(obj, bVar);
    }

    private String e1(Map.Entry entry) {
        Object key = entry.getKey();
        if (key instanceof String) {
            return (String) key;
        }
        throw Z0(key, i.b.NAME);
    }

    @Override // com.squareup.moshi.i
    public void F0() {
        if (q()) {
            b1(a1());
        }
    }

    @Override // com.squareup.moshi.i
    public int N0(i.a aVar) {
        Map.Entry entry = (Map.Entry) d1(Map.Entry.class, i.b.NAME);
        String strE1 = e1(entry);
        int length = aVar.f35475a.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (aVar.f35475a[i10].equals(strE1)) {
                this.f35504g[this.f35469a - 1] = entry.getValue();
                this.f35471c[this.f35469a - 2] = strE1;
                return i10;
            }
        }
        return -1;
    }

    @Override // com.squareup.moshi.i
    public int T0(i.a aVar) {
        int i10 = this.f35469a;
        Object obj = i10 != 0 ? this.f35504g[i10 - 1] : null;
        if (!(obj instanceof String)) {
            if (obj != f35503h) {
                return -1;
            }
            throw new IllegalStateException("JsonReader is closed");
        }
        String str = (String) obj;
        int length = aVar.f35475a.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (aVar.f35475a[i11].equals(str)) {
                c1();
                return i11;
            }
        }
        return -1;
    }

    @Override // com.squareup.moshi.i
    public void W0() {
        if (!this.f35474f) {
            this.f35504g[this.f35469a - 1] = ((Map.Entry) d1(Map.Entry.class, i.b.NAME)).getValue();
            this.f35471c[this.f35469a - 2] = "null";
            return;
        }
        i.b bVarP0 = p0();
        a1();
        throw new JsonDataException("Cannot skip unexpected " + bVarP0 + " at " + w());
    }

    @Override // com.squareup.moshi.i
    public void X0() {
        if (this.f35474f) {
            throw new JsonDataException("Cannot skip unexpected " + p0() + " at " + w());
        }
        int i10 = this.f35469a;
        if (i10 > 1) {
            this.f35471c[i10 - 2] = "null";
        }
        Object obj = i10 != 0 ? this.f35504g[i10 - 1] : null;
        if (obj instanceof a) {
            throw new JsonDataException("Expected a value but was " + p0() + " at path " + w());
        }
        if (obj instanceof Map.Entry) {
            Object[] objArr = this.f35504g;
            objArr[i10 - 1] = ((Map.Entry) objArr[i10 - 1]).getValue();
        } else {
            if (i10 > 0) {
                c1();
                return;
            }
            throw new JsonDataException("Expected a value but was " + p0() + " at path " + w());
        }
    }

    public String a1() {
        Map.Entry entry = (Map.Entry) d1(Map.Entry.class, i.b.NAME);
        String strE1 = e1(entry);
        this.f35504g[this.f35469a - 1] = entry.getValue();
        this.f35471c[this.f35469a - 2] = strE1;
        return strE1;
    }

    @Override // com.squareup.moshi.i
    public int c0() {
        int iIntValueExact;
        i.b bVar = i.b.NUMBER;
        Object objD1 = d1(Object.class, bVar);
        if (objD1 instanceof Number) {
            iIntValueExact = ((Number) objD1).intValue();
        } else {
            if (!(objD1 instanceof String)) {
                throw Z0(objD1, bVar);
            }
            try {
                try {
                    iIntValueExact = Integer.parseInt((String) objD1);
                } catch (NumberFormatException unused) {
                    throw Z0(objD1, i.b.NUMBER);
                }
            } catch (NumberFormatException unused2) {
                iIntValueExact = new BigDecimal((String) objD1).intValueExact();
            }
        }
        c1();
        return iIntValueExact;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Arrays.fill(this.f35504g, 0, this.f35469a, (Object) null);
        this.f35504g[0] = f35503h;
        this.f35470b[0] = 8;
        this.f35469a = 1;
    }

    @Override // com.squareup.moshi.i
    public void d() {
        List list = (List) d1(List.class, i.b.BEGIN_ARRAY);
        a aVar = new a(i.b.END_ARRAY, list.toArray(new Object[list.size()]), 0);
        Object[] objArr = this.f35504g;
        int i10 = this.f35469a;
        objArr[i10 - 1] = aVar;
        this.f35470b[i10 - 1] = 1;
        this.f35472d[i10 - 1] = 0;
        if (aVar.hasNext()) {
            b1(aVar.next());
        }
    }

    @Override // com.squareup.moshi.i
    public long d0() {
        long jLongValueExact;
        i.b bVar = i.b.NUMBER;
        Object objD1 = d1(Object.class, bVar);
        if (objD1 instanceof Number) {
            jLongValueExact = ((Number) objD1).longValue();
        } else {
            if (!(objD1 instanceof String)) {
                throw Z0(objD1, bVar);
            }
            try {
                try {
                    jLongValueExact = Long.parseLong((String) objD1);
                } catch (NumberFormatException unused) {
                    throw Z0(objD1, i.b.NUMBER);
                }
            } catch (NumberFormatException unused2) {
                jLongValueExact = new BigDecimal((String) objD1).longValueExact();
            }
        }
        c1();
        return jLongValueExact;
    }

    @Override // com.squareup.moshi.i
    public Object g0() {
        d1(Void.class, i.b.NULL);
        c1();
        return null;
    }

    @Override // com.squareup.moshi.i
    public void h() {
        Map map = (Map) d1(Map.class, i.b.BEGIN_OBJECT);
        a aVar = new a(i.b.END_OBJECT, map.entrySet().toArray(new Object[map.size()]), 0);
        Object[] objArr = this.f35504g;
        int i10 = this.f35469a;
        objArr[i10 - 1] = aVar;
        this.f35470b[i10 - 1] = 3;
        if (aVar.hasNext()) {
            b1(aVar.next());
        }
    }

    @Override // com.squareup.moshi.i
    public String i0() {
        int i10 = this.f35469a;
        Object obj = i10 != 0 ? this.f35504g[i10 - 1] : null;
        if (obj instanceof String) {
            c1();
            return (String) obj;
        }
        if (obj instanceof Number) {
            c1();
            return obj.toString();
        }
        if (obj == f35503h) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw Z0(obj, i.b.STRING);
    }

    @Override // com.squareup.moshi.i
    public void k() {
        i.b bVar = i.b.END_ARRAY;
        a aVar = (a) d1(a.class, bVar);
        if (aVar.f35505a != bVar || aVar.hasNext()) {
            throw Z0(aVar, bVar);
        }
        c1();
    }

    @Override // com.squareup.moshi.i
    public void l() {
        i.b bVar = i.b.END_OBJECT;
        a aVar = (a) d1(a.class, bVar);
        if (aVar.f35505a != bVar || aVar.hasNext()) {
            throw Z0(aVar, bVar);
        }
        this.f35471c[this.f35469a - 1] = null;
        c1();
    }

    @Override // com.squareup.moshi.i
    public i.b p0() {
        int i10 = this.f35469a;
        if (i10 == 0) {
            return i.b.END_DOCUMENT;
        }
        Object obj = this.f35504g[i10 - 1];
        if (obj instanceof a) {
            return ((a) obj).f35505a;
        }
        if (obj instanceof List) {
            return i.b.BEGIN_ARRAY;
        }
        if (obj instanceof Map) {
            return i.b.BEGIN_OBJECT;
        }
        if (obj instanceof Map.Entry) {
            return i.b.NAME;
        }
        if (obj instanceof String) {
            return i.b.STRING;
        }
        if (obj instanceof Boolean) {
            return i.b.BOOLEAN;
        }
        if (obj instanceof Number) {
            return i.b.NUMBER;
        }
        if (obj == null) {
            return i.b.NULL;
        }
        if (obj == f35503h) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw Z0(obj, "a JSON value");
    }

    @Override // com.squareup.moshi.i
    public boolean q() {
        int i10 = this.f35469a;
        if (i10 == 0) {
            return false;
        }
        Object obj = this.f35504g[i10 - 1];
        return !(obj instanceof Iterator) || ((Iterator) obj).hasNext();
    }

    @Override // com.squareup.moshi.i
    public boolean s() {
        Boolean bool = (Boolean) d1(Boolean.class, i.b.BOOLEAN);
        c1();
        return bool.booleanValue();
    }

    @Override // com.squareup.moshi.i
    public double t() throws JsonEncodingException {
        double dDoubleValue;
        i.b bVar = i.b.NUMBER;
        Object objD1 = d1(Object.class, bVar);
        if (objD1 instanceof Number) {
            dDoubleValue = ((Number) objD1).doubleValue();
        } else {
            if (!(objD1 instanceof String)) {
                throw Z0(objD1, bVar);
            }
            try {
                dDoubleValue = Double.parseDouble((String) objD1);
            } catch (NumberFormatException unused) {
                throw Z0(objD1, i.b.NUMBER);
            }
        }
        if (this.f35473e || !(Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue))) {
            c1();
            return dDoubleValue;
        }
        throw new JsonEncodingException("JSON forbids NaN and infinities: " + dDoubleValue + " at path " + w());
    }
}
