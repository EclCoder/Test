package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.core.app.NotificationCompat;
import com.hecorat.screenrecorder.free.models.Ke.Lykgign;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class j extends d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f2204g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f2205h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f2206i = Float.NaN;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f2207j = Float.NaN;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f2208k = Float.NaN;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f2209l = Float.NaN;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f2210m = Float.NaN;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f2211n = Float.NaN;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f2212o = Float.NaN;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private float f2213p = Float.NaN;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private float f2214q = Float.NaN;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f2215r = Float.NaN;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private float f2216s = Float.NaN;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private float f2217t = Float.NaN;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f2218u = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private String f2219v = null;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private float f2220w = Float.NaN;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private float f2221x = 0.0f;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static SparseIntArray f2222a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f2222a = sparseIntArray;
            sparseIntArray.append(androidx.constraintlayout.widget.f.S6, 1);
            f2222a.append(androidx.constraintlayout.widget.f.f2812b7, 2);
            f2222a.append(androidx.constraintlayout.widget.f.X6, 4);
            f2222a.append(androidx.constraintlayout.widget.f.Y6, 5);
            f2222a.append(androidx.constraintlayout.widget.f.Z6, 6);
            f2222a.append(androidx.constraintlayout.widget.f.V6, 7);
            f2222a.append(androidx.constraintlayout.widget.f.f2890h7, 8);
            f2222a.append(androidx.constraintlayout.widget.f.f2877g7, 9);
            f2222a.append(androidx.constraintlayout.widget.f.f2864f7, 10);
            f2222a.append(androidx.constraintlayout.widget.f.f2838d7, 12);
            f2222a.append(androidx.constraintlayout.widget.f.f2825c7, 13);
            f2222a.append(androidx.constraintlayout.widget.f.W6, 14);
            f2222a.append(androidx.constraintlayout.widget.f.T6, 15);
            f2222a.append(androidx.constraintlayout.widget.f.U6, 16);
            f2222a.append(androidx.constraintlayout.widget.f.f2799a7, 17);
            f2222a.append(androidx.constraintlayout.widget.f.f2851e7, 18);
            f2222a.append(androidx.constraintlayout.widget.f.f2916j7, 20);
            f2222a.append(androidx.constraintlayout.widget.f.f2903i7, 21);
            f2222a.append(androidx.constraintlayout.widget.f.f2929k7, 19);
        }

        public static void a(j jVar, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArray.getIndex(i10);
                switch (f2222a.get(index)) {
                    case 1:
                        jVar.f2206i = typedArray.getFloat(index, jVar.f2206i);
                        break;
                    case 2:
                        jVar.f2207j = typedArray.getDimension(index, jVar.f2207j);
                        break;
                    case 3:
                    case 11:
                    default:
                        Log.e("KeyTimeCycle", "unused attribute 0x" + Integer.toHexString(index) + "   " + f2222a.get(index));
                        break;
                    case 4:
                        jVar.f2208k = typedArray.getFloat(index, jVar.f2208k);
                        break;
                    case 5:
                        jVar.f2209l = typedArray.getFloat(index, jVar.f2209l);
                        break;
                    case 6:
                        jVar.f2210m = typedArray.getFloat(index, jVar.f2210m);
                        break;
                    case 7:
                        jVar.f2212o = typedArray.getFloat(index, jVar.f2212o);
                        break;
                    case 8:
                        jVar.f2211n = typedArray.getFloat(index, jVar.f2211n);
                        break;
                    case 9:
                        jVar.f2204g = typedArray.getString(index);
                        break;
                    case 10:
                        if (MotionLayout.f2054d1) {
                            int resourceId = typedArray.getResourceId(index, jVar.f2145b);
                            jVar.f2145b = resourceId;
                            if (resourceId == -1) {
                                jVar.f2146c = typedArray.getString(index);
                            }
                        } else if (typedArray.peekValue(index).type == 3) {
                            jVar.f2146c = typedArray.getString(index);
                        } else {
                            jVar.f2145b = typedArray.getResourceId(index, jVar.f2145b);
                        }
                        break;
                    case 12:
                        jVar.f2144a = typedArray.getInt(index, jVar.f2144a);
                        break;
                    case 13:
                        jVar.f2205h = typedArray.getInteger(index, jVar.f2205h);
                        break;
                    case 14:
                        jVar.f2213p = typedArray.getFloat(index, jVar.f2213p);
                        break;
                    case 15:
                        jVar.f2214q = typedArray.getDimension(index, jVar.f2214q);
                        break;
                    case 16:
                        jVar.f2215r = typedArray.getDimension(index, jVar.f2215r);
                        break;
                    case 17:
                        jVar.f2216s = typedArray.getDimension(index, jVar.f2216s);
                        break;
                    case 18:
                        jVar.f2217t = typedArray.getFloat(index, jVar.f2217t);
                        break;
                    case 19:
                        if (typedArray.peekValue(index).type == 3) {
                            jVar.f2219v = typedArray.getString(index);
                            jVar.f2218u = 7;
                        } else {
                            jVar.f2218u = typedArray.getInt(index, jVar.f2218u);
                        }
                        break;
                    case 20:
                        jVar.f2220w = typedArray.getFloat(index, jVar.f2220w);
                        break;
                    case 21:
                        if (typedArray.peekValue(index).type == 5) {
                            jVar.f2221x = typedArray.getDimension(index, jVar.f2221x);
                        } else {
                            jVar.f2221x = typedArray.getFloat(index, jVar.f2221x);
                        }
                        break;
                }
            }
        }
    }

    public j() {
        this.f2147d = 3;
        this.f2148e = new HashMap();
    }

    @Override // androidx.constraintlayout.motion.widget.d
    public void a(HashMap map) {
        throw new IllegalArgumentException(" KeyTimeCycles do not support SplineSet");
    }

    @Override // androidx.constraintlayout.motion.widget.d
    /* JADX INFO: renamed from: b */
    public d clone() {
        return new j().c(this);
    }

    @Override // androidx.constraintlayout.motion.widget.d
    public d c(d dVar) {
        super.c(dVar);
        j jVar = (j) dVar;
        this.f2204g = jVar.f2204g;
        this.f2205h = jVar.f2205h;
        this.f2218u = jVar.f2218u;
        this.f2220w = jVar.f2220w;
        this.f2221x = jVar.f2221x;
        this.f2217t = jVar.f2217t;
        this.f2206i = jVar.f2206i;
        this.f2207j = jVar.f2207j;
        this.f2208k = jVar.f2208k;
        this.f2211n = jVar.f2211n;
        this.f2209l = jVar.f2209l;
        this.f2210m = jVar.f2210m;
        this.f2212o = jVar.f2212o;
        this.f2213p = jVar.f2213p;
        this.f2214q = jVar.f2214q;
        this.f2215r = jVar.f2215r;
        this.f2216s = jVar.f2216s;
        this.f2219v = jVar.f2219v;
        return this;
    }

    @Override // androidx.constraintlayout.motion.widget.d
    public void d(HashSet hashSet) {
        if (!Float.isNaN(this.f2206i)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f2207j)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f2208k)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f2209l)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f2210m)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f2214q)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f2215r)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f2216s)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.f2211n)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f2212o)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f2213p)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f2217t)) {
            hashSet.add(NotificationCompat.CATEGORY_PROGRESS);
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
        a.a(this, context.obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.f.R6));
    }

    @Override // androidx.constraintlayout.motion.widget.d
    public void h(HashMap map) {
        if (this.f2205h == -1) {
            return;
        }
        if (!Float.isNaN(this.f2206i)) {
            map.put("alpha", Integer.valueOf(this.f2205h));
        }
        if (!Float.isNaN(this.f2207j)) {
            map.put("elevation", Integer.valueOf(this.f2205h));
        }
        if (!Float.isNaN(this.f2208k)) {
            map.put("rotation", Integer.valueOf(this.f2205h));
        }
        if (!Float.isNaN(this.f2209l)) {
            map.put("rotationX", Integer.valueOf(this.f2205h));
        }
        if (!Float.isNaN(this.f2210m)) {
            map.put("rotationY", Integer.valueOf(this.f2205h));
        }
        if (!Float.isNaN(this.f2214q)) {
            map.put("translationX", Integer.valueOf(this.f2205h));
        }
        if (!Float.isNaN(this.f2215r)) {
            map.put("translationY", Integer.valueOf(this.f2205h));
        }
        if (!Float.isNaN(this.f2216s)) {
            map.put("translationZ", Integer.valueOf(this.f2205h));
        }
        if (!Float.isNaN(this.f2211n)) {
            map.put("transitionPathRotate", Integer.valueOf(this.f2205h));
        }
        if (!Float.isNaN(this.f2212o)) {
            map.put("scaleX", Integer.valueOf(this.f2205h));
        }
        if (!Float.isNaN(this.f2212o)) {
            map.put("scaleY", Integer.valueOf(this.f2205h));
        }
        if (!Float.isNaN(this.f2217t)) {
            map.put(NotificationCompat.CATEGORY_PROGRESS, Integer.valueOf(this.f2205h));
        }
        if (this.f2148e.size() > 0) {
            Iterator it = this.f2148e.keySet().iterator();
            while (it.hasNext()) {
                map.put("CUSTOM," + ((String) it.next()), Integer.valueOf(this.f2205h));
            }
        }
    }

    public void U(HashMap map) {
        for (String str : map.keySet()) {
            z.f fVar = (z.f) map.get(str);
            if (fVar != null) {
                byte b10 = 7;
                if (str.startsWith("CUSTOM")) {
                    androidx.constraintlayout.widget.a aVar = (androidx.constraintlayout.widget.a) this.f2148e.get(str.substring(7));
                    if (aVar != null) {
                        ((z.f.b) fVar).j(this.f2144a, aVar, this.f2220w, this.f2218u, this.f2221x);
                    }
                } else {
                    switch (str.hashCode()) {
                        case -1249320806:
                            b10 = !str.equals(Lykgign.ZrmIP) ? (byte) -1 : (byte) 0;
                            break;
                        case -1249320805:
                            b10 = !str.equals("rotationY") ? (byte) -1 : (byte) 1;
                            break;
                        case -1225497657:
                            b10 = !str.equals("translationX") ? (byte) -1 : (byte) 2;
                            break;
                        case -1225497656:
                            b10 = !str.equals("translationY") ? (byte) -1 : (byte) 3;
                            break;
                        case -1225497655:
                            b10 = !str.equals("translationZ") ? (byte) -1 : (byte) 4;
                            break;
                        case -1001078227:
                            b10 = !str.equals(NotificationCompat.CATEGORY_PROGRESS) ? (byte) -1 : (byte) 5;
                            break;
                        case -908189618:
                            b10 = !str.equals("scaleX") ? (byte) -1 : (byte) 6;
                            break;
                        case -908189617:
                            if (!str.equals("scaleY")) {
                                b10 = -1;
                            }
                            break;
                        case -40300674:
                            b10 = !str.equals("rotation") ? (byte) -1 : (byte) 8;
                            break;
                        case -4379043:
                            b10 = !str.equals("elevation") ? (byte) -1 : (byte) 9;
                            break;
                        case 37232917:
                            b10 = !str.equals("transitionPathRotate") ? (byte) -1 : (byte) 10;
                            break;
                        case 92909918:
                            b10 = !str.equals("alpha") ? (byte) -1 : (byte) 11;
                            break;
                        default:
                            b10 = -1;
                            break;
                    }
                    switch (b10) {
                        case 0:
                            if (!Float.isNaN(this.f2209l)) {
                                fVar.b(this.f2144a, this.f2209l, this.f2220w, this.f2218u, this.f2221x);
                            }
                            break;
                        case 1:
                            if (!Float.isNaN(this.f2210m)) {
                                fVar.b(this.f2144a, this.f2210m, this.f2220w, this.f2218u, this.f2221x);
                            }
                            break;
                        case 2:
                            if (!Float.isNaN(this.f2214q)) {
                                fVar.b(this.f2144a, this.f2214q, this.f2220w, this.f2218u, this.f2221x);
                            }
                            break;
                        case 3:
                            if (!Float.isNaN(this.f2215r)) {
                                fVar.b(this.f2144a, this.f2215r, this.f2220w, this.f2218u, this.f2221x);
                            }
                            break;
                        case 4:
                            if (!Float.isNaN(this.f2216s)) {
                                fVar.b(this.f2144a, this.f2216s, this.f2220w, this.f2218u, this.f2221x);
                            }
                            break;
                        case 5:
                            if (!Float.isNaN(this.f2217t)) {
                                fVar.b(this.f2144a, this.f2217t, this.f2220w, this.f2218u, this.f2221x);
                            }
                            break;
                        case 6:
                            if (!Float.isNaN(this.f2212o)) {
                                fVar.b(this.f2144a, this.f2212o, this.f2220w, this.f2218u, this.f2221x);
                            }
                            break;
                        case 7:
                            if (!Float.isNaN(this.f2213p)) {
                                fVar.b(this.f2144a, this.f2213p, this.f2220w, this.f2218u, this.f2221x);
                            }
                            break;
                        case 8:
                            if (!Float.isNaN(this.f2208k)) {
                                fVar.b(this.f2144a, this.f2208k, this.f2220w, this.f2218u, this.f2221x);
                            }
                            break;
                        case 9:
                            if (!Float.isNaN(this.f2207j)) {
                                fVar.b(this.f2144a, this.f2207j, this.f2220w, this.f2218u, this.f2221x);
                            }
                            break;
                        case 10:
                            if (!Float.isNaN(this.f2211n)) {
                                fVar.b(this.f2144a, this.f2211n, this.f2220w, this.f2218u, this.f2221x);
                            }
                            break;
                        case 11:
                            if (!Float.isNaN(this.f2206i)) {
                                fVar.b(this.f2144a, this.f2206i, this.f2220w, this.f2218u, this.f2221x);
                            }
                            break;
                        default:
                            Log.e("KeyTimeCycles", "UNKNOWN addValues \"" + str + "\"");
                            break;
                    }
                }
            }
        }
    }
}
