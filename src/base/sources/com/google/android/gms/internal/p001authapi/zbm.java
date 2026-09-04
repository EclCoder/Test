package com.google.android.gms.internal.p001authapi;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.ads.mediation.admob.Mvp.IAoPeRfJn;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import com.google.android.gms.auth.api.identity.SavePasswordRequest;
import com.google.android.gms.common.api.ApiMetadata;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zbm extends zba implements IInterface {
    public final void zbc(zbs zbsVar, SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest, ApiMetadata apiMetadata) {
        Parcel parcelZba = zba();
        zbc.zbc(parcelZba, zbsVar);
        zbc.zbb(parcelZba, saveAccountLinkingTokenRequest);
        zbc.zbb(parcelZba, apiMetadata);
        zbb(1, parcelZba);
    }

    public final void zbd(zbu zbuVar, SavePasswordRequest savePasswordRequest, ApiMetadata apiMetadata) {
        Parcel parcelZba = zba();
        zbc.zbc(parcelZba, zbuVar);
        zbc.zbb(parcelZba, savePasswordRequest);
        zbc.zbb(parcelZba, apiMetadata);
        zbb(2, parcelZba);
    }

    zbm(IBinder iBinder) {
        super(iBinder, IAoPeRfJn.lGxkLzFAQOqLg);
    }
}
