package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import x.k;
import x.m;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static g f2548y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    SparseArray f2549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ArrayList f2550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected x.f f2551c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f2552d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f2553e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f2554f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f2555g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected boolean f2556h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f2557i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private androidx.constraintlayout.widget.c f2558j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected androidx.constraintlayout.widget.b f2559k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f2560l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private HashMap f2561m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f2562n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f2563o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    int f2564p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    int f2565q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    int f2566r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    int f2567s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private SparseArray f2568t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    c f2569u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f2570v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f2571w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private ArrayList f2572x;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f2573a;

        static {
            int[] iArr = new int[x.e.b.values().length];
            f2573a = iArr;
            try {
                iArr[x.e.b.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2573a[x.e.b.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2573a[x.e.b.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2573a[x.e.b.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class c implements y.b.InterfaceC0875b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        ConstraintLayout f2624a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f2625b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f2626c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f2627d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f2628e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f2629f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f2630g;

        c(ConstraintLayout constraintLayout) {
            this.f2624a = constraintLayout;
        }

        private boolean d(int i10, int i11, int i12) {
            if (i10 == i11) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(i10);
            int mode2 = View.MeasureSpec.getMode(i11);
            int size = View.MeasureSpec.getSize(i11);
            if (mode2 == 1073741824) {
                return (mode == Integer.MIN_VALUE || mode == 0) && i12 == size;
            }
            return false;
        }

        @Override // y.b.InterfaceC0875b
        public final void a() {
            int childCount = this.f2624a.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = this.f2624a.getChildAt(i10);
                if (childAt instanceof Placeholder) {
                    ((Placeholder) childAt).b(this.f2624a);
                }
            }
            int size = this.f2624a.f2550b.size();
            if (size > 0) {
                for (int i11 = 0; i11 < size; i11++) {
                    ((ConstraintHelper) this.f2624a.f2550b.get(i11)).s(this.f2624a);
                }
            }
        }

        @Override // y.b.InterfaceC0875b
        public final void b(x.e eVar, y.b.a aVar) {
            int iMakeMeasureSpec;
            int iMakeMeasureSpec2;
            int baseline;
            int iMax;
            int iMax2;
            int i10;
            if (eVar == null) {
                return;
            }
            if (eVar.X() == 8 && !eVar.l0()) {
                aVar.f57055e = 0;
                aVar.f57056f = 0;
                aVar.f57057g = 0;
                return;
            }
            if (eVar.M() == null) {
                return;
            }
            ConstraintLayout.b(ConstraintLayout.this);
            x.e.b bVar = aVar.f57051a;
            x.e.b bVar2 = aVar.f57052b;
            int i11 = aVar.f57053c;
            int i12 = aVar.f57054d;
            int i13 = this.f2625b + this.f2626c;
            int i14 = this.f2627d;
            View view = (View) eVar.u();
            int[] iArr = a.f2573a;
            int i15 = iArr[bVar.ordinal()];
            if (i15 == 1) {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
            } else if (i15 == 2) {
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f2629f, i14, -2);
            } else if (i15 == 3) {
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f2629f, i14 + eVar.D(), -1);
            } else if (i15 != 4) {
                iMakeMeasureSpec = 0;
            } else {
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f2629f, i14, -2);
                boolean z10 = eVar.f56475w == 1;
                int i16 = aVar.f57060j;
                if (i16 == y.b.a.f57049l || i16 == y.b.a.f57050m) {
                    boolean z11 = view.getMeasuredHeight() == eVar.z();
                    if (aVar.f57060j == y.b.a.f57050m || !z10 || ((z10 && z11) || (view instanceof Placeholder) || eVar.p0())) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(eVar.Y(), 1073741824);
                    }
                }
            }
            int i17 = iArr[bVar2.ordinal()];
            if (i17 == 1) {
                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
            } else if (i17 == 2) {
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f2630g, i13, -2);
            } else if (i17 == 3) {
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f2630g, i13 + eVar.W(), -1);
            } else if (i17 != 4) {
                iMakeMeasureSpec2 = 0;
            } else {
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f2630g, i13, -2);
                boolean z12 = eVar.f56477x == 1;
                int i18 = aVar.f57060j;
                if (i18 == y.b.a.f57049l || i18 == y.b.a.f57050m) {
                    boolean z13 = view.getMeasuredWidth() == eVar.Y();
                    if (aVar.f57060j == y.b.a.f57050m || !z12 || ((z12 && z13) || (view instanceof Placeholder) || eVar.q0())) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(eVar.z(), 1073741824);
                    }
                }
            }
            x.f fVar = (x.f) eVar.M();
            if (fVar != null && k.b(ConstraintLayout.this.f2557i, 256) && view.getMeasuredWidth() == eVar.Y() && view.getMeasuredWidth() < fVar.Y() && view.getMeasuredHeight() == eVar.z() && view.getMeasuredHeight() < fVar.z() && view.getBaseline() == eVar.r() && !eVar.o0() && d(eVar.E(), iMakeMeasureSpec, eVar.Y()) && d(eVar.F(), iMakeMeasureSpec2, eVar.z())) {
                aVar.f57055e = eVar.Y();
                aVar.f57056f = eVar.z();
                aVar.f57057g = eVar.r();
                return;
            }
            x.e.b bVar3 = x.e.b.MATCH_CONSTRAINT;
            boolean z14 = bVar == bVar3;
            boolean z15 = bVar2 == bVar3;
            x.e.b bVar4 = x.e.b.MATCH_PARENT;
            boolean z16 = bVar2 == bVar4 || bVar2 == x.e.b.FIXED;
            boolean z17 = bVar == bVar4 || bVar == x.e.b.FIXED;
            boolean z18 = z14 && eVar.f56442f0 > 0.0f;
            boolean z19 = z15 && eVar.f56442f0 > 0.0f;
            if (view == null) {
                return;
            }
            b bVar5 = (b) view.getLayoutParams();
            int i19 = aVar.f57060j;
            if (i19 != y.b.a.f57049l && i19 != y.b.a.f57050m && z14 && eVar.f56475w == 0 && z15 && eVar.f56477x == 0) {
                i10 = -1;
                iMax2 = 0;
                baseline = 0;
                iMax = 0;
            } else {
                if ((view instanceof VirtualLayout) && (eVar instanceof m)) {
                    ((VirtualLayout) view).x((m) eVar, iMakeMeasureSpec, iMakeMeasureSpec2);
                } else {
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                }
                eVar.a1(iMakeMeasureSpec, iMakeMeasureSpec2);
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                baseline = view.getBaseline();
                int i20 = eVar.f56481z;
                iMax = i20 > 0 ? Math.max(i20, measuredWidth) : measuredWidth;
                int i21 = eVar.A;
                if (i21 > 0) {
                    iMax = Math.min(i21, iMax);
                }
                int i22 = eVar.C;
                iMax2 = i22 > 0 ? Math.max(i22, measuredHeight) : measuredHeight;
                boolean z20 = z17;
                int i23 = eVar.D;
                if (i23 > 0) {
                    iMax2 = Math.min(i23, iMax2);
                }
                boolean z21 = z16;
                if (!k.b(ConstraintLayout.this.f2557i, 1)) {
                    if (z18 && z21) {
                        iMax = (int) ((iMax2 * eVar.f56442f0) + 0.5f);
                    } else if (z19 && z20) {
                        iMax2 = (int) ((iMax / eVar.f56442f0) + 0.5f);
                    }
                }
                if (measuredWidth != iMax || measuredHeight != iMax2) {
                    if (measuredWidth != iMax) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
                    }
                    if (measuredHeight != iMax2) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMax2, 1073741824);
                    }
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    eVar.a1(iMakeMeasureSpec, iMakeMeasureSpec2);
                    iMax = view.getMeasuredWidth();
                    iMax2 = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                }
                i10 = -1;
            }
            boolean z22 = baseline != i10;
            aVar.f57059i = (iMax == aVar.f57053c && iMax2 == aVar.f57054d) ? false : true;
            if (bVar5.f2587g0) {
                z22 = true;
            }
            if (z22 && baseline != -1 && eVar.r() != baseline) {
                aVar.f57059i = true;
            }
            aVar.f57055e = iMax;
            aVar.f57056f = iMax2;
            aVar.f57058h = z22;
            aVar.f57057g = baseline;
            ConstraintLayout.b(ConstraintLayout.this);
        }

        public void c(int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f2625b = i12;
            this.f2626c = i13;
            this.f2627d = i14;
            this.f2628e = i15;
            this.f2629f = i10;
            this.f2630g = i11;
        }
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2549a = new SparseArray();
        this.f2550b = new ArrayList(4);
        this.f2551c = new x.f();
        this.f2552d = 0;
        this.f2553e = 0;
        this.f2554f = Integer.MAX_VALUE;
        this.f2555g = Integer.MAX_VALUE;
        this.f2556h = true;
        this.f2557i = 257;
        this.f2558j = null;
        this.f2559k = null;
        this.f2560l = -1;
        this.f2561m = new HashMap();
        this.f2562n = -1;
        this.f2563o = -1;
        this.f2564p = -1;
        this.f2565q = -1;
        this.f2566r = 0;
        this.f2567s = 0;
        this.f2568t = new SparseArray();
        this.f2569u = new c(this);
        this.f2570v = 0;
        this.f2571w = 0;
        s(attributeSet, 0, 0);
    }

    private void B(x.e eVar, b bVar, SparseArray sparseArray, int i10, x.d.a aVar) {
        View view = (View) this.f2549a.get(i10);
        x.e eVar2 = (x.e) sparseArray.get(i10);
        if (eVar2 == null || view == null || !(view.getLayoutParams() instanceof b)) {
            return;
        }
        bVar.f2587g0 = true;
        x.d.a aVar2 = x.d.a.BASELINE;
        if (aVar == aVar2) {
            b bVar2 = (b) view.getLayoutParams();
            bVar2.f2587g0 = true;
            bVar2.f2617v0.P0(true);
        }
        eVar.q(aVar2).b(eVar2.q(aVar), bVar.D, bVar.C, true);
        eVar.P0(true);
        eVar.q(x.d.a.TOP).q();
        eVar.q(x.d.a.BOTTOM).q();
    }

    private boolean C() {
        int childCount = getChildCount();
        boolean z10 = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            if (getChildAt(i10).isLayoutRequested()) {
                z10 = true;
                break;
            }
        }
        if (z10) {
            y();
        }
        return z10;
    }

    static /* synthetic */ u.e b(ConstraintLayout constraintLayout) {
        constraintLayout.getClass();
        return null;
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingLeft()) + Math.max(0, getPaddingRight());
        int iMax2 = Math.max(0, getPaddingStart()) + Math.max(0, getPaddingEnd());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    public static g getSharedValues() {
        if (f2548y == null) {
            f2548y = new g();
        }
        return f2548y;
    }

    private x.e p(int i10) {
        if (i10 == 0) {
            return this.f2551c;
        }
        View viewFindViewById = (View) this.f2549a.get(i10);
        if (viewFindViewById == null && (viewFindViewById = findViewById(i10)) != null && viewFindViewById != this && viewFindViewById.getParent() == this) {
            onViewAdded(viewFindViewById);
        }
        if (viewFindViewById == this) {
            return this.f2551c;
        }
        if (viewFindViewById == null) {
            return null;
        }
        return ((b) viewFindViewById.getLayoutParams()).f2617v0;
    }

    private void s(AttributeSet attributeSet, int i10, int i11) {
        this.f2551c.G0(this);
        this.f2551c.b2(this.f2569u);
        this.f2549a.put(getId(), this);
        this.f2558j = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, f.f2858f1, i10, i11);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i12 = 0; i12 < indexCount; i12++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i12);
                if (index == f.f2988p1) {
                    this.f2552d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f2552d);
                } else if (index == f.f3001q1) {
                    this.f2553e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f2553e);
                } else if (index == f.f2962n1) {
                    this.f2554f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f2554f);
                } else if (index == f.f2975o1) {
                    this.f2555g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f2555g);
                } else if (index == f.f2834d3) {
                    this.f2557i = typedArrayObtainStyledAttributes.getInt(index, this.f2557i);
                } else if (index == f.Y1) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            v(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f2559k = null;
                        }
                    }
                } else if (index == f.C1) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
                        this.f2558j = cVar;
                        cVar.C(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f2558j = null;
                    }
                    this.f2560l = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f2551c.c2(this.f2557i);
    }

    private void u() {
        this.f2556h = true;
        this.f2562n = -1;
        this.f2563o = -1;
        this.f2564p = -1;
        this.f2565q = -1;
        this.f2566r = 0;
        this.f2567s = 0;
    }

    private void y() {
        boolean zIsInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            x.e eVarR = r(getChildAt(i10));
            if (eVarR != null) {
                eVarR.v0();
            }
        }
        if (zIsInEditMode) {
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    z(0, resourceName, Integer.valueOf(childAt.getId()));
                    int iIndexOf = resourceName.indexOf(47);
                    if (iIndexOf != -1) {
                        resourceName = resourceName.substring(iIndexOf + 1);
                    }
                    p(childAt.getId()).H0(resourceName);
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.f2560l != -1) {
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt2 = getChildAt(i12);
                if (childAt2.getId() == this.f2560l && (childAt2 instanceof Constraints)) {
                    this.f2558j = ((Constraints) childAt2).getConstraintSet();
                }
            }
        }
        androidx.constraintlayout.widget.c cVar = this.f2558j;
        if (cVar != null) {
            cVar.k(this, true);
        }
        this.f2551c.z1();
        int size = this.f2550b.size();
        if (size > 0) {
            for (int i13 = 0; i13 < size; i13++) {
                ((ConstraintHelper) this.f2550b.get(i13)).u(this);
            }
        }
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt3 = getChildAt(i14);
            if (childAt3 instanceof Placeholder) {
                ((Placeholder) childAt3).c(this);
            }
        }
        this.f2568t.clear();
        this.f2568t.put(0, this.f2551c);
        this.f2568t.put(getId(), this.f2551c);
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt4 = getChildAt(i15);
            this.f2568t.put(childAt4.getId(), r(childAt4));
        }
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt5 = getChildAt(i16);
            x.e eVarR2 = r(childAt5);
            if (eVarR2 != null) {
                b bVar = (b) childAt5.getLayoutParams();
                this.f2551c.b(eVarR2);
                e(zIsInEditMode, childAt5, eVarR2, bVar, this.f2568t);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003e A[PHI: r2
      0x003e: PHI (r2v4 x.e$b) = (r2v3 x.e$b), (r2v0 x.e$b) binds: [B:21:0x004a, B:17:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    protected void A(x.f fVar, int i10, int i11, int i12, int i13) {
        x.e.b bVar;
        c cVar = this.f2569u;
        int i14 = cVar.f2628e;
        int i15 = cVar.f2627d;
        x.e.b bVar2 = x.e.b.FIXED;
        int childCount = getChildCount();
        if (i10 == Integer.MIN_VALUE) {
            bVar = x.e.b.WRAP_CONTENT;
            if (childCount == 0) {
                i11 = Math.max(0, this.f2552d);
            }
        } else if (i10 == 0) {
            bVar = x.e.b.WRAP_CONTENT;
            i11 = childCount == 0 ? Math.max(0, this.f2552d) : 0;
        } else if (i10 != 1073741824) {
            bVar = bVar2;
        } else {
            i11 = Math.min(this.f2554f - i15, i11);
            bVar = bVar2;
        }
        if (i12 == Integer.MIN_VALUE) {
            bVar2 = x.e.b.WRAP_CONTENT;
            if (childCount == 0) {
                i13 = Math.max(0, this.f2553e);
            }
        } else if (i12 == 0) {
            bVar2 = x.e.b.WRAP_CONTENT;
            if (childCount == 0) {
                i13 = Math.max(0, this.f2553e);
            } else {
                i13 = 0;
            }
        } else if (i12 != 1073741824) {
            i13 = 0;
        } else {
            i13 = Math.min(this.f2555g - i14, i13);
        }
        if (i11 != fVar.Y() || i13 != fVar.z()) {
            fVar.T1();
        }
        fVar.r1(0);
        fVar.s1(0);
        fVar.c1(this.f2554f - i15);
        fVar.b1(this.f2555g - i14);
        fVar.f1(0);
        fVar.e1(0);
        fVar.U0(bVar);
        fVar.p1(i11);
        fVar.l1(bVar2);
        fVar.Q0(i13);
        fVar.f1(this.f2552d - i15);
        fVar.e1(this.f2553e - i14);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof b;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.f2550b;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i10 = 0; i10 < size; i10++) {
                ((ConstraintHelper) this.f2550b.get(i10)).t(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i12 = Integer.parseInt(strArrSplit[0]);
                        int i13 = Integer.parseInt(strArrSplit[1]);
                        int i14 = Integer.parseInt(strArrSplit[2]);
                        int i15 = (int) ((i12 / 1080.0f) * width);
                        int i16 = (int) ((i13 / 1920.0f) * height);
                        int i17 = (int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f10 = i15;
                        float f11 = i16;
                        float f12 = i15 + ((int) ((i14 / 1080.0f) * width));
                        canvas.drawLine(f10, f11, f12, f11, paint);
                        float f13 = i16 + i17;
                        canvas.drawLine(f12, f11, f12, f13, paint);
                        canvas.drawLine(f12, f13, f10, f13, paint);
                        canvas.drawLine(f10, f13, f10, f11, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f10, f11, f12, f13, paint);
                        canvas.drawLine(f10, f13, f12, f11, paint);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:75:0x0174  */
    /* JADX WARN: Code duplicated, block: B:78:0x017d  */
    public void e(boolean z10, View view, x.e eVar, b bVar, SparseArray sparseArray) {
        x.e eVar2;
        x.e eVar3;
        x.e eVar4;
        x.e eVar5;
        b bVar2;
        x.e eVar6;
        float f10;
        int i10;
        bVar.c();
        bVar.f2619w0 = false;
        eVar.o1(view.getVisibility());
        if (bVar.f2593j0) {
            eVar.Y0(true);
            eVar.o1(8);
        }
        eVar.G0(view);
        if (view instanceof ConstraintHelper) {
            ((ConstraintHelper) view).q(eVar, this.f2551c.V1());
        }
        if (bVar.f2589h0) {
            x.h hVar = (x.h) eVar;
            int i11 = bVar.f2611s0;
            int i12 = bVar.f2613t0;
            float f11 = bVar.f2615u0;
            if (f11 != -1.0f) {
                hVar.E1(f11);
                return;
            } else if (i11 != -1) {
                hVar.C1(i11);
                return;
            } else {
                if (i12 != -1) {
                    hVar.D1(i12);
                    return;
                }
                return;
            }
        }
        int i13 = bVar.f2597l0;
        int i14 = bVar.f2599m0;
        int i15 = bVar.f2601n0;
        int i16 = bVar.f2603o0;
        int i17 = bVar.f2605p0;
        int i18 = bVar.f2607q0;
        float f12 = bVar.f2609r0;
        int i19 = bVar.f2604p;
        if (i19 != -1) {
            x.e eVar7 = (x.e) sparseArray.get(i19);
            if (eVar7 != null) {
                eVar.m(eVar7, bVar.f2608r, bVar.f2606q);
            }
            eVar6 = eVar;
            bVar2 = bVar;
        } else {
            if (i13 != -1) {
                x.e eVar8 = (x.e) sparseArray.get(i13);
                if (eVar8 != null) {
                    x.d.a aVar = x.d.a.LEFT;
                    eVar.g0(aVar, eVar8, aVar, ((ViewGroup.MarginLayoutParams) bVar).leftMargin, i17);
                }
            } else if (i14 != -1 && (eVar2 = (x.e) sparseArray.get(i14)) != null) {
                eVar.g0(x.d.a.LEFT, eVar2, x.d.a.RIGHT, ((ViewGroup.MarginLayoutParams) bVar).leftMargin, i17);
            }
            if (i15 != -1) {
                x.e eVar9 = (x.e) sparseArray.get(i15);
                if (eVar9 != null) {
                    eVar.g0(x.d.a.RIGHT, eVar9, x.d.a.LEFT, ((ViewGroup.MarginLayoutParams) bVar).rightMargin, i18);
                }
            } else if (i16 != -1 && (eVar3 = (x.e) sparseArray.get(i16)) != null) {
                x.d.a aVar2 = x.d.a.RIGHT;
                eVar.g0(aVar2, eVar3, aVar2, ((ViewGroup.MarginLayoutParams) bVar).rightMargin, i18);
            }
            int i20 = bVar.f2590i;
            if (i20 != -1) {
                x.e eVar10 = (x.e) sparseArray.get(i20);
                if (eVar10 != null) {
                    x.d.a aVar3 = x.d.a.TOP;
                    eVar.g0(aVar3, eVar10, aVar3, ((ViewGroup.MarginLayoutParams) bVar).topMargin, bVar.f2620x);
                }
            } else {
                int i21 = bVar.f2592j;
                if (i21 != -1 && (eVar4 = (x.e) sparseArray.get(i21)) != null) {
                    eVar.g0(x.d.a.TOP, eVar4, x.d.a.BOTTOM, ((ViewGroup.MarginLayoutParams) bVar).topMargin, bVar.f2620x);
                }
            }
            int i22 = bVar.f2594k;
            if (i22 != -1) {
                x.e eVar11 = (x.e) sparseArray.get(i22);
                if (eVar11 != null) {
                    eVar.g0(x.d.a.BOTTOM, eVar11, x.d.a.TOP, ((ViewGroup.MarginLayoutParams) bVar).bottomMargin, bVar.f2622z);
                }
            } else {
                int i23 = bVar.f2596l;
                if (i23 != -1 && (eVar5 = (x.e) sparseArray.get(i23)) != null) {
                    x.d.a aVar4 = x.d.a.BOTTOM;
                    eVar.g0(aVar4, eVar5, aVar4, ((ViewGroup.MarginLayoutParams) bVar).bottomMargin, bVar.f2622z);
                }
            }
            int i24 = bVar.f2598m;
            if (i24 != -1) {
                bVar2 = bVar;
                B(eVar, bVar2, sparseArray, i24, x.d.a.BASELINE);
            } else {
                bVar2 = bVar;
                int i25 = bVar2.f2600n;
                if (i25 != -1) {
                    B(eVar, bVar2, sparseArray, i25, x.d.a.TOP);
                } else {
                    int i26 = bVar2.f2602o;
                    if (i26 != -1) {
                        B(eVar, bVar2, sparseArray, i26, x.d.a.BOTTOM);
                        eVar6 = eVar;
                    }
                    if (f12 >= 0.0f) {
                        eVar6.R0(f12);
                    }
                    f10 = bVar2.H;
                    if (f10 >= 0.0f) {
                        eVar6.i1(f10);
                    }
                }
            }
            eVar6 = eVar;
            if (f12 >= 0.0f) {
                eVar6.R0(f12);
            }
            f10 = bVar2.H;
            if (f10 >= 0.0f) {
                eVar6.i1(f10);
            }
        }
        if (z10 && ((i10 = bVar2.X) != -1 || bVar2.Y != -1)) {
            eVar6.g1(i10, bVar2.Y);
        }
        if (bVar2.f2583e0) {
            eVar6.U0(x.e.b.FIXED);
            eVar6.p1(((ViewGroup.MarginLayoutParams) bVar2).width);
            if (((ViewGroup.MarginLayoutParams) bVar2).width == -2) {
                eVar6.U0(x.e.b.WRAP_CONTENT);
            }
        } else if (((ViewGroup.MarginLayoutParams) bVar2).width == -1) {
            if (bVar2.f2575a0) {
                eVar6.U0(x.e.b.MATCH_CONSTRAINT);
            } else {
                eVar6.U0(x.e.b.MATCH_PARENT);
            }
            eVar6.q(x.d.a.LEFT).f56418g = ((ViewGroup.MarginLayoutParams) bVar2).leftMargin;
            eVar6.q(x.d.a.RIGHT).f56418g = ((ViewGroup.MarginLayoutParams) bVar2).rightMargin;
        } else {
            eVar6.U0(x.e.b.MATCH_CONSTRAINT);
            eVar6.p1(0);
        }
        if (bVar2.f2585f0) {
            eVar6.l1(x.e.b.FIXED);
            eVar6.Q0(((ViewGroup.MarginLayoutParams) bVar2).height);
            if (((ViewGroup.MarginLayoutParams) bVar2).height == -2) {
                eVar6.l1(x.e.b.WRAP_CONTENT);
            }
        } else if (((ViewGroup.MarginLayoutParams) bVar2).height == -1) {
            if (bVar2.f2577b0) {
                eVar6.l1(x.e.b.MATCH_CONSTRAINT);
            } else {
                eVar6.l1(x.e.b.MATCH_PARENT);
            }
            eVar6.q(x.d.a.TOP).f56418g = ((ViewGroup.MarginLayoutParams) bVar2).topMargin;
            eVar6.q(x.d.a.BOTTOM).f56418g = ((ViewGroup.MarginLayoutParams) bVar2).bottomMargin;
        } else {
            eVar6.l1(x.e.b.MATCH_CONSTRAINT);
            eVar6.Q0(0);
        }
        eVar6.I0(bVar2.I);
        eVar6.W0(bVar2.L);
        eVar6.n1(bVar2.M);
        eVar6.S0(bVar2.N);
        eVar6.j1(bVar2.O);
        eVar6.q1(bVar2.f2581d0);
        eVar6.V0(bVar2.P, bVar2.R, bVar2.T, bVar2.V);
        eVar6.m1(bVar2.Q, bVar2.S, bVar2.U, bVar2.W);
    }

    protected boolean f(int i10, int i11) {
        if (this.f2572x == null) {
            return false;
        }
        View.MeasureSpec.getSize(i10);
        View.MeasureSpec.getSize(i11);
        ArrayList arrayList = this.f2572x;
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            android.support.v4.media.session.b.a(obj);
            Iterator it = this.f2551c.w1().iterator();
            if (it.hasNext()) {
                View view = (View) ((x.e) it.next()).u();
                view.getId();
                throw null;
            }
        }
        return false;
    }

    @Override // android.view.View
    public void forceLayout() {
        u();
        super.forceLayout();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public b generateDefaultLayoutParams() {
        return new b(-2, -2);
    }

    public int getMaxHeight() {
        return this.f2555g;
    }

    public int getMaxWidth() {
        return this.f2554f;
    }

    public int getMinHeight() {
        return this.f2553e;
    }

    public int getMinWidth() {
        return this.f2552d;
    }

    public int getOptimizationLevel() {
        return this.f2551c.P1();
    }

    public String getSceneString() {
        int id2;
        StringBuilder sb2 = new StringBuilder();
        if (this.f2551c.f56459o == null) {
            int id3 = getId();
            if (id3 != -1) {
                this.f2551c.f56459o = getContext().getResources().getResourceEntryName(id3);
            } else {
                this.f2551c.f56459o = "parent";
            }
        }
        if (this.f2551c.v() == null) {
            x.f fVar = this.f2551c;
            fVar.H0(fVar.f56459o);
            Log.v("ConstraintLayout", " setDebugName " + this.f2551c.v());
        }
        ArrayList arrayListW1 = this.f2551c.w1();
        int size = arrayListW1.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayListW1.get(i10);
            i10++;
            x.e eVar = (x.e) obj;
            View view = (View) eVar.u();
            if (view != null) {
                if (eVar.f56459o == null && (id2 = view.getId()) != -1) {
                    eVar.f56459o = getContext().getResources().getResourceEntryName(id2);
                }
                if (eVar.v() == null) {
                    eVar.H0(eVar.f56459o);
                    Log.v("ConstraintLayout", " setDebugName " + eVar.v());
                }
            }
        }
        this.f2551c.Q(sb2);
        return sb2.toString();
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public b generateLayoutParams(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }

    public Object l(int i10, Object obj) {
        if (i10 != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap map = this.f2561m;
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return this.f2561m.get(str);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        View content;
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            b bVar = (b) childAt.getLayoutParams();
            x.e eVar = bVar.f2617v0;
            if ((childAt.getVisibility() != 8 || bVar.f2589h0 || bVar.f2591i0 || bVar.f2595k0 || zIsInEditMode) && !bVar.f2593j0) {
                int iZ = eVar.Z();
                int iA0 = eVar.a0();
                int iY = eVar.Y() + iZ;
                int iZ2 = eVar.z() + iA0;
                childAt.layout(iZ, iA0, iY, iZ2);
                if ((childAt instanceof Placeholder) && (content = ((Placeholder) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(iZ, iA0, iY, iZ2);
                }
            }
        }
        int size = this.f2550b.size();
        if (size > 0) {
            for (int i15 = 0; i15 < size; i15++) {
                ((ConstraintHelper) this.f2550b.get(i15)).r(this);
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        boolean zF = this.f2556h | f(i10, i11);
        this.f2556h = zF;
        if (!zF) {
            int childCount = getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                if (getChildAt(i12).isLayoutRequested()) {
                    this.f2556h = true;
                    break;
                }
            }
        }
        this.f2570v = i10;
        this.f2571w = i11;
        this.f2551c.e2(t());
        if (this.f2556h) {
            this.f2556h = false;
            if (C()) {
                this.f2551c.g2();
            }
        }
        this.f2551c.N1(null);
        x(this.f2551c, this.f2557i, i10, i11);
        w(i10, i11, this.f2551c.Y(), this.f2551c.z(), this.f2551c.W1(), this.f2551c.U1());
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        x.e eVarR = r(view);
        if ((view instanceof Guideline) && !(eVarR instanceof x.h)) {
            b bVar = (b) view.getLayoutParams();
            x.h hVar = new x.h();
            bVar.f2617v0 = hVar;
            bVar.f2589h0 = true;
            hVar.F1(bVar.Z);
        }
        if (view instanceof ConstraintHelper) {
            ConstraintHelper constraintHelper = (ConstraintHelper) view;
            constraintHelper.w();
            ((b) view.getLayoutParams()).f2591i0 = true;
            if (!this.f2550b.contains(constraintHelper)) {
                this.f2550b.add(constraintHelper);
            }
        }
        this.f2549a.put(view.getId(), view);
        this.f2556h = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f2549a.remove(view.getId());
        this.f2551c.y1(r(view));
        this.f2550b.remove(view);
        this.f2556h = true;
    }

    public View q(int i10) {
        return (View) this.f2549a.get(i10);
    }

    public final x.e r(View view) {
        if (view == this) {
            return this.f2551c;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof b) {
            return ((b) view.getLayoutParams()).f2617v0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof b) {
            return ((b) view.getLayoutParams()).f2617v0;
        }
        return null;
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        u();
        super.requestLayout();
    }

    public void setConstraintSet(androidx.constraintlayout.widget.c cVar) {
        this.f2558j = cVar;
    }

    @Override // android.view.View
    public void setId(int i10) {
        this.f2549a.remove(getId());
        super.setId(i10);
        this.f2549a.put(getId(), this);
    }

    public void setMaxHeight(int i10) {
        if (i10 == this.f2555g) {
            return;
        }
        this.f2555g = i10;
        requestLayout();
    }

    public void setMaxWidth(int i10) {
        if (i10 == this.f2554f) {
            return;
        }
        this.f2554f = i10;
        requestLayout();
    }

    public void setMinHeight(int i10) {
        if (i10 == this.f2553e) {
            return;
        }
        this.f2553e = i10;
        requestLayout();
    }

    public void setMinWidth(int i10) {
        if (i10 == this.f2552d) {
            return;
        }
        this.f2552d = i10;
        requestLayout();
    }

    public void setOnConstraintsChanged(d dVar) {
        androidx.constraintlayout.widget.b bVar = this.f2559k;
        if (bVar != null) {
            bVar.c(dVar);
        }
    }

    public void setOptimizationLevel(int i10) {
        this.f2557i = i10;
        this.f2551c.c2(i10);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean t() {
        return (getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection();
    }

    protected void v(int i10) {
        this.f2559k = new androidx.constraintlayout.widget.b(getContext(), this, i10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void w(int i10, int i11, int i12, int i13, boolean z10, boolean z11) {
        c cVar = this.f2569u;
        int i14 = cVar.f2628e;
        int iResolveSizeAndState = View.resolveSizeAndState(i12 + cVar.f2627d, i10, 0);
        int iResolveSizeAndState2 = View.resolveSizeAndState(i13 + i14, i11, 0) & 16777215;
        int iMin = Math.min(this.f2554f, iResolveSizeAndState & 16777215);
        int iMin2 = Math.min(this.f2555g, iResolveSizeAndState2);
        if (z10) {
            iMin |= C.DEFAULT_MUXED_BUFFER_SIZE;
        }
        if (z11) {
            iMin2 |= C.DEFAULT_MUXED_BUFFER_SIZE;
        }
        setMeasuredDimension(iMin, iMin2);
        this.f2562n = iMin;
        this.f2563o = iMin2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void x(x.f fVar, int i10, int i11, int i12) {
        int i13;
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i12);
        int size2 = View.MeasureSpec.getSize(i12);
        int iMax = Math.max(0, getPaddingTop());
        int iMax2 = Math.max(0, getPaddingBottom());
        int i14 = iMax + iMax2;
        int paddingWidth = getPaddingWidth();
        this.f2569u.c(i11, i12, iMax, iMax2, paddingWidth, i14);
        int iMax3 = Math.max(0, getPaddingStart());
        int iMax4 = Math.max(0, getPaddingEnd());
        if (iMax3 > 0 || iMax4 > 0) {
            if (t()) {
                i13 = iMax4;
            }
            int i15 = size - paddingWidth;
            int i16 = size2 - i14;
            A(fVar, mode, i15, mode2, i16);
            fVar.X1(i10, mode, i15, mode2, i16, this.f2562n, this.f2563o, i13, iMax);
        }
        iMax3 = Math.max(0, getPaddingLeft());
        i13 = iMax3;
        int i17 = size - paddingWidth;
        int i18 = size2 - i14;
        A(fVar, mode, i17, mode2, i18);
        fVar.X1(i10, mode, i17, mode2, i18, this.f2562n, this.f2563o, i13, iMax);
    }

    public void z(int i10, Object obj, Object obj2) {
        if (i10 == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.f2561m == null) {
                this.f2561m = new HashMap();
            }
            String strSubstring = (String) obj;
            int iIndexOf = strSubstring.indexOf("/");
            if (iIndexOf != -1) {
                strSubstring = strSubstring.substring(iIndexOf + 1);
            }
            this.f2561m.put(strSubstring, (Integer) obj2);
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new b(layoutParams);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f2549a = new SparseArray();
        this.f2550b = new ArrayList(4);
        this.f2551c = new x.f();
        this.f2552d = 0;
        this.f2553e = 0;
        this.f2554f = Integer.MAX_VALUE;
        this.f2555g = Integer.MAX_VALUE;
        this.f2556h = true;
        this.f2557i = 257;
        this.f2558j = null;
        this.f2559k = null;
        this.f2560l = -1;
        this.f2561m = new HashMap();
        this.f2562n = -1;
        this.f2563o = -1;
        this.f2564p = -1;
        this.f2565q = -1;
        this.f2566r = 0;
        this.f2567s = 0;
        this.f2568t = new SparseArray();
        this.f2569u = new c(this);
        this.f2570v = 0;
        this.f2571w = 0;
        s(attributeSet, i10, 0);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class b extends ViewGroup.MarginLayoutParams {
        public int A;
        public int B;
        public int C;
        public int D;
        boolean E;
        boolean F;
        public float G;
        public float H;
        public String I;
        float J;
        int K;
        public float L;
        public float M;
        public int N;
        public int O;
        public int P;
        public int Q;
        public int R;
        public int S;
        public int T;
        public int U;
        public float V;
        public float W;
        public int X;
        public int Y;
        public int Z;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f2574a;

        /* JADX INFO: renamed from: a0, reason: collision with root package name */
        public boolean f2575a0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f2576b;

        /* JADX INFO: renamed from: b0, reason: collision with root package name */
        public boolean f2577b0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f2578c;

        /* JADX INFO: renamed from: c0, reason: collision with root package name */
        public String f2579c0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f2580d;

        /* JADX INFO: renamed from: d0, reason: collision with root package name */
        public int f2581d0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f2582e;

        /* JADX INFO: renamed from: e0, reason: collision with root package name */
        boolean f2583e0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f2584f;

        /* JADX INFO: renamed from: f0, reason: collision with root package name */
        boolean f2585f0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f2586g;

        /* JADX INFO: renamed from: g0, reason: collision with root package name */
        boolean f2587g0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f2588h;

        /* JADX INFO: renamed from: h0, reason: collision with root package name */
        boolean f2589h0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f2590i;

        /* JADX INFO: renamed from: i0, reason: collision with root package name */
        boolean f2591i0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f2592j;

        /* JADX INFO: renamed from: j0, reason: collision with root package name */
        boolean f2593j0;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f2594k;

        /* JADX INFO: renamed from: k0, reason: collision with root package name */
        boolean f2595k0;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f2596l;

        /* JADX INFO: renamed from: l0, reason: collision with root package name */
        int f2597l0;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f2598m;

        /* JADX INFO: renamed from: m0, reason: collision with root package name */
        int f2599m0;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f2600n;

        /* JADX INFO: renamed from: n0, reason: collision with root package name */
        int f2601n0;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f2602o;

        /* JADX INFO: renamed from: o0, reason: collision with root package name */
        int f2603o0;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f2604p;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        int f2605p0;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f2606q;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        int f2607q0;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public float f2608r;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        float f2609r0;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f2610s;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        int f2611s0;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f2612t;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        int f2613t0;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f2614u;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        float f2615u0;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f2616v;

        /* JADX INFO: renamed from: v0, reason: collision with root package name */
        x.e f2617v0;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f2618w;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public boolean f2619w0;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f2620x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f2621y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public int f2622z;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        private static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final SparseIntArray f2623a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f2623a = sparseIntArray;
                sparseIntArray.append(f.O2, 64);
                sparseIntArray.append(f.f3015r2, 65);
                sparseIntArray.append(f.A2, 8);
                sparseIntArray.append(f.B2, 9);
                sparseIntArray.append(f.D2, 10);
                sparseIntArray.append(f.E2, 11);
                sparseIntArray.append(f.K2, 12);
                sparseIntArray.append(f.J2, 13);
                sparseIntArray.append(f.f2885h2, 14);
                sparseIntArray.append(f.f2872g2, 15);
                sparseIntArray.append(f.f2820c2, 16);
                sparseIntArray.append(f.f2846e2, 52);
                sparseIntArray.append(f.f2833d2, 53);
                sparseIntArray.append(f.f2898i2, 2);
                sparseIntArray.append(f.f2924k2, 3);
                sparseIntArray.append(f.f2911j2, 4);
                sparseIntArray.append(f.T2, 49);
                sparseIntArray.append(f.U2, 50);
                sparseIntArray.append(f.f2976o2, 5);
                sparseIntArray.append(f.f2989p2, 6);
                sparseIntArray.append(f.f3002q2, 7);
                sparseIntArray.append(f.X1, 67);
                sparseIntArray.append(f.f2871g1, 1);
                sparseIntArray.append(f.F2, 17);
                sparseIntArray.append(f.G2, 18);
                sparseIntArray.append(f.f2963n2, 19);
                sparseIntArray.append(f.f2950m2, 20);
                sparseIntArray.append(f.Y2, 21);
                sparseIntArray.append(f.f2808b3, 22);
                sparseIntArray.append(f.Z2, 23);
                sparseIntArray.append(f.W2, 24);
                sparseIntArray.append(f.f2795a3, 25);
                sparseIntArray.append(f.X2, 26);
                sparseIntArray.append(f.V2, 55);
                sparseIntArray.append(f.f2821c3, 54);
                sparseIntArray.append(f.f3080w2, 29);
                sparseIntArray.append(f.L2, 30);
                sparseIntArray.append(f.f2937l2, 44);
                sparseIntArray.append(f.f3106y2, 45);
                sparseIntArray.append(f.N2, 46);
                sparseIntArray.append(f.f3093x2, 47);
                sparseIntArray.append(f.M2, 48);
                sparseIntArray.append(f.f2794a2, 27);
                sparseIntArray.append(f.Z1, 28);
                sparseIntArray.append(f.P2, 31);
                sparseIntArray.append(f.f3028s2, 32);
                sparseIntArray.append(f.R2, 33);
                sparseIntArray.append(f.Q2, 34);
                sparseIntArray.append(f.S2, 35);
                sparseIntArray.append(f.f3054u2, 36);
                sparseIntArray.append(f.f3041t2, 37);
                sparseIntArray.append(f.f3067v2, 38);
                sparseIntArray.append(f.f3119z2, 39);
                sparseIntArray.append(f.I2, 40);
                sparseIntArray.append(f.C2, 41);
                sparseIntArray.append(f.f2859f2, 42);
                sparseIntArray.append(f.f2807b2, 43);
                sparseIntArray.append(f.H2, 51);
                sparseIntArray.append(f.f2847e3, 66);
            }
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f2574a = -1;
            this.f2576b = -1;
            this.f2578c = -1.0f;
            this.f2580d = true;
            this.f2582e = -1;
            this.f2584f = -1;
            this.f2586g = -1;
            this.f2588h = -1;
            this.f2590i = -1;
            this.f2592j = -1;
            this.f2594k = -1;
            this.f2596l = -1;
            this.f2598m = -1;
            this.f2600n = -1;
            this.f2602o = -1;
            this.f2604p = -1;
            this.f2606q = 0;
            this.f2608r = 0.0f;
            this.f2610s = -1;
            this.f2612t = -1;
            this.f2614u = -1;
            this.f2616v = -1;
            this.f2618w = Integer.MIN_VALUE;
            this.f2620x = Integer.MIN_VALUE;
            this.f2621y = Integer.MIN_VALUE;
            this.f2622z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = Integer.MIN_VALUE;
            this.D = 0;
            this.E = true;
            this.F = true;
            this.G = 0.5f;
            this.H = 0.5f;
            this.I = null;
            this.J = 0.0f;
            this.K = 1;
            this.L = -1.0f;
            this.M = -1.0f;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 0;
            this.S = 0;
            this.T = 0;
            this.U = 0;
            this.V = 1.0f;
            this.W = 1.0f;
            this.X = -1;
            this.Y = -1;
            this.Z = -1;
            this.f2575a0 = false;
            this.f2577b0 = false;
            this.f2579c0 = null;
            this.f2581d0 = 0;
            this.f2583e0 = true;
            this.f2585f0 = true;
            this.f2587g0 = false;
            this.f2589h0 = false;
            this.f2591i0 = false;
            this.f2593j0 = false;
            this.f2595k0 = false;
            this.f2597l0 = -1;
            this.f2599m0 = -1;
            this.f2601n0 = -1;
            this.f2603o0 = -1;
            this.f2605p0 = Integer.MIN_VALUE;
            this.f2607q0 = Integer.MIN_VALUE;
            this.f2609r0 = 0.5f;
            this.f2617v0 = new x.e();
            this.f2619w0 = false;
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
                ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
                ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
                ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
                setMarginStart(marginLayoutParams.getMarginStart());
                setMarginEnd(marginLayoutParams.getMarginEnd());
            }
            if (layoutParams instanceof b) {
                b bVar = (b) layoutParams;
                this.f2574a = bVar.f2574a;
                this.f2576b = bVar.f2576b;
                this.f2578c = bVar.f2578c;
                this.f2580d = bVar.f2580d;
                this.f2582e = bVar.f2582e;
                this.f2584f = bVar.f2584f;
                this.f2586g = bVar.f2586g;
                this.f2588h = bVar.f2588h;
                this.f2590i = bVar.f2590i;
                this.f2592j = bVar.f2592j;
                this.f2594k = bVar.f2594k;
                this.f2596l = bVar.f2596l;
                this.f2598m = bVar.f2598m;
                this.f2600n = bVar.f2600n;
                this.f2602o = bVar.f2602o;
                this.f2604p = bVar.f2604p;
                this.f2606q = bVar.f2606q;
                this.f2608r = bVar.f2608r;
                this.f2610s = bVar.f2610s;
                this.f2612t = bVar.f2612t;
                this.f2614u = bVar.f2614u;
                this.f2616v = bVar.f2616v;
                this.f2618w = bVar.f2618w;
                this.f2620x = bVar.f2620x;
                this.f2621y = bVar.f2621y;
                this.f2622z = bVar.f2622z;
                this.A = bVar.A;
                this.B = bVar.B;
                this.C = bVar.C;
                this.D = bVar.D;
                this.G = bVar.G;
                this.H = bVar.H;
                this.I = bVar.I;
                this.J = bVar.J;
                this.K = bVar.K;
                this.L = bVar.L;
                this.M = bVar.M;
                this.N = bVar.N;
                this.O = bVar.O;
                this.f2575a0 = bVar.f2575a0;
                this.f2577b0 = bVar.f2577b0;
                this.P = bVar.P;
                this.Q = bVar.Q;
                this.R = bVar.R;
                this.T = bVar.T;
                this.S = bVar.S;
                this.U = bVar.U;
                this.V = bVar.V;
                this.W = bVar.W;
                this.X = bVar.X;
                this.Y = bVar.Y;
                this.Z = bVar.Z;
                this.f2583e0 = bVar.f2583e0;
                this.f2585f0 = bVar.f2585f0;
                this.f2587g0 = bVar.f2587g0;
                this.f2589h0 = bVar.f2589h0;
                this.f2597l0 = bVar.f2597l0;
                this.f2599m0 = bVar.f2599m0;
                this.f2601n0 = bVar.f2601n0;
                this.f2603o0 = bVar.f2603o0;
                this.f2605p0 = bVar.f2605p0;
                this.f2607q0 = bVar.f2607q0;
                this.f2609r0 = bVar.f2609r0;
                this.f2579c0 = bVar.f2579c0;
                this.f2581d0 = bVar.f2581d0;
                this.f2617v0 = bVar.f2617v0;
                this.E = bVar.E;
                this.F = bVar.F;
            }
        }

        public String a() {
            return this.f2579c0;
        }

        public x.e b() {
            return this.f2617v0;
        }

        public void c() {
            this.f2589h0 = false;
            this.f2583e0 = true;
            this.f2585f0 = true;
            int i10 = ((ViewGroup.MarginLayoutParams) this).width;
            if (i10 == -2 && this.f2575a0) {
                this.f2583e0 = false;
                if (this.P == 0) {
                    this.P = 1;
                }
            }
            int i11 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i11 == -2 && this.f2577b0) {
                this.f2585f0 = false;
                if (this.Q == 0) {
                    this.Q = 1;
                }
            }
            if (i10 == 0 || i10 == -1) {
                this.f2583e0 = false;
                if (i10 == 0 && this.P == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.f2575a0 = true;
                }
            }
            if (i11 == 0 || i11 == -1) {
                this.f2585f0 = false;
                if (i11 == 0 && this.Q == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.f2577b0 = true;
                }
            }
            if (this.f2578c == -1.0f && this.f2574a == -1 && this.f2576b == -1) {
                return;
            }
            this.f2589h0 = true;
            this.f2583e0 = true;
            this.f2585f0 = true;
            if (!(this.f2617v0 instanceof x.h)) {
                this.f2617v0 = new x.h();
            }
            ((x.h) this.f2617v0).F1(this.Z);
        }

        /* JADX WARN: Code duplicated, block: B:17:0x004a  */
        /* JADX WARN: Code duplicated, block: B:20:0x0051  */
        /* JADX WARN: Code duplicated, block: B:23:0x0058  */
        /* JADX WARN: Code duplicated, block: B:26:0x005e  */
        /* JADX WARN: Code duplicated, block: B:29:0x0064  */
        /* JADX WARN: Code duplicated, block: B:38:0x007a  */
        /* JADX WARN: Code duplicated, block: B:39:0x0082 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:40:0x0084  */
        /* JADX WARN: Code duplicated, block: B:41:0x008b A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:42:0x008d  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        public void resolveLayoutDirection(int i10) {
            int i11;
            int i12;
            int i13;
            int i14;
            int i15 = ((ViewGroup.MarginLayoutParams) this).leftMargin;
            int i16 = ((ViewGroup.MarginLayoutParams) this).rightMargin;
            super.resolveLayoutDirection(i10);
            boolean z10 = false;
            boolean z11 = 1 == getLayoutDirection();
            this.f2601n0 = -1;
            this.f2603o0 = -1;
            this.f2597l0 = -1;
            this.f2599m0 = -1;
            this.f2605p0 = this.f2618w;
            this.f2607q0 = this.f2621y;
            float f10 = this.G;
            this.f2609r0 = f10;
            int i17 = this.f2574a;
            this.f2611s0 = i17;
            int i18 = this.f2576b;
            this.f2613t0 = i18;
            float f11 = this.f2578c;
            this.f2615u0 = f11;
            if (z11) {
                int i19 = this.f2610s;
                if (i19 != -1) {
                    this.f2601n0 = i19;
                } else {
                    int i20 = this.f2612t;
                    if (i20 != -1) {
                        this.f2603o0 = i20;
                    } else {
                        i11 = this.f2614u;
                        if (i11 != -1) {
                            this.f2599m0 = i11;
                            z10 = true;
                        }
                        i12 = this.f2616v;
                        if (i12 != -1) {
                            this.f2597l0 = i12;
                            z10 = true;
                        }
                        i13 = this.A;
                        if (i13 != Integer.MIN_VALUE) {
                            this.f2607q0 = i13;
                        }
                        i14 = this.B;
                        if (i14 != Integer.MIN_VALUE) {
                            this.f2605p0 = i14;
                        }
                        if (z10) {
                            this.f2609r0 = 1.0f - f10;
                        }
                        if (this.f2589h0 && this.Z == 1 && this.f2580d) {
                            if (f11 != -1.0f) {
                                this.f2615u0 = 1.0f - f11;
                                this.f2611s0 = -1;
                                this.f2613t0 = -1;
                            } else if (i17 != -1) {
                                this.f2613t0 = i17;
                                this.f2611s0 = -1;
                                this.f2615u0 = -1.0f;
                            } else if (i18 != -1) {
                                this.f2611s0 = i18;
                                this.f2613t0 = -1;
                                this.f2615u0 = -1.0f;
                            }
                        }
                    }
                }
                z10 = true;
                i11 = this.f2614u;
                if (i11 != -1) {
                    this.f2599m0 = i11;
                    z10 = true;
                }
                i12 = this.f2616v;
                if (i12 != -1) {
                    this.f2597l0 = i12;
                    z10 = true;
                }
                i13 = this.A;
                if (i13 != Integer.MIN_VALUE) {
                    this.f2607q0 = i13;
                }
                i14 = this.B;
                if (i14 != Integer.MIN_VALUE) {
                    this.f2605p0 = i14;
                }
                if (z10) {
                    this.f2609r0 = 1.0f - f10;
                }
                if (this.f2589h0) {
                    if (f11 != -1.0f) {
                        this.f2615u0 = 1.0f - f11;
                        this.f2611s0 = -1;
                        this.f2613t0 = -1;
                    } else if (i17 != -1) {
                        this.f2613t0 = i17;
                        this.f2611s0 = -1;
                        this.f2615u0 = -1.0f;
                    } else if (i18 != -1) {
                        this.f2611s0 = i18;
                        this.f2613t0 = -1;
                        this.f2615u0 = -1.0f;
                    }
                }
            } else {
                int i21 = this.f2610s;
                if (i21 != -1) {
                    this.f2599m0 = i21;
                }
                int i22 = this.f2612t;
                if (i22 != -1) {
                    this.f2597l0 = i22;
                }
                int i23 = this.f2614u;
                if (i23 != -1) {
                    this.f2601n0 = i23;
                }
                int i24 = this.f2616v;
                if (i24 != -1) {
                    this.f2603o0 = i24;
                }
                int i25 = this.A;
                if (i25 != Integer.MIN_VALUE) {
                    this.f2605p0 = i25;
                }
                int i26 = this.B;
                if (i26 != Integer.MIN_VALUE) {
                    this.f2607q0 = i26;
                }
            }
            if (this.f2614u == -1 && this.f2616v == -1 && this.f2612t == -1 && this.f2610s == -1) {
                int i27 = this.f2586g;
                if (i27 != -1) {
                    this.f2601n0 = i27;
                    if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i16 > 0) {
                        ((ViewGroup.MarginLayoutParams) this).rightMargin = i16;
                    }
                } else {
                    int i28 = this.f2588h;
                    if (i28 != -1) {
                        this.f2603o0 = i28;
                        if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i16 > 0) {
                            ((ViewGroup.MarginLayoutParams) this).rightMargin = i16;
                        }
                    }
                }
                int i29 = this.f2582e;
                if (i29 != -1) {
                    this.f2597l0 = i29;
                    if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i15 <= 0) {
                        return;
                    }
                    ((ViewGroup.MarginLayoutParams) this).leftMargin = i15;
                    return;
                }
                int i30 = this.f2584f;
                if (i30 != -1) {
                    this.f2599m0 = i30;
                    if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i15 <= 0) {
                        return;
                    }
                    ((ViewGroup.MarginLayoutParams) this).leftMargin = i15;
                }
            }
        }

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2574a = -1;
            this.f2576b = -1;
            this.f2578c = -1.0f;
            this.f2580d = true;
            this.f2582e = -1;
            this.f2584f = -1;
            this.f2586g = -1;
            this.f2588h = -1;
            this.f2590i = -1;
            this.f2592j = -1;
            this.f2594k = -1;
            this.f2596l = -1;
            this.f2598m = -1;
            this.f2600n = -1;
            this.f2602o = -1;
            this.f2604p = -1;
            this.f2606q = 0;
            this.f2608r = 0.0f;
            this.f2610s = -1;
            this.f2612t = -1;
            this.f2614u = -1;
            this.f2616v = -1;
            this.f2618w = Integer.MIN_VALUE;
            this.f2620x = Integer.MIN_VALUE;
            this.f2621y = Integer.MIN_VALUE;
            this.f2622z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = Integer.MIN_VALUE;
            this.D = 0;
            this.E = true;
            this.F = true;
            this.G = 0.5f;
            this.H = 0.5f;
            this.I = null;
            this.J = 0.0f;
            this.K = 1;
            this.L = -1.0f;
            this.M = -1.0f;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 0;
            this.S = 0;
            this.T = 0;
            this.U = 0;
            this.V = 1.0f;
            this.W = 1.0f;
            this.X = -1;
            this.Y = -1;
            this.Z = -1;
            this.f2575a0 = false;
            this.f2577b0 = false;
            this.f2579c0 = null;
            this.f2581d0 = 0;
            this.f2583e0 = true;
            this.f2585f0 = true;
            this.f2587g0 = false;
            this.f2589h0 = false;
            this.f2591i0 = false;
            this.f2593j0 = false;
            this.f2595k0 = false;
            this.f2597l0 = -1;
            this.f2599m0 = -1;
            this.f2601n0 = -1;
            this.f2603o0 = -1;
            this.f2605p0 = Integer.MIN_VALUE;
            this.f2607q0 = Integer.MIN_VALUE;
            this.f2609r0 = 0.5f;
            this.f2617v0 = new x.e();
            this.f2619w0 = false;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.f2858f1);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                int i11 = a.f2623a.get(index);
                switch (i11) {
                    case 1:
                        this.Z = typedArrayObtainStyledAttributes.getInt(index, this.Z);
                        break;
                    case 2:
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f2604p);
                        this.f2604p = resourceId;
                        if (resourceId == -1) {
                            this.f2604p = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 3:
                        this.f2606q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f2606q);
                        break;
                    case 4:
                        float f10 = typedArrayObtainStyledAttributes.getFloat(index, this.f2608r) % 360.0f;
                        this.f2608r = f10;
                        if (f10 < 0.0f) {
                            this.f2608r = (360.0f - f10) % 360.0f;
                        }
                        break;
                    case 5:
                        this.f2574a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f2574a);
                        break;
                    case 6:
                        this.f2576b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f2576b);
                        break;
                    case 7:
                        this.f2578c = typedArrayObtainStyledAttributes.getFloat(index, this.f2578c);
                        break;
                    case 8:
                        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, this.f2582e);
                        this.f2582e = resourceId2;
                        if (resourceId2 == -1) {
                            this.f2582e = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 9:
                        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, this.f2584f);
                        this.f2584f = resourceId3;
                        if (resourceId3 == -1) {
                            this.f2584f = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 10:
                        int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, this.f2586g);
                        this.f2586g = resourceId4;
                        if (resourceId4 == -1) {
                            this.f2586g = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 11:
                        int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, this.f2588h);
                        this.f2588h = resourceId5;
                        if (resourceId5 == -1) {
                            this.f2588h = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 12:
                        int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, this.f2590i);
                        this.f2590i = resourceId6;
                        if (resourceId6 == -1) {
                            this.f2590i = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 13:
                        int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, this.f2592j);
                        this.f2592j = resourceId7;
                        if (resourceId7 == -1) {
                            this.f2592j = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 14:
                        int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, this.f2594k);
                        this.f2594k = resourceId8;
                        if (resourceId8 == -1) {
                            this.f2594k = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 15:
                        int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, this.f2596l);
                        this.f2596l = resourceId9;
                        if (resourceId9 == -1) {
                            this.f2596l = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 16:
                        int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, this.f2598m);
                        this.f2598m = resourceId10;
                        if (resourceId10 == -1) {
                            this.f2598m = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 17:
                        int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, this.f2610s);
                        this.f2610s = resourceId11;
                        if (resourceId11 == -1) {
                            this.f2610s = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 18:
                        int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, this.f2612t);
                        this.f2612t = resourceId12;
                        if (resourceId12 == -1) {
                            this.f2612t = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 19:
                        int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, this.f2614u);
                        this.f2614u = resourceId13;
                        if (resourceId13 == -1) {
                            this.f2614u = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 20:
                        int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, this.f2616v);
                        this.f2616v = resourceId14;
                        if (resourceId14 == -1) {
                            this.f2616v = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 21:
                        this.f2618w = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f2618w);
                        break;
                    case 22:
                        this.f2620x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f2620x);
                        break;
                    case 23:
                        this.f2621y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f2621y);
                        break;
                    case 24:
                        this.f2622z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f2622z);
                        break;
                    case 25:
                        this.A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.A);
                        break;
                    case 26:
                        this.B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.B);
                        break;
                    case 27:
                        this.f2575a0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f2575a0);
                        break;
                    case 28:
                        this.f2577b0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f2577b0);
                        break;
                    case 29:
                        this.G = typedArrayObtainStyledAttributes.getFloat(index, this.G);
                        break;
                    case 30:
                        this.H = typedArrayObtainStyledAttributes.getFloat(index, this.H);
                        break;
                    case 31:
                        int i12 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.P = i12;
                        if (i12 == 1) {
                            Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                        }
                        break;
                    case 32:
                        int i13 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.Q = i13;
                        if (i13 == 1) {
                            Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                        }
                        break;
                    case 33:
                        try {
                            this.R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.R);
                        } catch (Exception unused) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.R) == -2) {
                                this.R = -2;
                            }
                        }
                        break;
                    case 34:
                        try {
                            this.T = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.T);
                        } catch (Exception unused2) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.T) == -2) {
                                this.T = -2;
                            }
                        }
                        break;
                    case 35:
                        this.V = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.V));
                        this.P = 2;
                        break;
                    case 36:
                        try {
                            this.S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.S);
                        } catch (Exception unused3) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.S) == -2) {
                                this.S = -2;
                            }
                        }
                        break;
                    case 37:
                        try {
                            this.U = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.U);
                        } catch (Exception unused4) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.U) == -2) {
                                this.U = -2;
                            }
                        }
                        break;
                    case 38:
                        this.W = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.W));
                        this.Q = 2;
                        break;
                    default:
                        switch (i11) {
                            case 44:
                                androidx.constraintlayout.widget.c.H(this, typedArrayObtainStyledAttributes.getString(index));
                                break;
                            case SDK_INIT_API_VALUE:
                                this.L = typedArrayObtainStyledAttributes.getFloat(index, this.L);
                                break;
                            case AD_START_EVENT_VALUE:
                                this.M = typedArrayObtainStyledAttributes.getFloat(index, this.M);
                                break;
                            case AD_CLICK_EVENT_VALUE:
                                this.N = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.O = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.X = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.X);
                                break;
                            case 50:
                                this.Y = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.Y);
                                break;
                            case 51:
                                this.f2579c0 = typedArrayObtainStyledAttributes.getString(index);
                                break;
                            case 52:
                                int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(index, this.f2600n);
                                this.f2600n = resourceId15;
                                if (resourceId15 == -1) {
                                    this.f2600n = typedArrayObtainStyledAttributes.getInt(index, -1);
                                }
                                break;
                            case 53:
                                int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(index, this.f2602o);
                                this.f2602o = resourceId16;
                                if (resourceId16 == -1) {
                                    this.f2602o = typedArrayObtainStyledAttributes.getInt(index, -1);
                                }
                                break;
                            case 54:
                                this.D = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.D);
                                break;
                            case 55:
                                this.C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.C);
                                break;
                            default:
                                switch (i11) {
                                    case 64:
                                        androidx.constraintlayout.widget.c.F(this, typedArrayObtainStyledAttributes, index, 0);
                                        this.E = true;
                                        break;
                                    case 65:
                                        androidx.constraintlayout.widget.c.F(this, typedArrayObtainStyledAttributes, index, 1);
                                        this.F = true;
                                        break;
                                    case BLACK_SCREEN_IS_DETECTED_VALUE:
                                        this.f2581d0 = typedArrayObtainStyledAttributes.getInt(index, this.f2581d0);
                                        break;
                                    case NATIVE_PLAY_ASSET_TYPE_VALUE:
                                        this.f2580d = typedArrayObtainStyledAttributes.getBoolean(index, this.f2580d);
                                        break;
                                }
                                break;
                        }
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            c();
        }

        public b(int i10, int i11) {
            super(i10, i11);
            this.f2574a = -1;
            this.f2576b = -1;
            this.f2578c = -1.0f;
            this.f2580d = true;
            this.f2582e = -1;
            this.f2584f = -1;
            this.f2586g = -1;
            this.f2588h = -1;
            this.f2590i = -1;
            this.f2592j = -1;
            this.f2594k = -1;
            this.f2596l = -1;
            this.f2598m = -1;
            this.f2600n = -1;
            this.f2602o = -1;
            this.f2604p = -1;
            this.f2606q = 0;
            this.f2608r = 0.0f;
            this.f2610s = -1;
            this.f2612t = -1;
            this.f2614u = -1;
            this.f2616v = -1;
            this.f2618w = Integer.MIN_VALUE;
            this.f2620x = Integer.MIN_VALUE;
            this.f2621y = Integer.MIN_VALUE;
            this.f2622z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = Integer.MIN_VALUE;
            this.D = 0;
            this.E = true;
            this.F = true;
            this.G = 0.5f;
            this.H = 0.5f;
            this.I = null;
            this.J = 0.0f;
            this.K = 1;
            this.L = -1.0f;
            this.M = -1.0f;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 0;
            this.S = 0;
            this.T = 0;
            this.U = 0;
            this.V = 1.0f;
            this.W = 1.0f;
            this.X = -1;
            this.Y = -1;
            this.Z = -1;
            this.f2575a0 = false;
            this.f2577b0 = false;
            this.f2579c0 = null;
            this.f2581d0 = 0;
            this.f2583e0 = true;
            this.f2585f0 = true;
            this.f2587g0 = false;
            this.f2589h0 = false;
            this.f2591i0 = false;
            this.f2593j0 = false;
            this.f2595k0 = false;
            this.f2597l0 = -1;
            this.f2599m0 = -1;
            this.f2601n0 = -1;
            this.f2603o0 = -1;
            this.f2605p0 = Integer.MIN_VALUE;
            this.f2607q0 = Integer.MIN_VALUE;
            this.f2609r0 = 0.5f;
            this.f2617v0 = new x.e();
            this.f2619w0 = false;
        }
    }
}
