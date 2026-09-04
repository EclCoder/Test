package com.google.android.gms.ads.rewarded;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class ServerSideVerificationOptions {
    private final String zza;
    private final String zzb;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class Builder {
        private String zza = "";
        private String zzb = "";

        public ServerSideVerificationOptions build() {
            return new ServerSideVerificationOptions(this, null);
        }

        public Builder setCustomData(String str) {
            this.zzb = str;
            return this;
        }

        public Builder setUserId(String str) {
            this.zza = str;
            return this;
        }

        final /* synthetic */ String zza() {
            return this.zza;
        }

        final /* synthetic */ String zzb() {
            return this.zzb;
        }
    }

    /* synthetic */ ServerSideVerificationOptions(Builder builder, byte[] bArr) {
        this.zza = builder.zza();
        this.zzb = builder.zzb();
    }

    public String getCustomData() {
        return this.zzb;
    }

    public String getUserId() {
        return this.zza;
    }
}
