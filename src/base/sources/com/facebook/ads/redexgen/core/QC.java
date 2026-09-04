package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class QC extends AccessibilityNodeProvider {
    public final /* synthetic */ QD A00;

    public QC(QD qd2) {
        this.A00 = qd2;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i10) {
        return (AccessibilityNodeInfo) this.A00.A5G(i10);
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i10) {
        return this.A00.A6Y(str, i10);
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i10) {
        return (AccessibilityNodeInfo) this.A00.A6Z(i10);
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i10, int i11, Bundle bundle) {
        return this.A00.AGv(i10, i11, bundle);
    }
}
