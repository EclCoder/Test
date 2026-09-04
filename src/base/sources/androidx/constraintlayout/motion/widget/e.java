package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.component.dkl.hnj.gjv.hn.imh.UHbHibBvYxKnPE;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class e extends d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f2149g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f2150h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f2151i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f2152j = Float.NaN;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f2153k = Float.NaN;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f2154l = Float.NaN;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f2155m = Float.NaN;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f2156n = Float.NaN;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f2157o = Float.NaN;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private float f2158p = Float.NaN;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private float f2159q = Float.NaN;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f2160r = Float.NaN;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private float f2161s = Float.NaN;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private float f2162t = Float.NaN;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private float f2163u = Float.NaN;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private float f2164v = Float.NaN;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private float f2165w = Float.NaN;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static SparseIntArray f2166a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f2166a = sparseIntArray;
            sparseIntArray.append(androidx.constraintlayout.widget.f.N5, 1);
            f2166a.append(androidx.constraintlayout.widget.f.Y5, 2);
            f2166a.append(androidx.constraintlayout.widget.f.U5, 4);
            f2166a.append(androidx.constraintlayout.widget.f.V5, 5);
            f2166a.append(androidx.constraintlayout.widget.f.W5, 6);
            f2166a.append(androidx.constraintlayout.widget.f.O5, 19);
            f2166a.append(androidx.constraintlayout.widget.f.P5, 20);
            f2166a.append(androidx.constraintlayout.widget.f.S5, 7);
            f2166a.append(androidx.constraintlayout.widget.f.f2850e6, 8);
            f2166a.append(androidx.constraintlayout.widget.f.f2837d6, 9);
            f2166a.append(androidx.constraintlayout.widget.f.f2824c6, 10);
            f2166a.append(androidx.constraintlayout.widget.f.f2798a6, 12);
            f2166a.append(androidx.constraintlayout.widget.f.Z5, 13);
            f2166a.append(androidx.constraintlayout.widget.f.T5, 14);
            f2166a.append(androidx.constraintlayout.widget.f.Q5, 15);
            f2166a.append(androidx.constraintlayout.widget.f.R5, 16);
            f2166a.append(androidx.constraintlayout.widget.f.X5, 17);
            f2166a.append(androidx.constraintlayout.widget.f.f2811b6, 18);
        }

        public static void a(e eVar, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArray.getIndex(i10);
                switch (f2166a.get(index)) {
                    case 1:
                        eVar.f2152j = typedArray.getFloat(index, eVar.f2152j);
                        break;
                    case 2:
                        eVar.f2153k = typedArray.getDimension(index, eVar.f2153k);
                        break;
                    case 3:
                    case 11:
                    default:
                        Log.e("KeyAttribute", "unused attribute 0x" + Integer.toHexString(index) + "   " + f2166a.get(index));
                        break;
                    case 4:
                        eVar.f2154l = typedArray.getFloat(index, eVar.f2154l);
                        break;
                    case 5:
                        eVar.f2155m = typedArray.getFloat(index, eVar.f2155m);
                        break;
                    case 6:
                        eVar.f2156n = typedArray.getFloat(index, eVar.f2156n);
                        break;
                    case 7:
                        eVar.f2160r = typedArray.getFloat(index, eVar.f2160r);
                        break;
                    case 8:
                        eVar.f2159q = typedArray.getFloat(index, eVar.f2159q);
                        break;
                    case 9:
                        eVar.f2149g = typedArray.getString(index);
                        break;
                    case 10:
                        if (MotionLayout.f2054d1) {
                            int resourceId = typedArray.getResourceId(index, eVar.f2145b);
                            eVar.f2145b = resourceId;
                            if (resourceId == -1) {
                                eVar.f2146c = typedArray.getString(index);
                            }
                        } else if (typedArray.peekValue(index).type == 3) {
                            eVar.f2146c = typedArray.getString(index);
                        } else {
                            eVar.f2145b = typedArray.getResourceId(index, eVar.f2145b);
                        }
                        break;
                    case 12:
                        eVar.f2144a = typedArray.getInt(index, eVar.f2144a);
                        break;
                    case 13:
                        eVar.f2150h = typedArray.getInteger(index, eVar.f2150h);
                        break;
                    case 14:
                        eVar.f2161s = typedArray.getFloat(index, eVar.f2161s);
                        break;
                    case 15:
                        eVar.f2162t = typedArray.getDimension(index, eVar.f2162t);
                        break;
                    case 16:
                        eVar.f2163u = typedArray.getDimension(index, eVar.f2163u);
                        break;
                    case 17:
                        eVar.f2164v = typedArray.getDimension(index, eVar.f2164v);
                        break;
                    case 18:
                        eVar.f2165w = typedArray.getFloat(index, eVar.f2165w);
                        break;
                    case 19:
                        eVar.f2157o = typedArray.getDimension(index, eVar.f2157o);
                        break;
                    case 20:
                        eVar.f2158p = typedArray.getDimension(index, eVar.f2158p);
                        break;
                }
            }
        }
    }

    public e() {
        this.f2147d = 1;
        this.f2148e = new HashMap();
    }

    public void R(String str, Object obj) {
        str.getClass();
        switch (str) {
            case "motionProgress":
                this.f2165w = k(obj);
                break;
            case "transitionEasing":
                this.f2149g = obj.toString();
                break;
            case "rotationX":
                this.f2155m = k(obj);
                break;
            case "rotationY":
                this.f2156n = k(obj);
                break;
            case "translationX":
                this.f2162t = k(obj);
                break;
            case "translationY":
                this.f2163u = k(obj);
                break;
            case "translationZ":
                this.f2164v = k(obj);
                break;
            case "scaleX":
                this.f2160r = k(obj);
                break;
            case "scaleY":
                this.f2161s = k(obj);
                break;
            case "transformPivotX":
                this.f2157o = k(obj);
                break;
            case "transformPivotY":
                this.f2158p = k(obj);
                break;
            case "rotation":
                this.f2154l = k(obj);
                break;
            case "elevation":
                this.f2153k = k(obj);
                break;
            case "transitionPathRotate":
                this.f2159q = k(obj);
                break;
            case "alpha":
                this.f2152j = k(obj);
                break;
            case "curveFit":
                this.f2150h = l(obj);
                break;
            case "visibility":
                this.f2151i = j(obj);
                break;
        }
    }

    @Override // androidx.constraintlayout.motion.widget.d
    public void a(HashMap map) {
        for (String str : map.keySet()) {
            v.j jVar = (v.j) map.get(str);
            if (jVar != null) {
                if (!str.startsWith("CUSTOM")) {
                    switch (str) {
                        case "rotationX":
                            if (Float.isNaN(this.f2155m)) {
                                break;
                            } else {
                                jVar.c(this.f2144a, this.f2155m);
                                break;
                            }
                            break;
                        case "rotationY":
                            if (Float.isNaN(this.f2156n)) {
                                break;
                            } else {
                                jVar.c(this.f2144a, this.f2156n);
                                break;
                            }
                            break;
                        case "translationX":
                            if (Float.isNaN(this.f2162t)) {
                                break;
                            } else {
                                jVar.c(this.f2144a, this.f2162t);
                                break;
                            }
                            break;
                        case "translationY":
                            if (Float.isNaN(this.f2163u)) {
                                break;
                            } else {
                                jVar.c(this.f2144a, this.f2163u);
                                break;
                            }
                            break;
                        case "translationZ":
                            if (Float.isNaN(this.f2164v)) {
                                break;
                            } else {
                                jVar.c(this.f2144a, this.f2164v);
                                break;
                            }
                            break;
                        case "progress":
                            if (Float.isNaN(this.f2165w)) {
                                break;
                            } else {
                                jVar.c(this.f2144a, this.f2165w);
                                break;
                            }
                            break;
                        case "scaleX":
                            if (Float.isNaN(this.f2160r)) {
                                break;
                            } else {
                                jVar.c(this.f2144a, this.f2160r);
                                break;
                            }
                            break;
                        case "scaleY":
                            if (Float.isNaN(this.f2161s)) {
                                break;
                            } else {
                                jVar.c(this.f2144a, this.f2161s);
                                break;
                            }
                            break;
                        case "transformPivotX":
                            if (Float.isNaN(this.f2155m)) {
                                break;
                            } else {
                                jVar.c(this.f2144a, this.f2157o);
                                break;
                            }
                            break;
                        case "transformPivotY":
                            if (Float.isNaN(this.f2156n)) {
                                break;
                            } else {
                                jVar.c(this.f2144a, this.f2158p);
                                break;
                            }
                            break;
                        case "rotation":
                            if (Float.isNaN(this.f2154l)) {
                                break;
                            } else {
                                jVar.c(this.f2144a, this.f2154l);
                                break;
                            }
                            break;
                        case "elevation":
                            if (Float.isNaN(this.f2153k)) {
                                break;
                            } else {
                                jVar.c(this.f2144a, this.f2153k);
                                break;
                            }
                            break;
                        case "transitionPathRotate":
                            if (Float.isNaN(this.f2159q)) {
                                break;
                            } else {
                                jVar.c(this.f2144a, this.f2159q);
                                break;
                            }
                            break;
                        case "alpha":
                            if (Float.isNaN(this.f2152j)) {
                                break;
                            } else {
                                jVar.c(this.f2144a, this.f2152j);
                                break;
                            }
                            break;
                    }
                } else {
                    androidx.constraintlayout.widget.a aVar = (androidx.constraintlayout.widget.a) this.f2148e.get(str.substring(7));
                    if (aVar != null) {
                        ((z.d.b) jVar).i(this.f2144a, aVar);
                    }
                }
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.d
    /* JADX INFO: renamed from: b */
    public d clone() {
        return new e().c(this);
    }

    @Override // androidx.constraintlayout.motion.widget.d
    public d c(d dVar) {
        super.c(dVar);
        e eVar = (e) dVar;
        this.f2150h = eVar.f2150h;
        this.f2151i = eVar.f2151i;
        this.f2152j = eVar.f2152j;
        this.f2153k = eVar.f2153k;
        this.f2154l = eVar.f2154l;
        this.f2155m = eVar.f2155m;
        this.f2156n = eVar.f2156n;
        this.f2157o = eVar.f2157o;
        this.f2158p = eVar.f2158p;
        this.f2159q = eVar.f2159q;
        this.f2160r = eVar.f2160r;
        this.f2161s = eVar.f2161s;
        this.f2162t = eVar.f2162t;
        this.f2163u = eVar.f2163u;
        this.f2164v = eVar.f2164v;
        this.f2165w = eVar.f2165w;
        this.f2149g = eVar.f2149g;
        return this;
    }

    @Override // androidx.constraintlayout.motion.widget.d
    public void d(HashSet hashSet) {
        if (!Float.isNaN(this.f2152j)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f2153k)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f2154l)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f2155m)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f2156n)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f2157o)) {
            hashSet.add("transformPivotX");
        }
        if (!Float.isNaN(this.f2158p)) {
            hashSet.add("transformPivotY");
        }
        if (!Float.isNaN(this.f2162t)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f2163u)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f2164v)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.f2159q)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f2160r)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f2161s)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f2165w)) {
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
        a.a(this, context.obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.f.M5));
    }

    @Override // androidx.constraintlayout.motion.widget.d
    public void h(HashMap map) {
        if (this.f2150h == -1) {
            return;
        }
        if (!Float.isNaN(this.f2152j)) {
            map.put("alpha", Integer.valueOf(this.f2150h));
        }
        if (!Float.isNaN(this.f2153k)) {
            map.put("elevation", Integer.valueOf(this.f2150h));
        }
        if (!Float.isNaN(this.f2154l)) {
            map.put("rotation", Integer.valueOf(this.f2150h));
        }
        if (!Float.isNaN(this.f2155m)) {
            map.put("rotationX", Integer.valueOf(this.f2150h));
        }
        if (!Float.isNaN(this.f2156n)) {
            map.put("rotationY", Integer.valueOf(this.f2150h));
        }
        if (!Float.isNaN(this.f2157o)) {
            map.put("transformPivotX", Integer.valueOf(this.f2150h));
        }
        if (!Float.isNaN(this.f2158p)) {
            map.put("transformPivotY", Integer.valueOf(this.f2150h));
        }
        if (!Float.isNaN(this.f2162t)) {
            map.put("translationX", Integer.valueOf(this.f2150h));
        }
        if (!Float.isNaN(this.f2163u)) {
            map.put("translationY", Integer.valueOf(this.f2150h));
        }
        if (!Float.isNaN(this.f2164v)) {
            map.put("translationZ", Integer.valueOf(this.f2150h));
        }
        if (!Float.isNaN(this.f2159q)) {
            map.put("transitionPathRotate", Integer.valueOf(this.f2150h));
        }
        if (!Float.isNaN(this.f2160r)) {
            map.put("scaleX", Integer.valueOf(this.f2150h));
        }
        if (!Float.isNaN(this.f2161s)) {
            map.put("scaleY", Integer.valueOf(this.f2150h));
        }
        if (!Float.isNaN(this.f2165w)) {
            map.put(NotificationCompat.CATEGORY_PROGRESS, Integer.valueOf(this.f2150h));
        }
        if (this.f2148e.size() > 0) {
            Iterator it = this.f2148e.keySet().iterator();
            while (it.hasNext()) {
                map.put(UHbHibBvYxKnPE.zimewPHCJon + ((String) it.next()), Integer.valueOf(this.f2150h));
            }
        }
    }
}
