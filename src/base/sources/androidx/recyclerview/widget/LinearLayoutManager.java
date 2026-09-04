package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutManager extends RecyclerView.q implements RecyclerView.b0.b {
    static final boolean DEBUG = false;
    public static final int HORIZONTAL = 0;
    public static final int INVALID_OFFSET = Integer.MIN_VALUE;
    private static final float MAX_SCROLL_FACTOR = 0.33333334f;
    private static final String TAG = "LinearLayoutManager";
    public static final int VERTICAL = 1;
    final a mAnchorInfo;
    private int mInitialPrefetchItemCount;
    private boolean mLastStackFromEnd;
    private final b mLayoutChunkResult;
    private c mLayoutState;
    int mOrientation;
    s mOrientationHelper;
    d mPendingSavedState;
    int mPendingScrollPosition;
    int mPendingScrollPositionOffset;
    private boolean mRecycleChildrenOnDetach;
    private int[] mReusableIntPair;
    private boolean mReverseLayout;
    boolean mShouldReverseLayout;
    private boolean mSmoothScrollbarEnabled;
    private boolean mStackFromEnd;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        s f6609a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f6610b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f6611c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f6612d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f6613e;

        a() {
            e();
        }

        void a() {
            this.f6611c = this.f6612d ? this.f6609a.i() : this.f6609a.n();
        }

        public void b(View view, int i10) {
            if (this.f6612d) {
                this.f6611c = this.f6609a.d(view) + this.f6609a.p();
            } else {
                this.f6611c = this.f6609a.g(view);
            }
            this.f6610b = i10;
        }

        public void c(View view, int i10) {
            int iP = this.f6609a.p();
            if (iP >= 0) {
                b(view, i10);
                return;
            }
            this.f6610b = i10;
            if (this.f6612d) {
                int i11 = (this.f6609a.i() - iP) - this.f6609a.d(view);
                this.f6611c = this.f6609a.i() - i11;
                if (i11 > 0) {
                    int iE = this.f6611c - this.f6609a.e(view);
                    int iN = this.f6609a.n();
                    int iMin = iE - (iN + Math.min(this.f6609a.g(view) - iN, 0));
                    if (iMin < 0) {
                        this.f6611c += Math.min(i11, -iMin);
                        return;
                    }
                    return;
                }
                return;
            }
            int iG = this.f6609a.g(view);
            int iN2 = iG - this.f6609a.n();
            this.f6611c = iG;
            if (iN2 > 0) {
                int i12 = (this.f6609a.i() - Math.min(0, (this.f6609a.i() - iP) - this.f6609a.d(view))) - (iG + this.f6609a.e(view));
                if (i12 < 0) {
                    this.f6611c -= Math.min(iN2, -i12);
                }
            }
        }

        boolean d(View view, RecyclerView.c0 c0Var) {
            RecyclerView.r rVar = (RecyclerView.r) view.getLayoutParams();
            return !rVar.c() && rVar.a() >= 0 && rVar.a() < c0Var.b();
        }

        void e() {
            this.f6610b = -1;
            this.f6611c = Integer.MIN_VALUE;
            this.f6612d = false;
            this.f6613e = false;
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f6610b + ", mCoordinate=" + this.f6611c + ", mLayoutFromEnd=" + this.f6612d + ", mValid=" + this.f6613e + '}';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    protected static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f6614a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f6615b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f6616c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f6617d;

        protected b() {
        }

        void a() {
            this.f6614a = 0;
            this.f6615b = false;
            this.f6616c = false;
            this.f6617d = false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f6619b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f6620c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f6621d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f6622e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f6623f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f6624g;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f6628k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        boolean f6630m;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f6618a = true;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f6625h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f6626i = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        boolean f6627j = false;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        List f6629l = null;

        c() {
        }

        private View e() {
            int size = this.f6629l.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = ((RecyclerView.g0) this.f6629l.get(i10)).itemView;
                RecyclerView.r rVar = (RecyclerView.r) view.getLayoutParams();
                if (!rVar.c() && this.f6621d == rVar.a()) {
                    b(view);
                    return view;
                }
            }
            return null;
        }

        public void a() {
            b(null);
        }

        public void b(View view) {
            View viewF = f(view);
            if (viewF == null) {
                this.f6621d = -1;
            } else {
                this.f6621d = ((RecyclerView.r) viewF.getLayoutParams()).a();
            }
        }

        boolean c(RecyclerView.c0 c0Var) {
            int i10 = this.f6621d;
            return i10 >= 0 && i10 < c0Var.b();
        }

        View d(RecyclerView.x xVar) {
            if (this.f6629l != null) {
                return e();
            }
            View viewO = xVar.o(this.f6621d);
            this.f6621d += this.f6622e;
            return viewO;
        }

        public View f(View view) {
            int iA;
            int size = this.f6629l.size();
            View view2 = null;
            int i10 = Integer.MAX_VALUE;
            for (int i11 = 0; i11 < size; i11++) {
                View view3 = ((RecyclerView.g0) this.f6629l.get(i11)).itemView;
                RecyclerView.r rVar = (RecyclerView.r) view3.getLayoutParams();
                if (view3 != view && !rVar.c() && (iA = (rVar.a() - this.f6621d) * this.f6622e) >= 0 && iA < i10) {
                    if (iA == 0) {
                        return view3;
                    }
                    view2 = view3;
                    i10 = iA;
                }
            }
            return view2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class d implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f6631a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f6632b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f6633c;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public d createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public d[] newArray(int i10) {
                return new d[i10];
            }
        }

        public d() {
        }

        boolean a() {
            return this.f6631a >= 0;
        }

        void b() {
            this.f6631a = -1;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f6631a);
            parcel.writeInt(this.f6632b);
            parcel.writeInt(this.f6633c ? 1 : 0);
        }

        d(Parcel parcel) {
            this.f6631a = parcel.readInt();
            this.f6632b = parcel.readInt();
            this.f6633c = parcel.readInt() == 1;
        }

        public d(d dVar) {
            this.f6631a = dVar.f6631a;
            this.f6632b = dVar.f6632b;
            this.f6633c = dVar.f6633c;
        }
    }

    public LinearLayoutManager(Context context) {
        this(context, 1, false);
    }

    private void A(RecyclerView.x xVar, int i10, int i11) {
        if (i10 < 0) {
            return;
        }
        int i12 = i10 - i11;
        int childCount = getChildCount();
        if (!this.mShouldReverseLayout) {
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt = getChildAt(i13);
                if (this.mOrientationHelper.d(childAt) > i12 || this.mOrientationHelper.q(childAt) > i12) {
                    y(xVar, 0, i13);
                    return;
                }
            }
            return;
        }
        int i14 = childCount - 1;
        for (int i15 = i14; i15 >= 0; i15--) {
            View childAt2 = getChildAt(i15);
            if (this.mOrientationHelper.d(childAt2) > i12 || this.mOrientationHelper.q(childAt2) > i12) {
                y(xVar, i14, i15);
                return;
            }
        }
    }

    private void B() {
        if (this.mOrientation == 1 || !isLayoutRTL()) {
            this.mShouldReverseLayout = this.mReverseLayout;
        } else {
            this.mShouldReverseLayout = !this.mReverseLayout;
        }
    }

    private boolean C(RecyclerView.x xVar, RecyclerView.c0 c0Var, a aVar) {
        View viewFindReferenceChild;
        boolean z10 = false;
        if (getChildCount() == 0) {
            return false;
        }
        View focusedChild = getFocusedChild();
        if (focusedChild != null && aVar.d(focusedChild, c0Var)) {
            aVar.c(focusedChild, getPosition(focusedChild));
            return true;
        }
        boolean z11 = this.mLastStackFromEnd;
        boolean z12 = this.mStackFromEnd;
        if (z11 != z12 || (viewFindReferenceChild = findReferenceChild(xVar, c0Var, aVar.f6612d, z12)) == null) {
            return false;
        }
        aVar.b(viewFindReferenceChild, getPosition(viewFindReferenceChild));
        if (!c0Var.e() && supportsPredictiveItemAnimations()) {
            int iG = this.mOrientationHelper.g(viewFindReferenceChild);
            int iD = this.mOrientationHelper.d(viewFindReferenceChild);
            int iN = this.mOrientationHelper.n();
            int i10 = this.mOrientationHelper.i();
            boolean z13 = iD <= iN && iG < iN;
            if (iG >= i10 && iD > i10) {
                z10 = true;
            }
            if (z13 || z10) {
                if (aVar.f6612d) {
                    iN = i10;
                }
                aVar.f6611c = iN;
            }
        }
        return true;
    }

    private boolean D(RecyclerView.c0 c0Var, a aVar) {
        int i10;
        if (!c0Var.e() && (i10 = this.mPendingScrollPosition) != -1) {
            if (i10 >= 0 && i10 < c0Var.b()) {
                aVar.f6610b = this.mPendingScrollPosition;
                d dVar = this.mPendingSavedState;
                if (dVar != null && dVar.a()) {
                    boolean z10 = this.mPendingSavedState.f6633c;
                    aVar.f6612d = z10;
                    if (z10) {
                        aVar.f6611c = this.mOrientationHelper.i() - this.mPendingSavedState.f6632b;
                    } else {
                        aVar.f6611c = this.mOrientationHelper.n() + this.mPendingSavedState.f6632b;
                    }
                    return true;
                }
                if (this.mPendingScrollPositionOffset != Integer.MIN_VALUE) {
                    boolean z11 = this.mShouldReverseLayout;
                    aVar.f6612d = z11;
                    if (z11) {
                        aVar.f6611c = this.mOrientationHelper.i() - this.mPendingScrollPositionOffset;
                    } else {
                        aVar.f6611c = this.mOrientationHelper.n() + this.mPendingScrollPositionOffset;
                    }
                    return true;
                }
                View viewFindViewByPosition = findViewByPosition(this.mPendingScrollPosition);
                if (viewFindViewByPosition == null) {
                    if (getChildCount() > 0) {
                        aVar.f6612d = (this.mPendingScrollPosition < getPosition(getChildAt(0))) == this.mShouldReverseLayout;
                    }
                    aVar.a();
                } else {
                    if (this.mOrientationHelper.e(viewFindViewByPosition) > this.mOrientationHelper.o()) {
                        aVar.a();
                        return true;
                    }
                    if (this.mOrientationHelper.g(viewFindViewByPosition) - this.mOrientationHelper.n() < 0) {
                        aVar.f6611c = this.mOrientationHelper.n();
                        aVar.f6612d = false;
                        return true;
                    }
                    if (this.mOrientationHelper.i() - this.mOrientationHelper.d(viewFindViewByPosition) < 0) {
                        aVar.f6611c = this.mOrientationHelper.i();
                        aVar.f6612d = true;
                        return true;
                    }
                    aVar.f6611c = aVar.f6612d ? this.mOrientationHelper.d(viewFindViewByPosition) + this.mOrientationHelper.p() : this.mOrientationHelper.g(viewFindViewByPosition);
                }
                return true;
            }
            this.mPendingScrollPosition = -1;
            this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        }
        return false;
    }

    private void E(RecyclerView.x xVar, RecyclerView.c0 c0Var, a aVar) {
        if (D(c0Var, aVar) || C(xVar, c0Var, aVar)) {
            return;
        }
        aVar.a();
        aVar.f6610b = this.mStackFromEnd ? c0Var.b() - 1 : 0;
    }

    private void F(int i10, int i11, boolean z10, RecyclerView.c0 c0Var) {
        int iN;
        this.mLayoutState.f6630m = resolveIsInfinite();
        this.mLayoutState.f6623f = i10;
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        calculateExtraLayoutSpace(c0Var, iArr);
        int iMax = Math.max(0, this.mReusableIntPair[0]);
        int iMax2 = Math.max(0, this.mReusableIntPair[1]);
        boolean z11 = i10 == 1;
        c cVar = this.mLayoutState;
        int i12 = z11 ? iMax2 : iMax;
        cVar.f6625h = i12;
        if (!z11) {
            iMax = iMax2;
        }
        cVar.f6626i = iMax;
        if (z11) {
            cVar.f6625h = i12 + this.mOrientationHelper.j();
            View viewT = t();
            c cVar2 = this.mLayoutState;
            cVar2.f6622e = this.mShouldReverseLayout ? -1 : 1;
            int position = getPosition(viewT);
            c cVar3 = this.mLayoutState;
            cVar2.f6621d = position + cVar3.f6622e;
            cVar3.f6619b = this.mOrientationHelper.d(viewT);
            iN = this.mOrientationHelper.d(viewT) - this.mOrientationHelper.i();
        } else {
            View viewU = u();
            this.mLayoutState.f6625h += this.mOrientationHelper.n();
            c cVar4 = this.mLayoutState;
            cVar4.f6622e = this.mShouldReverseLayout ? 1 : -1;
            int position2 = getPosition(viewU);
            c cVar5 = this.mLayoutState;
            cVar4.f6621d = position2 + cVar5.f6622e;
            cVar5.f6619b = this.mOrientationHelper.g(viewU);
            iN = (-this.mOrientationHelper.g(viewU)) + this.mOrientationHelper.n();
        }
        c cVar6 = this.mLayoutState;
        cVar6.f6620c = i11;
        if (z10) {
            cVar6.f6620c = i11 - iN;
        }
        cVar6.f6624g = iN;
    }

    private void G(int i10, int i11) {
        this.mLayoutState.f6620c = this.mOrientationHelper.i() - i11;
        c cVar = this.mLayoutState;
        cVar.f6622e = this.mShouldReverseLayout ? -1 : 1;
        cVar.f6621d = i10;
        cVar.f6623f = 1;
        cVar.f6619b = i11;
        cVar.f6624g = Integer.MIN_VALUE;
    }

    private void H(a aVar) {
        G(aVar.f6610b, aVar.f6611c);
    }

    private void I(int i10, int i11) {
        this.mLayoutState.f6620c = i11 - this.mOrientationHelper.n();
        c cVar = this.mLayoutState;
        cVar.f6621d = i10;
        cVar.f6622e = this.mShouldReverseLayout ? 1 : -1;
        cVar.f6623f = -1;
        cVar.f6619b = i11;
        cVar.f6624g = Integer.MIN_VALUE;
    }

    private void J(a aVar) {
        I(aVar.f6610b, aVar.f6611c);
    }

    private int k(RecyclerView.c0 c0Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return v.a(c0Var, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled);
    }

    private int l(RecyclerView.c0 c0Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return v.b(c0Var, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled, this.mShouldReverseLayout);
    }

    private int m(RecyclerView.c0 c0Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return v.c(c0Var, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled);
    }

    private View n() {
        return findOnePartiallyOrCompletelyInvisibleChild(0, getChildCount());
    }

    private View o() {
        return findOnePartiallyOrCompletelyInvisibleChild(getChildCount() - 1, -1);
    }

    private View p() {
        return this.mShouldReverseLayout ? n() : o();
    }

    private View q() {
        return this.mShouldReverseLayout ? o() : n();
    }

    private int r(int i10, RecyclerView.x xVar, RecyclerView.c0 c0Var, boolean z10) {
        int i11;
        int i12 = this.mOrientationHelper.i() - i10;
        if (i12 <= 0) {
            return 0;
        }
        int i13 = -scrollBy(-i12, xVar, c0Var);
        int i14 = i10 + i13;
        if (!z10 || (i11 = this.mOrientationHelper.i() - i14) <= 0) {
            return i13;
        }
        this.mOrientationHelper.s(i11);
        return i11 + i13;
    }

    private int s(int i10, RecyclerView.x xVar, RecyclerView.c0 c0Var, boolean z10) {
        int iN;
        int iN2 = i10 - this.mOrientationHelper.n();
        if (iN2 <= 0) {
            return 0;
        }
        int i11 = -scrollBy(iN2, xVar, c0Var);
        int i12 = i10 + i11;
        if (!z10 || (iN = i12 - this.mOrientationHelper.n()) <= 0) {
            return i11;
        }
        this.mOrientationHelper.s(-iN);
        return i11 - iN;
    }

    private View t() {
        return getChildAt(this.mShouldReverseLayout ? 0 : getChildCount() - 1);
    }

    private View u() {
        return getChildAt(this.mShouldReverseLayout ? getChildCount() - 1 : 0);
    }

    private void v(RecyclerView.x xVar, RecyclerView.c0 c0Var, int i10, int i11) {
        if (!c0Var.g() || getChildCount() == 0 || c0Var.e() || !supportsPredictiveItemAnimations()) {
            return;
        }
        List listK = xVar.k();
        int size = listK.size();
        int position = getPosition(getChildAt(0));
        int iE = 0;
        int iE2 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            RecyclerView.g0 g0Var = (RecyclerView.g0) listK.get(i12);
            if (!g0Var.isRemoved()) {
                if ((g0Var.getLayoutPosition() < position) != this.mShouldReverseLayout) {
                    iE += this.mOrientationHelper.e(g0Var.itemView);
                } else {
                    iE2 += this.mOrientationHelper.e(g0Var.itemView);
                }
            }
        }
        this.mLayoutState.f6629l = listK;
        if (iE > 0) {
            I(getPosition(u()), i10);
            c cVar = this.mLayoutState;
            cVar.f6625h = iE;
            cVar.f6620c = 0;
            cVar.a();
            fill(xVar, this.mLayoutState, c0Var, false);
        }
        if (iE2 > 0) {
            G(getPosition(t()), i11);
            c cVar2 = this.mLayoutState;
            cVar2.f6625h = iE2;
            cVar2.f6620c = 0;
            cVar2.a();
            fill(xVar, this.mLayoutState, c0Var, false);
        }
        this.mLayoutState.f6629l = null;
    }

    private void w() {
        Log.d(TAG, "internal representation of views on the screen");
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            Log.d(TAG, "item " + getPosition(childAt) + ", coord:" + this.mOrientationHelper.g(childAt));
        }
        Log.d(TAG, "==============");
    }

    private void x(RecyclerView.x xVar, c cVar) {
        if (!cVar.f6618a || cVar.f6630m) {
            return;
        }
        int i10 = cVar.f6624g;
        int i11 = cVar.f6626i;
        if (cVar.f6623f == -1) {
            z(xVar, i10, i11);
        } else {
            A(xVar, i10, i11);
        }
    }

    private void y(RecyclerView.x xVar, int i10, int i11) {
        if (i10 == i11) {
            return;
        }
        if (i11 <= i10) {
            while (i10 > i11) {
                removeAndRecycleViewAt(i10, xVar);
                i10--;
            }
        } else {
            for (int i12 = i11 - 1; i12 >= i10; i12--) {
                removeAndRecycleViewAt(i12, xVar);
            }
        }
    }

    private void z(RecyclerView.x xVar, int i10, int i11) {
        int childCount = getChildCount();
        if (i10 < 0) {
            return;
        }
        int iH = (this.mOrientationHelper.h() - i10) + i11;
        if (this.mShouldReverseLayout) {
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                if (this.mOrientationHelper.g(childAt) < iH || this.mOrientationHelper.r(childAt) < iH) {
                    y(xVar, 0, i12);
                    return;
                }
            }
            return;
        }
        int i13 = childCount - 1;
        for (int i14 = i13; i14 >= 0; i14--) {
            View childAt2 = getChildAt(i14);
            if (this.mOrientationHelper.g(childAt2) < iH || this.mOrientationHelper.r(childAt2) < iH) {
                y(xVar, i13, i14);
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void assertNotInLayoutOrScroll(String str) {
        if (this.mPendingSavedState == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    protected void calculateExtraLayoutSpace(RecyclerView.c0 c0Var, int[] iArr) {
        int i10;
        int extraLayoutSpace = getExtraLayoutSpace(c0Var);
        if (this.mLayoutState.f6623f == -1) {
            i10 = 0;
        } else {
            i10 = extraLayoutSpace;
            extraLayoutSpace = 0;
        }
        iArr[0] = extraLayoutSpace;
        iArr[1] = i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean canScrollHorizontally() {
        return this.mOrientation == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean canScrollVertically() {
        return this.mOrientation == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void collectAdjacentPrefetchPositions(int i10, int i11, RecyclerView.c0 c0Var, RecyclerView.q.c cVar) {
        if (this.mOrientation != 0) {
            i10 = i11;
        }
        if (getChildCount() == 0 || i10 == 0) {
            return;
        }
        ensureLayoutState();
        F(i10 > 0 ? 1 : -1, Math.abs(i10), true, c0Var);
        collectPrefetchPositionsForLayoutState(c0Var, this.mLayoutState, cVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void collectInitialPrefetchPositions(int i10, RecyclerView.q.c cVar) {
        boolean z10;
        int i11;
        d dVar = this.mPendingSavedState;
        if (dVar == null || !dVar.a()) {
            B();
            z10 = this.mShouldReverseLayout;
            i11 = this.mPendingScrollPosition;
            if (i11 == -1) {
                i11 = z10 ? i10 - 1 : 0;
            }
        } else {
            d dVar2 = this.mPendingSavedState;
            z10 = dVar2.f6633c;
            i11 = dVar2.f6631a;
        }
        int i12 = z10 ? -1 : 1;
        for (int i13 = 0; i13 < this.mInitialPrefetchItemCount && i11 >= 0 && i11 < i10; i13++) {
            cVar.a(i11, 0);
            i11 += i12;
        }
    }

    void collectPrefetchPositionsForLayoutState(RecyclerView.c0 c0Var, c cVar, RecyclerView.q.c cVar2) {
        int i10 = cVar.f6621d;
        if (i10 < 0 || i10 >= c0Var.b()) {
            return;
        }
        cVar2.a(i10, Math.max(0, cVar.f6624g));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int computeHorizontalScrollExtent(RecyclerView.c0 c0Var) {
        return k(c0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int computeHorizontalScrollOffset(RecyclerView.c0 c0Var) {
        return l(c0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int computeHorizontalScrollRange(RecyclerView.c0 c0Var) {
        return m(c0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.b0.b
    public PointF computeScrollVectorForPosition(int i10) {
        if (getChildCount() == 0) {
            return null;
        }
        int i11 = (i10 < getPosition(getChildAt(0))) != this.mShouldReverseLayout ? -1 : 1;
        return this.mOrientation == 0 ? new PointF(i11, 0.0f) : new PointF(0.0f, i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int computeVerticalScrollExtent(RecyclerView.c0 c0Var) {
        return k(c0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int computeVerticalScrollOffset(RecyclerView.c0 c0Var) {
        return l(c0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int computeVerticalScrollRange(RecyclerView.c0 c0Var) {
        return m(c0Var);
    }

    int convertFocusDirectionToLayoutDirection(int i10) {
        if (i10 == 1) {
            return (this.mOrientation != 1 && isLayoutRTL()) ? 1 : -1;
        }
        if (i10 == 2) {
            return (this.mOrientation != 1 && isLayoutRTL()) ? -1 : 1;
        }
        if (i10 == 17) {
            return this.mOrientation == 0 ? -1 : Integer.MIN_VALUE;
        }
        if (i10 == 33) {
            return this.mOrientation == 1 ? -1 : Integer.MIN_VALUE;
        }
        if (i10 != 66) {
            return (i10 == 130 && this.mOrientation == 1) ? 1 : Integer.MIN_VALUE;
        }
        return this.mOrientation == 0 ? 1 : Integer.MIN_VALUE;
    }

    c createLayoutState() {
        return new c();
    }

    void ensureLayoutState() {
        if (this.mLayoutState == null) {
            this.mLayoutState = createLayoutState();
        }
    }

    int fill(RecyclerView.x xVar, c cVar, RecyclerView.c0 c0Var, boolean z10) {
        int i10 = cVar.f6620c;
        int i11 = cVar.f6624g;
        if (i11 != Integer.MIN_VALUE) {
            if (i10 < 0) {
                cVar.f6624g = i11 + i10;
            }
            x(xVar, cVar);
        }
        int i12 = cVar.f6620c + cVar.f6625h;
        b bVar = this.mLayoutChunkResult;
        while (true) {
            if ((!cVar.f6630m && i12 <= 0) || !cVar.c(c0Var)) {
                break;
            }
            bVar.a();
            layoutChunk(xVar, c0Var, cVar, bVar);
            if (!bVar.f6615b) {
                cVar.f6619b += bVar.f6614a * cVar.f6623f;
                if (!bVar.f6616c || cVar.f6629l != null || !c0Var.e()) {
                    int i13 = cVar.f6620c;
                    int i14 = bVar.f6614a;
                    cVar.f6620c = i13 - i14;
                    i12 -= i14;
                }
                int i15 = cVar.f6624g;
                if (i15 != Integer.MIN_VALUE) {
                    int i16 = i15 + bVar.f6614a;
                    cVar.f6624g = i16;
                    int i17 = cVar.f6620c;
                    if (i17 < 0) {
                        cVar.f6624g = i16 + i17;
                    }
                    x(xVar, cVar);
                }
                if (z10 && bVar.f6617d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i10 - cVar.f6620c;
    }

    public int findFirstCompletelyVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(0, getChildCount(), true, false);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    View findFirstVisibleChildClosestToEnd(boolean z10, boolean z11) {
        return this.mShouldReverseLayout ? findOneVisibleChild(0, getChildCount(), z10, z11) : findOneVisibleChild(getChildCount() - 1, -1, z10, z11);
    }

    View findFirstVisibleChildClosestToStart(boolean z10, boolean z11) {
        return this.mShouldReverseLayout ? findOneVisibleChild(getChildCount() - 1, -1, z10, z11) : findOneVisibleChild(0, getChildCount(), z10, z11);
    }

    public int findFirstVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(0, getChildCount(), false, true);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    public int findLastCompletelyVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(getChildCount() - 1, -1, true, false);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    public int findLastVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(getChildCount() - 1, -1, false, true);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    View findOnePartiallyOrCompletelyInvisibleChild(int i10, int i11) {
        int i12;
        int i13;
        ensureLayoutState();
        if (i11 <= i10 && i11 >= i10) {
            return getChildAt(i10);
        }
        if (this.mOrientationHelper.g(getChildAt(i10)) < this.mOrientationHelper.n()) {
            i12 = 16644;
            i13 = 16388;
        } else {
            i12 = 4161;
            i13 = 4097;
        }
        return this.mOrientation == 0 ? this.mHorizontalBoundCheck.a(i10, i11, i12, i13) : this.mVerticalBoundCheck.a(i10, i11, i12, i13);
    }

    View findOneVisibleChild(int i10, int i11, boolean z10, boolean z11) {
        ensureLayoutState();
        int i12 = Sdk$SDKError.b.WEBVIEW_ERROR_VALUE;
        int i13 = z10 ? 24579 : 320;
        if (!z11) {
            i12 = 0;
        }
        return this.mOrientation == 0 ? this.mHorizontalBoundCheck.a(i10, i11, i13, i12) : this.mVerticalBoundCheck.a(i10, i11, i13, i12);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0073  */
    /* JADX WARN: Code duplicated, block: B:35:0x0077  */
    View findReferenceChild(RecyclerView.x xVar, RecyclerView.c0 c0Var, boolean z10, boolean z11) {
        int i10;
        int childCount;
        int i11;
        ensureLayoutState();
        int childCount2 = getChildCount();
        if (z11) {
            childCount = getChildCount() - 1;
            i10 = -1;
            i11 = -1;
        } else {
            i10 = childCount2;
            childCount = 0;
            i11 = 1;
        }
        int iB = c0Var.b();
        int iN = this.mOrientationHelper.n();
        int i12 = this.mOrientationHelper.i();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (childCount != i10) {
            View childAt = getChildAt(childCount);
            int position = getPosition(childAt);
            int iG = this.mOrientationHelper.g(childAt);
            int iD = this.mOrientationHelper.d(childAt);
            if (position >= 0 && position < iB) {
                if (!((RecyclerView.r) childAt.getLayoutParams()).c()) {
                    boolean z12 = iD <= iN && iG < iN;
                    boolean z13 = iG >= i12 && iD > i12;
                    if (!z12 && !z13) {
                        return childAt;
                    }
                    if (z10) {
                        if (z13) {
                            view2 = childAt;
                        } else if (view == null) {
                            view = childAt;
                        }
                    } else if (z12) {
                        view2 = childAt;
                    } else if (view == null) {
                        view = childAt;
                    }
                } else if (view3 == null) {
                    view3 = childAt;
                }
            }
            childCount += i11;
        }
        if (view != null) {
            return view;
        }
        return view2 != null ? view2 : view3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public View findViewByPosition(int i10) {
        int childCount = getChildCount();
        if (childCount == 0) {
            return null;
        }
        int position = i10 - getPosition(getChildAt(0));
        if (position >= 0 && position < childCount) {
            View childAt = getChildAt(position);
            if (getPosition(childAt) == i10) {
                return childAt;
            }
        }
        return super.findViewByPosition(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public RecyclerView.r generateDefaultLayoutParams() {
        return new RecyclerView.r(-2, -2);
    }

    @Deprecated
    protected int getExtraLayoutSpace(RecyclerView.c0 c0Var) {
        if (c0Var.d()) {
            return this.mOrientationHelper.o();
        }
        return 0;
    }

    public int getInitialPrefetchItemCount() {
        return this.mInitialPrefetchItemCount;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public boolean getRecycleChildrenOnDetach() {
        return this.mRecycleChildrenOnDetach;
    }

    public boolean getReverseLayout() {
        return this.mReverseLayout;
    }

    public boolean getStackFromEnd() {
        return this.mStackFromEnd;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean isAutoMeasureEnabled() {
        return true;
    }

    protected boolean isLayoutRTL() {
        return getLayoutDirection() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean isLayoutReversed() {
        return this.mReverseLayout;
    }

    public boolean isSmoothScrollbarEnabled() {
        return this.mSmoothScrollbarEnabled;
    }

    void layoutChunk(RecyclerView.x xVar, RecyclerView.c0 c0Var, c cVar, b bVar) {
        int iF;
        int i10;
        int i11;
        int i12;
        int paddingLeft;
        int iF2;
        int i13;
        int i14;
        View viewD = cVar.d(xVar);
        if (viewD == null) {
            bVar.f6615b = true;
            return;
        }
        RecyclerView.r rVar = (RecyclerView.r) viewD.getLayoutParams();
        if (cVar.f6629l == null) {
            if (this.mShouldReverseLayout == (cVar.f6623f == -1)) {
                addView(viewD);
            } else {
                addView(viewD, 0);
            }
        } else {
            if (this.mShouldReverseLayout == (cVar.f6623f == -1)) {
                addDisappearingView(viewD);
            } else {
                addDisappearingView(viewD, 0);
            }
        }
        measureChildWithMargins(viewD, 0, 0);
        bVar.f6614a = this.mOrientationHelper.e(viewD);
        if (this.mOrientation == 1) {
            if (isLayoutRTL()) {
                iF2 = getWidth() - getPaddingRight();
                paddingLeft = iF2 - this.mOrientationHelper.f(viewD);
            } else {
                paddingLeft = getPaddingLeft();
                iF2 = this.mOrientationHelper.f(viewD) + paddingLeft;
            }
            if (cVar.f6623f == -1) {
                i14 = cVar.f6619b;
                i13 = i14 - bVar.f6614a;
            } else {
                i13 = cVar.f6619b;
                i14 = bVar.f6614a + i13;
            }
            int i15 = paddingLeft;
            i12 = i13;
            i11 = i15;
            iF = i14;
            i10 = iF2;
        } else {
            int paddingTop = getPaddingTop();
            iF = this.mOrientationHelper.f(viewD) + paddingTop;
            if (cVar.f6623f == -1) {
                int i16 = cVar.f6619b;
                i11 = i16 - bVar.f6614a;
                i10 = i16;
            } else {
                int i17 = cVar.f6619b;
                i10 = bVar.f6614a + i17;
                i11 = i17;
            }
            i12 = paddingTop;
        }
        layoutDecoratedWithMargins(viewD, i11, i12, i10, iF);
        if (rVar.c() || rVar.b()) {
            bVar.f6616c = true;
        }
        bVar.f6617d = viewD.hasFocusable();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.x xVar) {
        super.onDetachedFromWindow(recyclerView, xVar);
        if (this.mRecycleChildrenOnDetach) {
            removeAndRecycleAllViews(xVar);
            xVar.c();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public View onFocusSearchFailed(View view, int i10, RecyclerView.x xVar, RecyclerView.c0 c0Var) {
        int iConvertFocusDirectionToLayoutDirection;
        B();
        if (getChildCount() == 0 || (iConvertFocusDirectionToLayoutDirection = convertFocusDirectionToLayoutDirection(i10)) == Integer.MIN_VALUE) {
            return null;
        }
        ensureLayoutState();
        F(iConvertFocusDirectionToLayoutDirection, (int) (this.mOrientationHelper.o() * MAX_SCROLL_FACTOR), false, c0Var);
        c cVar = this.mLayoutState;
        cVar.f6624g = Integer.MIN_VALUE;
        cVar.f6618a = false;
        fill(xVar, cVar, c0Var, true);
        View viewQ = iConvertFocusDirectionToLayoutDirection == -1 ? q() : p();
        View viewU = iConvertFocusDirectionToLayoutDirection == -1 ? u() : t();
        if (!viewU.hasFocusable()) {
            return viewQ;
        }
        if (viewQ == null) {
            return null;
        }
        return viewU;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            accessibilityEvent.setFromIndex(findFirstVisibleItemPosition());
            accessibilityEvent.setToIndex(findLastVisibleItemPosition());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void onInitializeAccessibilityNodeInfo(RecyclerView.x xVar, RecyclerView.c0 c0Var, o0.p pVar) {
        super.onInitializeAccessibilityNodeInfo(xVar, c0Var, pVar);
        RecyclerView.h hVar = this.mRecyclerView.f6658m;
        if (hVar == null || hVar.getItemCount() <= 0) {
            return;
        }
        pVar.b(o0.p.a.B);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void onLayoutChildren(RecyclerView.x xVar, RecyclerView.c0 c0Var) {
        int i10;
        int i11;
        int i12;
        int i13;
        int iR;
        int i14;
        View viewFindViewByPosition;
        int iG;
        int i15;
        int i16 = -1;
        if (!(this.mPendingSavedState == null && this.mPendingScrollPosition == -1) && c0Var.b() == 0) {
            removeAndRecycleAllViews(xVar);
            return;
        }
        d dVar = this.mPendingSavedState;
        if (dVar != null && dVar.a()) {
            this.mPendingScrollPosition = this.mPendingSavedState.f6631a;
        }
        ensureLayoutState();
        this.mLayoutState.f6618a = false;
        B();
        View focusedChild = getFocusedChild();
        a aVar = this.mAnchorInfo;
        if (!aVar.f6613e || this.mPendingScrollPosition != -1 || this.mPendingSavedState != null) {
            aVar.e();
            a aVar2 = this.mAnchorInfo;
            aVar2.f6612d = this.mShouldReverseLayout ^ this.mStackFromEnd;
            E(xVar, c0Var, aVar2);
            this.mAnchorInfo.f6613e = true;
        } else if (focusedChild != null && (this.mOrientationHelper.g(focusedChild) >= this.mOrientationHelper.i() || this.mOrientationHelper.d(focusedChild) <= this.mOrientationHelper.n())) {
            this.mAnchorInfo.c(focusedChild, getPosition(focusedChild));
        }
        c cVar = this.mLayoutState;
        cVar.f6623f = cVar.f6628k >= 0 ? 1 : -1;
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        calculateExtraLayoutSpace(c0Var, iArr);
        int iMax = Math.max(0, this.mReusableIntPair[0]) + this.mOrientationHelper.n();
        int iMax2 = Math.max(0, this.mReusableIntPair[1]) + this.mOrientationHelper.j();
        if (c0Var.e() && (i14 = this.mPendingScrollPosition) != -1 && this.mPendingScrollPositionOffset != Integer.MIN_VALUE && (viewFindViewByPosition = findViewByPosition(i14)) != null) {
            if (this.mShouldReverseLayout) {
                i15 = this.mOrientationHelper.i() - this.mOrientationHelper.d(viewFindViewByPosition);
                iG = this.mPendingScrollPositionOffset;
            } else {
                iG = this.mOrientationHelper.g(viewFindViewByPosition) - this.mOrientationHelper.n();
                i15 = this.mPendingScrollPositionOffset;
            }
            int i17 = i15 - iG;
            if (i17 > 0) {
                iMax += i17;
            } else {
                iMax2 -= i17;
            }
        }
        a aVar3 = this.mAnchorInfo;
        if (!aVar3.f6612d ? !this.mShouldReverseLayout : this.mShouldReverseLayout) {
            i16 = 1;
        }
        onAnchorReady(xVar, c0Var, aVar3, i16);
        detachAndScrapAttachedViews(xVar);
        this.mLayoutState.f6630m = resolveIsInfinite();
        this.mLayoutState.f6627j = c0Var.e();
        this.mLayoutState.f6626i = 0;
        a aVar4 = this.mAnchorInfo;
        if (aVar4.f6612d) {
            J(aVar4);
            c cVar2 = this.mLayoutState;
            cVar2.f6625h = iMax;
            fill(xVar, cVar2, c0Var, false);
            c cVar3 = this.mLayoutState;
            i11 = cVar3.f6619b;
            int i18 = cVar3.f6621d;
            int i19 = cVar3.f6620c;
            if (i19 > 0) {
                iMax2 += i19;
            }
            H(this.mAnchorInfo);
            c cVar4 = this.mLayoutState;
            cVar4.f6625h = iMax2;
            cVar4.f6621d += cVar4.f6622e;
            fill(xVar, cVar4, c0Var, false);
            c cVar5 = this.mLayoutState;
            i10 = cVar5.f6619b;
            int i20 = cVar5.f6620c;
            if (i20 > 0) {
                I(i18, i11);
                c cVar6 = this.mLayoutState;
                cVar6.f6625h = i20;
                fill(xVar, cVar6, c0Var, false);
                i11 = this.mLayoutState.f6619b;
            }
        } else {
            H(aVar4);
            c cVar7 = this.mLayoutState;
            cVar7.f6625h = iMax2;
            fill(xVar, cVar7, c0Var, false);
            c cVar8 = this.mLayoutState;
            i10 = cVar8.f6619b;
            int i21 = cVar8.f6621d;
            int i22 = cVar8.f6620c;
            if (i22 > 0) {
                iMax += i22;
            }
            J(this.mAnchorInfo);
            c cVar9 = this.mLayoutState;
            cVar9.f6625h = iMax;
            cVar9.f6621d += cVar9.f6622e;
            fill(xVar, cVar9, c0Var, false);
            c cVar10 = this.mLayoutState;
            i11 = cVar10.f6619b;
            int i23 = cVar10.f6620c;
            if (i23 > 0) {
                G(i21, i10);
                c cVar11 = this.mLayoutState;
                cVar11.f6625h = i23;
                fill(xVar, cVar11, c0Var, false);
                i10 = this.mLayoutState.f6619b;
            }
        }
        if (getChildCount() > 0) {
            if (this.mShouldReverseLayout ^ this.mStackFromEnd) {
                int iR2 = r(i10, xVar, c0Var, true);
                i12 = i11 + iR2;
                i13 = i10 + iR2;
                iR = s(i12, xVar, c0Var, false);
            } else {
                int iS = s(i11, xVar, c0Var, true);
                i12 = i11 + iS;
                i13 = i10 + iS;
                iR = r(i13, xVar, c0Var, false);
            }
            i11 = i12 + iR;
            i10 = i13 + iR;
        }
        v(xVar, c0Var, i11, i10);
        if (c0Var.e()) {
            this.mAnchorInfo.e();
        } else {
            this.mOrientationHelper.t();
        }
        this.mLastStackFromEnd = this.mStackFromEnd;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void onLayoutCompleted(RecyclerView.c0 c0Var) {
        super.onLayoutCompleted(c0Var);
        this.mPendingSavedState = null;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mAnchorInfo.e();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof d) {
            d dVar = (d) parcelable;
            this.mPendingSavedState = dVar;
            if (this.mPendingScrollPosition != -1) {
                dVar.b();
            }
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public Parcelable onSaveInstanceState() {
        if (this.mPendingSavedState != null) {
            return new d(this.mPendingSavedState);
        }
        d dVar = new d();
        if (getChildCount() <= 0) {
            dVar.b();
            return dVar;
        }
        ensureLayoutState();
        boolean z10 = this.mLastStackFromEnd ^ this.mShouldReverseLayout;
        dVar.f6633c = z10;
        if (z10) {
            View viewT = t();
            dVar.f6632b = this.mOrientationHelper.i() - this.mOrientationHelper.d(viewT);
            dVar.f6631a = getPosition(viewT);
            return dVar;
        }
        View viewU = u();
        dVar.f6631a = getPosition(viewU);
        dVar.f6632b = this.mOrientationHelper.g(viewU) - this.mOrientationHelper.n();
        return dVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    boolean performAccessibilityAction(int i10, Bundle bundle) {
        int iMin;
        if (super.performAccessibilityAction(i10, bundle)) {
            return true;
        }
        if (i10 == 16908343 && bundle != null) {
            if (this.mOrientation == 1) {
                int i11 = bundle.getInt("android.view.accessibility.action.ARGUMENT_ROW_INT", -1);
                if (i11 < 0) {
                    return false;
                }
                RecyclerView recyclerView = this.mRecyclerView;
                iMin = Math.min(i11, getRowCountForAccessibility(recyclerView.f6638c, recyclerView.f6651i0) - 1);
            } else {
                int i12 = bundle.getInt("android.view.accessibility.action.ARGUMENT_COLUMN_INT", -1);
                if (i12 < 0) {
                    return false;
                }
                RecyclerView recyclerView2 = this.mRecyclerView;
                iMin = Math.min(i12, getColumnCountForAccessibility(recyclerView2.f6638c, recyclerView2.f6651i0) - 1);
            }
            if (iMin >= 0) {
                scrollToPositionWithOffset(iMin, 0);
                return true;
            }
        }
        return false;
    }

    public void prepareForDrop(View view, View view2, int i10, int i11) {
        assertNotInLayoutOrScroll("Cannot drop a view during a scroll or layout calculation");
        ensureLayoutState();
        B();
        int position = getPosition(view);
        int position2 = getPosition(view2);
        byte b10 = position < position2 ? (byte) 1 : (byte) -1;
        if (this.mShouldReverseLayout) {
            if (b10 == 1) {
                scrollToPositionWithOffset(position2, this.mOrientationHelper.i() - (this.mOrientationHelper.g(view2) + this.mOrientationHelper.e(view)));
                return;
            } else {
                scrollToPositionWithOffset(position2, this.mOrientationHelper.i() - this.mOrientationHelper.d(view2));
                return;
            }
        }
        if (b10 == -1) {
            scrollToPositionWithOffset(position2, this.mOrientationHelper.g(view2));
        } else {
            scrollToPositionWithOffset(position2, this.mOrientationHelper.d(view2) - this.mOrientationHelper.e(view));
        }
    }

    boolean resolveIsInfinite() {
        return this.mOrientationHelper.l() == 0 && this.mOrientationHelper.h() == 0;
    }

    int scrollBy(int i10, RecyclerView.x xVar, RecyclerView.c0 c0Var) {
        if (getChildCount() == 0 || i10 == 0) {
            return 0;
        }
        ensureLayoutState();
        this.mLayoutState.f6618a = true;
        int i11 = i10 > 0 ? 1 : -1;
        int iAbs = Math.abs(i10);
        F(i11, iAbs, true, c0Var);
        c cVar = this.mLayoutState;
        int iFill = cVar.f6624g + fill(xVar, cVar, c0Var, false);
        if (iFill < 0) {
            return 0;
        }
        if (iAbs > iFill) {
            i10 = i11 * iFill;
        }
        this.mOrientationHelper.s(-i10);
        this.mLayoutState.f6628k = i10;
        return i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int scrollHorizontallyBy(int i10, RecyclerView.x xVar, RecyclerView.c0 c0Var) {
        if (this.mOrientation == 1) {
            return 0;
        }
        return scrollBy(i10, xVar, c0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void scrollToPosition(int i10) {
        this.mPendingScrollPosition = i10;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        d dVar = this.mPendingSavedState;
        if (dVar != null) {
            dVar.b();
        }
        requestLayout();
    }

    public void scrollToPositionWithOffset(int i10, int i11) {
        this.mPendingScrollPosition = i10;
        this.mPendingScrollPositionOffset = i11;
        d dVar = this.mPendingSavedState;
        if (dVar != null) {
            dVar.b();
        }
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int scrollVerticallyBy(int i10, RecyclerView.x xVar, RecyclerView.c0 c0Var) {
        if (this.mOrientation == 0) {
            return 0;
        }
        return scrollBy(i10, xVar, c0Var);
    }

    public void setInitialPrefetchItemCount(int i10) {
        this.mInitialPrefetchItemCount = i10;
    }

    public void setOrientation(int i10) {
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i10);
        }
        assertNotInLayoutOrScroll(null);
        if (i10 != this.mOrientation || this.mOrientationHelper == null) {
            s sVarB = s.b(this, i10);
            this.mOrientationHelper = sVarB;
            this.mAnchorInfo.f6609a = sVarB;
            this.mOrientation = i10;
            requestLayout();
        }
    }

    public void setRecycleChildrenOnDetach(boolean z10) {
        this.mRecycleChildrenOnDetach = z10;
    }

    public void setReverseLayout(boolean z10) {
        assertNotInLayoutOrScroll(null);
        if (z10 == this.mReverseLayout) {
            return;
        }
        this.mReverseLayout = z10;
        requestLayout();
    }

    public void setSmoothScrollbarEnabled(boolean z10) {
        this.mSmoothScrollbarEnabled = z10;
    }

    public void setStackFromEnd(boolean z10) {
        assertNotInLayoutOrScroll(null);
        if (this.mStackFromEnd == z10) {
            return;
        }
        this.mStackFromEnd = z10;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    boolean shouldMeasureTwice() {
        return (getHeightMode() == 1073741824 || getWidthMode() == 1073741824 || !hasFlexibleChildInBothOrientations()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.c0 c0Var, int i10) {
        n nVar = new n(recyclerView.getContext());
        nVar.setTargetPosition(i10);
        startSmoothScroll(nVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean supportsPredictiveItemAnimations() {
        return this.mPendingSavedState == null && this.mLastStackFromEnd == this.mStackFromEnd;
    }

    void validateChildOrder() {
        Log.d(TAG, "validating child count " + getChildCount());
        if (getChildCount() < 1) {
            return;
        }
        int position = getPosition(getChildAt(0));
        int iG = this.mOrientationHelper.g(getChildAt(0));
        if (this.mShouldReverseLayout) {
            for (int i10 = 1; i10 < getChildCount(); i10++) {
                View childAt = getChildAt(i10);
                int position2 = getPosition(childAt);
                int iG2 = this.mOrientationHelper.g(childAt);
                if (position2 < position) {
                    w();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("detected invalid position. loc invalid? ");
                    sb2.append(iG2 < iG);
                    throw new RuntimeException(sb2.toString());
                }
                if (iG2 > iG) {
                    w();
                    throw new RuntimeException("detected invalid location");
                }
            }
            return;
        }
        for (int i11 = 1; i11 < getChildCount(); i11++) {
            View childAt2 = getChildAt(i11);
            int position3 = getPosition(childAt2);
            int iG3 = this.mOrientationHelper.g(childAt2);
            if (position3 < position) {
                w();
                StringBuilder sb3 = new StringBuilder();
                sb3.append("detected invalid position. loc invalid? ");
                sb3.append(iG3 < iG);
                throw new RuntimeException(sb3.toString());
            }
            if (iG3 < iG) {
                w();
                throw new RuntimeException("detected invalid location");
            }
        }
    }

    public LinearLayoutManager(Context context, int i10, boolean z10) {
        this.mOrientation = 1;
        this.mReverseLayout = false;
        this.mShouldReverseLayout = false;
        this.mStackFromEnd = false;
        this.mSmoothScrollbarEnabled = true;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mPendingSavedState = null;
        this.mAnchorInfo = new a();
        this.mLayoutChunkResult = new b();
        this.mInitialPrefetchItemCount = 2;
        this.mReusableIntPair = new int[2];
        setOrientation(i10);
        setReverseLayout(z10);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.mOrientation = 1;
        this.mReverseLayout = false;
        this.mShouldReverseLayout = false;
        this.mStackFromEnd = false;
        this.mSmoothScrollbarEnabled = true;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mPendingSavedState = null;
        this.mAnchorInfo = new a();
        this.mLayoutChunkResult = new b();
        this.mInitialPrefetchItemCount = 2;
        this.mReusableIntPair = new int[2];
        RecyclerView.q.d properties = RecyclerView.q.getProperties(context, attributeSet, i10, i11);
        setOrientation(properties.f6742a);
        setReverseLayout(properties.f6744c);
        setStackFromEnd(properties.f6745d);
    }

    void onAnchorReady(RecyclerView.x xVar, RecyclerView.c0 c0Var, a aVar, int i10) {
    }
}
