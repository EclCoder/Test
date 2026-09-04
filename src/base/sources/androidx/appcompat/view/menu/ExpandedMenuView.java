package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.widget.o0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements e.b, k, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f974c = {R.attr.background, R.attr.divider};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private e f975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f976b;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listViewStyle);
    }

    @Override // androidx.appcompat.view.menu.k
    public void a(e eVar) {
        this.f975a = eVar;
    }

    @Override // androidx.appcompat.view.menu.e.b
    public boolean b(g gVar) {
        return this.f975a.O(gVar, 0);
    }

    public int getWindowAnimations() {
        return this.f976b;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
        b((g) getAdapter().getItem(i10));
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        o0 o0VarV = o0.v(context, attributeSet, f974c, i10, 0);
        if (o0VarV.s(0)) {
            setBackgroundDrawable(o0VarV.g(0));
        }
        if (o0VarV.s(1)) {
            setDivider(o0VarV.g(1));
        }
        o0VarV.x();
    }
}
