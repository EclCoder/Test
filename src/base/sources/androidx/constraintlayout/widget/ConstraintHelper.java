package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.Arrays;
import java.util.HashMap;
import x.i;
import x.j;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class ConstraintHelper extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected int[] f2539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected int f2540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected Context f2541c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected i f2542d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected boolean f2543e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected String f2544f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected String f2545g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private View[] f2546h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected HashMap f2547i;

    public ConstraintHelper(Context context) {
        super(context);
        this.f2539a = new int[32];
        this.f2543e = false;
        this.f2546h = null;
        this.f2547i = new HashMap();
        this.f2541c = context;
        o(null);
    }

    private void e(String str) {
        if (str == null || str.length() == 0 || this.f2541c == null) {
            return;
        }
        String strTrim = str.trim();
        int iM = m(strTrim);
        if (iM != 0) {
            this.f2547i.put(Integer.valueOf(iM), strTrim);
            f(iM);
            return;
        }
        Log.w("ConstraintHelper", "Could not find id of \"" + strTrim + "\"");
    }

    private void f(int i10) {
        if (i10 == getId()) {
            return;
        }
        int i11 = this.f2540b + 1;
        int[] iArr = this.f2539a;
        if (i11 > iArr.length) {
            this.f2539a = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f2539a;
        int i12 = this.f2540b;
        iArr2[i12] = i10;
        this.f2540b = i12 + 1;
    }

    private void g(String str) {
        if (str == null || str.length() == 0 || this.f2541c == null) {
            return;
        }
        String strTrim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof ConstraintLayout.b) && strTrim.equals(((ConstraintLayout.b) layoutParams).f2579c0)) {
                if (childAt.getId() == -1) {
                    Log.w("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                } else {
                    f(childAt.getId());
                }
            }
        }
    }

    private int[] k(String str) {
        String[] strArrSplit = str.split(",");
        int[] iArr = new int[strArrSplit.length];
        int i10 = 0;
        for (String str2 : strArrSplit) {
            int iM = m(str2.trim());
            if (iM != 0) {
                iArr[i10] = iM;
                i10++;
            }
        }
        return i10 != strArrSplit.length ? Arrays.copyOf(iArr, i10) : iArr;
    }

    private int l(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String resourceEntryName;
        if (str == null || constraintLayout == null || (resources = this.f2541c.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            if (childAt.getId() != -1) {
                try {
                    resourceEntryName = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                    resourceEntryName = null;
                }
                if (str.equals(resourceEntryName)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    private int m(String str) {
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        int iL = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object objL = constraintLayout.l(0, str);
            if (objL instanceof Integer) {
                iL = ((Integer) objL).intValue();
            }
        }
        if (iL == 0 && constraintLayout != null) {
            iL = l(constraintLayout, str);
        }
        if (iL == 0) {
            try {
                iL = e.class.getField(str).getInt(null);
            } catch (Exception unused) {
            }
        }
        return iL == 0 ? this.f2541c.getResources().getIdentifier(str, "id", this.f2541c.getPackageName()) : iL;
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f2539a, this.f2540b);
    }

    protected void h() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        i((ConstraintLayout) parent);
    }

    protected void i(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i10 = 0; i10 < this.f2540b; i10++) {
            View viewQ = constraintLayout.q(this.f2539a[i10]);
            if (viewQ != null) {
                viewQ.setVisibility(visibility);
                if (elevation > 0.0f) {
                    viewQ.setTranslationZ(viewQ.getTranslationZ() + elevation);
                }
            }
        }
    }

    protected View[] n(ConstraintLayout constraintLayout) {
        View[] viewArr = this.f2546h;
        if (viewArr == null || viewArr.length != this.f2540b) {
            this.f2546h = new View[this.f2540b];
        }
        for (int i10 = 0; i10 < this.f2540b; i10++) {
            this.f2546h[i10] = constraintLayout.q(this.f2539a[i10]);
        }
        return this.f2546h;
    }

    protected void o(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, f.f2858f1);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == f.D1) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f2544f = string;
                    setIds(string);
                } else if (index == f.E1) {
                    String string2 = typedArrayObtainStyledAttributes.getString(index);
                    this.f2545g = string2;
                    setReferenceTags(string2);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f2544f;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f2545g;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        if (this.f2543e) {
            super.onMeasure(i10, i11);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    public void p(c.a aVar, j jVar, ConstraintLayout.b bVar, SparseArray sparseArray) {
        c.b bVar2 = aVar.f2694e;
        int[] iArr = bVar2.f2732k0;
        if (iArr != null) {
            setReferencedIds(iArr);
        } else {
            String str = bVar2.f2734l0;
            if (str != null) {
                if (str.length() > 0) {
                    c.b bVar3 = aVar.f2694e;
                    bVar3.f2732k0 = k(bVar3.f2734l0);
                } else {
                    aVar.f2694e.f2732k0 = null;
                }
            }
        }
        if (jVar == null) {
            return;
        }
        jVar.c();
        if (aVar.f2694e.f2732k0 == null) {
            return;
        }
        int i10 = 0;
        while (true) {
            int[] iArr2 = aVar.f2694e.f2732k0;
            if (i10 >= iArr2.length) {
                return;
            }
            x.e eVar = (x.e) sparseArray.get(iArr2[i10]);
            if (eVar != null) {
                jVar.b(eVar);
            }
            i10++;
        }
    }

    protected void setIds(String str) {
        this.f2544f = str;
        if (str == null) {
            return;
        }
        int i10 = 0;
        this.f2540b = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i10);
            if (iIndexOf == -1) {
                e(str.substring(i10));
                return;
            } else {
                e(str.substring(i10, iIndexOf));
                i10 = iIndexOf + 1;
            }
        }
    }

    protected void setReferenceTags(String str) {
        this.f2545g = str;
        if (str == null) {
            return;
        }
        int i10 = 0;
        this.f2540b = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i10);
            if (iIndexOf == -1) {
                g(str.substring(i10));
                return;
            } else {
                g(str.substring(i10, iIndexOf));
                i10 = iIndexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f2544f = null;
        this.f2540b = 0;
        for (int i10 : iArr) {
            f(i10);
        }
    }

    @Override // android.view.View
    public void setTag(int i10, Object obj) {
        super.setTag(i10, obj);
        if (obj == null && this.f2544f == null) {
            f(i10);
        }
    }

    public void u(ConstraintLayout constraintLayout) {
        String str;
        int iL;
        if (isInEditMode()) {
            setIds(this.f2544f);
        }
        i iVar = this.f2542d;
        if (iVar == null) {
            return;
        }
        iVar.c();
        for (int i10 = 0; i10 < this.f2540b; i10++) {
            int i11 = this.f2539a[i10];
            View viewQ = constraintLayout.q(i11);
            if (viewQ == null && (iL = l(constraintLayout, (str = (String) this.f2547i.get(Integer.valueOf(i11))))) != 0) {
                this.f2539a[i10] = iL;
                this.f2547i.put(Integer.valueOf(iL), str);
                viewQ = constraintLayout.q(iL);
            }
            if (viewQ != null) {
                this.f2542d.b(constraintLayout.r(viewQ));
            }
        }
        this.f2542d.a(constraintLayout.f2551c);
    }

    public void v(x.f fVar, i iVar, SparseArray sparseArray) {
        iVar.c();
        for (int i10 = 0; i10 < this.f2540b; i10++) {
            iVar.b((x.e) sparseArray.get(this.f2539a[i10]));
        }
    }

    public void w() {
        if (this.f2542d == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.b) {
            ((ConstraintLayout.b) layoutParams).f2617v0 = (x.e) this.f2542d;
        }
    }

    public ConstraintHelper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2539a = new int[32];
        this.f2543e = false;
        this.f2546h = null;
        this.f2547i = new HashMap();
        this.f2541c = context;
        o(attributeSet);
    }

    public ConstraintHelper(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f2539a = new int[32];
        this.f2543e = false;
        this.f2546h = null;
        this.f2547i = new HashMap();
        this.f2541c = context;
        o(attributeSet);
    }

    protected void j(ConstraintLayout constraintLayout) {
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    public void r(ConstraintLayout constraintLayout) {
    }

    public void s(ConstraintLayout constraintLayout) {
    }

    public void t(ConstraintLayout constraintLayout) {
    }

    public void q(x.e eVar, boolean z10) {
    }
}
