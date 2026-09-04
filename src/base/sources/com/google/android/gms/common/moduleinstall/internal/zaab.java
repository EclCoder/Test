package com.google.android.gms.common.moduleinstall.internal;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class zaab extends zag {
    private final ListenerHolder zaa;

    public zaab(ListenerHolder listenerHolder) {
        this.zaa = listenerHolder;
    }

    @Override // com.google.android.gms.common.moduleinstall.internal.zah
    public final void zab(ModuleInstallStatusUpdate moduleInstallStatusUpdate) {
        this.zaa.notifyListener(new zaaa(this, moduleInstallStatusUpdate));
    }
}
