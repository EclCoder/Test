package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
class q {
    private static final float[][] G = {new float[]{0.5f, 0.0f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}, new float[]{0.5f, 1.0f}, new float[]{0.5f, 0.5f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}};
    private static final float[][] H = {new float[]{0.0f, -1.0f}, new float[]{0.0f, 1.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}};

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f2377r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private float f2378s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final MotionLayout f2379t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f2360a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f2361b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f2362c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f2363d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f2364e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f2365f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f2366g = 0.5f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f2367h = 0.5f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    float f2368i = 0.5f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    float f2369j = 0.5f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f2370k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    boolean f2371l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f2372m = 0.0f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f2373n = 1.0f;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f2374o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private float[] f2375p = new float[2];

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int[] f2376q = new int[2];

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private float f2380u = 4.0f;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private float f2381v = 1.2f;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f2382w = true;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private float f2383x = 1.0f;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f2384y = 0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private float f2385z = 10.0f;
    private float A = 10.0f;
    private float B = 1.0f;
    private float C = Float.NaN;
    private float D = Float.NaN;
    private int E = 0;
    private int F = 0;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements View.OnTouchListener {
        a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return false;
        }
    }

    q(Context context, MotionLayout motionLayout, XmlPullParser xmlPullParser) {
        this.f2379t = motionLayout;
        c(context, Xml.asAttributeSet(xmlPullParser));
    }

    private void b(TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArray.getIndex(i10);
            if (index == androidx.constraintlayout.widget.f.f3088wa) {
                this.f2363d = typedArray.getResourceId(index, this.f2363d);
            } else if (index == androidx.constraintlayout.widget.f.f3101xa) {
                int i11 = typedArray.getInt(index, this.f2360a);
                this.f2360a = i11;
                float[] fArr = G[i11];
                this.f2367h = fArr[0];
                this.f2366g = fArr[1];
            } else if (index == androidx.constraintlayout.widget.f.f2893ha) {
                int i12 = typedArray.getInt(index, this.f2361b);
                this.f2361b = i12;
                float[][] fArr2 = H;
                if (i12 < fArr2.length) {
                    float[] fArr3 = fArr2[i12];
                    this.f2372m = fArr3[0];
                    this.f2373n = fArr3[1];
                } else {
                    this.f2373n = Float.NaN;
                    this.f2372m = Float.NaN;
                    this.f2371l = true;
                }
            } else if (index == androidx.constraintlayout.widget.f.f2958ma) {
                this.f2380u = typedArray.getFloat(index, this.f2380u);
            } else if (index == androidx.constraintlayout.widget.f.f2945la) {
                this.f2381v = typedArray.getFloat(index, this.f2381v);
            } else if (index == androidx.constraintlayout.widget.f.f2971na) {
                this.f2382w = typedArray.getBoolean(index, this.f2382w);
            } else if (index == androidx.constraintlayout.widget.f.f2906ia) {
                this.f2383x = typedArray.getFloat(index, this.f2383x);
            } else if (index == androidx.constraintlayout.widget.f.f2919ja) {
                this.f2385z = typedArray.getFloat(index, this.f2385z);
            } else if (index == androidx.constraintlayout.widget.f.f3114ya) {
                this.f2364e = typedArray.getResourceId(index, this.f2364e);
            } else if (index == androidx.constraintlayout.widget.f.f2997pa) {
                this.f2362c = typedArray.getInt(index, this.f2362c);
            } else if (index == androidx.constraintlayout.widget.f.f2984oa) {
                this.f2384y = typedArray.getInteger(index, 0);
            } else if (index == androidx.constraintlayout.widget.f.f2932ka) {
                this.f2365f = typedArray.getResourceId(index, 0);
            } else if (index == androidx.constraintlayout.widget.f.f3010qa) {
                this.f2370k = typedArray.getResourceId(index, this.f2370k);
            } else if (index == androidx.constraintlayout.widget.f.f3036sa) {
                this.A = typedArray.getFloat(index, this.A);
            } else if (index == androidx.constraintlayout.widget.f.f3049ta) {
                this.B = typedArray.getFloat(index, this.B);
            } else if (index == androidx.constraintlayout.widget.f.f3062ua) {
                this.C = typedArray.getFloat(index, this.C);
            } else if (index == androidx.constraintlayout.widget.f.f3075va) {
                this.D = typedArray.getFloat(index, this.D);
            } else if (index == androidx.constraintlayout.widget.f.f3023ra) {
                this.E = typedArray.getInt(index, this.E);
            } else if (index == androidx.constraintlayout.widget.f.f2880ga) {
                this.F = typedArray.getInt(index, this.F);
            }
        }
    }

    private void c(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.f.f2867fa);
        b(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
    }

    void A() {
        View viewFindViewById;
        int i10 = this.f2363d;
        if (i10 != -1) {
            viewFindViewById = this.f2379t.findViewById(i10);
            if (viewFindViewById == null) {
                Log.e("TouchResponse", "cannot find TouchAnchorId @id/" + androidx.constraintlayout.motion.widget.a.c(this.f2379t.getContext(), this.f2363d));
            }
        } else {
            viewFindViewById = null;
        }
        if (viewFindViewById instanceof NestedScrollView) {
            NestedScrollView nestedScrollView = (NestedScrollView) viewFindViewById;
            nestedScrollView.setOnTouchListener(new a());
            nestedScrollView.setOnScrollChangeListener(new b());
        }
    }

    float a(float f10, float f11) {
        return (f10 * this.f2372m) + (f11 * this.f2373n);
    }

    public int d() {
        return this.F;
    }

    public int e() {
        return this.f2384y;
    }

    RectF f(ViewGroup viewGroup, RectF rectF) {
        View viewFindViewById;
        int i10 = this.f2365f;
        if (i10 == -1 || (viewFindViewById = viewGroup.findViewById(i10)) == null) {
            return null;
        }
        rectF.set(viewFindViewById.getLeft(), viewFindViewById.getTop(), viewFindViewById.getRight(), viewFindViewById.getBottom());
        return rectF;
    }

    float g() {
        return this.f2381v;
    }

    public float h() {
        return this.f2380u;
    }

    boolean i() {
        return this.f2382w;
    }

    float j(float f10, float f11) {
        this.f2379t.o0(this.f2363d, this.f2379t.getProgress(), this.f2367h, this.f2366g, this.f2375p);
        float f12 = this.f2372m;
        if (f12 != 0.0f) {
            float[] fArr = this.f2375p;
            if (fArr[0] == 0.0f) {
                fArr[0] = 1.0E-7f;
            }
            return (f10 * f12) / fArr[0];
        }
        float[] fArr2 = this.f2375p;
        if (fArr2[1] == 0.0f) {
            fArr2[1] = 1.0E-7f;
        }
        return (f11 * this.f2373n) / fArr2[1];
    }

    public int k() {
        return this.E;
    }

    public float l() {
        return this.A;
    }

    public float m() {
        return this.B;
    }

    public float n() {
        return this.C;
    }

    public float o() {
        return this.D;
    }

    RectF p(ViewGroup viewGroup, RectF rectF) {
        View viewFindViewById;
        int i10 = this.f2364e;
        if (i10 == -1 || (viewFindViewById = viewGroup.findViewById(i10)) == null) {
            return null;
        }
        rectF.set(viewFindViewById.getLeft(), viewFindViewById.getTop(), viewFindViewById.getRight(), viewFindViewById.getBottom());
        return rectF;
    }

    int q() {
        return this.f2364e;
    }

    boolean r() {
        return this.f2374o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    void s(MotionEvent motionEvent, MotionLayout.f fVar, int i10, p pVar) {
        char c10;
        int i11;
        char c11;
        float f10;
        char c12;
        if (this.f2371l) {
            t(motionEvent, fVar, i10, pVar);
            return;
        }
        fVar.b(motionEvent);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f2377r = motionEvent.getRawX();
            this.f2378s = motionEvent.getRawY();
            this.f2374o = false;
            return;
        }
        if (action == 1) {
            this.f2374o = false;
            fVar.e(1000);
            float fD = fVar.d();
            float fC = fVar.c();
            float progress = this.f2379t.getProgress();
            int i12 = this.f2363d;
            if (i12 != -1) {
                this.f2379t.o0(i12, progress, this.f2367h, this.f2366g, this.f2375p);
                c10 = 0;
            } else {
                float fMin = Math.min(this.f2379t.getWidth(), this.f2379t.getHeight());
                float[] fArr = this.f2375p;
                fArr[1] = this.f2373n * fMin;
                c10 = 0;
                fArr[0] = fMin * this.f2372m;
            }
            float f11 = this.f2372m;
            float[] fArr2 = this.f2375p;
            float fAbs = f11 != 0.0f ? fD / fArr2[c10] : fC / fArr2[1];
            float f12 = !Float.isNaN(fAbs) ? (fAbs / 3.0f) + progress : progress;
            if (f12 == 0.0f || f12 == 1.0f || (i11 = this.f2362c) == 3) {
                if (0.0f >= f12 || 1.0f <= f12) {
                    this.f2379t.setState(MotionLayout.j.FINISHED);
                    return;
                }
                return;
            }
            float f13 = ((double) f12) < 0.5d ? 0.0f : 1.0f;
            if (i11 == 6) {
                if (progress + fAbs < 0.0f) {
                    fAbs = Math.abs(fAbs);
                }
                f13 = 1.0f;
            }
            if (this.f2362c == 7) {
                if (progress + fAbs > 1.0f) {
                    fAbs = -Math.abs(fAbs);
                }
                f13 = 0.0f;
            }
            this.f2379t.F0(this.f2362c, f13, fAbs);
            if (0.0f >= progress || 1.0f <= progress) {
                this.f2379t.setState(MotionLayout.j.FINISHED);
                return;
            }
            return;
        }
        if (action != 2) {
            return;
        }
        float rawY = motionEvent.getRawY() - this.f2378s;
        float rawX = motionEvent.getRawX() - this.f2377r;
        if (Math.abs((this.f2372m * rawX) + (this.f2373n * rawY)) > this.f2385z || this.f2374o) {
            float progress2 = this.f2379t.getProgress();
            if (!this.f2374o) {
                this.f2374o = true;
                this.f2379t.setProgress(progress2);
            }
            int i13 = this.f2363d;
            if (i13 != -1) {
                c11 = 1;
                c12 = 0;
                f10 = progress2;
                this.f2379t.o0(i13, f10, this.f2367h, this.f2366g, this.f2375p);
            } else {
                c11 = 1;
                f10 = progress2;
                c12 = 0;
                float fMin2 = Math.min(this.f2379t.getWidth(), this.f2379t.getHeight());
                float[] fArr3 = this.f2375p;
                fArr3[1] = this.f2373n * fMin2;
                fArr3[0] = fMin2 * this.f2372m;
            }
            float f14 = this.f2372m;
            float[] fArr4 = this.f2375p;
            if (Math.abs(((f14 * fArr4[c12]) + (this.f2373n * fArr4[c11])) * this.f2383x) < 0.01d) {
                float[] fArr5 = this.f2375p;
                fArr5[c12] = 0.01f;
                fArr5[c11] = 0.01f;
            }
            float fMax = Math.max(Math.min(f10 + (this.f2372m != 0.0f ? rawX / this.f2375p[c12] : rawY / this.f2375p[c11]), 1.0f), 0.0f);
            if (this.f2362c == 6) {
                fMax = Math.max(fMax, 0.01f);
            }
            if (this.f2362c == 7) {
                fMax = Math.min(fMax, 0.99f);
            }
            float progress3 = this.f2379t.getProgress();
            if (fMax != progress3) {
                if (progress3 == 0.0f || progress3 == 1.0f) {
                    this.f2379t.h0(progress3 == 0.0f ? c11 : c12);
                }
                this.f2379t.setProgress(fMax);
                fVar.e(1000);
                this.f2379t.C = this.f2372m != 0.0f ? fVar.d() / this.f2375p[c12] : fVar.c() / this.f2375p[c11];
            } else {
                this.f2379t.C = 0.0f;
            }
            this.f2377r = motionEvent.getRawX();
            this.f2378s = motionEvent.getRawY();
        }
    }

    /* JADX WARN: Code duplicated, block: B:59:0x0276  */
    /* JADX WARN: Code duplicated, block: B:60:0x0290  */
    /* JADX WARN: Code duplicated, block: B:63:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:65:0x02bb  */
    void t(MotionEvent motionEvent, MotionLayout.f fVar, int i10, p pVar) {
        float left;
        float f10;
        int top;
        int bottom;
        int i11;
        float degrees;
        float f11;
        int i12;
        float f12;
        fVar.b(motionEvent);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f2377r = motionEvent.getRawX();
            this.f2378s = motionEvent.getRawY();
            this.f2374o = false;
            return;
        }
        if (action != 1) {
            if (action != 2) {
                return;
            }
            motionEvent.getRawY();
            motionEvent.getRawX();
            float width = this.f2379t.getWidth() / 2.0f;
            float height = this.f2379t.getHeight() / 2.0f;
            int i13 = this.f2370k;
            if (i13 != -1) {
                View viewFindViewById = this.f2379t.findViewById(i13);
                this.f2379t.getLocationOnScreen(this.f2376q);
                float left2 = this.f2376q[0] + ((viewFindViewById.getLeft() + viewFindViewById.getRight()) / 2.0f);
                height = ((viewFindViewById.getTop() + viewFindViewById.getBottom()) / 2.0f) + this.f2376q[1];
                width = left2;
            } else {
                int i14 = this.f2363d;
                if (i14 != -1) {
                    View viewFindViewById2 = this.f2379t.findViewById(this.f2379t.q0(i14).h());
                    if (viewFindViewById2 == null) {
                        Log.e("TouchResponse", "could not find view to animate to");
                    } else {
                        this.f2379t.getLocationOnScreen(this.f2376q);
                        width = this.f2376q[0] + ((viewFindViewById2.getLeft() + viewFindViewById2.getRight()) / 2.0f);
                        height = this.f2376q[1] + ((viewFindViewById2.getTop() + viewFindViewById2.getBottom()) / 2.0f);
                    }
                }
            }
            float rawX = motionEvent.getRawX() - width;
            float rawY = motionEvent.getRawY() - height;
            double dAtan2 = Math.atan2(motionEvent.getRawY() - height, motionEvent.getRawX() - width);
            float fAtan2 = (float) (((dAtan2 - Math.atan2(this.f2378s - height, this.f2377r - width)) * 180.0d) / 3.141592653589793d);
            if (fAtan2 > 330.0f) {
                fAtan2 -= 360.0f;
            } else if (fAtan2 < -330.0f) {
                fAtan2 += 360.0f;
            }
            if (Math.abs(fAtan2) > 0.01d || this.f2374o) {
                float progress = this.f2379t.getProgress();
                if (!this.f2374o) {
                    this.f2374o = true;
                    this.f2379t.setProgress(progress);
                }
                int i15 = this.f2363d;
                if (i15 != -1) {
                    f12 = progress;
                    this.f2379t.o0(i15, f12, this.f2367h, this.f2366g, this.f2375p);
                    float[] fArr = this.f2375p;
                    fArr[1] = (float) Math.toDegrees(fArr[1]);
                } else {
                    f12 = progress;
                    this.f2375p[1] = 360.0f;
                }
                float fMax = Math.max(Math.min(f12 + ((fAtan2 * this.f2383x) / this.f2375p[1]), 1.0f), 0.0f);
                float progress2 = this.f2379t.getProgress();
                if (fMax != progress2) {
                    if (progress2 == 0.0f || progress2 == 1.0f) {
                        this.f2379t.h0(progress2 == 0.0f);
                    }
                    this.f2379t.setProgress(fMax);
                    fVar.e(1000);
                    float fD = fVar.d();
                    double dC = fVar.c();
                    double d10 = fD;
                    this.f2379t.C = (float) Math.toDegrees((float) ((Math.hypot(dC, d10) * Math.sin(Math.atan2(dC, d10) - dAtan2)) / Math.hypot(rawX, rawY)));
                } else {
                    this.f2379t.C = 0.0f;
                }
                this.f2377r = motionEvent.getRawX();
                this.f2378s = motionEvent.getRawY();
                return;
            }
            return;
        }
        this.f2374o = false;
        fVar.e(16);
        float fD2 = fVar.d();
        float fC = fVar.c();
        float progress3 = this.f2379t.getProgress();
        float width2 = this.f2379t.getWidth() / 2.0f;
        float height2 = this.f2379t.getHeight() / 2.0f;
        int i16 = this.f2370k;
        if (i16 == -1) {
            int i17 = this.f2363d;
            if (i17 != -1) {
                View viewFindViewById3 = this.f2379t.findViewById(this.f2379t.q0(i17).h());
                this.f2379t.getLocationOnScreen(this.f2376q);
                left = this.f2376q[0] + ((viewFindViewById3.getLeft() + viewFindViewById3.getRight()) / 2.0f);
                f10 = this.f2376q[1];
                top = viewFindViewById3.getTop();
                bottom = viewFindViewById3.getBottom();
            }
            float rawX2 = motionEvent.getRawX() - width2;
            float rawY2 = motionEvent.getRawY() - height2;
            double degrees2 = Math.toDegrees(Math.atan2(rawY2, rawX2));
            i11 = this.f2363d;
            if (i11 != -1) {
                this.f2379t.o0(i11, progress3, this.f2367h, this.f2366g, this.f2375p);
                float[] fArr2 = this.f2375p;
                fArr2[1] = (float) Math.toDegrees(fArr2[1]);
            } else {
                this.f2375p[1] = 360.0f;
            }
            degrees = ((float) (Math.toDegrees(Math.atan2(fC + rawY2, fD2 + rawX2)) - degrees2)) * 62.5f;
            if (Float.isNaN(degrees)) {
                f11 = progress3;
            } else {
                f11 = (((degrees * 3.0f) * this.f2383x) / this.f2375p[1]) + progress3;
            }
            if (f11 != 0.0f || f11 == 1.0f || (i12 = this.f2362c) == 3) {
                if (0.0f < f11 || 1.0f <= f11) {
                    this.f2379t.setState(MotionLayout.j.FINISHED);
                }
                return;
            }
            float fAbs = (degrees * this.f2383x) / this.f2375p[1];
            float f13 = ((double) f11) < 0.5d ? 0.0f : 1.0f;
            if (i12 == 6) {
                if (progress3 + fAbs < 0.0f) {
                    fAbs = Math.abs(fAbs);
                }
                f13 = 1.0f;
            }
            if (this.f2362c == 7) {
                if (progress3 + fAbs > 1.0f) {
                    fAbs = -Math.abs(fAbs);
                }
                f13 = 0.0f;
            }
            this.f2379t.F0(this.f2362c, f13, fAbs * 3.0f);
            if (0.0f >= progress3 || 1.0f <= progress3) {
                this.f2379t.setState(MotionLayout.j.FINISHED);
                return;
            }
            return;
        }
        View viewFindViewById4 = this.f2379t.findViewById(i16);
        this.f2379t.getLocationOnScreen(this.f2376q);
        left = this.f2376q[0] + ((viewFindViewById4.getLeft() + viewFindViewById4.getRight()) / 2.0f);
        f10 = this.f2376q[1];
        top = viewFindViewById4.getTop();
        bottom = viewFindViewById4.getBottom();
        float f14 = left;
        height2 = ((top + bottom) / 2.0f) + f10;
        width2 = f14;
        float rawX3 = motionEvent.getRawX() - width2;
        float rawY3 = motionEvent.getRawY() - height2;
        double degrees3 = Math.toDegrees(Math.atan2(rawY3, rawX3));
        i11 = this.f2363d;
        if (i11 != -1) {
            this.f2379t.o0(i11, progress3, this.f2367h, this.f2366g, this.f2375p);
            float[] fArr3 = this.f2375p;
            fArr3[1] = (float) Math.toDegrees(fArr3[1]);
        } else {
            this.f2375p[1] = 360.0f;
        }
        degrees = ((float) (Math.toDegrees(Math.atan2(fC + rawY3, fD2 + rawX3)) - degrees3)) * 62.5f;
        if (Float.isNaN(degrees)) {
            f11 = (((degrees * 3.0f) * this.f2383x) / this.f2375p[1]) + progress3;
        } else {
            f11 = progress3;
        }
        if (f11 != 0.0f) {
        }
        if (0.0f < f11) {
        }
        this.f2379t.setState(MotionLayout.j.FINISHED);
    }

    public String toString() {
        if (Float.isNaN(this.f2372m)) {
            return "rotation";
        }
        return this.f2372m + " , " + this.f2373n;
    }

    void u(float f10, float f11) {
        float progress = this.f2379t.getProgress();
        if (!this.f2374o) {
            this.f2374o = true;
            this.f2379t.setProgress(progress);
        }
        this.f2379t.o0(this.f2363d, progress, this.f2367h, this.f2366g, this.f2375p);
        float f12 = this.f2372m;
        float[] fArr = this.f2375p;
        if (Math.abs((f12 * fArr[0]) + (this.f2373n * fArr[1])) < 0.01d) {
            float[] fArr2 = this.f2375p;
            fArr2[0] = 0.01f;
            fArr2[1] = 0.01f;
        }
        float f13 = this.f2372m;
        float fMax = Math.max(Math.min(progress + (f13 != 0.0f ? (f10 * f13) / this.f2375p[0] : (f11 * this.f2373n) / this.f2375p[1]), 1.0f), 0.0f);
        if (fMax != this.f2379t.getProgress()) {
            this.f2379t.setProgress(fMax);
        }
    }

    void v(float f10, float f11) {
        int i10;
        this.f2374o = false;
        float progress = this.f2379t.getProgress();
        this.f2379t.o0(this.f2363d, progress, this.f2367h, this.f2366g, this.f2375p);
        float f12 = this.f2372m;
        float[] fArr = this.f2375p;
        float f13 = f12 != 0.0f ? (f10 * f12) / fArr[0] : (f11 * this.f2373n) / fArr[1];
        if (!Float.isNaN(f13)) {
            progress += f13 / 3.0f;
        }
        if (progress == 0.0f || progress == 1.0f || (i10 = this.f2362c) == 3) {
            return;
        }
        this.f2379t.F0(i10, ((double) progress) >= 0.5d ? 1.0f : 0.0f, f13);
    }

    void w(float f10, float f11) {
        this.f2377r = f10;
        this.f2378s = f11;
    }

    public void x(boolean z10) {
        if (z10) {
            float[][] fArr = H;
            fArr[4] = fArr[3];
            fArr[5] = fArr[2];
            float[][] fArr2 = G;
            fArr2[5] = fArr2[2];
            fArr2[6] = fArr2[1];
        } else {
            float[][] fArr3 = H;
            fArr3[4] = fArr3[2];
            fArr3[5] = fArr3[3];
            float[][] fArr4 = G;
            fArr4[5] = fArr4[1];
            fArr4[6] = fArr4[2];
        }
        float[] fArr5 = G[this.f2360a];
        this.f2367h = fArr5[0];
        this.f2366g = fArr5[1];
        int i10 = this.f2361b;
        float[][] fArr6 = H;
        if (i10 >= fArr6.length) {
            return;
        }
        float[] fArr7 = fArr6[i10];
        this.f2372m = fArr7[0];
        this.f2373n = fArr7[1];
    }

    public void y(int i10) {
        this.f2362c = i10;
    }

    void z(float f10, float f11) {
        this.f2377r = f10;
        this.f2378s = f11;
        this.f2374o = false;
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b implements NestedScrollView.d {
        b() {
        }

        @Override // androidx.core.widget.NestedScrollView.d
        public void a(NestedScrollView nestedScrollView, int i10, int i11, int i12, int i13) {
        }
    }
}
