package com.google.android.material.navigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public class m extends FrameLayout implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TextView f20646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f20647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f20648c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private androidx.appcompat.view.menu.g f20649d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ColorStateList f20650e;

    m(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(sb.i.f51818q, (ViewGroup) this, true);
        this.f20646a = (TextView) findViewById(sb.g.S);
    }

    private void a() {
        androidx.appcompat.view.menu.g gVar = this.f20649d;
        if (gVar != null) {
            setVisibility((!gVar.isVisible() || (!this.f20647b && this.f20648c)) ? 8 : 0);
        }
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void c(androidx.appcompat.view.menu.g gVar, int i10) {
        this.f20649d = gVar;
        gVar.setCheckable(false);
        this.f20646a.setText(gVar.getTitle());
        a();
    }

    @Override // androidx.appcompat.view.menu.k.a
    public boolean d() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public androidx.appcompat.view.menu.g getItemData() {
        return this.f20649d;
    }

    @Override // com.google.android.material.navigation.i
    public void setExpanded(boolean z10) {
        this.f20647b = z10;
        a();
    }

    @Override // com.google.android.material.navigation.i
    public void setOnlyShowWhenExpanded(boolean z10) {
        this.f20648c = z10;
        a();
    }

    public void setTextAppearance(int i10) {
        androidx.core.widget.i.m(this.f20646a, i10);
        ColorStateList colorStateList = this.f20650e;
        if (colorStateList != null) {
            this.f20646a.setTextColor(colorStateList);
        }
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f20650e = colorStateList;
        if (colorStateList != null) {
            this.f20646a.setTextColor(colorStateList);
        }
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
