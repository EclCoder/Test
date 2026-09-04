package com.google.android.gms.common.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.Api;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class TelemetryLoggingOptions implements Api.ApiOptions.Optional {
    public static final TelemetryLoggingOptions zaa = builder().build();
    private final String zab;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class Builder {
        private String zaa;

        private Builder() {
        }

        public TelemetryLoggingOptions build() {
            return new TelemetryLoggingOptions(this.zaa, null);
        }

        public Builder setApi(String str) {
            this.zaa = str;
            return this;
        }

        /* synthetic */ Builder(zaac zaacVar) {
        }
    }

    /* synthetic */ TelemetryLoggingOptions(String str, zaad zaadVar) {
        this.zab = str;
    }

    public static Builder builder() {
        return new Builder(null);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof TelemetryLoggingOptions) {
            return Objects.equal(this.zab, ((TelemetryLoggingOptions) obj).zab);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zab);
    }

    public final Bundle zaa() {
        Bundle bundle = new Bundle();
        String str = this.zab;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }
}
