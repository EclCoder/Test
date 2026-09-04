package com.google.android.material.navigation;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public class d extends FrameLayout implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f20562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    boolean f20563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f20564c;

    d(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(sb.i.f51817p, (ViewGroup) this, true);
        a();
    }

    public void a() {
        setVisibility((!this.f20564c || (!this.f20562a && this.f20563b)) ? 8 : 0);
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void c(androidx.appcompat.view.menu.g gVar, int i10) {
        a();
    }

    @Override // androidx.appcompat.view.menu.k.a
    public boolean d() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public androidx.appcompat.view.menu.g getItemData() {
        return null;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    public void setDividersEnabled(boolean z10) {
        this.f20564c = z10;
        a();
    }

    @Override // com.google.android.material.navigation.i
    public void setExpanded(boolean z10) {
        this.f20562a = z10;
        a();
    }

    @Override // com.google.android.material.navigation.i
    public void setOnlyShowWhenExpanded(boolean z10) {
        this.f20563b = z10;
        a();
    }

    public void setCheckable(boolean z10) {
    }

    public void setChecked(boolean z10) {
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
    }

    public void setIcon(Drawable drawable) {
    }

    public void setTitle(CharSequence charSequence) {
    }
}
