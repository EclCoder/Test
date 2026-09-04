package androidx.media3.extractor.flv;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o2.m;
import w1.u;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class c extends TagPayloadReader {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f6267b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long[] f6268c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long[] f6269d;

    public c() {
        super(new m());
        this.f6267b = C.TIME_UNSET;
        this.f6268c = new long[0];
        this.f6269d = new long[0];
    }

    private static Boolean g(u uVar) {
        return Boolean.valueOf(uVar.G() == 1);
    }

    private static Object h(u uVar, int i10) {
        if (i10 == 0) {
            return j(uVar);
        }
        if (i10 == 1) {
            return g(uVar);
        }
        if (i10 == 2) {
            return n(uVar);
        }
        if (i10 == 3) {
            return l(uVar);
        }
        if (i10 == 8) {
            return k(uVar);
        }
        if (i10 == 10) {
            return m(uVar);
        }
        if (i10 != 11) {
            return null;
        }
        return i(uVar);
    }

    private static Date i(u uVar) {
        Date date = new Date((long) j(uVar).doubleValue());
        uVar.U(2);
        return date;
    }

    private static Double j(u uVar) {
        return Double.valueOf(Double.longBitsToDouble(uVar.z()));
    }

    private static HashMap k(u uVar) {
        int iK = uVar.K();
        HashMap map = new HashMap(iK);
        for (int i10 = 0; i10 < iK; i10++) {
            String strN = n(uVar);
            Object objH = h(uVar, o(uVar));
            if (objH != null) {
                map.put(strN, objH);
            }
        }
        return map;
    }

    private static HashMap l(u uVar) {
        HashMap map = new HashMap();
        while (true) {
            String strN = n(uVar);
            int iO = o(uVar);
            if (iO == 9) {
                return map;
            }
            Object objH = h(uVar, iO);
            if (objH != null) {
                map.put(strN, objH);
            }
        }
    }

    private static ArrayList m(u uVar) {
        int iK = uVar.K();
        ArrayList arrayList = new ArrayList(iK);
        for (int i10 = 0; i10 < iK; i10++) {
            Object objH = h(uVar, o(uVar));
            if (objH != null) {
                arrayList.add(objH);
            }
        }
        return arrayList;
    }

    private static String n(u uVar) {
        int iM = uVar.M();
        int iF = uVar.f();
        uVar.U(iM);
        return new String(uVar.e(), iF, iM);
    }

    private static int o(u uVar) {
        return uVar.G();
    }

    @Override // androidx.media3.extractor.flv.TagPayloadReader
    protected boolean b(u uVar) {
        return true;
    }

    @Override // androidx.media3.extractor.flv.TagPayloadReader
    protected boolean c(u uVar, long j10) {
        if (o(uVar) != 2 || !"onMetaData".equals(n(uVar)) || uVar.a() == 0 || o(uVar) != 8) {
            return false;
        }
        HashMap mapK = k(uVar);
        Object obj = mapK.get("duration");
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            if (dDoubleValue > 0.0d) {
                this.f6267b = (long) (dDoubleValue * 1000000.0d);
            }
        }
        Object obj2 = mapK.get("keyframes");
        if (obj2 instanceof Map) {
            Map map = (Map) obj2;
            Object obj3 = map.get("filepositions");
            Object obj4 = map.get("times");
            if ((obj3 instanceof List) && (obj4 instanceof List)) {
                List list = (List) obj3;
                List list2 = (List) obj4;
                int size = list2.size();
                this.f6268c = new long[size];
                this.f6269d = new long[size];
                for (int i10 = 0; i10 < size; i10++) {
                    Object obj5 = list.get(i10);
                    Object obj6 = list2.get(i10);
                    if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                        this.f6268c = new long[0];
                        this.f6269d = new long[0];
                        break;
                    }
                    this.f6268c[i10] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                    this.f6269d[i10] = ((Double) obj5).longValue();
                }
            }
        }
        return false;
    }

    public long d() {
        return this.f6267b;
    }

    public long[] e() {
        return this.f6269d;
    }

    public long[] f() {
        return this.f6268c;
    }
}
