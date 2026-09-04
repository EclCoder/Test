package com.google.android.material.navigation;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class g extends androidx.appcompat.view.menu.e {
    private final Class B;
    private final int C;
    private final boolean D;

    public g(Context context, Class cls, int i10, boolean z10) {
        super(context);
        this.B = cls;
        this.C = i10;
        this.D = z10;
    }

    @Override // androidx.appcompat.view.menu.e
    protected MenuItem a(int i10, int i11, int i12, CharSequence charSequence) {
        if (size() + 1 <= this.C) {
            i0();
            MenuItem menuItemA = super.a(i10, i11, i12, charSequence);
            h0();
            return menuItemA;
        }
        String simpleName = this.B.getSimpleName();
        throw new IllegalArgumentException("Maximum number of items supported by " + simpleName + " is " + this.C + ". Limit can be checked with " + simpleName + "#getMaxItemCount()");
    }

    @Override // androidx.appcompat.view.menu.e, android.view.Menu
    public SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        if (this.D) {
            androidx.appcompat.view.menu.g gVar = (androidx.appcompat.view.menu.g) a(i10, i11, i12, charSequence);
            l lVar = new l(w(), this, gVar);
            gVar.x(lVar);
            return lVar;
        }
        throw new UnsupportedOperationException(this.B.getSimpleName() + " does not support submenus");
    }
}
