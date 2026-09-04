package com.google.android.material.bottomsheet;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.r;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public class b extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f19563a;

    /* JADX INFO: Access modifiers changed from: private */
    public void u() {
        if (this.f19563a) {
            super.dismissAllowingStateLoss();
        } else {
            super.dismiss();
        }
    }

    private void v(BottomSheetBehavior bottomSheetBehavior, boolean z10) {
        this.f19563a = z10;
        if (bottomSheetBehavior.A0() == 5) {
            u();
            return;
        }
        if (getDialog() instanceof com.google.android.material.bottomsheet.a) {
            ((com.google.android.material.bottomsheet.a) getDialog()).A();
        }
        bottomSheetBehavior.f0(new C0304b());
        bottomSheetBehavior.l1(5);
    }

    private boolean w(boolean z10) {
        Dialog dialog = getDialog();
        if (!(dialog instanceof com.google.android.material.bottomsheet.a)) {
            return false;
        }
        com.google.android.material.bottomsheet.a aVar = (com.google.android.material.bottomsheet.a) dialog;
        BottomSheetBehavior bottomSheetBehaviorX = aVar.x();
        if (!bottomSheetBehaviorX.I0() || !aVar.y()) {
            return false;
        }
        v(bottomSheetBehaviorX, z10);
        return true;
    }

    @Override // androidx.fragment.app.m
    public void dismiss() {
        if (w(false)) {
            return;
        }
        super.dismiss();
    }

    @Override // androidx.fragment.app.m
    public void dismissAllowingStateLoss() {
        if (w(true)) {
            return;
        }
        super.dismissAllowingStateLoss();
    }

    @Override // androidx.appcompat.app.r, androidx.fragment.app.m
    public Dialog onCreateDialog(Bundle bundle) {
        return new com.google.android.material.bottomsheet.a(getContext(), getTheme());
    }

    /* JADX INFO: renamed from: com.google.android.material.bottomsheet.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class C0304b extends BottomSheetBehavior.g {
        private C0304b() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void c(View view, int i10) {
            if (i10 == 5) {
                b.this.u();
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void b(View view, float f10) {
        }
    }
}
