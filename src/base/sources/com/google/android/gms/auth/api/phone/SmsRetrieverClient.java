package com.google.android.gms.auth.api.phone;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.tasks.Task;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class SmsRetrieverClient extends GoogleApi<Api.ApiOptions.NoOptions> implements SmsRetrieverApi {
    private static final Api.ClientKey zza;
    private static final Api.AbstractClientBuilder zzb;
    private static final Api zzc;

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        zza = clientKey;
        zza zzaVar = new zza();
        zzb = zzaVar;
        zzc = new Api("SmsRetriever.API", zzaVar, clientKey);
    }

    public SmsRetrieverClient(Activity activity) {
        super(activity, (Api<Api.ApiOptions.NoOptions>) zzc, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    @Override // com.google.android.gms.auth.api.phone.SmsRetrieverApi
    public abstract Task<Void> startSmsRetriever();

    @Override // com.google.android.gms.auth.api.phone.SmsRetrieverApi
    public abstract Task<Void> startSmsUserConsent(String str);

    public SmsRetrieverClient(Context context) {
        super(context, (Api<Api.ApiOptions.NoOptions>) zzc, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
    }
}
