package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzaot implements zzanl {
    private final zzet zza = new zzet();

    @Override // com.google.android.gms.internal.ads.zzanl
    public final void zza(byte[] bArr, int i10, int i11, zzank zzankVar, zzdt zzdtVar) {
        zzcx zzcxVarZzr;
        zzet zzetVar = this.zza;
        zzetVar.zzb(bArr, i11 + i10);
        zzetVar.zzh(i10);
        ArrayList arrayList = new ArrayList();
        while (zzetVar.zzd() > 0) {
            zzgtj.zzb(zzetVar.zzd() >= 8, "Incomplete Mp4Webvtt Top Level box header found.");
            int iZzB = zzetVar.zzB() - 8;
            if (zzetVar.zzB() == 1987343459) {
                CharSequence charSequenceZzc = null;
                zzcw zzcwVarZzb = null;
                while (iZzB > 0) {
                    zzgtj.zzb(iZzB >= 8, "Incomplete vtt cue box header found.");
                    int iZzB2 = zzetVar.zzB();
                    int iZzB3 = zzetVar.zzB();
                    int i12 = iZzB - 8;
                    int i13 = iZzB2 - 8;
                    String strZzk = zzfl.zzk(zzetVar.zzi(), zzetVar.zzg(), i13);
                    zzetVar.zzk(i13);
                    if (iZzB3 == 1937011815) {
                        zzcwVarZzb = zzapc.zzb(strZzk);
                    } else if (iZzB3 == 1885436268) {
                        charSequenceZzc = zzapc.zzc(null, strZzk.trim(), Collections.EMPTY_LIST);
                    }
                    iZzB = i12 - i13;
                }
                if (charSequenceZzc == null) {
                    charSequenceZzc = "";
                }
                if (zzcwVarZzb != null) {
                    zzcwVarZzb.zza(charSequenceZzc);
                    zzcxVarZzr = zzcwVarZzb.zzr();
                } else {
                    Pattern pattern = zzapc.zza;
                    zzapb zzapbVar = new zzapb();
                    zzapbVar.zzc = charSequenceZzc;
                    zzcxVarZzr = zzapbVar.zza().zzr();
                }
                arrayList.add(zzcxVarZzr);
            } else {
                zzetVar.zzk(iZzB);
            }
        }
        zzdtVar.zza(new zzand(arrayList, C.TIME_UNSET, C.TIME_UNSET));
    }
}
