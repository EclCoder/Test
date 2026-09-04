package com.google.android.material.internal;

import android.content.Context;
import android.view.SubMenu;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public class p extends androidx.appcompat.view.menu.e {
    public p(Context context) {
        super(context);
    }

    @Override // androidx.appcompat.view.menu.e, android.view.Menu
    public SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        androidx.appcompat.view.menu.g gVar = (androidx.appcompat.view.menu.g) a(i10, i11, i12, charSequence);
        r rVar = new r(w(), this, gVar);
        gVar.x(rVar);
        return rVar;
    }
}
