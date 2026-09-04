package com.google.android.gms.dynamite;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class zzl implements DynamiteModule.VersionPolicy {
    zzl() {
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b A[DONT_INVERT, PHI: r4
      0x001b: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:3:0x0014, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x001e  */
    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy
    public final DynamiteModule.VersionPolicy.SelectionResult selectModule(Context context, String str, DynamiteModule.VersionPolicy.IVersions iVersions) {
        DynamiteModule.VersionPolicy.SelectionResult selectionResult = new DynamiteModule.VersionPolicy.SelectionResult();
        selectionResult.localVersion = iVersions.zzb(context, str);
        int i10 = 1;
        int iZza = iVersions.zza(context, str, true);
        selectionResult.remoteVersion = iZza;
        int i11 = selectionResult.localVersion;
        if (i11 == 0) {
            i11 = 0;
            if (iZza == 0) {
                i10 = 0;
            } else if (iZza < i11) {
                i10 = -1;
            }
        } else if (iZza < i11) {
            i10 = -1;
        }
        selectionResult.selection = i10;
        return selectionResult;
    }
}
