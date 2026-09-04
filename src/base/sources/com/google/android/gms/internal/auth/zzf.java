package com.google.android.gms.internal.auth;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.auth.AccountChangeEventsResponse;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public interface zzf extends IInterface {
    Bundle zzd(String str, Bundle bundle);

    Bundle zze(Account account, String str, Bundle bundle);

    Bundle zzf(Account account);

    Bundle zzg(String str);

    AccountChangeEventsResponse zzh(AccountChangeEventsRequest accountChangeEventsRequest);
}
