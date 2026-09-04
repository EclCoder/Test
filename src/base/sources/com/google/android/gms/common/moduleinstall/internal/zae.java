package com.google.android.gms.common.moduleinstall.internal;

import android.os.IInterface;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallIntentResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public interface zae extends IInterface {
    void zab(Status status);

    void zac(Status status, ModuleInstallIntentResponse moduleInstallIntentResponse);

    void zad(Status status, ModuleInstallResponse moduleInstallResponse);

    void zae(Status status, ModuleAvailabilityResponse moduleAvailabilityResponse);
}
