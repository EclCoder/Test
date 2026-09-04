package com.google.android.gms.internal.play_billing;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.android.vending.billing.IInAppBillingService;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzaq extends zzav implements zzar {
    public static zzar zzu(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IInAppBillingService.DESCRIPTOR);
        return iInterfaceQueryLocalInterface instanceof zzar ? (zzar) iInterfaceQueryLocalInterface : new zzap(iBinder);
    }

    @Override // com.google.android.gms.internal.play_billing.zzav
    protected final boolean dispatchTransaction(int i10, Parcel parcel, Parcel parcel2, int i11) {
        throw null;
    }
}
