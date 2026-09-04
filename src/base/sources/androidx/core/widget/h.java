package androidx.core.widget;

import android.view.View;
import android.widget.PopupWindow;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {
    public static void a(PopupWindow popupWindow, boolean z10) {
        popupWindow.setOverlapAnchor(z10);
    }

    public static void b(PopupWindow popupWindow, int i10) {
        popupWindow.setWindowLayoutType(i10);
    }

    public static void c(PopupWindow popupWindow, View view, int i10, int i11, int i12) {
        popupWindow.showAsDropDown(view, i10, i11, i12);
    }
}
