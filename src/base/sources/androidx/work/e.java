package androidx.work;

import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f7832b = l.f("Data");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f7833c = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Map f7834a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Map f7835a = new HashMap();

        public e a() throws Throwable {
            e eVar = new e(this.f7835a);
            e.k(eVar);
            return eVar;
        }

        public a b(String str, Object obj) {
            if (obj == null) {
                this.f7835a.put(str, null);
                return this;
            }
            Class<?> cls = obj.getClass();
            if (cls == Boolean.class || cls == Byte.class || cls == Integer.class || cls == Long.class || cls == Float.class || cls == Double.class || cls == String.class || cls == Boolean[].class || cls == Byte[].class || cls == Integer[].class || cls == Long[].class || cls == Float[].class || cls == Double[].class || cls == String[].class) {
                this.f7835a.put(str, obj);
                return this;
            }
            if (cls == boolean[].class) {
                this.f7835a.put(str, e.a((boolean[]) obj));
                return this;
            }
            if (cls == byte[].class) {
                this.f7835a.put(str, e.b((byte[]) obj));
                return this;
            }
            if (cls == int[].class) {
                this.f7835a.put(str, e.e((int[]) obj));
                return this;
            }
            if (cls == long[].class) {
                this.f7835a.put(str, e.f((long[]) obj));
                return this;
            }
            if (cls == float[].class) {
                this.f7835a.put(str, e.d((float[]) obj));
                return this;
            }
            if (cls != double[].class) {
                throw new IllegalArgumentException(String.format("Key %s has invalid type %s", str, cls));
            }
            this.f7835a.put(str, e.c((double[]) obj));
            return this;
        }

        public a c(e eVar) {
            d(eVar.f7834a);
            return this;
        }

        public a d(Map map) {
            for (Map.Entry entry : map.entrySet()) {
                b((String) entry.getKey(), entry.getValue());
            }
            return this;
        }

        public a e(String str, String str2) {
            this.f7835a.put(str, str2);
            return this;
        }
    }

    public e(e eVar) {
        this.f7834a = new HashMap(eVar.f7834a);
    }

    public static Boolean[] a(boolean[] zArr) {
        Boolean[] boolArr = new Boolean[zArr.length];
        for (int i10 = 0; i10 < zArr.length; i10++) {
            boolArr[i10] = Boolean.valueOf(zArr[i10]);
        }
        return boolArr;
    }

    public static Byte[] b(byte[] bArr) {
        Byte[] bArr2 = new Byte[bArr.length];
        for (int i10 = 0; i10 < bArr.length; i10++) {
            bArr2[i10] = Byte.valueOf(bArr[i10]);
        }
        return bArr2;
    }

    public static Double[] c(double[] dArr) {
        Double[] dArr2 = new Double[dArr.length];
        for (int i10 = 0; i10 < dArr.length; i10++) {
            dArr2[i10] = Double.valueOf(dArr[i10]);
        }
        return dArr2;
    }

    public static Float[] d(float[] fArr) {
        Float[] fArr2 = new Float[fArr.length];
        for (int i10 = 0; i10 < fArr.length; i10++) {
            fArr2[i10] = Float.valueOf(fArr[i10]);
        }
        return fArr2;
    }

    public static Integer[] e(int[] iArr) {
        Integer[] numArr = new Integer[iArr.length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            numArr[i10] = Integer.valueOf(iArr[i10]);
        }
        return numArr;
    }

    public static Long[] f(long[] jArr) {
        Long[] lArr = new Long[jArr.length];
        for (int i10 = 0; i10 < jArr.length; i10++) {
            lArr[i10] = Long.valueOf(jArr[i10]);
        }
        return lArr;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0061 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x0031 A[EXC_TOP_SPLITTER, PHI: r3
      0x0031: PHI (r3v8 java.io.ObjectInputStream) = (r3v7 java.io.ObjectInputStream), (r3v10 java.io.ObjectInputStream) binds: [B:31:0x0056, B:7:0x001b] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    public static e g(byte[] bArr) throws Throwable {
        Throwable th2;
        ObjectInputStream objectInputStream;
        Throwable e10;
        if (bArr.length > 10240) {
            throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
        }
        HashMap map = new HashMap();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        ObjectInputStream objectInputStream2 = null;
        try {
            try {
                try {
                    try {
                        objectInputStream = new ObjectInputStream(byteArrayInputStream);
                        try {
                            for (int i10 = objectInputStream.readInt(); i10 > 0; i10--) {
                                map.put(objectInputStream.readUTF(), objectInputStream.readObject());
                            }
                        } catch (IOException e11) {
                            e10 = e11;
                            Log.e(f7832b, "Error in Data#fromByteArray: ", e10);
                            if (objectInputStream != null) {
                            }
                            byteArrayInputStream.close();
                            return new e(map);
                        } catch (ClassNotFoundException e12) {
                            e10 = e12;
                            Log.e(f7832b, "Error in Data#fromByteArray: ", e10);
                            if (objectInputStream != null) {
                            }
                            byteArrayInputStream.close();
                            return new e(map);
                        }
                    } catch (Throwable th3) {
                        th2 = th3;
                        if (0 != 0) {
                            try {
                                objectInputStream2.close();
                            } catch (IOException e13) {
                                Log.e(f7832b, "Error in Data#fromByteArray: ", e13);
                            }
                        }
                        try {
                            byteArrayInputStream.close();
                            throw th2;
                        } catch (IOException e14) {
                            Log.e(f7832b, "Error in Data#fromByteArray: ", e14);
                            throw th2;
                        }
                    }
                } catch (IOException e15) {
                    e = e15;
                    Throwable th4 = e;
                    objectInputStream = null;
                    e10 = th4;
                    Log.e(f7832b, "Error in Data#fromByteArray: ", e10);
                    if (objectInputStream != null) {
                        objectInputStream.close();
                    }
                    byteArrayInputStream.close();
                    return new e(map);
                } catch (ClassNotFoundException e16) {
                    e = e16;
                    Throwable th5 = e;
                    objectInputStream = null;
                    e10 = th5;
                    Log.e(f7832b, "Error in Data#fromByteArray: ", e10);
                    if (objectInputStream != null) {
                        objectInputStream.close();
                    }
                    byteArrayInputStream.close();
                    return new e(map);
                } catch (Throwable th6) {
                    th2 = th6;
                    if (0 != 0) {
                        objectInputStream2.close();
                    }
                    byteArrayInputStream.close();
                    throw th2;
                }
                byteArrayInputStream.close();
            } catch (IOException e17) {
                Log.e(f7832b, "Error in Data#fromByteArray: ", e17);
            }
            objectInputStream.close();
        } catch (IOException e18) {
            Log.e(f7832b, "Error in Data#fromByteArray: ", e18);
        }
        return new e(map);
    }

    public static byte[] k(e eVar) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = null;
        try {
            try {
                ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(byteArrayOutputStream);
                try {
                    objectOutputStream2.writeInt(eVar.j());
                    for (Map.Entry entry : eVar.f7834a.entrySet()) {
                        objectOutputStream2.writeUTF((String) entry.getKey());
                        objectOutputStream2.writeObject(entry.getValue());
                    }
                    try {
                        objectOutputStream2.close();
                    } catch (IOException e10) {
                        Log.e(f7832b, "Error in Data#toByteArray: ", e10);
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e11) {
                        Log.e(f7832b, "Error in Data#toByteArray: ", e11);
                    }
                    if (byteArrayOutputStream.size() <= 10240) {
                        return byteArrayOutputStream.toByteArray();
                    }
                    throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
                } catch (IOException e12) {
                    e = e12;
                    objectOutputStream = objectOutputStream2;
                    Log.e(f7832b, "Error in Data#toByteArray: ", e);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    if (objectOutputStream != null) {
                        try {
                            objectOutputStream.close();
                        } catch (IOException e13) {
                            Log.e(f7832b, "Error in Data#toByteArray: ", e13);
                        }
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e14) {
                        Log.e(f7832b, "Error in Data#toByteArray: ", e14);
                    }
                    return byteArray;
                } catch (Throwable th2) {
                    th = th2;
                    objectOutputStream = objectOutputStream2;
                    if (objectOutputStream != null) {
                        try {
                            objectOutputStream.close();
                        } catch (IOException e15) {
                            Log.e(f7832b, "Error in Data#toByteArray: ", e15);
                        }
                    }
                    try {
                        byteArrayOutputStream.close();
                        throw th;
                    } catch (IOException e16) {
                        Log.e(f7832b, "Error in Data#toByteArray: ", e16);
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException e17) {
            e = e17;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        Set<String> setKeySet = this.f7834a.keySet();
        if (!setKeySet.equals(eVar.f7834a.keySet())) {
            return false;
        }
        for (String str : setKeySet) {
            Object obj2 = this.f7834a.get(str);
            Object obj3 = eVar.f7834a.get(str);
            if (!((obj2 == null || obj3 == null) ? obj2 == obj3 : ((obj2 instanceof Object[]) && (obj3 instanceof Object[])) ? Arrays.deepEquals((Object[]) obj2, (Object[]) obj3) : obj2.equals(obj3))) {
                return false;
            }
        }
        return true;
    }

    public Map h() {
        return Collections.unmodifiableMap(this.f7834a);
    }

    public int hashCode() {
        return this.f7834a.hashCode() * 31;
    }

    public String i(String str) {
        Object obj = this.f7834a.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public int j() {
        return this.f7834a.size();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Data {");
        if (!this.f7834a.isEmpty()) {
            for (String str : this.f7834a.keySet()) {
                sb2.append(str);
                sb2.append(" : ");
                Object obj = this.f7834a.get(str);
                if (obj instanceof Object[]) {
                    sb2.append(Arrays.toString((Object[]) obj));
                } else {
                    sb2.append(obj);
                }
                sb2.append(", ");
            }
        }
        sb2.append("}");
        return sb2.toString();
    }

    public e(Map map) {
        this.f7834a = new HashMap(map);
    }
}
