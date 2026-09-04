package com.google.android.gms.dynamite;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class zzk implements DynamiteModule.VersionPolicy {
    zzk() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy
    public final DynamiteModule.VersionPolicy.SelectionResult selectModule(Context context, String str, DynamiteModule.VersionPolicy.IVersions iVersions) {
        int iZza;
        DynamiteModule.VersionPolicy.SelectionResult selectionResult = new DynamiteModule.VersionPolicy.SelectionResult();
        int iZzb = iVersions.zzb(context, str);
        selectionResult.localVersion = iZzb;
        int i10 = 1;
        int i11 = 0;
        if (iZzb != 0) {
            iZza = iVersions.zza(context, str, false);
            selectionResult.remoteVersion = iZza;
        } else {
            iZza = iVersions.zza(context, str, true);
            selectionResult.remoteVersion = iZza;
        }
        int i12 = selectionResult.localVersion;
        if (i12 == 0) {
            if (iZza == 0) {
                i10 = 0;
            }
            selectionResult.selection = i10;
            return selectionResult;
        }
        i11 = i12;
        if (i11 >= iZza) {
            i10 = -1;
        }
        selectionResult.selection = i10;
        return selectionResult;
    }
}
