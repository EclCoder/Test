package com.google.android.gms.ads.admanager;

import android.os.Bundle;
import com.google.android.gms.ads.AbstractAdRequestBuilder;
import com.google.android.gms.ads.AdRequest;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class AdManagerAdRequest extends AdRequest {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class Builder extends AbstractAdRequestBuilder<Builder> {
        public Builder addCategoryExclusion(String str) {
            this.zza.zzm(str);
            return this;
        }

        public AdManagerAdRequest build() {
            return new AdManagerAdRequest(this, null);
        }

        @Override // com.google.android.gms.ads.AbstractAdRequestBuilder
        public final /* bridge */ /* synthetic */ AbstractAdRequestBuilder self() {
            return this;
        }

        public Builder setPublisherProvidedId(String str) {
            this.zza.zzi(str);
            return this;
        }

        @Override // com.google.android.gms.ads.AbstractAdRequestBuilder
        public Builder self() {
            return this;
        }
    }

    /* synthetic */ AdManagerAdRequest(Builder builder, byte[] bArr) {
        super(builder);
    }

    @Override // com.google.android.gms.ads.AdRequest
    public Bundle getCustomTargeting() {
        return this.zza.zzk();
    }

    public String getPublisherProvidedId() {
        return this.zza.zzf();
    }
}
