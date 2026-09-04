package com.google.android.gms.internal.play_billing;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzab extends zzav implements zzac {
    private static final String DESCRIPTOR = "com.android.vending.billing.IInAppBillingDelegateToBackendCallback";
    static final int TRANSACTION_onDelegateToBackendResponse = 1;

    public zzab() {
        super(DESCRIPTOR);
    }

    public static zzac asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
        return iInterfaceQueryLocalInterface instanceof zzac ? (zzac) iInterfaceQueryLocalInterface : new zzaa(iBinder);
    }

    @Override // com.google.android.gms.internal.play_billing.zzav
    protected boolean dispatchTransaction(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        Bundle bundle = (Bundle) zzaw.zza(parcel, Bundle.CREATOR);
        enforceNoDataAvail(parcel);
        onDelegateToBackendResponse(bundle);
        return true;
    }
}
