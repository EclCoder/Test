package com.google.android.gms.ads.internal.client;

import android.content.Context;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbuy;
import com.google.android.gms.internal.ads.zzbvc;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class LiteSdkInfo extends zzcu {
    public LiteSdkInfo(Context context) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcv
    public zzbvc getAdapterCreator() {
        return new zzbuy();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcv
    public zzez getLiteSdkVersion() {
        return new zzez(ModuleDescriptor.MODULE_VERSION, ModuleDescriptor.MODULE_VERSION, "25.2.0");
    }
}
