package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
class c extends androidx.appcompat.view.menu.a implements n0.b.a {
    RunnableC0014c A;
    private b B;
    final f C;
    int D;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    d f1527k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Drawable f1528l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f1529m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f1530n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f1531o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f1532p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f1533q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f1534r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f1535s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f1536t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f1537u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f1538v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f1539w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final SparseBooleanArray f1540x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    e f1541y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    a f1542z;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class a extends androidx.appcompat.view.menu.i {
        public a(Context context, androidx.appcompat.view.menu.m mVar, View view) {
            super(context, mVar, view, false, h.a.f39856i);
            if (!((androidx.appcompat.view.menu.g) mVar.getItem()).l()) {
                View view2 = c.this.f1527k;
                f(view2 == null ? (View) ((androidx.appcompat.view.menu.a) c.this).f1002i : view2);
            }
            j(c.this.C);
        }

        @Override // androidx.appcompat.view.menu.i
        protected void e() {
            c cVar = c.this;
            cVar.f1542z = null;
            cVar.D = 0;
            super.e();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class b extends ActionMenuItemView.b {
        b() {
        }

        @Override // androidx.appcompat.view.menu.ActionMenuItemView.b
        public m.e a() {
            a aVar = c.this.f1542z;
            if (aVar != null) {
                return aVar.c();
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class RunnableC0014c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private e f1545a;

        public RunnableC0014c(e eVar) {
            this.f1545a = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (((androidx.appcompat.view.menu.a) c.this).f996c != null) {
                ((androidx.appcompat.view.menu.a) c.this).f996c.d();
            }
            View view = (View) ((androidx.appcompat.view.menu.a) c.this).f1002i;
            if (view != null && view.getWindowToken() != null && this.f1545a.m()) {
                c.this.f1541y = this.f1545a;
            }
            c.this.A = null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class d extends AppCompatImageView implements ActionMenuView.a {

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class a extends b0 {

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ c f1548j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(View view, c cVar) {
                super(view);
                this.f1548j = cVar;
            }

            @Override // androidx.appcompat.widget.b0
            public m.e b() {
                e eVar = c.this.f1541y;
                if (eVar == null) {
                    return null;
                }
                return eVar.c();
            }

            @Override // androidx.appcompat.widget.b0
            public boolean c() {
                c.this.N();
                return true;
            }

            @Override // androidx.appcompat.widget.b0
            public boolean d() {
                c cVar = c.this;
                if (cVar.A != null) {
                    return false;
                }
                cVar.E();
                return true;
            }
        }

        public d(Context context) {
            super(context, null, h.a.f39855h);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            t0.a(this, getContentDescription());
            setOnTouchListener(new a(this, c.this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean a() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean b() {
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            c.this.N();
            return true;
        }

        @Override // android.widget.ImageView
        protected boolean setFrame(int i10, int i11, int i12, int i13) {
            boolean frame = super.setFrame(i10, i11, i12, i13);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int iMax = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                f0.a.l(background, paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
            }
            return frame;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class e extends androidx.appcompat.view.menu.i {
        public e(Context context, androidx.appcompat.view.menu.e eVar, View view, boolean z10) {
            super(context, eVar, view, z10, h.a.f39856i);
            h(8388613);
            j(c.this.C);
        }

        @Override // androidx.appcompat.view.menu.i
        protected void e() {
            if (((androidx.appcompat.view.menu.a) c.this).f996c != null) {
                ((androidx.appcompat.view.menu.a) c.this).f996c.close();
            }
            c.this.f1541y = null;
            super.e();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class f implements androidx.appcompat.view.menu.j.a {
        f() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public void b(androidx.appcompat.view.menu.e eVar, boolean z10) {
            if (eVar instanceof androidx.appcompat.view.menu.m) {
                eVar.F().e(false);
            }
            androidx.appcompat.view.menu.j.a aVarP = c.this.p();
            if (aVarP != null) {
                aVarP.b(eVar, z10);
            }
        }

        @Override // androidx.appcompat.view.menu.j.a
        public boolean c(androidx.appcompat.view.menu.e eVar) {
            if (eVar == ((androidx.appcompat.view.menu.a) c.this).f996c) {
                return false;
            }
            c.this.D = ((androidx.appcompat.view.menu.m) eVar).getItem().getItemId();
            androidx.appcompat.view.menu.j.a aVarP = c.this.p();
            if (aVarP != null) {
                return aVarP.c(eVar);
            }
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class g implements Parcelable {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f1552a;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public g createFromParcel(Parcel parcel) {
                return new g(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public g[] newArray(int i10) {
                return new g[i10];
            }
        }

        g() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f1552a);
        }

        g(Parcel parcel) {
            this.f1552a = parcel.readInt();
        }
    }

    public c(Context context) {
        super(context, h.g.f39950c, h.g.f39949b);
        this.f1540x = new SparseBooleanArray();
        this.C = new f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private View C(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f1002i;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if ((childAt instanceof androidx.appcompat.view.menu.k.a) && ((androidx.appcompat.view.menu.k.a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    public boolean B() {
        return E() | F();
    }

    public Drawable D() {
        d dVar = this.f1527k;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (this.f1529m) {
            return this.f1528l;
        }
        return null;
    }

    public boolean E() {
        Object obj;
        RunnableC0014c runnableC0014c = this.A;
        if (runnableC0014c != null && (obj = this.f1002i) != null) {
            ((View) obj).removeCallbacks(runnableC0014c);
            this.A = null;
            return true;
        }
        e eVar = this.f1541y;
        if (eVar == null) {
            return false;
        }
        eVar.b();
        return true;
    }

    public boolean F() {
        a aVar = this.f1542z;
        if (aVar == null) {
            return false;
        }
        aVar.b();
        return true;
    }

    public boolean G() {
        return this.A != null || H();
    }

    public boolean H() {
        e eVar = this.f1541y;
        return eVar != null && eVar.d();
    }

    public void I(Configuration configuration) {
        if (!this.f1535s) {
            this.f1534r = androidx.appcompat.view.a.b(this.f995b).d();
        }
        androidx.appcompat.view.menu.e eVar = this.f996c;
        if (eVar != null) {
            eVar.N(true);
        }
    }

    public void J(boolean z10) {
        this.f1538v = z10;
    }

    public void K(ActionMenuView actionMenuView) {
        this.f1002i = actionMenuView;
        actionMenuView.a(this.f996c);
    }

    public void L(Drawable drawable) {
        d dVar = this.f1527k;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
        } else {
            this.f1529m = true;
            this.f1528l = drawable;
        }
    }

    public void M(boolean z10) {
        this.f1530n = z10;
        this.f1531o = true;
    }

    public boolean N() {
        androidx.appcompat.view.menu.e eVar;
        if (!this.f1530n || H() || (eVar = this.f996c) == null || this.f1002i == null || this.A != null || eVar.B().isEmpty()) {
            return false;
        }
        RunnableC0014c runnableC0014c = new RunnableC0014c(new e(this.f995b, this.f996c, this.f1527k, true));
        this.A = runnableC0014c;
        ((View) this.f1002i).post(runnableC0014c);
        return true;
    }

    @Override // n0.b.a
    public void a(boolean z10) {
        if (z10) {
            super.f(null);
            return;
        }
        androidx.appcompat.view.menu.e eVar = this.f996c;
        if (eVar != null) {
            eVar.e(false);
        }
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.j
    public void b(androidx.appcompat.view.menu.e eVar, boolean z10) {
        B();
        super.b(eVar, z10);
    }

    @Override // androidx.appcompat.view.menu.j
    public void e(Parcelable parcelable) {
        int i10;
        MenuItem menuItemFindItem;
        if ((parcelable instanceof g) && (i10 = ((g) parcelable).f1552a) > 0 && (menuItemFindItem = this.f996c.findItem(i10)) != null) {
            f((androidx.appcompat.view.menu.m) menuItemFindItem.getSubMenu());
        }
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.j
    public boolean f(androidx.appcompat.view.menu.m mVar) {
        boolean z10 = false;
        if (!mVar.hasVisibleItems()) {
            return false;
        }
        androidx.appcompat.view.menu.m mVar2 = mVar;
        while (mVar2.j0() != this.f996c) {
            mVar2 = (androidx.appcompat.view.menu.m) mVar2.j0();
        }
        View viewC = C(mVar2.getItem());
        if (viewC == null) {
            return false;
        }
        this.D = mVar.getItem().getItemId();
        int size = mVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = mVar.getItem(i10);
            if (item.isVisible() && item.getIcon() != null) {
                z10 = true;
                break;
            }
        }
        a aVar = new a(this.f995b, mVar, viewC);
        this.f1542z = aVar;
        aVar.g(z10);
        this.f1542z.k();
        super.f(mVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.j
    public Parcelable g() {
        g gVar = new g();
        gVar.f1552a = this.D;
        return gVar;
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.j
    public void h(boolean z10) {
        super.h(z10);
        ((View) this.f1002i).requestLayout();
        androidx.appcompat.view.menu.e eVar = this.f996c;
        boolean z11 = false;
        if (eVar != null) {
            ArrayList arrayListU = eVar.u();
            int size = arrayListU.size();
            for (int i10 = 0; i10 < size; i10++) {
                n0.b bVarB = ((androidx.appcompat.view.menu.g) arrayListU.get(i10)).b();
                if (bVarB != null) {
                    bVarB.h(this);
                }
            }
        }
        androidx.appcompat.view.menu.e eVar2 = this.f996c;
        ArrayList arrayListB = eVar2 != null ? eVar2.B() : null;
        if (this.f1530n && arrayListB != null) {
            int size2 = arrayListB.size();
            if (size2 == 1) {
                z11 = !((androidx.appcompat.view.menu.g) arrayListB.get(0)).isActionViewExpanded();
            } else if (size2 > 0) {
                z11 = true;
            }
        }
        if (z11) {
            if (this.f1527k == null) {
                this.f1527k = new d(this.f994a);
            }
            ViewGroup viewGroup = (ViewGroup) this.f1527k.getParent();
            if (viewGroup != this.f1002i) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f1527k);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f1002i;
                actionMenuView.addView(this.f1527k, actionMenuView.D());
            }
        } else {
            d dVar = this.f1527k;
            if (dVar != null) {
                Object parent = dVar.getParent();
                Object obj = this.f1002i;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.f1527k);
                }
            }
        }
        ((ActionMenuView) this.f1002i).setOverflowReserved(this.f1530n);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.appcompat.widget.c] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r15v1, types: [androidx.appcompat.view.menu.g] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v12 */
    @Override // androidx.appcompat.view.menu.j
    public boolean i() {
        ArrayList arrayListG;
        int size;
        int i10;
        int iJ;
        ?? r10;
        c cVar = this;
        androidx.appcompat.view.menu.e eVar = cVar.f996c;
        View view = null;
        ?? r11 = 0;
        if (eVar != null) {
            arrayListG = eVar.G();
            size = arrayListG.size();
        } else {
            arrayListG = null;
            size = 0;
        }
        int i11 = cVar.f1534r;
        int i12 = cVar.f1533q;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) cVar.f1002i;
        boolean z10 = false;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < size; i15++) {
            androidx.appcompat.view.menu.g gVar = (androidx.appcompat.view.menu.g) arrayListG.get(i15);
            if (gVar.o()) {
                i13++;
            } else if (gVar.n()) {
                i14++;
            } else {
                z10 = true;
            }
            if (cVar.f1538v && gVar.isActionViewExpanded()) {
                i11 = 0;
            }
        }
        if (cVar.f1530n && (z10 || i14 + i13 > i11)) {
            i11--;
        }
        int i16 = i11 - i13;
        SparseBooleanArray sparseBooleanArray = cVar.f1540x;
        sparseBooleanArray.clear();
        if (cVar.f1536t) {
            int i17 = cVar.f1539w;
            iJ = i12 / i17;
            i10 = i17 + ((i12 % i17) / iJ);
        } else {
            i10 = 0;
            iJ = 0;
        }
        int i18 = 0;
        int i19 = 0;
        ?? r12 = cVar;
        while (i18 < size) {
            ?? r15 = (androidx.appcompat.view.menu.g) arrayListG.get(i18);
            if (r15.o()) {
                View viewQ = r12.q(r15, view, viewGroup);
                if (r12.f1536t) {
                    iJ -= ActionMenuView.J(viewQ, i10, iJ, iMakeMeasureSpec, r11);
                } else {
                    viewQ.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                }
                int measuredWidth = viewQ.getMeasuredWidth();
                i12 -= measuredWidth;
                if (i19 == 0) {
                    i19 = measuredWidth;
                }
                int groupId = r15.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                r15.u(true);
                r10 = r11;
            } else if (r15.n()) {
                int groupId2 = r15.getGroupId();
                boolean z11 = sparseBooleanArray.get(groupId2);
                boolean z12 = (i16 > 0 || z11) && i12 > 0 && (!r12.f1536t || iJ > 0);
                boolean z13 = z12;
                if (z12) {
                    View viewQ2 = r12.q(r15, null, viewGroup);
                    if (r12.f1536t) {
                        int iJ2 = ActionMenuView.J(viewQ2, i10, iJ, iMakeMeasureSpec, 0);
                        iJ -= iJ2;
                        if (iJ2 == 0) {
                            z13 = false;
                        }
                    } else {
                        viewQ2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                    }
                    boolean z14 = z13;
                    int measuredWidth2 = viewQ2.getMeasuredWidth();
                    i12 -= measuredWidth2;
                    if (i19 == 0) {
                        i19 = measuredWidth2;
                    }
                    z12 = z14 & (!r12.f1536t ? i12 + i19 <= 0 : i12 < 0);
                }
                if (z12 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z11) {
                    sparseBooleanArray.put(groupId2, false);
                    for (int i20 = 0; i20 < i18; i20++) {
                        androidx.appcompat.view.menu.g gVar2 = (androidx.appcompat.view.menu.g) arrayListG.get(i20);
                        if (gVar2.getGroupId() == groupId2) {
                            if (gVar2.l()) {
                                i16++;
                            }
                            gVar2.u(false);
                        }
                    }
                }
                if (z12) {
                    i16--;
                }
                r15.u(z12);
                r10 = 0;
            } else {
                r10 = r11;
                r15.u(r10);
            }
            i18++;
            r11 = r10;
            size = size;
            view = null;
            r12 = this;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.j
    public void k(Context context, androidx.appcompat.view.menu.e eVar) {
        super.k(context, eVar);
        Resources resources = context.getResources();
        androidx.appcompat.view.a aVarB = androidx.appcompat.view.a.b(context);
        if (!this.f1531o) {
            this.f1530n = aVarB.f();
        }
        if (!this.f1537u) {
            this.f1532p = aVarB.c();
        }
        if (!this.f1535s) {
            this.f1534r = aVarB.d();
        }
        int measuredWidth = this.f1532p;
        if (this.f1530n) {
            if (this.f1527k == null) {
                d dVar = new d(this.f994a);
                this.f1527k = dVar;
                if (this.f1529m) {
                    dVar.setImageDrawable(this.f1528l);
                    this.f1528l = null;
                    this.f1529m = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f1527k.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.f1527k.getMeasuredWidth();
        } else {
            this.f1527k = null;
        }
        this.f1533q = measuredWidth;
        this.f1539w = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    @Override // androidx.appcompat.view.menu.a
    public void m(androidx.appcompat.view.menu.g gVar, androidx.appcompat.view.menu.k.a aVar) {
        aVar.c(gVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f1002i);
        if (this.B == null) {
            this.B = new b();
        }
        actionMenuItemView.setPopupCallback(this.B);
    }

    @Override // androidx.appcompat.view.menu.a
    public boolean o(ViewGroup viewGroup, int i10) {
        if (viewGroup.getChildAt(i10) == this.f1527k) {
            return false;
        }
        return super.o(viewGroup, i10);
    }

    @Override // androidx.appcompat.view.menu.a
    public View q(androidx.appcompat.view.menu.g gVar, View view, ViewGroup viewGroup) {
        View actionView = gVar.getActionView();
        if (actionView == null || gVar.j()) {
            actionView = super.q(gVar, view, viewGroup);
        }
        actionView.setVisibility(gVar.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    @Override // androidx.appcompat.view.menu.a
    public androidx.appcompat.view.menu.k r(ViewGroup viewGroup) {
        androidx.appcompat.view.menu.k kVar = this.f1002i;
        androidx.appcompat.view.menu.k kVarR = super.r(viewGroup);
        if (kVar != kVarR) {
            ((ActionMenuView) kVarR).setPresenter(this);
        }
        return kVarR;
    }

    @Override // androidx.appcompat.view.menu.a
    public boolean t(int i10, androidx.appcompat.view.menu.g gVar) {
        return gVar.l();
    }
}
