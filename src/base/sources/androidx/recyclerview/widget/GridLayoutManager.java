package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Set f6590m = Collections.unmodifiableSet(new HashSet(Arrays.asList(17, 66, 33, 130)));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    boolean f6591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f6592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int[] f6593c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    View[] f6594d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final SparseIntArray f6595e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final SparseIntArray f6596f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    d f6597g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final Rect f6598h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f6599i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f6600j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    int f6601k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    int f6602l;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class a {
        static boolean a(View view) {
            return view.isAccessibilityFocused();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b extends d {
        @Override // androidx.recyclerview.widget.GridLayoutManager.d
        public int e(int i10, int i11) {
            return i10 % i11;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.d
        public int f(int i10) {
            return 1;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static abstract class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final SparseIntArray f6605a = new SparseIntArray();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final SparseIntArray f6606b = new SparseIntArray();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f6607c = false;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f6608d = false;

        static int a(SparseIntArray sparseIntArray, int i10) {
            int size = sparseIntArray.size() - 1;
            int i11 = 0;
            while (i11 <= size) {
                int i12 = (i11 + size) >>> 1;
                if (sparseIntArray.keyAt(i12) < i10) {
                    i11 = i12 + 1;
                } else {
                    size = i12 - 1;
                }
            }
            int i13 = i11 - 1;
            if (i13 < 0 || i13 >= sparseIntArray.size()) {
                return -1;
            }
            return sparseIntArray.keyAt(i13);
        }

        int b(int i10, int i11) {
            if (!this.f6608d) {
                return d(i10, i11);
            }
            int i12 = this.f6606b.get(i10, -1);
            if (i12 != -1) {
                return i12;
            }
            int iD = d(i10, i11);
            this.f6606b.put(i10, iD);
            return iD;
        }

        int c(int i10, int i11) {
            if (!this.f6607c) {
                return e(i10, i11);
            }
            int i12 = this.f6605a.get(i10, -1);
            if (i12 != -1) {
                return i12;
            }
            int iE = e(i10, i11);
            this.f6605a.put(i10, iE);
            return iE;
        }

        public int d(int i10, int i11) {
            int i12;
            int i13;
            int iC;
            int iA;
            if (!this.f6608d || (iA = a(this.f6606b, i10)) == -1) {
                i12 = 0;
                i13 = 0;
                iC = 0;
            } else {
                i12 = this.f6606b.get(iA);
                i13 = iA + 1;
                iC = c(iA, i11) + f(iA);
                if (iC == i11) {
                    i12++;
                    iC = 0;
                }
            }
            int iF = f(i10);
            while (i13 < i10) {
                int iF2 = f(i13);
                iC += iF2;
                if (iC == i11) {
                    i12++;
                    iC = 0;
                } else if (iC > i11) {
                    i12++;
                    iC = iF2;
                }
                i13++;
            }
            return iC + iF > i11 ? i12 + 1 : i12;
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0024  */
        /* JADX WARN: Code duplicated, block: B:14:0x002b  */
        /* JADX WARN: Code duplicated, block: B:15:0x002d A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:16:0x002f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x002b -> B:17:0x0030). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x002d -> B:17:0x0030). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x002f -> B:17:0x0030). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        public int e(int r6, int r7) {
            /*
                r5 = this;
                int r0 = r5.f(r6)
                r1 = 0
                if (r0 != r7) goto L8
                return r1
            L8:
                boolean r2 = r5.f6607c
                if (r2 == 0) goto L20
                android.util.SparseIntArray r2 = r5.f6605a
                int r2 = a(r2, r6)
                if (r2 < 0) goto L20
                android.util.SparseIntArray r3 = r5.f6605a
                int r3 = r3.get(r2)
                int r4 = r5.f(r2)
                int r3 = r3 + r4
                goto L30
            L20:
                r2 = r1
                r3 = r2
            L22:
                if (r2 >= r6) goto L33
                int r4 = r5.f(r2)
                int r3 = r3 + r4
                if (r3 != r7) goto L2d
                r3 = r1
                goto L30
            L2d:
                if (r3 <= r7) goto L30
                r3 = r4
            L30:
                int r2 = r2 + 1
                goto L22
            L33:
                int r0 = r0 + r3
                if (r0 > r7) goto L37
                return r3
            L37:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.d.e(int, int):int");
        }

        public abstract int f(int i10);

        public void g() {
            this.f6606b.clear();
        }

        public void h() {
            this.f6605a.clear();
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f6591a = false;
        this.f6592b = -1;
        this.f6595e = new SparseIntArray();
        this.f6596f = new SparseIntArray();
        this.f6597g = new b();
        this.f6598h = new Rect();
        this.f6600j = -1;
        this.f6601k = -1;
        this.f6602l = -1;
        n0(RecyclerView.q.getProperties(context, attributeSet, i10, i11).f6743b);
    }

    private void K(RecyclerView.x xVar, RecyclerView.c0 c0Var, int i10, boolean z10) {
        int i11;
        int i12;
        int i13;
        int i14 = 0;
        if (z10) {
            i13 = 1;
            i12 = i10;
            i11 = 0;
        } else {
            i11 = i10 - 1;
            i12 = -1;
            i13 = -1;
        }
        while (i11 != i12) {
            View view = this.f6594d[i11];
            c cVar = (c) view.getLayoutParams();
            int iI0 = i0(xVar, c0Var, getPosition(view));
            cVar.f6604f = iI0;
            cVar.f6603e = i14;
            i14 += iI0;
            i11 += i13;
        }
    }

    private void L() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            c cVar = (c) getChildAt(i10).getLayoutParams();
            int iA = cVar.a();
            this.f6595e.put(iA, cVar.f());
            this.f6596f.put(iA, cVar.e());
        }
    }

    private void M(int i10) {
        this.f6593c = N(this.f6593c, this.f6592b, i10);
    }

    static int[] N(int[] iArr, int i10, int i11) {
        int i12;
        if (iArr == null || iArr.length != i10 + 1 || iArr[iArr.length - 1] != i11) {
            iArr = new int[i10 + 1];
        }
        int i13 = 0;
        iArr[0] = 0;
        int i14 = i11 / i10;
        int i15 = i11 % i10;
        int i16 = 0;
        for (int i17 = 1; i17 <= i10; i17++) {
            i13 += i15;
            if (i13 <= 0 || i10 - i13 >= i15) {
                i12 = i14;
            } else {
                i12 = i14 + 1;
                i13 -= i10;
            }
            i16 += i12;
            iArr[i17] = i16;
        }
        return iArr;
    }

    private void O() {
        this.f6595e.clear();
        this.f6596f.clear();
    }

    private int P(RecyclerView.c0 c0Var) {
        if (getChildCount() != 0 && c0Var.b() != 0) {
            ensureLayoutState();
            boolean zIsSmoothScrollbarEnabled = isSmoothScrollbarEnabled();
            View viewFindFirstVisibleChildClosestToStart = findFirstVisibleChildClosestToStart(!zIsSmoothScrollbarEnabled, true);
            View viewFindFirstVisibleChildClosestToEnd = findFirstVisibleChildClosestToEnd(!zIsSmoothScrollbarEnabled, true);
            if (viewFindFirstVisibleChildClosestToStart != null && viewFindFirstVisibleChildClosestToEnd != null) {
                int iB = this.f6597g.b(getPosition(viewFindFirstVisibleChildClosestToStart), this.f6592b);
                int iB2 = this.f6597g.b(getPosition(viewFindFirstVisibleChildClosestToEnd), this.f6592b);
                int iMax = this.mShouldReverseLayout ? Math.max(0, ((this.f6597g.b(c0Var.b() - 1, this.f6592b) + 1) - Math.max(iB, iB2)) - 1) : Math.max(0, Math.min(iB, iB2));
                if (zIsSmoothScrollbarEnabled) {
                    return Math.round((iMax * (Math.abs(this.mOrientationHelper.d(viewFindFirstVisibleChildClosestToEnd) - this.mOrientationHelper.g(viewFindFirstVisibleChildClosestToStart)) / ((this.f6597g.b(getPosition(viewFindFirstVisibleChildClosestToEnd), this.f6592b) - this.f6597g.b(getPosition(viewFindFirstVisibleChildClosestToStart), this.f6592b)) + 1))) + (this.mOrientationHelper.n() - this.mOrientationHelper.g(viewFindFirstVisibleChildClosestToStart)));
                }
                return iMax;
            }
        }
        return 0;
    }

    private int Q(RecyclerView.c0 c0Var) {
        if (getChildCount() != 0 && c0Var.b() != 0) {
            ensureLayoutState();
            View viewFindFirstVisibleChildClosestToStart = findFirstVisibleChildClosestToStart(!isSmoothScrollbarEnabled(), true);
            View viewFindFirstVisibleChildClosestToEnd = findFirstVisibleChildClosestToEnd(!isSmoothScrollbarEnabled(), true);
            if (viewFindFirstVisibleChildClosestToStart != null && viewFindFirstVisibleChildClosestToEnd != null) {
                if (!isSmoothScrollbarEnabled()) {
                    return this.f6597g.b(c0Var.b() - 1, this.f6592b) + 1;
                }
                return (int) (((this.mOrientationHelper.d(viewFindFirstVisibleChildClosestToEnd) - this.mOrientationHelper.g(viewFindFirstVisibleChildClosestToStart)) / ((this.f6597g.b(getPosition(viewFindFirstVisibleChildClosestToEnd), this.f6592b) - this.f6597g.b(getPosition(viewFindFirstVisibleChildClosestToStart), this.f6592b)) + 1)) * (this.f6597g.b(c0Var.b() - 1, this.f6592b) + 1));
            }
        }
        return 0;
    }

    private void R(RecyclerView.x xVar, RecyclerView.c0 c0Var, LinearLayoutManager.a aVar, int i10) {
        boolean z10 = i10 == 1;
        int iH0 = h0(xVar, c0Var, aVar.f6610b);
        if (z10) {
            while (iH0 > 0) {
                int i11 = aVar.f6610b;
                if (i11 <= 0) {
                    return;
                }
                int i12 = i11 - 1;
                aVar.f6610b = i12;
                iH0 = h0(xVar, c0Var, i12);
            }
            return;
        }
        int iB = c0Var.b() - 1;
        int i13 = aVar.f6610b;
        while (i13 < iB) {
            int i14 = i13 + 1;
            int iH1 = h0(xVar, c0Var, i14);
            if (iH1 <= iH0) {
                break;
            }
            i13 = i14;
            iH0 = iH1;
        }
        aVar.f6610b = i13;
    }

    private void S() {
        View[] viewArr = this.f6594d;
        if (viewArr == null || viewArr.length != this.f6592b) {
            this.f6594d = new View[this.f6592b];
        }
    }

    private View T() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            Objects.requireNonNull(childAt);
            if (a.a(childAt)) {
                return getChildAt(i10);
            }
        }
        return null;
    }

    private int W(int i10, int i11, int i12) {
        for (int i13 = i12 - 1; i13 >= 0; i13--) {
            int iC0 = c0(i13);
            int iA0 = a0(i13);
            if (iC0 < 0 || iA0 < 0) {
                break;
            }
            if (this.mOrientation == 1) {
                if (iC0 < i10 && b0(i13).contains(Integer.valueOf(i11))) {
                    this.f6601k = iC0;
                    return i13;
                }
            } else if (iC0 < i10 && iA0 == i11) {
                this.f6601k = ((Integer) Collections.max(d0(i13))).intValue();
                return i13;
            }
        }
        return -1;
    }

    private int X(int i10, int i11, int i12) {
        for (int i13 = i12 + 1; i13 < getItemCount(); i13++) {
            int iC0 = c0(i13);
            int iA0 = a0(i13);
            if (iC0 < 0 || iA0 < 0) {
                break;
            }
            if (this.mOrientation == 1) {
                if (iC0 > i10 && (iA0 == i11 || b0(i13).contains(Integer.valueOf(i11)))) {
                    this.f6601k = iC0;
                    return i13;
                }
            } else if (iC0 > i10 && iA0 == i11) {
                this.f6601k = c0(i13);
                return i13;
            }
        }
        return -1;
    }

    private int Y(int i10, int i11, int i12) {
        for (int i13 = i12 - 1; i13 >= 0; i13--) {
            int iC0 = c0(i13);
            int iA0 = a0(i13);
            if (iC0 < 0 || iA0 < 0) {
                break;
            }
            if (this.mOrientation == 1) {
                if ((iC0 == i10 && iA0 < i11) || iC0 < i10) {
                    this.f6601k = iC0;
                    this.f6602l = iA0;
                    return i13;
                }
            } else if (d0(i13).contains(Integer.valueOf(i10)) && iA0 < i11) {
                this.f6602l = iA0;
                return i13;
            }
        }
        return -1;
    }

    private int Z(int i10, int i11, int i12) {
        for (int i13 = i12 + 1; i13 < getItemCount(); i13++) {
            int iC0 = c0(i13);
            int iA0 = a0(i13);
            if (iC0 < 0 || iA0 < 0) {
                break;
            }
            if (this.mOrientation == 1) {
                if ((iC0 == i10 && iA0 > i11) || iC0 > i10) {
                    this.f6601k = iC0;
                    this.f6602l = iA0;
                    return i13;
                }
            } else if (iA0 > i11 && d0(i13).contains(Integer.valueOf(i10))) {
                this.f6602l = iA0;
                return i13;
            }
        }
        return -1;
    }

    private int a0(int i10) {
        if (this.mOrientation == 0) {
            RecyclerView recyclerView = this.mRecyclerView;
            return g0(recyclerView.f6638c, recyclerView.f6651i0, i10);
        }
        RecyclerView recyclerView2 = this.mRecyclerView;
        return h0(recyclerView2.f6638c, recyclerView2.f6651i0, i10);
    }

    private Set b0(int i10) {
        return e0(a0(i10), i10);
    }

    private int c0(int i10) {
        if (this.mOrientation == 1) {
            RecyclerView recyclerView = this.mRecyclerView;
            return g0(recyclerView.f6638c, recyclerView.f6651i0, i10);
        }
        RecyclerView recyclerView2 = this.mRecyclerView;
        return h0(recyclerView2.f6638c, recyclerView2.f6651i0, i10);
    }

    private Set d0(int i10) {
        return e0(c0(i10), i10);
    }

    private Set e0(int i10, int i11) {
        HashSet hashSet = new HashSet();
        RecyclerView recyclerView = this.mRecyclerView;
        int iI0 = i0(recyclerView.f6638c, recyclerView.f6651i0, i11);
        for (int i12 = i10; i12 < i10 + iI0; i12++) {
            hashSet.add(Integer.valueOf(i12));
        }
        return hashSet;
    }

    private int g0(RecyclerView.x xVar, RecyclerView.c0 c0Var, int i10) {
        if (!c0Var.e()) {
            return this.f6597g.b(i10, this.f6592b);
        }
        int iF = xVar.f(i10);
        if (iF != -1) {
            return this.f6597g.b(iF, this.f6592b);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i10);
        return 0;
    }

    private int h0(RecyclerView.x xVar, RecyclerView.c0 c0Var, int i10) {
        if (!c0Var.e()) {
            return this.f6597g.c(i10, this.f6592b);
        }
        int i11 = this.f6596f.get(i10, -1);
        if (i11 != -1) {
            return i11;
        }
        int iF = xVar.f(i10);
        if (iF != -1) {
            return this.f6597g.c(iF, this.f6592b);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i10);
        return 0;
    }

    private int i0(RecyclerView.x xVar, RecyclerView.c0 c0Var, int i10) {
        if (!c0Var.e()) {
            return this.f6597g.f(i10);
        }
        int i11 = this.f6595e.get(i10, -1);
        if (i11 != -1) {
            return i11;
        }
        int iF = xVar.f(i10);
        if (iF != -1) {
            return this.f6597g.f(iF);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i10);
        return 1;
    }

    private void j0(float f10, int i10) {
        M(Math.max(Math.round(f10 * this.f6592b), i10));
    }

    private boolean k0(int i10) {
        return (d0(i10).contains(Integer.valueOf(this.f6601k)) && b0(i10).contains(Integer.valueOf(this.f6602l))) ? false : true;
    }

    private void l0(View view, int i10, boolean z10) {
        int childMeasureSpec;
        int childMeasureSpec2;
        c cVar = (c) view.getLayoutParams();
        Rect rect = cVar.f6747b;
        int i11 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) cVar).topMargin + ((ViewGroup.MarginLayoutParams) cVar).bottomMargin;
        int i12 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) cVar).leftMargin + ((ViewGroup.MarginLayoutParams) cVar).rightMargin;
        int iF0 = f0(cVar.f6603e, cVar.f6604f);
        if (this.mOrientation == 1) {
            childMeasureSpec2 = RecyclerView.q.getChildMeasureSpec(iF0, i10, i12, ((ViewGroup.MarginLayoutParams) cVar).width, false);
            childMeasureSpec = RecyclerView.q.getChildMeasureSpec(this.mOrientationHelper.o(), getHeightMode(), i11, ((ViewGroup.MarginLayoutParams) cVar).height, true);
        } else {
            int childMeasureSpec3 = RecyclerView.q.getChildMeasureSpec(iF0, i10, i11, ((ViewGroup.MarginLayoutParams) cVar).height, false);
            int childMeasureSpec4 = RecyclerView.q.getChildMeasureSpec(this.mOrientationHelper.o(), getWidthMode(), i12, ((ViewGroup.MarginLayoutParams) cVar).width, true);
            childMeasureSpec = childMeasureSpec3;
            childMeasureSpec2 = childMeasureSpec4;
        }
        m0(view, childMeasureSpec2, childMeasureSpec, z10);
    }

    private void m0(View view, int i10, int i11, boolean z10) {
        RecyclerView.r rVar = (RecyclerView.r) view.getLayoutParams();
        if (z10 ? shouldReMeasureChild(view, i10, i11, rVar) : shouldMeasureChild(view, i10, i11, rVar)) {
            view.measure(i10, i11);
        }
    }

    private void p0() {
        int height;
        int paddingTop;
        if (getOrientation() == 1) {
            height = getWidth() - getPaddingRight();
            paddingTop = getPaddingLeft();
        } else {
            height = getHeight() - getPaddingBottom();
            paddingTop = getPaddingTop();
        }
        M(height - paddingTop);
    }

    int U(int i10) {
        if (i10 < 0 || this.mOrientation == 1) {
            return -1;
        }
        TreeMap treeMap = new TreeMap();
        for (int i11 = 0; i11 < getItemCount(); i11++) {
            for (Integer num : d0(i11)) {
                if (num.intValue() < 0) {
                    return -1;
                }
                if (!treeMap.containsKey(num)) {
                    treeMap.put(num, Integer.valueOf(i11));
                }
            }
        }
        for (Integer num2 : treeMap.keySet()) {
            int iIntValue = num2.intValue();
            if (iIntValue > i10) {
                int iIntValue2 = ((Integer) treeMap.get(num2)).intValue();
                this.f6601k = iIntValue;
                this.f6602l = 0;
                return iIntValue2;
            }
        }
        return -1;
    }

    int V(int i10) {
        if (i10 < 0 || this.mOrientation == 1) {
            return -1;
        }
        TreeMap treeMap = new TreeMap(Collections.reverseOrder());
        for (int i11 = 0; i11 < getItemCount(); i11++) {
            for (Integer num : d0(i11)) {
                if (num.intValue() < 0) {
                    return -1;
                }
                treeMap.put(num, Integer.valueOf(i11));
            }
        }
        for (Integer num2 : treeMap.keySet()) {
            int iIntValue = num2.intValue();
            if (iIntValue < i10) {
                int iIntValue2 = ((Integer) treeMap.get(num2)).intValue();
                this.f6601k = iIntValue;
                this.f6602l = a0(iIntValue2);
                return iIntValue2;
            }
        }
        return -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean checkLayoutParams(RecyclerView.r rVar) {
        return rVar instanceof c;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    void collectPrefetchPositionsForLayoutState(RecyclerView.c0 c0Var, LinearLayoutManager.c cVar, RecyclerView.q.c cVar2) {
        int iF = this.f6592b;
        for (int i10 = 0; i10 < this.f6592b && cVar.c(c0Var) && iF > 0; i10++) {
            int i11 = cVar.f6621d;
            cVar2.a(i11, Math.max(0, cVar.f6624g));
            iF -= this.f6597g.f(i11);
            cVar.f6621d += cVar.f6622e;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.q
    public int computeHorizontalScrollOffset(RecyclerView.c0 c0Var) {
        return this.f6599i ? P(c0Var) : super.computeHorizontalScrollOffset(c0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.q
    public int computeHorizontalScrollRange(RecyclerView.c0 c0Var) {
        return this.f6599i ? Q(c0Var) : super.computeHorizontalScrollRange(c0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.q
    public int computeVerticalScrollOffset(RecyclerView.c0 c0Var) {
        return this.f6599i ? P(c0Var) : super.computeVerticalScrollOffset(c0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.q
    public int computeVerticalScrollRange(RecyclerView.c0 c0Var) {
        return this.f6599i ? Q(c0Var) : super.computeVerticalScrollRange(c0Var);
    }

    int f0(int i10, int i11) {
        if (this.mOrientation != 1 || !isLayoutRTL()) {
            int[] iArr = this.f6593c;
            return iArr[i11 + i10] - iArr[i10];
        }
        int[] iArr2 = this.f6593c;
        int i12 = this.f6592b;
        return iArr2[i12 - i10] - iArr2[(i12 - i10) - i11];
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    View findReferenceChild(RecyclerView.x xVar, RecyclerView.c0 c0Var, boolean z10, boolean z11) {
        int i10;
        int childCount;
        int childCount2 = getChildCount();
        int i11 = 1;
        if (z11) {
            childCount = getChildCount() - 1;
            i10 = -1;
            i11 = -1;
        } else {
            i10 = childCount2;
            childCount = 0;
        }
        int iB = c0Var.b();
        ensureLayoutState();
        int iN = this.mOrientationHelper.n();
        int i12 = this.mOrientationHelper.i();
        View view = null;
        View view2 = null;
        while (childCount != i10) {
            View childAt = getChildAt(childCount);
            int position = getPosition(childAt);
            if (position >= 0 && position < iB && h0(xVar, c0Var, position) == 0) {
                if (((RecyclerView.r) childAt.getLayoutParams()).c()) {
                    if (view2 == null) {
                        view2 = childAt;
                    }
                } else {
                    if (this.mOrientationHelper.g(childAt) < i12 && this.mOrientationHelper.d(childAt) >= iN) {
                        return childAt;
                    }
                    if (view == null) {
                        view = childAt;
                    }
                }
            }
            childCount += i11;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.q
    public RecyclerView.r generateDefaultLayoutParams() {
        return this.mOrientation == 0 ? new c(-2, -1) : new c(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public RecyclerView.r generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int getColumnCountForAccessibility(RecyclerView.x xVar, RecyclerView.c0 c0Var) {
        if (this.mOrientation == 1) {
            return Math.min(this.f6592b, getItemCount());
        }
        if (c0Var.b() < 1) {
            return 0;
        }
        return g0(xVar, c0Var, c0Var.b() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int getRowCountForAccessibility(RecyclerView.x xVar, RecyclerView.c0 c0Var) {
        if (this.mOrientation == 0) {
            return Math.min(this.f6592b, getItemCount());
        }
        if (c0Var.b() < 1) {
            return 0;
        }
        return g0(xVar, c0Var, c0Var.b() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    void layoutChunk(RecyclerView.x xVar, RecyclerView.c0 c0Var, LinearLayoutManager.c cVar, LinearLayoutManager.b bVar) {
        int i10;
        int i11;
        int paddingLeft;
        int paddingTop;
        int iF;
        int iF2;
        int i12;
        int childMeasureSpec;
        int childMeasureSpec2;
        View viewD;
        int iM = this.mOrientationHelper.m();
        boolean z10 = iM != 1073741824;
        int i13 = getChildCount() > 0 ? this.f6593c[this.f6592b] : 0;
        if (z10) {
            p0();
        }
        boolean z11 = cVar.f6622e == 1;
        int iH0 = this.f6592b;
        if (!z11) {
            iH0 = h0(xVar, c0Var, cVar.f6621d) + i0(xVar, c0Var, cVar.f6621d);
        }
        int i14 = 0;
        while (i14 < this.f6592b && cVar.c(c0Var) && iH0 > 0) {
            int i15 = cVar.f6621d;
            int iI0 = i0(xVar, c0Var, i15);
            if (iI0 > this.f6592b) {
                throw new IllegalArgumentException("Item at position " + i15 + " requires " + iI0 + " spans but GridLayoutManager has only " + this.f6592b + " spans.");
            }
            iH0 -= iI0;
            if (iH0 < 0 || (viewD = cVar.d(xVar)) == null) {
                break;
            }
            this.f6594d[i14] = viewD;
            i14++;
        }
        if (i14 == 0) {
            bVar.f6615b = true;
            return;
        }
        K(xVar, c0Var, i14, z11);
        float f10 = 0.0f;
        int i16 = 0;
        for (int i17 = 0; i17 < i14; i17++) {
            View view = this.f6594d[i17];
            if (cVar.f6629l == null) {
                if (z11) {
                    addView(view);
                } else {
                    addView(view, 0);
                }
            } else if (z11) {
                addDisappearingView(view);
            } else {
                addDisappearingView(view, 0);
            }
            calculateItemDecorationsForChild(view, this.f6598h);
            l0(view, iM, false);
            int iE = this.mOrientationHelper.e(view);
            if (iE > i16) {
                i16 = iE;
            }
            float f11 = (this.mOrientationHelper.f(view) * 1.0f) / ((c) view.getLayoutParams()).f6604f;
            if (f11 > f10) {
                f10 = f11;
            }
        }
        if (z10) {
            j0(f10, i13);
            i16 = 0;
            for (int i18 = 0; i18 < i14; i18++) {
                View view2 = this.f6594d[i18];
                l0(view2, 1073741824, true);
                int iE2 = this.mOrientationHelper.e(view2);
                if (iE2 > i16) {
                    i16 = iE2;
                }
            }
        }
        for (int i19 = 0; i19 < i14; i19++) {
            View view3 = this.f6594d[i19];
            if (this.mOrientationHelper.e(view3) != i16) {
                c cVar2 = (c) view3.getLayoutParams();
                Rect rect = cVar2.f6747b;
                int i20 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) cVar2).topMargin + ((ViewGroup.MarginLayoutParams) cVar2).bottomMargin;
                int i21 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) cVar2).leftMargin + ((ViewGroup.MarginLayoutParams) cVar2).rightMargin;
                int iF0 = f0(cVar2.f6603e, cVar2.f6604f);
                if (this.mOrientation == 1) {
                    childMeasureSpec2 = RecyclerView.q.getChildMeasureSpec(iF0, 1073741824, i21, ((ViewGroup.MarginLayoutParams) cVar2).width, false);
                    childMeasureSpec = View.MeasureSpec.makeMeasureSpec(i16 - i20, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i16 - i21, 1073741824);
                    childMeasureSpec = RecyclerView.q.getChildMeasureSpec(iF0, 1073741824, i20, ((ViewGroup.MarginLayoutParams) cVar2).height, false);
                    childMeasureSpec2 = iMakeMeasureSpec;
                }
                m0(view3, childMeasureSpec2, childMeasureSpec, true);
            }
        }
        bVar.f6614a = i16;
        if (this.mOrientation == 1) {
            if (cVar.f6623f == -1) {
                iF2 = cVar.f6619b;
                i12 = iF2 - i16;
            } else {
                i12 = cVar.f6619b;
                iF2 = i12 + i16;
            }
            paddingTop = i12;
            iF = 0;
            paddingLeft = 0;
        } else {
            if (cVar.f6623f == -1) {
                i11 = cVar.f6619b;
                i10 = i11 - i16;
            } else {
                i10 = cVar.f6619b;
                i11 = i10 + i16;
            }
            paddingLeft = i10;
            paddingTop = 0;
            iF = i11;
            iF2 = 0;
        }
        for (int i22 = 0; i22 < i14; i22++) {
            View view4 = this.f6594d[i22];
            c cVar3 = (c) view4.getLayoutParams();
            if (this.mOrientation != 1) {
                paddingTop = this.f6593c[cVar3.f6603e] + getPaddingTop();
                iF2 = this.mOrientationHelper.f(view4) + paddingTop;
            } else if (isLayoutRTL()) {
                iF = getPaddingLeft() + this.f6593c[this.f6592b - cVar3.f6603e];
                paddingLeft = iF - this.mOrientationHelper.f(view4);
            } else {
                paddingLeft = this.f6593c[cVar3.f6603e] + getPaddingLeft();
                iF = this.mOrientationHelper.f(view4) + paddingLeft;
            }
            int i23 = iF2;
            int i24 = paddingTop;
            int i25 = iF;
            int i26 = paddingLeft;
            layoutDecoratedWithMargins(view4, i26, i24, i25, i23);
            iF2 = i23;
            paddingLeft = i26;
            iF = i25;
            paddingTop = i24;
            if (cVar3.c() || cVar3.b()) {
                bVar.f6616c = true;
            }
            bVar.f6617d = view4.hasFocusable() | bVar.f6617d;
        }
        Arrays.fill(this.f6594d, (Object) null);
    }

    public void n0(int i10) {
        if (i10 == this.f6592b) {
            return;
        }
        this.f6591a = true;
        if (i10 >= 1) {
            this.f6592b = i10;
            this.f6597g.h();
            requestLayout();
        } else {
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + i10);
        }
    }

    public void o0(d dVar) {
        this.f6597g = dVar;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    void onAnchorReady(RecyclerView.x xVar, RecyclerView.c0 c0Var, LinearLayoutManager.a aVar, int i10) {
        super.onAnchorReady(xVar, c0Var, aVar, i10);
        p0();
        if (c0Var.b() > 0 && !c0Var.e()) {
            R(xVar, c0Var, aVar, i10);
        }
        S();
    }

    /* JADX WARN: Code duplicated, block: B:72:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:73:0x0111  */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d3, code lost:
    
        if (r13 == (r2 > r15)) goto L47;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View onFocusSearchFailed(android.view.View r24, int r25, androidx.recyclerview.widget.RecyclerView.x r26, androidx.recyclerview.widget.RecyclerView.c0 r27) {
        /*
            Method dump skipped, instruction units count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.onFocusSearchFailed(android.view.View, int, androidx.recyclerview.widget.RecyclerView$x, androidx.recyclerview.widget.RecyclerView$c0):android.view.View");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.q
    public void onInitializeAccessibilityNodeInfo(RecyclerView.x xVar, RecyclerView.c0 c0Var, o0.p pVar) {
        super.onInitializeAccessibilityNodeInfo(xVar, c0Var, pVar);
        pVar.u0(GridView.class.getName());
        RecyclerView.h hVar = this.mRecyclerView.f6658m;
        if (hVar == null || hVar.getItemCount() <= 1) {
            return;
        }
        pVar.b(o0.p.a.V);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void onInitializeAccessibilityNodeInfoForItem(RecyclerView.x xVar, RecyclerView.c0 c0Var, View view, o0.p pVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof c)) {
            super.onInitializeAccessibilityNodeInfoForItem(view, pVar);
            return;
        }
        c cVar = (c) layoutParams;
        int iG0 = g0(xVar, c0Var, cVar.a());
        if (this.mOrientation == 0) {
            pVar.x0(o0.p.h.a(cVar.e(), cVar.f(), iG0, 1, false, false));
        } else {
            pVar.x0(o0.p.h.a(iG0, 1, cVar.e(), cVar.f(), false, false));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void onItemsAdded(RecyclerView recyclerView, int i10, int i11) {
        this.f6597g.h();
        this.f6597g.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void onItemsChanged(RecyclerView recyclerView) {
        this.f6597g.h();
        this.f6597g.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void onItemsMoved(RecyclerView recyclerView, int i10, int i11, int i12) {
        this.f6597g.h();
        this.f6597g.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void onItemsRemoved(RecyclerView recyclerView, int i10, int i11) {
        this.f6597g.h();
        this.f6597g.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void onItemsUpdated(RecyclerView recyclerView, int i10, int i11, Object obj) {
        this.f6597g.h();
        this.f6597g.g();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.q
    public void onLayoutChildren(RecyclerView.x xVar, RecyclerView.c0 c0Var) {
        if (c0Var.e()) {
            L();
        }
        super.onLayoutChildren(xVar, c0Var);
        O();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.q
    public void onLayoutCompleted(RecyclerView.c0 c0Var) {
        View viewFindViewByPosition;
        super.onLayoutCompleted(c0Var);
        this.f6591a = false;
        int i10 = this.f6600j;
        if (i10 == -1 || (viewFindViewByPosition = findViewByPosition(i10)) == null) {
            return;
        }
        viewFindViewByPosition.sendAccessibilityEvent(67108864);
        this.f6600j = -1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.q
    boolean performAccessibilityAction(int i10, Bundle bundle) {
        RecyclerView.g0 g0VarO0;
        int iY;
        if (i10 != o0.p.a.V.b() || i10 == -1) {
            if (i10 != 16908343 || bundle == null) {
                return super.performAccessibilityAction(i10, bundle);
            }
            int i11 = bundle.getInt("android.view.accessibility.action.ARGUMENT_ROW_INT", -1);
            int i12 = bundle.getInt("android.view.accessibility.action.ARGUMENT_COLUMN_INT", -1);
            if (i11 != -1 && i12 != -1) {
                int itemCount = this.mRecyclerView.f6658m.getItemCount();
                int i13 = 0;
                while (true) {
                    if (i13 >= itemCount) {
                        i13 = -1;
                        break;
                    }
                    RecyclerView recyclerView = this.mRecyclerView;
                    int iH0 = h0(recyclerView.f6638c, recyclerView.f6651i0, i13);
                    RecyclerView recyclerView2 = this.mRecyclerView;
                    int iG0 = g0(recyclerView2.f6638c, recyclerView2.f6651i0, i13);
                    if (this.mOrientation != 1) {
                        if (iH0 == i11 && iG0 == i12) {
                            break;
                        }
                        i13++;
                    } else {
                        if (iH0 == i12 && iG0 == i11) {
                            break;
                        }
                        i13++;
                    }
                }
                if (i13 > -1) {
                    scrollToPositionWithOffset(i13, 0);
                    return true;
                }
            }
            return false;
        }
        View viewT = T();
        if (viewT == null || bundle == null) {
            return false;
        }
        int i14 = bundle.getInt("android.view.accessibility.action.ARGUMENT_DIRECTION_INT", -1);
        if (!f6590m.contains(Integer.valueOf(i14)) || (g0VarO0 = this.mRecyclerView.o0(viewT)) == null) {
            return false;
        }
        int absoluteAdapterPosition = g0VarO0.getAbsoluteAdapterPosition();
        int iC0 = c0(absoluteAdapterPosition);
        int iA0 = a0(absoluteAdapterPosition);
        if (iC0 >= 0 && iA0 >= 0) {
            if (k0(absoluteAdapterPosition)) {
                this.f6601k = iC0;
                this.f6602l = iA0;
            }
            int i15 = this.f6601k;
            if (i15 == -1) {
                i15 = iC0;
            }
            int i16 = this.f6602l;
            if (i16 != -1) {
                iA0 = i16;
            }
            if (i14 == 17) {
                iY = Y(i15, iA0, absoluteAdapterPosition);
            } else if (i14 == 33) {
                iY = W(i15, iA0, absoluteAdapterPosition);
            } else if (i14 == 66) {
                iY = Z(i15, iA0, absoluteAdapterPosition);
            } else {
                if (i14 != 130) {
                    return false;
                }
                iY = X(i15, iA0, absoluteAdapterPosition);
            }
            if (iY == -1 && this.mOrientation == 0) {
                if (i14 == 17) {
                    iY = V(iC0);
                } else if (i14 == 66) {
                    iY = U(iC0);
                }
            }
            if (iY != -1) {
                scrollToPosition(iY);
                this.f6600j = iY;
                return true;
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.q
    public int scrollHorizontallyBy(int i10, RecyclerView.x xVar, RecyclerView.c0 c0Var) {
        p0();
        S();
        return super.scrollHorizontallyBy(i10, xVar, c0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.q
    public int scrollVerticallyBy(int i10, RecyclerView.x xVar, RecyclerView.c0 c0Var) {
        p0();
        S();
        return super.scrollVerticallyBy(i10, xVar, c0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void setMeasuredDimension(Rect rect, int i10, int i11) {
        int iChooseSize;
        int iChooseSize2;
        if (this.f6593c == null) {
            super.setMeasuredDimension(rect, i10, i11);
        }
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.mOrientation == 1) {
            iChooseSize2 = RecyclerView.q.chooseSize(i11, rect.height() + paddingTop, getMinimumHeight());
            int[] iArr = this.f6593c;
            iChooseSize = RecyclerView.q.chooseSize(i10, iArr[iArr.length - 1] + paddingLeft, getMinimumWidth());
        } else {
            iChooseSize = RecyclerView.q.chooseSize(i10, rect.width() + paddingLeft, getMinimumWidth());
            int[] iArr2 = this.f6593c;
            iChooseSize2 = RecyclerView.q.chooseSize(i11, iArr2[iArr2.length - 1] + paddingTop, getMinimumHeight());
        }
        setMeasuredDimension(iChooseSize, iChooseSize2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void setStackFromEnd(boolean z10) {
        if (z10) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.setStackFromEnd(false);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.q
    public boolean supportsPredictiveItemAnimations() {
        return this.mPendingSavedState == null && !this.f6591a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public RecyclerView.r generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new c((ViewGroup.MarginLayoutParams) layoutParams) : new c(layoutParams);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class c extends RecyclerView.r {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f6603e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f6604f;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f6603e = -1;
            this.f6604f = 0;
        }

        public int e() {
            return this.f6603e;
        }

        public int f() {
            return this.f6604f;
        }

        public c(int i10, int i11) {
            super(i10, i11);
            this.f6603e = -1;
            this.f6604f = 0;
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f6603e = -1;
            this.f6604f = 0;
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f6603e = -1;
            this.f6604f = 0;
        }
    }

    public GridLayoutManager(Context context, int i10) {
        super(context);
        this.f6591a = false;
        this.f6592b = -1;
        this.f6595e = new SparseIntArray();
        this.f6596f = new SparseIntArray();
        this.f6597g = new b();
        this.f6598h = new Rect();
        this.f6600j = -1;
        this.f6601k = -1;
        this.f6602l = -1;
        n0(i10);
    }

    public GridLayoutManager(Context context, int i10, int i11, boolean z10) {
        super(context, i11, z10);
        this.f6591a = false;
        this.f6592b = -1;
        this.f6595e = new SparseIntArray();
        this.f6596f = new SparseIntArray();
        this.f6597g = new b();
        this.f6598h = new Rect();
        this.f6600j = -1;
        this.f6601k = -1;
        this.f6602l = -1;
        n0(i10);
    }
}
