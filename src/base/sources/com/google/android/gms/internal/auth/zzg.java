package com.google.android.gms.internal.auth;

import android.accounts.Account;
import android.os.Bundle;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.tasks.Task;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public interface zzg extends HasApiKey {
    Task zza(zzbw zzbwVar);

    Task zzb(AccountChangeEventsRequest accountChangeEventsRequest);

    Task zzc(Account account, String str, Bundle bundle);

    Task zzd(Account account);

    Task zze(String str);
}
