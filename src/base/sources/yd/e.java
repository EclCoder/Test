package yd;

import android.util.Base64;
import android.util.JsonWriter;
import com.google.firebase.encoders.EncodingException;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class e implements wd.d, wd.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private e f57496a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f57497b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final JsonWriter f57498c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f57499d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f57500e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final wd.c f57501f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f57502g;

    e(Writer writer, Map map, Map map2, wd.c cVar, boolean z10) {
        this.f57498c = new JsonWriter(writer);
        this.f57499d = map;
        this.f57500e = map2;
        this.f57501f = cVar;
        this.f57502g = z10;
    }

    private boolean t(Object obj) {
        return obj == null || obj.getClass().isArray() || (obj instanceof Collection) || (obj instanceof Date) || (obj instanceof Enum) || (obj instanceof Number);
    }

    private e w(String str, Object obj) throws IOException {
        y();
        this.f57498c.name(str);
        if (obj != null) {
            return k(obj, false);
        }
        this.f57498c.nullValue();
        return this;
    }

    private e x(String str, Object obj) throws IOException {
        if (obj == null) {
            return this;
        }
        y();
        this.f57498c.name(str);
        return k(obj, false);
    }

    private void y() throws IOException {
        if (!this.f57497b) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
        e eVar = this.f57496a;
        if (eVar != null) {
            eVar.y();
            this.f57496a.f57497b = false;
            this.f57496a = null;
            this.f57498c.endObject();
        }
    }

    @Override // wd.d
    public wd.d a(wd.b bVar, boolean z10) {
        return q(bVar.b(), z10);
    }

    @Override // wd.d
    public wd.d b(wd.b bVar, long j10) {
        return o(bVar.b(), j10);
    }

    @Override // wd.d
    public wd.d c(wd.b bVar, int i10) {
        return n(bVar.b(), i10);
    }

    @Override // wd.d
    public wd.d d(wd.b bVar, double d10) {
        return m(bVar.b(), d10);
    }

    @Override // wd.d
    public wd.d g(wd.b bVar, Object obj) {
        return p(bVar.b(), obj);
    }

    public e h(double d10) throws IOException {
        y();
        this.f57498c.value(d10);
        return this;
    }

    public e i(int i10) throws IOException {
        y();
        this.f57498c.value(i10);
        return this;
    }

    public e j(long j10) throws IOException {
        y();
        this.f57498c.value(j10);
        return this;
    }

    e k(Object obj, boolean z10) {
        if (z10 && t(obj)) {
            throw new EncodingException(String.format("%s cannot be encoded inline", obj == null ? null : obj.getClass()));
        }
        if (obj == null) {
            this.f57498c.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            this.f57498c.value((Number) obj);
            return this;
        }
        int i10 = 0;
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                this.f57498c.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    k(it.next(), false);
                }
                this.f57498c.endArray();
                return this;
            }
            if (obj instanceof Map) {
                this.f57498c.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        p((String) key, entry.getValue());
                    } catch (ClassCastException e10) {
                        throw new EncodingException(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e10);
                    }
                }
                this.f57498c.endObject();
                return this;
            }
            wd.c cVar = (wd.c) this.f57499d.get(obj.getClass());
            if (cVar != null) {
                return v(cVar, obj, z10);
            }
            wd.e eVar = (wd.e) this.f57500e.get(obj.getClass());
            if (eVar != null) {
                eVar.a(obj, this);
                return this;
            }
            if (!(obj instanceof Enum)) {
                return v(this.f57501f, obj, z10);
            }
            if (obj instanceof f) {
                i(((f) obj).getNumber());
                return this;
            }
            e(((Enum) obj).name());
            return this;
        }
        if (obj instanceof byte[]) {
            return s((byte[]) obj);
        }
        this.f57498c.beginArray();
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            int length = iArr.length;
            while (i10 < length) {
                this.f57498c.value(iArr[i10]);
                i10++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i10 < length2) {
                j(jArr[i10]);
                i10++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i10 < length3) {
                this.f57498c.value(dArr[i10]);
                i10++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i10 < length4) {
                this.f57498c.value(zArr[i10]);
                i10++;
            }
        } else if (obj instanceof Number[]) {
            for (Number number : (Number[]) obj) {
                k(number, false);
            }
        } else {
            for (Object obj2 : (Object[]) obj) {
                k(obj2, false);
            }
        }
        this.f57498c.endArray();
        return this;
    }

    @Override // wd.f
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public e e(String str) throws IOException {
        y();
        this.f57498c.value(str);
        return this;
    }

    public e m(String str, double d10) throws IOException {
        y();
        this.f57498c.name(str);
        return h(d10);
    }

    public e n(String str, int i10) throws IOException {
        y();
        this.f57498c.name(str);
        return i(i10);
    }

    public e o(String str, long j10) throws IOException {
        y();
        this.f57498c.name(str);
        return j(j10);
    }

    public e p(String str, Object obj) {
        return this.f57502g ? x(str, obj) : w(str, obj);
    }

    public e q(String str, boolean z10) throws IOException {
        y();
        this.f57498c.name(str);
        return f(z10);
    }

    @Override // wd.f
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public e f(boolean z10) throws IOException {
        y();
        this.f57498c.value(z10);
        return this;
    }

    public e s(byte[] bArr) throws IOException {
        y();
        if (bArr == null) {
            this.f57498c.nullValue();
            return this;
        }
        this.f57498c.value(Base64.encodeToString(bArr, 2));
        return this;
    }

    void u() {
        y();
        this.f57498c.flush();
    }

    e v(wd.c cVar, Object obj, boolean z10) throws IOException {
        if (!z10) {
            this.f57498c.beginObject();
        }
        cVar.a(obj, this);
        if (!z10) {
            this.f57498c.endObject();
        }
        return this;
    }
}
