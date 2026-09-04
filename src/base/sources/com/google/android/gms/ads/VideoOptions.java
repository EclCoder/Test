package com.google.android.gms.ads;

import com.google.android.gms.ads.internal.client.zzfw;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class VideoOptions {
    private final boolean zza;
    private final boolean zzb;
    private final boolean zzc;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class Builder {
        private boolean zza = true;
        private boolean zzb = false;
        private boolean zzc = false;

        public VideoOptions build() {
            return new VideoOptions(this, null);
        }

        public Builder setClickToExpandRequested(boolean z10) {
            this.zzc = z10;
            return this;
        }

        public Builder setCustomControlsRequested(boolean z10) {
            this.zzb = z10;
            return this;
        }

        public Builder setStartMuted(boolean z10) {
            this.zza = z10;
            return this;
        }

        final /* synthetic */ boolean zza() {
            return this.zza;
        }

        final /* synthetic */ boolean zzb() {
            return this.zzb;
        }

        final /* synthetic */ boolean zzc() {
            return this.zzc;
        }
    }

    /* synthetic */ VideoOptions(Builder builder, byte[] bArr) {
        this.zza = builder.zza();
        this.zzb = builder.zzb();
        this.zzc = builder.zzc();
    }

    public boolean getClickToExpandRequested() {
        return this.zzc;
    }

    public boolean getCustomControlsRequested() {
        return this.zzb;
    }

    public boolean getStartMuted() {
        return this.zza;
    }

    public VideoOptions(zzfw zzfwVar) {
        this.zza = zzfwVar.zza;
        this.zzb = zzfwVar.zzb;
        this.zzc = zzfwVar.zzc;
    }
}
