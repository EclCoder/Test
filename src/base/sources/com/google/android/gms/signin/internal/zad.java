package com.google.android.gms.signin.internal;

import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zad extends com.google.android.gms.internal.base.zab implements zae {
    public zad() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    @Override // com.google.android.gms.internal.base.zab
    protected final boolean zaa(int i10, Parcel parcel, Parcel parcel2, int i11) {
        switch (i10) {
            case 3:
                com.google.android.gms.internal.base.zac.zab(parcel);
                break;
            case 4:
                com.google.android.gms.internal.base.zac.zab(parcel);
                break;
            case 5:
            default:
                return false;
            case 6:
                com.google.android.gms.internal.base.zac.zab(parcel);
                break;
            case 7:
                com.google.android.gms.internal.base.zac.zab(parcel);
                break;
            case 8:
                zak zakVar = (zak) com.google.android.gms.internal.base.zac.zaa(parcel, zak.CREATOR);
                com.google.android.gms.internal.base.zac.zab(parcel);
                zab(zakVar);
                break;
            case 9:
                com.google.android.gms.internal.base.zac.zab(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
