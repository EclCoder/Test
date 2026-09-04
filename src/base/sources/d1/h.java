package d1;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.preferences.protobuf.v;
import fl.g0;
import gl.r;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s;
import z0.d0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class h implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f36102a = new h();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f36103a;

        static {
            int[] iArr = new int[c1.h.b.values().length];
            try {
                iArr[c1.h.b.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c1.h.b.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c1.h.b.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[c1.h.b.INTEGER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[c1.h.b.LONG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[c1.h.b.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[c1.h.b.STRING_SET.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[c1.h.b.BYTES.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[c1.h.b.VALUE_NOT_SET.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f36103a = iArr;
        }
    }

    private h() {
    }

    private final void a(String str, c1.h hVar, c cVar) throws CorruptionException {
        c1.h.b bVarC0 = hVar.c0();
        switch (bVarC0 == null ? -1 : a.f36103a[bVarC0.ordinal()]) {
            case -1:
                throw new CorruptionException("Value case is null.", null, 2, null);
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                cVar.i(i.a(str), Boolean.valueOf(hVar.T()));
                return;
            case 2:
                cVar.i(i.d(str), Float.valueOf(hVar.X()));
                return;
            case 3:
                cVar.i(i.c(str), Double.valueOf(hVar.W()));
                return;
            case 4:
                cVar.i(i.e(str), Integer.valueOf(hVar.Y()));
                return;
            case 5:
                cVar.i(i.f(str), Long.valueOf(hVar.Z()));
                return;
            case 6:
                f.a aVarG = i.g(str);
                String strA0 = hVar.a0();
                s.g(strA0, "value.string");
                cVar.i(aVarG, strA0);
                return;
            case 7:
                f.a aVarH = i.h(str);
                List listP = hVar.b0().P();
                s.g(listP, "value.stringSet.stringsList");
                cVar.i(aVarH, r.N0(listP));
                return;
            case 8:
                f.a aVarB = i.b(str);
                byte[] bArrV = hVar.U().v();
                s.g(bArrV, "value.bytes.toByteArray()");
                cVar.i(aVarB, bArrV);
                return;
            case 9:
                throw new CorruptionException("Value not set.", null, 2, null);
        }
    }

    private final c1.h c(Object obj) {
        if (obj instanceof Boolean) {
            v vVarF = c1.h.d0().o(((Boolean) obj).booleanValue()).f();
            s.g(vVarF, "newBuilder().setBoolean(value).build()");
            return (c1.h) vVarF;
        }
        if (obj instanceof Float) {
            v vVarF2 = c1.h.d0().r(((Number) obj).floatValue()).f();
            s.g(vVarF2, "newBuilder().setFloat(value).build()");
            return (c1.h) vVarF2;
        }
        if (obj instanceof Double) {
            v vVarF3 = c1.h.d0().q(((Number) obj).doubleValue()).f();
            s.g(vVarF3, "newBuilder().setDouble(value).build()");
            return (c1.h) vVarF3;
        }
        if (obj instanceof Integer) {
            v vVarF4 = c1.h.d0().s(((Number) obj).intValue()).f();
            s.g(vVarF4, "newBuilder().setInteger(value).build()");
            return (c1.h) vVarF4;
        }
        if (obj instanceof Long) {
            v vVarF5 = c1.h.d0().t(((Number) obj).longValue()).f();
            s.g(vVarF5, "newBuilder().setLong(value).build()");
            return (c1.h) vVarF5;
        }
        if (obj instanceof String) {
            v vVarF6 = c1.h.d0().u((String) obj).f();
            s.g(vVarF6, "newBuilder().setString(value).build()");
            return (c1.h) vVarF6;
        }
        if (obj instanceof Set) {
            c1.h.a aVarD0 = c1.h.d0();
            c1.g.a aVarQ = c1.g.Q();
            s.f(obj, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
            v vVarF7 = aVarD0.v(aVarQ.o((Set) obj)).f();
            s.g(vVarF7, "newBuilder()\n           …                 .build()");
            return (c1.h) vVarF7;
        }
        if (obj instanceof byte[]) {
            v vVarF8 = c1.h.d0().p(androidx.datastore.preferences.protobuf.g.g((byte[]) obj)).f();
            s.g(vVarF8, "newBuilder().setBytes(By….copyFrom(value)).build()");
            return (c1.h) vVarF8;
        }
        throw new IllegalStateException("PreferencesSerializer does not support type: " + obj.getClass().getName());
    }

    @Override // z0.d0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public f getDefaultValue() {
        return g.a();
    }

    @Override // z0.d0
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object writeTo(f fVar, OutputStream outputStream, kl.f fVar2) {
        Map mapA = fVar.a();
        c1.f.a aVarQ = c1.f.Q();
        for (Map.Entry entry : mapA.entrySet()) {
            aVarQ.o(((f.a) entry.getKey()).a(), c(entry.getValue()));
        }
        ((c1.f) aVarQ.f()).e(outputStream);
        return g0.f38750a;
    }

    @Override // z0.d0
    public Object readFrom(InputStream inputStream, kl.f fVar) throws CorruptionException {
        c1.f fVarA = c1.d.f9257a.a(inputStream);
        c cVarB = g.b(new f.b[0]);
        Map mapN = fVarA.N();
        s.g(mapN, "preferencesProto.preferencesMap");
        for (Map.Entry entry : mapN.entrySet()) {
            String name = (String) entry.getKey();
            c1.h value = (c1.h) entry.getValue();
            h hVar = f36102a;
            s.g(name, "name");
            s.g(value, "value");
            hVar.a(name, value, cVarB);
        }
        return cVarB.d();
    }
}
