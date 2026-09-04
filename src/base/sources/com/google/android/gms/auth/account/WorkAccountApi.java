package com.google.android.gms.auth.account;

import android.accounts.Account;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface WorkAccountApi {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    @Deprecated
    public interface AddAccountResult extends Result {
        Account getAccount();
    }

    @Deprecated
    PendingResult<AddAccountResult> addWorkAccount(GoogleApiClient googleApiClient, String str);

    @Deprecated
    PendingResult<Result> removeWorkAccount(GoogleApiClient googleApiClient, Account account);

    @Deprecated
    void setWorkAuthenticatorEnabled(GoogleApiClient googleApiClient, boolean z10);

    @Deprecated
    PendingResult<Result> setWorkAuthenticatorEnabledWithResult(GoogleApiClient googleApiClient, boolean z10);
}
