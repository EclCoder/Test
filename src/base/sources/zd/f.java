package zd;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.encoders.EncodingException;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class f implements wd.d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Charset f58802f = Charset.forName(C.UTF8_NAME);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final wd.b f58803g = wd.b.a("key").b(zd.a.b().c(1).a()).a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final wd.b f58804h = wd.b.a(AppMeasurementSdk.ConditionalUserProperty.VALUE).b(zd.a.b().c(2).a()).a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final wd.c f58805i = new wd.c() { // from class: zd.e
        @Override // wd.c
        public final void a(Object obj, Object obj2) {
            f.e((Map.Entry) obj, (wd.d) obj2);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private OutputStream f58806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f58807b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f58808c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final wd.c f58809d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final i f58810e = new i(this);

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f58811a;

        static {
            int[] iArr = new int[d.a.values().length];
            f58811a = iArr;
            try {
                iArr[d.a.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f58811a[d.a.SIGNED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f58811a[d.a.FIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    f(OutputStream outputStream, Map map, Map map2, wd.c cVar) {
        this.f58806a = outputStream;
        this.f58807b = map;
        this.f58808c = map2;
        this.f58809d = cVar;
    }

    public static /* synthetic */ void e(Map.Entry entry, wd.d dVar) {
        dVar.g(f58803g, entry.getKey());
        dVar.g(f58804h, entry.getValue());
    }

    private static ByteBuffer p(int i10) {
        return ByteBuffer.allocate(i10).order(ByteOrder.LITTLE_ENDIAN);
    }

    private long q(wd.c cVar, Object obj) throws IOException {
        b bVar = new b();
        try {
            OutputStream outputStream = this.f58806a;
            this.f58806a = bVar;
            try {
                cVar.a(obj, this);
                this.f58806a = outputStream;
                long jD = bVar.d();
                bVar.close();
                return jD;
            } catch (Throwable th2) {
                this.f58806a = outputStream;
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                bVar.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    private f r(wd.c cVar, wd.b bVar, Object obj, boolean z10) throws IOException {
        long jQ = q(cVar, obj);
        if (z10 && jQ == 0) {
            return this;
        }
        w((v(bVar) << 3) | 2);
        x(jQ);
        cVar.a(obj, this);
        return this;
    }

    private f s(wd.e eVar, wd.b bVar, Object obj, boolean z10) {
        this.f58810e.b(bVar, z10);
        eVar.a(obj, this.f58810e);
        return this;
    }

    private static d u(wd.b bVar) {
        d dVar = (d) bVar.c(d.class);
        if (dVar != null) {
            return dVar;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    private static int v(wd.b bVar) {
        d dVar = (d) bVar.c(d.class);
        if (dVar != null) {
            return dVar.tag();
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    private void w(int i10) throws IOException {
        while ((i10 & (-128)) != 0) {
            this.f58806a.write((i10 & Sdk$SDKError.b.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE) | 128);
            i10 >>>= 7;
        }
        this.f58806a.write(i10 & Sdk$SDKError.b.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE);
    }

    private void x(long j10) throws IOException {
        while (((-128) & j10) != 0) {
            this.f58806a.write((((int) j10) & Sdk$SDKError.b.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE) | 128);
            j10 >>>= 7;
        }
        this.f58806a.write(((int) j10) & Sdk$SDKError.b.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE);
    }

    @Override // wd.d
    public wd.d d(wd.b bVar, double d10) {
        return f(bVar, d10, true);
    }

    wd.d f(wd.b bVar, double d10, boolean z10) throws IOException {
        if (z10 && d10 == 0.0d) {
            return this;
        }
        w((v(bVar) << 3) | 1);
        this.f58806a.write(p(8).putDouble(d10).array());
        return this;
    }

    @Override // wd.d
    public wd.d g(wd.b bVar, Object obj) {
        return i(bVar, obj, true);
    }

    wd.d h(wd.b bVar, float f10, boolean z10) throws IOException {
        if (z10 && f10 == 0.0f) {
            return this;
        }
        w((v(bVar) << 3) | 5);
        this.f58806a.write(p(4).putFloat(f10).array());
        return this;
    }

    wd.d i(wd.b bVar, Object obj, boolean z10) throws IOException {
        if (obj != null) {
            if (obj instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) obj;
                if (!z10 || charSequence.length() != 0) {
                    w((v(bVar) << 3) | 2);
                    byte[] bytes = charSequence.toString().getBytes(f58802f);
                    w(bytes.length);
                    this.f58806a.write(bytes);
                    return this;
                }
            } else if (obj instanceof Collection) {
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    i(bVar, it.next(), false);
                }
            } else if (obj instanceof Map) {
                Iterator it2 = ((Map) obj).entrySet().iterator();
                while (it2.hasNext()) {
                    r(f58805i, bVar, (Map.Entry) it2.next(), false);
                }
            } else {
                if (obj instanceof Double) {
                    return f(bVar, ((Double) obj).doubleValue(), z10);
                }
                if (obj instanceof Float) {
                    return h(bVar, ((Float) obj).floatValue(), z10);
                }
                if (obj instanceof Number) {
                    return m(bVar, ((Number) obj).longValue(), z10);
                }
                if (obj instanceof Boolean) {
                    return o(bVar, ((Boolean) obj).booleanValue(), z10);
                }
                if (!(obj instanceof byte[])) {
                    wd.c cVar = (wd.c) this.f58807b.get(obj.getClass());
                    if (cVar != null) {
                        return r(cVar, bVar, obj, z10);
                    }
                    wd.e eVar = (wd.e) this.f58808c.get(obj.getClass());
                    if (eVar != null) {
                        return s(eVar, bVar, obj, z10);
                    }
                    if (obj instanceof c) {
                        return c(bVar, ((c) obj).getNumber());
                    }
                    return obj instanceof Enum ? c(bVar, ((Enum) obj).ordinal()) : r(this.f58809d, bVar, obj, z10);
                }
                byte[] bArr = (byte[]) obj;
                if (!z10 || bArr.length != 0) {
                    w((v(bVar) << 3) | 2);
                    w(bArr.length);
                    this.f58806a.write(bArr);
                    return this;
                }
            }
        }
        return this;
    }

    @Override // wd.d
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public f c(wd.b bVar, int i10) {
        return k(bVar, i10, true);
    }

    f k(wd.b bVar, int i10, boolean z10) throws IOException {
        if (!z10 || i10 != 0) {
            d dVarU = u(bVar);
            int i11 = a.f58811a[dVarU.intEncoding().ordinal()];
            if (i11 == 1) {
                w(dVarU.tag() << 3);
                w(i10);
                return this;
            }
            if (i11 == 2) {
                w(dVarU.tag() << 3);
                w((i10 << 1) ^ (i10 >> 31));
                return this;
            }
            if (i11 == 3) {
                w((dVarU.tag() << 3) | 5);
                this.f58806a.write(p(4).putInt(i10).array());
                return this;
            }
        }
        return this;
    }

    @Override // wd.d
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public f b(wd.b bVar, long j10) {
        return m(bVar, j10, true);
    }

    f m(wd.b bVar, long j10, boolean z10) throws IOException {
        if (!z10 || j10 != 0) {
            d dVarU = u(bVar);
            int i10 = a.f58811a[dVarU.intEncoding().ordinal()];
            if (i10 == 1) {
                w(dVarU.tag() << 3);
                x(j10);
                return this;
            }
            if (i10 == 2) {
                w(dVarU.tag() << 3);
                x((j10 >> 63) ^ (j10 << 1));
                return this;
            }
            if (i10 == 3) {
                w((dVarU.tag() << 3) | 1);
                this.f58806a.write(p(8).putLong(j10).array());
                return this;
            }
        }
        return this;
    }

    @Override // wd.d
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public f a(wd.b bVar, boolean z10) {
        return o(bVar, z10, true);
    }

    f o(wd.b bVar, boolean z10, boolean z11) {
        return k(bVar, z10 ? 1 : 0, z11);
    }

    f t(Object obj) {
        if (obj == null) {
            return this;
        }
        wd.c cVar = (wd.c) this.f58807b.get(obj.getClass());
        if (cVar != null) {
            cVar.a(obj, this);
            return this;
        }
        throw new EncodingException("No encoder for " + obj.getClass());
    }
}
