package com.google.android.gms.location;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public class SettingsClient extends GoogleApi<Api.ApiOptions.NoOptions> {
    public static final /* synthetic */ int zza = 0;

    public SettingsClient(Activity activity) {
        super(activity, LocationServices.API, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    public Task<LocationSettingsResponse> checkLocationSettings(final LocationSettingsRequest locationSettingsRequest) {
        return doRead(TaskApiCall.builder().run(new RemoteCall(locationSettingsRequest) { // from class: com.google.android.gms.location.zzbs
            private final LocationSettingsRequest zza;

            {
                this.zza = locationSettingsRequest;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                ((com.google.android.gms.internal.location.zzaz) obj).zzL(this.zza, new zzbt((TaskCompletionSource) obj2), null);
            }
        }).setMethodKey(2426).build());
    }

    public SettingsClient(Context context) {
        super(context, LocationServices.API, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
    }
}
