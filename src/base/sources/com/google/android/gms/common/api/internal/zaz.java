package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class zaz implements zabz {
    final /* synthetic */ zaaa zaa;

    /* synthetic */ zaz(zaaa zaaaVar, zay zayVar) {
        this.zaa = zaaaVar;
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    public final void zaa(ConnectionResult connectionResult) {
        this.zaa.zam.lock();
        try {
            this.zaa.zak = connectionResult;
            zaaa.zap(this.zaa);
        } finally {
            this.zaa.zam.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    public final void zab(Bundle bundle) {
        this.zaa.zam.lock();
        try {
            this.zaa.zak = ConnectionResult.RESULT_SUCCESS;
            zaaa.zap(this.zaa);
        } finally {
            this.zaa.zam.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    public final void zac(int i10, boolean z10) {
        this.zaa.zam.lock();
        try {
            zaaa zaaaVar = this.zaa;
            if (zaaaVar.zal) {
                zaaaVar.zal = false;
                zaaa.zan(this.zaa, i10, z10);
            } else {
                zaaaVar.zal = true;
                this.zaa.zad.onConnectionSuspended(i10);
            }
        } finally {
            this.zaa.zam.unlock();
        }
    }
}
