package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class zabo implements Runnable {
    final /* synthetic */ zabp zaa;

    zabo(zabp zabpVar) {
        this.zaa = zabpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zabq zabqVar = this.zaa.zaa;
        zabqVar.zac.disconnect(zabqVar.zac.getClass().getName().concat(" disconnecting because it was signed out."));
    }
}
