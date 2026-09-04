package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class h extends i {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    String f2190h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    int f2191i = d.f2143f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    int f2192j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    float f2193k = Float.NaN;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    float f2194l = Float.NaN;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    float f2195m = Float.NaN;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    float f2196n = Float.NaN;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    float f2197o = Float.NaN;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    float f2198p = Float.NaN;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    int f2199q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f2200r = Float.NaN;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private float f2201s = Float.NaN;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static SparseIntArray f2202a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f2202a = sparseIntArray;
            sparseIntArray.append(androidx.constraintlayout.widget.f.J6, 1);
            f2202a.append(androidx.constraintlayout.widget.f.H6, 2);
            f2202a.append(androidx.constraintlayout.widget.f.Q6, 3);
            f2202a.append(androidx.constraintlayout.widget.f.F6, 4);
            f2202a.append(androidx.constraintlayout.widget.f.G6, 5);
            f2202a.append(androidx.constraintlayout.widget.f.N6, 6);
            f2202a.append(androidx.constraintlayout.widget.f.O6, 7);
            f2202a.append(androidx.constraintlayout.widget.f.I6, 9);
            f2202a.append(androidx.constraintlayout.widget.f.P6, 8);
            f2202a.append(androidx.constraintlayout.widget.f.M6, 11);
            f2202a.append(androidx.constraintlayout.widget.f.L6, 12);
            f2202a.append(androidx.constraintlayout.widget.f.K6, 10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void b(h hVar, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArray.getIndex(i10);
                switch (f2202a.get(index)) {
                    case 1:
                        if (MotionLayout.f2054d1) {
                            int resourceId = typedArray.getResourceId(index, hVar.f2145b);
                            hVar.f2145b = resourceId;
                            if (resourceId == -1) {
                                hVar.f2146c = typedArray.getString(index);
                            }
                        } else if (typedArray.peekValue(index).type == 3) {
                            hVar.f2146c = typedArray.getString(index);
                        } else {
                            hVar.f2145b = typedArray.getResourceId(index, hVar.f2145b);
                        }
                        break;
                    case 2:
                        hVar.f2144a = typedArray.getInt(index, hVar.f2144a);
                        break;
                    case 3:
                        if (typedArray.peekValue(index).type == 3) {
                            hVar.f2190h = typedArray.getString(index);
                        } else {
                            hVar.f2190h = v.c.f54896c[typedArray.getInteger(index, 0)];
                        }
                        break;
                    case 4:
                        hVar.f2203g = typedArray.getInteger(index, hVar.f2203g);
                        break;
                    case 5:
                        hVar.f2192j = typedArray.getInt(index, hVar.f2192j);
                        break;
                    case 6:
                        hVar.f2195m = typedArray.getFloat(index, hVar.f2195m);
                        break;
                    case 7:
                        hVar.f2196n = typedArray.getFloat(index, hVar.f2196n);
                        break;
                    case 8:
                        float f10 = typedArray.getFloat(index, hVar.f2194l);
                        hVar.f2193k = f10;
                        hVar.f2194l = f10;
                        break;
                    case 9:
                        hVar.f2199q = typedArray.getInt(index, hVar.f2199q);
                        break;
                    case 10:
                        hVar.f2191i = typedArray.getInt(index, hVar.f2191i);
                        break;
                    case 11:
                        hVar.f2193k = typedArray.getFloat(index, hVar.f2193k);
                        break;
                    case 12:
                        hVar.f2194l = typedArray.getFloat(index, hVar.f2194l);
                        break;
                    default:
                        Log.e("KeyPosition", "unused attribute 0x" + Integer.toHexString(index) + "   " + f2202a.get(index));
                        break;
                }
            }
            if (hVar.f2144a == -1) {
                Log.e("KeyPosition", "no frame position");
            }
        }
    }

    public h() {
        this.f2147d = 2;
    }

    @Override // androidx.constraintlayout.motion.widget.d
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public d clone() {
        return new h().c(this);
    }

    @Override // androidx.constraintlayout.motion.widget.d
    public d c(d dVar) {
        super.c(dVar);
        h hVar = (h) dVar;
        this.f2190h = hVar.f2190h;
        this.f2191i = hVar.f2191i;
        this.f2192j = hVar.f2192j;
        this.f2193k = hVar.f2193k;
        this.f2194l = Float.NaN;
        this.f2195m = hVar.f2195m;
        this.f2196n = hVar.f2196n;
        this.f2197o = hVar.f2197o;
        this.f2198p = hVar.f2198p;
        this.f2200r = hVar.f2200r;
        this.f2201s = hVar.f2201s;
        return this;
    }

    @Override // androidx.constraintlayout.motion.widget.d
    public void e(Context context, AttributeSet attributeSet) {
        a.b(this, context.obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.f.E6));
    }

    public void m(int i10) {
        this.f2199q = i10;
    }

    public void n(String str, Object obj) {
        str.getClass();
        switch (str) {
            case "transitionEasing":
                this.f2190h = obj.toString();
                break;
            case "percentWidth":
                this.f2193k = k(obj);
                break;
            case "percentHeight":
                this.f2194l = k(obj);
                break;
            case "drawPath":
                this.f2192j = l(obj);
                break;
            case "sizePercent":
                float fK = k(obj);
                this.f2193k = fK;
                this.f2194l = fK;
                break;
            case "percentX":
                this.f2195m = k(obj);
                break;
            case "percentY":
                this.f2196n = k(obj);
                break;
        }
    }

    @Override // androidx.constraintlayout.motion.widget.d
    public void a(HashMap map) {
    }
}
