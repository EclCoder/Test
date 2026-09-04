package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class d extends BaseAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    e f1051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f1052b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f1053c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f1054d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final LayoutInflater f1055e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f1056f;

    public d(e eVar, LayoutInflater layoutInflater, boolean z10, int i10) {
        this.f1054d = z10;
        this.f1055e = layoutInflater;
        this.f1051a = eVar;
        this.f1056f = i10;
        a();
    }

    void a() {
        g gVarX = this.f1051a.x();
        if (gVarX != null) {
            ArrayList arrayListB = this.f1051a.B();
            int size = arrayListB.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (((g) arrayListB.get(i10)) == gVarX) {
                    this.f1052b = i10;
                    return;
                }
            }
        }
        this.f1052b = -1;
    }

    public e b() {
        return this.f1051a;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public g getItem(int i10) {
        ArrayList arrayListB = this.f1054d ? this.f1051a.B() : this.f1051a.G();
        int i11 = this.f1052b;
        if (i11 >= 0 && i10 >= i11) {
            i10++;
        }
        return (g) arrayListB.get(i10);
    }

    public void d(boolean z10) {
        this.f1053c = z10;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        ArrayList arrayListB = this.f1054d ? this.f1051a.B() : this.f1051a.G();
        return this.f1052b < 0 ? arrayListB.size() : arrayListB.size() - 1;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f1055e.inflate(this.f1056f, viewGroup, false);
        }
        int groupId = getItem(i10).getGroupId();
        int i11 = i10 - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f1051a.I() && groupId != (i11 >= 0 ? getItem(i11).getGroupId() : groupId));
        k.a aVar = (k.a) view;
        if (this.f1053c) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.c(getItem(i10), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
