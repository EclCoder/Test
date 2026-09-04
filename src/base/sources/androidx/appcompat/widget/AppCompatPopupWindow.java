package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
class AppCompatPopupWindow extends PopupWindow {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final boolean f1281b = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f1282a;

    public AppCompatPopupWindow(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        a(context, attributeSet, i10, 0);
    }

    private void a(Context context, AttributeSet attributeSet, int i10, int i11) {
        o0 o0VarV = o0.v(context, attributeSet, h.j.f40046i2, i10, i11);
        int i12 = h.j.f40056k2;
        if (o0VarV.s(i12)) {
            b(o0VarV.a(i12, false));
        }
        setBackgroundDrawable(o0VarV.g(h.j.f40051j2));
        o0VarV.x();
    }

    private void b(boolean z10) {
        if (f1281b) {
            this.f1282a = z10;
        } else {
            androidx.core.widget.h.a(this, z10);
        }
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i10, int i11) {
        if (f1281b && this.f1282a) {
            i11 -= view.getHeight();
        }
        super.showAsDropDown(view, i10, i11);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i10, int i11, int i12, int i13) {
        if (f1281b && this.f1282a) {
            i11 -= view.getHeight();
        }
        super.update(view, i10, i11, i12, i13);
    }

    public AppCompatPopupWindow(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        a(context, attributeSet, i10, i11);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i10, int i11, int i12) {
        if (f1281b && this.f1282a) {
            i11 -= view.getHeight();
        }
        super.showAsDropDown(view, i10, i11, i12);
    }
}
