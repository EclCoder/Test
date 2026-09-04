package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import n0.k1;
import n0.q0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public class q implements androidx.appcompat.view.menu.j {
    private int A;
    int B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private NavigationMenuView f20382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    LinearLayout f20383b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private androidx.appcompat.view.menu.j.a f20384c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    androidx.appcompat.view.menu.e f20385d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f20386e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    c f20387f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    LayoutInflater f20388g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    ColorStateList f20390i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    ColorStateList f20393l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    ColorStateList f20394m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Drawable f20395n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    RippleDrawable f20396o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    int f20397p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    int f20398q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    int f20399r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    int f20400s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    int f20401t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    int f20402u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    int f20403v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    int f20404w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    boolean f20405x;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f20407z;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f20389h = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    int f20391j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    boolean f20392k = true;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    boolean f20406y = true;
    private int C = -1;
    final View.OnClickListener D = new a();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            boolean z10 = true;
            q.this.Y(true);
            androidx.appcompat.view.menu.g itemData = ((NavigationMenuItemView) view).getItemData();
            q qVar = q.this;
            boolean zP = qVar.f20385d.P(itemData, qVar, 0);
            if (itemData != null && itemData.isCheckable() && zP) {
                q.this.f20387f.v(itemData);
            } else {
                z10 = false;
            }
            q.this.Y(false);
            if (z10) {
                q.this.h(false);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class b extends l {
        public b(View view) {
            super(view);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class c extends RecyclerView.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ArrayList f20409a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private androidx.appcompat.view.menu.g f20410b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f20411c;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class a extends n0.a {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ int f20413d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ boolean f20414e;

            a(int i10, boolean z10) {
                this.f20413d = i10;
                this.f20414e = z10;
            }

            @Override // n0.a
            public void g(View view, o0.p pVar) {
                super.g(view, pVar);
                pVar.x0(o0.p.h.a(c.this.j(this.f20413d), 1, 1, 1, this.f20414e, view.isSelected()));
            }
        }

        c() {
            r();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void A() {
            for (int i10 = 0; i10 < this.f20409a.size(); i10++) {
                if ((this.f20409a.get(i10) instanceof g) && getItemViewType(i10) == 0) {
                    notifyItemChanged(i10);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int j(int i10) {
            int i11 = i10;
            for (int i12 = 0; i12 < i10; i12++) {
                if (q.this.f20387f.getItemViewType(i12) == 2 || q.this.f20387f.getItemViewType(i12) == 3) {
                    i11--;
                }
            }
            return i11;
        }

        private void k(int i10, int i11) {
            while (i10 < i11) {
                ((g) this.f20409a.get(i10)).f20419b = true;
                i10++;
            }
        }

        private void r() {
            if (this.f20411c) {
                return;
            }
            this.f20411c = true;
            this.f20409a.clear();
            this.f20409a.add(new d());
            int size = q.this.f20385d.G().size();
            int i10 = -1;
            boolean z10 = false;
            int size2 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                androidx.appcompat.view.menu.g gVar = (androidx.appcompat.view.menu.g) q.this.f20385d.G().get(i11);
                if (gVar.isChecked()) {
                    v(gVar);
                }
                if (gVar.isCheckable()) {
                    gVar.t(false);
                }
                if (gVar.hasSubMenu()) {
                    SubMenu subMenu = gVar.getSubMenu();
                    if (subMenu.hasVisibleItems()) {
                        if (i11 != 0) {
                            this.f20409a.add(new f(q.this.B, 0));
                        }
                        this.f20409a.add(new g(gVar));
                        int size3 = this.f20409a.size();
                        int size4 = subMenu.size();
                        boolean z11 = false;
                        for (int i12 = 0; i12 < size4; i12++) {
                            androidx.appcompat.view.menu.g gVar2 = (androidx.appcompat.view.menu.g) subMenu.getItem(i12);
                            if (gVar2.isVisible()) {
                                if (!z11 && gVar2.getIcon() != null) {
                                    z11 = true;
                                }
                                if (gVar2.isCheckable()) {
                                    gVar2.t(false);
                                }
                                if (gVar2.isChecked()) {
                                    v(gVar2);
                                }
                                this.f20409a.add(new g(gVar2));
                            }
                        }
                        if (z11) {
                            k(size3, this.f20409a.size());
                        }
                    }
                } else {
                    int groupId = gVar.getGroupId();
                    if (groupId != i10) {
                        size2 = this.f20409a.size();
                        z10 = gVar.getIcon() != null;
                        if (i11 != 0) {
                            size2++;
                            ArrayList arrayList = this.f20409a;
                            int i13 = q.this.B;
                            arrayList.add(new f(i13, i13));
                        }
                    } else if (!z10 && gVar.getIcon() != null) {
                        k(size2, this.f20409a.size());
                        z10 = true;
                    }
                    g gVar3 = new g(gVar);
                    gVar3.f20419b = z10;
                    this.f20409a.add(gVar3);
                    i10 = groupId;
                }
            }
            this.f20411c = false;
        }

        private void u(View view, int i10, boolean z10) {
            q0.m0(view, new a(i10, z10));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void y() {
            for (int i10 = 0; i10 < this.f20409a.size(); i10++) {
                if (this.f20409a.get(i10) instanceof f) {
                    notifyItemChanged(i10);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void z() {
            for (int i10 = 0; i10 < this.f20409a.size(); i10++) {
                if ((this.f20409a.get(i10) instanceof g) && getItemViewType(i10) == 1) {
                    notifyItemChanged(i10);
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int getItemCount() {
            return this.f20409a.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public long getItemId(int i10) {
            return i10;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int getItemViewType(int i10) {
            e eVar = (e) this.f20409a.get(i10);
            if (eVar instanceof f) {
                return 2;
            }
            if (eVar instanceof d) {
                return 3;
            }
            if (eVar instanceof g) {
                return ((g) eVar).a().hasSubMenu() ? 1 : 0;
            }
            throw new RuntimeException("Unknown item type.");
        }

        public Bundle l() {
            Bundle bundle = new Bundle();
            androidx.appcompat.view.menu.g gVar = this.f20410b;
            if (gVar != null) {
                bundle.putInt("android:menu:checked", gVar.getItemId());
            }
            SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
            int size = this.f20409a.size();
            for (int i10 = 0; i10 < size; i10++) {
                e eVar = (e) this.f20409a.get(i10);
                if (eVar instanceof g) {
                    androidx.appcompat.view.menu.g gVarA = ((g) eVar).a();
                    View actionView = gVarA != null ? gVarA.getActionView() : null;
                    if (actionView != null) {
                        s sVar = new s();
                        actionView.saveHierarchyState(sVar);
                        sparseArray.put(gVarA.getItemId(), sVar);
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:action_views", sparseArray);
            return bundle;
        }

        public androidx.appcompat.view.menu.g m() {
            return this.f20410b;
        }

        int n() {
            int i10 = 0;
            for (int i11 = 0; i11 < q.this.f20387f.getItemCount(); i11++) {
                int itemViewType = q.this.f20387f.getItemViewType(i11);
                if (itemViewType == 0 || itemViewType == 1) {
                    i10++;
                }
            }
            return i10;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(l lVar, int i10) {
            int itemViewType = getItemViewType(i10);
            if (itemViewType != 0) {
                if (itemViewType != 1) {
                    if (itemViewType != 2) {
                        return;
                    }
                    f fVar = (f) this.f20409a.get(i10);
                    lVar.itemView.setPaddingRelative(q.this.f20401t, fVar.b(), q.this.f20402u, fVar.a());
                    return;
                }
                TextView textView = (TextView) lVar.itemView;
                textView.setText(((g) this.f20409a.get(i10)).a().getTitle());
                androidx.core.widget.i.m(textView, q.this.f20389h);
                textView.setPaddingRelative(q.this.f20403v, textView.getPaddingTop(), q.this.f20404w, textView.getPaddingBottom());
                ColorStateList colorStateList = q.this.f20390i;
                if (colorStateList != null) {
                    textView.setTextColor(colorStateList);
                }
                u(textView, i10, true);
                return;
            }
            NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) lVar.itemView;
            navigationMenuItemView.setIconTintList(q.this.f20394m);
            navigationMenuItemView.setTextAppearance(q.this.f20391j);
            ColorStateList colorStateList2 = q.this.f20393l;
            if (colorStateList2 != null) {
                navigationMenuItemView.setTextColor(colorStateList2);
            }
            Drawable drawable = q.this.f20395n;
            navigationMenuItemView.setBackground(drawable != null ? drawable.getConstantState().newDrawable() : null);
            RippleDrawable rippleDrawable = q.this.f20396o;
            if (rippleDrawable != null) {
                navigationMenuItemView.setForeground(rippleDrawable.getConstantState().newDrawable());
            }
            g gVar = (g) this.f20409a.get(i10);
            navigationMenuItemView.setNeedsEmptyIcon(gVar.f20419b);
            q qVar = q.this;
            int i11 = qVar.f20397p;
            int i12 = qVar.f20398q;
            navigationMenuItemView.setPadding(i11, i12, i11, i12);
            navigationMenuItemView.setIconPadding(q.this.f20399r);
            q qVar2 = q.this;
            if (qVar2.f20405x) {
                navigationMenuItemView.setIconSize(qVar2.f20400s);
            }
            navigationMenuItemView.setMaxLines(q.this.f20407z);
            navigationMenuItemView.B(gVar.a(), q.this.f20392k);
            u(navigationMenuItemView, i10, false);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public l onCreateViewHolder(ViewGroup viewGroup, int i10) {
            if (i10 == 0) {
                q qVar = q.this;
                return new i(qVar.f20388g, viewGroup, qVar.D);
            }
            if (i10 == 1) {
                return new k(q.this.f20388g, viewGroup);
            }
            if (i10 == 2) {
                return new j(q.this.f20388g, viewGroup);
            }
            if (i10 != 3) {
                return null;
            }
            return new b(q.this.f20383b);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void onViewRecycled(l lVar) {
            if (lVar instanceof i) {
                ((NavigationMenuItemView) lVar.itemView).C();
            }
        }

        public void s(Bundle bundle) {
            androidx.appcompat.view.menu.g gVarA;
            View actionView;
            s sVar;
            androidx.appcompat.view.menu.g gVarA2;
            int i10 = bundle.getInt("android:menu:checked", 0);
            if (i10 != 0) {
                this.f20411c = true;
                int size = this.f20409a.size();
                for (int i11 = 0; i11 < size; i11++) {
                    e eVar = (e) this.f20409a.get(i11);
                    if ((eVar instanceof g) && (gVarA2 = ((g) eVar).a()) != null && gVarA2.getItemId() == i10) {
                        v(gVarA2);
                        break;
                    }
                }
                this.f20411c = false;
                r();
            }
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:action_views");
            if (sparseParcelableArray != null) {
                int size2 = this.f20409a.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    e eVar2 = (e) this.f20409a.get(i12);
                    if ((eVar2 instanceof g) && (gVarA = ((g) eVar2).a()) != null && (actionView = gVarA.getActionView()) != null && (sVar = (s) sparseParcelableArray.get(gVarA.getItemId())) != null) {
                        actionView.restoreHierarchyState(sVar);
                    }
                }
            }
        }

        public void v(androidx.appcompat.view.menu.g gVar) {
            if (this.f20410b == gVar || !gVar.isCheckable()) {
                return;
            }
            androidx.appcompat.view.menu.g gVar2 = this.f20410b;
            if (gVar2 != null) {
                gVar2.setChecked(false);
            }
            this.f20410b = gVar;
            gVar.setChecked(true);
        }

        public void w(boolean z10) {
            this.f20411c = z10;
        }

        public void x() {
            int size = this.f20409a.size();
            r();
            notifyDataSetChanged();
            if (size == this.f20409a.size()) {
                notifyItemRangeChanged(0, this.f20409a.size());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class d implements e {
        d() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private interface e {
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class f implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f20416a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f20417b;

        public f(int i10, int i11) {
            this.f20416a = i10;
            this.f20417b = i11;
        }

        public int a() {
            return this.f20417b;
        }

        public int b() {
            return this.f20416a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class g implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final androidx.appcompat.view.menu.g f20418a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f20419b;

        g(androidx.appcompat.view.menu.g gVar) {
            this.f20418a = gVar;
        }

        public androidx.appcompat.view.menu.g a() {
            return this.f20418a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class h extends androidx.recyclerview.widget.u {
        h(RecyclerView recyclerView) {
            super(recyclerView);
        }

        @Override // androidx.recyclerview.widget.u, n0.a
        public void g(View view, o0.p pVar) {
            super.g(view, pVar);
            pVar.w0(o0.p.g.a(q.this.f20387f.n(), 1, false));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class i extends l {
        public i(LayoutInflater layoutInflater, ViewGroup viewGroup, View.OnClickListener onClickListener) {
            super(layoutInflater.inflate(sb.i.f51808g, viewGroup, false));
            this.itemView.setOnClickListener(onClickListener);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class j extends l {
        public j(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(sb.i.f51810i, viewGroup, false));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class k extends l {
        public k(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(sb.i.f51811j, viewGroup, false));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static abstract class l extends RecyclerView.g0 {
        public l(View view) {
            super(view);
        }
    }

    private boolean B() {
        return q() > 0;
    }

    private void Z() {
        c cVar = this.f20387f;
        if (cVar != null) {
            cVar.y();
        }
    }

    private void a0() {
        c cVar = this.f20387f;
        if (cVar != null) {
            cVar.z();
        }
    }

    private void b0() {
        c cVar = this.f20387f;
        if (cVar != null) {
            cVar.A();
        }
    }

    private void c0() {
        int i10 = (B() || !this.f20406y) ? 0 : this.A;
        NavigationMenuView navigationMenuView = this.f20382a;
        navigationMenuView.setPadding(0, i10, 0, navigationMenuView.getPaddingBottom());
    }

    public int A() {
        return this.f20403v;
    }

    public View C(int i10) {
        View viewInflate = this.f20388g.inflate(i10, (ViewGroup) this.f20383b, false);
        l(viewInflate);
        return viewInflate;
    }

    public void D(boolean z10) {
        if (this.f20406y != z10) {
            this.f20406y = z10;
            c0();
        }
    }

    public void E(androidx.appcompat.view.menu.g gVar) {
        this.f20387f.v(gVar);
    }

    public void F(int i10) {
        this.f20402u = i10;
        Z();
    }

    public void G(int i10) {
        this.f20401t = i10;
        Z();
    }

    public void H(int i10) {
        this.f20386e = i10;
    }

    public void I(Drawable drawable) {
        this.f20395n = drawable;
        b0();
    }

    public void J(RippleDrawable rippleDrawable) {
        this.f20396o = rippleDrawable;
        b0();
    }

    public void K(int i10) {
        this.f20397p = i10;
        b0();
    }

    public void L(int i10) {
        this.f20399r = i10;
        b0();
    }

    public void M(int i10) {
        if (this.f20400s != i10) {
            this.f20400s = i10;
            this.f20405x = true;
            b0();
        }
    }

    public void N(ColorStateList colorStateList) {
        this.f20394m = colorStateList;
        b0();
    }

    public void O(int i10) {
        this.f20407z = i10;
        b0();
    }

    public void P(int i10) {
        this.f20391j = i10;
        b0();
    }

    public void Q(boolean z10) {
        this.f20392k = z10;
        b0();
    }

    public void R(ColorStateList colorStateList) {
        this.f20393l = colorStateList;
        b0();
    }

    public void S(int i10) {
        this.f20398q = i10;
        b0();
    }

    public void T(int i10) {
        this.C = i10;
        NavigationMenuView navigationMenuView = this.f20382a;
        if (navigationMenuView != null) {
            navigationMenuView.setOverScrollMode(i10);
        }
    }

    public void U(ColorStateList colorStateList) {
        this.f20390i = colorStateList;
        a0();
    }

    public void V(int i10) {
        this.f20404w = i10;
        a0();
    }

    public void W(int i10) {
        this.f20403v = i10;
        a0();
    }

    public void X(int i10) {
        this.f20389h = i10;
        a0();
    }

    public void Y(boolean z10) {
        c cVar = this.f20387f;
        if (cVar != null) {
            cVar.w(z10);
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public void b(androidx.appcompat.view.menu.e eVar, boolean z10) {
        androidx.appcompat.view.menu.j.a aVar = this.f20384c;
        if (aVar != null) {
            aVar.b(eVar, z10);
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean c(androidx.appcompat.view.menu.e eVar, androidx.appcompat.view.menu.g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void e(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
            if (sparseParcelableArray != null) {
                this.f20382a.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle("android:menu:adapter");
            if (bundle2 != null) {
                this.f20387f.s(bundle2);
            }
            SparseArray<Parcelable> sparseParcelableArray2 = bundle.getSparseParcelableArray("android:menu:header");
            if (sparseParcelableArray2 != null) {
                this.f20383b.restoreHierarchyState(sparseParcelableArray2);
            }
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean f(androidx.appcompat.view.menu.m mVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public Parcelable g() {
        Bundle bundle = new Bundle();
        if (this.f20382a != null) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.f20382a.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        }
        c cVar = this.f20387f;
        if (cVar != null) {
            bundle.putBundle("android:menu:adapter", cVar.l());
        }
        if (this.f20383b != null) {
            SparseArray<Parcelable> sparseArray2 = new SparseArray<>();
            this.f20383b.saveHierarchyState(sparseArray2);
            bundle.putSparseParcelableArray("android:menu:header", sparseArray2);
        }
        return bundle;
    }

    @Override // androidx.appcompat.view.menu.j
    public int getId() {
        return this.f20386e;
    }

    @Override // androidx.appcompat.view.menu.j
    public void h(boolean z10) {
        c cVar = this.f20387f;
        if (cVar != null) {
            cVar.x();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean i() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean j(androidx.appcompat.view.menu.e eVar, androidx.appcompat.view.menu.g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void k(Context context, androidx.appcompat.view.menu.e eVar) {
        this.f20388g = LayoutInflater.from(context);
        this.f20385d = eVar;
        this.B = context.getResources().getDimensionPixelOffset(sb.e.f51700m);
    }

    public void l(View view) {
        this.f20383b.addView(view);
        NavigationMenuView navigationMenuView = this.f20382a;
        navigationMenuView.setPadding(0, 0, 0, navigationMenuView.getPaddingBottom());
    }

    public void m(k1 k1Var) {
        int iN = k1Var.n();
        if (this.A != iN) {
            this.A = iN;
            c0();
        }
        NavigationMenuView navigationMenuView = this.f20382a;
        navigationMenuView.setPadding(0, navigationMenuView.getPaddingTop(), 0, k1Var.k());
        q0.i(this.f20383b, k1Var);
    }

    public androidx.appcompat.view.menu.g n() {
        return this.f20387f.m();
    }

    public int o() {
        return this.f20402u;
    }

    public int p() {
        return this.f20401t;
    }

    public int q() {
        return this.f20383b.getChildCount();
    }

    public Drawable r() {
        return this.f20395n;
    }

    public int s() {
        return this.f20397p;
    }

    public int t() {
        return this.f20399r;
    }

    public int u() {
        return this.f20407z;
    }

    public ColorStateList v() {
        return this.f20393l;
    }

    public ColorStateList w() {
        return this.f20394m;
    }

    public int x() {
        return this.f20398q;
    }

    public androidx.appcompat.view.menu.k y(ViewGroup viewGroup) {
        if (this.f20382a == null) {
            NavigationMenuView navigationMenuView = (NavigationMenuView) this.f20388g.inflate(sb.i.f51812k, viewGroup, false);
            this.f20382a = navigationMenuView;
            navigationMenuView.setAccessibilityDelegateCompat(new h(this.f20382a));
            if (this.f20387f == null) {
                c cVar = new c();
                this.f20387f = cVar;
                cVar.setHasStableIds(true);
            }
            int i10 = this.C;
            if (i10 != -1) {
                this.f20382a.setOverScrollMode(i10);
            }
            LinearLayout linearLayout = (LinearLayout) this.f20388g.inflate(sb.i.f51809h, (ViewGroup) this.f20382a, false);
            this.f20383b = linearLayout;
            linearLayout.setImportantForAccessibility(2);
            this.f20382a.setAdapter(this.f20387f);
        }
        return this.f20382a;
    }

    public int z() {
        return this.f20404w;
    }
}
