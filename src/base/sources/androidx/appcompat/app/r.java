package androidx.appcompat.app;

import android.app.Dialog;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class r extends androidx.fragment.app.m {
    @Override // androidx.fragment.app.m
    public Dialog onCreateDialog(Bundle bundle) {
        return new q(getContext(), getTheme());
    }

    @Override // androidx.fragment.app.m
    public void setupDialog(Dialog dialog, int i10) {
        if (!(dialog instanceof q)) {
            super.setupDialog(dialog, i10);
            return;
        }
        q qVar = (q) dialog;
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                return;
            } else {
                dialog.getWindow().addFlags(24);
            }
        }
        qVar.r(1);
    }
}
