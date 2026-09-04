package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class c implements j, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Context f1039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    LayoutInflater f1040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    e f1041c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    ExpandedMenuView f1042d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f1043e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f1044f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f1045g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private j.a f1046h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    a f1047i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f1048j;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class a extends BaseAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f1049a = -1;

        public a() {
            a();
        }

        void a() {
            g gVarX = c.this.f1041c.x();
            if (gVarX != null) {
                ArrayList arrayListB = c.this.f1041c.B();
                int size = arrayListB.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (((g) arrayListB.get(i10)) == gVarX) {
                        this.f1049a = i10;
                        return;
                    }
                }
            }
            this.f1049a = -1;
        }

        @Override // android.widget.Adapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public g getItem(int i10) {
            ArrayList arrayListB = c.this.f1041c.B();
            int i11 = i10 + c.this.f1043e;
            int i12 = this.f1049a;
            if (i12 >= 0 && i11 >= i12) {
                i11++;
            }
            return (g) arrayListB.get(i11);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int size = c.this.f1041c.B().size() - c.this.f1043e;
            return this.f1049a < 0 ? size : size - 1;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.Adapter
        public View getView(int i10, View view, ViewGroup viewGroup) {
            if (view == null) {
                c cVar = c.this;
                view = cVar.f1040b.inflate(cVar.f1045g, viewGroup, false);
            }
            ((k.a) view).c(getItem(i10), 0);
            return view;
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            a();
            super.notifyDataSetChanged();
        }
    }

    public c(Context context, int i10) {
        this(i10, 0);
        this.f1039a = context;
        this.f1040b = LayoutInflater.from(context);
    }

    public ListAdapter a() {
        if (this.f1047i == null) {
            this.f1047i = new a();
        }
        return this.f1047i;
    }

    @Override // androidx.appcompat.view.menu.j
    public void b(e eVar, boolean z10) {
        j.a aVar = this.f1046h;
        if (aVar != null) {
            aVar.b(eVar, z10);
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean c(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void d(j.a aVar) {
        this.f1046h = aVar;
    }

    @Override // androidx.appcompat.view.menu.j
    public void e(Parcelable parcelable) {
        m((Bundle) parcelable);
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean f(m mVar) {
        if (!mVar.hasVisibleItems()) {
            return false;
        }
        new f(mVar).d(null);
        j.a aVar = this.f1046h;
        if (aVar == null) {
            return true;
        }
        aVar.c(mVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.j
    public Parcelable g() {
        if (this.f1042d == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        n(bundle);
        return bundle;
    }

    @Override // androidx.appcompat.view.menu.j
    public int getId() {
        return this.f1048j;
    }

    @Override // androidx.appcompat.view.menu.j
    public void h(boolean z10) {
        a aVar = this.f1047i;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean i() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean j(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void k(Context context, e eVar) {
        if (this.f1044f != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, this.f1044f);
            this.f1039a = contextThemeWrapper;
            this.f1040b = LayoutInflater.from(contextThemeWrapper);
        } else if (this.f1039a != null) {
            this.f1039a = context;
            if (this.f1040b == null) {
                this.f1040b = LayoutInflater.from(context);
            }
        }
        this.f1041c = eVar;
        a aVar = this.f1047i;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    public k l(ViewGroup viewGroup) {
        if (this.f1042d == null) {
            this.f1042d = (ExpandedMenuView) this.f1040b.inflate(h.g.f39956i, viewGroup, false);
            if (this.f1047i == null) {
                this.f1047i = new a();
            }
            this.f1042d.setAdapter((ListAdapter) this.f1047i);
            this.f1042d.setOnItemClickListener(this);
        }
        return this.f1042d;
    }

    public void m(Bundle bundle) {
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.f1042d.restoreHierarchyState(sparseParcelableArray);
        }
    }

    public void n(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.f1042d;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
        this.f1041c.P(this.f1047i.getItem(i10), this, 0);
    }

    public c(int i10, int i11) {
        this.f1045g = i10;
        this.f1044f = i11;
    }
}
