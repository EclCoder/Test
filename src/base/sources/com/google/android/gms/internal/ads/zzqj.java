package com.google.android.gms.internal.ads;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzqj extends AudioDeviceCallback {
    final /* synthetic */ zzqn zza;

    /* synthetic */ zzqj(zzqn zzqnVar, byte[] bArr) {
        Objects.requireNonNull(zzqnVar);
        this.zza = zzqnVar;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        this.zza.zzi();
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        String str = zzfl.zza;
        for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
            zzqn zzqnVar = this.zza;
            if (Objects.equals(audioDeviceInfo, zzqnVar.zzj())) {
                zzqnVar.zzk(null);
                break;
            }
        }
        this.zza.zzi();
    }
}
