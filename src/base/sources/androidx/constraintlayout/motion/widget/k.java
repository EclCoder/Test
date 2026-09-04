package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class k extends d {
    private boolean A;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    float f2223g = 0.1f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f2224h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    int f2225i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    int f2226j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    RectF f2227k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    RectF f2228l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    HashMap f2229m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f2230n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f2231o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f2232p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f2233q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f2234r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f2235s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f2236t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private View f2237u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f2238v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f2239w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f2240x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private float f2241y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private float f2242z;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static SparseIntArray f2243a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f2243a = sparseIntArray;
            sparseIntArray.append(androidx.constraintlayout.widget.f.f2955m7, 8);
            f2243a.append(androidx.constraintlayout.widget.f.f3007q7, 4);
            f2243a.append(androidx.constraintlayout.widget.f.f3020r7, 1);
            f2243a.append(androidx.constraintlayout.widget.f.f3033s7, 2);
            f2243a.append(androidx.constraintlayout.widget.f.f2968n7, 7);
            f2243a.append(androidx.constraintlayout.widget.f.f3046t7, 6);
            f2243a.append(androidx.constraintlayout.widget.f.f3072v7, 5);
            f2243a.append(androidx.constraintlayout.widget.f.f2994p7, 9);
            f2243a.append(androidx.constraintlayout.widget.f.f2981o7, 10);
            f2243a.append(androidx.constraintlayout.widget.f.f3059u7, 11);
            f2243a.append(androidx.constraintlayout.widget.f.f3085w7, 12);
            f2243a.append(androidx.constraintlayout.widget.f.f3098x7, 13);
            f2243a.append(androidx.constraintlayout.widget.f.f3111y7, 14);
        }

        public static void a(k kVar, TypedArray typedArray, Context context) {
            int indexCount = typedArray.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArray.getIndex(i10);
                switch (f2243a.get(index)) {
                    case 1:
                        kVar.f2233q = typedArray.getString(index);
                        break;
                    case 2:
                        kVar.f2234r = typedArray.getString(index);
                        break;
                    case 3:
                    default:
                        Log.e("KeyTrigger", "unused attribute 0x" + Integer.toHexString(index) + "   " + f2243a.get(index));
                        break;
                    case 4:
                        kVar.f2231o = typedArray.getString(index);
                        break;
                    case 5:
                        kVar.f2223g = typedArray.getFloat(index, kVar.f2223g);
                        break;
                    case 6:
                        kVar.f2235s = typedArray.getResourceId(index, kVar.f2235s);
                        break;
                    case 7:
                        if (MotionLayout.f2054d1) {
                            int resourceId = typedArray.getResourceId(index, kVar.f2145b);
                            kVar.f2145b = resourceId;
                            if (resourceId == -1) {
                                kVar.f2146c = typedArray.getString(index);
                            }
                        } else if (typedArray.peekValue(index).type == 3) {
                            kVar.f2146c = typedArray.getString(index);
                        } else {
                            kVar.f2145b = typedArray.getResourceId(index, kVar.f2145b);
                        }
                        break;
                    case 8:
                        int integer = typedArray.getInteger(index, kVar.f2144a);
                        kVar.f2144a = integer;
                        kVar.f2241y = (integer + 0.5f) / 100.0f;
                        break;
                    case 9:
                        kVar.f2236t = typedArray.getResourceId(index, kVar.f2236t);
                        break;
                    case 10:
                        kVar.A = typedArray.getBoolean(index, kVar.A);
                        break;
                    case 11:
                        kVar.f2232p = typedArray.getResourceId(index, kVar.f2232p);
                        break;
                    case 12:
                        kVar.f2226j = typedArray.getResourceId(index, kVar.f2226j);
                        break;
                    case 13:
                        kVar.f2224h = typedArray.getResourceId(index, kVar.f2224h);
                        break;
                    case 14:
                        kVar.f2225i = typedArray.getResourceId(index, kVar.f2225i);
                        break;
                }
            }
        }
    }

    public k() {
        int i10 = d.f2143f;
        this.f2224h = i10;
        this.f2225i = i10;
        this.f2226j = i10;
        this.f2227k = new RectF();
        this.f2228l = new RectF();
        this.f2229m = new HashMap();
        this.f2230n = -1;
        this.f2231o = null;
        int i11 = d.f2143f;
        this.f2232p = i11;
        this.f2233q = null;
        this.f2234r = null;
        this.f2235s = i11;
        this.f2236t = i11;
        this.f2237u = null;
        this.f2238v = true;
        this.f2239w = true;
        this.f2240x = true;
        this.f2241y = Float.NaN;
        this.A = false;
        this.f2147d = 5;
        this.f2148e = new HashMap();
    }

    private void A(String str, View view) {
        boolean z10 = str.length() == 1;
        if (!z10) {
            str = str.substring(1).toLowerCase(Locale.ROOT);
        }
        for (String str2 : this.f2148e.keySet()) {
            String lowerCase = str2.toLowerCase(Locale.ROOT);
            if (z10 || lowerCase.matches(str)) {
                androidx.constraintlayout.widget.a aVar = (androidx.constraintlayout.widget.a) this.f2148e.get(str2);
                if (aVar != null) {
                    aVar.a(view);
                }
            }
        }
    }

    private void B(RectF rectF, View view, boolean z10) {
        rectF.top = view.getTop();
        rectF.bottom = view.getBottom();
        rectF.left = view.getLeft();
        rectF.right = view.getRight();
        if (z10) {
            view.getMatrix().mapRect(rectF);
        }
    }

    private void z(String str, View view) {
        Method method;
        if (str == null) {
            return;
        }
        if (str.startsWith(".")) {
            A(str, view);
            return;
        }
        if (this.f2229m.containsKey(str)) {
            method = (Method) this.f2229m.get(str);
            if (method == null) {
                return;
            }
        } else {
            method = null;
        }
        if (method == null) {
            try {
                method = view.getClass().getMethod(str, null);
                this.f2229m.put(str, method);
            } catch (NoSuchMethodException unused) {
                this.f2229m.put(str, null);
                Log.e("KeyTrigger", "Could not find method \"" + str + "\"on class " + view.getClass().getSimpleName() + " " + androidx.constraintlayout.motion.widget.a.d(view));
                return;
            }
        }
        try {
            method.invoke(view, null);
        } catch (Exception unused2) {
            Log.e("KeyTrigger", "Exception in call \"" + this.f2231o + "\"on class " + view.getClass().getSimpleName() + " " + androidx.constraintlayout.motion.widget.a.d(view));
        }
    }

    @Override // androidx.constraintlayout.motion.widget.d
    /* JADX INFO: renamed from: b */
    public d clone() {
        return new k().c(this);
    }

    @Override // androidx.constraintlayout.motion.widget.d
    public d c(d dVar) {
        super.c(dVar);
        k kVar = (k) dVar;
        this.f2230n = kVar.f2230n;
        this.f2231o = kVar.f2231o;
        this.f2232p = kVar.f2232p;
        this.f2233q = kVar.f2233q;
        this.f2234r = kVar.f2234r;
        this.f2235s = kVar.f2235s;
        this.f2236t = kVar.f2236t;
        this.f2237u = kVar.f2237u;
        this.f2223g = kVar.f2223g;
        this.f2238v = kVar.f2238v;
        this.f2239w = kVar.f2239w;
        this.f2240x = kVar.f2240x;
        this.f2241y = kVar.f2241y;
        this.f2242z = kVar.f2242z;
        this.A = kVar.A;
        this.f2227k = kVar.f2227k;
        this.f2228l = kVar.f2228l;
        this.f2229m = kVar.f2229m;
        return this;
    }

    @Override // androidx.constraintlayout.motion.widget.d
    public void e(Context context, AttributeSet attributeSet) {
        a.a(this, context.obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.f.f2942l7), context);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x008d  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:45:0x00af  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:57:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:59:0x00db  */
    public void y(float f10, View view) {
        boolean z10;
        boolean z11;
        boolean z12;
        float f11;
        float f12;
        float f13;
        float f14;
        boolean z13;
        boolean z14 = true;
        boolean z15 = false;
        if (this.f2236t != d.f2143f) {
            if (this.f2237u == null) {
                this.f2237u = ((ViewGroup) view.getParent()).findViewById(this.f2236t);
            }
            B(this.f2227k, this.f2237u, this.A);
            B(this.f2228l, view, this.A);
            if (this.f2227k.intersect(this.f2228l)) {
                if (this.f2238v) {
                    this.f2238v = false;
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (this.f2240x) {
                    this.f2240x = false;
                    z12 = true;
                } else {
                    z12 = false;
                }
                this.f2239w = true;
            } else {
                if (this.f2238v) {
                    z10 = false;
                } else {
                    this.f2238v = true;
                    z10 = true;
                }
                if (this.f2239w) {
                    this.f2239w = false;
                    z13 = true;
                } else {
                    z13 = false;
                }
                this.f2240x = true;
                z15 = z13;
                z12 = false;
            }
        } else {
            if (this.f2238v) {
                float f15 = this.f2241y;
                if ((f10 - f15) * (this.f2242z - f15) < 0.0f) {
                    this.f2238v = false;
                    z10 = true;
                }
                if (this.f2239w) {
                    f13 = this.f2241y;
                    f14 = f10 - f13;
                    if ((this.f2242z - f13) * f14 >= 0.0f && f14 < 0.0f) {
                        this.f2239w = false;
                        z11 = true;
                    }
                    if (this.f2240x) {
                        f11 = this.f2241y;
                        f12 = f10 - f11;
                        if ((this.f2242z - f11) * f12 < 0.0f || f12 <= 0.0f) {
                            z14 = false;
                        } else {
                            this.f2240x = false;
                        }
                        z12 = z14;
                    } else {
                        if (Math.abs(f10 - this.f2241y) > this.f2223g) {
                            this.f2240x = true;
                        }
                        z12 = false;
                    }
                    z15 = z11;
                } else if (Math.abs(f10 - this.f2241y) > this.f2223g) {
                    this.f2239w = true;
                }
                z11 = false;
                if (this.f2240x) {
                    f11 = this.f2241y;
                    f12 = f10 - f11;
                    if ((this.f2242z - f11) * f12 < 0.0f) {
                        z14 = false;
                    } else {
                        z14 = false;
                    }
                    z12 = z14;
                } else {
                    if (Math.abs(f10 - this.f2241y) > this.f2223g) {
                        this.f2240x = true;
                    }
                    z12 = false;
                }
                z15 = z11;
            } else if (Math.abs(f10 - this.f2241y) > this.f2223g) {
                this.f2238v = true;
            }
            z10 = false;
            if (this.f2239w) {
                f13 = this.f2241y;
                f14 = f10 - f13;
                if ((this.f2242z - f13) * f14 >= 0.0f) {
                }
                if (this.f2240x) {
                    f11 = this.f2241y;
                    f12 = f10 - f11;
                    if ((this.f2242z - f11) * f12 < 0.0f) {
                        z14 = false;
                    } else {
                        z14 = false;
                    }
                    z12 = z14;
                } else {
                    if (Math.abs(f10 - this.f2241y) > this.f2223g) {
                        this.f2240x = true;
                    }
                    z12 = false;
                }
                z15 = z11;
            } else if (Math.abs(f10 - this.f2241y) > this.f2223g) {
                this.f2239w = true;
            }
            z11 = false;
            if (this.f2240x) {
                f11 = this.f2241y;
                f12 = f10 - f11;
                if ((this.f2242z - f11) * f12 < 0.0f) {
                    z14 = false;
                } else {
                    z14 = false;
                }
                z12 = z14;
            } else {
                if (Math.abs(f10 - this.f2241y) > this.f2223g) {
                    this.f2240x = true;
                }
                z12 = false;
            }
            z15 = z11;
        }
        this.f2242z = f10;
        if (z15 || z10 || z12) {
            ((MotionLayout) view.getParent()).n0(this.f2235s, z12, f10);
        }
        View viewFindViewById = this.f2232p == d.f2143f ? view : ((MotionLayout) view.getParent()).findViewById(this.f2232p);
        if (z15) {
            String str = this.f2233q;
            if (str != null) {
                z(str, viewFindViewById);
            }
            if (this.f2224h != d.f2143f) {
                ((MotionLayout) view.getParent()).O0(this.f2224h, viewFindViewById);
            }
        }
        if (z12) {
            String str2 = this.f2234r;
            if (str2 != null) {
                z(str2, viewFindViewById);
            }
            if (this.f2225i != d.f2143f) {
                ((MotionLayout) view.getParent()).O0(this.f2225i, viewFindViewById);
            }
        }
        if (z10) {
            String str3 = this.f2231o;
            if (str3 != null) {
                z(str3, viewFindViewById);
            }
            if (this.f2226j != d.f2143f) {
                ((MotionLayout) view.getParent()).O0(this.f2226j, viewFindViewById);
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.d
    public void a(HashMap map) {
    }

    @Override // androidx.constraintlayout.motion.widget.d
    public void d(HashSet hashSet) {
    }
}
