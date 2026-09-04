package com.google.android.gms.internal.play_billing;

import android.os.BadParcelableException;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public class zzav extends Binder implements IInterface {
    private static zzax globalInterceptor;

    protected zzav(String str) {
        attachInterface(this, str);
    }

    static synchronized void installTransactionInterceptorPackagePrivate(zzax zzaxVar) {
        try {
            if (zzaxVar == null) {
                throw new IllegalArgumentException("null interceptor");
            }
            if (globalInterceptor != null) {
                throw new IllegalStateException("Duplicate TransactionInterceptor installation.");
            }
            globalInterceptor = zzaxVar;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private boolean routeToSuperOrEnforceInterface(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 > 16777215) {
            return super.onTransact(i10, parcel, parcel2, i11);
        }
        parcel.enforceInterface(getInterfaceDescriptor());
        return false;
    }

    protected boolean dispatchTransaction(int i10, Parcel parcel, Parcel parcel2, int i11) {
        return false;
    }

    protected void enforceNoDataAvail(Parcel parcel) {
        zzax zzaxVar = globalInterceptor;
        if (zzaxVar != null) {
            zzaxVar.zza();
            return;
        }
        int i10 = zzaw.zza;
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail <= 0) {
            return;
        }
        throw new BadParcelableException("Parcel data not fully consumed, unread size: " + iDataAvail);
    }

    @Override // android.os.Binder
    public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (routeToSuperOrEnforceInterface(i10, parcel, parcel2, i11)) {
            return true;
        }
        zzax zzaxVar = globalInterceptor;
        return zzaxVar == null ? dispatchTransaction(i10, parcel, parcel2, i11) : zzaxVar.zzb();
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }
}
