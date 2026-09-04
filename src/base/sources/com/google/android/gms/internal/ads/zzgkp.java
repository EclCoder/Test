package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgkp extends zzfxg {
    private final zzgfh zzb;

    zzgkp(Context context, Executor executor, zzgfh zzgfhVar) {
        super(context, executor, new TaskCompletionSource().getTask(), false);
        this.zzb = zzgfhVar;
    }

    private static Task zzh() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        taskCompletionSource.setResult(Boolean.TRUE);
        return taskCompletionSource.getTask();
    }

    @Override // com.google.android.gms.internal.ads.zzfxg
    public final Task zzb(int i10, long j10) {
        this.zzb.zzb(i10, j10, null, null);
        return zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzfxg
    public final Task zzc(int i10, long j10, Exception exc) {
        this.zzb.zzb(i10, j10, exc, null);
        return zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzfxg
    public final Task zze(int i10, String str) {
        this.zzb.zzb(i10, -1L, null, str);
        return zzh();
    }
}
