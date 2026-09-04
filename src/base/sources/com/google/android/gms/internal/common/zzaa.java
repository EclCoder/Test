package com.google.android.gms.internal.common;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
class zzaa extends zzab {
    Object[] zza = new Object[4];
    int zzb = 0;
    boolean zzc;

    zzaa(int i10) {
    }

    public final zzaa zza(Object obj) {
        int i10;
        obj.getClass();
        int length = this.zza.length;
        int i11 = this.zzb;
        int i12 = i11 + 1;
        if (i12 < 0) {
            throw new IllegalArgumentException("cannot store more than Integer.MAX_VALUE elements");
        }
        if (i12 <= length) {
            i10 = length;
        } else {
            i10 = (length >> 1) + length + 1;
            if (i10 < i12) {
                int iHighestOneBit = Integer.highestOneBit(i11);
                i10 = iHighestOneBit + iHighestOneBit;
            }
            if (i10 < 0) {
                i10 = Integer.MAX_VALUE;
            }
        }
        if (i10 > length || this.zzc) {
            this.zza = Arrays.copyOf(this.zza, i10);
            this.zzc = false;
        }
        Object[] objArr = this.zza;
        int i13 = this.zzb;
        this.zzb = i13 + 1;
        objArr[i13] = obj;
        return this;
    }
}
