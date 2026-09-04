package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class StaggeredGridLayoutManager extends RecyclerView.q implements RecyclerView.b0.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    f[] f6767b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    s f6768c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    s f6769d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f6770e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f6771f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final m f6772g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private BitSet f6775j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f6780o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f6781p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private e f6782q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f6783r;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int[] f6788w;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f6766a = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    boolean f6773h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    boolean f6774i = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    int f6776k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    int f6777l = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    d f6778m = new d();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f6779n = 2;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Rect f6784s = new Rect();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final b f6785t = new b();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f6786u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f6787v = true;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final Runnable f6789x = new a();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StaggeredGridLayoutManager.this.q();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f6791a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f6792b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f6793c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f6794d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f6795e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int[] f6796f;

        b() {
            c();
        }

        void a() {
            this.f6792b = this.f6793c ? StaggeredGridLayoutManager.this.f6768c.i() : StaggeredGridLayoutManager.this.f6768c.n();
        }

        void b(int i10) {
            if (this.f6793c) {
                this.f6792b = StaggeredGridLayoutManager.this.f6768c.i() - i10;
            } else {
                this.f6792b = StaggeredGridLayoutManager.this.f6768c.n() + i10;
            }
        }

        void c() {
            this.f6791a = -1;
            this.f6792b = Integer.MIN_VALUE;
            this.f6793c = false;
            this.f6794d = false;
            this.f6795e = false;
            int[] iArr = this.f6796f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }

        void d(f[] fVarArr) {
            int length = fVarArr.length;
            int[] iArr = this.f6796f;
            if (iArr == null || iArr.length < length) {
                this.f6796f = new int[StaggeredGridLayoutManager.this.f6767b.length];
            }
            for (int i10 = 0; i10 < length; i10++) {
                this.f6796f[i10] = fVarArr[i10].p(Integer.MIN_VALUE);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class c extends RecyclerView.r {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        f f6798e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f6799f;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public final int e() {
            f fVar = this.f6798e;
            if (fVar == null) {
                return -1;
            }
            return fVar.f6820e;
        }

        public boolean f() {
            return this.f6799f;
        }

        public c(int i10, int i11) {
            super(i10, i11);
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class e implements Parcelable {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f6806a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f6807b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f6808c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int[] f6809d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f6810e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int[] f6811f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        List f6812g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        boolean f6813h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        boolean f6814i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        boolean f6815j;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public e createFromParcel(Parcel parcel) {
                return new e(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public e[] newArray(int i10) {
                return new e[i10];
            }
        }

        public e() {
        }

        void a() {
            this.f6809d = null;
            this.f6808c = 0;
            this.f6806a = -1;
            this.f6807b = -1;
        }

        void b() {
            this.f6809d = null;
            this.f6808c = 0;
            this.f6810e = 0;
            this.f6811f = null;
            this.f6812g = null;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f6806a);
            parcel.writeInt(this.f6807b);
            parcel.writeInt(this.f6808c);
            if (this.f6808c > 0) {
                parcel.writeIntArray(this.f6809d);
            }
            parcel.writeInt(this.f6810e);
            if (this.f6810e > 0) {
                parcel.writeIntArray(this.f6811f);
            }
            parcel.writeInt(this.f6813h ? 1 : 0);
            parcel.writeInt(this.f6814i ? 1 : 0);
            parcel.writeInt(this.f6815j ? 1 : 0);
            parcel.writeList(this.f6812g);
        }

        e(Parcel parcel) {
            this.f6806a = parcel.readInt();
            this.f6807b = parcel.readInt();
            int i10 = parcel.readInt();
            this.f6808c = i10;
            if (i10 > 0) {
                int[] iArr = new int[i10];
                this.f6809d = iArr;
                parcel.readIntArray(iArr);
            }
            int i11 = parcel.readInt();
            this.f6810e = i11;
            if (i11 > 0) {
                int[] iArr2 = new int[i11];
                this.f6811f = iArr2;
                parcel.readIntArray(iArr2);
            }
            this.f6813h = parcel.readInt() == 1;
            this.f6814i = parcel.readInt() == 1;
            this.f6815j = parcel.readInt() == 1;
            this.f6812g = parcel.readArrayList(d.a.class.getClassLoader());
        }

        public e(e eVar) {
            this.f6808c = eVar.f6808c;
            this.f6806a = eVar.f6806a;
            this.f6807b = eVar.f6807b;
            this.f6809d = eVar.f6809d;
            this.f6810e = eVar.f6810e;
            this.f6811f = eVar.f6811f;
            this.f6813h = eVar.f6813h;
            this.f6814i = eVar.f6814i;
            this.f6815j = eVar.f6815j;
            this.f6812g = eVar.f6812g;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        ArrayList f6816a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f6817b = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f6818c = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f6819d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final int f6820e;

        f(int i10) {
            this.f6820e = i10;
        }

        void a(View view) {
            c cVarN = n(view);
            cVarN.f6798e = this;
            this.f6816a.add(view);
            this.f6818c = Integer.MIN_VALUE;
            if (this.f6816a.size() == 1) {
                this.f6817b = Integer.MIN_VALUE;
            }
            if (cVarN.c() || cVarN.b()) {
                this.f6819d += StaggeredGridLayoutManager.this.f6768c.e(view);
            }
        }

        void b(boolean z10, int i10) {
            int iL = z10 ? l(Integer.MIN_VALUE) : p(Integer.MIN_VALUE);
            e();
            if (iL == Integer.MIN_VALUE) {
                return;
            }
            if (!z10 || iL >= StaggeredGridLayoutManager.this.f6768c.i()) {
                if (z10 || iL <= StaggeredGridLayoutManager.this.f6768c.n()) {
                    if (i10 != Integer.MIN_VALUE) {
                        iL += i10;
                    }
                    this.f6818c = iL;
                    this.f6817b = iL;
                }
            }
        }

        void c() {
            d.a aVarF;
            ArrayList arrayList = this.f6816a;
            View view = (View) arrayList.get(arrayList.size() - 1);
            c cVarN = n(view);
            this.f6818c = StaggeredGridLayoutManager.this.f6768c.d(view);
            if (cVarN.f6799f && (aVarF = StaggeredGridLayoutManager.this.f6778m.f(cVarN.a())) != null && aVarF.f6803b == 1) {
                this.f6818c += aVarF.a(this.f6820e);
            }
        }

        void d() {
            d.a aVarF;
            View view = (View) this.f6816a.get(0);
            c cVarN = n(view);
            this.f6817b = StaggeredGridLayoutManager.this.f6768c.g(view);
            if (cVarN.f6799f && (aVarF = StaggeredGridLayoutManager.this.f6778m.f(cVarN.a())) != null && aVarF.f6803b == -1) {
                this.f6817b -= aVarF.a(this.f6820e);
            }
        }

        void e() {
            this.f6816a.clear();
            q();
            this.f6819d = 0;
        }

        public int f() {
            return StaggeredGridLayoutManager.this.f6773h ? i(this.f6816a.size() - 1, -1, true) : i(0, this.f6816a.size(), true);
        }

        public int g() {
            return StaggeredGridLayoutManager.this.f6773h ? i(0, this.f6816a.size(), true) : i(this.f6816a.size() - 1, -1, true);
        }

        int h(int i10, int i11, boolean z10, boolean z11, boolean z12) {
            int iN = StaggeredGridLayoutManager.this.f6768c.n();
            int i12 = StaggeredGridLayoutManager.this.f6768c.i();
            int i13 = i11 > i10 ? 1 : -1;
            while (i10 != i11) {
                View view = (View) this.f6816a.get(i10);
                int iG = StaggeredGridLayoutManager.this.f6768c.g(view);
                int iD = StaggeredGridLayoutManager.this.f6768c.d(view);
                boolean z13 = false;
                boolean z14 = !z12 ? iG >= i12 : iG > i12;
                if (!z12 ? iD > iN : iD >= iN) {
                    z13 = true;
                }
                if (z14 && z13) {
                    if (z10 && z11) {
                        if (iG >= iN && iD <= i12) {
                            return StaggeredGridLayoutManager.this.getPosition(view);
                        }
                    } else {
                        if (z11) {
                            return StaggeredGridLayoutManager.this.getPosition(view);
                        }
                        if (iG < iN || iD > i12) {
                            return StaggeredGridLayoutManager.this.getPosition(view);
                        }
                    }
                }
                i10 += i13;
            }
            return -1;
        }

        int i(int i10, int i11, boolean z10) {
            return h(i10, i11, false, false, z10);
        }

        public int j() {
            return this.f6819d;
        }

        int k() {
            int i10 = this.f6818c;
            if (i10 != Integer.MIN_VALUE) {
                return i10;
            }
            c();
            return this.f6818c;
        }

        int l(int i10) {
            int i11 = this.f6818c;
            if (i11 != Integer.MIN_VALUE) {
                return i11;
            }
            if (this.f6816a.size() == 0) {
                return i10;
            }
            c();
            return this.f6818c;
        }

        public View m(int i10, int i11) {
            View view = null;
            if (i11 != -1) {
                int size = this.f6816a.size() - 1;
                while (size >= 0) {
                    View view2 = (View) this.f6816a.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.f6773h && staggeredGridLayoutManager.getPosition(view2) >= i10) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.f6773h && staggeredGridLayoutManager2.getPosition(view2) <= i10) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
                return view;
            }
            int size2 = this.f6816a.size();
            int i12 = 0;
            while (i12 < size2) {
                View view3 = (View) this.f6816a.get(i12);
                StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                if (staggeredGridLayoutManager3.f6773h && staggeredGridLayoutManager3.getPosition(view3) <= i10) {
                    break;
                }
                StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                if ((!staggeredGridLayoutManager4.f6773h && staggeredGridLayoutManager4.getPosition(view3) >= i10) || !view3.hasFocusable()) {
                    break;
                }
                i12++;
                view = view3;
            }
            return view;
        }

        c n(View view) {
            return (c) view.getLayoutParams();
        }

        int o() {
            int i10 = this.f6817b;
            if (i10 != Integer.MIN_VALUE) {
                return i10;
            }
            d();
            return this.f6817b;
        }

        int p(int i10) {
            int i11 = this.f6817b;
            if (i11 != Integer.MIN_VALUE) {
                return i11;
            }
            if (this.f6816a.size() == 0) {
                return i10;
            }
            d();
            return this.f6817b;
        }

        void q() {
            this.f6817b = Integer.MIN_VALUE;
            this.f6818c = Integer.MIN_VALUE;
        }

        void r(int i10) {
            int i11 = this.f6817b;
            if (i11 != Integer.MIN_VALUE) {
                this.f6817b = i11 + i10;
            }
            int i12 = this.f6818c;
            if (i12 != Integer.MIN_VALUE) {
                this.f6818c = i12 + i10;
            }
        }

        void s() {
            int size = this.f6816a.size();
            View view = (View) this.f6816a.remove(size - 1);
            c cVarN = n(view);
            cVarN.f6798e = null;
            if (cVarN.c() || cVarN.b()) {
                this.f6819d -= StaggeredGridLayoutManager.this.f6768c.e(view);
            }
            if (size == 1) {
                this.f6817b = Integer.MIN_VALUE;
            }
            this.f6818c = Integer.MIN_VALUE;
        }

        void t() {
            View view = (View) this.f6816a.remove(0);
            c cVarN = n(view);
            cVarN.f6798e = null;
            if (this.f6816a.size() == 0) {
                this.f6818c = Integer.MIN_VALUE;
            }
            if (cVarN.c() || cVarN.b()) {
                this.f6819d -= StaggeredGridLayoutManager.this.f6768c.e(view);
            }
            this.f6817b = Integer.MIN_VALUE;
        }

        void u(View view) {
            c cVarN = n(view);
            cVarN.f6798e = this;
            this.f6816a.add(0, view);
            this.f6817b = Integer.MIN_VALUE;
            if (this.f6816a.size() == 1) {
                this.f6818c = Integer.MIN_VALUE;
            }
            if (cVarN.c() || cVarN.b()) {
                this.f6819d += StaggeredGridLayoutManager.this.f6768c.e(view);
            }
        }

        void v(int i10) {
            this.f6817b = i10;
            this.f6818c = i10;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        RecyclerView.q.d properties = RecyclerView.q.getProperties(context, attributeSet, i10, i11);
        setOrientation(properties.f6742a);
        c0(properties.f6743b);
        setReverseLayout(properties.f6744c);
        this.f6772g = new m();
        x();
    }

    private int D(int i10) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            int position = getPosition(getChildAt(childCount));
            if (position >= 0 && position < i10) {
                return position;
            }
        }
        return 0;
    }

    private void E(RecyclerView.x xVar, RecyclerView.c0 c0Var, boolean z10) {
        int i10;
        int I = I(Integer.MIN_VALUE);
        if (I != Integer.MIN_VALUE && (i10 = this.f6768c.i() - I) > 0) {
            int i11 = i10 - (-scrollBy(-i10, xVar, c0Var));
            if (!z10 || i11 <= 0) {
                return;
            }
            this.f6768c.s(i11);
        }
    }

    private void F(RecyclerView.x xVar, RecyclerView.c0 c0Var, boolean z10) {
        int iN;
        int iL = L(Integer.MAX_VALUE);
        if (iL != Integer.MAX_VALUE && (iN = iL - this.f6768c.n()) > 0) {
            int iScrollBy = iN - scrollBy(iN, xVar, c0Var);
            if (!z10 || iScrollBy <= 0) {
                return;
            }
            this.f6768c.s(-iScrollBy);
        }
    }

    private int I(int i10) {
        int iL = this.f6767b[0].l(i10);
        for (int i11 = 1; i11 < this.f6766a; i11++) {
            int iL2 = this.f6767b[i11].l(i10);
            if (iL2 > iL) {
                iL = iL2;
            }
        }
        return iL;
    }

    private int J(int i10) {
        int iP = this.f6767b[0].p(i10);
        for (int i11 = 1; i11 < this.f6766a; i11++) {
            int iP2 = this.f6767b[i11].p(i10);
            if (iP2 > iP) {
                iP = iP2;
            }
        }
        return iP;
    }

    private int K(int i10) {
        int iL = this.f6767b[0].l(i10);
        for (int i11 = 1; i11 < this.f6766a; i11++) {
            int iL2 = this.f6767b[i11].l(i10);
            if (iL2 < iL) {
                iL = iL2;
            }
        }
        return iL;
    }

    private int L(int i10) {
        int iP = this.f6767b[0].p(i10);
        for (int i11 = 1; i11 < this.f6766a; i11++) {
            int iP2 = this.f6767b[i11].p(i10);
            if (iP2 < iP) {
                iP = iP2;
            }
        }
        return iP;
    }

    private f M(m mVar) {
        int i10;
        int i11;
        int i12;
        if (T(mVar.f7032e)) {
            i11 = this.f6766a - 1;
            i10 = -1;
            i12 = -1;
        } else {
            i10 = this.f6766a;
            i11 = 0;
            i12 = 1;
        }
        f fVar = null;
        if (mVar.f7032e == 1) {
            int iN = this.f6768c.n();
            int i13 = Integer.MAX_VALUE;
            while (i11 != i10) {
                f fVar2 = this.f6767b[i11];
                int iL = fVar2.l(iN);
                if (iL < i13) {
                    fVar = fVar2;
                    i13 = iL;
                }
                i11 += i12;
            }
            return fVar;
        }
        int i14 = this.f6768c.i();
        int i15 = Integer.MIN_VALUE;
        while (i11 != i10) {
            f fVar3 = this.f6767b[i11];
            int iP = fVar3.p(i14);
            if (iP > i15) {
                fVar = fVar3;
                i15 = iP;
            }
            i11 += i12;
        }
        return fVar;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0026  */
    /* JADX WARN: Code duplicated, block: B:17:0x0029 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x002c  */
    /* JADX WARN: Code duplicated, block: B:20:0x0037  */
    /* JADX WARN: Code duplicated, block: B:21:0x003d  */
    /* JADX WARN: Code duplicated, block: B:24:0x0045  */
    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:27:0x004e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0054  */
    /* JADX WARN: Code duplicated, block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:? A[RETURN, SYNTHETIC] */
    private void N(int i10, int i11, int i12) {
        int i13;
        int i14;
        int iH;
        int iH2 = this.f6774i ? H() : G();
        if (i12 == 8) {
            if (i10 < i11) {
                i13 = i11 + 1;
            } else {
                i13 = i10 + 1;
                i14 = i11;
            }
            this.f6778m.h(i14);
            if (i12 != 1) {
                this.f6778m.j(i10, i11);
            } else if (i12 != 2) {
                this.f6778m.k(i10, i11);
            } else if (i12 == 8) {
                this.f6778m.k(i10, 1);
                this.f6778m.j(i11, 1);
            }
            if (i13 <= iH2) {
                return;
            }
            if (this.f6774i) {
                iH = G();
            } else {
                iH = H();
            }
            if (i14 <= iH) {
                requestLayout();
            }
        }
        i13 = i10 + i11;
        i14 = i10;
        this.f6778m.h(i14);
        if (i12 != 1) {
            this.f6778m.j(i10, i11);
        } else if (i12 != 2) {
            this.f6778m.k(i10, i11);
        } else if (i12 == 8) {
            this.f6778m.k(i10, 1);
            this.f6778m.j(i11, 1);
        }
        if (i13 <= iH2) {
            return;
        }
        if (this.f6774i) {
            iH = G();
        } else {
            iH = H();
        }
        if (i14 <= iH) {
            requestLayout();
        }
    }

    private void Q(View view, int i10, int i11, boolean z10) {
        calculateItemDecorationsForChild(view, this.f6784s);
        c cVar = (c) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) cVar).leftMargin;
        Rect rect = this.f6784s;
        int iK0 = k0(i10, i12 + rect.left, ((ViewGroup.MarginLayoutParams) cVar).rightMargin + rect.right);
        int i13 = ((ViewGroup.MarginLayoutParams) cVar).topMargin;
        Rect rect2 = this.f6784s;
        int iK1 = k0(i11, i13 + rect2.top, ((ViewGroup.MarginLayoutParams) cVar).bottomMargin + rect2.bottom);
        if (z10 ? shouldReMeasureChild(view, iK0, iK1, cVar) : shouldMeasureChild(view, iK0, iK1, cVar)) {
            view.measure(iK0, iK1);
        }
    }

    private void R(View view, c cVar, boolean z10) {
        if (cVar.f6799f) {
            if (this.f6770e == 1) {
                Q(view, this.f6783r, RecyclerView.q.getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom(), ((ViewGroup.MarginLayoutParams) cVar).height, true), z10);
                return;
            } else {
                Q(view, RecyclerView.q.getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight(), ((ViewGroup.MarginLayoutParams) cVar).width, true), this.f6783r, z10);
                return;
            }
        }
        if (this.f6770e == 1) {
            Q(view, RecyclerView.q.getChildMeasureSpec(this.f6771f, getWidthMode(), 0, ((ViewGroup.MarginLayoutParams) cVar).width, false), RecyclerView.q.getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom(), ((ViewGroup.MarginLayoutParams) cVar).height, true), z10);
        } else {
            Q(view, RecyclerView.q.getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight(), ((ViewGroup.MarginLayoutParams) cVar).width, true), RecyclerView.q.getChildMeasureSpec(this.f6771f, getHeightMode(), 0, ((ViewGroup.MarginLayoutParams) cVar).height, false), z10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:86:0x0155  */
    private void S(RecyclerView.x xVar, RecyclerView.c0 c0Var, boolean z10) {
        boolean z11;
        e eVar;
        b bVar = this.f6785t;
        if (!(this.f6782q == null && this.f6776k == -1) && c0Var.b() == 0) {
            removeAndRecycleAllViews(xVar);
            bVar.c();
            return;
        }
        boolean z12 = (bVar.f6795e && this.f6776k == -1 && this.f6782q == null) ? false : true;
        if (z12) {
            bVar.c();
            if (this.f6782q != null) {
                l(bVar);
            } else {
                a0();
                bVar.f6793c = this.f6774i;
            }
            g0(c0Var, bVar);
            bVar.f6795e = true;
        }
        if (this.f6782q == null && this.f6776k == -1 && (bVar.f6793c != this.f6780o || isLayoutRTL() != this.f6781p)) {
            this.f6778m.b();
            bVar.f6794d = true;
        }
        if (getChildCount() > 0 && ((eVar = this.f6782q) == null || eVar.f6808c < 1)) {
            if (bVar.f6794d) {
                for (int i10 = 0; i10 < this.f6766a; i10++) {
                    this.f6767b[i10].e();
                    int i11 = bVar.f6792b;
                    if (i11 != Integer.MIN_VALUE) {
                        this.f6767b[i10].v(i11);
                    }
                }
            } else if (z12 || this.f6785t.f6796f == null) {
                for (int i12 = 0; i12 < this.f6766a; i12++) {
                    this.f6767b[i12].b(this.f6774i, bVar.f6792b);
                }
                this.f6785t.d(this.f6767b);
            } else {
                for (int i13 = 0; i13 < this.f6766a; i13++) {
                    f fVar = this.f6767b[i13];
                    fVar.e();
                    fVar.v(this.f6785t.f6796f[i13]);
                }
            }
        }
        detachAndScrapAttachedViews(xVar);
        this.f6772g.f7028a = false;
        this.f6786u = false;
        i0(this.f6769d.o());
        h0(bVar.f6791a, c0Var);
        if (bVar.f6793c) {
            b0(-1);
            y(xVar, this.f6772g, c0Var);
            b0(1);
            m mVar = this.f6772g;
            mVar.f7030c = bVar.f6791a + mVar.f7031d;
            y(xVar, mVar, c0Var);
        } else {
            b0(1);
            y(xVar, this.f6772g, c0Var);
            b0(-1);
            m mVar2 = this.f6772g;
            mVar2.f7030c = bVar.f6791a + mVar2.f7031d;
            y(xVar, mVar2, c0Var);
        }
        Z();
        if (getChildCount() > 0) {
            if (this.f6774i) {
                E(xVar, c0Var, true);
                F(xVar, c0Var, false);
            } else {
                F(xVar, c0Var, true);
                E(xVar, c0Var, false);
            }
        }
        if (z10 && !c0Var.e() && this.f6779n != 0 && getChildCount() > 0 && (this.f6786u || O() != null)) {
            removeCallbacks(this.f6789x);
            z11 = q();
        }
        if (c0Var.e()) {
            this.f6785t.c();
        }
        this.f6780o = bVar.f6793c;
        this.f6781p = isLayoutRTL();
        if (z11) {
            this.f6785t.c();
            S(xVar, c0Var, false);
        }
    }

    private boolean T(int i10) {
        if (this.f6770e == 0) {
            return (i10 == -1) != this.f6774i;
        }
        return ((i10 == -1) == this.f6774i) == isLayoutRTL();
    }

    private void V(View view) {
        for (int i10 = this.f6766a - 1; i10 >= 0; i10--) {
            this.f6767b[i10].u(view);
        }
    }

    private void W(RecyclerView.x xVar, m mVar) {
        int iMin;
        if (!mVar.f7028a || mVar.f7036i) {
            return;
        }
        if (mVar.f7029b == 0) {
            if (mVar.f7032e == -1) {
                X(xVar, mVar.f7034g);
                return;
            } else {
                Y(xVar, mVar.f7033f);
                return;
            }
        }
        if (mVar.f7032e == -1) {
            int i10 = mVar.f7033f;
            int iJ = i10 - J(i10);
            X(xVar, iJ < 0 ? mVar.f7034g : mVar.f7034g - Math.min(iJ, mVar.f7029b));
        } else {
            int iK = K(mVar.f7034g) - mVar.f7034g;
            if (iK < 0) {
                iMin = mVar.f7033f;
            } else {
                iMin = Math.min(iK, mVar.f7029b) + mVar.f7033f;
            }
            Y(xVar, iMin);
        }
    }

    private void X(RecyclerView.x xVar, int i10) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (this.f6768c.g(childAt) < i10 || this.f6768c.r(childAt) < i10) {
                return;
            }
            c cVar = (c) childAt.getLayoutParams();
            if (cVar.f6799f) {
                for (int i11 = 0; i11 < this.f6766a; i11++) {
                    if (this.f6767b[i11].f6816a.size() == 1) {
                        return;
                    }
                }
                for (int i12 = 0; i12 < this.f6766a; i12++) {
                    this.f6767b[i12].s();
                }
            } else if (cVar.f6798e.f6816a.size() == 1) {
                return;
            } else {
                cVar.f6798e.s();
            }
            removeAndRecycleView(childAt, xVar);
        }
    }

    private void Y(RecyclerView.x xVar, int i10) {
        while (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (this.f6768c.d(childAt) > i10 || this.f6768c.q(childAt) > i10) {
                return;
            }
            c cVar = (c) childAt.getLayoutParams();
            if (cVar.f6799f) {
                for (int i11 = 0; i11 < this.f6766a; i11++) {
                    if (this.f6767b[i11].f6816a.size() == 1) {
                        return;
                    }
                }
                for (int i12 = 0; i12 < this.f6766a; i12++) {
                    this.f6767b[i12].t();
                }
            } else if (cVar.f6798e.f6816a.size() == 1) {
                return;
            } else {
                cVar.f6798e.t();
            }
            removeAndRecycleView(childAt, xVar);
        }
    }

    private void Z() {
        if (this.f6769d.l() == 1073741824) {
            return;
        }
        int childCount = getChildCount();
        float fMax = 0.0f;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            float fE = this.f6769d.e(childAt);
            if (fE >= fMax) {
                if (((c) childAt.getLayoutParams()).f()) {
                    fE = (fE * 1.0f) / this.f6766a;
                }
                fMax = Math.max(fMax, fE);
            }
        }
        int i11 = this.f6771f;
        int iRound = Math.round(fMax * this.f6766a);
        if (this.f6769d.l() == Integer.MIN_VALUE) {
            iRound = Math.min(iRound, this.f6769d.o());
        }
        i0(iRound);
        if (this.f6771f == i11) {
            return;
        }
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt2 = getChildAt(i12);
            c cVar = (c) childAt2.getLayoutParams();
            if (!cVar.f6799f) {
                if (isLayoutRTL() && this.f6770e == 1) {
                    int i13 = this.f6766a;
                    int i14 = cVar.f6798e.f6820e;
                    childAt2.offsetLeftAndRight(((-((i13 - 1) - i14)) * this.f6771f) - ((-((i13 - 1) - i14)) * i11));
                } else {
                    int i15 = cVar.f6798e.f6820e;
                    int i16 = this.f6771f * i15;
                    int i17 = i15 * i11;
                    if (this.f6770e == 1) {
                        childAt2.offsetLeftAndRight(i16 - i17);
                    } else {
                        childAt2.offsetTopAndBottom(i16 - i17);
                    }
                }
            }
        }
    }

    private void a0() {
        if (this.f6770e == 1 || !isLayoutRTL()) {
            this.f6774i = this.f6773h;
        } else {
            this.f6774i = !this.f6773h;
        }
    }

    private void b0(int i10) {
        m mVar = this.f6772g;
        mVar.f7032e = i10;
        mVar.f7031d = this.f6774i != (i10 == -1) ? -1 : 1;
    }

    private int convertFocusDirectionToLayoutDirection(int i10) {
        if (i10 == 1) {
            return (this.f6770e != 1 && isLayoutRTL()) ? 1 : -1;
        }
        if (i10 == 2) {
            return (this.f6770e != 1 && isLayoutRTL()) ? -1 : 1;
        }
        if (i10 == 17) {
            return this.f6770e == 0 ? -1 : Integer.MIN_VALUE;
        }
        if (i10 == 33) {
            return this.f6770e == 1 ? -1 : Integer.MIN_VALUE;
        }
        if (i10 != 66) {
            return (i10 == 130 && this.f6770e == 1) ? 1 : Integer.MIN_VALUE;
        }
        return this.f6770e == 0 ? 1 : Integer.MIN_VALUE;
    }

    private void d0(int i10, int i11) {
        for (int i12 = 0; i12 < this.f6766a; i12++) {
            if (!this.f6767b[i12].f6816a.isEmpty()) {
                j0(this.f6767b[i12], i10, i11);
            }
        }
    }

    private boolean e0(RecyclerView.c0 c0Var, b bVar) {
        bVar.f6791a = this.f6780o ? D(c0Var.b()) : z(c0Var.b());
        bVar.f6792b = Integer.MIN_VALUE;
        return true;
    }

    private void h0(int i10, RecyclerView.c0 c0Var) {
        int iO;
        int iO2;
        int iC;
        m mVar = this.f6772g;
        boolean z10 = false;
        mVar.f7029b = 0;
        mVar.f7030c = i10;
        if (!isSmoothScrolling() || (iC = c0Var.c()) == -1) {
            iO = 0;
            iO2 = 0;
        } else {
            if (this.f6774i == (iC < i10)) {
                iO = this.f6768c.o();
                iO2 = 0;
            } else {
                iO2 = this.f6768c.o();
                iO = 0;
            }
        }
        if (getClipToPadding()) {
            this.f6772g.f7033f = this.f6768c.n() - iO2;
            this.f6772g.f7034g = this.f6768c.i() + iO;
        } else {
            this.f6772g.f7034g = this.f6768c.h() + iO;
            this.f6772g.f7033f = -iO2;
        }
        m mVar2 = this.f6772g;
        mVar2.f7035h = false;
        mVar2.f7028a = true;
        if (this.f6768c.l() == 0 && this.f6768c.h() == 0) {
            z10 = true;
        }
        mVar2.f7036i = z10;
    }

    private void j0(f fVar, int i10, int i11) {
        int iJ = fVar.j();
        if (i10 == -1) {
            if (fVar.o() + iJ <= i11) {
                this.f6775j.set(fVar.f6820e, false);
            }
        } else if (fVar.k() - iJ >= i11) {
            this.f6775j.set(fVar.f6820e, false);
        }
    }

    private void k(View view) {
        for (int i10 = this.f6766a - 1; i10 >= 0; i10--) {
            this.f6767b[i10].a(view);
        }
    }

    private int k0(int i10, int i11, int i12) {
        int mode;
        return (!(i11 == 0 && i12 == 0) && ((mode = View.MeasureSpec.getMode(i10)) == Integer.MIN_VALUE || mode == 1073741824)) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i10) - i11) - i12), mode) : i10;
    }

    private void l(b bVar) {
        e eVar = this.f6782q;
        int i10 = eVar.f6808c;
        if (i10 > 0) {
            if (i10 == this.f6766a) {
                for (int i11 = 0; i11 < this.f6766a; i11++) {
                    this.f6767b[i11].e();
                    e eVar2 = this.f6782q;
                    int i12 = eVar2.f6809d[i11];
                    if (i12 != Integer.MIN_VALUE) {
                        i12 += eVar2.f6814i ? this.f6768c.i() : this.f6768c.n();
                    }
                    this.f6767b[i11].v(i12);
                }
            } else {
                eVar.b();
                e eVar3 = this.f6782q;
                eVar3.f6806a = eVar3.f6807b;
            }
        }
        e eVar4 = this.f6782q;
        this.f6781p = eVar4.f6815j;
        setReverseLayout(eVar4.f6813h);
        a0();
        e eVar5 = this.f6782q;
        int i13 = eVar5.f6806a;
        if (i13 != -1) {
            this.f6776k = i13;
            bVar.f6793c = eVar5.f6814i;
        } else {
            bVar.f6793c = this.f6774i;
        }
        if (eVar5.f6810e > 1) {
            d dVar = this.f6778m;
            dVar.f6800a = eVar5.f6811f;
            dVar.f6801b = eVar5.f6812g;
        }
    }

    private void o(View view, c cVar, m mVar) {
        if (mVar.f7032e == 1) {
            if (cVar.f6799f) {
                k(view);
                return;
            } else {
                cVar.f6798e.a(view);
                return;
            }
        }
        if (cVar.f6799f) {
            V(view);
        } else {
            cVar.f6798e.u(view);
        }
    }

    private int p(int i10) {
        if (getChildCount() == 0) {
            return this.f6774i ? 1 : -1;
        }
        return (i10 < G()) != this.f6774i ? -1 : 1;
    }

    private boolean r(f fVar) {
        boolean z10;
        if (!this.f6774i) {
            if (fVar.o() > this.f6768c.n()) {
                z10 = fVar.n((View) fVar.f6816a.get(0)).f6799f;
                return !z10;
            }
            return false;
        }
        if (fVar.k() < this.f6768c.i()) {
            ArrayList arrayList = fVar.f6816a;
            z10 = fVar.n((View) arrayList.get(arrayList.size() - 1)).f6799f;
            return !z10;
        }
        return false;
    }

    private int s(RecyclerView.c0 c0Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        return v.a(c0Var, this.f6768c, B(!this.f6787v), A(!this.f6787v), this, this.f6787v);
    }

    private int t(RecyclerView.c0 c0Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        return v.b(c0Var, this.f6768c, B(!this.f6787v), A(!this.f6787v), this, this.f6787v, this.f6774i);
    }

    private int u(RecyclerView.c0 c0Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        return v.c(c0Var, this.f6768c, B(!this.f6787v), A(!this.f6787v), this, this.f6787v);
    }

    private d.a v(int i10) {
        d.a aVar = new d.a();
        aVar.f6804c = new int[this.f6766a];
        for (int i11 = 0; i11 < this.f6766a; i11++) {
            aVar.f6804c[i11] = i10 - this.f6767b[i11].l(i10);
        }
        return aVar;
    }

    private d.a w(int i10) {
        d.a aVar = new d.a();
        aVar.f6804c = new int[this.f6766a];
        for (int i11 = 0; i11 < this.f6766a; i11++) {
            aVar.f6804c[i11] = this.f6767b[i11].p(i10) - i10;
        }
        return aVar;
    }

    private void x() {
        this.f6768c = s.b(this, this.f6770e);
        this.f6769d = s.b(this, 1 - this.f6770e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.recyclerview.widget.RecyclerView$q, androidx.recyclerview.widget.StaggeredGridLayoutManager] */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.recyclerview.widget.StaggeredGridLayoutManager] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v5 */
    private int y(RecyclerView.x xVar, m mVar, RecyclerView.c0 c0Var) {
        int i10;
        int I;
        f fVarM;
        int iL;
        int iE;
        int iN;
        int iE2;
        ?? r10;
        StaggeredGridLayoutManager staggeredGridLayoutManager = this;
        ?? r11 = 0;
        staggeredGridLayoutManager.f6775j.set(0, staggeredGridLayoutManager.f6766a, true);
        if (staggeredGridLayoutManager.f6772g.f7036i) {
            i10 = mVar.f7032e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        } else {
            i10 = mVar.f7032e == 1 ? mVar.f7034g + mVar.f7029b : mVar.f7033f - mVar.f7029b;
        }
        int i11 = i10;
        staggeredGridLayoutManager.d0(mVar.f7032e, i11);
        int i12 = staggeredGridLayoutManager.f6774i ? staggeredGridLayoutManager.f6768c.i() : staggeredGridLayoutManager.f6768c.n();
        boolean z10 = false;
        ?? r12 = staggeredGridLayoutManager;
        while (mVar.a(c0Var) && (r12.f6772g.f7036i || !r12.f6775j.isEmpty())) {
            View viewB = mVar.b(xVar);
            c cVar = (c) viewB.getLayoutParams();
            int iA = cVar.a();
            int iG = r12.f6778m.g(iA);
            ?? r13 = iG == -1 ? 1 : r11;
            if (r13 != 0) {
                fVarM = cVar.f6799f ? r12.f6767b[r11] : r12.M(mVar);
                r12.f6778m.n(iA, fVarM);
            } else {
                fVarM = r12.f6767b[iG];
            }
            f fVar = fVarM;
            cVar.f6798e = fVar;
            if (mVar.f7032e == 1) {
                r12.addView(viewB);
            } else {
                r12.addView(viewB, r11);
            }
            r12.R(viewB, cVar, r11);
            if (mVar.f7032e == 1) {
                iE = cVar.f6799f ? r12.I(i12) : fVar.l(i12);
                iL = r12.f6768c.e(viewB) + iE;
                if (r13 != 0 && cVar.f6799f) {
                    d.a aVarV = r12.v(iE);
                    aVarV.f6803b = -1;
                    aVarV.f6802a = iA;
                    r12.f6778m.a(aVarV);
                }
            } else {
                iL = cVar.f6799f ? r12.L(i12) : fVar.p(i12);
                iE = iL - r12.f6768c.e(viewB);
                if (r13 != 0 && cVar.f6799f) {
                    d.a aVarW = r12.w(iL);
                    aVarW.f6803b = 1;
                    aVarW.f6802a = iA;
                    r12.f6778m.a(aVarW);
                }
            }
            if (cVar.f6799f && mVar.f7031d == -1) {
                if (r13 != 0) {
                    r12.f6786u = true;
                } else {
                    if (!(mVar.f7032e == 1 ? r12.m() : r12.n())) {
                        d.a aVarF = r12.f6778m.f(iA);
                        if (aVarF != null) {
                            aVarF.f6805d = true;
                        }
                        r12.f6786u = true;
                    }
                }
            }
            r12.o(viewB, cVar, mVar);
            if (r12.isLayoutRTL() && r12.f6770e == 1) {
                iE2 = cVar.f6799f ? r12.f6769d.i() : r12.f6769d.i() - (((r12.f6766a - 1) - fVar.f6820e) * r12.f6771f);
                iN = iE2 - r12.f6769d.e(viewB);
            } else {
                iN = cVar.f6799f ? r12.f6769d.n() : (fVar.f6820e * r12.f6771f) + r12.f6769d.n();
                iE2 = r12.f6769d.e(viewB) + iN;
            }
            int i13 = iE2;
            int i14 = iN;
            if (r12.f6770e == 1) {
                r12.layoutDecoratedWithMargins(viewB, i14, iE, i13, iL);
                r10 = this;
            } else {
                r12.layoutDecoratedWithMargins(viewB, iE, i14, iL, i13);
                r10 = r12;
            }
            if (cVar.f6799f) {
                r10.d0(r10.f6772g.f7032e, i11);
            } else {
                r10.j0(fVar, r10.f6772g.f7032e, i11);
            }
            r10.W(xVar, r10.f6772g);
            if (r10.f6772g.f7035h && viewB.hasFocusable()) {
                if (cVar.f6799f) {
                    r10.f6775j.clear();
                } else {
                    r10.f6775j.set(fVar.f6820e, false);
                }
            }
            z10 = true;
            r11 = 0;
            r12 = r10;
        }
        if (!z10) {
            r12.W(xVar, r12.f6772g);
        }
        if (r12.f6772g.f7032e == -1) {
            I = r12.f6768c.n() - r12.L(r12.f6768c.n());
        } else {
            I = r12.I(r12.f6768c.i()) - r12.f6768c.i();
        }
        if (I > 0) {
            return Math.min(mVar.f7029b, I);
        }
        return 0;
    }

    private int z(int i10) {
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            int position = getPosition(getChildAt(i11));
            if (position >= 0 && position < i10) {
                return position;
            }
        }
        return 0;
    }

    View A(boolean z10) {
        int iN = this.f6768c.n();
        int i10 = this.f6768c.i();
        View view = null;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            int iG = this.f6768c.g(childAt);
            int iD = this.f6768c.d(childAt);
            if (iD > iN && iG < i10) {
                if (iD <= i10 || !z10) {
                    return childAt;
                }
                if (view == null) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    View B(boolean z10) {
        int iN = this.f6768c.n();
        int i10 = this.f6768c.i();
        int childCount = getChildCount();
        View view = null;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            int iG = this.f6768c.g(childAt);
            if (this.f6768c.d(childAt) > iN && iG < i10) {
                if (iG >= iN || !z10) {
                    return childAt;
                }
                if (view == null) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    int C() {
        View viewA = this.f6774i ? A(true) : B(true);
        if (viewA == null) {
            return -1;
        }
        return getPosition(viewA);
    }

    int G() {
        if (getChildCount() == 0) {
            return 0;
        }
        return getPosition(getChildAt(0));
    }

    int H() {
        int childCount = getChildCount();
        if (childCount == 0) {
            return 0;
        }
        return getPosition(getChildAt(childCount - 1));
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0063  */
    /* JADX WARN: Code duplicated, block: B:31:0x0072 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x0075  */
    /* JADX WARN: Code duplicated, block: B:36:0x0084 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x0086  */
    /* JADX WARN: Code duplicated, block: B:39:0x0097  */
    /* JADX WARN: Code duplicated, block: B:40:0x0099  */
    /* JADX WARN: Code duplicated, block: B:42:0x009c  */
    /* JADX WARN: Code duplicated, block: B:43:0x009e  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x00a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x00a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x00a2 A[SYNTHETIC] */
    View O() {
        int i10;
        View childAt;
        int iG;
        int iG2;
        boolean z10;
        boolean z11;
        int iD;
        int iD2;
        int childCount = getChildCount();
        int i11 = childCount - 1;
        BitSet bitSet = new BitSet(this.f6766a);
        bitSet.set(0, this.f6766a, true);
        byte b10 = (this.f6770e == 1 && isLayoutRTL()) ? (byte) 1 : (byte) -1;
        if (this.f6774i) {
            childCount = -1;
        } else {
            i11 = 0;
        }
        int i12 = i11 < childCount ? 1 : -1;
        while (i11 != childCount) {
            View childAt2 = getChildAt(i11);
            c cVar = (c) childAt2.getLayoutParams();
            if (!bitSet.get(cVar.f6798e.f6820e)) {
                if (!cVar.f6799f && (i10 = i11 + i12) != childCount) {
                    childAt = getChildAt(i10);
                    if (this.f6774i) {
                        iD = this.f6768c.d(childAt2);
                        iD2 = this.f6768c.d(childAt);
                        if (iD >= iD2) {
                            if (iD == iD2) {
                                if (cVar.f6798e.f6820e - ((c) childAt.getLayoutParams()).f6798e.f6820e < 0) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (b10 < 0) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                if (z10 != z11) {
                                }
                            } else {
                                continue;
                            }
                        }
                    } else {
                        iG = this.f6768c.g(childAt2);
                        iG2 = this.f6768c.g(childAt);
                        if (iG <= iG2) {
                            if (iG == iG2) {
                                if (cVar.f6798e.f6820e - ((c) childAt.getLayoutParams()).f6798e.f6820e < 0) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (b10 < 0) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                if (z10 != z11) {
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                }
                i11 += i12;
            } else if (!r(cVar.f6798e)) {
                bitSet.clear(cVar.f6798e.f6820e);
                if (!cVar.f6799f) {
                    childAt = getChildAt(i10);
                    if (this.f6774i) {
                        iD = this.f6768c.d(childAt2);
                        iD2 = this.f6768c.d(childAt);
                        if (iD >= iD2) {
                            if (iD == iD2) {
                                if (cVar.f6798e.f6820e - ((c) childAt.getLayoutParams()).f6798e.f6820e < 0) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (b10 < 0) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                if (z10 != z11) {
                                }
                            } else {
                                continue;
                            }
                        }
                    } else {
                        iG = this.f6768c.g(childAt2);
                        iG2 = this.f6768c.g(childAt);
                        if (iG <= iG2) {
                            if (iG == iG2) {
                                if (cVar.f6798e.f6820e - ((c) childAt.getLayoutParams()).f6798e.f6820e < 0) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (b10 < 0) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                if (z10 != z11) {
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                }
                i11 += i12;
            }
            return childAt2;
        }
        return null;
    }

    public void P() {
        this.f6778m.b();
        requestLayout();
    }

    void U(int i10, RecyclerView.c0 c0Var) {
        int iG;
        int i11;
        if (i10 > 0) {
            iG = H();
            i11 = 1;
        } else {
            iG = G();
            i11 = -1;
        }
        this.f6772g.f7028a = true;
        h0(iG, c0Var);
        b0(i11);
        m mVar = this.f6772g;
        mVar.f7030c = iG + mVar.f7031d;
        mVar.f7029b = Math.abs(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void assertNotInLayoutOrScroll(String str) {
        if (this.f6782q == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    public void c0(int i10) {
        assertNotInLayoutOrScroll(null);
        if (i10 != this.f6766a) {
            P();
            this.f6766a = i10;
            this.f6775j = new BitSet(this.f6766a);
            this.f6767b = new f[this.f6766a];
            for (int i11 = 0; i11 < this.f6766a; i11++) {
                this.f6767b[i11] = new f(i11);
            }
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean canScrollHorizontally() {
        return this.f6770e == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean canScrollVertically() {
        return this.f6770e == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean checkLayoutParams(RecyclerView.r rVar) {
        return rVar instanceof c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void collectAdjacentPrefetchPositions(int i10, int i11, RecyclerView.c0 c0Var, RecyclerView.q.c cVar) {
        int iL;
        int iP;
        if (this.f6770e != 0) {
            i10 = i11;
        }
        if (getChildCount() == 0 || i10 == 0) {
            return;
        }
        U(i10, c0Var);
        int[] iArr = this.f6788w;
        if (iArr == null || iArr.length < this.f6766a) {
            this.f6788w = new int[this.f6766a];
        }
        int i12 = 0;
        for (int i13 = 0; i13 < this.f6766a; i13++) {
            m mVar = this.f6772g;
            if (mVar.f7031d == -1) {
                iL = mVar.f7033f;
                iP = this.f6767b[i13].p(iL);
            } else {
                iL = this.f6767b[i13].l(mVar.f7034g);
                iP = this.f6772g.f7034g;
            }
            int i14 = iL - iP;
            if (i14 >= 0) {
                this.f6788w[i12] = i14;
                i12++;
            }
        }
        Arrays.sort(this.f6788w, 0, i12);
        for (int i15 = 0; i15 < i12 && this.f6772g.a(c0Var); i15++) {
            cVar.a(this.f6772g.f7030c, this.f6788w[i15]);
            m mVar2 = this.f6772g;
            mVar2.f7030c += mVar2.f7031d;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int computeHorizontalScrollExtent(RecyclerView.c0 c0Var) {
        return s(c0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int computeHorizontalScrollOffset(RecyclerView.c0 c0Var) {
        return t(c0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int computeHorizontalScrollRange(RecyclerView.c0 c0Var) {
        return u(c0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.b0.b
    public PointF computeScrollVectorForPosition(int i10) {
        int iP = p(i10);
        PointF pointF = new PointF();
        if (iP == 0) {
            return null;
        }
        if (this.f6770e == 0) {
            pointF.x = iP;
            pointF.y = 0.0f;
            return pointF;
        }
        pointF.x = 0.0f;
        pointF.y = iP;
        return pointF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int computeVerticalScrollExtent(RecyclerView.c0 c0Var) {
        return s(c0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int computeVerticalScrollOffset(RecyclerView.c0 c0Var) {
        return t(c0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int computeVerticalScrollRange(RecyclerView.c0 c0Var) {
        return u(c0Var);
    }

    boolean f0(RecyclerView.c0 c0Var, b bVar) {
        int i10;
        if (!c0Var.e() && (i10 = this.f6776k) != -1) {
            if (i10 >= 0 && i10 < c0Var.b()) {
                e eVar = this.f6782q;
                if (eVar == null || eVar.f6806a == -1 || eVar.f6808c < 1) {
                    View viewFindViewByPosition = findViewByPosition(this.f6776k);
                    if (viewFindViewByPosition != null) {
                        bVar.f6791a = this.f6774i ? H() : G();
                        if (this.f6777l != Integer.MIN_VALUE) {
                            if (bVar.f6793c) {
                                bVar.f6792b = (this.f6768c.i() - this.f6777l) - this.f6768c.d(viewFindViewByPosition);
                            } else {
                                bVar.f6792b = (this.f6768c.n() + this.f6777l) - this.f6768c.g(viewFindViewByPosition);
                            }
                            return true;
                        }
                        if (this.f6768c.e(viewFindViewByPosition) > this.f6768c.o()) {
                            bVar.f6792b = bVar.f6793c ? this.f6768c.i() : this.f6768c.n();
                            return true;
                        }
                        int iG = this.f6768c.g(viewFindViewByPosition) - this.f6768c.n();
                        if (iG < 0) {
                            bVar.f6792b = -iG;
                            return true;
                        }
                        int i11 = this.f6768c.i() - this.f6768c.d(viewFindViewByPosition);
                        if (i11 < 0) {
                            bVar.f6792b = i11;
                            return true;
                        }
                        bVar.f6792b = Integer.MIN_VALUE;
                    } else {
                        int i12 = this.f6776k;
                        bVar.f6791a = i12;
                        int i13 = this.f6777l;
                        if (i13 == Integer.MIN_VALUE) {
                            bVar.f6793c = p(i12) == 1;
                            bVar.a();
                        } else {
                            bVar.b(i13);
                        }
                        bVar.f6794d = true;
                    }
                } else {
                    bVar.f6792b = Integer.MIN_VALUE;
                    bVar.f6791a = this.f6776k;
                }
                return true;
            }
            this.f6776k = -1;
            this.f6777l = Integer.MIN_VALUE;
        }
        return false;
    }

    void g0(RecyclerView.c0 c0Var, b bVar) {
        if (f0(c0Var, bVar) || e0(c0Var, bVar)) {
            return;
        }
        bVar.a();
        bVar.f6791a = 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public RecyclerView.r generateDefaultLayoutParams() {
        return this.f6770e == 0 ? new c(-2, -1) : new c(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public RecyclerView.r generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int getColumnCountForAccessibility(RecyclerView.x xVar, RecyclerView.c0 c0Var) {
        if (this.f6770e == 1) {
            return Math.min(this.f6766a, c0Var.b());
        }
        return -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int getRowCountForAccessibility(RecyclerView.x xVar, RecyclerView.c0 c0Var) {
        if (this.f6770e == 0) {
            return Math.min(this.f6766a, c0Var.b());
        }
        return -1;
    }

    void i0(int i10) {
        this.f6771f = i10 / this.f6766a;
        this.f6783r = View.MeasureSpec.makeMeasureSpec(i10, this.f6769d.l());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean isAutoMeasureEnabled() {
        return this.f6779n != 0;
    }

    boolean isLayoutRTL() {
        return getLayoutDirection() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean isLayoutReversed() {
        return this.f6773h;
    }

    boolean m() {
        int iL = this.f6767b[0].l(Integer.MIN_VALUE);
        for (int i10 = 1; i10 < this.f6766a; i10++) {
            if (this.f6767b[i10].l(Integer.MIN_VALUE) != iL) {
                return false;
            }
        }
        return true;
    }

    boolean n() {
        int iP = this.f6767b[0].p(Integer.MIN_VALUE);
        for (int i10 = 1; i10 < this.f6766a; i10++) {
            if (this.f6767b[i10].p(Integer.MIN_VALUE) != iP) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void offsetChildrenHorizontal(int i10) {
        super.offsetChildrenHorizontal(i10);
        for (int i11 = 0; i11 < this.f6766a; i11++) {
            this.f6767b[i11].r(i10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void offsetChildrenVertical(int i10) {
        super.offsetChildrenVertical(i10);
        for (int i11 = 0; i11 < this.f6766a; i11++) {
            this.f6767b[i11].r(i10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void onAdapterChanged(RecyclerView.h hVar, RecyclerView.h hVar2) {
        this.f6778m.b();
        for (int i10 = 0; i10 < this.f6766a; i10++) {
            this.f6767b[i10].e();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.x xVar) {
        super.onDetachedFromWindow(recyclerView, xVar);
        removeCallbacks(this.f6789x);
        for (int i10 = 0; i10 < this.f6766a; i10++) {
            this.f6767b[i10].e();
        }
        recyclerView.requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public View onFocusSearchFailed(View view, int i10, RecyclerView.x xVar, RecyclerView.c0 c0Var) {
        View viewFindContainingItemView;
        View viewM;
        if (getChildCount() == 0 || (viewFindContainingItemView = findContainingItemView(view)) == null) {
            return null;
        }
        a0();
        int iConvertFocusDirectionToLayoutDirection = convertFocusDirectionToLayoutDirection(i10);
        if (iConvertFocusDirectionToLayoutDirection == Integer.MIN_VALUE) {
            return null;
        }
        c cVar = (c) viewFindContainingItemView.getLayoutParams();
        boolean z10 = cVar.f6799f;
        f fVar = cVar.f6798e;
        int iH = iConvertFocusDirectionToLayoutDirection == 1 ? H() : G();
        h0(iH, c0Var);
        b0(iConvertFocusDirectionToLayoutDirection);
        m mVar = this.f6772g;
        mVar.f7030c = mVar.f7031d + iH;
        mVar.f7029b = (int) (this.f6768c.o() * 0.33333334f);
        m mVar2 = this.f6772g;
        mVar2.f7035h = true;
        mVar2.f7028a = false;
        y(xVar, mVar2, c0Var);
        this.f6780o = this.f6774i;
        if (!z10 && (viewM = fVar.m(iH, iConvertFocusDirectionToLayoutDirection)) != null && viewM != viewFindContainingItemView) {
            return viewM;
        }
        if (T(iConvertFocusDirectionToLayoutDirection)) {
            for (int i11 = this.f6766a - 1; i11 >= 0; i11--) {
                View viewM2 = this.f6767b[i11].m(iH, iConvertFocusDirectionToLayoutDirection);
                if (viewM2 != null && viewM2 != viewFindContainingItemView) {
                    return viewM2;
                }
            }
        } else {
            for (int i12 = 0; i12 < this.f6766a; i12++) {
                View viewM3 = this.f6767b[i12].m(iH, iConvertFocusDirectionToLayoutDirection);
                if (viewM3 != null && viewM3 != viewFindContainingItemView) {
                    return viewM3;
                }
            }
        }
        boolean z11 = (this.f6773h ^ true) == (iConvertFocusDirectionToLayoutDirection == -1);
        if (!z10) {
            View viewFindViewByPosition = findViewByPosition(z11 ? fVar.f() : fVar.g());
            if (viewFindViewByPosition != null && viewFindViewByPosition != viewFindContainingItemView) {
                return viewFindViewByPosition;
            }
        }
        if (T(iConvertFocusDirectionToLayoutDirection)) {
            for (int i13 = this.f6766a - 1; i13 >= 0; i13--) {
                if (i13 != fVar.f6820e) {
                    View viewFindViewByPosition2 = findViewByPosition(z11 ? this.f6767b[i13].f() : this.f6767b[i13].g());
                    if (viewFindViewByPosition2 != null && viewFindViewByPosition2 != viewFindContainingItemView) {
                        return viewFindViewByPosition2;
                    }
                }
            }
        } else {
            for (int i14 = 0; i14 < this.f6766a; i14++) {
                View viewFindViewByPosition3 = findViewByPosition(z11 ? this.f6767b[i14].f() : this.f6767b[i14].g());
                if (viewFindViewByPosition3 != null && viewFindViewByPosition3 != viewFindContainingItemView) {
                    return viewFindViewByPosition3;
                }
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            View viewB = B(false);
            View viewA = A(false);
            if (viewB == null || viewA == null) {
                return;
            }
            int position = getPosition(viewB);
            int position2 = getPosition(viewA);
            if (position < position2) {
                accessibilityEvent.setFromIndex(position);
                accessibilityEvent.setToIndex(position2);
            } else {
                accessibilityEvent.setFromIndex(position2);
                accessibilityEvent.setToIndex(position);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void onInitializeAccessibilityNodeInfo(RecyclerView.x xVar, RecyclerView.c0 c0Var, o0.p pVar) {
        super.onInitializeAccessibilityNodeInfo(xVar, c0Var, pVar);
        pVar.u0("androidx.recyclerview.widget.StaggeredGridLayoutManager");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void onInitializeAccessibilityNodeInfoForItem(RecyclerView.x xVar, RecyclerView.c0 c0Var, View view, o0.p pVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof c)) {
            super.onInitializeAccessibilityNodeInfoForItem(view, pVar);
            return;
        }
        c cVar = (c) layoutParams;
        if (this.f6770e == 0) {
            pVar.x0(o0.p.h.a(cVar.e(), cVar.f6799f ? this.f6766a : 1, -1, -1, false, false));
        } else {
            pVar.x0(o0.p.h.a(-1, -1, cVar.e(), cVar.f6799f ? this.f6766a : 1, false, false));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void onItemsAdded(RecyclerView recyclerView, int i10, int i11) {
        N(i10, i11, 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void onItemsChanged(RecyclerView recyclerView) {
        this.f6778m.b();
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void onItemsMoved(RecyclerView recyclerView, int i10, int i11, int i12) {
        N(i10, i11, 8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void onItemsRemoved(RecyclerView recyclerView, int i10, int i11) {
        N(i10, i11, 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void onItemsUpdated(RecyclerView recyclerView, int i10, int i11, Object obj) {
        N(i10, i11, 4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void onLayoutChildren(RecyclerView.x xVar, RecyclerView.c0 c0Var) {
        S(xVar, c0Var, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void onLayoutCompleted(RecyclerView.c0 c0Var) {
        super.onLayoutCompleted(c0Var);
        this.f6776k = -1;
        this.f6777l = Integer.MIN_VALUE;
        this.f6782q = null;
        this.f6785t.c();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof e) {
            e eVar = (e) parcelable;
            this.f6782q = eVar;
            if (this.f6776k != -1) {
                eVar.a();
                this.f6782q.b();
            }
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public Parcelable onSaveInstanceState() {
        int iP;
        int iN;
        int[] iArr;
        if (this.f6782q != null) {
            return new e(this.f6782q);
        }
        e eVar = new e();
        eVar.f6813h = this.f6773h;
        eVar.f6814i = this.f6780o;
        eVar.f6815j = this.f6781p;
        d dVar = this.f6778m;
        if (dVar == null || (iArr = dVar.f6800a) == null) {
            eVar.f6810e = 0;
        } else {
            eVar.f6811f = iArr;
            eVar.f6810e = iArr.length;
            eVar.f6812g = dVar.f6801b;
        }
        if (getChildCount() <= 0) {
            eVar.f6806a = -1;
            eVar.f6807b = -1;
            eVar.f6808c = 0;
            return eVar;
        }
        eVar.f6806a = this.f6780o ? H() : G();
        eVar.f6807b = C();
        int i10 = this.f6766a;
        eVar.f6808c = i10;
        eVar.f6809d = new int[i10];
        for (int i11 = 0; i11 < this.f6766a; i11++) {
            if (this.f6780o) {
                iP = this.f6767b[i11].l(Integer.MIN_VALUE);
                if (iP != Integer.MIN_VALUE) {
                    iN = this.f6768c.i();
                    iP -= iN;
                }
            } else {
                iP = this.f6767b[i11].p(Integer.MIN_VALUE);
                if (iP != Integer.MIN_VALUE) {
                    iN = this.f6768c.n();
                    iP -= iN;
                }
            }
            eVar.f6809d[i11] = iP;
        }
        return eVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void onScrollStateChanged(int i10) {
        if (i10 == 0) {
            q();
        }
    }

    boolean q() {
        int iG;
        int iH;
        if (getChildCount() == 0 || this.f6779n == 0 || !isAttachedToWindow()) {
            return false;
        }
        if (this.f6774i) {
            iG = H();
            iH = G();
        } else {
            iG = G();
            iH = H();
        }
        if (iG == 0 && O() != null) {
            this.f6778m.b();
            requestSimpleAnimationsInNextLayout();
            requestLayout();
            return true;
        }
        if (!this.f6786u) {
            return false;
        }
        int i10 = this.f6774i ? -1 : 1;
        int i11 = iH + 1;
        d.a aVarE = this.f6778m.e(iG, i11, i10, true);
        if (aVarE == null) {
            this.f6786u = false;
            this.f6778m.d(i11);
            return false;
        }
        d.a aVarE2 = this.f6778m.e(iG, aVarE.f6802a, i10 * (-1), true);
        if (aVarE2 == null) {
            this.f6778m.d(aVarE.f6802a);
        } else {
            this.f6778m.d(aVarE2.f6802a + 1);
        }
        requestSimpleAnimationsInNextLayout();
        requestLayout();
        return true;
    }

    int scrollBy(int i10, RecyclerView.x xVar, RecyclerView.c0 c0Var) {
        if (getChildCount() == 0 || i10 == 0) {
            return 0;
        }
        U(i10, c0Var);
        int iY = y(xVar, this.f6772g, c0Var);
        if (this.f6772g.f7029b >= iY) {
            i10 = i10 < 0 ? -iY : iY;
        }
        this.f6768c.s(-i10);
        this.f6780o = this.f6774i;
        m mVar = this.f6772g;
        mVar.f7029b = 0;
        W(xVar, mVar);
        return i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int scrollHorizontallyBy(int i10, RecyclerView.x xVar, RecyclerView.c0 c0Var) {
        return scrollBy(i10, xVar, c0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void scrollToPosition(int i10) {
        e eVar = this.f6782q;
        if (eVar != null && eVar.f6806a != i10) {
            eVar.a();
        }
        this.f6776k = i10;
        this.f6777l = Integer.MIN_VALUE;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int scrollVerticallyBy(int i10, RecyclerView.x xVar, RecyclerView.c0 c0Var) {
        return scrollBy(i10, xVar, c0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void setMeasuredDimension(Rect rect, int i10, int i11) {
        int iChooseSize;
        int iChooseSize2;
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.f6770e == 1) {
            iChooseSize2 = RecyclerView.q.chooseSize(i11, rect.height() + paddingTop, getMinimumHeight());
            iChooseSize = RecyclerView.q.chooseSize(i10, (this.f6771f * this.f6766a) + paddingLeft, getMinimumWidth());
        } else {
            iChooseSize = RecyclerView.q.chooseSize(i10, rect.width() + paddingLeft, getMinimumWidth());
            iChooseSize2 = RecyclerView.q.chooseSize(i11, (this.f6771f * this.f6766a) + paddingTop, getMinimumHeight());
        }
        setMeasuredDimension(iChooseSize, iChooseSize2);
    }

    public void setOrientation(int i10) {
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        assertNotInLayoutOrScroll(null);
        if (i10 == this.f6770e) {
            return;
        }
        this.f6770e = i10;
        s sVar = this.f6768c;
        this.f6768c = this.f6769d;
        this.f6769d = sVar;
        requestLayout();
    }

    public void setReverseLayout(boolean z10) {
        assertNotInLayoutOrScroll(null);
        e eVar = this.f6782q;
        if (eVar != null && eVar.f6813h != z10) {
            eVar.f6813h = z10;
        }
        this.f6773h = z10;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.c0 c0Var, int i10) {
        n nVar = new n(recyclerView.getContext());
        nVar.setTargetPosition(i10);
        startSmoothScroll(nVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean supportsPredictiveItemAnimations() {
        return this.f6782q == null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public RecyclerView.r generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new c((ViewGroup.MarginLayoutParams) layoutParams) : new c(layoutParams);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int[] f6800a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        List f6801b;

        d() {
        }

        private int i(int i10) {
            if (this.f6801b == null) {
                return -1;
            }
            a aVarF = f(i10);
            if (aVarF != null) {
                this.f6801b.remove(aVarF);
            }
            int size = this.f6801b.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    i11 = -1;
                    break;
                }
                if (((a) this.f6801b.get(i11)).f6802a >= i10) {
                    break;
                }
                i11++;
            }
            if (i11 == -1) {
                return -1;
            }
            a aVar = (a) this.f6801b.get(i11);
            this.f6801b.remove(i11);
            return aVar.f6802a;
        }

        private void l(int i10, int i11) {
            List list = this.f6801b;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = (a) this.f6801b.get(size);
                int i12 = aVar.f6802a;
                if (i12 >= i10) {
                    aVar.f6802a = i12 + i11;
                }
            }
        }

        private void m(int i10, int i11) {
            List list = this.f6801b;
            if (list == null) {
                return;
            }
            int i12 = i10 + i11;
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = (a) this.f6801b.get(size);
                int i13 = aVar.f6802a;
                if (i13 >= i10) {
                    if (i13 < i12) {
                        this.f6801b.remove(size);
                    } else {
                        aVar.f6802a = i13 - i11;
                    }
                }
            }
        }

        public void a(a aVar) {
            if (this.f6801b == null) {
                this.f6801b = new ArrayList();
            }
            int size = this.f6801b.size();
            for (int i10 = 0; i10 < size; i10++) {
                a aVar2 = (a) this.f6801b.get(i10);
                if (aVar2.f6802a == aVar.f6802a) {
                    this.f6801b.remove(i10);
                }
                if (aVar2.f6802a >= aVar.f6802a) {
                    this.f6801b.add(i10, aVar);
                    return;
                }
            }
            this.f6801b.add(aVar);
        }

        void b() {
            int[] iArr = this.f6800a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f6801b = null;
        }

        void c(int i10) {
            int[] iArr = this.f6800a;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i10, 10) + 1];
                this.f6800a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i10 >= iArr.length) {
                int[] iArr3 = new int[o(i10)];
                this.f6800a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f6800a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        int d(int i10) {
            List list = this.f6801b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (((a) this.f6801b.get(size)).f6802a >= i10) {
                        this.f6801b.remove(size);
                    }
                }
            }
            return h(i10);
        }

        public a e(int i10, int i11, int i12, boolean z10) {
            List list = this.f6801b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i13 = 0; i13 < size; i13++) {
                a aVar = (a) this.f6801b.get(i13);
                int i14 = aVar.f6802a;
                if (i14 >= i11) {
                    return null;
                }
                if (i14 >= i10 && (i12 == 0 || aVar.f6803b == i12 || (z10 && aVar.f6805d))) {
                    return aVar;
                }
            }
            return null;
        }

        public a f(int i10) {
            List list = this.f6801b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = (a) this.f6801b.get(size);
                if (aVar.f6802a == i10) {
                    return aVar;
                }
            }
            return null;
        }

        int g(int i10) {
            int[] iArr = this.f6800a;
            if (iArr == null || i10 >= iArr.length) {
                return -1;
            }
            return iArr[i10];
        }

        int h(int i10) {
            int[] iArr = this.f6800a;
            if (iArr == null || i10 >= iArr.length) {
                return -1;
            }
            int i11 = i(i10);
            if (i11 == -1) {
                int[] iArr2 = this.f6800a;
                Arrays.fill(iArr2, i10, iArr2.length, -1);
                return this.f6800a.length;
            }
            int iMin = Math.min(i11 + 1, this.f6800a.length);
            Arrays.fill(this.f6800a, i10, iMin, -1);
            return iMin;
        }

        void j(int i10, int i11) {
            int[] iArr = this.f6800a;
            if (iArr == null || i10 >= iArr.length) {
                return;
            }
            int i12 = i10 + i11;
            c(i12);
            int[] iArr2 = this.f6800a;
            System.arraycopy(iArr2, i10, iArr2, i12, (iArr2.length - i10) - i11);
            Arrays.fill(this.f6800a, i10, i12, -1);
            l(i10, i11);
        }

        void k(int i10, int i11) {
            int[] iArr = this.f6800a;
            if (iArr == null || i10 >= iArr.length) {
                return;
            }
            int i12 = i10 + i11;
            c(i12);
            int[] iArr2 = this.f6800a;
            System.arraycopy(iArr2, i12, iArr2, i10, (iArr2.length - i10) - i11);
            int[] iArr3 = this.f6800a;
            Arrays.fill(iArr3, iArr3.length - i11, iArr3.length, -1);
            m(i10, i11);
        }

        void n(int i10, f fVar) {
            c(i10);
            this.f6800a[i10] = fVar.f6820e;
        }

        int o(int i10) {
            int length = this.f6800a.length;
            while (length <= i10) {
                length *= 2;
            }
            return length;
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        static class a implements Parcelable {
            public static final Parcelable.Creator<a> CREATOR = new C0075a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f6802a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f6803b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            int[] f6804c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            boolean f6805d;

            /* JADX INFO: renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
            class C0075a implements Parcelable.Creator {
                C0075a() {
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public a createFromParcel(Parcel parcel) {
                    return new a(parcel);
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public a[] newArray(int i10) {
                    return new a[i10];
                }
            }

            a(Parcel parcel) {
                this.f6802a = parcel.readInt();
                this.f6803b = parcel.readInt();
                this.f6805d = parcel.readInt() == 1;
                int i10 = parcel.readInt();
                if (i10 > 0) {
                    int[] iArr = new int[i10];
                    this.f6804c = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            int a(int i10) {
                int[] iArr = this.f6804c;
                if (iArr == null) {
                    return 0;
                }
                return iArr[i10];
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.f6802a + ", mGapDir=" + this.f6803b + ", mHasUnwantedGapAfter=" + this.f6805d + ", mGapPerSpan=" + Arrays.toString(this.f6804c) + '}';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i10) {
                parcel.writeInt(this.f6802a);
                parcel.writeInt(this.f6803b);
                parcel.writeInt(this.f6805d ? 1 : 0);
                int[] iArr = this.f6804c;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(iArr.length);
                    parcel.writeIntArray(this.f6804c);
                }
            }

            a() {
            }
        }
    }
}
