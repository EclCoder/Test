package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.VirtualLayout;
import androidx.constraintlayout.widget.f;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class Grid extends VirtualLayout {
    private int A;
    private boolean B;
    private boolean C;
    private boolean[][] D;
    Set E;
    private int[] F;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f2009l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f2010m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private View[] f2011n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    ConstraintLayout f2012o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f2013p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f2014q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f2015r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f2016s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f2017t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private String f2018u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private String f2019v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private String f2020w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private float f2021x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private float f2022y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f2023z;

    public Grid(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f2009l = 50;
        this.f2010m = 50;
        this.A = 0;
        this.E = new HashSet();
    }

    private void A(View view) {
        ConstraintLayout.b bVarN = N(view);
        bVarN.L = -1.0f;
        bVarN.f2584f = -1;
        bVarN.f2582e = -1;
        bVarN.f2586g = -1;
        bVarN.f2588h = -1;
        ((ViewGroup.MarginLayoutParams) bVarN).leftMargin = -1;
        view.setLayoutParams(bVarN);
    }

    private void B(View view) {
        ConstraintLayout.b bVarN = N(view);
        bVarN.M = -1.0f;
        bVarN.f2592j = -1;
        bVarN.f2590i = -1;
        bVarN.f2594k = -1;
        bVarN.f2596l = -1;
        ((ViewGroup.MarginLayoutParams) bVarN).topMargin = -1;
        view.setLayoutParams(bVarN);
    }

    private void C(View view, int i10, int i11, int i12, int i13) {
        ConstraintLayout.b bVarN = N(view);
        int[] iArr = this.F;
        bVarN.f2582e = iArr[i11];
        bVarN.f2590i = iArr[i10];
        bVarN.f2588h = iArr[(i11 + i13) - 1];
        bVarN.f2596l = iArr[(i10 + i12) - 1];
        view.setLayoutParams(bVarN);
    }

    private boolean D(boolean z10) {
        int[][] iArrO;
        int[][] iArrO2;
        if (this.f2012o == null || this.f2013p < 1 || this.f2015r < 1) {
            return false;
        }
        if (z10) {
            for (int i10 = 0; i10 < this.D.length; i10++) {
                int i11 = 0;
                while (true) {
                    boolean[][] zArr = this.D;
                    if (i11 < zArr[0].length) {
                        zArr[i10][i11] = true;
                        i11++;
                    }
                }
            }
            this.E.clear();
        }
        this.A = 0;
        z();
        String str = this.f2018u;
        boolean zG = (str == null || str.trim().isEmpty() || (iArrO2 = O(this.f2018u)) == null) ? true : G(iArrO2);
        String str2 = this.f2017t;
        if (str2 != null && !str2.trim().isEmpty() && (iArrO = O(this.f2017t)) != null) {
            zG &= H(this.f2539a, iArrO);
        }
        return (zG && y()) || !this.B;
    }

    private int E(int i10) {
        return this.f2023z == 1 ? i10 / this.f2013p : i10 % this.f2015r;
    }

    private int F(int i10) {
        return this.f2023z == 1 ? i10 % this.f2013p : i10 / this.f2015r;
    }

    private boolean G(int[][] iArr) {
        for (int i10 = 0; i10 < iArr.length; i10++) {
            int iF = F(iArr[i10][0]);
            int iE = E(iArr[i10][0]);
            int[] iArr2 = iArr[i10];
            if (!J(iF, iE, iArr2[1], iArr2[2])) {
                return false;
            }
        }
        return true;
    }

    private boolean H(int[] iArr, int[][] iArr2) {
        View[] viewArrN = n(this.f2012o);
        for (int i10 = 0; i10 < iArr2.length; i10++) {
            int iF = F(iArr2[i10][0]);
            int iE = E(iArr2[i10][0]);
            int[] iArr3 = iArr2[i10];
            if (!J(iF, iE, iArr3[1], iArr3[2])) {
                return false;
            }
            View view = viewArrN[i10];
            int[] iArr4 = iArr2[i10];
            C(view, iF, iE, iArr4[1], iArr4[2]);
            this.E.add(Integer.valueOf(iArr[i10]));
        }
        return true;
    }

    private void I() {
        boolean[][] zArr = (boolean[][]) Array.newInstance((Class<?>) Boolean.TYPE, this.f2013p, this.f2015r);
        this.D = zArr;
        for (boolean[] zArr2 : zArr) {
            Arrays.fill(zArr2, true);
        }
    }

    private boolean J(int i10, int i11, int i12, int i13) {
        for (int i14 = i10; i14 < i10 + i12; i14++) {
            for (int i15 = i11; i15 < i11 + i13; i15++) {
                boolean[][] zArr = this.D;
                if (i14 < zArr.length && i15 < zArr[0].length) {
                    boolean[] zArr2 = zArr[i14];
                    if (zArr2[i15]) {
                        zArr2[i15] = false;
                    }
                }
                return false;
            }
        }
        return true;
    }

    private boolean K(CharSequence charSequence) {
        return true;
    }

    private boolean L(String str) {
        return true;
    }

    private View M() {
        View view = new View(getContext());
        view.setId(View.generateViewId());
        view.setVisibility(4);
        this.f2012o.addView(view, new ConstraintLayout.b(0, 0));
        return view;
    }

    private ConstraintLayout.b N(View view) {
        return (ConstraintLayout.b) view.getLayoutParams();
    }

    private int[][] O(String str) {
        if (!K(str)) {
            return null;
        }
        String[] strArrSplit = str.split(",");
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, strArrSplit.length, 3);
        for (int i10 = 0; i10 < strArrSplit.length; i10++) {
            String[] strArrSplit2 = strArrSplit[i10].trim().split(":");
            String[] strArrSplit3 = strArrSplit2[1].split("x");
            iArr[i10][0] = Integer.parseInt(strArrSplit2[0]);
            iArr[i10][1] = Integer.parseInt(strArrSplit3[0]);
            iArr[i10][2] = Integer.parseInt(strArrSplit3[1]);
        }
        return iArr;
    }

    private float[] P(int i10, String str) {
        float[] fArr = null;
        if (str != null && !str.trim().isEmpty()) {
            String[] strArrSplit = str.split(",");
            if (strArrSplit.length != i10) {
                return null;
            }
            fArr = new float[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                fArr[i11] = Float.parseFloat(strArrSplit[i11].trim());
            }
        }
        return fArr;
    }

    private void Q() {
        int i10;
        int id2 = getId();
        int iMax = Math.max(this.f2013p, this.f2015r);
        float[] fArrP = P(this.f2015r, this.f2020w);
        int i11 = 0;
        ConstraintLayout.b bVarN = N(this.f2011n[0]);
        if (this.f2015r == 1) {
            A(this.f2011n[0]);
            bVarN.f2582e = id2;
            bVarN.f2588h = id2;
            this.f2011n[0].setLayoutParams(bVarN);
            return;
        }
        while (true) {
            i10 = this.f2015r;
            if (i11 >= i10) {
                break;
            }
            ConstraintLayout.b bVarN2 = N(this.f2011n[i11]);
            A(this.f2011n[i11]);
            if (fArrP != null) {
                bVarN2.L = fArrP[i11];
            }
            if (i11 > 0) {
                bVarN2.f2584f = this.F[i11 - 1];
            } else {
                bVarN2.f2582e = id2;
            }
            if (i11 < this.f2015r - 1) {
                bVarN2.f2586g = this.F[i11 + 1];
            } else {
                bVarN2.f2588h = id2;
            }
            if (i11 > 0) {
                ((ViewGroup.MarginLayoutParams) bVarN2).leftMargin = (int) this.f2021x;
            }
            this.f2011n[i11].setLayoutParams(bVarN2);
            i11++;
        }
        while (i10 < iMax) {
            ConstraintLayout.b bVarN3 = N(this.f2011n[i10]);
            A(this.f2011n[i10]);
            bVarN3.f2582e = id2;
            bVarN3.f2588h = id2;
            this.f2011n[i10].setLayoutParams(bVarN3);
            i10++;
        }
    }

    private void R() {
        int i10;
        int id2 = getId();
        int iMax = Math.max(this.f2013p, this.f2015r);
        float[] fArrP = P(this.f2013p, this.f2019v);
        int i11 = 0;
        if (this.f2013p == 1) {
            ConstraintLayout.b bVarN = N(this.f2011n[0]);
            B(this.f2011n[0]);
            bVarN.f2590i = id2;
            bVarN.f2596l = id2;
            this.f2011n[0].setLayoutParams(bVarN);
            return;
        }
        while (true) {
            i10 = this.f2013p;
            if (i11 >= i10) {
                break;
            }
            ConstraintLayout.b bVarN2 = N(this.f2011n[i11]);
            B(this.f2011n[i11]);
            if (fArrP != null) {
                bVarN2.M = fArrP[i11];
            }
            if (i11 > 0) {
                bVarN2.f2592j = this.F[i11 - 1];
            } else {
                bVarN2.f2590i = id2;
            }
            if (i11 < this.f2013p - 1) {
                bVarN2.f2594k = this.F[i11 + 1];
            } else {
                bVarN2.f2596l = id2;
            }
            if (i11 > 0) {
                ((ViewGroup.MarginLayoutParams) bVarN2).topMargin = (int) this.f2021x;
            }
            this.f2011n[i11].setLayoutParams(bVarN2);
            i11++;
        }
        while (i10 < iMax) {
            ConstraintLayout.b bVarN3 = N(this.f2011n[i10]);
            B(this.f2011n[i10]);
            bVarN3.f2590i = id2;
            bVarN3.f2596l = id2;
            this.f2011n[i10].setLayoutParams(bVarN3);
            i10++;
        }
    }

    private void S() {
        int i10;
        int i11 = this.f2014q;
        if (i11 != 0 && (i10 = this.f2016s) != 0) {
            this.f2013p = i11;
            this.f2015r = i10;
            return;
        }
        int i12 = this.f2016s;
        if (i12 > 0) {
            this.f2015r = i12;
            this.f2013p = ((this.f2540b + i12) - 1) / i12;
        } else if (i11 > 0) {
            this.f2013p = i11;
            this.f2015r = ((this.f2540b + i11) - 1) / i11;
        } else {
            int iSqrt = (int) (Math.sqrt(this.f2540b) + 1.5d);
            this.f2013p = iSqrt;
            this.f2015r = ((this.f2540b + iSqrt) - 1) / iSqrt;
        }
    }

    private int getNextPosition() {
        boolean z10 = false;
        int i10 = 0;
        while (!z10) {
            i10 = this.A;
            if (i10 >= this.f2013p * this.f2015r) {
                return -1;
            }
            int iF = F(i10);
            int iE = E(this.A);
            boolean[] zArr = this.D[iF];
            if (zArr[iE]) {
                zArr[iE] = false;
                z10 = true;
            }
            this.A++;
        }
        return i10;
    }

    private boolean y() {
        View[] viewArrN = n(this.f2012o);
        for (int i10 = 0; i10 < this.f2540b; i10++) {
            if (!this.E.contains(Integer.valueOf(this.f2539a[i10]))) {
                int nextPosition = getNextPosition();
                int iF = F(nextPosition);
                int iE = E(nextPosition);
                if (nextPosition == -1) {
                    return false;
                }
                C(viewArrN[i10], iF, iE, 1, 1);
            }
        }
        return true;
    }

    private void z() {
        int iMax = Math.max(this.f2013p, this.f2015r);
        View[] viewArr = this.f2011n;
        int i10 = 0;
        if (viewArr == null) {
            this.f2011n = new View[iMax];
            int i11 = 0;
            while (true) {
                View[] viewArr2 = this.f2011n;
                if (i11 >= viewArr2.length) {
                    break;
                }
                viewArr2[i11] = M();
                i11++;
            }
        } else if (iMax != viewArr.length) {
            View[] viewArr3 = new View[iMax];
            for (int i12 = 0; i12 < iMax; i12++) {
                View[] viewArr4 = this.f2011n;
                if (i12 < viewArr4.length) {
                    viewArr3[i12] = viewArr4[i12];
                } else {
                    viewArr3[i12] = M();
                }
            }
            int i13 = iMax;
            while (true) {
                View[] viewArr5 = this.f2011n;
                if (i13 >= viewArr5.length) {
                    break;
                }
                this.f2012o.removeView(viewArr5[i13]);
                i13++;
            }
            this.f2011n = viewArr3;
        }
        this.F = new int[iMax];
        while (true) {
            View[] viewArr6 = this.f2011n;
            if (i10 >= viewArr6.length) {
                R();
                Q();
                return;
            } else {
                this.F[i10] = viewArr6[i10].getId();
                i10++;
            }
        }
    }

    public String getColumnWeights() {
        return this.f2020w;
    }

    public int getColumns() {
        return this.f2016s;
    }

    public float getHorizontalGaps() {
        return this.f2021x;
    }

    public int getOrientation() {
        return this.f2023z;
    }

    public String getRowWeights() {
        return this.f2019v;
    }

    public int getRows() {
        return this.f2014q;
    }

    public String getSkips() {
        return this.f2018u;
    }

    public String getSpans() {
        return this.f2017t;
    }

    public float getVerticalGaps() {
        return this.f2022y;
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper
    protected void o(AttributeSet attributeSet) {
        super.o(attributeSet);
        this.f2543e = true;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, f.f2953m5);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == f.f3031s5) {
                    this.f2014q = typedArrayObtainStyledAttributes.getInteger(index, 0);
                } else if (index == f.f2979o5) {
                    this.f2016s = typedArrayObtainStyledAttributes.getInteger(index, 0);
                } else if (index == f.f3057u5) {
                    this.f2017t = typedArrayObtainStyledAttributes.getString(index);
                } else if (index == f.f3044t5) {
                    this.f2018u = typedArrayObtainStyledAttributes.getString(index);
                } else if (index == f.f3018r5) {
                    this.f2019v = typedArrayObtainStyledAttributes.getString(index);
                } else if (index == f.f2966n5) {
                    this.f2020w = typedArrayObtainStyledAttributes.getString(index);
                } else if (index == f.f3005q5) {
                    this.f2023z = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == f.f2992p5) {
                    this.f2021x = typedArrayObtainStyledAttributes.getDimension(index, 0.0f);
                } else if (index == f.f3096x5) {
                    this.f2022y = typedArrayObtainStyledAttributes.getDimension(index, 0.0f);
                } else if (index == f.f3083w5) {
                    this.B = typedArrayObtainStyledAttributes.getBoolean(index, false);
                } else if (index == f.f3070v5) {
                    this.C = typedArrayObtainStyledAttributes.getBoolean(index, false);
                }
            }
            S();
            I();
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f2012o = (ConstraintLayout) getParent();
        D(false);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (isInEditMode()) {
            Paint paint = new Paint();
            paint.setColor(-65536);
            paint.setStyle(Paint.Style.STROKE);
            int top = getTop();
            int left = getLeft();
            int bottom = getBottom();
            int right = getRight();
            for (View view : this.f2011n) {
                int left2 = view.getLeft() - left;
                int top2 = view.getTop() - top;
                int right2 = view.getRight() - left;
                int bottom2 = view.getBottom() - top;
                canvas.drawRect(left2, 0.0f, right2, bottom - top, paint);
                canvas.drawRect(0.0f, top2, right - left, bottom2, paint);
            }
        }
    }

    public void setColumnWeights(String str) {
        if (L(str)) {
            String str2 = this.f2020w;
            if (str2 == null || !str2.equals(str)) {
                this.f2020w = str;
                D(true);
                invalidate();
            }
        }
    }

    public void setColumns(int i10) {
        if (i10 <= 50 && this.f2016s != i10) {
            this.f2016s = i10;
            S();
            I();
            D(false);
            invalidate();
        }
    }

    public void setHorizontalGaps(float f10) {
        if (f10 >= 0.0f && this.f2021x != f10) {
            this.f2021x = f10;
            D(true);
            invalidate();
        }
    }

    public void setOrientation(int i10) {
        if ((i10 == 0 || i10 == 1) && this.f2023z != i10) {
            this.f2023z = i10;
            D(true);
            invalidate();
        }
    }

    public void setRowWeights(String str) {
        if (L(str)) {
            String str2 = this.f2019v;
            if (str2 == null || !str2.equals(str)) {
                this.f2019v = str;
                D(true);
                invalidate();
            }
        }
    }

    public void setRows(int i10) {
        if (i10 <= 50 && this.f2014q != i10) {
            this.f2014q = i10;
            S();
            I();
            D(false);
            invalidate();
        }
    }

    public void setSkips(String str) {
        if (K(str)) {
            String str2 = this.f2018u;
            if (str2 == null || !str2.equals(str)) {
                this.f2018u = str;
                D(true);
                invalidate();
            }
        }
    }

    public void setSpans(CharSequence charSequence) {
        if (K(charSequence)) {
            String str = this.f2017t;
            if (str == null || !str.contentEquals(charSequence)) {
                this.f2017t = charSequence.toString();
                D(true);
                invalidate();
            }
        }
    }

    public void setVerticalGaps(float f10) {
        if (f10 >= 0.0f && this.f2022y != f10) {
            this.f2022y = f10;
            D(true);
            invalidate();
        }
    }
}
