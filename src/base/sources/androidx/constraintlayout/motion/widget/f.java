package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.core.app.NotificationCompat;
import com.bytedance.adsdk.ugeno.ojm.hnj.mzIi.obFGmWgqyy;
import com.mbridge.msdk.dycreator.binding.vREM.mTFeqtajA;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import ud.qoRq.WwUgngZLNA;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class f extends d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f2167g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f2168h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f2169i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f2170j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f2171k = Float.NaN;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f2172l = 0.0f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f2173m = 0.0f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f2174n = Float.NaN;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f2175o = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private float f2176p = Float.NaN;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private float f2177q = Float.NaN;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f2178r = Float.NaN;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private float f2179s = Float.NaN;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private float f2180t = Float.NaN;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private float f2181u = Float.NaN;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private float f2182v = Float.NaN;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private float f2183w = Float.NaN;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private float f2184x = Float.NaN;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private float f2185y = Float.NaN;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private float f2186z = Float.NaN;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static SparseIntArray f2187a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f2187a = sparseIntArray;
            sparseIntArray.append(androidx.constraintlayout.widget.f.f3045t6, 1);
            f2187a.append(androidx.constraintlayout.widget.f.f3019r6, 2);
            f2187a.append(androidx.constraintlayout.widget.f.f3058u6, 3);
            f2187a.append(androidx.constraintlayout.widget.f.f3006q6, 4);
            f2187a.append(androidx.constraintlayout.widget.f.f3123z6, 5);
            f2187a.append(androidx.constraintlayout.widget.f.f3097x6, 6);
            f2187a.append(androidx.constraintlayout.widget.f.f3084w6, 7);
            f2187a.append(androidx.constraintlayout.widget.f.A6, 8);
            f2187a.append(androidx.constraintlayout.widget.f.f2876g6, 9);
            f2187a.append(androidx.constraintlayout.widget.f.f2993p6, 10);
            f2187a.append(androidx.constraintlayout.widget.f.f2941l6, 11);
            f2187a.append(androidx.constraintlayout.widget.f.f2954m6, 12);
            f2187a.append(androidx.constraintlayout.widget.f.f2967n6, 13);
            f2187a.append(androidx.constraintlayout.widget.f.f3071v6, 14);
            f2187a.append(androidx.constraintlayout.widget.f.f2915j6, 15);
            f2187a.append(androidx.constraintlayout.widget.f.f2928k6, 16);
            f2187a.append(androidx.constraintlayout.widget.f.f2889h6, 17);
            f2187a.append(androidx.constraintlayout.widget.f.f2902i6, 18);
            f2187a.append(androidx.constraintlayout.widget.f.f2980o6, 19);
            f2187a.append(androidx.constraintlayout.widget.f.f3032s6, 20);
            f2187a.append(androidx.constraintlayout.widget.f.f3110y6, 21);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void b(f fVar, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArray.getIndex(i10);
                switch (f2187a.get(index)) {
                    case 1:
                        if (MotionLayout.f2054d1) {
                            int resourceId = typedArray.getResourceId(index, fVar.f2145b);
                            fVar.f2145b = resourceId;
                            if (resourceId == -1) {
                                fVar.f2146c = typedArray.getString(index);
                            }
                        } else if (typedArray.peekValue(index).type == 3) {
                            fVar.f2146c = typedArray.getString(index);
                        } else {
                            fVar.f2145b = typedArray.getResourceId(index, fVar.f2145b);
                        }
                        break;
                    case 2:
                        fVar.f2144a = typedArray.getInt(index, fVar.f2144a);
                        break;
                    case 3:
                        fVar.f2167g = typedArray.getString(index);
                        break;
                    case 4:
                        fVar.f2168h = typedArray.getInteger(index, fVar.f2168h);
                        break;
                    case 5:
                        if (typedArray.peekValue(index).type == 3) {
                            fVar.f2170j = typedArray.getString(index);
                            fVar.f2169i = 7;
                        } else {
                            fVar.f2169i = typedArray.getInt(index, fVar.f2169i);
                        }
                        break;
                    case 6:
                        fVar.f2171k = typedArray.getFloat(index, fVar.f2171k);
                        break;
                    case 7:
                        if (typedArray.peekValue(index).type == 5) {
                            fVar.f2172l = typedArray.getDimension(index, fVar.f2172l);
                        } else {
                            fVar.f2172l = typedArray.getFloat(index, fVar.f2172l);
                        }
                        break;
                    case 8:
                        fVar.f2175o = typedArray.getInt(index, fVar.f2175o);
                        break;
                    case 9:
                        fVar.f2176p = typedArray.getFloat(index, fVar.f2176p);
                        break;
                    case 10:
                        fVar.f2177q = typedArray.getDimension(index, fVar.f2177q);
                        break;
                    case 11:
                        fVar.f2178r = typedArray.getFloat(index, fVar.f2178r);
                        break;
                    case 12:
                        fVar.f2180t = typedArray.getFloat(index, fVar.f2180t);
                        break;
                    case 13:
                        fVar.f2181u = typedArray.getFloat(index, fVar.f2181u);
                        break;
                    case 14:
                        fVar.f2179s = typedArray.getFloat(index, fVar.f2179s);
                        break;
                    case 15:
                        fVar.f2182v = typedArray.getFloat(index, fVar.f2182v);
                        break;
                    case 16:
                        fVar.f2183w = typedArray.getFloat(index, fVar.f2183w);
                        break;
                    case 17:
                        fVar.f2184x = typedArray.getDimension(index, fVar.f2184x);
                        break;
                    case 18:
                        fVar.f2185y = typedArray.getDimension(index, fVar.f2185y);
                        break;
                    case 19:
                        fVar.f2186z = typedArray.getDimension(index, fVar.f2186z);
                        break;
                    case 20:
                        fVar.f2174n = typedArray.getFloat(index, fVar.f2174n);
                        break;
                    case 21:
                        fVar.f2173m = typedArray.getFloat(index, fVar.f2173m) / 360.0f;
                        break;
                    default:
                        Log.e("KeyCycle", "unused attribute 0x" + Integer.toHexString(index) + "   " + f2187a.get(index));
                        break;
                }
            }
        }
    }

    public f() {
        this.f2147d = 4;
        this.f2148e = new HashMap();
    }

    public void Y(HashMap map) {
        z.c cVar;
        z.c cVar2;
        for (String str : map.keySet()) {
            if (str.startsWith("CUSTOM")) {
                androidx.constraintlayout.widget.a aVar = (androidx.constraintlayout.widget.a) this.f2148e.get(str.substring(7));
                if (aVar != null && aVar.d() == androidx.constraintlayout.widget.a.EnumC0023a.FLOAT_TYPE && (cVar = (z.c) map.get(str)) != null) {
                    cVar.e(this.f2144a, this.f2169i, this.f2170j, this.f2175o, this.f2171k, this.f2172l, this.f2173m, aVar.e(), aVar);
                }
            } else {
                float fZ = Z(str);
                if (!Float.isNaN(fZ) && (cVar2 = (z.c) map.get(str)) != null) {
                    cVar2.d(this.f2144a, this.f2169i, this.f2170j, this.f2175o, this.f2171k, this.f2172l, this.f2173m, fZ);
                }
            }
        }
    }

    public float Z(String str) {
        str.getClass();
        switch (str) {
            case "rotationX":
                return this.f2180t;
            case "rotationY":
                return this.f2181u;
            case "translationX":
                return this.f2184x;
            case "translationY":
                return this.f2185y;
            case "translationZ":
                return this.f2186z;
            case "progress":
                return this.f2174n;
            case "scaleX":
                return this.f2182v;
            case "scaleY":
                return this.f2183w;
            case "rotation":
                return this.f2178r;
            case "elevation":
                return this.f2177q;
            case "transitionPathRotate":
                return this.f2179s;
            case "alpha":
                return this.f2176p;
            case "waveOffset":
                return this.f2172l;
            case "wavePhase":
                return this.f2173m;
            default:
                if (str.startsWith("CUSTOM")) {
                    return Float.NaN;
                }
                Log.v("WARNING! KeyCycle", "  UNKNOWN  " + str);
                return Float.NaN;
        }
    }

    @Override // androidx.constraintlayout.motion.widget.d
    /* JADX INFO: renamed from: b */
    public d clone() {
        return new f().c(this);
    }

    @Override // androidx.constraintlayout.motion.widget.d
    public d c(d dVar) {
        super.c(dVar);
        f fVar = (f) dVar;
        this.f2167g = fVar.f2167g;
        this.f2168h = fVar.f2168h;
        this.f2169i = fVar.f2169i;
        this.f2170j = fVar.f2170j;
        this.f2171k = fVar.f2171k;
        this.f2172l = fVar.f2172l;
        this.f2173m = fVar.f2173m;
        this.f2174n = fVar.f2174n;
        this.f2175o = fVar.f2175o;
        this.f2176p = fVar.f2176p;
        this.f2177q = fVar.f2177q;
        this.f2178r = fVar.f2178r;
        this.f2179s = fVar.f2179s;
        this.f2180t = fVar.f2180t;
        this.f2181u = fVar.f2181u;
        this.f2182v = fVar.f2182v;
        this.f2183w = fVar.f2183w;
        this.f2184x = fVar.f2184x;
        this.f2185y = fVar.f2185y;
        this.f2186z = fVar.f2186z;
        return this;
    }

    @Override // androidx.constraintlayout.motion.widget.d
    public void d(HashSet hashSet) {
        if (!Float.isNaN(this.f2176p)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f2177q)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f2178r)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f2180t)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f2181u)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f2182v)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f2183w)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f2179s)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f2184x)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f2185y)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f2186z)) {
            hashSet.add("translationZ");
        }
        if (this.f2148e.size() > 0) {
            Iterator it = this.f2148e.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + ((String) it.next()));
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.d
    public void e(Context context, AttributeSet attributeSet) {
        a.b(this, context.obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.f.f2863f6));
    }

    @Override // androidx.constraintlayout.motion.widget.d
    public void a(HashMap map) {
        androidx.constraintlayout.motion.widget.a.g("KeyCycle", "add " + map.size() + " values", 2);
        for (String str : map.keySet()) {
            v.j jVar = (v.j) map.get(str);
            if (jVar != null) {
                str.getClass();
                byte b10 = -1;
                switch (str.hashCode()) {
                    case -1249320806:
                        if (str.equals("rotationX")) {
                            b10 = 0;
                        }
                        break;
                    case -1249320805:
                        if (str.equals("rotationY")) {
                            b10 = 1;
                        }
                        break;
                    case -1225497657:
                        if (str.equals("translationX")) {
                            b10 = 2;
                        }
                        break;
                    case -1225497656:
                        if (str.equals(obFGmWgqyy.UTAlmVeNAGyPtD)) {
                            b10 = 3;
                        }
                        break;
                    case -1225497655:
                        if (str.equals("translationZ")) {
                            b10 = 4;
                        }
                        break;
                    case -1001078227:
                        if (str.equals(NotificationCompat.CATEGORY_PROGRESS)) {
                            b10 = 5;
                        }
                        break;
                    case -908189618:
                        if (str.equals(mTFeqtajA.aQv)) {
                            b10 = 6;
                        }
                        break;
                    case -908189617:
                        if (str.equals("scaleY")) {
                            b10 = 7;
                        }
                        break;
                    case -40300674:
                        if (str.equals(WwUgngZLNA.iMsgLlBmJX)) {
                            b10 = 8;
                        }
                        break;
                    case -4379043:
                        if (str.equals("elevation")) {
                            b10 = 9;
                        }
                        break;
                    case 37232917:
                        if (str.equals("transitionPathRotate")) {
                            b10 = 10;
                        }
                        break;
                    case 92909918:
                        if (str.equals("alpha")) {
                            b10 = 11;
                        }
                        break;
                    case 156108012:
                        if (str.equals("waveOffset")) {
                            b10 = 12;
                        }
                        break;
                    case 1530034690:
                        if (str.equals("wavePhase")) {
                            b10 = 13;
                        }
                        break;
                }
                switch (b10) {
                    case 0:
                        jVar.c(this.f2144a, this.f2180t);
                        break;
                    case 1:
                        jVar.c(this.f2144a, this.f2181u);
                        break;
                    case 2:
                        jVar.c(this.f2144a, this.f2184x);
                        break;
                    case 3:
                        jVar.c(this.f2144a, this.f2185y);
                        break;
                    case 4:
                        jVar.c(this.f2144a, this.f2186z);
                        break;
                    case 5:
                        jVar.c(this.f2144a, this.f2174n);
                        break;
                    case 6:
                        jVar.c(this.f2144a, this.f2182v);
                        break;
                    case 7:
                        jVar.c(this.f2144a, this.f2183w);
                        break;
                    case 8:
                        jVar.c(this.f2144a, this.f2178r);
                        break;
                    case 9:
                        jVar.c(this.f2144a, this.f2177q);
                        break;
                    case 10:
                        jVar.c(this.f2144a, this.f2179s);
                        break;
                    case 11:
                        jVar.c(this.f2144a, this.f2176p);
                        break;
                    case 12:
                        jVar.c(this.f2144a, this.f2172l);
                        break;
                    case 13:
                        jVar.c(this.f2144a, this.f2173m);
                        break;
                    default:
                        if (!str.startsWith("CUSTOM")) {
                            Log.v("WARNING KeyCycle", "  UNKNOWN  " + str);
                        }
                        break;
                }
            }
        }
    }
}
