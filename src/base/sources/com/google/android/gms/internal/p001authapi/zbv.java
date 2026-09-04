package com.google.android.gms.internal.p001authapi;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.GetPhoneNumberHintIntentRequest;
import com.google.android.gms.auth.api.identity.GetSignInIntentRequest;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.internal.IStatusCallback;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zbv extends zba implements IInterface {
    zbv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.identity.internal.ISignInService");
    }

    public final void zbc(zbl zblVar, BeginSignInRequest beginSignInRequest, ApiMetadata apiMetadata) {
        Parcel parcelZba = zba();
        zbc.zbc(parcelZba, zblVar);
        zbc.zbb(parcelZba, beginSignInRequest);
        zbc.zbb(parcelZba, apiMetadata);
        zbb(1, parcelZba);
    }

    public final void zbd(IStatusCallback iStatusCallback, String str, ApiMetadata apiMetadata) {
        Parcel parcelZba = zba();
        zbc.zbc(parcelZba, iStatusCallback);
        parcelZba.writeString(str);
        zbc.zbb(parcelZba, apiMetadata);
        zbb(2, parcelZba);
    }

    public final void zbe(zbq zbqVar, GetSignInIntentRequest getSignInIntentRequest, ApiMetadata apiMetadata) {
        Parcel parcelZba = zba();
        zbc.zbc(parcelZba, zbqVar);
        zbc.zbb(parcelZba, getSignInIntentRequest);
        zbc.zbb(parcelZba, apiMetadata);
        zbb(3, parcelZba);
    }

    public final void zbf(zbo zboVar, GetPhoneNumberHintIntentRequest getPhoneNumberHintIntentRequest, String str, ApiMetadata apiMetadata) {
        Parcel parcelZba = zba();
        zbc.zbc(parcelZba, zboVar);
        zbc.zbb(parcelZba, getPhoneNumberHintIntentRequest);
        parcelZba.writeString(str);
        zbc.zbb(parcelZba, apiMetadata);
        zbb(4, parcelZba);
    }
}
